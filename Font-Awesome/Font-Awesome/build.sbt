import LiftModuleKeys.liftEdition

moduleName := "fobo-font-awesome"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("fobo-font-awesome-api" + "_" + liftEdition.value) % version.value % "provided" ::
    "net.liftmodules" %% ("fobo-font-awesome-res" + "_" + liftEdition.value) % version.value % "provided" ::
    Nil
}
