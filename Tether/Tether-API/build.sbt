moduleName := "fobo-tether-api"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}
