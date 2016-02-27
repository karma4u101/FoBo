package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo Resource sub-module== 
 * This package object provides module initiation in FoBo's most fine grain level. 
 * 
 * This is useful if you want to depend on a small subset of FoBo's functionality 
 * by only pulling in some specific FoBo artifact(s) that provides toolkit resources
 * or FoBo API functions.
 * 
 * This module provides toolkit resources for the Pace module.
 *  
 * For more information on how to set up and use the FoBo modules see the FoBo readme.
 */
package object FoBoPaRes {
  
  abstract sealed trait Resource

  object Resource extends Resource {
    var Init: Resource = null 
    /**
     * Enable usage of FoBo's Pace resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
     * @version 0.4.15
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoPaRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Pace0415
     * }}}
     */    
     case object Pace0415 extends Resource {
      //get from module fobo-pace-resources in PaceResources
       FoBoResources.init
       FoBoResources.Pace0415
     }   
    
  } //end Resource object 

  /**
   * Object holding internally used FoBo resources.
   */
  private object FoBoResources {

    lazy val init: Unit = {
      ResourceServer.allow {
        case "fobo" :: tail => true
      }
    }
    
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




