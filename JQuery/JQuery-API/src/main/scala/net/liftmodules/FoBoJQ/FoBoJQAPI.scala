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
 * This module provides initiation of API functions for the JQuery module.
 *  
 * For more information on how to set up and use the FoBo modules see the FoBo readme. 
 */ 
package object FoBoJQAPI {

  override def toString() = FoBoJQAPI.API.toString()
  
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
    override def toString() = "FoBoJQAPI.API = "+store.toString()
    
    /**
     * Enable usage of FoBo's JQuery API version 1 in your bootstrap liftweb Boot.
     * @version 1.X.X
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQAPI => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.JQuery1
     * }}}
     */    
     case object JQuery1 extends API {
       FoBoAPI.init
     } 
    
    /**
     * Enable usage of FoBo's JQuery API version 1 in your bootstrap liftweb Boot.
     * @version 2.X.X
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQAPI => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.JQuery2
     * }}}
     */    
     case object JQuery2 extends API {
       FoBoAPI.init
     }     
    
    
  }

  /**
   * Object for initiating FoBo API packages. 
   */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoJQ")      
    }
  }   
}




