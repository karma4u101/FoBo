package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo Google Code Prettify API Module==
  *
  * This FoBo API module provides FoBo/Lift API components for the Google Code Prettify Toolkit Module,
  * but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.fobo]] for setup information.
  *
  */
package object fobogcpapi {

  override def toString() = fobogcpapi.API.toString()

  /**
    * Initiate FoBo's Google Code Prettify API in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobogcpapi => fobo}
    *    :
    *   fobo.API.init=fobo.API.[API Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait API

  object API extends API {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[API]
    private var store: Store = List()
    def init: Store = store
    def init_=(t: API): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "fobogcpapi.API = " + store.toString()

    /**
      * Enable usage of FoBo's Google Code Prettify API version 1 in your bootstrap liftweb Boot.
      * @version 1.X.X
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobogcpapi => fobo}
      *    :
      *   fobo.API.init=fobo.API.Prettify1
      * }}}
      */
    case object Prettify1 extends API {
      FoBoAPI.init
    }
  }

  /**
    * Object for initiating FoBo API packages.
    */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.fobogcp")
    }
  }

}
