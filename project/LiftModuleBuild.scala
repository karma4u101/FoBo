import sbt._
import sbt.Keys._
import java.lang.String

object LiftModuleFoBoBuild extends Build {
  
  val liftVersion = SettingKey[String]("liftVersion", "Version number of the Lift Web Framework")
  
  val liftVName = SettingKey[String]("liftVName", "Lift Web Framework short version number to append to artifact name")
  
  lazy val root = Project(id   = "FoBo", 
                             base = file(".")) dependsOn(bootstrap,fontAwesome,foundation,datatables,knockout,jquerymobile,prettify)                                                 
                  
//aggregate(fontAwesome,bootstrap)                             
                             
   lazy val fontAwesome = Project(id   = "FoBo-Font-Awesome", 
                             base = file("Font-Awesome"))  
                             
  lazy val bootstrap    = Project(id   = "FoBo-Twitter-Bootstrap", 
                             base = file("Twitter-Bootstrap"))  
                             
  lazy val foundation   = Project(id   = "FoBo-Foundation", 
                             base = file("Foundation"))                                               
                             
  lazy val datatables   = Project(id   = "FoBo-DataTables", 
                             base = file("DataTables"))                  
                             
  lazy val knockout     = Project(id   = "FoBo-Knockout", 
                             base = file("Knockout")) 
                             
  lazy val jquerymobile = Project(id   = "FoBo-JQuery-Mobile", 
                             base = file("JQuery-Mobile"))  
                             
  lazy val prettify     = Project(id   = "FoBo-Google-Code-Prettify", 
                             base = file("Google-Code-Prettify"))                               
                             
  lazy val foboLess     = Project(id   = "FoBo-Less", 
                             base = file("FoBo-Less"))                             
  
}

