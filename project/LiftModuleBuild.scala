import sbt._
import sbt.Keys._
import java.lang.String
import Unidoc.{ JavaDoc, javadocSettings, junidocSources, sunidoc, unidocExclude }
import annotation.tailrec
import sbtbuildinfo.Plugin._

object LiftModuleFoBoBuild extends Build {
  
  val liftVersion = SettingKey[String]("liftVersion", "Version number of the Lift Web Framework")
  
  val liftEdition = SettingKey[String]("liftEdition", "Lift Edition (short version number to append to artifact name)")
  
  //https://github.com/sbt/sbt-unidoc sbt 0.13 can simplify the unidoc stuff with a plugin 
  lazy val root = Project(id   = "fobo-meta", 
                             base = file("."),
                             settings = parentSettings ++ Unidoc.settings ++ unidocScaladocSettings ++
                                        inConfig(JavaDoc)(Defaults.configSettings) ++ Seq(
                                            /*unidocExclude := Seq(foboLess.id),*/
                                            sources in JavaDoc <<= junidocSources,
                                            javacOptions in JavaDoc := Seq(),
                                            artifactName in packageDoc in JavaDoc := ((sv, mod, art) => "" + mod.name + "_" + sv.binary + "-" + mod.revision + "-javadoc.jar"),
                                            packageDoc in Compile <<= packageDoc in JavaDoc
                                        
                             ),
                             aggregate = Seq(fobo)
                                 )
                                 
   lazy val fobo        = Project(id = "fobo",
                            base = file("FoBo"),
                            settings = defaultSettings ++ myBuildInfoSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile),
                             aggregate = Seq(kineticjs,pace,angularjs,jquery,bootstrap,bootstrap3,fontAwesome,/*foundation,datatables,knockout,jquerymobile,*/prettify)
                                 ).dependsOn(kineticjs,pace,angularjs,jquery,bootstrap,bootstrap3,fontAwesome,/*foundation,datatables,knockout,jquerymobile,*/prettify)  
                                 
   lazy val fontAwesome = Project(id   = "fobo-font-awesome", 
                             base = file("Font-Awesome"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))  
                             
  lazy val bootstrap    = Project(id   = "fobo-twitter-bootstrap", 
                             base = file("Twitter-Bootstrap"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))  
                          
  lazy val bootstrap3   = Project(id   = "fobo-twbs-bootstrap3", 
                             base = file("TwBs-Bootstrap3"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))                                   
                             
  lazy val foundation   = Project(id   = "fobo-foundation", 
                             base = file("Foundation"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))                                               
                             
  lazy val datatables   = Project(id   = "fobo-datatables", 
                             base = file("DataTables"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))                  
                             
  lazy val knockout     = Project(id   = "fobo-knockout", 
                             base = file("Knockout"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile)) 
                   
  lazy val angularjs    = Project(id   = "fobo-angularjs", 
                             base = file("AngularJS"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))  
                             
  lazy val jquery       = Project(id   = "fobo-jquery", 
                             base = file("JQuery"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))  
  
  lazy val pace         = Project(id   = "fobo-pace", 
                             base = file("Pace"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))  
                                 
                                 
  lazy val jquerymobile = Project(id   = "fobo-jquery-mobile", 
                             base = file("JQuery-Mobile"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))  
                             
  lazy val prettify     = Project(id   = "fobo-google-code-prettify", 
                             base = file("Google-Code-Prettify"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))                               
 
  lazy val kineticjs    = Project(id   = "fobo-kineticjs", 
                             base = file("KineticJS"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))  
                                  
  /*                           
  lazy val foboLess     = Project(id   = "FoBo-Less", 
                             base = file("FoBo-Less"))     
  */                           
                                                   

  lazy val scaladocDiagramsEnabled = System.getProperty("scaladoc.diagrams", "false").toBoolean
  lazy val scaladocOptions = List() /*List("-implicits")*/ ::: (if (scaladocDiagramsEnabled) List("-diagrams") else Nil)

//  lazy val c1:Seq[ProjectReference] = Seq(prettify, pace)
//  lazy val c2:Seq[ProjectReference] = Seq(prettify, pace, jquery)
//  lazy val twoEleven:SettingKey[String] = SettingKey[String]("2.11.0","Special build")
//  lazy val core2: Seq[ProjectReference] = if (scalaVersion.value == twoEleven.value ) c1 else c2  
//  //
//    //scalaVersion { case twoEleven => c1 case _ => c2 }
//    //if (scalaVersion == xx ) c1 else c2 
//    //scalaVersion { case "2.11.0" => c1 case _ => c2 }
  
  lazy val scaladocSettings: Seq[sbt.Setting[_]]= {
    Seq(scalacOptions in (Compile, doc) ++= scaladocOptions) ++
      (if (scaladocDiagramsEnabled)
        Seq(doc in Compile ~= scaladocVerifier)
       else Seq.empty)
  }

  lazy val unidocScaladocSettings: Seq[sbt.Setting[_]]= {
    Seq(scalacOptions in doc ++= scaladocOptions) ++
      (if (scaladocDiagramsEnabled)
        Seq(sunidoc ~= scaladocVerifier)
      else Seq.empty)
  }

  def scaladocVerifier(file: File): File= {
    @tailrec
    def findHTMLFileWithDiagram(dirs: Seq[File]): Boolean = {
      if (dirs.isEmpty) false
      else {
        val curr = dirs.head
        val (newDirs, files) = curr.listFiles.partition(_.isDirectory)
        val rest = dirs.tail ++ newDirs
        val hasDiagram = files exists { f =>
          val name = f.getName
          if (name.endsWith(".html") && !name.startsWith("index-") &&
            !(name.compare("index.html") == 0) && !(name.compare("package.html") == 0)) {
            val source = scala.io.Source.fromFile(f)
            val hd = source.getLines().exists(_.contains("<div class=\"toggleContainer block diagram-container\" id=\"inheritance-diagram-container\">"))
            source.close()
            hd
          }
          else false
        }
        hasDiagram || findHTMLFileWithDiagram(rest)
      }
    }

    // if we have generated scaladoc and none of the files have a diagram then fail
    if (file.exists() && !findHTMLFileWithDiagram(List(file)))
      sys.error("ScalaDoc diagrams not generated!")
    else
      file
  }                             

  lazy val baseSettings = Defaults.defaultSettings 

  lazy val parentSettings = baseSettings ++ Seq(
    publishArtifact in Compile := false
  )
  
  lazy val myBuildInfoSettings = buildInfoSettings ++ Seq(
          sourceGenerators in Compile <+= buildInfo,
          buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
          buildInfoPackage := "net.liftmodules.FoBo.lib"
      )
  
  lazy val defaultSettings = baseSettings ++ Seq(description := "FoBo", parallelExecution in Test := false)  

  
}

object Dependencies {
  object Compile { 
    
    // Compiler plugins
    val genjavadoc = compilerPlugin("com.typesafe.genjavadoc" %% "genjavadoc-plugin" % "0.4" cross CrossVersion.full)  
  }
  import Compile._
}


