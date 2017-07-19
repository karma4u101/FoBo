package net.liftmodules

import _root_.net.liftweb._
import http._

/**
  * ==FoBo JQuery API Module==
  *
  * This FoBo API module provides FoBo/Lift API components for the JQuery Toolkit Module,
  * but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.fobo]] for setup information.
  *
  */
package object fobojqapi {

  override def toString() = fobojqapi.API.toString()

  /**
    * Initiate FoBo's JQuery API in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{fobojqapi => fobo}
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
    override def toString() = "fobojqapi.API = " + store.toString()

    /**
      * Enable usage of FoBo's JQuery API version 1 in your bootstrap liftweb Boot.
      * @version 1.X.X
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojqapi => fobo}
      *    :
      *   fobo.API.init=fobo.API.JQuery1
      * }}}
      */
    case object JQuery1 extends API {
      FoBoAPI.init
    }

    /**
      * Enable usage of FoBo's JQuery API version 1 in your bootstrap liftweb Boot.
      * @version 2.X.X
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojqapi => fobo}
      *    :
      *   fobo.API.init=fobo.API.JQuery2
      * }}}
      */
    case object JQuery2 extends API {
      FoBoAPI.init
    }

  }

  /**
    * Object for initiating FoBo API packages.
    */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.fobojq")
    }
  }
}
