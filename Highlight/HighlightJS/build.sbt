import LiftModuleKeys.liftEdition

moduleName := "fobo-highlightjs"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("fobo-highlightjs-res" + "_" + liftEdition.value) % version.value % "provided" ::
    "net.liftmodules" %% ("fobo-highlightjs-api" + "_" + liftEdition.value) % version.value % "provided" ::
    Nil
}
