moduleName := "fobo-jquery-res"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }
