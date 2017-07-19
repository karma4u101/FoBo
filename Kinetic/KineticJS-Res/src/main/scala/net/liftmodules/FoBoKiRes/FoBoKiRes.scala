package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo KineticJs Resource Module==
  *
  * This resource module provides JQuery resource components to the FoBo KineticJs Toolkit module,
  * but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.fobo]] for setup information.
  */
package object FoBoKiRes {

  override def toString() = FoBoKiRes.Resource.toString()

  /**
    * Initiate FoBo's KineticJs Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoKiRes => FoBo}
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
    private var store: Store = List()
    def Init: Store = store
    def Init_=(t: Resource): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoKiRes.Resource = " + store.toString()

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
        case "fobo" :: "kinetic.js" :: Nil if Props.devMode =>
          List("fobo", "kinetic", "5.1.0", "js", "kinetic.js")
        case "fobo" :: "kinetic.js" :: Nil =>
          List("fobo", "kinetic", "5.1.0", "js", "kinetic.min.js")
      }
    }

  }

}
