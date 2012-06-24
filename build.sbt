name := "FoBo"

organization := "net.liftmodules"

liftVersion <<= liftVersion ?? "2.4"

version <<= liftVersion apply { _ + "-0.5.0-SNAPSHOT" }

crossScalaVersions := Seq("2.8.1", "2.9.0-1", "2.9.1")

scalaVersion  := "2.9.1"

logLevel := Level.Info  //Level.Info.Debug

scalacOptions ++= Seq("-deprecation")

EclipseKeys.withSource := true

resolvers ++= Seq(
  "Scala Tools Releases" at "http://scala-tools.org/repo-releases/",
  "Scala Tools Snapshot" at "http://scala-tools.org/repo-snapshots/"
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
//## The fobo build currently only support less build of one bootstrap  
//## version at a time.
//## To change the less path and target of the less build edit the 
//## tbVerPath val in project/FoBoLessBuild.scala 
//## Allso if you change the path make sure to rename the corresponding 
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






