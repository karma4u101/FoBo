moduleName := "fobo-twbs-bootstrap3-res"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }