import LiftModuleKeys.{liftEdition, liftVersion}

moduleName := "fobo-twitter-bootstrap-api"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftweb" %% "lift-mapper" % liftVersion.value % "provided" ::
    Nil
}