package net.liftmodules

import net.liftweb._
import http._

/**
  * ==FoBo Font Awesome Toolkit Module==
  *
  * This FoBo toolkit module provides Font Awesome API and Resource components to the
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.fobo]] for setup information.
  *
  */
package object fobofa {

  override def toString() = {
    fobofa.Toolkit.toString() + " " + fobofa.Resource
      .toString() + " " + fobofa.API.toString()
  }

  /**
    * Initiate FoBo's Font Awesome Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and FoBo/Lift API associated
    * with the toolkit.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobofa => fobo}
    *    :
    *   fobo.Toolkit.init=fobo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Toolkit

  /**
    * Initiate FoBo's Font Awesome Resource(s) in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobofa => fobo}
    *    :
    *   fobo.Resource.init=fobo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Resource

  /**
    * Initiate FoBo's Font Awesome API in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobofa => fobo}
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
    override def toString() = "fobofa.Toolkit = " + store.toString()

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 5&#8228;5&#8228;0 in your bootstrap liftweb Boot.
      * @version 5.5.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobofa => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.FontAwesome550
      * }}}
      */
    case object FontAwesome550 extends Toolkit {
      fobofares.Resource.FontAwesome550
      fobofaapi.API.FontAwesome5
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;7&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.7.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobofa => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.FontAwesome470
      * }}}
      */
    case object FontAwesome470 extends Toolkit {
      fobofares.Resource.FontAwesome470
      fobofaapi.API.FontAwesome4
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;6&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.6.3
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofa => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.FontAwesome463
      * }}}
      */
    case object FontAwesome463 extends Toolkit {
      fobofares.Resource.FontAwesome463
      fobofaapi.API.FontAwesome4
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.3.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofa => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.FontAwesome430
      * }}}
      */
    case object FontAwesome430 extends Toolkit {
      fobofares.Resource.FontAwesome430
      fobofaapi.API.FontAwesome4
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.1.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofares => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome410
      * }}}
      */
    @deprecated("Use FontAwesome463 or later", "2.0.0")
    case object FontAwesome410 extends Toolkit {
      fobofares.Resource.FontAwesome410
      fobofaapi.API.FontAwesome4
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.0.3
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofares => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome403
      * }}}
      */
    @deprecated("Use FontAwesome463 or later", "2.0.0")
    case object FontAwesome403 extends Toolkit {
      fobofares.Resource.FontAwesome403
      fobofaapi.API.FontAwesome4
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.2.1
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofares => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome321
      * }}}
      */
    case object FontAwesome321 extends Toolkit {
      fobofares.Resource.FontAwesome321
      fobofaapi.API.FontAwesome4
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
    override def toString() = "fobofa.Resource = " + store.toString()

    /**
      * Enable usage of FoBo's FontAwesome resources version 5&#8228;5&#8228;0 in your bootstrap liftweb Boot.
      * @version 5.5.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobofa => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome550
      * }}}
      */
    case object FontAwesome550 extends Resource {
      fobofares.Resource.FontAwesome550
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;7&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.7.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobofa => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome470
      * }}}
      */
    case object FontAwesome470 extends Resource {
      fobofares.Resource.FontAwesome470
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;6&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.6.3
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofa => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome463
      * }}}
      */
    case object FontAwesome463 extends Resource {
      fobofares.Resource.FontAwesome463
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.3.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofa => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome430
      * }}}
      */
    case object FontAwesome430 extends Resource {
      fobofares.Resource.FontAwesome430
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.1.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofa => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome410
      * }}}
      */
    case object FontAwesome410 extends Resource {
      fobofares.Resource.FontAwesome410
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.0.3
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofa => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome403
      * }}}
      */
    case object FontAwesome403 extends Resource {
      fobofares.Resource.FontAwesome403
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.2.1
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofa => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome321
      * }}}
      */
    case object FontAwesome321 extends Resource {
      fobofares.Resource.FontAwesome321
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
    override def toString() = "fobofa.API = " + store.toString()

    /**
      * Enable usage of FoBo's FontAwesome API version 4&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 4.X.X
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofa => fobo}
      *    :
      *   fobo.API.init=fobo.API.FontAwesome4
      * }}}
      */
    case object FontAwesome4 extends API {
      fobofaapi.API.FontAwesome4
    }

    /**
      * Enable usage of FoBo's FontAwesome API version 5&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 5.X.X
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofa => fobo}
      *    :
      *   fobo.API.init=fobo.API.FontAwesome5
      * }}}
      */
    case object FontAwesome5 extends API {
      fobofaapi.API.FontAwesome5
    }
  }
}
