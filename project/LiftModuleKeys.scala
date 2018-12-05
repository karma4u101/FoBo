import sbt._

object LiftModuleKeys {

  lazy val liftVersion = settingKey[String]("Version number of the Lift Web Framework")

  lazy val liftEdition = settingKey[String]("Lift Edition (short version number to append to artifact name)")

}
