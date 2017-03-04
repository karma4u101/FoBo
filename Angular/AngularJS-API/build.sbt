moduleName := "fobo-angularjs-api"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftweb" %% "lift-mapper" % liftVersion.value % "provided" ::
    Nil
}
