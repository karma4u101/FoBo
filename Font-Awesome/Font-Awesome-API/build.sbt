moduleName := "fobo-font-awesome-api"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}
