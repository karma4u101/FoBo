package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo Tooltip Resource Module==
  *
  * This resource module provides Tooltip resource components to the FoBo Tooltip Toolkit module,
  * but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.fobo]] for setup information.
  */
package object fobotoores {

  override def toString() = fobotoores.Resource.toString()

  /**
    * Initiate FoBo's Tooltip Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{fobotoores => fobo}
    *    :
    *   fobo.Resource.init=fobo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait Resource

  object Resource extends Resource {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Resource]
    private var store: Store = List()
    def init: Store = store
    def init_=(t: Resource): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "fobotoores.Resource = " + store.toString()

    /**
      * Enable usage of Tooltip version 1&#8228;1&#8228;4 in your bootstrap liftweb Boot.
      * @version 1.1.4
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobotoores => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.Tooltip114
      * }}}
      * @since v2.0
      */
    case object Tooltip114 extends Resource {
      FoBoResources.init
      FoBoResources.Tooltip114
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

    lazy val Tooltip114: Unit = {
      /*
      Here we use the Universal Module Definition (UMD) module from the dist folder of tooltip.
      This is done as it is the most versertile module format. If we in the future needs the ESM
      module of the or the dist folders unnambed module type script files we need to fined a way to
      express that level for example by prefixing fobo.Resource.init=fobo.Resource.ESM.Tooltip114,
      fobo.Resource.init=fobo.Resource.UMD.Tooltip114.
      https://github.com/umdjs/umd
       */
      ResourceServer.rewrite {
        case "fobo" :: "tooltip.js" :: Nil if Props.devMode =>
          List("fobo", "tooltip", "1.1.4", "js", "umd", "tooltip.js")
        case "fobo" :: "tooltip.js" :: Nil =>
          List("fobo", "tooltip", "1.1.4", "js", "umd", "tooltip.min.js")
        case "fobo" :: "tooltip.js.map" :: Nil if Props.devMode =>
          List("fobo", "tooltip", "1.1.4", "js", "umd", "tooltip.js.map")
        case "fobo" :: "tooltip.js.map" :: Nil =>
          List("fobo", "tooltip", "1.1.4", "js", "umd", "tooltip.min.js.map")
      }
    }

  }

}
