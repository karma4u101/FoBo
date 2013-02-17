name := "FoBo-Twitter-Bootstrap"

organization := "net.liftmodules"

version <<= liftVersion apply { _ + "-0.1.0-SNAPSHOT" }

crossScalaVersions := Seq("2.10.0", "2.9.2", "2.9.1-1", "2.9.1")

logLevel := Level.Info  //Level.Info.Debug

scalacOptions ++= Seq("-deprecation")

EclipseKeys.withSource := true

resolvers ++= Seq(
  "Scala Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Scala" at "https://oss.sonatype.org/content/groups/scala-tools/"
)

libraryDependencies <++= liftVersion { v =>
    "net.liftweb"      %% "lift-webkit"          % v          % "compile" ::
    "net.liftweb"      %% "lift-testkit"         % v          % "compile" ::
    Nil
}

libraryDependencies <++= scalaVersion { sv =>
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "provided" ::
  "log4j" % "log4j" % "1.2.16" % "provided" ::
  (sv match {
      case "2.10.0" | "2.9.2" | "2.9.1" | "2.9.1-1" => "org.specs2" %% "specs2" % "1.12.3" % "test"
      case _ => "org.specs2" %% "specs2" % "1.12.3" % "test"
      }) ::
   (sv match {
      case "2.10.0" | "2.9.2" => "org.scalacheck" %% "scalacheck" % "1.10.0" % "test"
      case _ => "org.scalacheck" %% "scalacheck" % "1.10.0" % "test"
      }) ::
  Nil
}


//############################################################
//#### THE BUILDINFO BUILD
//## https://github.com/sbt/sbt-buildinfo
//## 
//##
//#############################################################

//seq(buildInfoSettings: _*)

//sourceGenerators in Compile <+= buildInfo

//buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion)

//buildInfoPackage := "net.liftmodules.FoBo.lib"


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
credentials += Credentials(Path.userHome / ".sbt" / "liftmodules" /".credentials" )

credentials += Credentials( file("/private/liftmodules/sonatype.credentials") )

//credentials += Credentials(Path.userHome / ".sbt" / ".credentials" )
//publishTo <<= version { v: String =>
//   val nexus = "http://www.media4u101.se:8081/nexus/"
//   if (v.trim.endsWith("SNAPSHOT"))
//	 Some("snapshots" at nexus + "content/repositories/snapshots")
//   else
//     Some("releases" at nexus + "content/repositories/releases")
//   }

publishTo <<= version { v: String =>
   val sonatype = "https://oss.sonatype.org/"
   if (v.trim.endsWith("SNAPSHOT"))
	 Some("snapshots" at sonatype + "content/repositories/snapshots")
   else
     Some("releases" at sonatype + "service/local/staging/deploy/maven2")
   }

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { x => false }

pomExtra := (
  <url>http://www.media4u101.se/fobo-lift-template-demo/</url>
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





