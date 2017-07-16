package net.liftmodules

/**
  * ==FoBo JQuery Toolkit Module==
  *
  * This FoBo toolkit module provides JQuery API and Resource components to the
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.fobo]] for setup information.
  *
  */
package object fobojq {

  override def toString() = {
    fobojq.Toolkit.toString() + " " + fobojq.Resource
      .toString() + " " + fobojq.API.toString()
  }

  /**
    * Initiate FoBo's JQuery Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and FoBo/Lift API associated
    * with the toolkit.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{fobojq => fobo}
    *    :
    *   fobo.Toolkit.init=fobo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Toolkit

  /**
    * Initiate FoBo's JQuery Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{fobojq => fobo}
    *    :
    *   fobo.Resource.init=fobo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Resource

  /**
    * Initiate FoBo's JQuery API in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{fobojq => fobo}
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
    override def toString() = "fobojq.Toolkit = " + store.toString()

    /**
      * Enable usage of FoBo's JQuery API and resources version 3&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.1.0
      * OBS! JQuery 3.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery310
      * }}}
      * @since v2.10
      */
    case object JQuery310 extends Toolkit {
      fobojqres.Resource.JQuery310
      //fobojqapi.API.JQuery2
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate API and resources version 3&#8228;0&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.0.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQueryMigrate300
      * }}}
      * @since v2.10
      */
    case object JQueryMigrate300 extends Toolkit {
      fobojqres.Resource.JQueryMigrate300
      //fobojqapi.API.JQuery1
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 3&#8228;0&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.0.0
      * OBS! JQuery 3.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery300
      * }}}
      * @since v2.10
      */
    case object JQuery300 extends Toolkit {
      fobojqres.Resource.JQuery300
      //fobojqapi.API.JQuery2
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 2&#8228;2&#8228;4 in your bootstrap liftweb Boot.
      * @version 2.2.4
      * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery224
      * }}}
      * @since v2.10
      */
    case object JQuery224 extends Toolkit {
      fobojqres.Resource.JQuery224
      //fobojqapi.API.JQuery2
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate API and resources version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.4.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQueryMigrate141
      * }}}
      * @since v2.10
      */
    case object JQueryMigrate141 extends Toolkit {
      fobojqres.Resource.JQueryMigrate141
      //fobojqapi.API.JQuery1
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate API and resources version 1&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.2.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQueryMigrate121
      * }}}
      */
    case object JQueryMigrate121 extends Toolkit {
      fobojqres.Resource.JQueryMigrate121
      //fobojqapi.API.JQuery1
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
      * @version 2.1.4
      * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery214
      * }}}
      */
    case object JQuery214 extends Toolkit {
      fobojqres.Resource.JQuery214
      //fobojqapi.API.JQuery2
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 2&#8228;1&#8228;1 in your bootstrap liftweb Boot.
      * @version 2.1.1
      * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery211
      * }}}
      */
    case object JQuery211 extends Toolkit {
      fobojqres.Resource.JQuery211
      //fobojqapi.API.JQuery2
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
      * @version 1.11.3
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery1113
      * }}}
      */
    case object JQuery1113 extends Toolkit {
      fobojqres.Resource.JQuery1113
      //fobojqapi.API.JQuery2
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;10&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.10.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery1102
      * }}}
      */
    case object JQuery1102 extends Toolkit {
      fobojqres.Resource.JQuery1102
      //fobojqapi.API.JQuery2
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.9.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery191
      * }}}
      */
    case object JQuery191 extends Toolkit {
      fobojqres.Resource.JQuery191
      //fobojqapi.API.JQuery2
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.8.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery182
      * }}}
      */
    case object JQuery182 extends Toolkit {
      fobojqres.Resource.JQuery182
      //fobojqapi.API.JQuery2
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.7.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery172
      * }}}
      */
    case object JQuery172 extends Toolkit {
      fobojqres.Resource.JQuery172
      //fobojqapi.API.JQuery2
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
    override def toString() = "fobojq.Resource = " + store.toString()

    /**
      * Enable usage of FoBo's JQuery resources version 3&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.1.0
      * OBS! JQuery 3.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery310
      * }}}
      */
    case object JQuery310 extends Resource {
      fobojqres.Resource.JQuery310
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate resources version 3&#8228;0&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.0.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.JQueryMigrate300
      * }}}
      */
    case object JQueryMigrate300 extends Resource {
      fobojqres.Resource.JQueryMigrate300
    }

    /**
      * Enable usage of FoBo's JQuery resources version 3&#8228;0&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.0.0
      * OBS! JQuery 3.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery300
      * }}}
      */
    case object JQuery300 extends Resource {
      fobojqres.Resource.JQuery300
    }

    /**
      * Enable usage of FoBo's JQuery resources version 2&#8228;2&#8228;4 in your bootstrap liftweb Boot.
      * @version 2.2.4
      * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery224
      * }}}
      */
    case object JQuery224 extends Resource {
      fobojqres.Resource.JQuery224
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate resources version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.4.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.JQueryMigrate141
      * }}}
      */
    case object JQueryMigrate141 extends Resource {
      fobojqres.Resource.JQueryMigrate141
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate resources version 1&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.2.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.JQueryMigrate121
      * }}}
      */
    case object JQueryMigrate121 extends Resource {
      fobojqres.Resource.JQueryMigrate121
    }

    /**
      * Enable usage of FoBo's JQuery resources version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
      * @version 2.1.4
      * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery214
      * }}}
      */
    case object JQuery214 extends Resource {
      fobojqres.Resource.JQuery214
    }

    /**
      * Enable usage of FoBo's JQuery resources version 2&#8228;1&#8228;1 in your bootstrap liftweb Boot.
      * @version 2.1.1
      * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery211
      * }}}
      */
    case object JQuery211 extends Resource {
      fobojqres.Resource.JQuery211
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
      * @version 1.11.3
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery1113
      * }}}
      */
    case object JQuery1113 extends Resource {
      fobojqres.Resource.JQuery1113
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;10&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.10.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery1102
      * }}}
      */
    case object JQuery1102 extends Resource {
      fobojqres.Resource.JQuery1102
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.9.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery191
      * }}}
      */
    case object JQuery191 extends Resource {
      fobojqres.Resource.JQuery191
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.8.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery182
      * }}}
      */
    case object JQuery182 extends Resource {
      fobojqres.Resource.JQuery182
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.7.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery172
      * }}}
      */
    case object JQuery172 extends Resource {
      fobojqres.Resource.JQuery172
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
    override def toString() = "fobojq.API = " + store.toString()

    /**
      * Enable usage of FoBo's JQuery API version 1&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 1.X.X
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.API.init=fobo.API.JQuery1
      * }}}
      */
    case object JQuery1 extends API {
      fobojqapi.API.JQuery1
      //FoBoAPI.init
    }

    /**
      * Enable usage of FoBo's JQuery API version 2&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 2.X.X
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobojq => fobo}
      *    :
      *   fobo.API.init=fobo.API.JQuery2
      * }}}
      */
    case object JQuery2 extends API {
      fobojqapi.API.JQuery2
      //FoBoAPI.init
    }

  }

}
