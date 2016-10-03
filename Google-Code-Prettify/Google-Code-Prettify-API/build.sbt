moduleName := "fobo-google-code-prettify-api"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}
