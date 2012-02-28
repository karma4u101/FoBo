name := "FoBo"

organization := "net.liftmodules"

version := "2.4-0.3.3-SNAPSHOT"

scalaVersion := "2.9.1"

logLevel := Level.Info
//Level.Info.Debug

scalacOptions ++= Seq("-deprecation")

//scalacOptions in doc <++= (version).map(v => Seq("--doc-version", v ,"-doc-root-content", "net.liftmodules.FoBo"))

EclipseKeys.withSource := true

resolvers ++= Seq(
  "Scala Tools Releases" at "http://scala-tools.org/repo-releases/",
  "Scala Tools Snapshot" at "http://scala-tools.org/repo-snapshots/"
)

libraryDependencies ++= {
  val liftVersion = "2.4" // Put the current/latest lift version here
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default" withSources(),
    "net.liftweb" %% "lift-testkit" % liftVersion % "compile->default"
    )
}



//use sbt clean update compile package publish-local


