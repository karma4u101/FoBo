moduleName := "fobo-kineticjs-res"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}
