moduleName := "fobo-font-awesome-res"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }
