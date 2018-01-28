package net.liftmodules

import _root_.net.liftweb._
import http._

/**
  * ==FoBo Google Code Prettify Toolkit Module==
  *
  * This FoBo toolkit module provides Google Code Prettify API and Resource components to the
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.fobo]] for setup information.
  *
  */
package object fobogcp {

  override def toString() = {
    fobogcp.Toolkit.toString() + " " + fobogcp.Resource
      .toString() + " " + fobogcp.API.toString()
  }

  /**
    * Initiate FoBo's Google Code Prettify Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and FoBo/Lift API associated
    * with the toolkit.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobogcp => fobo}
    *    :
    *   fobo.Toolkit.init=fobo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Toolkit

  /**
    * Initiate FoBo's Google Code Prettify Resource(s) in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobogcp => fobo}
    *    :
    *   fobo.Resource.init=fobo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Resource

  /**
    * Initiate FoBo's Google Code Prettify API in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobogcp => fobo}
    *    :
    *   fobo.API.init=fobo.API.[API Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait API

  /*=== Toolkit ============================================*/

  object Toolkit extends Toolkit {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Toolkit]
    private var store: Store = List()
    def init: Store = store
    def init_=(t: Toolkit): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "fobogcp.Toolkit = " + store.toString()

    /**
      * Enable usage of FoBo's Google Code Prettify API and resources version Jun2011 in your bootstrap liftweb Boot.
      * @version Jun2011
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobogcp => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.PrettifyJun2011
      * }}}
      */
    case object PrettifyJun2011 extends Toolkit {
      fobogcpres.Resource.PrettifyJun2011
      //FoBoPaAPI.API.Prettify1
    }

  }

  /*=== Resource ============================================*/

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
    override def toString() = "fobogcp.Resource = " + store.toString()

    /**
      * Enable usage of FoBo's Google Code Prettify resources version Jun2011 in your bootstrap liftweb Boot.
      * @version Jun2011
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobogcp => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.PrettifyJun2011
      * }}}
      */
    case object PrettifyJun2011 extends Resource {
      fobogcpres.Resource.PrettifyJun2011
    }
  }

  /*=== API ============================================*/

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
    override def toString() = "fobogcp.API = " + store.toString()

    /**
      * Enable usage of FoBo's Google Code Prettify API version 1&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 1.X.X
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobogcp => fobo}
      *    :
      *   fobo.API.init=fobo.API.Prettify1
      * }}}
      */
    case object Prettify1 extends API {
      //ToDo get from module fobo-google-code-prettify-api in FoBoGCPAPI
      //FoBoGCPAPI.API.Prettify1
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
