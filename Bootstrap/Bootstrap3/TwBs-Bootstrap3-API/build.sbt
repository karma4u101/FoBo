moduleName := "fobo-twbs-bootstrap3-api"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftweb" %% "lift-mapper" % liftVersion.value % "provided" ::
    Nil
}
