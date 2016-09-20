moduleName := "fobo-twbs-bootstrap3-api"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}

libraryDependencies <++= liftVersion { lv =>
  "net.liftweb" %% "lift-mapper" % lv % "provided" ::
    Nil
}
