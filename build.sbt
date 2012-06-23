name := "FoBo"

organization := "net.liftmodules"

liftVersion <<= liftVersion ?? "2.4"

version <<= liftVersion apply { _ + "-0.4.3-SNAPSHOT" }

crossScalaVersions := Seq("2.8.1", "2.9.0-1", "2.9.1")

scalaVersion  := "2.9.1"

logLevel := Level.Info  //Level.Info.Debug

scalacOptions ++= Seq("-deprecation")

//scalacOptions in doc <++= (version).map(v => Seq("--doc-version", v ,"-doc-root-content", "net.liftmodules.FoBo"))

EclipseKeys.withSource := true

resolvers ++= Seq(
  "Scala Tools Releases" at "http://scala-tools.org/repo-releases/",
  "Scala Tools Snapshot" at "http://scala-tools.org/repo-snapshots/"
)

//"net.liftweb" %% "lift-webkit" % v % "compile->default" withSources() ::

libraryDependencies <++= liftVersion { v =>
    "net.liftweb" %% "lift-webkit" % v % "compile->default" ::
    "net.liftweb" %% "lift-testkit" % v % "compile->default" ::
    Nil
}

/*https://github.com/sbt/sbt-buildinfo */
seq(buildInfoSettings: _*)

sourceGenerators in Compile <+= buildInfo

buildInfoKeys := Seq[Scoped](name, version, scalaVersion, sbtVersion)

buildInfoPackage := "net.liftmodules.FoBo.lib"


seq(lessSettings:_*)

(sourceDirectories in (Compile, LessKeys.less)) <<= (sourceDirectory in Compile) {
  srcDir =>
    Seq(
      srcDir / "less" / "bootstrap" / "2.0.0" / "overrides",
      srcDir / "less" / "bootstrap" / "2.0.0" / "origin"
    )
}

(LessKeys.prettyPrint in (Compile, LessKeys.less)) := true

(includeFilter in (Compile, LessKeys.less)) := ("bootstrap.less" | "responsive.less": FileFilter)

(resourceManaged in (Compile, LessKeys.less)) <<= (crossTarget in Compile)(_ / "classes" / "toserve" / "fobo" / "bootstrap" / "2.0.0" / "css" )


//The yui js compression stuff dose currently not work so for now the last filter string in exludeFilter for js will exlude every .js file
seq(yuiSettings: _*)

excludeFilter in (Compile, YuiCompressorKeys.jsResources) := "*-debug.js" | "*-min.js" | "*.js"

excludeFilter in (Compile, YuiCompressorKeys.cssResources) := "*-debug.css" | "*-min.css"

YuiCompressorKeys.minSuffix := "-min"






