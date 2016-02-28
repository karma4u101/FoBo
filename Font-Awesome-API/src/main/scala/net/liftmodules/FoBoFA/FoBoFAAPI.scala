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
package object FoBoFAAPI {

  abstract sealed trait API
  
  object API extends API {
    var Init: API = null
    /**
     * Enable usage of FoBo's FontAwesome API version 4&#8228;X&#8228;X in your bootstrap liftweb Boot.
     * @version 4.X.X
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFAAPI => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.FontAwesome4
     * }}}
     */    
     case object FontAwesome4 extends API {
       FoBoAPI.init
     }         
  }
  
  /**
   * Object for initiating FoBo API packages. 
   */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoFA")      
    }
  }  

}




