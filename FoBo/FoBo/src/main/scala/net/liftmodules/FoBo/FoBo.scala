package net.liftmodules

/**
  * ==Welcome to FoBo - A Modular Front-End Toolkit module for Lift==
  *
  * The [[net.liftmodules.FoBo]] Package is the starting point for this API.
  * The FoBo modules Github home is [[https://github.com/karma4u101/FoBo here]]
  *
  *===What FoBo will do for you===
  *
  * The FoBo/FoBo module gives you quick and easy integration of some of the industry leading web-centric open source
  * front-end toolkits. FoBo is highly modular, all FoBo toolkit modules are built up of a resource module and possibly
  * a FoBo/Lift API module.
  * You can depend on the FoBo/FoBo module to get access to all FoBo's toolkit/resource/api modules or you can pick the
  * module(s) you need, for example, just the bootstrap API module where you provide your own resources or you may chose
  * any combination of modules.
  *
  * Usage benefits:
  *  - Due to uniform declaration and integration points across toolkit versions only a small amount of changes
  *    is needed for a up/down-grading of a used Toolkit/resource, optimally, if the toolkit has no breaking changes
  *    it will just be a version change of the FoBo.Initparam in Lift bootstrap.liftweb.Boot.
  *  - The module provides debug-able js and css files in development and minimized files otherwise.
  *  - FoBo is simultaneously supporting several versions of each toolkit which makes development, maintenance,
  *    upgrade and fall-back quick and easy.
  *  - Most of the FoBo toolkit modules provides a API sub-module with Snippet helpers and lib classes that will
  *    ease you from writing some commonly used toolkit component integration scripts making it a simple snippet invocation.
  *  - Great responsive scalability with responsive toolkits.
  *  - FoBo strives to be highly modular. FoBo is built up by independent toolkit/resource/api module artifacts that
  *    can be used independent of the FoBo/FoBo assembly module.
  *
  *
  * ===FoBo supported toolkits/resources===
  *
  * The following is a list of available toolkits resources
  *
  *  - JQuery [v1.7.2, v1.8.2, v1.9.1, v1.10.2, v1.11.3, v.2.1.1, v.2.1.4, v2.2.4, v3.0.0, v3.1.0] [[net.liftmodules.FoBoJQ]]
  *  - JQueryMigrate [v1.2.1, v1.4.1, v3.0.0] [[net.liftmodules.FoBoJQ]]
  *  - Bootstrap v3.x series [v3.0.1, v3.1.1, v3.2.0, v3.3.5, v3.3.6, v3.3.7] [[net.liftmodules.FoBoBs]]
  *  - Bootstrap v2.x series [v2.3.2] [[net.liftmodules.FoBoTB]]
  *  - Font Awesome [v3.2.1, v4.0.3, v4.1.0, v4.3.0, v4.5.0] [[net.liftmodules.FoBoFA]]
  *  - Kinetic JS [v5.1.0] [[net.liftmodules.FoBoKi]]
  *  - Google Code Prettify [vJun2011] [[net.liftmodules.FoBoGCP]]
  *  - Highlight JS [v9.3.0] [[net.liftmodules.FoBoHL]]
  *  - Pace [v0.4.15, v1.0.2] [[net.liftmodules.FoBoPa]]
  *  - Angular JS [v1.0.6, v1.2.11, v1.2.19, v1.3.15, v1.4.1, v1.4.8, v1.5.3] (angular core modules) [[net.liftmodules.FoBoAJS]]
  *  - Angular UI Bootstrap [v0.2.0, v0.7.0, v0.10.0] (angular component) [[net.liftmodules.FoBoAJS]]
  *  - Angular NG-Grid [v2.0.4, v2.0.7] (angular component) [[net.liftmodules.FoBoAJS]]
  *  - Angular UI-Grid [v3.0.7] (angular component) [[net.liftmodules.FoBoAJS]]
  *  - Angular Material design [v0.10.0, v1.0.1, v1.0.8, v1.1.1] (angular component) [[net.liftmodules.FoBoAJS]]
  *
  *
  * ===Help out!===
  *
  * There is a lot more that can be done within the boundaries of the FoBo API modules and the FoBo modules as a hole so
  * your help, suggestions, encouragement, engagement, patches (pull requests) bug-fixes/reports are highly appreciated.
  *
  * ===Setup===
  *
  *  - This module has published artifacts for Lift v2.6 and v3.0 and it's supported Scala versions.
  *    Older versions of FoBo also supports Lift v2.4/v2.5
  *  - For a introduction to FoBo see [[http://www.media4u101.se/fobo-lift-template-demo/ FoBo introduction]]
  *
  * @example To initiate this module for usage in your Lift project set something like the following in
  * your projects Lift bootstrap.liftweb.Boot boot method. Here the FoBo ToolkitObjectNameXYZ
  * represent one of FoBo's available FoBo Toolkit objects.
  * {{{
  *    import net.liftmodules.FoBo
  *     :
  *     :
  *    FoBo.Toolkit.Init=FoBo.Toolkit.JQueryXYZ  //the fobo jquery module, version xyz
  *    FoBo.Toolkit.Init=FoBo.Toolkit.ToolkitObjectNameXYZ //one or more fobo toolkits
  *    FoBo.Toolkit.Init=FoBo.Toolkit.ToolkitObjectNameXYZ
  * }}}
  *
  * You may substitute Toolkit for Resource or API and if you wish also adjust the artifact dependencies
  * accordingly to include just the FoBo modules you use, but if size is not a issue using the FoBo/FoBo
  * module is convenient and gives you a lot to pick from.
  *
  * @version v2.0-SNAPSHOT
  * @author Peter Petersson (Github karma4u101) and the Lift community
  *
  */
package object FoBo {

  override def toString() = {
    FoBo.Toolkit.toString() + " " + FoBo.Resource.toString() + " " + FoBo.API
      .toString()
  }

  /**
    * Initiate FoBo's Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and if present the FoBo API associated
    * with the toolkit.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.FoBo
    *    :
    *   FoBo.Toolkit.Init=FoBo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Toolkit

  /**
    * Initiate the toolkit's associated resources in you bootstrap liftweb Boot.
    * You should use this if you only want to initiate the FoBo provided toolkit
    * resources but not the FoBo API associated with the toolkit.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.FoBo
    *    :
    *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Resource

  /**
    * Initiate a toolkit's associated FoBo API in you bootstrap liftweb Boot.
    * You should use this if you want to use FoBo's API for the toolkit but
    * want to provide the toolkit resources yourself.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.FoBo
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
    override def toString() = "FoBo.Toolkit = " + store.toString()

    /*===Angular Toolkit===============================================================*/

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;5&#8228;3 in your bootstrap liftweb Boot.
      * @version 1.5.3
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS153
      * }}}
      * @since v1.6
      */
    case object AngularJS153 extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AngularJS153
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.5.3 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS153i18n
      * }}}
      *
      */
    case object AngularJS153i18n extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AngularJS153i18n
    }

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;4&#8228;8 in your bootstrap liftweb Boot.
      * @version 1.4.8
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS148
      * }}}
      *
      */
    case object AngularJS148 extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AngularJS148
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.4.8 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS148i18n
      * }}}
      *
      */
    case object AngularJS148i18n extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AngularJS148i18n
    }

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.4.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS148
      * }}}
      *
      */
    case object AngularJS141 extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AngularJS141
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.4.1 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS141i18n
      * }}}
      *
      */
    case object AngularJS141i18n extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AngularJS141i18n
    }

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;3&#8228;15 in your bootstrap liftweb Boot.
      * @version 1.3.15
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS1315
      * }}}
      *
      */
    case object AngularJS1315 extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AngularJS1315
    }

    /**
      * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
      * @version 1.3.15 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS1315i18n
      * }}}
      *
      */
    case object AngularJS1315i18n extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AngularJS1315i18n
    }

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;2&#8228;19 in your bootstrap liftweb Boot.
      * @version 1.2.19
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS1219
      * }}}
      *
      */
    case object AngularJS1219 extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AngularJS1219
    }

    /**
      * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
      * @version 1.2.19 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS1219i18n
      * }}}
      *
      */
    case object AngularJS1219i18n extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AngularJS1219i18n
    }

    /**
      * Enable usage of FoBo's Angular Material API and resources version 1&#8228;0&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.0.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJMaterial101
      * }}}
      *
      */
    @deprecated("Use AJMaterial108 or later", "1.6.0")
    case object AJMaterial101 extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AJMaterial101
    }

    /**
      * Enable usage of FoBo's Angular Material API and resources version 1&#8228;0&#8228;8 in your bootstrap liftweb Boot.
      * @version 1.0.8
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJMaterial108
      * }}}
      *
      */
    @deprecated("Use AJMaterial111 or later", "2.0.0")
    case object AJMaterial108 extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AJMaterial108
    }

    /**
      * Enable usage of FoBo's Angular Material API and resources version 1&#8228;1&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.1.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJMaterial111
      * }}}
      *
      * @since v1.7
      */
    case object AJMaterial111 extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AJMaterial111
    }

    /**
      * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 2&#8228;4&#8228;0 in your bootstrap liftweb Boot.
      * @version 2.4.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJSUIBootstrap240
      * }}}
      *
      */
    case object AJSUIBootstrap240 extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AJSUIBootstrap240
    }

    /**
      * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;10&#8228;0 in your bootstrap liftweb Boot.
      * @version 0.10.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJSUIBootstrap0100
      * }}}
      *
      */
    case object AJSUIBootstrap0100 extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AJSUIBootstrap0100
    }

    /**
      * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;7&#8228;0 in your bootstrap liftweb Boot.
      * @version 0.7.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJSUIBootstrap070
      * }}}
      *
      */
    @deprecated("Use AJSUIBootstrap0100 or later", "2.0.0")
    case object AJSUIBootstrap070 extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AJSUIBootstrap070
    }

    /**
      * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;2&#8228;0 in your bootstrap liftweb Boot.
      * @version 0.2.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJSUIBootstrap020
      * }}}
      *
      */
    @deprecated("Use AJSUIBootstrap0100 or later", "2.0.0")
    case object AJSUIBootstrap020 extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AJSUIBootstrap020
    }

    /**
      * Enable usage of FoBo's Angular API and NG-Grid resources version 2&#8228;0&#8228;7 in your bootstrap liftweb Boot.
      * @version 2.0.7
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJSNGGrid207
      * }}}
      *
      */
    case object AJSNGGrid207 extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AJSNGGrid207
    }

    /**
      * Enable usage of FoBo's Angular API and UI-Grid resources version 3&#8228;0&#8228;7 in your bootstrap liftweb Boot.
      * @version 3.0.7
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJSUIGrid307
      * }}}
      *
      */
    case object AJSUIGrid307 extends Toolkit {
      net.liftmodules.FoBoAJS.Toolkit.AJSUIGrid307
    }

    /*===Font Awesome Toolkit===============================================================*/

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;6&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.6.3
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.FontAwesome463
      * }}}
      */
    case object FontAwesome463 extends Toolkit {
      net.liftmodules.FoBoFA.Toolkit.FontAwesome463
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.3.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.FontAwesome430
      * }}}
      */
    case object FontAwesome430 extends Toolkit {
      net.liftmodules.FoBoFA.Toolkit.FontAwesome430
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.1.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.FontAwesome410
      * }}}
      */
    case object FontAwesome410 extends Toolkit {
      net.liftmodules.FoBoFA.Toolkit.FontAwesome410
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.0.3
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.FontAwesome403
      * }}}
      */
    case object FontAwesome403 extends Toolkit {
      net.liftmodules.FoBoFA.Toolkit.FontAwesome403
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.2.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.FontAwesome321
      * }}}
      */
    case object FontAwesome321 extends Toolkit {
      net.liftmodules.FoBoFA.Toolkit.FontAwesome321
    }

    /*===Google Code Prettify Toolkit===============================================================*/

    /**
      * Enable usage of FoBo's Google Code Prettify API and resources version Jun2011 in your bootstrap liftweb Boot.
      * @version Jun2011
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.PrettifyJun2011
      * }}}
      */
    case object PrettifyJun2011 extends Toolkit {
      net.liftmodules.FoBoGCP.Toolkit.PrettifyJun2011
    }

    /*===JQuery Toolkit===============================================================*/

    /**
      * Enable usage of FoBo's JQuery API and resources version 3&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.1.0
      * OBS! JQuery 3.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.JQuery310
      * }}}
      * @since v2.10
      */
    case object JQuery310 extends Toolkit {
      net.liftmodules.FoBoJQ.Toolkit.JQuery310
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate API and resources version 3&#8228;0&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.0.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.JQueryMigrate300
      * }}}
      * @since v2.10
      */
    case object JQueryMigrate300 extends Toolkit {
      net.liftmodules.FoBoJQ.Toolkit.JQueryMigrate300
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 3&#8228;0&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.0.0
      * OBS! JQuery 3.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.JQuery300
      * }}}
      * @since v2.10
      */
    case object JQuery300 extends Toolkit {
      net.liftmodules.FoBoJQ.Toolkit.JQuery300
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 2&#8228;2&#8228;4 in your bootstrap liftweb Boot.
      * @version 2.2.4
      * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.JQuery224
      * }}}
      * @since v2.10
      */
    case object JQuery224 extends Toolkit {
      net.liftmodules.FoBoJQ.Toolkit.JQuery224
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate API and resources version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.4.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.JQueryMigrate141
      * }}}
      * @since v2.10
      */
    case object JQueryMigrate141 extends Toolkit {
      net.liftmodules.FoBoJQ.Toolkit.JQueryMigrate141
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate API and resources version 1&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.2.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.JQueryMigrate121
      * }}}
      */
    case object JQueryMigrate121 extends Toolkit {
      net.liftmodules.FoBoJQ.Toolkit.JQueryMigrate121
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
      * @version 2.1.4
      * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.JQuery214
      * }}}
      */
    case object JQuery214 extends Toolkit {
      net.liftmodules.FoBoJQ.Toolkit.JQuery214
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 2&#8228;1&#8228;1 in your bootstrap liftweb Boot.
      * @version 2.1.1
      * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.JQuery211
      * }}}
      */
    case object JQuery211 extends Toolkit {
      net.liftmodules.FoBoJQ.Toolkit.JQuery211
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
      * @version 1.11.3
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.JQuery1113
      * }}}
      */
    case object JQuery1113 extends Toolkit {
      net.liftmodules.FoBoJQ.Toolkit.JQuery1113
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;10&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.10.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.JQuery1102
      * }}}
      */
    case object JQuery1102 extends Toolkit {
      net.liftmodules.FoBoJQ.Toolkit.JQuery1102
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.9.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.JQuery191
      * }}}
      */
    case object JQuery191 extends Toolkit {
      net.liftmodules.FoBoJQ.Toolkit.JQuery191
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.8.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.JQuery182
      * }}}
      */
    case object JQuery182 extends Toolkit {
      net.liftmodules.FoBoJQ.Toolkit.JQuery182
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.7.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.JQuery172
      * }}}
      */
    case object JQuery172 extends Toolkit {
      net.liftmodules.FoBoJQ.Toolkit.JQuery172
    }

    /*===Kinetic Toolkit===============================================================*/

    /**
      * Enable usage FoBo's KineticJS API and resources version 5&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 5.1.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.KineticJS510
      * }}}
      *
      */
    case object KineticJS510 extends Toolkit {
      net.liftmodules.FoBoKi.Toolkit.KineticJS510
    }

    /*===Pace Toolkit===============================================================*/

    /**
      * Enable usage of FoBo's Pace API and resources version 1&#8228;0&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.0.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.Pace102
      * }}}
      */
    case object Pace102 extends Toolkit {
      net.liftmodules.FoBoPa.Toolkit.Pace102
    }

    /**
      * Enable usage of FoBo's Pace API and resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
      * @version 0.4.15
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.Pace0415
      * }}}
      */
    case object Pace0415 extends Toolkit {
      net.liftmodules.FoBoPa.Toolkit.Pace0415
    }

    /*===Bootstrap3 Toolkit===============================================================*/

    /**
      * Enable usage of Bootstrap API and resources version 3&#8228;3&#8228;7 in your bootstrap liftweb Boot.
      * @version 3.3.7
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.Bootstrap337
      * }}}
      * @since v1.7
      */
    case object Bootstrap337 extends Toolkit {
      net.liftmodules.FoBoBs.Toolkit.Bootstrap337
    }

    /**
      * Enable usage of Bootstrap API and resources version 3&#8228;3&#8228;6 in your bootstrap liftweb Boot.
      * @version 3.3.6
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.Bootstrap336
      * }}}
      * @since v1.5
      */
    @deprecated("Use Bootstrap337 or later", "1.7.0")
    case object Bootstrap336 extends Toolkit {
      net.liftmodules.FoBoBs.Toolkit.Bootstrap336
    }

    /**
      * Enable usage of Bootstrap API and resources version 3&#8228;3&#8228;5 in your bootstrap liftweb Boot.
      * @version 3.3.5
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.Bootstrap335
      * }}}
      *
      */
    @deprecated("Use Bootstrap337 or later", "1.7.0")
    case object Bootstrap335 extends Toolkit {
      net.liftmodules.FoBoBs.Toolkit.Bootstrap335
    }

    /**
      * Enable usage of Bootstrap API and resources version 3&#8228;2&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.2.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.Bootstrap320
      * }}}
      *
      */
    case object Bootstrap320 extends Toolkit {
      net.liftmodules.FoBoBs.Toolkit.Bootstrap320
    }

    /**
      * Enable usage of Bootstrap API and resources version 3&#8228;1&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.1.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.Bootstrap311
      * }}}
      *
      */
    case object Bootstrap311 extends Toolkit {
      net.liftmodules.FoBoBs.Toolkit.Bootstrap311
    }

    /**
      * Enable usage of Bootstrap API and resources version 3&#8228;0&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.0.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.Bootstrap301
      * }}}
      *
      */
    case object Bootstrap301 extends Toolkit {
      net.liftmodules.FoBoBs.Toolkit.Bootstrap301
    }

    /*===Bootstrap2 Toolkit===============================================================*/

    /**
      * Enable usage of Bootstrap API and resources version 2&#8228;3&#8228;2 in your bootstrap liftweb Boot.
      * @version 2.3.2
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.Bootstrap232
      * }}}
      *
      */
    case object Bootstrap232 extends Toolkit {
      net.liftmodules.FoBoTB.Toolkit.Bootstrap232
    }

    /*===Highlight Toolkit===============================================================*/

    /**
      * Enable usage of FoBo's Highlight JS API and resources version 9&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version v9.3.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.HighlightJS930
      * }}}
      */
    case object HighlightJS930 extends Toolkit {
      net.liftmodules.FoBoHL.Toolkit.HighlightJS930
    }

  } //end Toolkit

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
    override def toString() = "FoBo.Resource = " + store.toString()

    /*===Angular Resource===============================================================*/

    /**
      * Enable usage of FoBo's AngularJS version 1&#8228;5&#8228;3 resources files in your bootstrap liftweb Boot.
      * @version 1.5.3
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS153
      * }}}
      *
      */
    case object AngularJS153 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AngularJS153
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.5.3 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS153i18n
      * }}}
      *
      */
    case object AngularJS153i18n extends Resource {
      net.liftmodules.FoBoAJS.Resource.AngularJS153i18n
    }

    /**
      * Enable usage of FoBo's AngularJS version 1&#8228;4&#8228;8 resources files in your bootstrap liftweb Boot.
      * @version 1.4.8
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS148
      * }}}
      *
      */
    case object AngularJS148 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AngularJS148
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.4.8 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS148i18n
      * }}}
      *
      */
    case object AngularJS148i18n extends Resource {
      net.liftmodules.FoBoAJS.Resource.AngularJS148i18n
    }

    /**
      * Enable usage of AngularJS version 1&#8228;4&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 1.4.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resources.Init=FoBo.Resouces.AngularJS148
      * }}}
      *
      */
    case object AngularJS141 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AngularJS141
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.4.1 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resources.Init=FoBo.Resources.AngularJS141i18n
      * }}}
      *
      */
    case object AngularJS141i18n extends Resource {
      net.liftmodules.FoBoAJS.Resource.AngularJS141i18n
    }

    /**
      * Enable usage of AngularJS version 1&#8228;3&#8228;15 resource files in your bootstrap liftweb Boot.
      * @version 1.3.15
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resources.Init=FoBo.Resources.AngularJS1315
      * }}}
      *
      */
    case object AngularJS1315 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AngularJS1315
    }

    /**
      * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
      * @version 1.3.15 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resources.Init=FoBo.Resources.AngularJS1315i18n
      * }}}
      *
      */
    case object AngularJS1315i18n extends Resource {
      net.liftmodules.FoBoAJS.Resource.AngularJS1315i18n
    }

    /**
      * Enable usage of AngularJS version 1&#8228;2&#8228;19 resource files in your bootstrap liftweb Boot.
      * @version 1.2.19
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS1219
      * }}}
      *
      */
    case object AngularJS1219 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AngularJS1219
    }

    /**
      * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
      * @version 1.2.19 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS1219i18n
      * }}}
      *
      */
    case object AngularJS1219i18n extends Resource {
      net.liftmodules.FoBoAJS.Resource.AngularJS1219i18n
    }

    /**
      * Enable usage of Angular Material version 1&#8228;0&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 1.0.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJMaterial101
      * }}}
      *
      */
    @deprecated("Use AJMaterial108 or later", "1.6.0")
    case object AJMaterial101 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AJMaterial101
    }

    /**
      * Enable usage of Angular Material version 1&#8228;0&#8228;8 resource files in your bootstrap liftweb Boot.
      * @version 1.0.8
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJMaterial108
      * }}}
      *
      */
    @deprecated("Use AJMaterial111 or later", "2.0.0")
    case object AJMaterial108 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AJMaterial108
    }

    /**
      * Enable usage of Angular Material version 1&#8228;1&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 1.1.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJMaterial111
      * }}}
      *
      */
    case object AJMaterial111 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AJMaterial111
    }

    /**
      * Enable usage of AngularUI-Bootstrap version 2&#8228;4&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 2.4.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap240
      * }}}
      *
      */
    case object AJSUIBootstrap240 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AJSUIBootstrap240
    }

    /**
      * Enable usage of AngularUI-Bootstrap version 0&#8228;10&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 0.10.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap0100
      * }}}
      *
      */
    case object AJSUIBootstrap0100 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AJSUIBootstrap0100
    }

    /**
      * Enable usage of AngularUI-Bootstrap version 0&#8228;7&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 0.7.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap070
      * }}}
      *
      */
    case object AJSUIBootstrap070 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AJSUIBootstrap070
    }

    /**
      * Enable usage of AngularUI-Bootstrap version 0&#8228;2&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 0.2.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap020
      * }}}
      *
      */
    case object AJSUIBootstrap020 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AJSUIBootstrap020
    }

    /**
      * Enable usage of NG-Grid version 2&#8228;0&#8228;7 resource files in your bootstrap liftweb Boot.
      * @version 2.0.7
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSNGGrid207
      * }}}
      *
      */
    case object AJSNGGrid207 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AJSNGGrid207
    }

    /**
      * Enable usage of UI-Grid version 3&#8228;0&#8228;7 resource files in your bootstrap liftweb Boot.
      * @version 3.0.7
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSUIGrid307
      * }}}
      *
      */
    case object AJSUIGrid307 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AJSUIGrid307
    }

    /*===Font Awesome Resource===============================================================*/

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;6&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.6.3
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome463
      * }}}
      */
    case object FontAwesome463 extends Resource {
      net.liftmodules.FoBoFA.Resource.FontAwesome463
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.3.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome430
      * }}}
      */
    case object FontAwesome430 extends Resource {
      net.liftmodules.FoBoFA.Resource.FontAwesome430
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.1.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome410
      * }}}
      */
    case object FontAwesome410 extends Resource {
      net.liftmodules.FoBoFA.Resource.FontAwesome410
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.0.3
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome403
      * }}}
      */
    case object FontAwesome403 extends Resource {
      net.liftmodules.FoBoFA.Resource.FontAwesome403
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.2.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.FontAwesome321
      * }}}
      */
    case object FontAwesome321 extends Resource {
      net.liftmodules.FoBoFA.Resource.FontAwesome321
    }

    /*===Google Code Prettify Resource===============================================================*/

    /**
      * Enable usage of FoBo's Google Code Prettify API and resources version Jun2011 in your bootstrap liftweb Boot.
      * @version Jun2011
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.PrettifyJun2011
      * }}}
      */
    case object PrettifyJun2011 extends Resource {
      net.liftmodules.FoBoGCP.Resource.PrettifyJun2011
    }

    /*===JQuery Resource===============================================================*/

    /**
      * Enable usage of FoBo's JQuery resources version 3&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.1.0
      * OBS! JQuery 3.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.JQuery310
      * }}}
      * @since v2.10
      */
    case object JQuery310 extends Resource {
      net.liftmodules.FoBoJQ.Resource.JQuery310
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate resources version 3&#8228;0&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.0.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.JQueryMigrate300
      * }}}
      * @since v2.10
      */
    case object JQueryMigrate300 extends Resource {
      net.liftmodules.FoBoJQ.Resource.JQueryMigrate300
    }

    /**
      * Enable usage of FoBo's JQuery resources version 3&#8228;0&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.0.0
      * OBS! JQuery 3.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.JQuery300
      * }}}
      * @since v2.10
      */
    case object JQuery300 extends Resource {
      net.liftmodules.FoBoJQ.Resource.JQuery300
    }

    /**
      * Enable usage of FoBo's JQuery resources version 2&#8228;2&#8228;4 in your bootstrap liftweb Boot.
      * @version 2.2.4
      * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.JQuery224
      * }}}
      * @since v2.10
      */
    case object JQuery224 extends Resource {
      net.liftmodules.FoBoJQ.Resource.JQuery224
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate resources version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.4.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.JQueryMigrate141
      * }}}
      * @since v2.10
      */
    case object JQueryMigrate141 extends Resource {
      net.liftmodules.FoBoJQ.Resource.JQueryMigrate141
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate resources version 1&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.2.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.JQueryMigrate121
      * }}}
      */
    case object JQueryMigrate121 extends Resource {
      net.liftmodules.FoBoJQ.Resource.JQueryMigrate121
    }

    /**
      * Enable usage of FoBo's JQuery resources version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
      * @version 2.1.4
      * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.JQuery214
      * }}}
      */
    case object JQuery214 extends Resource {
      net.liftmodules.FoBoJQ.Resource.JQuery214
    }

    /**
      * Enable usage of FoBo's JQuery resources version 2&#8228;1&#8228;1 in your bootstrap liftweb Boot.
      * @version 2.1.1
      * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.JQuery211
      * }}}
      */
    case object JQuery211 extends Resource {
      net.liftmodules.FoBoJQ.Resource.JQuery211
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
      * @version 1.11.3
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.JQuery1113
      * }}}
      */
    case object JQuery1113 extends Resource {
      net.liftmodules.FoBoJQ.Resource.JQuery1113
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;10&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.10.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.JQuery1102
      * }}}
      */
    case object JQuery1102 extends Resource {
      net.liftmodules.FoBoJQ.Resource.JQuery1102
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.9.1
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.JQuery191
      * }}}
      */
    case object JQuery191 extends Resource {
      net.liftmodules.FoBoJQ.Resource.JQuery191
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.8.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.JQuery182
      * }}}
      */
    case object JQuery182 extends Resource {
      net.liftmodules.FoBoJQ.Resource.JQuery182
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.7.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.JQuery172
      * }}}
      */
    case object JQuery172 extends Resource {
      net.liftmodules.FoBoJQ.Resource.JQuery172
    }

    /*===Kinetic Resource===============================================================*/

    /**
      * Enable usage FoBo's KineticJS resources version 5&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 5.1.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.KineticJS510
      * }}}
      *
      */
    case object KineticJS510 extends Resource {
      net.liftmodules.FoBoKi.Resource.KineticJS510
    }

    /*===Pace Resource===============================================================*/
    /**
      * Enable usage of FoBo's Pace resources version 1&#8228;0&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.0.2
      *
      * '''Example:'''
      *
      * {{{
      *   FoBo.Resource.Init=FoBo.Resource.Pace102
      * }}}
      */
    case object Pace102 extends Resource {
      net.liftmodules.FoBoPa.Resource.Pace102
    }

    /**
      * Enable usage of FoBo's Pace resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
      * @version 0.4.15
      *
      * '''Example:'''
      *
      * {{{
      *   FoBo.Resource.Init=FoBo.Resource.Pace0415
      * }}}
      */
    case object Pace0415 extends Resource {
      net.liftmodules.FoBoPa.Resource.Pace0415
    }

    /*===Bootstrap3 Resource===============================================================*/

    /**
      * Enable usage of Bootstrap version 3&#8228;3&#8228;7 resource files in your bootstrap liftweb Boot.
      * @version 3.3.7
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.Bootstrap337
      * }}}
      * @since v1.7
      */
    case object Bootstrap337 extends Resource {
      net.liftmodules.FoBoBs.Resource.Bootstrap337
    }

    /**
      * Enable usage of Bootstrap version 3&#8228;3&#8228;6 resource files in your bootstrap liftweb Boot.
      * @version 3.3.6
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.Bootstrap336
      * }}}
      * @since v1.5
      */
    @deprecated("Use Bootstrap337 or later", "1.7.0")
    case object Bootstrap336 extends Resource {
      net.liftmodules.FoBoBs.Resource.Bootstrap336
    }

    /**
      * Enable usage of Bootstrap version 3&#8228;3&#8228;5 resource files in your bootstrap liftweb Boot.
      * @version 3.3.5
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.Bootstrap335
      * }}}
      *
      */
    @deprecated("Use Bootstrap337 or later", "1.7.0")
    case object Bootstrap335 extends Resource {
      net.liftmodules.FoBoBs.Resource.Bootstrap335
    }

    /**
      * Enable usage of Bootstrap version 3&#8228;2&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 3.2.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.Bootstrap320
      * }}}
      *
      */
    case object Bootstrap320 extends Resource {
      net.liftmodules.FoBoBs.Resource.Bootstrap320
    }

    /**
      * Enable usage of Bootstrap version 3&#8228;1&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 3.1.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.Bootstrap311
      * }}}
      *
      */
    case object Bootstrap311 extends Resource {
      net.liftmodules.FoBoBs.Resource.Bootstrap311
    }

    /**
      * Enable usage of Bootstrap version 3&#8228;0&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 3.0.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.Bootstrap301
      * }}}
      *
      */
    case object Bootstrap301 extends Resource {
      net.liftmodules.FoBoBs.Resource.Bootstrap301
    }

    /*===Bootstrap2 Resource===============================================================*/

    /**
      * Enable usage of Bootstrap version 3&#8228;0&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 2.3.2
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.Bootstrap232
      * }}}
      *
      */
    case object Bootstrap232 extends Resource {
      net.liftmodules.FoBoTB.Resource.Bootstrap232
    }

    /*===Highlight Resource===============================================================*/

    /**
      * Enable usage of FoBo's Highlight JS version 9&#8228;3&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version v9.3.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.HighlightJS930
      * }}}
      */
    case object HighlightJS930 extends Resource {
      net.liftmodules.FoBoHL.Resource.HighlightJS930
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
    override def toString() = "FoBo.API = " + store.toString()

    /*===Angular API===============================================================*/
    /**
      * Enable usage of FoBo's AngularJS API 1&#8228;x&#8228;x in your bootstrap liftweb Boot.
      * @version 1.4.8
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.API.Init=FoBo.API.Angular1
      * }}}
      *
      */
    case object Angular1 extends API {
      net.liftmodules.FoBoAJS.API.Angular1
    }

    /*===Bootstrap API===============================================================*/

    /**
      * Enable usage of FoBo's Bootstrap API 3&#8228;x&#8228;x in your bootstrap liftweb Boot.
      * @version 3.x.x
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.API.Init=FoBo.API.Bootstrap3
      * }}}
      *
      */
    case object Bootstrap3 extends API {
      net.liftmodules.FoBoBs.API.Bootstrap3
    }

    /**
      * Enable usage of FoBo's Bootstrap API 2&#8228;x&#8228;x in your bootstrap liftweb Boot.
      * @version 2.x.x
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.API.Init=FoBo.API.Bootstrap2
      * }}}
      *
      */
    case object Bootstrap2 extends API {
      FoBoTB.API.Bootstrap2
    }

    /*===Font Awesome API===============================================================*/

    /*===Google Code Prettify API===============================================================*/

    /*===Highlight API===============================================================*/

    /**
      * Enable usage of FoBo's Pace API version 9&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 9.X.X
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.API.Init=FoBo.API.HighlightJS9
      * }}}
      */
    case object HighlightJS9 extends API {
      FoBoHL.API.HighlightJS9
    }

    /*===Kinetic API===============================================================*/

    /*===Pace API===============================================================*/

    /*===FoBo API ==============================================================*/

    /**
      * Enable usage of FoBo's FoBo API 1&#8228;x&#8228;x in your bootstrap liftweb Boot.
      * @version 1.x.x
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.FoBo
      *    :
      *   FoBo.API.Init=FoBo.API.FoBo1
      * }}}
      *
      */
    case object FoBo1 extends API {
      net.liftmodules.FoBoAPI.API.FoBo1
    }

  }

}
