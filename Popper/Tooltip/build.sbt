import LiftModuleKeys.liftEdition

moduleName := "fobo-tooltip"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("fobo-tooltip-res" + "_" + liftEdition.value) % version.value % "provided" ::
    Nil
}
