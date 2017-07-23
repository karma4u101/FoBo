package net.liftmodules

/**
  * ==FoBo Tooltip Toolkit Module==
  *
  * This FoBo toolkit module provides Tooltip API and Resource components to the
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.fobo]] for setup information.
  *
  */
package object fobotoo {

  override def toString() = {
    fobotoo.Toolkit.toString() + " " + fobotoo.Resource
      .toString() + " " + fobotoo.API.toString()
  }

  /**
    * Initiate FoBo's Tooltip Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and FoBo/Lift API associated
    * with the toolkit.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobotoo => fobo}
    *    :
    *   fobo.Toolkit.init=fobo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Toolkit

  /**
    * Initiate FoBo's Tooltip Resource(s) in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobotoo => fobo}
    *    :
    *   fobo.Resource.init=fobo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Resource

  /**
    * Initiate FoBo's Tooltip API in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobotoo => fobo}
    *    :
    *   fobo.API.init=fobo.API.[API Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait API

  /*===Tooltip Toolkit===============================================================*/

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
    override def toString() = "fobotoo.Toolkit = " + store.toString()

    /**
      * Enable usage FoBo's Tooltip API and resources version 1&#8228;1&#8228;4 in your bootstrap liftweb Boot.
      * @version 1.1.4
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobotoo => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Tooltip114
      * }}}
      * @since v2.0
      */
    case object Tooltip114 extends Toolkit {
      fobotoores.Resource.Tooltip114
    }

  }

  /*===Tooltip Resource===============================================================*/

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
    override def toString() = "fobotoo.Resource = " + store.toString()

    /**
      * Enable usage FoBo's Tooltip resources version 1&#8228;1&#8228;4 in your bootstrap liftweb Boot.
      * @version 1.1.4
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobotoo => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.Tooltip114
      * }}}
      * @since v2.0
      */
    case object Tooltip114 extends Resource {
      fobotoores.Resource.Tooltip114
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
    override def toString() = "fobotoo.API = " + store.toString()

    /**
      * Enable usage of FoBo's Tooltip API version 1&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 1.X.X
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobotoo => fobo}
      *    :
      *   fobo.API.init=fobo.API.Tooltip1
      * }}}
      */
    case object Tooltip1 extends API {
      fobotooapi.API.Tooltip1
    }
  }

}
