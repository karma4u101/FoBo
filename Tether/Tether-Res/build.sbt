moduleName := "fobo-tether-res"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}
