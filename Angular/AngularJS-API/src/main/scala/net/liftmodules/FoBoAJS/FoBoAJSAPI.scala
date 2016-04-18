package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo AngularJS API Module== 
 * 
 * This FoBo API module provides FoBo/Lift API components for the AngularJS Toolkit Module, 
 * but can also be used as-is, see below for setup information.
 *
 * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.FoBo]] for setup information. 
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
      FoBoAPI.init
    } 
  
  }
    
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoAJS")  
    }
  }   

}




