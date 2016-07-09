moduleName := "fobo-angularjs"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }

libraryDependencies <++= (liftVersion,liftEdition,version) { (v,e,mv) =>
    "net.liftmodules"  %% ("fobo-angularjs-res"+"_"+e)   % mv         % "provided" :: 
    "net.liftmodules"  %% ("fobo-angularjs-api"+"_"+e)   % mv         % "provided" :: 
    Nil
}