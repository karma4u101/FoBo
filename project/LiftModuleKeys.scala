import sbt._
import Keys._

object LiftModuleKeys extends Build {

  lazy val liftVersion = SettingKey[String](
    "liftVersion",
    "Version number of the Lift Web Framework")

  lazy val liftEdition = SettingKey[String](
    "liftEdition",
    "Lift Edition (short version number to append to artifact name)")

}
