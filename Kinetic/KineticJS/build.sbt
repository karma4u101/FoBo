moduleName := "fobo-kineticjs"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}

libraryDependencies <++= (liftVersion, liftEdition, version) { (v, e, mv) =>
  "net.liftmodules" %% ("fobo-kineticjs-res" + "_" + e) % mv % "provided" ::
    Nil
}
