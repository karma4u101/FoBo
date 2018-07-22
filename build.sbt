import LiftModuleKeys.{liftVersion, liftEdition}

//##################################################################
//##
//##  Build settings
//##
//##############

//scalacOptions in Compile ++= Seq("-doc-root-content", "rootdoc.txt")
onLoad in Global := { s => "dependencyUpdates" :: s }

lazy val commonSettings = Seq(
  organization := "net.liftmodules",
  version := "2.0",
  scalacOptions ++= Seq("-unchecked", "-deprecation"),
  autoAPIMappings := true
)

lazy val fobometa = (project in file("."))
  .settings(commonSettings: _*)
  .enablePlugins(ScalaUnidocPlugin)
  .settings(name := "fobo-meta")
  .settings(scalaVersion in ThisBuild := "2.12.6")
  .settings(
    liftVersion in ThisBuild := { liftVersion ?? "3.3.0" }.value)
  .settings(liftEdition in ThisBuild := {
    liftVersion apply { _.substring(0, 3) }
  }.value)
  .aggregate(fobo)

lazy val fobo = (project in file("FoBo/FoBo"))
  .settings(commonSettings: _*)
  .settings(name := "fobo")
  .aggregate(foboapi,
             pace,
             angularjs,
             jquery,
             bootstrap,
             bootstrap3,
             bootstrap4,
             fontAwesome,
             prettify,
             highlightjs,
             popper,
             tooltip)
  .dependsOn(foboapi,
             pace,
             angularjs,
             jquery,
             bootstrap,
             bootstrap3,
             bootstrap4,
             fontAwesome,
             prettify,
             highlightjs,
             popper,
             tooltip)

lazy val foboapi = (project in file("FoBo/FoBo-API"))
  .enablePlugins(BuildInfoPlugin)
  .settings(name := "fobo-api")
  .settings(commonSettings: _*)
  .settings(
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "net.liftmodules.fobo.lib"
  )

lazy val pace = (project in file("Pace/Pace"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-pace")
  .aggregate(paceapi, paceres)
  .dependsOn(paceapi, paceres)

lazy val paceapi = (project in file("Pace/Pace-API"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-pace-api")

lazy val paceres = (project in file("Pace/Pace-Res"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-pace-res")

lazy val angularjs = (project in file("Angular/AngularJS"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-angularjs")
  .aggregate(angularjsapi, angularjsres)
  .dependsOn(angularjsapi, angularjsres)

lazy val angularjsapi = (project in file("Angular/AngularJS-API"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-angularjs-api")

lazy val angularjsres = (project in file("Angular/AngularJS-Res"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-angularjs-res")

lazy val jquery = (project in file("JQuery/JQuery"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-jquery")
  .aggregate(jqueryapi, jqueryres)
  .dependsOn(jqueryapi, jqueryres)

lazy val jqueryapi = (project in file("JQuery/JQuery-API"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-jquery-api")

lazy val jqueryres = (project in file("JQuery/JQuery-Res"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-jquery-res")

lazy val bootstrap =
  (project in file("Bootstrap/Bootstrap2/Twitter-Bootstrap"))
    .settings(commonSettings: _*)
    .settings(name := "fobo-twitter-bootstrap")
    .aggregate(bootstrapapi, bootstrapres)
    .dependsOn(bootstrapapi, bootstrapres)

lazy val bootstrapapi =
  (project in file("Bootstrap/Bootstrap2/Twitter-Bootstrap-API"))
    .settings(commonSettings: _*)
    .settings(name := "fobo-twitter-bootstrap-api")

lazy val bootstrapres =
  (project in file("Bootstrap/Bootstrap2/Twitter-Bootstrap-Res"))
    .settings(commonSettings: _*)
    .settings(name := "fobo-twitter-bootstrap-res")

lazy val bootstrap3 = (project in file("Bootstrap/Bootstrap3/TwBs-Bootstrap3"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-twbs-bootstrap3")
  .aggregate(bootstrap3api, bootstrap3res)
  .dependsOn(bootstrap3api, bootstrap3res)

lazy val bootstrap3api =
  (project in file("Bootstrap/Bootstrap3/TwBs-Bootstrap3-API"))
    .settings(commonSettings: _*)
    .settings(name := "fobo-twbs-bootstrap3-api")

lazy val bootstrap3res =
  (project in file("Bootstrap/Bootstrap3/TwBs-Bootstrap3-Res"))
    .settings(commonSettings: _*)
    .settings(name := "fobo-twbs-bootstrap3-res")

lazy val bootstrap4 = (project in file("Bootstrap/Bootstrap4/TwBs-Bootstrap4"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-twbs-bootstrap4")
  .aggregate(bootstrap4api, bootstrap4res)
  .dependsOn(bootstrap4api, bootstrap4res)

lazy val bootstrap4api =
  (project in file("Bootstrap/Bootstrap4/TwBs-Bootstrap4-API"))
    .settings(commonSettings: _*)
    .settings(name := "fobo-twbs-bootstrap4-api")

lazy val bootstrap4res =
  (project in file("Bootstrap/Bootstrap4/TwBs-Bootstrap4-Res"))
    .settings(commonSettings: _*)
    .settings(name := "fobo-twbs-bootstrap4-res")

lazy val fontAwesome = (project in file("Font-Awesome/Font-Awesome"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-font-awesome")
  .aggregate(fontAwesomeapi, fontAwesomeres)
  .dependsOn(fontAwesomeapi, fontAwesomeres)

lazy val fontAwesomeres = (project in file("Font-Awesome/Font-Awesome-Res"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-font-awesome-res")

lazy val fontAwesomeapi = (project in file("Font-Awesome/Font-Awesome-API"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-font-awesome-api")

lazy val prettify =
  (project in file("Google-Code-Prettify/Google-Code-Prettify"))
    .settings(commonSettings: _*)
    .settings(name := "fobo-google-code-prettify")
    .aggregate(prettifyres)
    .dependsOn(prettifyres)

lazy val prettifyres =
  (project in file("Google-Code-Prettify/Google-Code-Prettify-Res"))
    .settings(commonSettings: _*)
    .settings(name := "fobo-google-code-prettify-res")

lazy val highlightjs = (project in file("Highlight/HighlightJS"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-highlightjs")
  .aggregate(highlightjsapi, highlightjsres)
  .dependsOn(highlightjsapi, highlightjsres)

lazy val highlightjsapi = (project in file("Highlight/HighlightJS-API"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-highlightjs-api")

lazy val highlightjsres = (project in file("Highlight/HighlightJS-Res"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-highlightjs-res")

lazy val popper = (project in file("Popper/Popper"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-popper")
  .aggregate(popperapi, popperres)
  .dependsOn(popperapi, popperres)

lazy val popperapi = (project in file("Popper/Popper-API"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-popper-api")

lazy val popperres = (project in file("Popper/Popper-Res"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-popper-res")

lazy val tooltip = (project in file("Popper/Tooltip"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-tooltip")
  .aggregate(tooltipapi, tooltipres)
  .dependsOn(tooltipapi, tooltipres)

lazy val tooltipapi = (project in file("Popper/Tooltip-API"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-tooltip-api")

lazy val tooltipres = (project in file("Popper/Tooltip-Res"))
  .settings(commonSettings: _*)
  .settings(name := "fobo-tooltip-res")

//##
//##
//##################################################################

//##################################################################
//##
//##  Common resolvers
//##
//##############
resolvers in ThisBuild ++= Seq(
  "snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2"
)
//##
//##
//##################################################################

//##################################################################
//##
//##  Common dependencies
//##
//##############

libraryDependencies in ThisBuild ++= {
  "net.liftweb"   %% "lift-webkit"  % liftVersion.value % "provided" ::
    "net.liftweb" %% "lift-testkit" % liftVersion.value % "provided" ::
    Nil
}

libraryDependencies in ThisBuild ++= {
  ((scalaVersion.value, liftVersion.value) match {
    case ("2.10.4", _) | ("2.9.2", _) | ("2.9.1", _) | ("2.9.1-1", _) =>
      "org.specs2" %% "specs2" % "1.12.3" % "test"
    case ("2.11.7", "2.6.2") | ("2.11.7", "2.6.3") =>
      "org.specs2" %% "specs2" % "2.3.11" % "test"
    case (_, "3.0.0") => "org.specs2" %% "specs2"      % "3.7"   % "test"
    case (_, "3.0.1") => "org.specs2" %% "specs2-core" % "3.8.6" % "test"
    case (_, "3.1.1") | (_, "3.1.2") =>
      "org.specs2" %% "specs2-core" % "3.8.6" % "test" //lift 3.1.x / 3.2.x
    case (_, _) =>
      "org.specs2" %% "specs2-core" % "4.0.2" % "test" //lift 3.3.x
  }) ::
    ((scalaVersion.value, liftVersion.value) match {
    case ("2.10.4", _) | ("2.9.2", _) | ("2.9.1", _) | ("2.9.1-1", _) =>
      "org.specs2" %% "specs2" % "1.12.3" % "test"
    case ("2.11.7", "2.6.2") | ("2.11.7", "2.6.3") =>
      "org.specs2" %% "specs2" % "2.3.11" % "test"
    case (_, "3.0.0") =>
      "org.specs2" %% "specs2" % "3.7" % "test" //no mather extras for 3.7
    case (_, "3.0.1") =>
      "org.specs2" %% "specs2-matcher-extra" % "3.8.6" % "test"
    case (_, "3.1.1") | (_, "3.1.2") =>
      "org.specs2" %% "specs2-matcher-extra" % "3.8.6" % "test" //lift 3.1.x / 3.2.x
    case (_, _) =>
      "org.specs2" %% "specs2-matcher-extra" % "4.0.2" % "test" //lift 3.3.x
  }) ::
    ((scalaVersion.value, liftVersion.value) match {
    case (_, "2.6.2") | (_, "2.6.3") =>
      "org.scalacheck" %% "scalacheck" % "1.10.1" % "test"
    case (_, "3.0.0") =>
      "org.specs2" %% "specs2-scalacheck" % "3.7" % "test"
    case (_, "3.0.1") =>
      "org.specs2" %% "specs2-scalacheck" % "3.8.6" % "test"
    case (_, "3.1.1") | (_, "3.1.2") =>
      "org.specs2" %% "specs2-scalacheck" % "3.8.6" % "test" //lift 3.1.x / 3.2.x
    case (_, _) =>
      "org.specs2" %% "specs2-scalacheck" % "4.0.2" % "test" //lift 3.3.x
  }) ::
    Nil
}

libraryDependencies in ThisBuild ++= {
  (liftVersion.value match {
    case "2.6.2" | "2.6.3" =>
      "javax.servlet" % "servlet-api" % "2.5" % "provided,test"
    case "3.0.2" | "3.1.1" | "3.2.0" => "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided,test"
    case _ => "javax.servlet" % "javax.servlet-api" % "4.0.0" % "provided,test"
  }) ::
    Nil
}

libraryDependencies in ThisBuild ++= {
  "ch.qos.logback" % "logback-classic" % "1.2.3"  % "provided" ::
    "log4j"        % "log4j"           % "1.2.17" % "provided" ::
    Nil
}

//##
//##
//##################################################################

//##################################################################
//##
//##  Eclipse stuff
//##
//##############
//EclipseKeys.withSource in ThisBuild := true

//EclipseKeys.skipParents in ThisBuild := false

//EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Managed
//##
//##
//##################################################################

//##################################################################
//##
//##  Publish to Sonatype
//##
//##############
credentials in ThisBuild += Credentials(
  file("/private/liftmodules/sonatype.credentials"))

publishTo in ThisBuild := {
  version { v: String =>
    val sonatype = "https://oss.sonatype.org/"
    if (v.trim.endsWith("SNAPSHOT"))
      Some("snapshots" at sonatype + "content/repositories/snapshots")
    else
      Some("releases" at sonatype + "service/local/staging/deploy/maven2")
  }
}.value

publishMavenStyle in ThisBuild := true

publishArtifact in Test := false

pomIncludeRepository in ThisBuild := { x =>
  false
}

pomExtra in ThisBuild := (
  <url>http://www.media4u101.se/fobo-lift-template-demo/</url>
  <licenses>
    <license>
      <name>The Apache Software License, Version 2.0</name>
      <url>http://maven.apache.org/ref/2.1.0/maven-profile/license.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:karma4u101/FoBo.git</url>
    <connection>scm:git:git@github.com:karma4u101/FoBo.git</connection>
  </scm>
  <developers>
    <developer>
      <id>karma4u101</id>
      <name>Peter Petersson</name>
      <url>http://www.media4u101.se</url>
    </developer>
  </developers>
)

//##
//##
//##################################################################
