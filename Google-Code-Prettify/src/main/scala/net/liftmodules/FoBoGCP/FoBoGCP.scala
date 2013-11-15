package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo - Sub-module== 
 * This package object is only of interest to you if you are using this module 
 * as a stand alone artifact dependency in your project (without FoBo).
 * This package object provides information on how to initiate and use this module 
 * in your project. If you are using this module in FoBo see [[net.liftmodules.FoBo]] 
 * for usage information. 
 */
package object FoBoGCP {

  def init() {
    LiftRules.addToPackages("net.liftmodules.FoBoGCP")
    ResourceServer.allow {
      case "fobo" :: tail => true
    }
  }

  abstract trait GCPToolkit

  /**
   *
   */
  object InitParam extends GCPToolkit {
    var ToolKit: GCPToolkit = null 
  }

  
/**
 * Enable usage of Prettify version Jun2011 in your bootstrap liftweb Boot.
 * @version Jun2011
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoGCP.InitParam.Toolkit=FoBoGCP.PrettifyJun2011
 * }}}
 */
case object PrettifyJun2011 extends GCPToolkit {
   GCPFoBoResources.googleCodePrettify
}



  /**
   * Object holding internally used FoBo resources.
   */
  private object GCPFoBoResources {

  lazy val googleCodePrettify: Unit = {
    ResourceServer.rewrite {
      /*Google code prettify*/
      case "fobo" :: "prettify.css" :: Nil if Props.devMode => List("fobo", "google-code", "css", "prettify.css")
      case "fobo" :: "prettify.css" :: Nil => List("fobo", "google-code", "css", "prettify-min.css")
 
      case "fobo" :: "desert.css" :: Nil if Props.devMode => List("fobo", "google-code", "css", "desert.css")
      case "fobo" :: "desert.css" :: Nil => List("fobo", "google-code", "css", "desert-min.css")

      case "fobo" :: "sunburst.css" :: Nil if Props.devMode => List("fobo", "google-code", "css", "sunburst.css")
      case "fobo" :: "sunburst.css" :: Nil => List("fobo", "google-code", "css", "sunburst-min.css")
      
      /*google code prettify*/
      case "fobo" :: "prettify.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "prettify.js")
      case "fobo" :: "prettify.js" :: Nil => List("fobo", "google-code", "js", "prettify.js")
      
      case "fobo" :: "lang-scala.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-scala.js")
      case "fobo" :: "lang-scala.js" :: Nil => List("fobo", "google-code", "js", "lang-scala.js")      
      
      case "fobo" :: "lang-apollo.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-apollo.js")
      case "fobo" :: "lang-apollo.js" :: Nil => List("fobo", "google-code", "js", "lang-apollo.js")            

      case "fobo" :: "lang-clj.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-clj.js")
      case "fobo" :: "lang-clj.js" :: Nil => List("fobo", "google-code", "js", "lang-clj.js")     

      case "fobo" :: "lang-css.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-css.js")
      case "fobo" :: "lang-css.js" :: Nil => List("fobo", "google-code", "js", "lang-css.js")     

      case "fobo" :: "lang-hs.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-hs.js")
      case "fobo" :: "lang-hs.js" :: Nil => List("fobo", "google-code", "js", "lang-hs.js")     

      case "fobo" :: "lang-lisp.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-lisp.js")
      case "fobo" :: "lang-lisp.js" :: Nil => List("fobo", "google-code", "js", "lang-lisp.js")     

      case "fobo" :: "lang-lua.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-lua.js")
      case "fobo" :: "lang-lua.js" :: Nil => List("fobo", "google-code", "js", "lang-lua.js")     

      case "fobo" :: "lang-ml.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-ml.js")
      case "fobo" :: "lang-ml.js" :: Nil => List("fobo", "google-code", "js", "lang-ml.js")     

      case "fobo" :: "lang-n.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-n.js")
      case "fobo" :: "lang-n.js" :: Nil => List("fobo", "google-code", "js", "lang-n.js")     

      case "fobo" :: "lang-proto.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-proto.js")
      case "fobo" :: "lang-proto.js" :: Nil => List("fobo", "google-code", "js", "lang-proto.js")           

      case "fobo" :: "lang-sql.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-sql.js")
      case "fobo" :: "lang-sql.js" :: Nil => List("fobo", "google-code", "js", "lang-sql.js")     

      case "fobo" :: "lang-tex.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-tex.js")
      case "fobo" :: "lang-tex.js" :: Nil => List("fobo", "google-code", "js", "lang-tex.js")     

      case "fobo" :: "lang-vb.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-vb.js")
      case "fobo" :: "lang-vb.js" :: Nil => List("fobo", "google-code", "js", "lang-vb.js")     

      case "fobo" :: "lang-vhdl.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-vhdl.js")
      case "fobo" :: "lang-vhdl.js" :: Nil => List("fobo", "google-code", "js", "lang-vhdl.js")     

      case "fobo" :: "lang-wiki.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-wiki.js")
      case "fobo" :: "lang-wiki.js" :: Nil => List("fobo", "google-code", "js", "lang-wiki.js")     

      case "fobo" :: "lang-xq.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-xq.js")
      case "fobo" :: "lang-xq.js" :: Nil => List("fobo", "google-code", "js", "lang-xq.js")     

      case "fobo" :: "lang-yaml.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-yaml.js")
      case "fobo" :: "lang-yaml.js" :: Nil => List("fobo", "google-code", "js", "lang-yaml.js")             
           
    }
  }
  

  }
}




