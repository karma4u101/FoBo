import sbt._
import sbt.Keys._

object LiftModuleBuild extends Build {
  val liftVersion = SettingKey[String]("liftVersion", "Version number of the Lift Web Framework")
  val project = Project("LiftModule", file("."))
}
