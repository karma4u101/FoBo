moduleName := "fobo-jquery-res"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("lift-jquery-module" + "_" + liftEdition.value) % "2.11-SNAPSHOT" % "compile" ::
    Nil
}
