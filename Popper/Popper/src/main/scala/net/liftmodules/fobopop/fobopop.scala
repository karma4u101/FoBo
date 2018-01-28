package net.liftmodules

/**
  * ==FoBo Popper Toolkit Module==
  *
  * This FoBo toolkit module provides Popper API and Resource components to the
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.fobo]] for setup information.
  *
  */
package object fobopop {

  override def toString() = {
    fobopop.Toolkit.toString() + " " + fobopop.Resource
      .toString() + " " + fobopop.API.toString()
  }

  /**
    * Initiate FoBo's Popper Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and FoBo/Lift API associated
    * with the toolkit.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobopop => fobo}
    *    :
    *   fobo.Toolkit.init=fobo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Toolkit

  /**
    * Initiate FoBo's Popper Resource(s) in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobopop => fobo}
    *    :
    *   fobo.Resource.init=fobo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Resource

  /**
    * Initiate FoBo's Popper API in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobopop => fobo}
    *    :
    *   fobo.API.init=fobo.API.[API Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait API

  /*===Popper Toolkit===============================================================*/

  object Toolkit extends Toolkit {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Toolkit]
    private var store: Store = List()
    def init: Store          = store
    def init_=(t: Toolkit): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "fobopop.Toolkit = " + store.toString()

    /**
      * Enable usage FoBo's Popper API and resources version 1&#8228;12&#8228;9 in your bootstrap liftweb Boot.
      * @version 1.12.9
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobopop => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Popper1129
      * }}}
      * @since v2.0
      */
    case object Popper1129 extends Toolkit {
      fobopopapi.API.Popper1
      fobopopres.Resource.Popper1129
    }

  }

  /*===Popper Resource===============================================================*/

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
    override def toString() = "fobopop.Resource = " + store.toString()

    /**
      * Enable usage FoBo's Popper resources version 1&#8228;12&#8228;9 in your bootstrap liftweb Boot.
      * @version 1.12.9
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobopop => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.Popper1129
      * }}}
      * @since v2.0
      */
    case object Popper1129 extends Resource {
      fobopopres.Resource.Popper1129
    }

  }

  /*=== API ============================================*/

  object API extends API {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[API]
    private var store: Store = List()
    def init: Store          = store
    def init_=(t: API): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "fobopop.API = " + store.toString()

    /**
      * Enable usage of FoBo's Popper API version 1&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 1.X.X
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobopop => fobo}
      *    :
      *   fobo.API.init=fobo.API.Popper1
      * }}}
      */
    case object Popper1 extends API {
      fobopopapi.API.Popper1
    }
  }

}
