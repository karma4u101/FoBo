package net.liftmodules

/**
  * ==FoBo Bootstrap 4 Toolkit Module==
  *
  * This FoBo toolkit module provides Bootstrap v4.x API and Resource components to the
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.fobo]] for setup information.
  *
  *
  * @example To initiate this module for usage in your Lift project set something like the following in
  * your projects Lift bootstrap.liftweb.Boot boot method.
  * {{{
  *    import net.liftmodules.{fobobs4 => fobo}
  *     :
  *     :
  *    fobo.Toolkit.init=fobo.Toolkit.Bootstrap400 //or any other companion toolkit object
  * }}}
  * You may substitute Toolkit for Resource or API and if you wish also adjust the artifact dependencies
  * accordingly to include just the FoBo modules you use.
  */
package object fobobs4 {

  override def toString() = {
    fobobs4.Toolkit.toString() + " " + fobobs4.Resource
      .toString() + " " + fobobs4.API.toString()
  }

  /**
    * Initiate fobo's Bootstrap 4 Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and FoBo/Lift API associated
    * with the toolkit.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{fobobs4 => fobo}
    *    :
    *   fobo.Toolkit.init=fobo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Toolkit

  /**
    * Initiate FoBo's Bootstrap 4 Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{fobobs4 => fobo}
    *    :
    *   fobo.Resource.init=fobo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Resource

  /**
    * Initiate FoBo's Bootstrap 4 API in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{fobobs4 => fobo}
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
    def init: Store          = store
    def init_=(t: Toolkit): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "fobobs4.Toolkit = " + store.toString()

    /**
      * Enable usage of Bootstrap API and resources version 4&#8228;1&#8228;3 resource files in your bootstrap liftweb Boot.
      * @version 4.1.3
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobobs4 => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Bootstrap413
      * }}}
      * @since v2.0.1
      */
    case object Bootstrap413 extends Toolkit {
      net.liftmodules.fobobs4api.API.Bootstrap4
      net.liftmodules.fobobs4res.Resource.Bootstrap413
    }

    /**
      * Enable usage of Bootstrap API and resources version 4&#8228;0&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 4.0.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobobs4 => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Bootstrap400
      * }}}
      * @since v2.0
      */
    case object Bootstrap400 extends Toolkit {
      net.liftmodules.fobobs4api.API.Bootstrap4
      net.liftmodules.fobobs4res.Resource.Bootstrap400
    }

  }

  /*=== Resource ============================================*/

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
    override def toString() = "fobobs4.Resource = " + store.toString()

    /**
      * Enable usage of Bootstrap version 4&#8228;1&#8228;3 resource files in your bootstrap liftweb Boot.
      * @version 4.1.3
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobobs4 => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.Bootstrap413
      * }}}
      * @since v2.0.1
      */
    case object Bootstrap413 extends Resource {
      fobobs4res.Resource.Bootstrap413
    }

    /**
      * Enable usage of Bootstrap version 4&#8228;0&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 4.0.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobobs4 => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.Bootstrap400
      * }}}
      * @since v2.0
      */
    case object Bootstrap400 extends Resource {
      fobobs4res.Resource.Bootstrap400
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
    override def toString() = "fobobs4.API = " + store.toString()

    /**
      * Enable usage of FoBo's Bootstrap API 4&#8228;x&#8228;x in your bootstrap liftweb Boot.
      * @version 4.x.x
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobobs4 => fobo}
      *    :
      *   fobo.API.init=fobo.API.Bootstrap4
      * }}}
      *
      */
    case object Bootstrap4 extends API {
      fobobs4api.API.Bootstrap4
    }

  }

}
