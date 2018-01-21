package net.liftmodules

/**
  * ==FoBo Highlight Toolkit Module==
  *
  * This FoBo toolkit module provides Highlight API and Resource components to the
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.fobo]] for setup information.
  *
  */
package object fobohl {

  override def toString() = {
    fobohl.Toolkit.toString() + " " + fobohl.Resource
      .toString() + " " + fobohl.API.toString()
  }

  /**
    * Initiate FoBo's Highlight Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and FoBo/Lift API associated
    * with the toolkit.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobohl => fobo}
    *    :
    *   fobo.Toolkit.init=fobo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Toolkit

  /**
    * Initiate FoBo's Highlight Resource(s) in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobohl => fobo}
    *    :
    *   fobo.Resource.init=fobo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Resource

  /**
    * Initiate FoBo's Highlight API in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobohl => fobo}
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
    override def toString() = "fobohl.Toolkit = " + store.toString()

    /**
      * Enable usage of FoBo's Highlight API and resources version 9&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version 9.3.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobohl => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.HighlightJS930
      * }}}
      */
    case object HighlightJS930 extends Toolkit {
      fobohlres.Resource.HighlightJS930
      fobohlapi.API.HighlightJS9
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
    override def toString() = "fobohl.Resource = " + store.toString()

    /**
      * Enable usage of FoBo's Highlight resources version 9&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version 9.3.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobohl => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.HighlightJS930
      * }}}
      */
    case object HighlightJS930 extends Resource {
      fobohlres.Resource.HighlightJS930
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
    override def toString() = "fobohl.API = " + store.toString()

    /**
      * Enable usage of FoBo's Pace API version 9&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 9.X.X
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobohl => fobo}
      *    :
      *   fobo.API.init=fobo.API.HighlightJS9
      * }}}
      */
    case object HighlightJS9 extends API {
      fobohlapi.API.HighlightJS9
    }
  }

}
