package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

/**
* ==FoBo API sub-module==
*
* This module provides initiation of API functions for the FoBo module.
*
* For more information on how to set up and use the FoBo modules see the FoBo readme.
*/
package object FoBoAPI {
    
  abstract sealed trait API

  object API extends API {
    var Init: API = null
    
    /**
     * Enable usage of FoBo's Angular API for Bootstrap version 3&#8228;X&#8228;X in your bootstrap liftweb Boot.
     * @version 3.X.X
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAPI => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.FoBo1
     * }}}
     *
     */
    case object FoBo1 extends API {
      FoBoAPI.init
    }    
  }
  
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBo")
    }
  }
  
}

