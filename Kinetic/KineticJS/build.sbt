moduleName := "fobo-kineticjs"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("fobo-kineticjs-res" + "_" + liftEdition.value) % version.value % "provided" ::
    Nil
}
