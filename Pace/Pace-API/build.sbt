moduleName := "fobo-pace-api"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}
