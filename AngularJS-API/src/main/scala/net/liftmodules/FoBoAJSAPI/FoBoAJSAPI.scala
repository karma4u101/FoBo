package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo API sub-module== 
 * This package object provides module initiation in FoBo's most fine grain level. 
 * 
 * This is useful if you want to depend on a small subset of FoBo's functionality 
 * by only pulling in some specific FoBo artifact(s) that provides toolkit resources
 * or FoBo API functions.
 * 
 * This module provides API functions for the Angular module.
 *  
 * For more information on how to set up and use the FoBo modules see the FoBo readme. 
 */
package object FoBoAJSAPI {

  abstract sealed trait API

  object API extends API {
    var Init: API = null       
    
   /**
    * Enable usage of FoBo's Angular API for Angular version 1&#8228;X&#8228;X in your bootstrap liftweb Boot.
    * @version 1.X.X
    *
    *  '''Example:'''
    *
    * {{{
    *   import net.liftmodules.{FoBoAJSAPI => FoBo}
    *    : 
    *   FoBo.API.Init=FoBo.API.Angular1
    * }}}
    *
    */
    case object Angular1 extends API {
      FoBoAngular1API.init
    } 
  
  }
    
  private object FoBoAngular1API {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoAJS")  
    }
  }   

}




