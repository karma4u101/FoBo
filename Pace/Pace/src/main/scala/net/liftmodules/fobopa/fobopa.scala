package net.liftmodules

import _root_.net.liftweb._
import http._

/**
  * ==FoBo Pace Toolkit Module==
  *
  * This FoBo toolkit module provides Pace API and Resource components to the
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.fobo]] for setup information.
  *
  */
package object fobopa {

  override def toString() = {
    fobopa.Toolkit.toString() + " " + fobopa.Resource
      .toString() + " " + fobopa.API.toString()
  }

  /**
    * Initiate FoBo's Pace Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and FoBo/Lift API associated
    * with the toolkit.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobopa => fobo}
    *    :
    *   fobo.Toolkit.init=fobo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Toolkit

  /**
    * Initiate FoBo's Pace Resource(s) in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobopa => fobo}
    *    :
    *   fobo.Resource.init=fobo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Resource

  /**
    * Initiate FoBo's Pace API in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobopa => fobo}
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
    override def toString() = "fobopa.Toolkit = " + store.toString()

    /**
      * Enable usage of FoBo's Pace API and resources version 1&#8228;0&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.0.2
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobopa => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Pace102
      * }}}
      */
    case object Pace102 extends Toolkit {
      fobopaapi.API.Pace0
      fobopa.Resource.Pace102
    }

    /**
      * Enable usage of FoBo's Pace API and resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
      * @version 0.4.15
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobopa => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Pace0415
      * }}}
      */
    @deprecated("Use Pace102 or later", "2.0.0")
    case object Pace0415 extends Toolkit {
      fobopaapi.API.Pace0
      fobopa.Resource.Pace0415
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
    override def toString() = "fobopa.Resource = " + store.toString()

    /**
      * Enable usage of FoBo's Pace resources version 1&#8228;0&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.0.2
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobopa => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.Pace102
      * }}}
      */
    case object Pace102 extends Resource {
      fobopares.Resource.Pace102
    }

    /**
      * Enable usage of FoBo's Pace resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
      * @version 0.4.15
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobopa => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.Pace0415
      * }}}
      */
    @deprecated("Use Pace102 or later", "2.0.0")
    case object Pace0415 extends Resource {
      fobopares.Resource.Pace0415
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
    override def toString() = "fobopa.API = " + store.toString()

    /**
      * Enable usage of FoBo's Pace API version 0&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 0.X.X
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobopa => fobo}
      *    :
      *   fobo.API.init=fobo.API.Pace0
      * }}}
      */
    case object Pace0 extends API {
      fobopaapi.API.Pace0
    }
  }
}
