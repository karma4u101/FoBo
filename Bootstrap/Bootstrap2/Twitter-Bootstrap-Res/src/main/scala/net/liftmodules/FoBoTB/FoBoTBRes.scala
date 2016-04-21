package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo Twitter Bootstrap Resource Module==
 * 
 * This resource module provides Twitter Bootstrap resource components to the FoBo Twitter Bootstrap Toolkit module, 
 * but can also be used as-is, see below for setup information.
 * 
 * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.FoBo]] for setup information. 
 *
 */
package object FoBoTBRes {

  override def toString() = FoBoTBRes.Resource.toString()
  
  /**
   * Initiate FoBo's Bootstrap 2 Resource(s) in you bootstrap liftweb Boot.
   *
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoTBRes => FoBo}
   *    :
   *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
   * }}}
   * '''Note:''' To see available objects click on the round trait icon in the header of this page.
   */  
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
    override def toString() = "FoBoTBRes.Resource = "+store.toString()
    
    /**
     * Enable usage of FoBo's Bootstrap version 2&#8228;3&#8228;2 resources files in your bootstrap liftweb Boot.
     * @version 2.3.2
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoTBRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap232
     * }}}
     *
     */
    case object Bootstrap232 extends Resource {
      FoBoResources.init
      FoBoResources.bootstrap232
    }

  }

  /**
   * Object holding internally used FoBo resources.
   */
  private object FoBoResources {

    lazy val init: Unit = {
      ResourceServer.allow {
        case "fobo" :: tail => true
      }
    }

    lazy val bootstrap232: Unit = {
      ResourceServer.rewrite {
        case "fobo" :: "bootstrap.css" :: Nil if Props.devMode            => List("fobo", "bootstrap", "2.3.2", "css", "bootstrap.css")
        case "fobo" :: "bootstrap.css" :: Nil                             => List("fobo", "bootstrap", "2.3.2", "css", "bootstrap-min.css")
        case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo", "bootstrap", "2.3.2", "css", "responsive.css")
        case "fobo" :: "bootstrap-responsive.css" :: Nil                  => List("fobo", "bootstrap", "2.3.2", "css", "responsive-min.css")
        case "fobo" :: "bootstrap.js" :: Nil if Props.devMode             => List("fobo", "bootstrap", "2.3.2", "js", "bootstrap.js")
        case "fobo" :: "bootstrap.js" :: Nil                              => List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
      }
    }

  }

}

