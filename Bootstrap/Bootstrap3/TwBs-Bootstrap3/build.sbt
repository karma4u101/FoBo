moduleName := "fobo-twbs-bootstrap3"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("fobo-twbs-bootstrap3-res" + "_" + liftEdition.value) % version.value % "provided" ::
    "net.liftmodules" %% ("fobo-twbs-bootstrap3-api" + "_" + liftEdition.value) % version.value % "provided" ::
    Nil
}
