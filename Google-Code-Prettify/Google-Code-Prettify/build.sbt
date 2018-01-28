import LiftModuleKeys.liftEdition

moduleName := "fobo-google-code-prettify"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("fobo-google-code-prettify-res" + "_" + liftEdition.value) % version.value % "provided" ::
    Nil
}
