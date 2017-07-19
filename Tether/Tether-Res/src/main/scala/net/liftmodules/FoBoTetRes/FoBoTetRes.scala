package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo Tether Resource Module==
  *
  * This resource module provides Tether resource components to the FoBo Tether Toolkit module,
  * but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.fobo]] for setup information.
  */
package object FoBoTetRes {

  override def toString() = FoBoTetRes.Resource.toString()

  /**
    * Initiate FoBo's Tether Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoTetRes => FoBo}
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
    override def toString() = "FoBoTetRes.Resource = " + store.toString()

    /**
      * Enable usage of Tether version 1&#8228;4&#8228;0 in your bootstrap liftweb Boot.
      * @version 1.4.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoTetRes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.Tether140
      * }}}
      */
    case object Tether140 extends Resource {
      FoBoResources.init
      FoBoResources.Tether140
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

    lazy val Tether140: Unit = {
      ResourceServer.rewrite {
        case "fobo" :: "tether.js" :: Nil if Props.devMode =>
          List("fobo", "tether", "1.4.0", "js", "tether.js")
        case "fobo" :: "tether.js" :: Nil =>
          List("fobo", "tether", "1.4.0", "js", "tether.min.js")

        case "fobo" :: "tether.css" :: Nil if Props.devMode =>
          List("fobo", "tether", "1.4.0", "css", "tether.css")
        case "fobo" :: "tether.css" :: Nil =>
          List("fobo", "tether", "1.4.0", "css", "tether.min.css")

        case "fobo" :: "tether-theme-arrows.css" :: Nil if Props.devMode =>
          List("fobo", "tether", "1.4.0", "css", "tether-theme-arrows.css")
        case "fobo" :: "tether-theme-arrows.css" :: Nil =>
          List("fobo", "tether", "1.4.0", "css", "tether-theme-arrows.min.css")

        case "fobo" :: "tether-theme-arrows-dark.css" :: Nil if Props.devMode =>
          List("fobo", "tether", "1.4.0", "css", "tether-theme-arrows-dark.css")
        case "fobo" :: "tether-theme-arrows-dark.css" :: Nil =>
          List("fobo",
               "tether",
               "1.4.0",
               "css",
               "tether-theme-arrows-dark.min.css")

        case "fobo" :: "tether-theme-basic.css" :: Nil if Props.devMode =>
          List("fobo", "tether", "1.4.0", "css", "tether-theme-basic.css")
        case "fobo" :: "tether-theme-basic.css" :: Nil =>
          List("fobo", "tether", "1.4.0", "css", "tether-theme-basic.min.css")
      }
    }

  }

}
