moduleName := "fobo-google-code-prettify-res"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}
