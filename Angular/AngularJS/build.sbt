import LiftModuleKeys.liftEdition

moduleName := "fobo-angularjs"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("fobo-angularjs-res" + "_" + liftEdition.value) % version.value % "provided" ::
    "net.liftmodules" %% ("fobo-angularjs-api" + "_" + liftEdition.value) % version.value % "provided" ::
    Nil
}
