import sbt._
import sbt.Keys._

object LiftModuleFoBoBuild extends Build {
  
  val tbVerPath = "2.0.4"
  val liftVersion = SettingKey[String]("liftVersion", "Version number of the Lift Web Framework")
  
  val project = Project("FoBo", file("."))
/*  
  lazy val foboProjects = foboLess //++ core
  
  lazy val project = Project("FoBo", file("."))
      .aggregate(foboProjects: _*)
      //.settings(aggregatedSetting(sources in(Compile, doc)),
      //          aggregatedSetting(dependencyClasspath in(Compile, doc)),
      //          publishArtifact := false)
                
 lazy val foboLess: Seq[ProjectReference] =
    Seq(bootstrap200,bootstrap204)    
    
 lazy val bootstrap200 = 
   fobolessProject("bootstrap200")
   .settings(com.untyped.sbtless.Plugin.lessSettings: _*)
   .settings(description := "Bootstrap 2.0.0 Less Build",
                  parallelExecution in Test := false,
                  (sourceDirectories in (Compile, LessKeys.less)) <<= (sourceDirectory in Compile) { 
                  srcDir =>
                    Seq(
                      srcDir / "less" / "overrides",
                      srcDir / "less" / "origin"
                    )
                  },
                  (LessKeys.prettyPrint in (Compile, LessKeys.less)) := true,
                  (includeFilter in (Compile, LessKeys.less)) := ("bootstrap.less" | "responsive.less": FileFilter),
                  (resourceManaged in (Compile, LessKeys.less)) <<= (crossTarget in Compile)(_ / "classes" / "toserve" / "fobo" / "bootstrap" / "2.0.0" / "css" )
   )
   
 lazy val bootstrap204 = 
   fobolessProject("bootstrap204")
   .settings(com.untyped.sbtless.Plugin.lessSettings: _*)
   .settings(description := "Bootstrap 2.0.4 Less Build",
                  parallelExecution in Test := false,
                  (sourceDirectories in (Compile, LessKeys.less)) <<= (sourceDirectory in Compile) { 
                  srcDir =>
                    Seq(
                      srcDir / "less" / "overrides",
                      srcDir / "less" / "origin"
                    )
                  },
                  (LessKeys.prettyPrint in (Compile, LessKeys.less)) := true,
                  (includeFilter in (Compile, LessKeys.less)) := ("bootstrap.less" | "responsive.less": FileFilter),
                  (resourceManaged in (Compile, LessKeys.less)) <<= (crossTarget in Compile)(_ / "classes" / "toserve" / "fobo" / "bootstrap" / "2.0.4" / "css" )
   )   
                
 
   
   def fobolessProject = foboProject("foboLess") _
 
   def foboProject(base: String)(module: String): Project =
    foboProject(id =  module , base = file(base) / module )

  def foboProject(id: String, base: File): Project =
    Project(id, base)//.settings(liftBuildSettings: _*)  
 */   
}
