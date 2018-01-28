import LiftModuleKeys.liftEdition

moduleName := "fobo-popper"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("fobo-popper-res" + "_" + liftEdition.value) % version.value % "provided" ::
    Nil
}
