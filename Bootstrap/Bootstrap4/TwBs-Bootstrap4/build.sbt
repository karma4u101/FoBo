moduleName := "fobo-twbs-bootstrap4"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("fobo-twbs-bootstrap4-res" + "_" + liftEdition.value) % version.value % "provided" ::
    "net.liftmodules" %% ("fobo-twbs-bootstrap4-api" + "_" + liftEdition.value) % version.value % "provided" ::
      Nil
}
