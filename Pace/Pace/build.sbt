moduleName := "fobo-pace"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("fobo-pace-res" + "_" + liftEdition.value) % version.value % "provided" ::
    Nil
}
