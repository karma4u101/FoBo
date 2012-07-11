import sbt._
import sbt.Keys._

object LiftModuleFoBoBuild extends Build {
  
  val liftVersion = SettingKey[String]("liftVersion", "Version number of the Lift Web Framework")
  
  val project = Project("FoBo", file("."))
  
}

