name := "FoBo"

organization := "net.liftmodules"

liftVersion <<= liftVersion ?? "2.4"

version <<= liftVersion apply { _ + "-0.5" }

crossScalaVersions := Seq("2.8.1", "2.9.0-1", "2.9.1")

scalaVersion  := "2.9.1"

logLevel := Level.Info  //Level.Info.Debug

scalacOptions ++= Seq("-deprecation")

EclipseKeys.withSource := true

resolvers ++= Seq(
  "Scala Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Scala" at "https://oss.sonatype.org/content/groups/scala-tools/"
)

libraryDependencies <++= liftVersion { v =>
    "net.liftweb" %% "lift-webkit" % v % "compile->default" ::
    "net.liftweb" %% "lift-testkit" % v % "compile->default" ::
    "net.liftmodules" %% "lift-jquery-module" % (v+"-1.0") % "compile->default" ::
    Nil
}

//############################################################
//#### THE BUILDINFO BUILD
//## https://github.com/sbt/sbt-buildinfo
//## 
//##
//#############################################################
seq(buildInfoSettings: _*)

sourceGenerators in Compile <+= buildInfo

buildInfoKeys := Seq[Scoped](name, version, scalaVersion, sbtVersion)

buildInfoPackage := "net.liftmodules.FoBo.lib"

//#########################################################################
//#### THE LESS BUILD
//## The fobo build currently only support less build of one bootstrap  
//## version at a time.
//## To change the less path and target of the less build edit the 
//## tbVerPath val in project/FoBoLessBuild.scala 
//## Also if you change the path make sure to rename the corresponding 
//## files in resources/toserve/... for example move bootstrap.css to 
//## bootstrap-no-less.css this will prevent the built less file from 
//## being overrided by the original file.
//#########################################################################
seq(lessSettings:_*)

(sourceDirectories in (Compile, LessKeys.less)) <<= (sourceDirectory in Compile) { 
  srcDir =>
    Seq(
      srcDir / "less" / "bootstrap" / tbVerPath  / "overrides",
      srcDir / "less" / "bootstrap" / tbVerPath  / "origin"
    )
}

(LessKeys.prettyPrint in (Compile, LessKeys.less)) := true

(includeFilter in (Compile, LessKeys.less)) := ("bootstrap.less" | "responsive.less": FileFilter)

(resourceManaged in (Compile, LessKeys.less)) <<= (crossTarget in Compile)(_ / "classes" / "toserve" / "fobo" / "bootstrap" / tbVerPath / "css" )

//################################################################
//#### THE YUI COMPRESSION BUILD
//## The yui js compression stuff dose currently not work so 
//## for now the last filter string in exludeFilter for js 
//## will exclude every .js file
//################################################################
seq(yuiSettings: _*)

excludeFilter in (Compile, YuiCompressorKeys.jsResources) := "*-debug.js" | "*-min.js" | "*.js"

excludeFilter in (Compile, YuiCompressorKeys.cssResources) := "*-debug.css" | "*-min.css"

YuiCompressorKeys.minSuffix := "-min"

//################################################################
//#### Publish to Media4u101
//## 
//##  
//## 
//################################################################
credentials += Credentials(Path.userHome / ".sbt" / ".credentials" )

publishTo <<= version { v: String =>
   val nexus = "http://www.media4u101.se:8081/nexus/"
   if (v.trim.endsWith("SNAPSHOT"))
	 Some("snapshots" at nexus + "content/repositories/snapshots")
   else
     Some("releases" at nexus + "content/repositories/releases")
   }

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { x => false }

pomExtra := (
  <url>http://www.media4u101.org/fobo-lift-template-demo/</url>
  <licenses>
    <license>
      <name>The Apache Software License, Version 2.0</name>
      <url>http://maven.apache.org/ref/2.1.0/maven-profile/license.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:karma4u101/lift-jquery-module.git</url>
    <connection>scm:git:git@github.com:karma4u101/lift-jquery-module.git</connection>
  </scm>
  <developers>
    <developer>
      <id>karma4u101</id>
      <name>Peter Petersson</name>
      <url>http://www.media4u101.se</url>
    </developer>
  </developers>
)





