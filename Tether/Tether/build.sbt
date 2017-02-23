moduleName := "fobo-tether"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}

libraryDependencies <++= (liftVersion, liftEdition, version) { (v, e, mv) =>
  "net.liftmodules" %% ("fobo-tether-res" + "_" + e) % mv % "provided" ::
    Nil
}
