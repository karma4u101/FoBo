package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo Bootstrap 4 Resource Module==
  *
  * This resource module provides Bootstrap resource components to the FoBo Bootstrap 4 Toolkit module,
  * but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.FoBo]] for setup information.
  *
  */
package object FoBoBs4Res {

  override def toString() = FoBoBs4Res.Resource.toString()

  /**
    * Initiate FoBo's Bootstrap 4 Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoBs4Res => FoBo}
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
    override def toString() = "FoBoBs4Res.Resource = " + store.toString()

    /**
      * Enable usage of FoBo's Bootstrap version 4&#8228;0&#8228;0 resources files in your bootstrap liftweb Boot.
      * @version 4.0.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoBs4Res => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.Bootstrap400
      * }}}
      * @since v2.0
      */
    case object Bootstrap400 extends Resource {
      FoBoResources.init
      FoBoResources.bootstrap400
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

    lazy val bootstrap400: Unit = {
      ResourceServer.rewrite {
        case "fobo" :: "bootstrap.css" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "4.0.0", "css", "bootstrap.css")
        case "fobo" :: "bootstrap.css" :: Nil =>
          List("fobo", "bootstrap", "4.0.0", "css", "bootstrap.min.css")
        case "fobo" :: "bootstrap.css.map" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "4.0.0", "css", "bootstrap.css.map")
        case "fobo" :: "bootstrap.css.map" :: Nil =>
          List("fobo", "bootstrap", "4.0.0", "css", "bootstrap.min.css.map")
        case "fobo" :: "bootstrap-grid.css" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "4.0.0", "css", "bootstrap-grid.css")
        case "fobo" :: "bootstrap-grid.css" :: Nil =>
          List("fobo", "bootstrap", "4.0.0", "css", "bootstrap-grid.min.css")
        case "fobo" :: "bootstrap-grid.css.map" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "4.0.0", "css", "bootstrap-grid.css.map")
        case "fobo" :: "bootstrap-grid.css.map" :: Nil =>
          List("fobo",
               "bootstrap",
               "4.0.0",
               "css",
               "bootstrap-grid.min.css.map")
        case "fobo" :: "bootstrap-reboot.css" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "4.0.0", "css", "bootstrap-reboot.css")
        case "fobo" :: "bootstrap-reboot.css" :: Nil =>
          List("fobo", "bootstrap", "4.0.0", "css", "bootstrap-reboot.min.css")
        case "fobo" :: "bootstrap-reboot.css.map" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "4.0.0", "css", "bootstrap-reboot.css.map")
        case "fobo" :: "bootstrap-reboot.css.map" :: Nil =>
          List("fobo",
            "bootstrap",
            "4.0.0",
            "css",
            "bootstrap-reboot.min.css.map")
        case "fobo" :: "bootstrap.js" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "4.0.0", "js", "bootstrap.js")
        case "fobo" :: "bootstrap.js" :: Nil =>
          List("fobo", "bootstrap", "4.0.0", "js", "bootstrap.min.js")
      }
    }

  }

}
