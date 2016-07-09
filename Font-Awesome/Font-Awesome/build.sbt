moduleName := "fobo-font-awesome"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }

libraryDependencies <++= (liftVersion,liftEdition,version) { (v,e,mv) =>
    "net.liftmodules"  %% ("fobo-font-awesome-res"+"_"+e)   % mv         % "provided" :: 
    Nil
}