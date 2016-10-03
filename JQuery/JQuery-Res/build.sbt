moduleName := "fobo-jquery-res"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}

libraryDependencies <++= (liftVersion, liftEdition) { (v, e) =>
  "net.liftmodules" %% ("lift-jquery-module" + "_" + e) % "2.10" % "compile" ::
    Nil
}
