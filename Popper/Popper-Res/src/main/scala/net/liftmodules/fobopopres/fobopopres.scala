package net.liftmodules

import _root_.net.liftweb._
import util.Props
import http._

/**
  * ==FoBo Popper Resource Module==
  *
  * This resource module provides Popper resource components to the FoBo Popper Toolkit module,
  * but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.fobo]] for setup information.
  */
package object fobopopres {

  override def toString() = fobopopres.Resource.toString()

  /**
    * Initiate fobo's Popper Resource(s) in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobopopres => fobo}
    *    :
    *   fobo.Resource.init=fobo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Resource

  object Resource extends Resource {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Resource]
    private var store: Store = List()
    def init: Store          = store
    def init_=(t: Resource): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "fobopopres.Resource = " + store.toString()

    /**
      * Enable usage of Popper version 1&#8228;12&#8228;9 in your bootstrap liftweb Boot.
      * @version 1.12.9
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobopopres => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.Popper1129
      * }}}
      * @since v2.0
      */
    case object Popper1129 extends Resource {
      FoBoResources.init
      FoBoResources.Popper1129
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

    /*
    Here we use the Universal Module Definition (UMD) module from the dist folder of popper.
    This is done as it is the most versertile module format. If we in the future needs the ESM
    module of the or the dist folders unnambed module type script files we need to fined a way to
    express that level for example by prefixing fobo.Resource.init=fobo.Resource.ESM.Popper199,
    fobo.Resource.init=fobo.Resource.UMD.Popper199.
    https://github.com/umdjs/umd
     */

    lazy val Popper1129: Unit = {
      ResourceServer.rewrite {
        case "fobo" :: "popper.js" :: Nil if Props.devMode =>
          List("fobo", "popper", "1.12.9", "js", "umd", "popper.js")
        case "fobo" :: "popper.js" :: Nil =>
          List("fobo", "popper", "1.12.9", "js", "umd", "popper.min.js")
        case "fobo" :: "popper.js.map" :: Nil if Props.devMode =>
          List("fobo", "popper", "1.12.9", "js", "umd", "popper.js.map")
        case "fobo" :: "popper.js.map" :: Nil =>
          List("fobo", "popper", "1.12.9", "js", "umd", "popper.min.js.map")

        case "fobo" :: "popper-utils.js" :: Nil if Props.devMode =>
          List("fobo", "popper", "1.12.9", "js", "umd", "popper-utils.js")
        case "fobo" :: "popper-utils.js" :: Nil =>
          List("fobo", "popper", "1.12.9", "js", "umd", "popper-utils.min.js")
        case "fobo" :: "popper-utils.js.map" :: Nil if Props.devMode =>
          List("fobo", "popper", "1.12.9", "js", "umd", "popper-utils.js.map")
        case "fobo" :: "popper-utils.js.map" :: Nil =>
          List("fobo",
               "popper",
               "1.12.9",
               "js",
               "umd",
               "popper-utils.min.js.map")
      }
    }

  }

}
