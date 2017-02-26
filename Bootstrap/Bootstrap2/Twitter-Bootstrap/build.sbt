moduleName := "fobo-twitter-bootstrap"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}

libraryDependencies <++= (liftVersion, liftEdition, version) { (v, e, mv) =>
  "net.liftmodules" %% ("fobo-twitter-bootstrap-res" + "_" + e) % mv % "provided" ::
    "net.liftmodules" %% ("fobo-twitter-bootstrap-api" + "_" + e) % mv % "provided" ::
      Nil
}
