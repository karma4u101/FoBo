moduleName := "fobo-pace-res"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }