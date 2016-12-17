package net.liftmodules

import net.liftweb._
import http._

/**
  * ==FoBo Font Awesome Toolkit Module==
  *
  * This FoBo toolkit module provides Font Awesome API and Resource components to the
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.FoBo]] for setup information.
  *
  */
package object FoBoFA {

  override def toString() = {
    FoBoFA.Toolkit.toString() + " " + FoBoFA.Resource
      .toString() + " " + FoBoFA.API.toString()
  }

  /**
    * Initiate FoBo's Font Awesome Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and FoBo/Lift API associated
    * with the toolkit.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoFA => FoBo}
    *    :
    *   FoBo.Toolkit.Init=FoBo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Toolkit

  /**
    * Initiate FoBo's Font Awesome Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoFA => FoBo}
    *    :
    *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Resource

  /**
    * Initiate FoBo's Font Awesome API in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoFA => FoBo}
    *    :
    *   FoBo.API.Init=FoBo.API.[API Object]
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
    def Init: Store          = store
    def Init_=(t: Toolkit): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoFA.Toolkit = " + store.toString()

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;6&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.6.3
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFA => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.FontAwesome463
      * }}}
      */
    case object FontAwesome463 extends Toolkit {
      FoBoFARes.Resource.FontAwesome463
      //FoBoFAAPI.API.FontAwesome4
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.3.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFA => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.FontAwesome430
      * }}}
      */
    case object FontAwesome430 extends Toolkit {
      FoBoFARes.Resource.FontAwesome430
      //FoBoFAAPI.API.FontAwesome4
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.1.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFARes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome410
      * }}}
      */
    case object FontAwesome410 extends Toolkit {
      FoBoFARes.Resource.FontAwesome410
      //FoBoFAAPI.API.FontAwesome4
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.0.3
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFARes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome403
      * }}}
      */
    case object FontAwesome403 extends Toolkit {
      FoBoFARes.Resource.FontAwesome403
      //FoBoFAAPI.API.FontAwesome4
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.2.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFARes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome321
      * }}}
      */
    case object FontAwesome321 extends Toolkit {
      FoBoFARes.Resource.FontAwesome321
      //FoBoFAAPI.API.FontAwesome4
    }

  }

  /*=== Resource ============================================*/

  object Resource extends Resource {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Resource]
    private var store: Store = List()
    def Init: Store          = store
    def Init_=(t: Resource): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoFA.Resource = " + store.toString()

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;6&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.6.3
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFA => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome463
      * }}}
      */
    case object FontAwesome463 extends Resource {
      FoBoFARes.Resource.FontAwesome463
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.3.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFA => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome430
      * }}}
      */
    case object FontAwesome430 extends Resource {
      FoBoFARes.Resource.FontAwesome430
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.1.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFA => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome410
      * }}}
      */
    case object FontAwesome410 extends Resource {
      FoBoFARes.Resource.FontAwesome410
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.0.3
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFA => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome403
      * }}}
      */
    case object FontAwesome403 extends Resource {
      FoBoFARes.Resource.FontAwesome403
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.2.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFA => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome321
      * }}}
      */
    case object FontAwesome321 extends Resource {
      FoBoFARes.Resource.FontAwesome321
    }

  }

  /*=== API ============================================*/

  object API extends API {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[API]
    private var store: Store = List()
    def Init: Store          = store
    def Init_=(t: API): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoFA.API = " + store.toString()

    /**
      * Enable usage of FoBo's FontAwesome API version 4&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 4.X.X
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoFA => FoBo}
      *    :
      *   FoBo.API.Init=FoBo.API.FontAwesome4
      * }}}
      */
    case object FontAwesome4 extends API {
      //ToDo get from module fobo-fontawesome-api in FoBoFAAPI
      //FoBoFAAPI.API.FontAwesome4
      FoBoAPI.init
    }

  }

  /**
    * Object for initiating FoBo API packages.
    */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoFA")
    }
  }

}
