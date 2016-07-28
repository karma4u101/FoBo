moduleName := "fobo-google-code-prettify"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }

libraryDependencies <++= (liftVersion,liftEdition,version) { (v,e,mv) =>
    "net.liftmodules"  %% ("fobo-google-code-prettify-res"+"_"+e)   % mv         % "provided" :: 
    Nil
}