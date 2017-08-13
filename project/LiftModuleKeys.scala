import sbt._

object LiftModuleKeys {

  lazy val liftVersion = SettingKey[String]("Version number of the Lift Web Framework")

  lazy val liftEdition = SettingKey[String]("Lift Edition (short version number to append to artifact name)")

}
