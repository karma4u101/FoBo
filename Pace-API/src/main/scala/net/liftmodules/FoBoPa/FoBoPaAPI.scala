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
 * This module provides initiation of API functions for the Pace module.
 *  
 * For more information on how to set up and use the FoBo modules see the FoBo readme. 
 */
package object FoBoPaAPI {
  
  abstract sealed trait API
  
  object API extends API {
    var Init: API = null
    /**
     * Enable usage of FoBo's Pace API version 0&#8228;X&#8228;X in your bootstrap liftweb Boot.
     * @version 0.X.X
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoPaAPI => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.Pace0
     * }}}
     */    
     case object Pace0 extends API {
       FoBoAPI.init
     }         
  }

  /**
   * Object for initiating FoBo API packages. 
   */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoPa")      
    }
  }
  
}




