import sbt._
import sbt.Keys._

object LiftModuleFoBoBuild extends Build {
  
  val liftVersion = SettingKey[String]("liftVersion", "Version number of the Lift Web Framework")
  
  lazy val root = Project(id   = "FoBo", 
                             base = file(".")) dependsOn(bootstrap,fontAwesome,datatables,knockout)                                                 
                  
//aggregate(fontAwesome,bootstrap)                             
                             
   lazy val fontAwesome = Project(id   = "FoBo-Font-Awesome", 
                             base = file("Font-Awesome"))  
                             
  lazy val bootstrap = Project(id   = "FoBo-Twitter-Bootstrap", 
                             base = file("Twitter-Bootstrap"))  
                             
  lazy val datatables = Project(id   = "FoBo-DataTables", 
                             base = file("DataTables"))                  
                             
  lazy val knockout = Project(id   = "FoBo-Knockout", 
                             base = file("Knockout"))                                               
                             
  lazy val foboLess = Project(id   = "FoBo-Less", 
                             base = file("FoBo-Less"))                             
  
}

