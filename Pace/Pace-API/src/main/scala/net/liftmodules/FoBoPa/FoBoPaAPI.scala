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
  
  override def toString() = FoBoPaAPI.API.toString()
  
  abstract sealed trait API
  
  object API extends API {
    
    //we don't actually need to store the objects (for now) so lets just save 
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[API]
    private var store:Store = List()
    def Init:Store = store
    def Init_=(t:API):Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }   
    override def toString() = "FoBoPaAPI.API = "+store.toString()
    
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

  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoPa")      
    }
  }
  
}




