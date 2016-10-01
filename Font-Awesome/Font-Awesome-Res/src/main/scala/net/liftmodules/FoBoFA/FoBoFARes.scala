package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo Font Awesome Resource Module==
  *
  * This resource module provides Font Awesome resource components to the FoBo Font Awesome Toolkit module,
  * but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.FoBo]] for setup information.
  */
package object FoBoFARes {

  override def toString() = FoBoFARes.Resource.toString()

  /**
    * Initiate FoBo's Font Awesome Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoFARes => FoBo}
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
    def Init: Store          = store
    def Init_=(t: Resource): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoFARes.Resource = " + store.toString()

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;6&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.6.3
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFARes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome450
      * }}}
      */
    case object FontAwesome463 extends Resource {
      FoBoResources.init
      FoBoResources.fontAwesome463
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.3.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFARes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome430
      * }}}
      */
    case object FontAwesome430 extends Resource {
      FoBoResources.init
      FoBoResources.fontAwesome430
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.1.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFARes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome410
      * }}}
      */
    case object FontAwesome410 extends Resource {
      FoBoResources.init
      FoBoResources.fontAwesome410
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.0.3
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFARes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome403
      * }}}
      */
    case object FontAwesome403 extends Resource {
      FoBoResources.init
      FoBoResources.fontAwesome403
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.2.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFARes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome321
      * }}}
      */
    case object FontAwesome321 extends Resource {
      FoBoResources.init
      FoBoResources.fontAwesome321
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

    lazy val fontAwesome463 = {
      ResourceServer.rewrite {
        case "fobo" :: "font-awesome.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "4.6.3", "css", "font-awesome.css")
        case "fobo" :: "font-awesome.css" :: Nil =>
          List("fobo", "font-awesome", "4.6.3", "css", "font-awesome.min.css")
      }
    }

    lazy val fontAwesome430 = {
      ResourceServer.rewrite {
        case "fobo" :: "font-awesome.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.css")
        case "fobo" :: "font-awesome.css" :: Nil =>
          List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
      }
    }

    lazy val fontAwesome410 = {
      ResourceServer.rewrite {
        case "fobo" :: "font-awesome.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.css")
        case "fobo" :: "font-awesome.css" :: Nil =>
          List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
      }
    }

    lazy val fontAwesome403 = {
      ResourceServer.rewrite {
        case "fobo" :: "font-awesome.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "4.0.3", "css", "font-awesome.css")
        case "fobo" :: "font-awesome.css" :: Nil =>
          List("fobo", "font-awesome", "4.0.3", "css", "font-awesome.min.css")
      }
    }

    lazy val fontAwesome321 = {
      ResourceServer.rewrite {
        case "fobo" :: "font-awesome.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "3.2.1", "css", "font-awesome.css")
        case "fobo" :: "font-awesome.css" :: Nil =>
          List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
        case "fobo" :: "font-awesome-ie7.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-ie7.css")
        case "fobo" :: "font-awesome-ie7.css" :: Nil =>
          List("fobo",
               "font-awesome",
               "3.2.1",
               "css",
               "font-awesome-ie7-min.css")

      }
    }

  }

}
