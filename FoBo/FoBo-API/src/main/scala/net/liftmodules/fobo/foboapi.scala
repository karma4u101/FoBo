package net.liftmodules

import _root_.net.liftweb._
import http._

/**
  * ==FoBo / FoBo API Module==
  *
  * This FoBo / FoBo API module provides FoBo/Lift API components for the FoBo Module,
  * but can also be used as-is.
  *
  * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.fobo]] for setup information.
  */
package object foboapi {

  //override def toString() = FoBoAPI.API.toString()

  /**
    * Initiate FoBo's FoBo API in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{foboapi => fobo}
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
    override def toString() = "foboapi.API = " + store.toString()

    /**
      * Enable usage of FoBo's Angular API for Bootstrap version 3&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 3.X.X
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{foboapi => fobo}
      *    :
      *   fobo.API.init=fobo.API.FoBo1
      * }}}
      *
      */
    case object FoBo1 extends API {
      FoBoAPI.init
    }
  }

  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.fobo")
    }
  }

}
