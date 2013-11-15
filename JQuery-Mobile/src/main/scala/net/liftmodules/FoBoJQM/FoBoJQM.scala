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
package object FoBoJQM {

  def init() {
    LiftRules.addToPackages("net.liftmodules.FoBoJQM")
    ResourceServer.allow {
      case "fobo" :: tail => true
    }
  }

  abstract trait JQMToolkit

  /**
   *
   */
  object InitParam extends JQMToolkit {
    var ToolKit: JQMToolkit = null 
  }

 
/**
 * Enable usage of JQueryMobile version 1_1_0 in your liftweb Boot.
 * 
 * @version 1.0.1
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoJQM.InitParam.Toolkit=FoBoJQM.JQueryMobile110
 * }}}
 */
case object JQueryMobile110 extends JQMToolkit {
  JQMFoBoResources.jquerymobile110
}

  

  /**
   * Object holding internally used FoBo resources.
   */
  private object JQMFoBoResources {

   lazy val jquerymobile110 = {
    ResourceServer.rewrite {
      case "fobo" :: "jquery.mobile.css" :: Nil if Props.devMode => List("fobo", "jquery-mobile", "1.1.0", "css", "jquery.mobile-1.1.0.css")
      case "fobo" :: "jquery.mobile.css" :: Nil => List("fobo", "jquery-mobile", "1.1.0", "css", "jquery.mobile-1.1.0-min.css")

      case "fobo" :: "jquery.mobile.structure.css" :: Nil if Props.devMode => List("fobo", "jquery-mobile", "1.1.0", "css", "jquery.mobile.structure-1.1.0.css")
      case "fobo" :: "jquery.mobile.structure.css" :: Nil => List("fobo", "jquery-mobile", "1.1.0", "css", "jquery.mobile.structure-1.1.0-min.css")
      
      case "fobo" :: "jquery.mobile.theme.css" :: Nil if Props.devMode => List("fobo", "jquery-mobile", "1.1.0", "css", "jquery.mobile.theme-1.1.0.css")
      case "fobo" :: "jquery.mobile.theme.css" :: Nil => List("fobo", "jquery-mobile", "1.1.0", "css", "jquery.mobile.theme-1.1.0-min.css")
      
      case "fobo" :: "jquery.mobile.js" :: Nil if Props.devMode => List("fobo", "jquery-mobile", "1.1.0", "js", "jquery.mobile-1.1.0.js")
      case "fobo" :: "jquery.mobile.js" :: Nil => List("fobo", "jquery-mobile", "1.1.0", "js", "jquery.mobile-1.1.0.js") 
      
      case "fobo" :: "jquery.mobile.themeswitcher.js" :: Nil if Props.devMode => List("fobo", "jquery-mobile", "1.1.0", "js", "jquery.mobile.themeswitcher.js")
      case "fobo" :: "jquery.mobile.themeswitcher.js" :: Nil => List("fobo", "jquery-mobile", "1.1.0", "js", "jquery.mobile.themeswitcher.js") 
    
    }
  }

  }
}




