moduleName := "fobo-angularjs-res"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}
