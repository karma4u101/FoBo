moduleName := "fobo-twbs-bootstrap3"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}

libraryDependencies <++= (liftVersion, liftEdition, version) { (v, e, mv) =>
  "net.liftmodules"   %% ("fobo-twbs-bootstrap3-res" + "_" + e) % mv % "provided" ::
    "net.liftmodules" %% ("fobo-twbs-bootstrap3-api" + "_" + e) % mv % "provided" ::
      Nil
}
