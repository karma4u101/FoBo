moduleName := "fobo-tether"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("fobo-tether-res" + "_" + liftEdition.value) % version.value % "provided" ::
    Nil
}
