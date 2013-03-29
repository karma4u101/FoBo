name := "FoBo-Less"

organization  := "net.liftmodules"

version := "0.5-SNAPSHOT"

//scalaVersion  := "2.9.1"


//#########################################################################
//#### THE LESS BUILD
//## The fobo less build currently only support less build of one bootstrap  
//## version at a time. When done you also have to manually copy the build 
//## css files to there corresponding src/main/resources/toserve directories
//## in FoBo. 
//## If anyone knows how to automate this plz let me know and also how to
//## manage more than one less build at the time. The target dir has to be
//## the src dir as FoBo uses yui to add both min and uncompressed css 
//## files to the build.
//#########################################################################
//tbVerPath := "2.3.0"
seq(lessSettings:_*) 
 
(sourceDirectories in (Compile, LessKeys.less)) <<= (sourceDirectory in Compile) { 
  srcDir =>
    Seq(
      srcDir / "less" / "bootstrap" / "2.3.0"  / "overrides",
      srcDir / "less" / "bootstrap" / "2.3.0"  / "origin"
    )
}

(LessKeys.prettyPrint in (Compile, LessKeys.less)) := true

(includeFilter in (Compile, LessKeys.less)) := ("bootstrap.less" | "responsive.less": FileFilter)

(resourceManaged in (Compile, LessKeys.less)) <<= (crossTarget in Compile)(_ / "classes" / "toserve" / "fobo" / "bootstrap" / "2.3.0" / "css" )




