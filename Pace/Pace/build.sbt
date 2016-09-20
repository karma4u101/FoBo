moduleName := "fobo-pace"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}

libraryDependencies <++= (liftVersion, liftEdition, version) { (v, e, mv) =>
  "net.liftmodules" %% ("fobo-pace-res" + "_" + e) % mv % "provided" ::
    Nil
}
