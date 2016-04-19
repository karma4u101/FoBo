package net.liftmodules

import _root_.net.liftweb._
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
  
  //override def toString() = FoBoAPI.API.toString()
    
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
    override def toString() = "FoBoAPI.API = "+store.toString()
    
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

