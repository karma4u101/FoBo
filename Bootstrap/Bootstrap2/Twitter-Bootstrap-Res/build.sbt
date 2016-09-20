moduleName := "fobo-twitter-bootstrap-res"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}
