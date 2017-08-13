import LiftModuleKeys.liftEdition

moduleName := "fobo-twitter-bootstrap"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("fobo-twitter-bootstrap-res" + "_" + liftEdition.value) % version.value % "provided" ::
    "net.liftmodules" %% ("fobo-twitter-bootstrap-api" + "_" + liftEdition.value) % version.value % "provided" ::
    Nil
}
