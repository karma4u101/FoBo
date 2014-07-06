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
package object FoBoPa {

  def init() {
    LiftRules.addToPackages("net.liftmodules.FoBoPa")
    ResourceServer.allow {
      case "fobo" :: tail => true
    }
  }

  abstract trait PaToolkit

  /**
   *
   */
  object InitParam extends PaToolkit {
    var ToolKit: PaToolkit = null 
  }

  
/**
 * Enable usage of Pace version 0&sdot;4&sdot;15 in your bootstrap liftweb Boot.
 * @version 0.4.15
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoPa.InitParam.Toolkit=FoBoPa.Pace0415
 * }}}
 */
case object Pace0415 extends PaToolkit {
   PaFoBoResources.Pace0415
}



  /**
   * Object holding internally used FoBo resources.
   */
  private object PaFoBoResources {

  lazy val Pace0415: Unit = {
    ResourceServer.rewrite {

      case "fobo" :: "pace.js" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "js", "pace.js")
      case "fobo" :: "pace.js" :: Nil => List("fobo", "pace", "0.4.15", "js", "pace.min.js")             
      
      case "fobo" :: "pace-theme-barber-shop.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-barber-shop.css")
      case "fobo" :: "pace-theme-barber-shop.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-barber-shop-min.css")
 
      case "fobo" :: "pace-theme-big-counter.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-big-counter.css")
      case "fobo" :: "pace-theme-big-counter.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-big-counter-min.css")

      case "fobo" :: "pace-theme-bounce.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-bounce.css")
      case "fobo" :: "pace-theme-bounce.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-bounce-min.css")

      case "fobo" :: "pace-theme-center-circle.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-center-circle.css")
      case "fobo" :: "pace-theme-center-circle.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-center-circle-min.css")

      case "fobo" :: "pace-theme-corner-indicator.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-corner-indicator.css")
      case "fobo" :: "pace-theme-corner-indicator.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-corner-indicator-min.css")

      case "fobo" :: "pace-theme-fill-left.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-fill-left.css")
      case "fobo" :: "pace-theme-fill-left.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-fill-left-min.css")

      case "fobo" :: "pace-theme-flash.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-flash.css")
      case "fobo" :: "pace-theme-flash.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-flash-min.css")

      case "fobo" :: "pace-theme-flash-red.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-flash-red.css")
      case "fobo" :: "pace-theme-flash-red.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-flash-red-min.css")

      case "fobo" :: "pace-theme-flat-top.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-flat-top.css")
      case "fobo" :: "pace-theme-flat-top.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-flat-top-min.css")

      case "fobo" :: "pace-theme-mac-osx.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-mac-osx.css")
      case "fobo" :: "pace-theme-mac-osx.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-mac-osx-min.css")
      
      case "fobo" :: "pace-theme-minimal.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-minimal.css")
      case "fobo" :: "pace-theme-minimal.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-minimal-min.css")

      case "fobo" :: "pace-theme-minimal-red.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-minimal-red.css")
      case "fobo" :: "pace-theme-minimal-red.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-minimal-red-min.css")
           
    }
  }
  

  }
}




