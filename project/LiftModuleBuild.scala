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
                            base = file("FoBo/FoBo"),
                            settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile),
                             aggregate = Seq(foboapi,kineticjs,pace,angularjs,jquery,bootstrap,bootstrap3,fontAwesome,prettify)
                                 ).dependsOn(foboapi,kineticjs,pace,angularjs,jquery,bootstrap,bootstrap3,fontAwesome,prettify)  
               
   lazy val foboapi = Project(id   = "fobo-api", 
                             base = file("FoBo/FoBo-API"),
                             settings = defaultSettings ++ myBuildInfoSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))      
                                 
   lazy val fontAwesome = Project(id   = "fobo-font-awesome", 
                             base = file("Font-Awesome/Font-Awesome"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile),
                                 aggregate = Seq(fontAwesomeres)
                                 ).dependsOn(fontAwesomeres)   
                                 
   lazy val fontAwesomeres = Project(id   = "fobo-font-awesome-res", 
                             base = file("Font-Awesome/Font-Awesome-Res"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))  
                                 
                             
  lazy val bootstrap    = Project(id   = "fobo-twitter-bootstrap", 
                             base = file("Bootstrap/Bootstrap2/Twitter-Bootstrap"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile),
                             aggregate = Seq(bootstrapres,bootstrapapi)    
                             ).dependsOn(bootstrapres,bootstrapapi) 
                                 
  lazy val bootstrapres = Project(id   = "fobo-twitter-bootstrap-res", 
                             base = file("Bootstrap/Bootstrap2/Twitter-Bootstrap-Res"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))  
                                 
  lazy val bootstrapapi = Project(id   = "fobo-twitter-bootstrap-api", 
                             base = file("Bootstrap/Bootstrap2/Twitter-Bootstrap-API"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))                                   
                          
  lazy val bootstrap3   = Project(id   = "fobo-twbs-bootstrap3", 
                             base = file("Bootstrap/Bootstrap3/TwBs-Bootstrap3"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile),
                             aggregate = Seq(bootstrap3res,bootstrap3api)    
                             ).dependsOn(bootstrap3res,bootstrap3api) 
                                 
  lazy val bootstrap3res   = Project(id   = "fobo-twbs-bootstrap3-res", 
                             base = file("Bootstrap/Bootstrap3/TwBs-Bootstrap3-Res"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))                                  
                                 
  lazy val bootstrap3api   = Project(id   = "fobo-twbs-bootstrap3-api", 
                             base = file("Bootstrap/Bootstrap3/TwBs-Bootstrap3-API"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))                                             
                                 
                             
  lazy val angularjs    = Project(id   = "fobo-angularjs", 
                             base = file("Angular/AngularJS"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile),
                             aggregate = Seq(angularjsres,angularjsapi)    
                             ).dependsOn(angularjsres,angularjsapi)  
                             
  lazy val angularjsres      = Project(id = "fobo-angularjs-res",
                             base = file("Angular/AngularJS-Res"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))      
                                 
 lazy val angularjsapi      = Project(id = "fobo-angularjs-api",
                             base = file("Angular/AngularJS-API"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))                                       
                             
  lazy val jquery       = Project(id   = "fobo-jquery", 
                             base = file("JQuery/JQuery"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile),
                             aggregate = Seq(jqueryapi,jqueryres) 
                                 ).dependsOn(jqueryapi,jqueryres)   
  
  lazy val jqueryapi       = Project(id   = "fobo-jquery-api", 
                             base = file("JQuery/JQuery-API"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile)) 
                                 
  lazy val jqueryres     = Project(id   = "fobo-jquery-res", 
                             base = file("JQuery/JQuery-Res"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))                                   
                                 
  lazy val pace         = Project(id   = "fobo-pace", 
                             base = file("Pace/Pace"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile),
                             aggregate = Seq(paceres)
                                 ).dependsOn(paceres) 
                                 
  lazy val paceres      = Project(id = "fobo-pace-res",
                             base = file("Pace/Pace-Res"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))  
                                                         
  lazy val prettify     = Project(id   = "fobo-google-code-prettify", 
                             base = file("Google-Code-Prettify/Google-Code-Prettify"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile),
                                 aggregate = Seq(prettifyres)   
                                 ).dependsOn(prettifyres)                                   
                                 
  lazy val prettifyres     = Project(id   = "fobo-google-code-prettify-res", 
                             base = file("Google-Code-Prettify/Google-Code-Prettify-Res"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))                                    
 
  lazy val kineticjs    = Project(id   = "fobo-kineticjs", 
                             base = file("Kinetic/KineticJS"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile),
                              aggregate = Seq(kineticjsres)   
                                 ).dependsOn(kineticjsres)  
                                 
  lazy val kineticjsres = Project(id   = "fobo-kineticjs-res", 
                             base = file("Kinetic/KineticJS-Res"),
                             settings = defaultSettings ++ scaladocSettings ++ Seq(
                                 fullClasspath in doc in Compile <<= fullClasspath in Compile))                                   
                                                                            

  lazy val scaladocDiagramsEnabled = System.getProperty("scaladoc.diagrams", "false").toBoolean
  lazy val scaladocOptions = List() /*List("-implicits")*/ ::: (if (scaladocDiagramsEnabled) List("-diagrams") else Nil)

  
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


