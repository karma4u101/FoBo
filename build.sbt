name := "FoBo"

organization := "net.liftmodules"

liftVersion <<= liftVersion ?? "2.4"

version <<= liftVersion apply { _ + "-0.4.2-SNAPSHOT" }

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


//#### Less setup heads up! ############
//####  
//# Less compile of Bootstrap v2.0.4 is not working due to some combinations 
//# of bugs in less v1.3 and bootstrap v2.0.4 less setup.
//####
//######################################

seq(lessSettings:_*)

(sourceDirectory in (Compile, LessKeys.less)) <<= (sourceDirectory in Compile)(_ / "less" / "bootstrap" / "2.0.0")

(resourceManaged in (Compile, LessKeys.less)) <<= (crossTarget in Compile)(_ / "classes" / "toserve" / "fobo" / "bootstrap" / "2.0.0" / "css" )

(includeFilter in (Compile, LessKeys.less)) := ("bootstrap.less": FileFilter)

InputKey[Unit]("contents") <<= inputTask { (argsTask: TaskKey[Seq[String]]) =>
  (argsTask, streams) map { (args, out) =>
    args match {
      case Seq(actual, expected) =>
        if(IO.read(file(actual)).trim.equals(IO.read(file(expected)).trim)) {
          out.log.debug("Contents match")
        } else {
          error("\nContents of %s\n%s\ndoes not match %s\n%s\n".format(
                actual,
                IO.read(file(actual)),
                expected,
                IO.read(file(expected))))
        }
    }
  }
}

//seq(yuiSettings: _*)

//excludeFilter in (Compile, YuiCompressorKeys.jsResources) := "*-debug.js" | "*-min.js"

//excludeFilter in (Compile, YuiCompressorKeys.cssResources) := "*-debug.css" | "*-min.css"

//YuiCompressorKeys.minSuffix := "-min"

//YuiCompressorKeys.options in (Compile,YuiCompressorKeys.jsCompressor) += yuiCompressor.Opts.js.nomunge

//YuiCompressorKeys.options in (Compile,YuiCompressorKeys.jsCompressor) += yuiCompressor.Opts.js.preserveSemi

//YuiCompressorKeys.options in (Compile,YuiCompressorKeys.jsCompressor) += yuiCompressor.Opts.js.disableOptimizations






