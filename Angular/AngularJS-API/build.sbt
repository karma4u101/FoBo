moduleName := "fobo-angularjs-api"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}

libraryDependencies <++= liftVersion { v =>
  "net.liftweb" %% "lift-mapper" % v % "provided" ::
    Nil
}
