import LiftModuleKeys.liftEdition

moduleName := "fobo-tether-api"

moduleName := { name.value + "_" + liftEdition.value }
