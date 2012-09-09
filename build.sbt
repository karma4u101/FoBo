name := "FoBo"

organization := "net.liftmodules"

liftVersion <<= liftVersion ?? "2.4"

version <<= liftVersion apply { _ + "-0.7.2-SNAPSHOT" }

crossScalaVersions := Seq("2.9.2", "2.9.1-1", "2.9.1", "2.9.0-1", "2.9.0")

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
//## 
//## To simplify, the less build has been moved to the FoBo-Less project. 
//## Bootstrap css files, slightly modified to work in the FoBo environment,  
//## is built in the FoBo-Less project and then copied (already present) to 
//## there corresponding src/resources directories.
//## 
//#########################################################################

//Take a look att FoBo-Less and read the above.

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
    <url>git@github.com:karma4u101/FoBo.git</url>
    <connection>scm:git:git@github.com:karma4u101/FoBo.git</connection>
  </scm>
  <developers>
    <developer>
      <id>karma4u101</id>
      <name>Peter Petersson</name>
      <url>http://www.media4u101.se</url>
    </developer>
  </developers>
)





