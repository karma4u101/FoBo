import LiftModuleKeys.liftEdition

moduleName := "fobo-jquery"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("fobo-jquery-api" + "_" + liftEdition.value) % version.value % "provided" ::
    "net.liftmodules" %% ("fobo-jquery-res" + "_" + liftEdition.value) % version.value % "provided" ::
    Nil
}
