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
/**
 * ==FoBo Resource sub-module== 
 * This package object provides module initiation in FoBo's most fine grain level. 
 * 
 * This is useful if you want to depend on a small subset of FoBo's functionality 
 * by only pulling in some specific FoBo artifact(s) that provides toolkit resources
 * or FoBo API functions.
 * 
 * This module provides toolkit resources for the KineticJs module.
 *  
 * For more information on how to set up and use the FoBo modules see the FoBo readme.
 */
package object FoBoKiRes {

  override def toString() = FoBoKiRes.Resource.toString()
  
  abstract sealed trait Resource

  object Resource extends Resource {
    
    //we don't actually need to store the objects (for now) so lets just save 
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Resource]
    private var store:Store = List()
    def Init:Store = store
    def Init_=(t:Resource):Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }    
    override def toString() = "FoBoKiRes.Resource = "+store.toString()
    
    /**
     * Enable usage of KineticJS version 5&#8228;1&#8228;0 in your bootstrap liftweb Boot.
     * @version 5.1.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoKiRes => FoBo}
     *    : 
     *   FoBo.Resource.Init=FoBo.Resource.KineticJS510
     * }}}
     */
      case object KineticJS510 extends Resource {
        FoBoResources.init
        FoBoResources.KineticJS510
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
  
    lazy val KineticJS510: Unit = {
      ResourceServer.rewrite {
        case "fobo" :: "kinetic.js" :: Nil if Props.devMode => List("fobo", "kinetic", "5.1.0", "js", "kinetic.js")
        case "fobo" :: "kinetic.js" :: Nil => List("fobo", "kinetic", "5.1.0", "js", "kinetic.min.js")                
      }
    }
 
  }
  
}




