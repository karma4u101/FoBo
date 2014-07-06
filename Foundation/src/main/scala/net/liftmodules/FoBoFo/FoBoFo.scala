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
package object FoBoFo {

  def init() {
    LiftRules.addToPackages("net.liftmodules.FoBoFo")
    ResourceServer.allow {
      case "fobo" :: tail => true
    }
  }

  abstract trait FoToolkit

  /**
   *
   */
  object InitParam extends FoToolkit {
    var ToolKit: FoToolkit = null 
  }

  
/**
 * Enable usage of Foundation version 2&sdot;1&sdot;5 in your bootstrap liftweb Boot.
 * @version 2.1.5
 * 
 * '''Example'''
 *  
 * {{{
 *   FoBoFo.InitParam.Toolkit=FoBoFo.Foundation215
 * }}}
 */
case object Foundation215 extends FoToolkit {
  FoFoBoResources.foundation215
}


  /**
   * Object holding internally used FoBo resources.
   */
  private object FoFoBoResources {

  lazy val foundation215: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "foundation.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "css", "foundation.css")
      case "fobo" :: "foundation.css" :: Nil => List("fobo", "foundation", "2.1.5", "css", "foundation-min.css")
      case "fobo" :: "foundation-ie.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "css", "foundation-ie.css")
      case "fobo" :: "foundation-ie.css" :: Nil => List("fobo", "foundation", "2.1.5", "css", "foundation-ie-min.css")

      case "fobo" :: "orbit.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "css", "orbit.css")
      case "fobo" :: "orbit.css" :: Nil => List("fobo", "foundation", "2.1.5", "css", "orbit-min.css")

      /*All in one script*/
      case "fobo" :: "foundation.js" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "js", "foundation.js")
      case "fobo" :: "foundation.js" :: Nil => List("fobo", "foundation", "2.1.5", "js", "foundation.js")

      /*detect touch-enabled devices*/
      case "fobo" :: "modernizr.foundation.js" :: Nil if Props.devMode => List("fobo","foundation", "2.1.5", "js", "modernizr.foundation.js")
      case "fobo" :: "modernizr.foundation.js" :: Nil => List("fobo", "foundation", "2.1.5", "js", "modernizr.foundation.js")
      /*orbit scripts*/
      case "fobo" :: "orbit.js" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "js", "jquery.orbit.js")
      case "fobo" :: "orbit.js" :: Nil => List("fobo", "foundation", "2.1.5", "js", "jquery.orbit.js")
    }
  }    
  

  }
}




