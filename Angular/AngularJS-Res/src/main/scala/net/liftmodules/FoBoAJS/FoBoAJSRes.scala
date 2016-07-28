package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo AngularJS Resource Module==
  * 
  * This resource module provides AngularJS resource components to the FoBo AngularJS Toolkit module, 
  * but can also be used as-is, see below for setup information.
  * 
  * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.FoBo]] for setup information. 
  * 
  */
package object FoBoAJSRes {

  override def toString() = FoBoAJSRes.Resource.toString()

  /**
    * Initiate FoBo's Angular Resource(s) in you bootstrap liftweb Boot.
    * 
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoAJSRes => FoBo}
    *    :
    *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait Resource

  object Resource extends Resource {

    //we don't actually need to store the objects (for now) so lets just save 
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Resource]
    private var store: Store = List()
    def Init: Store = store
    def Init_=(t: Resource): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoAJSRes.Resource = " + store.toString()

    /**
      * Enable usage of FoBo's AngularJS version 1&#8228;5&#8228;3 resources files in your bootstrap liftweb Boot.
      * @version 1.5.3
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS153
      * }}}
      *
      */
    case object AngularJS153 extends Resource {
      FoBoResources.init
      FoBoResources.angularjs153
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.5.3 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resources.Init=FoBo.Resources.AngularJS153i18n
      * }}}
      *
      */
    case object AngularJS153i18n extends Resource {
      FoBoResources.init
      FoBoResources.angularjs153i18n1
      FoBoResources.angularjs153i18n2
      FoBoResources.angularjs153i18n3
      FoBoResources.angularjs153i18n4
      FoBoResources.angularjs153i18n5
      FoBoResources.angularjs153i18n6
      FoBoResources.angularjs153i18n7
      FoBoResources.angularjs153i18n8
    }

    /**
      * Enable usage of FoBo's AngularJS version 1&#8228;4&#8228;8 resources files in your bootstrap liftweb Boot.
      * @version 1.4.8
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS148
      * }}}
      *
      */
    case object AngularJS148 extends Resource {
      FoBoResources.init
      FoBoResources.angularjs148
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.4.8 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS148i18n
      * }}}
      *
      */
    case object AngularJS148i18n extends Resource {
      FoBoResources.init
      FoBoResources.angularjs148i18n
      FoBoResources.angularjs148i18n2
      FoBoResources.angularjs148i18n3
      FoBoResources.angularjs148i18n4
    }

    /**
      * Enable usage of AngularJS version 1&#8228;4&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 1.4.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resources.Init=FoBo.Resouces.AngularJS148
      * }}}
      *
      */
    case object AngularJS141 extends Resource {
      FoBoResources.init
      FoBoResources.angularjs141
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.4.1 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resources.Init=FoBo.Resources.AngularJS141i18n
      * }}}
      *
      */
    case object AngularJS141i18n extends Resource {
      FoBoResources.init
      FoBoResources.angularjs141i18n
      FoBoResources.angularjs141i18n2
      FoBoResources.angularjs141i18n3
      FoBoResources.angularjs141i18n4
    }

    /**
      * Enable usage of AngularJS version 1&#8228;3&#8228;15 resource files in your bootstrap liftweb Boot.
      * @version 1.3.15
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resources.Init=FoBo.Resources.AngularJS1315
      * }}}
      *
      */
    case object AngularJS1315 extends Resource {
      FoBoResources.init
      FoBoResources.angularjs1315
    }

    /**
      * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
      * @version 1.3.15 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resources.Init=FoBo.Resources.AngularJS1315i18n
      * }}}
      *
      */
    case object AngularJS1315i18n extends Resource {
      FoBoResources.init
      FoBoResources.angularjs1315i18n
      FoBoResources.angularjs1315i18n2
      FoBoResources.angularjs1315i18n3
      FoBoResources.angularjs1315i18n4
    }

    /**
      * Enable usage of AngularJS version 1&#8228;2&#8228;19 resource files in your bootstrap liftweb Boot.
      * @version 1.2.19
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS1219
      * }}}
      *
      */
    case object AngularJS1219 extends Resource {
      FoBoResources.init
      FoBoResources.angularjs1219
    }

    /**
      * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
      * @version 1.2.19 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS1219i18n
      * }}}
      *
      */
    case object AngularJS1219i18n extends Resource {
      FoBoResources.init
      FoBoResources.angularjs1219i18n
      FoBoResources.angularjs1219i18n2
    }

    /**
      * Enable usage of Angular Material version 0&#8228;10&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 0.10.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJMaterial0100
      * }}}
      *
      */
    @deprecated("Use AJMaterial108 or later", "1.5.0")
    case object AJMaterial0100 extends Resource {
      FoBoResources.init
      FoBoResources.AJMaterial0100
    }

    /**
      * Enable usage of Angular Material version 1&#8228;0&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 1.0.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJMaterial101
      * }}}
      *
      */
    @deprecated("Use AJMaterial108 or later", "1.6.0")
    case object AJMaterial101 extends Resource {
      FoBoResources.init
      FoBoResources.AJMaterial101
    }

    /**
      * Enable usage of Angular Material version 1&#8228;0&#8228;8 resource files in your bootstrap liftweb Boot.
      * @version 1.0.8
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJMaterial108
      * }}}
      *
      */
    case object AJMaterial108 extends Resource {
      FoBoResources.init
      FoBoResources.AJMaterial108
    }

//    /**
//     * Enable usage of Angular Material version 1&#8228;1&#8228;0 resource files in your bootstrap liftweb Boot.
//     * @version 1.1.0
//     *
//     *  '''Example:'''
//     *
//     * {{{
//     *   import net.liftmodules.{FoBoAJSRes => FoBo}
//     *    :
//     *   FoBo.Resource.Init=FoBo.Resource.AJMaterial110
//     * }}}
//     *
//     */
//    case object AJMaterial110 extends Resource {
//      FoBoResources.init
//      FoBoResources.AJMaterial110
//    }        

    /**
      * Enable usage of AngularUI-Bootstrap version 0&#8228;10&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 0.10.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap0100
      * }}}
      *
      */
    case object AJSUIBootstrap0100 extends Resource {
      FoBoResources.init
      FoBoResources.uibootstrap0100
    }

    /**
      * Enable usage of AngularUI-Bootstrap version 0&#8228;7&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 0.7.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap070
      * }}}
      *
      */
    case object AJSUIBootstrap070 extends Resource {
      FoBoResources.init
      FoBoResources.uibootstrap070
    }

    /**
      * Enable usage of AngularUI-Bootstrap version 0&#8228;2&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 0.2.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap020
      * }}}
      *
      */
    case object AJSUIBootstrap020 extends Resource {
      FoBoResources.init
      FoBoResources.uibootstrap020
    }

    /**
      * Enable usage of NG-Grid version 2&#8228;0&#8228;7 resource files in your bootstrap liftweb Boot.
      * @version 2.0.7
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSNGGrid207
      * }}}
      *
      */
    case object AJSNGGrid207 extends Resource {
      FoBoResources.init
      FoBoResources.nggrid207
    }

    /**
      * Enable usage of UI-Grid version 3&#8228;0&#8228;7 resource files in your bootstrap liftweb Boot.
      * @version 3.0.7
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJSRes => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSUIGrid307
      * }}}
      *
      */
    case object AJSUIGrid307 extends Resource {
      FoBoResources.init
      FoBoResources.uigrid307
    }

  } //end Resource object   

  /**
    * Object holding internally used FoBo resources.
    */
  private object FoBoResources {

    lazy val init: Unit = {
      ResourceServer.allow {
        case "fobo" :: tail => true
      }
    }

    lazy val angularjs153 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "angular.js")
        case "fobo" :: "angular.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular.min.js")
        case "fobo" :: "angular.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular.min.js.map")

        case "fobo" :: "angular-animate.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-animate.js")
        case "fobo" :: "angular-animate.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-animate.min.js")
        case "fobo" :: "angular-animate.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "js",
               "angular-animate.min.js.map")

        case "fobo" :: "angular-aria.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-aria.js")
        case "fobo" :: "angular-aria.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-aria.min.js")
        case "fobo" :: "angular-aria.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-aria.min.js.map")

        case "fobo" :: "angular-cookies.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-cookies.js")
        case "fobo" :: "angular-cookies.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-cookies.min.js")
        case "fobo" :: "angular-cookies.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "js",
               "angular-cookies.min.js.map")

        case "fobo" :: "angular-loader.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-loader.js")
        case "fobo" :: "angular-loader.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-loader.min.js")
        case "fobo" :: "angular-loader.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "js",
               "angular.min-loader.js.map")

        case "fobo" :: "angular-message-format.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-messages.js")
        case "fobo" :: "angular-message-format.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-messages.min.js")
        case "fobo" :: "angular-message-format.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "js",
               "angular.min-messages.js.map")

        case "fobo" :: "angular-messages.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-messages.js")
        case "fobo" :: "angular-messages.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-messages.min.js")
        case "fobo" :: "angular-messages.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "js",
               "angular.min-messages.js.map")

        case "fobo" :: "angular-resource.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-resource.js")
        case "fobo" :: "angular-resource.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-resource.min.js")
        case "fobo" :: "angular-resource.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "js",
               "angular-resource.min.js.map")

        case "fobo" :: "angular-route.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-route.js")
        case "fobo" :: "angular-route.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-route.min.js")
        case "fobo" :: "angular-route.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-route.min.js.map")

        case "fobo" :: "angular-sanitize.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-sanitize.js")
        case "fobo" :: "angular-sanitize.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-sanitize.min.js")
        case "fobo" :: "angular-sanitize.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "js",
               "angular-sanitize.min.js.map")

        case "fobo" :: "angular-touch.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-touch.js")
        case "fobo" :: "angular-touch.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-touch.min.js")
        case "fobo" :: "angular-touch.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-touch.min.js.map")

        //dev/test only
        case "fobo" :: "angular-mocks.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "angular-mocks.js")
        case "fobo" :: "ngAnimateMock.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "ngAnimateMock.js")
        case "fobo" :: "ngMock.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "ngMock.js")
        case "fobo" :: "ngMockE2E.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "js", "ngMockE2E.js")

        //CSS files
        case "fobo" :: "angular-csp.css" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.5.3", "css", "angular-csp.css")
        case "fobo" :: "angular-csp.css" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "css", "angular-csp.css")

      }
    }

    lazy val angularjs153i18n1 = {
      ResourceServer.rewrite {

        case "fobo" :: "angular-locale_fy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_fy.js")
        case "fobo" :: "angular-locale_az-cyrl-az.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_az-cyrl-az.js")
        case "fobo" :: "angular-locale_fr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_fr.js")
        case "fobo" :: "angular-locale_kde-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_kde-tz.js")
        case "fobo" :: "angular-locale_az.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_az.js")
        case "fobo" :: "angular-locale_ta.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ta.js")
        case "fobo" :: "angular-locale_fi-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fi-fi.js")
        case "fobo" :: "angular-locale_hu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_hu.js")
        case "fobo" :: "angular-locale_en-mp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-mp.js")
        case "fobo" :: "angular-locale_pt-ao.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_pt-ao.js")
        case "fobo" :: "angular-locale_ar-tn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-tn.js")
        case "fobo" :: "angular-locale_gsw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_gsw.js")
        case "fobo" :: "angular-locale_chr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_chr.js")
        case "fobo" :: "angular-locale_es-co.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-co.js")
        case "fobo" :: "angular-locale_gsw-li.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_gsw-li.js")
        case "fobo" :: "angular-locale_en-io.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-io.js")
        case "fobo" :: "angular-locale_ms-latn-my.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ms-latn-my.js")
        case "fobo" :: "angular-locale_es-gq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-gq.js")
        case "fobo" :: "angular-locale_ckb-ir.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ckb-ir.js")
        case "fobo" :: "angular-locale_fy-nl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fy-nl.js")
        case "fobo" :: "angular-locale_zgh-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_zgh-ma.js")
        case "fobo" :: "angular-locale_en-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-er.js")
        case "fobo" :: "angular-locale_gl-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_gl-es.js")
        case "fobo" :: "angular-locale_khq-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_khq-ml.js")
        case "fobo" :: "angular-locale_saq-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_saq-ke.js")
        case "fobo" :: "angular-locale_fr-sy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-sy.js")
        case "fobo" :: "angular-locale_ru-ru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ru-ru.js")
        case "fobo" :: "angular-locale_en-bz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-bz.js")
        case "fobo" :: "angular-locale_zh-tw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_zh-tw.js")
        case "fobo" :: "angular-locale_smn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_smn.js")
        case "fobo" :: "angular-locale_en-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-in.js")
        case "fobo" :: "angular-locale_ssy-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ssy-er.js")
        case "fobo" :: "angular-locale_fil-ph.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fil-ph.js")
        case "fobo" :: "angular-locale_so-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_so-dj.js")
        case "fobo" :: "angular-locale_vi-vn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_vi-vn.js")
        case "fobo" :: "angular-locale_zh-hant.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_zh-hant.js")
        case "fobo" :: "angular-locale_my.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_my.js")
        case "fobo" :: "angular-locale_pt-tl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_pt-tl.js")
        case "fobo" :: "angular-locale_ms.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ms.js")
        case "fobo" :: "angular-locale_in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_in.js")
        case "fobo" :: "angular-locale_lt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_lt.js")
        case "fobo" :: "angular-locale_pt-br.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_pt-br.js")
        case "fobo" :: "angular-locale_ms-bn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ms-bn.js")
        case "fobo" :: "angular-locale_ckb-arab-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ckb-arab-iq.js")
        case "fobo" :: "angular-locale_en-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-za.js")
        case "fobo" :: "angular-locale_en-mw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-mw.js")
        case "fobo" :: "angular-locale_sk-sk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sk-sk.js")
        case "fobo" :: "angular-locale_zh-hant-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_zh-hant-mo.js")
        case "fobo" :: "angular-locale_mfe-mu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_mfe-mu.js")
        case "fobo" :: "angular-locale_sq-al.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sq-al.js")
        case "fobo" :: "angular-locale_kea-cv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_kea-cv.js")
        case "fobo" :: "angular-locale_he.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_he.js")
        case "fobo" :: "angular-locale_rof.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_rof.js")
        case "fobo" :: "angular-locale_bo-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bo-cn.js")
        case "fobo" :: "angular-locale_bm-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bm-ml.js")
        case "fobo" :: "angular-locale_en-pk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-pk.js")
        case "fobo" :: "angular-locale_fr-mc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-mc.js")
        case "fobo" :: "angular-locale_az-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_az-latn.js")
        case "fobo" :: "angular-locale_hi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_hi.js")
        case "fobo" :: "angular-locale_de-at.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_de-at.js")
        case "fobo" :: "angular-locale_qu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_qu.js")
        case "fobo" :: "angular-locale_af-na.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_af-na.js")
        case "fobo" :: "angular-locale_en-bs.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-bs.js")
        case "fobo" :: "angular-locale_pt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_pt.js")
        case "fobo" :: "angular-locale_ps.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ps.js")
        case "fobo" :: "angular-locale_luo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_luo.js")
        case "fobo" :: "angular-locale_ksh-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ksh-de.js")
        case "fobo" :: "angular-locale_ln.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ln.js")
        case "fobo" :: "angular-locale_nmg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_nmg.js")
        case "fobo" :: "angular-locale_jmc.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_jmc.js")
        case "fobo" :: "angular-locale_tzm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_tzm.js")
        case "fobo" :: "angular-locale_ks-arab-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ks-arab-in.js")
        case "fobo" :: "angular-locale_te-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_te-in.js")
        case "fobo" :: "angular-locale_ki-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ki-ke.js")
        case "fobo" :: "angular-locale_pt-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_pt-mo.js")
        case "fobo" :: "angular-locale_ast.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ast.js")
        case "fobo" :: "angular-locale_sq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sq.js")
        case "fobo" :: "angular-locale_fr-sc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-sc.js")
        case "fobo" :: "angular-locale_en-im.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-im.js")
        case "fobo" :: "angular-locale_uz-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_uz-arab.js")
        case "fobo" :: "angular-locale_gsw-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_gsw-fr.js")
        case "fobo" :: "angular-locale_hu-hu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_hu-hu.js")
        case "fobo" :: "angular-locale_tn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_tn.js")
        case "fobo" :: "angular-locale_mk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_mk.js")
        case "fobo" :: "angular-locale_sr-latn-rs.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sr-latn-rs.js")
        case "fobo" :: "angular-locale_en-zw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-zw.js")
        case "fobo" :: "angular-locale_hi-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_hi-in.js")
        case "fobo" :: "angular-locale_ia.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ia.js")
        case "fobo" :: "angular-locale_rwk-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_rwk-tz.js")
        case "fobo" :: "angular-locale_en-rw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-rw.js")
        case "fobo" :: "angular-locale_ar-lb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-lb.js")
        case "fobo" :: "angular-locale_id.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_id.js")
        case "fobo" :: "angular-locale_fr-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-ne.js")
        case "fobo" :: "angular-locale_dz-bt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_dz-bt.js")
        case "fobo" :: "angular-locale_es-gt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-gt.js")
        case "fobo" :: "angular-locale_en-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-us.js")
        case "fobo" :: "angular-locale_fr-km.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-km.js")
        case "fobo" :: "angular-locale_nb-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nb-no.js")
        case "fobo" :: "angular-locale_mas-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_mas-ke.js")
        case "fobo" :: "angular-locale_qu-ec.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_qu-ec.js")
        case "fobo" :: "angular-locale_en-vg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-vg.js")
        case "fobo" :: "angular-locale_tg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_tg.js")
        case "fobo" :: "angular-locale_de-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_de-de.js")
        case "fobo" :: "angular-locale_nn-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nn-no.js")
        case "fobo" :: "angular-locale_en-bm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-bm.js")
        case "fobo" :: "angular-locale_ne-np.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ne-np.js")
        case "fobo" :: "angular-locale_mt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_mt.js")
        case "fobo" :: "angular-locale_fi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_fi.js")
        case "fobo" :: "angular-locale_es-bo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-bo.js")
        case "fobo" :: "angular-locale_kok-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_kok-in.js")
        case "fobo" :: "angular-locale_st-ls.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_st-ls.js")
        case "fobo" :: "angular-locale_ca-ad.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ca-ad.js")
        case "fobo" :: "angular-locale_ca-it.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ca-it.js")
        case "fobo" :: "angular-locale_om-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_om-et.js")
        case "fobo" :: "angular-locale_rn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_rn.js")
        case "fobo" :: "angular-locale_uk-ua.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_uk-ua.js")
        case "fobo" :: "angular-locale_no-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_no-no.js")
        case "fobo" :: "angular-locale_mr-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_mr-in.js")
        case "fobo" :: "angular-locale_en-lr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-lr.js")
        case "fobo" :: "angular-locale_ar-ye.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-ye.js")
        case "fobo" :: "angular-locale_nnh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_nnh.js")
        case "fobo" :: "angular-locale_sv-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sv-fi.js")
        case "fobo" :: "angular-locale_am-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_am-et.js")
        case "fobo" :: "angular-locale_ar-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-iq.js")
        case "fobo" :: "angular-locale_cgg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_cgg.js")
        case "fobo" :: "angular-locale_ka.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ka.js")
        case "fobo" :: "angular-locale_xog-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_xog-ug.js")
        case "fobo" :: "angular-locale_tr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_tr.js")
        case "fobo" :: "angular-locale_gd-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_gd-gb.js")
        case "fobo" :: "angular-locale_tzm-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_tzm-latn.js")
        case "fobo" :: "angular-locale_ro-md.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ro-md.js")
        case "fobo" :: "angular-locale_gu-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_gu-in.js")
        case "fobo" :: "angular-locale_kk-cyrl-kz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_kk-cyrl-kz.js")
        case "fobo" :: "angular-locale_ss.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ss.js")
        case "fobo" :: "angular-locale_vi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_vi.js")
        case "fobo" :: "angular-locale_th.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_th.js")
        case "fobo" :: "angular-locale_es-pe.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-pe.js")
        case "fobo" :: "angular-locale_om-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_om-ke.js")
        case "fobo" :: "angular-locale_fa.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_fa.js")
        case "fobo" :: "angular-locale_en-cx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-cx.js")
        case "fobo" :: "angular-locale_gv.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_gv.js")
        case "fobo" :: "angular-locale_ee-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ee-gh.js")
        case "fobo" :: "angular-locale_lo-la.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_lo-la.js")
        case "fobo" :: "angular-locale_so-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_so-et.js")
        case "fobo" :: "angular-locale_ti-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ti-et.js")
        case "fobo" :: "angular-locale_ti.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ti.js")
        case "fobo" :: "angular-locale_fr-cg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-cg.js")

      }
    }

    //    lazy val angularjs153i18n2 = {
    //      ResourceServer.rewrite {
    //
    //
    //      }
    //    }

    lazy val angularjs153i18n2 = {
      ResourceServer.rewrite {

        case "fobo" :: "angular-locale_uz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_uz.js")
        case "fobo" :: "angular-locale_sq-xk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sq-xk.js")
        case "fobo" :: "angular-locale_fur.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_fur.js")
        case "fobo" :: "angular-locale_ve-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ve-za.js")
        case "fobo" :: "angular-locale_nl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_nl.js")
        case "fobo" :: "angular-locale_ar-dz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-dz.js")
        case "fobo" :: "angular-locale_ar-kw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-kw.js")
        case "fobo" :: "angular-locale_fr-cf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-cf.js")
        case "fobo" :: "angular-locale_lag-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_lag-tz.js")
        case "fobo" :: "angular-locale_nr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_nr.js")
        case "fobo" :: "angular-locale_pt-pt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_pt-pt.js")
        case "fobo" :: "angular-locale_fr-sn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-sn.js")
        case "fobo" :: "angular-locale_khq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_khq.js")
        case "fobo" :: "angular-locale_ff-gn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ff-gn.js")
        case "fobo" :: "angular-locale_hr-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_hr-ba.js")
        case "fobo" :: "angular-locale_os.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_os.js")
        case "fobo" :: "angular-locale_en-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ke.js")
        case "fobo" :: "angular-locale_sn-zw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sn-zw.js")
        case "fobo" :: "angular-locale_lu-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_lu-cd.js")
        case "fobo" :: "angular-locale_ve.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ve.js")
        case "fobo" :: "angular-locale_ts.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ts.js")
        case "fobo" :: "angular-locale_ug-arab-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ug-arab-cn.js")
        case "fobo" :: "angular-locale_kn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_kn.js")
        case "fobo" :: "angular-locale_agq-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_agq-cm.js")
        case "fobo" :: "angular-locale_kw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_kw.js")
        case "fobo" :: "angular-locale_ha-latn-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ha-latn-ne.js")
        case "fobo" :: "angular-locale_en-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-tz.js")
        case "fobo" :: "angular-locale_sl-si.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sl-si.js")
        case "fobo" :: "angular-locale_da-gl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_da-gl.js")
        case "fobo" :: "angular-locale_ia-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ia-fr.js")
        case "fobo" :: "angular-locale_fr-mq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-mq.js")
        case "fobo" :: "angular-locale_zh-hans-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_zh-hans-mo.js")
        case "fobo" :: "angular-locale_ksf-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ksf-cm.js")
        case "fobo" :: "angular-locale_vai-vaii-lr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_vai-vaii-lr.js")
        case "fobo" :: "angular-locale_ln-ao.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ln-ao.js")
        case "fobo" :: "angular-locale_de.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_de.js")
        case "fobo" :: "angular-locale_lag.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_lag.js")
        case "fobo" :: "angular-locale_mg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_mg.js")
        case "fobo" :: "angular-locale_fr-bf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-bf.js")
        case "fobo" :: "angular-locale_os-ge.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_os-ge.js")
        case "fobo" :: "angular-locale_no.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_no.js")
        case "fobo" :: "angular-locale_zh-hans-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_zh-hans-cn.js")
        case "fobo" :: "angular-locale_kw-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_kw-gb.js")
        case "fobo" :: "angular-locale_sw-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sw-ug.js")
        case "fobo" :: "angular-locale_es-419.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-419.js")
        case "fobo" :: "angular-locale_en-fk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-fk.js")
        case "fobo" :: "angular-locale_be.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_be.js")
        case "fobo" :: "angular-locale_kab.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_kab.js")
        case "fobo" :: "angular-locale_en-dsrt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-dsrt.js")
        case "fobo" :: "angular-locale_ko-kr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ko-kr.js")
        case "fobo" :: "angular-locale_en-ki.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ki.js")
        case "fobo" :: "angular-locale_et-ee.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_et-ee.js")
        case "fobo" :: "angular-locale_es-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-us.js")
        case "fobo" :: "angular-locale_en-gi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-gi.js")
        case "fobo" :: "angular-locale_hsb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_hsb.js")
        case "fobo" :: "angular-locale_en-sh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-sh.js")
        case "fobo" :: "angular-locale_tg-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_tg-cyrl.js")
        case "fobo" :: "angular-locale_fr-pm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-pm.js")
        case "fobo" :: "angular-locale_ko-kp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ko-kp.js")
        case "fobo" :: "angular-locale_sw-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sw-tz.js")
        case "fobo" :: "angular-locale_nn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_nn.js")
        case "fobo" :: "angular-locale_nl-bq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nl-bq.js")
        case "fobo" :: "angular-locale_smn-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_smn-fi.js")
        case "fobo" :: "angular-locale_en-pg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-pg.js")
        case "fobo" :: "angular-locale_fr-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-be.js")
        case "fobo" :: "angular-locale_ksf.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ksf.js")
        case "fobo" :: "angular-locale_so.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_so.js")
        case "fobo" :: "angular-locale_pt-cv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_pt-cv.js")
        case "fobo" :: "angular-locale_vai-latn-lr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_vai-latn-lr.js")
        case "fobo" :: "angular-locale_luy-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_luy-ke.js")
        case "fobo" :: "angular-locale_pt-gw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_pt-gw.js")
        case "fobo" :: "angular-locale_az-latn-az.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_az-latn-az.js")
        case "fobo" :: "angular-locale_tzm-latn-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_tzm-latn-ma.js")
        case "fobo" :: "angular-locale_en-bb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-bb.js")
        case "fobo" :: "angular-locale_en-150.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-150.js")
        case "fobo" :: "angular-locale_bem-zm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bem-zm.js")
        case "fobo" :: "angular-locale_tn-bw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_tn-bw.js")
        case "fobo" :: "angular-locale_fr-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-ch.js")
        case "fobo" :: "angular-locale_ar-km.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-km.js")
        case "fobo" :: "angular-locale_fr-gq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-gq.js")
        case "fobo" :: "angular-locale_se-se.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_se-se.js")
        case "fobo" :: "angular-locale_ki.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ki.js")
        case "fobo" :: "angular-locale_to-to.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_to-to.js")
        case "fobo" :: "angular-locale_lv-lv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_lv-lv.js")
        case "fobo" :: "angular-locale_pa.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_pa.js")
        case "fobo" :: "angular-locale_sr-cyrl-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sr-cyrl-ba.js")
        case "fobo" :: "angular-locale_eo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_eo.js")
        case "fobo" :: "angular-locale_guz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_guz.js")
        case "fobo" :: "angular-locale_af-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_af-za.js")
        case "fobo" :: "angular-locale_ky-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ky-cyrl.js")
        case "fobo" :: "angular-locale_fa-af.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fa-af.js")
        case "fobo" :: "angular-locale_is-is.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_is-is.js")
        case "fobo" :: "angular-locale_es-cu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-cu.js")
        case "fobo" :: "angular-locale_ckb-arab-ir.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ckb-arab-ir.js")
        case "fobo" :: "angular-locale_ar-td.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-td.js")
        case "fobo" :: "angular-locale_ar-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-001.js")
        case "fobo" :: "angular-locale_ak-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ak-gh.js")
        case "fobo" :: "angular-locale_mn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_mn.js")
        case "fobo" :: "angular-locale_dua.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_dua.js")
        case "fobo" :: "angular-locale_fr-ci.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-ci.js")
        case "fobo" :: "angular-locale_ee-tg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ee-tg.js")
        case "fobo" :: "angular-locale_ca-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ca-es.js")
        case "fobo" :: "angular-locale_ar-bh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-bh.js")
        case "fobo" :: "angular-locale_fr-wf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-wf.js")
        case "fobo" :: "angular-locale_wae.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_wae.js")
        case "fobo" :: "angular-locale_ln-cg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ln-cg.js")
        case "fobo" :: "angular-locale_fr-gf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-gf.js")
        case "fobo" :: "angular-locale_en-to.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-to.js")
        case "fobo" :: "angular-locale_ru-ua.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ru-ua.js")
        case "fobo" :: "angular-locale_es-mx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-mx.js")
        case "fobo" :: "angular-locale_mgh-mz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_mgh-mz.js")
        case "fobo" :: "angular-locale_bg-bg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bg-bg.js")
        case "fobo" :: "angular-locale_bez-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bez-tz.js")
        case "fobo" :: "angular-locale_es-pr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-pr.js")
        case "fobo" :: "angular-locale_fr-tn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-tn.js")
        case "fobo" :: "angular-locale_lg-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_lg-ug.js")
        case "fobo" :: "angular-locale_es-cr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-cr.js")
        case "fobo" :: "angular-locale_ses-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ses-ml.js")
        case "fobo" :: "angular-locale_es-py.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-py.js")
        case "fobo" :: "angular-locale_en-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-mo.js")
        case "fobo" :: "angular-locale_sg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sg.js")
        case "fobo" :: "angular-locale_jgo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_jgo.js")
        case "fobo" :: "angular-locale_mgh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_mgh.js")
        case "fobo" :: "angular-locale_gd.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_gd.js")
        case "fobo" :: "angular-locale_en-dg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-dg.js")
        case "fobo" :: "angular-locale_ar.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ar.js")
        case "fobo" :: "angular-locale_en-ie.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ie.js")
        case "fobo" :: "angular-locale_es-ni.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-ni.js")
        case "fobo" :: "angular-locale_aa-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_aa-er.js")
        case "fobo" :: "angular-locale_bs.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_bs.js")
        case "fobo" :: "angular-locale_mk-mk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_mk-mk.js")
        case "fobo" :: "angular-locale_es-ph.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-ph.js")
        case "fobo" :: "angular-locale_fr-nc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-nc.js")
        case "fobo" :: "angular-locale_en-ca.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ca.js")
        case "fobo" :: "angular-locale_ko.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ko.js")
        case "fobo" :: "angular-locale_mr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_mr.js")
        case "fobo" :: "angular-locale_se-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_se-no.js")
        case "fobo" :: "angular-locale_ee.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ee.js")
        case "fobo" :: "angular-locale_fr-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-cd.js")
        case "fobo" :: "angular-locale_en-tt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-tt.js")
        case "fobo" :: "angular-locale_en-sz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-sz.js")
        case "fobo" :: "angular-locale_fr-gn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-gn.js")
        case "fobo" :: "angular-locale_ro.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ro.js")
        case "fobo" :: "angular-locale_nyn-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nyn-ug.js")
        case "fobo" :: "angular-locale_es-uy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-uy.js")
        case "fobo" :: "angular-locale_kln-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_kln-ke.js")
        case "fobo" :: "angular-locale_en.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_en.js")
        case "fobo" :: "angular-locale_ig-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ig-ng.js")
        case "fobo" :: "angular-locale_fr-mu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-mu.js")
        case "fobo" :: "angular-locale_lg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_lg.js")
        case "fobo" :: "angular-locale_bo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_bo.js")
        case "fobo" :: "angular-locale_ff-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ff-cm.js")
        case "fobo" :: "angular-locale_ps-af.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ps-af.js")
        case "fobo" :: "angular-locale_it-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_it-ch.js")
        case "fobo" :: "angular-locale_kok.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_kok.js")
        case "fobo" :: "angular-locale_es-do.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-do.js")
        case "fobo" :: "angular-locale_eo-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_eo-001.js")
        case "fobo" :: "angular-locale_os-ru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_os-ru.js")
        case "fobo" :: "angular-locale_fr-ht.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-ht.js")
        case "fobo" :: "angular-locale_ksb-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ksb-tz.js")
        case "fobo" :: "angular-locale_en-ws.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ws.js")
        case "fobo" :: "angular-locale_en-gu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-gu.js")
        case "fobo" :: "angular-locale_nyn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_nyn.js")
        case "fobo" :: "angular-locale_tig-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_tig-er.js")
        case "fobo" :: "angular-locale_haw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_haw.js")
        case "fobo" :: "angular-locale_ar-il.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-il.js")
        case "fobo" :: "angular-locale_yo-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_yo-ng.js")
        case "fobo" :: "angular-locale_nl-nl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nl-nl.js")
        case "fobo" :: "angular-locale_ar-so.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-so.js")
        case "fobo" :: "angular-locale_my-mm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_my-mm.js")
        case "fobo" :: "angular-locale_kn-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_kn-in.js")
        case "fobo" :: "angular-locale_mas-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_mas-tz.js")
        case "fobo" :: "angular-locale_nb-sj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nb-sj.js")
        case "fobo" :: "angular-locale_bs-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bs-cyrl.js")
        case "fobo" :: "angular-locale_ne.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ne.js")
        case "fobo" :: "angular-locale_ar-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-dj.js")
        case "fobo" :: "angular-locale_fo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_fo.js")
        case "fobo" :: "angular-locale_yi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_yi.js")
        case "fobo" :: "angular-locale_en-sb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-sb.js")
        case "fobo" :: "angular-locale_en-ms.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ms.js")
        case "fobo" :: "angular-locale_jgo-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_jgo-cm.js")
        case "fobo" :: "angular-locale_tg-cyrl-tj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_tg-cyrl-tj.js")
        case "fobo" :: "angular-locale_en-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ng.js")
        case "fobo" :: "angular-locale_fr-td.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-td.js")
        case "fobo" :: "angular-locale_en-kn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-kn.js")
        case "fobo" :: "angular-locale_yav.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_yav.js")
        case "fobo" :: "angular-locale_ln-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ln-cd.js")
        case "fobo" :: "angular-locale_en-dsrt-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-dsrt-us.js")
        case "fobo" :: "angular-locale_kea.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_kea.js")
        case "fobo" :: "angular-locale_zu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_zu.js")
        case "fobo" :: "angular-locale_sr-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sr-latn.js")
        case "fobo" :: "angular-locale_ro-ro.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ro-ro.js")
        case "fobo" :: "angular-locale_ru-kz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ru-kz.js")
        case "fobo" :: "angular-locale_en-nf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-nf.js")
        case "fobo" :: "angular-locale_brx-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_brx-in.js")
        case "fobo" :: "angular-locale_saq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_saq.js")
        case "fobo" :: "angular-locale_sw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sw.js")
        case "fobo" :: "angular-locale_bas-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bas-cm.js")
        case "fobo" :: "angular-locale_ms-latn-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ms-latn-sg.js")
        case "fobo" :: "angular-locale_da.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_da.js")

      }
    }

    lazy val angularjs153i18n3 = {
      ResourceServer.rewrite {

        case "fobo" :: "angular-locale_nso-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nso-za.js")
        case "fobo" :: "angular-locale_ur.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ur.js")
        case "fobo" :: "angular-locale_ca.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ca.js")
        case "fobo" :: "angular-locale_so-so.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_so-so.js")
        case "fobo" :: "angular-locale_en-sc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-sc.js")
        case "fobo" :: "angular-locale_en-nr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-nr.js")
        case "fobo" :: "angular-locale_en-as.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-as.js")
        case "fobo" :: "angular-locale_fr-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-cm.js")
        case "fobo" :: "angular-locale_hy-am.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_hy-am.js")
        case "fobo" :: "angular-locale_sv-ax.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sv-ax.js")
        case "fobo" :: "angular-locale_br.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_br.js")
        case "fobo" :: "angular-locale_bn-bd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bn-bd.js")
        case "fobo" :: "angular-locale_fur-it.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fur-it.js")
        case "fobo" :: "angular-locale_en-mg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-mg.js")
        case "fobo" :: "angular-locale_yi-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_yi-001.js")
        case "fobo" :: "angular-locale_gu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_gu.js")
        case "fobo" :: "angular-locale_asa.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_asa.js")
        case "fobo" :: "angular-locale_ha-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ha-latn.js")
        case "fobo" :: "angular-locale_zh-hans-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_zh-hans-sg.js")
        case "fobo" :: "angular-locale_nd-zw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nd-zw.js")
        case "fobo" :: "angular-locale_asa-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_asa-tz.js")
        case "fobo" :: "angular-locale_ms-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ms-latn.js")
        case "fobo" :: "angular-locale_vun-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_vun-tz.js")
        case "fobo" :: "angular-locale_shi-tfng-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_shi-tfng-ma.js")
        case "fobo" :: "angular-locale_km.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_km.js")
        case "fobo" :: "angular-locale_lv.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_lv.js")
        case "fobo" :: "angular-locale_eu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_eu.js")
        case "fobo" :: "angular-locale_mua.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_mua.js")
        case "fobo" :: "angular-locale_sv.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sv.js")
        case "fobo" :: "angular-locale_ky-cyrl-kg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ky-cyrl-kg.js")
        case "fobo" :: "angular-locale_en-ph.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ph.js")
        case "fobo" :: "angular-locale_en-vc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-vc.js")
        case "fobo" :: "angular-locale_teo-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_teo-ke.js")
        case "fobo" :: "angular-locale_fil.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_fil.js")
        case "fobo" :: "angular-locale_seh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_seh.js")
        case "fobo" :: "angular-locale_ks-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ks-arab.js")
        case "fobo" :: "angular-locale_en-ky.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ky.js")
        case "fobo" :: "angular-locale_shi-tfng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_shi-tfng.js")
        case "fobo" :: "angular-locale_kam-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_kam-ke.js")
        case "fobo" :: "angular-locale_rm-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_rm-ch.js")
        case "fobo" :: "angular-locale_swc.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_swc.js")
        case "fobo" :: "angular-locale_lt-lt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_lt-lt.js")
        case "fobo" :: "angular-locale_dz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_dz.js")
        case "fobo" :: "angular-locale_en-tc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-tc.js")
        case "fobo" :: "angular-locale_en-dm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-dm.js")
        case "fobo" :: "angular-locale_de-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_de-ch.js")
        case "fobo" :: "angular-locale_az-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_az-cyrl.js")
        case "fobo" :: "angular-locale_fr-mg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-mg.js")
        case "fobo" :: "angular-locale_lb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_lb.js")
        case "fobo" :: "angular-locale_en-je.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-je.js")
        case "fobo" :: "angular-locale_aa-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_aa-et.js")
        case "fobo" :: "angular-locale_en-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-be.js")
        case "fobo" :: "angular-locale_es-ve.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-ve.js")
        case "fobo" :: "angular-locale_ug.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ug.js")
        case "fobo" :: "angular-locale_en-bw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-bw.js")
        case "fobo" :: "angular-locale_fr-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-ma.js")
        case "fobo" :: "angular-locale_ru-kg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ru-kg.js")
        case "fobo" :: "angular-locale_en-jm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-jm.js")
        case "fobo" :: "angular-locale_seh-mz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_seh-mz.js")
        case "fobo" :: "angular-locale_ml-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ml-in.js")
        case "fobo" :: "angular-locale_sw-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sw-ke.js")
        case "fobo" :: "angular-locale_ts-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ts-za.js")
        case "fobo" :: "angular-locale_en-mh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-mh.js")
        case "fobo" :: "angular-locale_ii-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ii-cn.js")
        case "fobo" :: "angular-locale_bm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_bm.js")
        case "fobo" :: "angular-locale_ckb-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ckb-iq.js")
        case "fobo" :: "angular-locale_cy-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_cy-gb.js")
        case "fobo" :: "angular-locale_ar-sa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-sa.js")
        case "fobo" :: "angular-locale_ne-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ne-in.js")
        case "fobo" :: "angular-locale_es-pa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-pa.js")
        case "fobo" :: "angular-locale_pa-guru-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_pa-guru-in.js")
        case "fobo" :: "angular-locale_pl-pl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_pl-pl.js")
        case "fobo" :: "angular-locale_ka-ge.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ka-ge.js")
        case "fobo" :: "angular-locale_ta-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ta-in.js")
        case "fobo" :: "angular-locale_kde.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_kde.js")
        case "fobo" :: "angular-locale_shi-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_shi-latn.js")
        case "fobo" :: "angular-locale_nb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_nb.js")
        case "fobo" :: "angular-locale_en-lc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-lc.js")
        case "fobo" :: "angular-locale_en-pn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-pn.js")
        case "fobo" :: "angular-locale_ha.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ha.js")
        case "fobo" :: "angular-locale_bm-latn-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bm-latn-ml.js")
        case "fobo" :: "angular-locale_uk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_uk.js")
        case "fobo" :: "angular-locale_kl-gl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_kl-gl.js")
        case "fobo" :: "angular-locale_fr-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-ml.js")
        case "fobo" :: "angular-locale_dsb-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_dsb-de.js")
        case "fobo" :: "angular-locale_ff.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ff.js")
        case "fobo" :: "angular-locale_ar-ps.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-ps.js")
        case "fobo" :: "angular-locale_en-au.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-au.js")
        case "fobo" :: "angular-locale_ast-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ast-es.js")
        case "fobo" :: "angular-locale_mt-mt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_mt-mt.js")
        case "fobo" :: "angular-locale_teo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_teo.js")
        case "fobo" :: "angular-locale_swc-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_swc-cd.js")
        case "fobo" :: "angular-locale_st-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_st-za.js")
        case "fobo" :: "angular-locale_ckb-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ckb-latn.js")
        case "fobo" :: "angular-locale_lu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_lu.js")
        case "fobo" :: "angular-locale_ru-by.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ru-by.js")
        case "fobo" :: "angular-locale_en-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-gh.js")
        case "fobo" :: "angular-locale_ar-ly.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-ly.js")
        case "fobo" :: "angular-locale_ha-latn-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ha-latn-gh.js")
        case "fobo" :: "angular-locale_kln.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_kln.js")
        case "fobo" :: "angular-locale_en-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-sg.js")
        case "fobo" :: "angular-locale_en-mu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-mu.js")
        case "fobo" :: "angular-locale_ga-ie.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ga-ie.js")
        case "fobo" :: "angular-locale_fr-ga.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-ga.js")
        case "fobo" :: "angular-locale_fr-mf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-mf.js")
        case "fobo" :: "angular-locale_aa-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_aa-dj.js")
        case "fobo" :: "angular-locale_bas.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_bas.js")
        case "fobo" :: "angular-locale_nus-sd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nus-sd.js")
        case "fobo" :: "angular-locale_es-ec.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-ec.js")
        case "fobo" :: "angular-locale_ms-my.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ms-my.js")
        case "fobo" :: "angular-locale_mn-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_mn-cyrl.js")
        case "fobo" :: "angular-locale_rw-rw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_rw-rw.js")
        case "fobo" :: "angular-locale_zu-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_zu-za.js")
        case "fobo" :: "angular-locale_tl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_tl.js")
        case "fobo" :: "angular-locale_luo-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_luo-ke.js")
        case "fobo" :: "angular-locale_bs-cyrl-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bs-cyrl-ba.js")
        case "fobo" :: "angular-locale_twq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_twq.js")
        case "fobo" :: "angular-locale_fr-yt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-yt.js")
        case "fobo" :: "angular-locale_rn-bi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_rn-bi.js")
        case "fobo" :: "angular-locale_qu-pe.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_qu-pe.js")
        case "fobo" :: "angular-locale_ar-sy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-sy.js")
        case "fobo" :: "angular-locale_en-gd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-gd.js")
        case "fobo" :: "angular-locale_ta-lk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ta-lk.js")
        case "fobo" :: "angular-locale_en-gm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-gm.js")
        case "fobo" :: "angular-locale_nl-sr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nl-sr.js")
        case "fobo" :: "angular-locale_tr-cy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_tr-cy.js")
        case "fobo" :: "angular-locale_kkj.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_kkj.js")
        case "fobo" :: "angular-locale_it-it.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_it-it.js")
        case "fobo" :: "angular-locale_ga.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ga.js")
        case "fobo" :: "angular-locale_ss-sz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ss-sz.js")
        case "fobo" :: "angular-locale_sbp-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sbp-tz.js")
        case "fobo" :: "angular-locale_rw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_rw.js")
        case "fobo" :: "angular-locale_en-nz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-nz.js")
        case "fobo" :: "angular-locale_es-ic.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-ic.js")
        case "fobo" :: "angular-locale_agq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_agq.js")
        case "fobo" :: "angular-locale_ckb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ckb.js")
        case "fobo" :: "angular-locale_sk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sk.js")
        case "fobo" :: "angular-locale_bg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_bg.js")
        case "fobo" :: "angular-locale_cy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_cy.js")
        case "fobo" :: "angular-locale_sg-cf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sg-cf.js")
        case "fobo" :: "angular-locale_mfe.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_mfe.js")
        case "fobo" :: "angular-locale_nus.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_nus.js")
        case "fobo" :: "angular-locale_fr-bl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-bl.js")
        case "fobo" :: "angular-locale_lkt-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_lkt-us.js")
        case "fobo" :: "angular-locale_ja.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ja.js")
        case "fobo" :: "angular-locale_bs-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bs-latn.js")
        case "fobo" :: "angular-locale_vai-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_vai-latn.js")
        case "fobo" :: "angular-locale_ssy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ssy.js")
        case "fobo" :: "angular-locale_dua-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_dua-cm.js")
        case "fobo" :: "angular-locale_nd.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_nd.js")
        case "fobo" :: "angular-locale_fr-re.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-re.js")
        case "fobo" :: "angular-locale_ky.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ky.js")
        case "fobo" :: "angular-locale_si-lk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_si-lk.js")
        case "fobo" :: "angular-locale_es-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-es.js")
        case "fobo" :: "angular-locale_da-dk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_da-dk.js")
        case "fobo" :: "angular-locale_mn-cyrl-mn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_mn-cyrl-mn.js")
        case "fobo" :: "angular-locale_mer-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_mer-ke.js")
        case "fobo" :: "angular-locale_en-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-cm.js")
        case "fobo" :: "angular-locale_ru.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ru.js")
        case "fobo" :: "angular-locale_en-gy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-gy.js")
        case "fobo" :: "angular-locale_cgg-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_cgg-ug.js")
        case "fobo" :: "angular-locale_sbp.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sbp.js")
        case "fobo" :: "angular-locale_lo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_lo.js")
        case "fobo" :: "angular-locale_sr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sr.js")
        case "fobo" :: "angular-locale_en-fj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-fj.js")
        case "fobo" :: "angular-locale_tr-tr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_tr-tr.js")
        case "fobo" :: "angular-locale_th-th.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_th-th.js")
        case "fobo" :: "angular-locale_gsw-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_gsw-ch.js")
        case "fobo" :: "angular-locale_br-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_br-fr.js")
        case "fobo" :: "angular-locale_ms-latn-bn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ms-latn-bn.js")
        case "fobo" :: "angular-locale_yav-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_yav-cm.js")
        case "fobo" :: "angular-locale_fr-lu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-lu.js")
        case "fobo" :: "angular-locale_bez.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_bez.js")
        case "fobo" :: "angular-locale_rm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_rm.js")
        case "fobo" :: "angular-locale_zh-hant-tw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_zh-hant-tw.js")
        case "fobo" :: "angular-locale_en-sd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-sd.js")
        case "fobo" :: "angular-locale_zh-hant-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_zh-hant-hk.js")
        case "fobo" :: "angular-locale_ar-om.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-om.js")
        case "fobo" :: "angular-locale_en-ls.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ls.js")
        case "fobo" :: "angular-locale_fr-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-fr.js")
        case "fobo" :: "angular-locale_ar-sd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-sd.js")
        case "fobo" :: "angular-locale_as.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_as.js")
        case "fobo" :: "angular-locale_so-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_so-ke.js")
        case "fobo" :: "angular-locale_mg-mg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_mg-mg.js")
        case "fobo" :: "angular-locale_ar-mr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-mr.js")
        case "fobo" :: "angular-locale_ar-eh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-eh.js")
        case "fobo" :: "angular-locale_se-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_se-fi.js")
        case "fobo" :: "angular-locale_or.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_or.js")
        case "fobo" :: "angular-locale_fa-ir.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fa-ir.js")
        case "fobo" :: "angular-locale_gl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_gl.js")
        case "fobo" :: "angular-locale_vo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_vo.js")
        case "fobo" :: "angular-locale_ses.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ses.js")
        case "fobo" :: "angular-locale_kkj-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_kkj-cm.js")
        case "fobo" :: "angular-locale_fr-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-dj.js")
        case "fobo" :: "angular-locale_ar-qa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-qa.js")
        case "fobo" :: "angular-locale_iw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_iw.js")
        case "fobo" :: "angular-locale_sr-latn-me.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sr-latn-me.js")
        case "fobo" :: "angular-locale_el.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_el.js")
        case "fobo" :: "angular-locale_mer.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_mer.js")
        case "fobo" :: "angular-locale_fr-bi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-bi.js")

      }
    }

    lazy val angularjs153i18n4 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_naq-na.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_naq-na.js")
        case "fobo" :: "angular-locale_uz-arab-af.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_uz-arab-af.js")
        case "fobo" :: "angular-locale_ln-cf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ln-cf.js")
        case "fobo" :: "angular-locale_ar-jo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-jo.js")
        case "fobo" :: "angular-locale_zh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_zh.js")
        case "fobo" :: "angular-locale_uz-cyrl-uz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_uz-cyrl-uz.js")
        case "fobo" :: "angular-locale_sr-latn-xk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sr-latn-xk.js")
        case "fobo" :: "angular-locale_fr-rw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-rw.js")
        case "fobo" :: "angular-locale_vo-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_vo-001.js")
        case "fobo" :: "angular-locale_es-sv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-sv.js")
        case "fobo" :: "angular-locale_ca-es-valencia.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ca-es-valencia.js")
        case "fobo" :: "angular-locale_pa-guru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_pa-guru.js")
        case "fobo" :: "angular-locale_ewo-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ewo-cm.js")
        case "fobo" :: "angular-locale_st.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_st.js")
        case "fobo" :: "angular-locale_bm-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bm-latn.js")
        case "fobo" :: "angular-locale_yo-bj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_yo-bj.js")
        case "fobo" :: "angular-locale_dav.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_dav.js")
        case "fobo" :: "angular-locale_ewo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ewo.js")
        case "fobo" :: "angular-locale_nl-sx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nl-sx.js")
        case "fobo" :: "angular-locale_en-na.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-na.js")
        case "fobo" :: "angular-locale_en-mt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-mt.js")
        case "fobo" :: "angular-locale_sl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sl.js")
        case "fobo" :: "angular-locale_ig.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ig.js")
        case "fobo" :: "angular-locale_rof-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_rof-tz.js")
        case "fobo" :: "angular-locale_es-cl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-cl.js")
        case "fobo" :: "angular-locale_cs.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_cs.js")
        case "fobo" :: "angular-locale_yo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_yo.js")
        case "fobo" :: "angular-locale_sr-cyrl-me.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sr-cyrl-me.js")
        case "fobo" :: "angular-locale_en-fm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-fm.js")
        case "fobo" :: "angular-locale_fr-ca.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-ca.js")
        case "fobo" :: "angular-locale_brx.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_brx.js")
        case "fobo" :: "angular-locale_chr-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_chr-us.js")
        case "fobo" :: "angular-locale_ur-pk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ur-pk.js")
        case "fobo" :: "angular-locale_sq-mk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sq-mk.js")
        case "fobo" :: "angular-locale_en-ck.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ck.js")
        case "fobo" :: "angular-locale_dyo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_dyo.js")
        case "fobo" :: "angular-locale_is.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_is.js")
        case "fobo" :: "angular-locale_nr-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nr-za.js")
        case "fobo" :: "angular-locale_ff-mr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ff-mr.js")
        case "fobo" :: "angular-locale_ar-ss.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-ss.js")
        case "fobo" :: "angular-locale_ks.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ks.js")
        case "fobo" :: "angular-locale_xh-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_xh-za.js")
        case "fobo" :: "angular-locale_ak.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ak.js")
        case "fobo" :: "angular-locale_guz-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_guz-ke.js")
        case "fobo" :: "angular-locale_ta-my.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ta-my.js")
        case "fobo" :: "angular-locale_shi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_shi.js")
        case "fobo" :: "angular-locale_nl-cw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nl-cw.js")
        case "fobo" :: "angular-locale_kk-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_kk-cyrl.js")
        case "fobo" :: "angular-locale_ebu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ebu.js")
        case "fobo" :: "angular-locale_xog.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_xog.js")
        case "fobo" :: "angular-locale_fr-mr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-mr.js")
        case "fobo" :: "angular-locale_fr-gp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-gp.js")
        case "fobo" :: "angular-locale_ar-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-er.js")
        case "fobo" :: "angular-locale_nmg-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nmg-cm.js")
        case "fobo" :: "angular-locale_en-vi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-vi.js")
        case "fobo" :: "angular-locale_pt-mz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_pt-mz.js")
        case "fobo" :: "angular-locale_kk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_kk.js")
        case "fobo" :: "angular-locale_bn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_bn.js")
        case "fobo" :: "angular-locale_fr-pf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-pf.js")
        case "fobo" :: "angular-locale_haw-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_haw-us.js")
        case "fobo" :: "angular-locale_xh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_xh.js")
        case "fobo" :: "angular-locale_tig.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_tig.js")
        case "fobo" :: "angular-locale_en-ss.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ss.js")
        case "fobo" :: "angular-locale_ss-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ss-za.js")
        case "fobo" :: "angular-locale_dsb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_dsb.js")
        case "fobo" :: "angular-locale_zh-hans-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_zh-hans-hk.js")
        case "fobo" :: "angular-locale_ksh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ksh.js")
        case "fobo" :: "angular-locale_ha-latn-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ha-latn-ng.js")
        case "fobo" :: "angular-locale_hsb-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_hsb-de.js")
        case "fobo" :: "angular-locale_sv-se.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sv-se.js")
        case "fobo" :: "angular-locale_tn-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_tn-za.js")
        case "fobo" :: "angular-locale_ebu-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ebu-ke.js")
        case "fobo" :: "angular-locale_dje.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_dje.js")
        case "fobo" :: "angular-locale_am.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_am.js")
        case "fobo" :: "angular-locale_shi-latn-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_shi-latn-ma.js")
        case "fobo" :: "angular-locale_nl-aw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nl-aw.js")
        case "fobo" :: "angular-locale_bn-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bn-in.js")
        case "fobo" :: "angular-locale_ur-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ur-in.js")
        case "fobo" :: "angular-locale_bem.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_bem.js")
        case "fobo" :: "angular-locale_cs-cz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_cs-cz.js")
        case "fobo" :: "angular-locale_sr-cyrl-rs.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sr-cyrl-rs.js")
        case "fobo" :: "angular-locale_hy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_hy.js")
        case "fobo" :: "angular-locale_uz-latn-uz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_uz-latn-uz.js")
        case "fobo" :: "angular-locale_es.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_es.js")
        case "fobo" :: "angular-locale_as-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_as-in.js")
        case "fobo" :: "angular-locale_it.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_it.js")
        case "fobo" :: "angular-locale_ksb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ksb.js")
        case "fobo" :: "angular-locale_te.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_te.js")
        case "fobo" :: "angular-locale_fr-tg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-tg.js")
        case "fobo" :: "angular-locale_id-id.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_id-id.js")
        case "fobo" :: "angular-locale_af.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_af.js")
        case "fobo" :: "angular-locale_sah-ru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sah-ru.js")
        case "fobo" :: "angular-locale_wal-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_wal-et.js")
        case "fobo" :: "angular-locale_en-vu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-vu.js")
        case "fobo" :: "angular-locale_en-iso.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-iso.js")
        case "fobo" :: "angular-locale_zh-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_zh-hk.js")
        case "fobo" :: "angular-locale_nso.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_nso.js")
        case "fobo" :: "angular-locale_zh-hans.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_zh-hans.js")
        case "fobo" :: "angular-locale_kl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_kl.js")
        case "fobo" :: "angular-locale_ii.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ii.js")
        case "fobo" :: "angular-locale_ar-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-ma.js")
        case "fobo" :: "angular-locale_sn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sn.js")
        case "fobo" :: "angular-locale_es-ea.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-ea.js")
        case "fobo" :: "angular-locale_en-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-001.js")
        case "fobo" :: "angular-locale_zgh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_zgh.js")
        case "fobo" :: "angular-locale_ja-jp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ja-jp.js")
        case "fobo" :: "angular-locale_se.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_se.js")
        case "fobo" :: "angular-locale_nl-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nl-be.js")
        case "fobo" :: "angular-locale_gv-im.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_gv-im.js")
        case "fobo" :: "angular-locale_en-nu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-nu.js")
        case "fobo" :: "angular-locale_en-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-gb.js")
        case "fobo" :: "angular-locale_eu-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_eu-es.js")
        case "fobo" :: "angular-locale_hr-hr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_hr-hr.js")
        case "fobo" :: "angular-locale_sr-cyrl-xk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sr-cyrl-xk.js")
        case "fobo" :: "angular-locale_ca-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ca-fr.js")
        case "fobo" :: "angular-locale_el-gr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_el-gr.js")
        case "fobo" :: "angular-locale_wae-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_wae-ch.js")
        case "fobo" :: "angular-locale_bs-latn-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bs-latn-ba.js")
        case "fobo" :: "angular-locale_bo-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_bo-in.js")
        case "fobo" :: "angular-locale_uz-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_uz-cyrl.js")
        case "fobo" :: "angular-locale_vun.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_vun.js")
        case "fobo" :: "angular-locale_et.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_et.js")
        case "fobo" :: "angular-locale_ff-sn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ff-sn.js")
        case "fobo" :: "angular-locale_ar-eg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-eg.js")
        case "fobo" :: "angular-locale_mua-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_mua-cm.js")
        case "fobo" :: "angular-locale_byn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_byn.js")
        case "fobo" :: "angular-locale_en-sl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-sl.js")
        case "fobo" :: "angular-locale_en-pr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-pr.js")
        case "fobo" :: "angular-locale_zh-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_zh-cn.js")
        case "fobo" :: "angular-locale_mas.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_mas.js")
        case "fobo" :: "angular-locale_en-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ug.js")
        case "fobo" :: "angular-locale_wal.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_wal.js")
        case "fobo" :: "angular-locale_en-tk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-tk.js")
        case "fobo" :: "angular-locale_lkt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_lkt.js")
        case "fobo" :: "angular-locale_dav-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_dav-ke.js")
        case "fobo" :: "angular-locale_teo-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_teo-ug.js")
        case "fobo" :: "angular-locale_de-li.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_de-li.js")
        case "fobo" :: "angular-locale_ckb-latn-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ckb-latn-iq.js")
        case "fobo" :: "angular-locale_pa-arab-pk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_pa-arab-pk.js")
        case "fobo" :: "angular-locale_sr-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sr-cyrl.js")
        case "fobo" :: "angular-locale_ug-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ug-arab.js")
        case "fobo" :: "angular-locale_naq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_naq.js")
        case "fobo" :: "angular-locale_en-gg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-gg.js")
        case "fobo" :: "angular-locale_be-by.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_be-by.js")
        case "fobo" :: "angular-locale_kab-dz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_kab-dz.js")
        case "fobo" :: "angular-locale_lb-lu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_lb-lu.js")
        case "fobo" :: "angular-locale_en-cc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-cc.js")
        case "fobo" :: "angular-locale_ar-ae.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ar-ae.js")
        case "fobo" :: "angular-locale_en-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-hk.js")
        case "fobo" :: "angular-locale_fr-bj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-bj.js")
        case "fobo" :: "angular-locale_fr-dz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-dz.js")
        case "fobo" :: "angular-locale_sr-latn-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sr-latn-ba.js")
        case "fobo" :: "angular-locale_byn-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_byn-er.js")
        case "fobo" :: "angular-locale_es-ar.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-ar.js")
        case "fobo" :: "angular-locale_pl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_pl.js")
        case "fobo" :: "angular-locale_twq-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_twq-ne.js")
        case "fobo" :: "angular-locale_uz-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_uz-latn.js")
        case "fobo" :: "angular-locale_km-kh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_km-kh.js")
        case "fobo" :: "angular-locale_ta-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ta-sg.js")
        case "fobo" :: "angular-locale_ru-md.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ru-md.js")
        case "fobo" :: "angular-locale_luy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_luy.js")
        case "fobo" :: "angular-locale_de-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_de-be.js")
        case "fobo" :: "angular-locale_en-sx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-sx.js")
        case "fobo" :: "angular-locale_pa-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_pa-arab.js")
        case "fobo" :: "angular-locale_vai.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_vai.js")
        case "fobo" :: "angular-locale_jmc-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_jmc-tz.js")
        case "fobo" :: "angular-locale_rwk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_rwk.js")
        case "fobo" :: "angular-locale_fr-vu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fr-vu.js")
        case "fobo" :: "angular-locale_to.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_to.js")
        case "fobo" :: "angular-locale_dje-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_dje-ne.js")
        case "fobo" :: "angular-locale_es-hn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_es-hn.js")
        case "fobo" :: "angular-locale_en-ai.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ai.js")
        case "fobo" :: "angular-locale_he-il.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_he-il.js")
        case "fobo" :: "angular-locale_aa.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_aa.js")
        case "fobo" :: "angular-locale_en-tv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-tv.js")
        case "fobo" :: "angular-locale_qu-bo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_qu-bo.js")
        case "fobo" :: "angular-locale_pt-st.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_pt-st.js")
        case "fobo" :: "angular-locale_de-lu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_de-lu.js")
        case "fobo" :: "angular-locale_en-my.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-my.js")
        case "fobo" :: "angular-locale_mgo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_mgo.js")
        case "fobo" :: "angular-locale_si.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_si.js")
        case "fobo" :: "angular-locale_kam.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_kam.js")
        case "fobo" :: "angular-locale_dyo-sn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_dyo-sn.js")
        case "fobo" :: "angular-locale_en-pw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-pw.js")
        case "fobo" :: "angular-locale_it-sm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_it-sm.js")
        case "fobo" :: "angular-locale_ckb-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ckb-arab.js")
        case "fobo" :: "angular-locale_ti-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_ti-er.js")
        case "fobo" :: "angular-locale_sw-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_sw-cd.js")
        case "fobo" :: "angular-locale_el-cy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_el-cy.js")
        case "fobo" :: "angular-locale_mgo-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_mgo-cm.js")
        case "fobo" :: "angular-locale_or-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_or-in.js")
        case "fobo" :: "angular-locale_en-ag.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-ag.js")
        case "fobo" :: "angular-locale_sah.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sah.js")
        case "fobo" :: "angular-locale_nnh-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_nnh-cm.js")
        case "fobo" :: "angular-locale_om.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_om.js")
        case "fobo" :: "angular-locale_en-um.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-um.js")
        case "fobo" :: "angular-locale_hr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_hr.js")
        case "fobo" :: "angular-locale_vai-vaii.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_vai-vaii.js")
        case "fobo" :: "angular-locale_ml.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_ml.js")
        case "fobo" :: "angular-locale_en-zm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_en-zm.js")
        case "fobo" :: "angular-locale_fo-fo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.5.3",
               "i18n",
               "angular-locale_fo-fo.js")

      }
    }

    lazy val angularjs153i18n5 = {
      ResourceServer.rewrite {

        case "fobo" :: "sr-cyrl-rs.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sr-cyrl-rs.js")
        case "fobo" :: "ast-es.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ast-es.js")
        case "fobo" :: "uk-ua.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "uk-ua.js")
        case "fobo" :: "fr-fr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-fr.js")
        case "fobo" :: "bo-cn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bo-cn.js")
        case "fobo" :: "vai-latn-lr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "vai-latn-lr.js")
        case "fobo" :: "en-er.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-er.js")
        case "fobo" :: "fr-lu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-lu.js")
        case "fobo" :: "ar-kw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-kw.js")
        case "fobo" :: "so-dj.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "so-dj.js")
        case "fobo" :: "uk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "uk.js")
        case "fobo" :: "mas-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mas-ke.js")
        case "fobo" :: "ar-lb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-lb.js")
        case "fobo" :: "en-bm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-bm.js")
        case "fobo" :: "vai-vaii-lr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "vai-vaii-lr.js")
        case "fobo" :: "pa-arab.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pa-arab.js")
        case "fobo" :: "ar-mr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-mr.js")
        case "fobo" :: "kde.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kde.js")
        case "fobo" :: "dua.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "dua.js")
        case "fobo" :: "fr-be.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-be.js")
        case "fobo" :: "fi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fi.js")
        case "fobo" :: "en-fk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-fk.js")
        case "fobo" :: "ksf-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ksf-cm.js")
        case "fobo" :: "en-ai.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ai.js")
        case "fobo" :: "sr-cyrl-ba.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sr-cyrl-ba.js")
        case "fobo" :: "wae-ch.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "wae-ch.js")
        case "fobo" :: "fr-vu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-vu.js")
        case "fobo" :: "ha-latn-ne.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ha-latn-ne.js")
        case "fobo" :: "en-pr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-pr.js")
        case "fobo" :: "et.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "et.js")
        case "fobo" :: "ja.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ja.js")
        case "fobo" :: "nb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nb.js")
        case "fobo" :: "brx.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "brx.js")
        case "fobo" :: "en-dm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-dm.js")
        case "fobo" :: "jmc.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "jmc.js")
        case "fobo" :: "pt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pt.js")
        case "fobo" :: "sr-latn-me.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sr-latn-me.js")
        case "fobo" :: "kkj.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kkj.js")
        case "fobo" :: "ru-ua.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ru-ua.js")
        case "fobo" :: "nb-no.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nb-no.js")
        case "fobo" :: "ig-ng.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ig-ng.js")
        case "fobo" :: "en-je.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-je.js")
        case "fobo" :: "en-gh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-gh.js")
        case "fobo" :: "kea.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kea.js")
        case "fobo" :: "he-il.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "he-il.js")
        case "fobo" :: "gd-gb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "gd-gb.js")
        case "fobo" :: "fy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fy.js")
        case "fobo" :: "or.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "or.js")
        case "fobo" :: "es-py.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-py.js")
        case "fobo" :: "se-se.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "se-se.js")
        case "fobo" :: "sr-latn-rs.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sr-latn-rs.js")
        case "fobo" :: "asa-tz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "asa-tz.js")
        case "fobo" :: "aa.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "aa.js")
        case "fobo" :: "lu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lu.js")
        case "fobo" :: "en-mu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-mu.js")
        case "fobo" :: "dav-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "dav-ke.js")
        case "fobo" :: "nso.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nso.js")
        case "fobo" :: "fr-rw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-rw.js")
        case "fobo" :: "en-gy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-gy.js")
        case "fobo" :: "se-fi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "se-fi.js")
        case "fobo" :: "en-my.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-my.js")
        case "fobo" :: "br-fr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "br-fr.js")
        case "fobo" :: "sr-cyrl-xk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sr-cyrl-xk.js")
        case "fobo" :: "ur.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ur.js")
        case "fobo" :: "tg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tg.js")
        case "fobo" :: "se.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "se.js")
        case "fobo" :: "ks-arab.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ks-arab.js")
        case "fobo" :: "ms-my.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ms-my.js")
        case "fobo" :: "is.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "is.js")
        case "fobo" :: "ksf.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ksf.js")
        case "fobo" :: "tg-cyrl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tg-cyrl.js")
        case "fobo" :: "vi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "vi.js")
        case "fobo" :: "byn-er.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "byn-er.js")
        case "fobo" :: "fr-cd.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-cd.js")
        case "fobo" :: "it-it.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "it-it.js")
        case "fobo" :: "ml.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ml.js")
        case "fobo" :: "dz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "dz.js")
        case "fobo" :: "qu-ec.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "qu-ec.js")
        case "fobo" :: "ar-sa.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-sa.js")
        case "fobo" :: "es-419.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-419.js")
        case "fobo" :: "es-ve.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-ve.js")
        case "fobo" :: "ne-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ne-in.js")
        case "fobo" :: "en-au.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-au.js")
        case "fobo" :: "el-gr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "el-gr.js")
        case "fobo" :: "nl-be.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nl-be.js")
        case "fobo" :: "am.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "am.js")
        case "fobo" :: "ug-arab.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ug-arab.js")
        case "fobo" :: "fr-bl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-bl.js")
        case "fobo" :: "shi-latn-ma.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "shi-latn-ma.js")
        case "fobo" :: "fr-td.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-td.js")
        case "fobo" :: "fr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr.js")
        case "fobo" :: "chr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "chr.js")
        case "fobo" :: "os.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "os.js")
        case "fobo" :: "ln-ao.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ln-ao.js")
        case "fobo" :: "ko.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ko.js")
        case "fobo" :: "en-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-cm.js")
        case "fobo" :: "mer-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mer-ke.js")
        case "fobo" :: "en-pn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-pn.js")
        case "fobo" :: "se-no.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "se-no.js")
        case "fobo" :: "hu-hu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "hu-hu.js")
        case "fobo" :: "qu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "qu.js")
        case "fobo" :: "ti-et.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ti-et.js")
        case "fobo" :: "rwk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "rwk.js")
        case "fobo" :: "uz-latn-uz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "uz-latn-uz.js")
        case "fobo" :: "ks.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ks.js")
        case "fobo" :: "en-gd.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-gd.js")
        case "fobo" :: "fr-yt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-yt.js")
        case "fobo" :: "ln-cf.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ln-cf.js")
        case "fobo" :: "en-cc.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-cc.js")
        case "fobo" :: "ki.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ki.js")
        case "fobo" :: "eu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "eu.js")
        case "fobo" :: "guz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "guz.js")
        case "fobo" :: "tg-cyrl-tj.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tg-cyrl-tj.js")
        case "fobo" :: "lb-lu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lb-lu.js")
        case "fobo" :: "jgo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "jgo.js")
        case "fobo" :: "ar-eh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-eh.js")
        case "fobo" :: "xog-ug.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "xog-ug.js")
        case "fobo" :: "en-gg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-gg.js")
        case "fobo" :: "fi-fi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fi-fi.js")
        case "fobo" :: "seh-mz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "seh-mz.js")
        case "fobo" :: "tr-tr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tr-tr.js")
        case "fobo" :: "en-gm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-gm.js")
        case "fobo" :: "ar-001.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-001.js")
        case "fobo" :: "de-ch.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "de-ch.js")
        case "fobo" :: "no-no.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "no-no.js")
        case "fobo" :: "ks-arab-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ks-arab-in.js")
        case "fobo" :: "yo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "yo.js")
        case "fobo" :: "az-cyrl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "az-cyrl.js")
        case "fobo" :: "kab-dz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kab-dz.js")
        case "fobo" :: "en-nr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-nr.js")
        case "fobo" :: "as.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "as.js")
        case "fobo" :: "es-pe.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-pe.js")
        case "fobo" :: "uz-arab-af.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "uz-arab-af.js")
        case "fobo" :: "ru.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ru.js")
        case "fobo" :: "fr-km.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-km.js")
        case "fobo" :: "tzm-latn-ma.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tzm-latn-ma.js")
        case "fobo" :: "en-rw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-rw.js")
        case "fobo" :: "fr-ma.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-ma.js")
        case "fobo" :: "tzm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tzm.js")
        case "fobo" :: "ha-latn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ha-latn.js")
        case "fobo" :: "ug.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ug.js")
        case "fobo" :: "agq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "agq.js")
        case "fobo" :: "ca-fr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ca-fr.js")
        case "fobo" :: "ckb-arab.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ckb-arab.js")
        case "fobo" :: "en-sl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-sl.js")
        case "fobo" :: "en-sh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-sh.js")
        case "fobo" :: "naq-na.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "naq-na.js")
        case "fobo" :: "es-ar.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-ar.js")
        case "fobo" :: "en-ng.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ng.js")
        case "fobo" :: "es-ec.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-ec.js")
        case "fobo" :: "fr-cf.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-cf.js")
        case "fobo" :: "ar-bh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-bh.js")
        case "fobo" :: "no.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "no.js")
        case "fobo" :: "yo-bj.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "yo-bj.js")
        case "fobo" :: "ln.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ln.js")
        case "fobo" :: "sq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sq.js")
        case "fobo" :: "tl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tl.js")
        case "fobo" :: "mua-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mua-cm.js")
        case "fobo" :: "lag-tz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lag-tz.js")
        case "fobo" :: "zh-hant.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zh-hant.js")
        case "fobo" :: "fr-sc.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-sc.js")
        case "fobo" :: "sr-cyrl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sr-cyrl.js")
        case "fobo" :: "fr-tg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-tg.js")
        case "fobo" :: "haw-us.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "haw-us.js")
        case "fobo" :: "dav.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "dav.js")
        case "fobo" :: "cgg-ug.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "cgg-ug.js")
        case "fobo" :: "en-dsrt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-dsrt.js")
        case "fobo" :: "ms-latn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ms-latn.js")
        case "fobo" :: "brx-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "brx-in.js")
        case "fobo" :: "es-uy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-uy.js")
        case "fobo" :: "en-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ke.js")
        case "fobo" :: "fr-pf.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-pf.js")
        case "fobo" :: "en-ss.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ss.js")
        case "fobo" :: "de-de.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "de-de.js")
        case "fobo" :: "te-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "te-in.js")

      }
    }

    lazy val angularjs153i18n6 = {
      ResourceServer.rewrite {

        case "fobo" :: "fr-bf.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-bf.js")
        case "fobo" :: "af-za.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "af-za.js")
        case "fobo" :: "ha.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ha.js")
        case "fobo" :: "en-ag.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ag.js")
        case "fobo" :: "tr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tr.js")
        case "fobo" :: "ja-jp.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ja-jp.js")
        case "fobo" :: "pa-guru.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pa-guru.js")
        case "fobo" :: "en-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-in.js")
        case "fobo" :: "zh-hk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zh-hk.js")
        case "fobo" :: "en-gi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-gi.js")
        case "fobo" :: "ar-ps.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-ps.js")
        case "fobo" :: "nn-no.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nn-no.js")
        case "fobo" :: "sg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sg.js")
        case "fobo" :: "ps.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ps.js")
        case "fobo" :: "twq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "twq.js")
        case "fobo" :: "hsb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "hsb.js")
        case "fobo" :: "si.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "si.js")
        case "fobo" :: "az-latn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "az-latn.js")
        case "fobo" :: "id.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "id.js")
        case "fobo" :: "ha-latn-ng.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ha-latn-ng.js")
        case "fobo" :: "ca-es-valencia.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ca-es-valencia.js")
        case "fobo" :: "en-pk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-pk.js")
        case "fobo" :: "mas-tz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mas-tz.js")
        case "fobo" :: "ss.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ss.js")
        case "fobo" :: "ar-om.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-om.js")
        case "fobo" :: "ga-ie.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ga-ie.js")
        case "fobo" :: "lg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lg.js")
        case "fobo" :: "ar-iq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-iq.js")
        case "fobo" :: "fr-ca.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-ca.js")
        case "fobo" :: "pa-arab-pk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pa-arab-pk.js")
        case "fobo" :: "ia-fr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ia-fr.js")
        case "fobo" :: "ar-so.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-so.js")
        case "fobo" :: "sr-latn-xk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sr-latn-xk.js")
        case "fobo" :: "zh-hant-hk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zh-hant-hk.js")
        case "fobo" :: "nl-sr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nl-sr.js")
        case "fobo" :: "iw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "iw.js")
        case "fobo" :: "en-tz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-tz.js")
        case "fobo" :: "mg-mg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mg-mg.js")
        case "fobo" :: "ar-er.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-er.js")
        case "fobo" :: "tig.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tig.js")
        case "fobo" :: "en-mp.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-mp.js")
        case "fobo" :: "zu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zu.js")
        case "fobo" :: "sah-ru.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sah-ru.js")
        case "fobo" :: "ti.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ti.js")
        case "fobo" :: "om-et.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "om-et.js")
        case "fobo" :: "fo-fo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fo-fo.js")
        case "fobo" :: "sw-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sw-ke.js")
        case "fobo" :: "fr-ht.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-ht.js")
        case "fobo" :: "ckb-iq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ckb-iq.js")
        case "fobo" :: "kea-cv.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kea-cv.js")
        case "fobo" :: "mgh-mz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mgh-mz.js")
        case "fobo" :: "nd-zw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nd-zw.js")
        case "fobo" :: "lkt-us.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lkt-us.js")
        case "fobo" :: "vun-tz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "vun-tz.js")
        case "fobo" :: "ml-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ml-in.js")
        case "fobo" :: "nl-bq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nl-bq.js")
        case "fobo" :: "mr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mr.js")
        case "fobo" :: "sbp-tz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sbp-tz.js")
        case "fobo" :: "fr-ga.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-ga.js")
        case "fobo" :: "wal.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "wal.js")
        case "fobo" :: "cs.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "cs.js")
        case "fobo" :: "vai-vaii.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "vai-vaii.js")
        case "fobo" :: "el.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "el.js")
        case "fobo" :: "hr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "hr.js")
        case "fobo" :: "fa-af.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fa-af.js")
        case "fobo" :: "byn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "byn.js")
        case "fobo" :: "om-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "om-ke.js")
        case "fobo" :: "ta-sg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ta-sg.js")
        case "fobo" :: "dje-ne.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "dje-ne.js")
        case "fobo" :: "gsw-fr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "gsw-fr.js")
        case "fobo" :: "fr-re.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-re.js")
        case "fobo" :: "ckb-latn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ckb-latn.js")
        case "fobo" :: "en-ki.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ki.js")
        case "fobo" :: "lb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lb.js")
        case "fobo" :: "en-nf.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-nf.js")
        case "fobo" :: "sg-cf.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sg-cf.js")
        case "fobo" :: "ts.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ts.js")
        case "fobo" :: "ee.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ee.js")
        case "fobo" :: "vi-vn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "vi-vn.js")
        case "fobo" :: "fr-gn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-gn.js")
        case "fobo" :: "pt-cv.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pt-cv.js")
        case "fobo" :: "nyn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nyn.js")
        case "fobo" :: "tr-cy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tr-cy.js")
        case "fobo" :: "lg-ug.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lg-ug.js")
        case "fobo" :: "shi-tfng.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "shi-tfng.js")
        case "fobo" :: "tn-za.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tn-za.js")
        case "fobo" :: "ssy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ssy.js")
        case "fobo" :: "zh-cn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zh-cn.js")
        case "fobo" :: "en-ky.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ky.js")
        case "fobo" :: "hr-hr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "hr-hr.js")
        case "fobo" :: "az-cyrl-az.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "az-cyrl-az.js")
        case "fobo" :: "kam-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kam-ke.js")
        case "fobo" :: "ii.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ii.js")
        case "fobo" :: "ln-cd.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ln-cd.js")
        case "fobo" :: "yi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "yi.js")
        case "fobo" :: "bn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bn.js")
        case "fobo" :: "en-ie.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ie.js")
        case "fobo" :: "en-mw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-mw.js")
        case "fobo" :: "ff-sn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ff-sn.js")
        case "fobo" :: "sw-tz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sw-tz.js")
        case "fobo" :: "bm-ml.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bm-ml.js")
        case "fobo" :: "az-latn-az.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "az-latn-az.js")
        case "fobo" :: "seh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "seh.js")
        case "fobo" :: "da-gl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "da-gl.js")
        case "fobo" :: "fr-bi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-bi.js")
        case "fobo" :: "tn-bw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tn-bw.js")
        case "fobo" :: "en-im.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-im.js")
        case "fobo" :: "ar-dz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-dz.js")
        case "fobo" :: "bg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bg.js")
        case "fobo" :: "rof-tz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "rof-tz.js")
        case "fobo" :: "gl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "gl.js")
        case "fobo" :: "es-es.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-es.js")
        case "fobo" :: "es-gt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-gt.js")
        case "fobo" :: "sr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sr.js")
        case "fobo" :: "fr-cg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-cg.js")
        case "fobo" :: "en-mg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-mg.js")
        case "fobo" :: "en.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en.js")
        case "fobo" :: "shi-latn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "shi-latn.js")
        case "fobo" :: "ar-jo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-jo.js")
        case "fobo" :: "lag.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lag.js")
        case "fobo" :: "ta.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ta.js")
        case "fobo" :: "nnh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nnh.js")
        case "fobo" :: "kk-cyrl-kz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kk-cyrl-kz.js")
        case "fobo" :: "lv.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lv.js")
        case "fobo" :: "pt-mz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pt-mz.js")
        case "fobo" :: "es-ph.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-ph.js")
        case "fobo" :: "ar-dj.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-dj.js")
        case "fobo" :: "kw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kw.js")
        case "fobo" :: "si-lk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "si-lk.js")
        case "fobo" :: "es-pr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-pr.js")
        case "fobo" :: "kln.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kln.js")
        case "fobo" :: "en-nz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-nz.js")
        case "fobo" :: "gsw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "gsw.js")
        case "fobo" :: "bs-latn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bs-latn.js")
        case "fobo" :: "fa-ir.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fa-ir.js")
        case "fobo" :: "es-mx.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-mx.js")
        case "fobo" :: "en-sc.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-sc.js")
        case "fobo" :: "af.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "af.js")
        case "fobo" :: "bas.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bas.js")
        case "fobo" :: "teo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "teo.js")
        case "fobo" :: "th.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "th.js")
        case "fobo" :: "en-001.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-001.js")
        case "fobo" :: "fil.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fil.js")
        case "fobo" :: "en-vi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-vi.js")
        case "fobo" :: "hsb-de.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "hsb-de.js")
        case "fobo" :: "is-is.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "is-is.js")
        case "fobo" :: "ms-latn-my.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ms-latn-my.js")
        case "fobo" :: "ff.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ff.js")
        case "fobo" :: "ar-qa.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-qa.js")
        case "fobo" :: "fr-dj.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-dj.js")
        case "fobo" :: "rw-rw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "rw-rw.js")
        case "fobo" :: "en-jm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-jm.js")
        case "fobo" :: "vun.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "vun.js")
        case "fobo" :: "es-co.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-co.js")
        case "fobo" :: "sw-cd.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sw-cd.js")
        case "fobo" :: "sv-se.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sv-se.js")
        case "fobo" :: "sbp.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sbp.js")
        case "fobo" :: "ru-md.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ru-md.js")
        case "fobo" :: "nso-za.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nso-za.js")
        case "fobo" :: "chr-us.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "chr-us.js")
        case "fobo" :: "nd.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nd.js")
        case "fobo" :: "en-mo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-mo.js")
        case "fobo" :: "sw-ug.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sw-ug.js")
        case "fobo" :: "ii-cn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ii-cn.js")
        case "fobo" :: "agq-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "agq-cm.js")
        case "fobo" :: "ne.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ne.js")
        case "fobo" :: "fr-gq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-gq.js")
        case "fobo" :: "nn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nn.js")
        case "fobo" :: "gu-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "gu-in.js")
        case "fobo" :: "ksb-tz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ksb-tz.js")
        case "fobo" :: "sq-al.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sq-al.js")
        case "fobo" :: "fa.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fa.js")
        case "fobo" :: "ewo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ewo.js")
        case "fobo" :: "vo-001.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "vo-001.js")
        case "fobo" :: "kn-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kn-in.js")
        case "fobo" :: "en-bb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-bb.js")
        case "fobo" :: "sv.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sv.js")
        case "fobo" :: "fo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fo.js")
        case "fobo" :: "zh-hans.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zh-hans.js")
        case "fobo" :: "or-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "or-in.js")
        case "fobo" :: "bm-latn-ml.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bm-latn-ml.js")
        case "fobo" :: "en-cx.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-cx.js")
        case "fobo" :: "pt-pt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pt-pt.js")
        case "fobo" :: "nus.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nus.js")
        case "fobo" :: "ar-km.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-km.js")
        case "fobo" :: "so.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "so.js")
        case "fobo" :: "sk-sk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sk-sk.js")
        case "fobo" :: "af-na.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "af-na.js")
        case "fobo" :: "en-tk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-tk.js")
        case "fobo" :: "eo-001.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "eo-001.js")
        case "fobo" :: "zgh-ma.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zgh-ma.js")

      }
    }

    lazy val angularjs153i18n7 = {
      ResourceServer.rewrite {

        case "fobo" :: "fr-mr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-mr.js")
        case "fobo" :: "hu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "hu.js")
        case "fobo" :: "vai-latn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "vai-latn.js")
        case "fobo" :: "en-fj.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-fj.js")
        case "fobo" :: "bg-bg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bg-bg.js")
        case "fobo" :: "naq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "naq.js")
        case "fobo" :: "fr-sy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-sy.js")
        case "fobo" :: "en-zw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-zw.js")
        case "fobo" :: "saq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "saq.js")
        case "fobo" :: "uz-arab.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "uz-arab.js")
        case "fobo" :: "ee-gh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ee-gh.js")
        case "fobo" :: "nl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nl.js")
        case "fobo" :: "twq-ne.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "twq-ne.js")
        case "fobo" :: "en-150.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-150.js")
        case "fobo" :: "ar-tn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-tn.js")
        case "fobo" :: "ms-latn-bn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ms-latn-bn.js")
        case "fobo" :: "nl-cw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nl-cw.js")
        case "fobo" :: "xh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "xh.js")
        case "fobo" :: "sv-ax.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sv-ax.js")
        case "fobo" :: "yav-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "yav-cm.js")
        case "fobo" :: "wae.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "wae.js")
        case "fobo" :: "ro-ro.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ro-ro.js")
        case "fobo" :: "fr-ch.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-ch.js")
        case "fobo" :: "ca.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ca.js")
        case "fobo" :: "kam.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kam.js")
        case "fobo" :: "es-us.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-us.js")
        case "fobo" :: "sl-si.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sl-si.js")
        case "fobo" :: "rn-bi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "rn-bi.js")
        case "fobo" :: "shi-tfng-ma.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "shi-tfng-ma.js")
        case "fobo" :: "ee-tg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ee-tg.js")
        case "fobo" :: "ko-kr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ko-kr.js")
        case "fobo" :: "so-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "so-ke.js")
        case "fobo" :: "fr-ci.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-ci.js")
        case "fobo" :: "en-mh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-mh.js")
        case "fobo" :: "xh-za.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "xh-za.js")
        case "fobo" :: "en-ls.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ls.js")
        case "fobo" :: "mgh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mgh.js")
        case "fobo" :: "pt-br.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pt-br.js")
        case "fobo" :: "nmg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nmg.js")
        case "fobo" :: "sr-latn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sr-latn.js")
        case "fobo" :: "az.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "az.js")
        case "fobo" :: "de-li.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "de-li.js")
        case "fobo" :: "en-ms.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ms.js")
        case "fobo" :: "en-ck.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ck.js")
        case "fobo" :: "fr-nc.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-nc.js")
        case "fobo" :: "vai.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "vai.js")
        case "fobo" :: "sr-latn-ba.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sr-latn-ba.js")
        case "fobo" :: "mua.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mua.js")
        case "fobo" :: "en-mt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-mt.js")
        case "fobo" :: "ksh-de.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ksh-de.js")
        case "fobo" :: "zh-tw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zh-tw.js")
        case "fobo" :: "hy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "hy.js")
        case "fobo" :: "ses.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ses.js")
        case "fobo" :: "en-lc.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-lc.js")
        case "fobo" :: "en-ph.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ph.js")
        case "fobo" :: "jgo-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "jgo-cm.js")
        case "fobo" :: "luo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "luo.js")
        case "fobo" :: "zh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zh.js")
        case "fobo" :: "he.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "he.js")
        case "fobo" :: "bem-zm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bem-zm.js")
        case "fobo" :: "uz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "uz.js")
        case "fobo" :: "fr-ne.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-ne.js")
        case "fobo" :: "nl-aw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nl-aw.js")
        case "fobo" :: "bo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bo.js")
        case "fobo" :: "ki-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ki-ke.js")
        case "fobo" :: "en-sg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-sg.js")
        case "fobo" :: "gsw-li.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "gsw-li.js")
        case "fobo" :: "smn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "smn.js")
        case "fobo" :: "yo-ng.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "yo-ng.js")
        case "fobo" :: "os-ge.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "os-ge.js")
        case "fobo" :: "ru-kz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ru-kz.js")
        case "fobo" :: "nus-sd.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nus-sd.js")
        case "fobo" :: "sn-zw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sn-zw.js")
        case "fobo" :: "zh-hant-mo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zh-hant-mo.js")
        case "fobo" :: "ve-za.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ve-za.js")
        case "fobo" :: "es-ea.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-ea.js")
        case "fobo" :: "es-do.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-do.js")
        case "fobo" :: "ca-ad.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ca-ad.js")
        case "fobo" :: "cgg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "cgg.js")
        case "fobo" :: "bn-bd.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bn-bd.js")
        case "fobo" :: "ast.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ast.js")
        case "fobo" :: "en-bz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-bz.js")
        case "fobo" :: "ss-sz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ss-sz.js")
        case "fobo" :: "kk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kk.js")
        case "fobo" :: "en-iso.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-iso.js")
        case "fobo" :: "mt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mt.js")
        case "fobo" :: "to-to.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "to-to.js")
        case "fobo" :: "en-gu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-gu.js")
        case "fobo" :: "yav.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "yav.js")
        case "fobo" :: "ar-ae.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-ae.js")
        case "fobo" :: "ckb-latn-iq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ckb-latn-iq.js")
        case "fobo" :: "fr-wf.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-wf.js")
        case "fobo" :: "gv-im.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "gv-im.js")
        case "fobo" :: "es-gq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-gq.js")
        case "fobo" :: "en-dg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-dg.js")
        case "fobo" :: "gl-es.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "gl-es.js")
        case "fobo" :: "ig.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ig.js")
        case "fobo" :: "es.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es.js")
        case "fobo" :: "ca-es.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ca-es.js")
        case "fobo" :: "en-ug.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ug.js")
        case "fobo" :: "en-za.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-za.js")
        case "fobo" :: "fr-dz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-dz.js")
        case "fobo" :: "ar-sd.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-sd.js")
        case "fobo" :: "nnh-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nnh-cm.js")
        case "fobo" :: "ky.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ky.js")
        case "fobo" :: "cy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "cy.js")
        case "fobo" :: "rof.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "rof.js")
        case "fobo" :: "fr-pm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-pm.js")
        case "fobo" :: "zh-hans-cn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zh-hans-cn.js")
        case "fobo" :: "yi-001.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "yi-001.js")
        case "fobo" :: "en-dsrt-us.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-dsrt-us.js")
        case "fobo" :: "ksh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ksh.js")
        case "fobo" :: "ak-gh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ak-gh.js")
        case "fobo" :: "en-zm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-zm.js")
        case "fobo" :: "mgo-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mgo-cm.js")
        case "fobo" :: "id-id.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "id-id.js")
        case "fobo" :: "gd.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "gd.js")
        case "fobo" :: "be-by.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "be-by.js")
        case "fobo" :: "uz-cyrl-uz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "uz-cyrl-uz.js")
        case "fobo" :: "es-ni.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-ni.js")
        case "fobo" :: "en-ws.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ws.js")
        case "fobo" :: "hr-ba.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "hr-ba.js")
        case "fobo" :: "ky-cyrl-kg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ky-cyrl-kg.js")
        case "fobo" :: "en-sx.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-sx.js")
        case "fobo" :: "ru-ru.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ru-ru.js")
        case "fobo" :: "en-as.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-as.js")
        case "fobo" :: "kw-gb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kw-gb.js")
        case "fobo" :: "fr-gf.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-gf.js")
        case "fobo" :: "lv-lv.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lv-lv.js")
        case "fobo" :: "nl-sx.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nl-sx.js")
        case "fobo" :: "so-et.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "so-et.js")
        case "fobo" :: "khq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "khq.js")
        case "fobo" :: "rwk-tz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "rwk-tz.js")
        case "fobo" :: "el-cy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "el-cy.js")
        case "fobo" :: "my.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "my.js")
        case "fobo" :: "fr-mf.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-mf.js")
        case "fobo" :: "th-th.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "th-th.js")
        case "fobo" :: "te.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "te.js")
        case "fobo" :: "zgh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zgh.js")
        case "fobo" :: "luo-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "luo-ke.js")
        case "fobo" :: "fr-ml.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-ml.js")
        case "fobo" :: "ckb-ir.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ckb-ir.js")
        case "fobo" :: "ps-af.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ps-af.js")
        case "fobo" :: "mer.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mer.js")
        case "fobo" :: "da-dk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "da-dk.js")
        case "fobo" :: "sq-xk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sq-xk.js")
        case "fobo" :: "mn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mn.js")
        case "fobo" :: "ewo-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ewo-cm.js")
        case "fobo" :: "en-hk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-hk.js")
        case "fobo" :: "bem.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bem.js")
        case "fobo" :: "en-tv.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-tv.js")
        case "fobo" :: "fr-mu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-mu.js")
        case "fobo" :: "fil-ph.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fil-ph.js")
        case "fobo" :: "aa-et.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "aa-et.js")
        case "fobo" :: "am-et.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "am-et.js")
        case "fobo" :: "es-ic.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-ic.js")
        case "fobo" :: "mgo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mgo.js")
        case "fobo" :: "lo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lo.js")
        case "fobo" :: "nyn-ug.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nyn-ug.js")
        case "fobo" :: "lt-lt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lt-lt.js")
        case "fobo" :: "dje.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "dje.js")
        case "fobo" :: "en-us.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-us.js")
        case "fobo" :: "jmc-tz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "jmc-tz.js")
        case "fobo" :: "sah.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sah.js")
        case "fobo" :: "lo-la.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lo-la.js")
        case "fobo" :: "uz-latn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "uz-latn.js")
        case "fobo" :: "vo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "vo.js")
        case "fobo" :: "kab.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kab.js")
        case "fobo" :: "sr-cyrl-me.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sr-cyrl-me.js")
        case "fobo" :: "ms-bn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ms-bn.js")
        case "fobo" :: "rm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "rm.js")
        case "fobo" :: "tig-er.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tig-er.js")
        case "fobo" :: "ckb-arab-ir.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ckb-arab-ir.js")
        case "fobo" :: "ar-ss.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-ss.js")
        case "fobo" :: "en-vu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-vu.js")
        case "fobo" :: "ca-it.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ca-it.js")
        case "fobo" :: "ksb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ksb.js")
        case "fobo" :: "en-be.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-be.js")
        case "fobo" :: "kln-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kln-ke.js")
        case "fobo" :: "de.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "de.js")
        case "fobo" :: "ar-ye.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-ye.js")
        case "fobo" :: "dsb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "dsb.js")
        case "fobo" :: "fr-mg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-mg.js")
        case "fobo" :: "hi-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "hi-in.js")
        case "fobo" :: "ga.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ga.js")
        case "fobo" :: "xog.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "xog.js")
        case "fobo" :: "to.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "to.js")
        case "fobo" :: "luy-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "luy-ke.js")
        case "fobo" :: "ar-ly.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-ly.js")
        case "fobo" :: "bs-latn-ba.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bs-latn-ba.js")
        case "fobo" :: "pa-guru-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pa-guru-in.js")

      }
    }

    lazy val angularjs153i18n8 = {
      ResourceServer.rewrite {

        case "fobo" :: "pl-pl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pl-pl.js")
        case "fobo" :: "ar-sy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-sy.js")
        case "fobo" :: "br.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "br.js")
        case "fobo" :: "fy-nl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fy-nl.js")
        case "fobo" :: "km.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "km.js")
        case "fobo" :: "de-be.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "de-be.js")
        case "fobo" :: "en-nu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-nu.js")
        case "fobo" :: "en-lr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-lr.js")
        case "fobo" :: "es-pa.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-pa.js")
        case "fobo" :: "kn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kn.js")
        case "fobo" :: "ko-kp.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ko-kp.js")
        case "fobo" :: "dua-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "dua-cm.js")
        case "fobo" :: "bs.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bs.js")
        case "fobo" :: "sk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sk.js")
        case "fobo" :: "swc-cd.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "swc-cd.js")
        case "fobo" :: "cs-cz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "cs-cz.js")
        case "fobo" :: "in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "in.js")
        case "fobo" :: "bm-latn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bm-latn.js")
        case "fobo" :: "sv-fi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sv-fi.js")
        case "fobo" :: "teo-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "teo-ke.js")
        case "fobo" :: "haw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "haw.js")
        case "fobo" :: "ve.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ve.js")
        case "fobo" :: "bm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bm.js")
        case "fobo" :: "smn-fi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "smn-fi.js")
        case "fobo" :: "ia.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ia.js")
        case "fobo" :: "ms.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ms.js")
        case "fobo" :: "luy.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "luy.js")
        case "fobo" :: "pt-gw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pt-gw.js")
        case "fobo" :: "aa-dj.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "aa-dj.js")
        case "fobo" :: "en-vc.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-vc.js")
        case "fobo" :: "rn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "rn.js")
        case "fobo" :: "fur-it.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fur-it.js")
        case "fobo" :: "pt-tl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pt-tl.js")
        case "fobo" :: "fur.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fur.js")
        case "fobo" :: "km-kh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "km-kh.js")
        case "fobo" :: "nl-nl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nl-nl.js")
        case "fobo" :: "dz-bt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "dz-bt.js")
        case "fobo" :: "sw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sw.js")
        case "fobo" :: "it.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "it.js")
        case "fobo" :: "en-na.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-na.js")
        case "fobo" :: "pl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pl.js")
        case "fobo" :: "ug-arab-cn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ug-arab-cn.js")
        case "fobo" :: "qu-pe.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "qu-pe.js")
        case "fobo" :: "dsb-de.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "dsb-de.js")
        case "fobo" :: "st-ls.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "st-ls.js")
        case "fobo" :: "ff-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ff-cm.js")
        case "fobo" :: "it-ch.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "it-ch.js")
        case "fobo" :: "mfe.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mfe.js")
        case "fobo" :: "en-sz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-sz.js")
        case "fobo" :: "bas-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bas-cm.js")
        case "fobo" :: "st-za.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "st-za.js")
        case "fobo" :: "ka.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ka.js")
        case "fobo" :: "rm-ch.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "rm-ch.js")
        case "fobo" :: "teo-ug.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "teo-ug.js")
        case "fobo" :: "mt-mt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mt-mt.js")
        case "fobo" :: "dyo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "dyo.js")
        case "fobo" :: "asa.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "asa.js")
        case "fobo" :: "ru-by.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ru-by.js")
        case "fobo" :: "ak.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ak.js")
        case "fobo" :: "ss-za.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ss-za.js")
        case "fobo" :: "ur-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ur-in.js")
        case "fobo" :: "en-ca.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-ca.js")
        case "fobo" :: "fr-gp.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-gp.js")
        case "fobo" :: "my-mm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "my-mm.js")
        case "fobo" :: "os-ru.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "os-ru.js")
        case "fobo" :: "ta-lk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ta-lk.js")
        case "fobo" :: "nr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nr.js")
        case "fobo" :: "en-kn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-kn.js")
        case "fobo" :: "mn-cyrl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mn-cyrl.js")
        case "fobo" :: "sl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sl.js")
        case "fobo" :: "pt-mo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pt-mo.js")
        case "fobo" :: "pt-st.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pt-st.js")
        case "fobo" :: "en-tt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-tt.js")
        case "fobo" :: "ar.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar.js")
        case "fobo" :: "zh-hans-hk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zh-hans-hk.js")
        case "fobo" :: "ta-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ta-in.js")
        case "fobo" :: "en-tc.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-tc.js")
        case "fobo" :: "en-bw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-bw.js")
        case "fobo" :: "fr-tn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-tn.js")
        case "fobo" :: "en-um.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-um.js")
        case "fobo" :: "kok.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kok.js")
        case "fobo" :: "mas.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mas.js")
        case "fobo" :: "ln-cg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ln-cg.js")
        case "fobo" :: "en-sb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-sb.js")
        case "fobo" :: "de-lu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "de-lu.js")
        case "fobo" :: "ti-er.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ti-er.js")
        case "fobo" :: "bez.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bez.js")
        case "fobo" :: "es-bo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-bo.js")
        case "fobo" :: "st.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "st.js")
        case "fobo" :: "en-gb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-gb.js")
        case "fobo" :: "be.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "be.js")
        case "fobo" :: "it-sm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "it-sm.js")
        case "fobo" :: "ky-cyrl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ky-cyrl.js")
        case "fobo" :: "swc.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "swc.js")
        case "fobo" :: "saq-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "saq-ke.js")
        case "fobo" :: "fr-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-cm.js")
        case "fobo" :: "ssy-er.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ssy-er.js")
        case "fobo" :: "zh-hans-sg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zh-hans-sg.js")
        case "fobo" :: "ses-ml.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ses-ml.js")
        case "fobo" :: "ms-latn-sg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ms-latn-sg.js")
        case "fobo" :: "sn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sn.js")
        case "fobo" :: "es-sv.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-sv.js")
        case "fobo" :: "nmg-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nmg-cm.js")
        case "fobo" :: "mr-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mr-in.js")
        case "fobo" :: "da.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "da.js")
        case "fobo" :: "guz-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "guz-ke.js")
        case "fobo" :: "ro-md.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ro-md.js")
        case "fobo" :: "en-vg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-vg.js")
        case "fobo" :: "tzm-latn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tzm-latn.js")
        case "fobo" :: "sq-mk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "sq-mk.js")
        case "fobo" :: "wal-et.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "wal-et.js")
        case "fobo" :: "de-at.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "de-at.js")
        case "fobo" :: "khq-ml.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "khq-ml.js")
        case "fobo" :: "es-cl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-cl.js")
        case "fobo" :: "es-hn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-hn.js")
        case "fobo" :: "mn-cyrl-mn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mn-cyrl-mn.js")
        case "fobo" :: "lu-cd.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lu-cd.js")
        case "fobo" :: "nb-sj.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nb-sj.js")
        case "fobo" :: "kl-gl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kl-gl.js")
        case "fobo" :: "ar-td.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-td.js")
        case "fobo" :: "es-cr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-cr.js")
        case "fobo" :: "ar-ma.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-ma.js")
        case "fobo" :: "qu-bo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "qu-bo.js")
        case "fobo" :: "bez-tz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bez-tz.js")
        case "fobo" :: "ka-ge.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ka-ge.js")
        case "fobo" :: "so-so.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "so-so.js")
        case "fobo" :: "ebu-ke.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ebu-ke.js")
        case "fobo" :: "ckb-arab-iq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ckb-arab-iq.js")
        case "fobo" :: "pt-ao.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pt-ao.js")
        case "fobo" :: "ta-my.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ta-my.js")
        case "fobo" :: "kkj-cm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kkj-cm.js")
        case "fobo" :: "en-fm.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-fm.js")
        case "fobo" :: "en-pg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-pg.js")
        case "fobo" :: "ff-mr.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ff-mr.js")
        case "fobo" :: "zu-za.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zu-za.js")
        case "fobo" :: "ar-il.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-il.js")
        case "fobo" :: "kde-tz.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kde-tz.js")
        case "fobo" :: "gu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "gu.js")
        case "fobo" :: "hy-am.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "hy-am.js")
        case "fobo" :: "mk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mk.js")
        case "fobo" :: "mg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mg.js")
        case "fobo" :: "nr-za.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "nr-za.js")
        case "fobo" :: "ro.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ro.js")
        case "fobo" :: "shi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "shi.js")
        case "fobo" :: "gsw-ch.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "gsw-ch.js")
        case "fobo" :: "dyo-sn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "dyo-sn.js")
        case "fobo" :: "lkt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lkt.js")
        case "fobo" :: "fr-bj.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-bj.js")
        case "fobo" :: "ru-kg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ru-kg.js")
        case "fobo" :: "eu-es.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "eu-es.js")
        case "fobo" :: "ha-latn-gh.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ha-latn-gh.js")
        case "fobo" :: "cy-gb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "cy-gb.js")
        case "fobo" :: "ur-pk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ur-pk.js")
        case "fobo" :: "bs-cyrl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bs-cyrl.js")
        case "fobo" :: "bo-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bo-in.js")
        case "fobo" :: "fr-mq.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-mq.js")
        case "fobo" :: "ne-np.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ne-np.js")
        case "fobo" :: "et-ee.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "et-ee.js")
        case "fobo" :: "zh-hans-mo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zh-hans-mo.js")
        case "fobo" :: "kok-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kok-in.js")
        case "fobo" :: "ebu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ebu.js")
        case "fobo" :: "ckb.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ckb.js")
        case "fobo" :: "bs-cyrl-ba.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bs-cyrl-ba.js")
        case "fobo" :: "uz-cyrl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "uz-cyrl.js")
        case "fobo" :: "fr-sn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-sn.js")
        case "fobo" :: "en-bs.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-bs.js")
        case "fobo" :: "mfe-mu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mfe-mu.js")
        case "fobo" :: "hi.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "hi.js")
        case "fobo" :: "ff-gn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ff-gn.js")
        case "fobo" :: "tn.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "tn.js")
        case "fobo" :: "en-io.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-io.js")
        case "fobo" :: "ts-za.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ts-za.js")
        case "fobo" :: "ar-eg.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "ar-eg.js")
        case "fobo" :: "bn-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "bn-in.js")
        case "fobo" :: "kl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kl.js")
        case "fobo" :: "as-in.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "as-in.js")
        case "fobo" :: "en-to.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-to.js")
        case "fobo" :: "aa-er.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "aa-er.js")
        case "fobo" :: "rw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "rw.js")
        case "fobo" :: "lt.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "lt.js")
        case "fobo" :: "om.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "om.js")
        case "fobo" :: "mk-mk.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "mk-mk.js")
        case "fobo" :: "eo.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "eo.js")
        case "fobo" :: "zh-hant-tw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "zh-hant-tw.js")
        case "fobo" :: "kk-cyrl.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "kk-cyrl.js")
        case "fobo" :: "en-pw.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-pw.js")
        case "fobo" :: "en-sd.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "en-sd.js")
        case "fobo" :: "gv.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "gv.js")
        case "fobo" :: "pa.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "pa.js")
        case "fobo" :: "es-cu.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "es-cu.js")
        case "fobo" :: "fr-mc.js" :: Nil =>
          List("fobo", "angular-js", "1.5.3", "i18n", "fr-mc.js")

      }
    }

    lazy val angularjs148 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.8", "js", "angular.js")
        case "fobo" :: "angular.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
        case "fobo" :: "angular.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular.min.js.map")

        case "fobo" :: "angular-animate.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-animate.js")
        case "fobo" :: "angular-animate.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-animate.min.js")
        case "fobo" :: "angular-animate.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "js",
               "angular-animate.min.js.map")

        case "fobo" :: "angular-aria.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-aria.js")
        case "fobo" :: "angular-aria.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-aria.min.js")
        case "fobo" :: "angular-aria.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-aria.min.js.map")

        case "fobo" :: "angular-cookies.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-cookies.js")
        case "fobo" :: "angular-cookies.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-cookies.min.js")
        case "fobo" :: "angular-cookies.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "js",
               "angular-cookies.min.js.map")

        case "fobo" :: "angular-loader.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-loader.js")
        case "fobo" :: "angular-loader.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-loader.min.js")
        case "fobo" :: "angular-loader.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "js",
               "angular.min-loader.js.map")

        case "fobo" :: "angular-message-format.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-messages.js")
        case "fobo" :: "angular-message-format.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-messages.min.js")
        case "fobo" :: "angular-message-format.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "js",
               "angular.min-messages.js.map")

        case "fobo" :: "angular-messages.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-messages.js")
        case "fobo" :: "angular-messages.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-messages.min.js")
        case "fobo" :: "angular-messages.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "js",
               "angular.min-messages.js.map")

        //dev/test only
        case "fobo" :: "angular-mocks.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-mocks.js")

        case "fobo" :: "angular-resource.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-resource.js")
        case "fobo" :: "angular-resource.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-resource.min.js")
        case "fobo" :: "angular-resource.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "js",
               "angular-resource.min.js.map")

        case "fobo" :: "angular-route.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-route.js")
        case "fobo" :: "angular-route.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-route.min.js")
        case "fobo" :: "angular-route.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-route.min.js.map")

        case "fobo" :: "angular-sanitize.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-sanitize.js")
        case "fobo" :: "angular-sanitize.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-sanitize.min.js")
        case "fobo" :: "angular-sanitize.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "js",
               "angular-sanitize.min.js.map")
        //dev/test only 
        case "fobo" :: "angular-scenario.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-scenario.js")

        case "fobo" :: "angular-touch.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-touch.js")
        case "fobo" :: "angular-touch.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-touch.min.js")
        case "fobo" :: "angular-touch.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "js", "angular-touch.min.js.map")

        //CSS files
        case "fobo" :: "angular-csp.css" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.8", "css", "angular-csp.css")
        case "fobo" :: "angular-csp.css" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "css", "angular-csp.css")

      }
    }

    lazy val angularjs148i18n = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_nl-cw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nl-cw.js")
        case "fobo" :: "angular-locale_se-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_se-fi.js")
        case "fobo" :: "angular-locale_en-bz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-bz.js")
        case "fobo" :: "angular-locale_os-ru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_os-ru.js")
        case "fobo" :: "angular-locale_lkt-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_lkt-us.js")
        case "fobo" :: "angular-locale_en-pk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-pk.js")
        case "fobo" :: "angular-locale_he.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_he.js")
        case "fobo" :: "angular-locale_sr-latn-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sr-latn-ba.js")
        case "fobo" :: "angular-locale_teo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_teo.js")
        case "fobo" :: "angular-locale_hy.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hy.js")
        case "fobo" :: "angular-locale_ms-latn-bn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ms-latn-bn.js")
        case "fobo" :: "angular-locale_az.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_az.js")
        case "fobo" :: "angular-locale_nd.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nd.js")
        case "fobo" :: "angular-locale_fr-rw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-rw.js")
        case "fobo" :: "angular-locale_so-so.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_so-so.js")
        case "fobo" :: "angular-locale_ckb-latn-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ckb-latn-iq.js")
        case "fobo" :: "angular-locale_de-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_de-ch.js")
        case "fobo" :: "angular-locale_ar-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-iq.js")
        case "fobo" :: "angular-locale_yav-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_yav-cm.js")
        case "fobo" :: "angular-locale_tg-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_tg-cyrl.js")
        case "fobo" :: "angular-locale_os-ge.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_os-ge.js")
        case "fobo" :: "angular-locale_hu.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hu.js")
        case "fobo" :: "angular-locale_pt-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_pt-mo.js")
        case "fobo" :: "angular-locale_ha-latn-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ha-latn-gh.js")
        case "fobo" :: "angular-locale_fr-cg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-cg.js")
        case "fobo" :: "angular-locale_mfe.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mfe.js")
        case "fobo" :: "angular-locale_en-ca.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ca.js")
        case "fobo" :: "angular-locale_st-ls.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_st-ls.js")
        case "fobo" :: "angular-locale_kw-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_kw-gb.js")
        case "fobo" :: "angular-locale_ss.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ss.js")
        case "fobo" :: "angular-locale_zgh.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zgh.js")
        case "fobo" :: "angular-locale_fr-dz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-dz.js")
        case "fobo" :: "angular-locale_fr-bl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-bl.js")
        case "fobo" :: "angular-locale_fa.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fa.js")
        case "fobo" :: "angular-locale_mk.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mk.js")
        case "fobo" :: "angular-locale_mr-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_mr-in.js")
        case "fobo" :: "angular-locale_sv-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sv-fi.js")
        case "fobo" :: "angular-locale_it.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_it.js")
        case "fobo" :: "angular-locale_en-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-cm.js")
        case "fobo" :: "angular-locale_no-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_no-no.js")
        case "fobo" :: "angular-locale_ckb-ir.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ckb-ir.js")
        case "fobo" :: "angular-locale_en-to.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-to.js")
        case "fobo" :: "angular-locale_fr-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-cd.js")
        case "fobo" :: "angular-locale_fr-sn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-sn.js")
        case "fobo" :: "angular-locale_cgg.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_cgg.js")
        case "fobo" :: "angular-locale_ky.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ky.js")
        case "fobo" :: "angular-locale_chr-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_chr-us.js")
        case "fobo" :: "angular-locale_naq.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_naq.js")
        case "fobo" :: "angular-locale_ar.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar.js")
        case "fobo" :: "angular-locale_fr-pm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-pm.js")
        case "fobo" :: "angular-locale_qu-bo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_qu-bo.js")
        case "fobo" :: "angular-locale_gv-im.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_gv-im.js")
        case "fobo" :: "angular-locale_is.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_is.js")
        case "fobo" :: "angular-locale_bg-bg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bg-bg.js")
        case "fobo" :: "angular-locale_fi.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fi.js")
        case "fobo" :: "angular-locale_bn-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bn-in.js")
        case "fobo" :: "angular-locale_agq.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_agq.js")
        case "fobo" :: "angular-locale_khq.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_khq.js")
        case "fobo" :: "angular-locale_bs-latn-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bs-latn-ba.js")
        case "fobo" :: "angular-locale_en-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-sg.js")
        case "fobo" :: "angular-locale_zh-hant-tw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_zh-hant-tw.js")
        case "fobo" :: "angular-locale_fr-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-ch.js")
        case "fobo" :: "angular-locale_zgh-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_zgh-ma.js")
        case "fobo" :: "angular-locale_ms-latn-my.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ms-latn-my.js")
        case "fobo" :: "angular-locale_fr-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-ma.js")
        case "fobo" :: "angular-locale_en-fm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-fm.js")
        case "fobo" :: "angular-locale_mgh.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mgh.js")
        case "fobo" :: "angular-locale_jgo-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_jgo-cm.js")
        case "fobo" :: "angular-locale_en-zm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-zm.js")
        case "fobo" :: "angular-locale_zh-tw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_zh-tw.js")
        case "fobo" :: "angular-locale_ki-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ki-ke.js")
        case "fobo" :: "angular-locale_vai.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vai.js")
        case "fobo" :: "angular-locale_fr-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-ml.js")
        case "fobo" :: "angular-locale_lu.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lu.js")
        case "fobo" :: "angular-locale_en-gu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-gu.js")
        case "fobo" :: "angular-locale_sw-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sw-ke.js")
        case "fobo" :: "angular-locale_asa.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_asa.js")
        case "fobo" :: "angular-locale_pt.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pt.js")
        case "fobo" :: "angular-locale_nd-zw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nd-zw.js")
        case "fobo" :: "angular-locale_uz.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_uz.js")
        case "fobo" :: "angular-locale_shi.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_shi.js")
        case "fobo" :: "angular-locale_sk.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sk.js")
        case "fobo" :: "angular-locale_gu.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gu.js")
        case "fobo" :: "angular-locale_pa-guru-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_pa-guru-in.js")
        case "fobo" :: "angular-locale_lb.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lb.js")
        case "fobo" :: "angular-locale_ps-af.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ps-af.js")
        case "fobo" :: "angular-locale_ar-dz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-dz.js")
        case "fobo" :: "angular-locale_ru-kz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ru-kz.js")
        case "fobo" :: "angular-locale_en-sl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-sl.js")
        case "fobo" :: "angular-locale_zh-hant-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_zh-hant-hk.js")
        case "fobo" :: "angular-locale_ts-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ts-za.js")
        case "fobo" :: "angular-locale_sah-ru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sah-ru.js")
        case "fobo" :: "angular-locale_rwk-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_rwk-tz.js")
        case "fobo" :: "angular-locale_dyo-sn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_dyo-sn.js")
        case "fobo" :: "angular-locale_et.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_et.js")
        case "fobo" :: "angular-locale_ss-sz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ss-sz.js")
        case "fobo" :: "angular-locale_nn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nn.js")
        case "fobo" :: "angular-locale_bem.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bem.js")
        case "fobo" :: "angular-locale_ssy-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ssy-er.js")
        case "fobo" :: "angular-locale_en-nu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-nu.js")
        case "fobo" :: "angular-locale_mt.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mt.js")
        case "fobo" :: "angular-locale_pt-mz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_pt-mz.js")
        case "fobo" :: "angular-locale_nyn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nyn.js")
        case "fobo" :: "angular-locale_ksh-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ksh-de.js")
        case "fobo" :: "angular-locale_bez-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bez-tz.js")
        case "fobo" :: "angular-locale_es-gq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-gq.js")
        case "fobo" :: "angular-locale_ii.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ii.js")
        case "fobo" :: "angular-locale_es-ve.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-ve.js")
        case "fobo" :: "angular-locale_ta-my.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ta-my.js")
        case "fobo" :: "angular-locale_bs.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bs.js")
        case "fobo" :: "angular-locale_zh-hant.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_zh-hant.js")
        case "fobo" :: "angular-locale_bs-cyrl-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bs-cyrl-ba.js")
        case "fobo" :: "angular-locale_el-gr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_el-gr.js")
        case "fobo" :: "angular-locale_it-it.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_it-it.js")
        case "fobo" :: "angular-locale_mgh-mz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_mgh-mz.js")
        case "fobo" :: "angular-locale_es-do.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-do.js")
        case "fobo" :: "angular-locale_ff.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ff.js")
        case "fobo" :: "angular-locale_wal-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_wal-et.js")
        case "fobo" :: "angular-locale_hi-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_hi-in.js")
        case "fobo" :: "angular-locale_cs-cz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_cs-cz.js")
        case "fobo" :: "angular-locale_ssy.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ssy.js")
        case "fobo" :: "angular-locale_hr-hr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_hr-hr.js")
        case "fobo" :: "angular-locale_yo-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_yo-ng.js")
        case "fobo" :: "angular-locale_en-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-za.js")
        case "fobo" :: "angular-locale_ln-ao.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ln-ao.js")
        case "fobo" :: "angular-locale_ms-latn-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ms-latn-sg.js")
        case "fobo" :: "angular-locale_el-cy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_el-cy.js")
        case "fobo" :: "angular-locale_ur-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ur-in.js")
        case "fobo" :: "angular-locale_bn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bn.js")
        case "fobo" :: "angular-locale_zu-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_zu-za.js")
        case "fobo" :: "angular-locale_ca.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ca.js")
        case "fobo" :: "angular-locale_sw.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sw.js")
        case "fobo" :: "angular-locale_tzm-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_tzm-latn.js")
        case "fobo" :: "angular-locale_fr-tn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-tn.js")
        case "fobo" :: "angular-locale_en-ai.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ai.js")
        case "fobo" :: "angular-locale_yi-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_yi-001.js")
        case "fobo" :: "angular-locale_en-ie.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ie.js")
        case "fobo" :: "angular-locale_es-hn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-hn.js")
        case "fobo" :: "angular-locale_es-cr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-cr.js")
        case "fobo" :: "angular-locale_ar-jo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-jo.js")
        case "fobo" :: "angular-locale_xh-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_xh-za.js")
        case "fobo" :: "angular-locale_sr.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sr.js")
        case "fobo" :: "angular-locale_fr-lu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-lu.js")
        case "fobo" :: "angular-locale_en-um.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-um.js")
        case "fobo" :: "angular-locale_es-cu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-cu.js")
        case "fobo" :: "angular-locale_qu-ec.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_qu-ec.js")
        case "fobo" :: "angular-locale_ro-md.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ro-md.js")
        case "fobo" :: "angular-locale_to-to.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_to-to.js")
        case "fobo" :: "angular-locale_zh-hans-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_zh-hans-hk.js")
        case "fobo" :: "angular-locale_fr-mg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-mg.js")
        case "fobo" :: "angular-locale_haw.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_haw.js")
        case "fobo" :: "angular-locale_ro.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ro.js")
        case "fobo" :: "angular-locale_es-ar.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-ar.js")
        case "fobo" :: "angular-locale_fr.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr.js")
        case "fobo" :: "angular-locale_it-sm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_it-sm.js")
        case "fobo" :: "angular-locale_uk-ua.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_uk-ua.js")
        case "fobo" :: "angular-locale_aa-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_aa-er.js")
        case "fobo" :: "angular-locale_ha-latn-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ha-latn-ne.js")
        case "fobo" :: "angular-locale_pt-st.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_pt-st.js")
        case "fobo" :: "angular-locale_en-ki.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ki.js")
        case "fobo" :: "angular-locale_rof.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rof.js")
        case "fobo" :: "angular-locale_kn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kn.js")
        case "fobo" :: "angular-locale_sr-latn-me.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sr-latn-me.js")
        case "fobo" :: "angular-locale_kok.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kok.js")
        case "fobo" :: "angular-locale_en-pr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-pr.js")
        case "fobo" :: "angular-locale_ne-np.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ne-np.js")
        case "fobo" :: "angular-locale_lu-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_lu-cd.js")
        case "fobo" :: "angular-locale_sl.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sl.js")
        case "fobo" :: "angular-locale_ckb-arab-ir.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ckb-arab-ir.js")
        case "fobo" :: "angular-locale_ug-arab-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ug-arab-cn.js")
        case "fobo" :: "angular-locale_mn-cyrl-mn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_mn-cyrl-mn.js")
        case "fobo" :: "angular-locale_fr-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-dj.js")
        case "fobo" :: "angular-locale_ks-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ks-arab.js")
        case "fobo" :: "angular-locale_luo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_luo.js")
        case "fobo" :: "angular-locale_xh.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_xh.js")
        case "fobo" :: "angular-locale_luo-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_luo-ke.js")
        case "fobo" :: "angular-locale_it-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_it-ch.js")
        case "fobo" :: "angular-locale_mas.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mas.js")
        case "fobo" :: "angular-locale_ksf-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ksf-cm.js")
        case "fobo" :: "angular-locale_sq-xk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sq-xk.js")
        case "fobo" :: "angular-locale_en-gd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-gd.js")
        case "fobo" :: "angular-locale_kea.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kea.js")
        case "fobo" :: "angular-locale_ve.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ve.js")
        case "fobo" :: "angular-locale_rof-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_rof-tz.js")
        case "fobo" :: "angular-locale_en-sb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-sb.js")
        case "fobo" :: "angular-locale_ne.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ne.js")
        case "fobo" :: "angular-locale_fr-km.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-km.js")
        case "fobo" :: "angular-locale_my.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_my.js")
        case "fobo" :: "angular-locale_sr-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sr-cyrl.js")
        case "fobo" :: "angular-locale_cy.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_cy.js")
        case "fobo" :: "angular-locale_gu-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_gu-in.js")
        case "fobo" :: "angular-locale_es-mx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-mx.js")
        case "fobo" :: "angular-locale_bn-bd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bn-bd.js")
        case "fobo" :: "angular-locale_am-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_am-et.js")
        case "fobo" :: "angular-locale_mk-mk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_mk-mk.js")
        case "fobo" :: "angular-locale_lag.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lag.js")
        case "fobo" :: "angular-locale_en-ms.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ms.js")
        case "fobo" :: "angular-locale_brx-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_brx-in.js")
        case "fobo" :: "angular-locale_sr-latn-rs.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sr-latn-rs.js")
        case "fobo" :: "angular-locale_sl-si.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sl-si.js")
        case "fobo" :: "angular-locale_mgo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mgo.js")
      }
    }

    lazy val angularjs148i18n2 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_ha-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ha-latn.js")
        case "fobo" :: "angular-locale_tg.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tg.js")
        case "fobo" :: "angular-locale_am.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_am.js")
        case "fobo" :: "angular-locale_bo-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bo-cn.js")
        case "fobo" :: "angular-locale_en-mt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-mt.js")
        case "fobo" :: "angular-locale_dua-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_dua-cm.js")
        case "fobo" :: "angular-locale_sr-cyrl-xk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sr-cyrl-xk.js")
        case "fobo" :: "angular-locale_ar-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-ma.js")
        case "fobo" :: "angular-locale_en-pn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-pn.js")
        case "fobo" :: "angular-locale_te.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_te.js")
        case "fobo" :: "angular-locale_ast-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ast-es.js")
        case "fobo" :: "angular-locale_pa-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_pa-arab.js")
        case "fobo" :: "angular-locale_zh.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zh.js")
        case "fobo" :: "angular-locale_es-pr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-pr.js")
        case "fobo" :: "angular-locale_nb-sj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nb-sj.js")
        case "fobo" :: "angular-locale_ar-ye.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-ye.js")
        case "fobo" :: "angular-locale_fr-pf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-pf.js")
        case "fobo" :: "angular-locale_saq-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_saq-ke.js")
        case "fobo" :: "angular-locale_de-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_de-be.js")
        case "fobo" :: "angular-locale_fr-wf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-wf.js")
        case "fobo" :: "angular-locale_gd.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gd.js")
        case "fobo" :: "angular-locale_no.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_no.js")
        case "fobo" :: "angular-locale_el.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_el.js")
        case "fobo" :: "angular-locale_ca-ad.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ca-ad.js")
        case "fobo" :: "angular-locale_km.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_km.js")
        case "fobo" :: "angular-locale_en-tc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-tc.js")
        case "fobo" :: "angular-locale_es-ni.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-ni.js")
        case "fobo" :: "angular-locale_so.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_so.js")
        case "fobo" :: "angular-locale_kkj.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kkj.js")
        case "fobo" :: "angular-locale_tr-cy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_tr-cy.js")
        case "fobo" :: "angular-locale_en-150.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-150.js")
        case "fobo" :: "angular-locale_kln.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kln.js")
        case "fobo" :: "angular-locale_qu.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_qu.js")
        case "fobo" :: "angular-locale_lo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lo.js")
        case "fobo" :: "angular-locale_os.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_os.js")
        case "fobo" :: "angular-locale_zh-hans-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_zh-hans-mo.js")
        case "fobo" :: "angular-locale_ses-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ses-ml.js")
        case "fobo" :: "angular-locale_fr-sy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-sy.js")
        case "fobo" :: "angular-locale_fr-td.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-td.js")
        case "fobo" :: "angular-locale_mt-mt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_mt-mt.js")
        case "fobo" :: "angular-locale_en-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-us.js")
        case "fobo" :: "angular-locale_zh-hans-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_zh-hans-sg.js")
        case "fobo" :: "angular-locale_az-latn-az.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_az-latn-az.js")
        case "fobo" :: "angular-locale_uz-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_uz-latn.js")
        case "fobo" :: "angular-locale_dsb.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dsb.js")
        case "fobo" :: "angular-locale_bez.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bez.js")
        case "fobo" :: "angular-locale_fr-vu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-vu.js")
        case "fobo" :: "angular-locale_fr-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-be.js")
        case "fobo" :: "angular-locale_hr.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hr.js")
        case "fobo" :: "angular-locale_agq-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_agq-cm.js")
        case "fobo" :: "angular-locale_smn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_smn.js")
        case "fobo" :: "angular-locale_kl.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kl.js")
        case "fobo" :: "angular-locale_ak.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ak.js")
        case "fobo" :: "angular-locale_nr.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nr.js")
        case "fobo" :: "angular-locale_en-sd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-sd.js")
        case "fobo" :: "angular-locale_fr-ht.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-ht.js")
        case "fobo" :: "angular-locale_fr-gn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-gn.js")
        case "fobo" :: "angular-locale_st-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_st-za.js")
        case "fobo" :: "angular-locale_es-ec.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-ec.js")
        case "fobo" :: "angular-locale_mas-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_mas-ke.js")
        case "fobo" :: "angular-locale_seh-mz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_seh-mz.js")
        case "fobo" :: "angular-locale_ta-lk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ta-lk.js")
        case "fobo" :: "angular-locale_bo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bo.js")
        case "fobo" :: "angular-locale_ewo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ewo.js")
        case "fobo" :: "angular-locale_en-nr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-nr.js")
        case "fobo" :: "angular-locale_en-au.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-au.js")
        case "fobo" :: "angular-locale_shi-tfng-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_shi-tfng-ma.js")
        case "fobo" :: "angular-locale_guz.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_guz.js")
        case "fobo" :: "angular-locale_id-id.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_id-id.js")
        case "fobo" :: "angular-locale_en-ws.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ws.js")
        case "fobo" :: "angular-locale_tn-bw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_tn-bw.js")
        case "fobo" :: "angular-locale_sw-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sw-tz.js")
        case "fobo" :: "angular-locale_kab.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kab.js")
        case "fobo" :: "angular-locale_az-cyrl-az.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_az-cyrl-az.js")
        case "fobo" :: "angular-locale_de-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_de-de.js")
        case "fobo" :: "angular-locale_en-pg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-pg.js")
        case "fobo" :: "angular-locale_sr-cyrl-me.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sr-cyrl-me.js")
        case "fobo" :: "angular-locale_ar-km.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-km.js")
        case "fobo" :: "angular-locale_ar-lb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-lb.js")
        case "fobo" :: "angular-locale_wae-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_wae-ch.js")
        case "fobo" :: "angular-locale_luy-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_luy-ke.js")
        case "fobo" :: "angular-locale_be-by.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_be-by.js")
        case "fobo" :: "angular-locale_ar-tn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-tn.js")
        case "fobo" :: "angular-locale_en-gi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-gi.js")
        case "fobo" :: "angular-locale_te-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_te-in.js")
        case "fobo" :: "angular-locale_en-my.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-my.js")
        case "fobo" :: "angular-locale_en-ag.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ag.js")
        case "fobo" :: "angular-locale_ta-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ta-in.js")
        case "fobo" :: "angular-locale_es-cl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-cl.js")
        case "fobo" :: "angular-locale_shi-latn-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_shi-latn-ma.js")
        case "fobo" :: "angular-locale_hu-hu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_hu-hu.js")
        case "fobo" :: "angular-locale_ln-cg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ln-cg.js")
        case "fobo" :: "angular-locale_tzm.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tzm.js")
        case "fobo" :: "angular-locale_aa-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_aa-et.js")
        case "fobo" :: "angular-locale_ff-gn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ff-gn.js")
        case "fobo" :: "angular-locale_fr-ca.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-ca.js")
        case "fobo" :: "angular-locale_he-il.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_he-il.js")
        case "fobo" :: "angular-locale_vo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vo.js")
        case "fobo" :: "angular-locale_es-gt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-gt.js")
        case "fobo" :: "angular-locale_rw.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rw.js")
        case "fobo" :: "angular-locale_uz-arab-af.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_uz-arab-af.js")
        case "fobo" :: "angular-locale_id.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_id.js")
        case "fobo" :: "angular-locale_en-gy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-gy.js")
        case "fobo" :: "angular-locale_ko-kr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ko-kr.js")
        case "fobo" :: "angular-locale_smn-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_smn-fi.js")
        case "fobo" :: "angular-locale_lkt.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lkt.js")
        case "fobo" :: "angular-locale_hy-am.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_hy-am.js")
        case "fobo" :: "angular-locale_ksb.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ksb.js")
        case "fobo" :: "angular-locale_pt-tl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_pt-tl.js")
        case "fobo" :: "angular-locale_ar-ly.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-ly.js")
        case "fobo" :: "angular-locale_ur-pk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ur-pk.js")
        case "fobo" :: "angular-locale_dsb-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_dsb-de.js")
        case "fobo" :: "angular-locale_en-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-mo.js")
        case "fobo" :: "angular-locale_nl-sr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nl-sr.js")
        case "fobo" :: "angular-locale_fy-nl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fy-nl.js")
        case "fobo" :: "angular-locale_yo-bj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_yo-bj.js")
        case "fobo" :: "angular-locale_xog-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_xog-ug.js")
        case "fobo" :: "angular-locale_ar-sa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-sa.js")
        case "fobo" :: "angular-locale_dje.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dje.js")
        case "fobo" :: "angular-locale_fr-sc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-sc.js")
        case "fobo" :: "angular-locale_en-mp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-mp.js")
        case "fobo" :: "angular-locale_es-pe.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-pe.js")
        case "fobo" :: "angular-locale_fr-re.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-re.js")
        case "fobo" :: "angular-locale_uk.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_uk.js")
        case "fobo" :: "angular-locale_en-rw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-rw.js")
        case "fobo" :: "angular-locale_pt-ao.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_pt-ao.js")
        case "fobo" :: "angular-locale_zh-hans-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_zh-hans-cn.js")
        case "fobo" :: "angular-locale_yi.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_yi.js")
        case "fobo" :: "angular-locale_ug-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ug-arab.js")
        case "fobo" :: "angular-locale_my-mm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_my-mm.js")
        case "fobo" :: "angular-locale_lt.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lt.js")
        case "fobo" :: "angular-locale_ta.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ta.js")
        case "fobo" :: "angular-locale_ki.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ki.js")
        case "fobo" :: "angular-locale_iw.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_iw.js")
        case "fobo" :: "angular-locale_fr-gq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-gq.js")
        case "fobo" :: "angular-locale_om.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_om.js")
        case "fobo" :: "angular-locale_ne-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ne-in.js")
        case "fobo" :: "angular-locale_rn-bi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_rn-bi.js")
        case "fobo" :: "angular-locale_ckb-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ckb-arab.js")
        case "fobo" :: "angular-locale_nn-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nn-no.js")
        case "fobo" :: "angular-locale_en-mg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-mg.js")
        case "fobo" :: "angular-locale_ga.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ga.js")
        case "fobo" :: "angular-locale_es-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-us.js")
        case "fobo" :: "angular-locale_en-tv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-tv.js")
        case "fobo" :: "angular-locale_mer-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_mer-ke.js")
        case "fobo" :: "angular-locale_ss-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ss-za.js")
        case "fobo" :: "angular-locale_en-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-gb.js")
        case "fobo" :: "angular-locale_en-mu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-mu.js")
        case "fobo" :: "angular-locale_lv.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lv.js")
        case "fobo" :: "angular-locale_fr-tg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-tg.js")
        case "fobo" :: "angular-locale_vun-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_vun-tz.js")
        case "fobo" :: "angular-locale_gd-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_gd-gb.js")
        case "fobo" :: "angular-locale_st.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_st.js")
        case "fobo" :: "angular-locale_pl-pl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_pl-pl.js")
        case "fobo" :: "angular-locale_bm-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bm-ml.js")
        case "fobo" :: "angular-locale_ar-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-dj.js")
        case "fobo" :: "angular-locale_en-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-be.js")
        case "fobo" :: "angular-locale_en-ls.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ls.js")
        case "fobo" :: "angular-locale_aa-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_aa-dj.js")
        case "fobo" :: "angular-locale_haw-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_haw-us.js")
        case "fobo" :: "angular-locale_ta-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ta-sg.js")
        case "fobo" :: "angular-locale_sw-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sw-ug.js")
        case "fobo" :: "angular-locale_gl.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gl.js")
        case "fobo" :: "angular-locale_es-ic.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-ic.js")
        case "fobo" :: "angular-locale_en-pw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-pw.js")
        case "fobo" :: "angular-locale_nr-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nr-za.js")
        case "fobo" :: "angular-locale_ti.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ti.js")
        case "fobo" :: "angular-locale_en-bw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-bw.js")
        case "fobo" :: "angular-locale_az-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_az-cyrl.js")
        case "fobo" :: "angular-locale_gsw.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gsw.js")
        case "fobo" :: "angular-locale_en-jm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-jm.js")
        case "fobo" :: "angular-locale_cgg-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_cgg-ug.js")
        case "fobo" :: "angular-locale_rm.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rm.js")
        case "fobo" :: "angular-locale_mr.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mr.js")
        case "fobo" :: "angular-locale_th.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_th.js")
        case "fobo" :: "angular-locale_br.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_br.js")
        case "fobo" :: "angular-locale_en-im.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-im.js")
        case "fobo" :: "angular-locale_lg-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_lg-ug.js")
        case "fobo" :: "angular-locale_en-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ug.js")
        case "fobo" :: "angular-locale_dz.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dz.js")
        case "fobo" :: "angular-locale_vai-latn-lr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_vai-latn-lr.js")
        case "fobo" :: "angular-locale_nb-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nb-no.js")
        case "fobo" :: "angular-locale_se.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_se.js")
        case "fobo" :: "angular-locale_ckb-arab-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ckb-arab-iq.js")
        case "fobo" :: "angular-locale_asa-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_asa-tz.js")
        case "fobo" :: "angular-locale_ar-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-001.js")
        case "fobo" :: "angular-locale_brx.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_brx.js")
        case "fobo" :: "angular-locale_es-co.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-co.js")
        case "fobo" :: "angular-locale_ewo-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ewo-cm.js")
        case "fobo" :: "angular-locale_ln.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ln.js")
        case "fobo" :: "angular-locale_sk-sk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sk-sk.js")
        case "fobo" :: "angular-locale_vai-vaii-lr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_vai-vaii-lr.js")
        case "fobo" :: "angular-locale_ug.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ug.js")
        case "fobo" :: "angular-locale_af.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_af.js")
        case "fobo" :: "angular-locale_de-li.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_de-li.js")
        case "fobo" :: "angular-locale_kw.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kw.js")
        case "fobo" :: "angular-locale_so-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_so-et.js")
        case "fobo" :: "angular-locale_ti-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ti-et.js")
        case "fobo" :: "angular-locale_nyn-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nyn-ug.js")
        case "fobo" :: "angular-locale_gsw-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_gsw-ch.js")
        case "fobo" :: "angular-locale_ckb-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ckb-latn.js")
      }
    }

    lazy val angularjs148i18n3 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_nl-sx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nl-sx.js")
        case "fobo" :: "angular-locale_da.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_da.js")
        case "fobo" :: "angular-locale_sq-al.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sq-al.js")
        case "fobo" :: "angular-locale_zh-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_zh-cn.js")
        case "fobo" :: "angular-locale_en-ph.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ph.js")
        case "fobo" :: "angular-locale_ru-md.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ru-md.js")
        case "fobo" :: "angular-locale_tl.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tl.js")
        case "fobo" :: "angular-locale_ks.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ks.js")
        case "fobo" :: "angular-locale_tzm-latn-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_tzm-latn-ma.js")
        case "fobo" :: "angular-locale_zu.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zu.js")
        case "fobo" :: "angular-locale_et-ee.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_et-ee.js")
        case "fobo" :: "angular-locale_ar-ae.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-ae.js")
        case "fobo" :: "angular-locale_ha-latn-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ha-latn-ng.js")
        case "fobo" :: "angular-locale_cy-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_cy-gb.js")
        case "fobo" :: "angular-locale_en-as.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-as.js")
        case "fobo" :: "angular-locale_byn-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_byn-er.js")
        case "fobo" :: "angular-locale_sn-zw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sn-zw.js")
        case "fobo" :: "angular-locale_en-nf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-nf.js")
        case "fobo" :: "angular-locale_eo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_eo.js")
        case "fobo" :: "angular-locale_nl-bq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nl-bq.js")
        case "fobo" :: "angular-locale_ee-tg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ee-tg.js")
        case "fobo" :: "angular-locale_pa-arab-pk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_pa-arab-pk.js")
        case "fobo" :: "angular-locale_gsw-li.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_gsw-li.js")
        case "fobo" :: "angular-locale_en-io.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-io.js")
        case "fobo" :: "angular-locale_se-se.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_se-se.js")
        case "fobo" :: "angular-locale_tr-tr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_tr-tr.js")
        case "fobo" :: "angular-locale_fr-mc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-mc.js")
        case "fobo" :: "angular-locale_wae.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_wae.js")
        case "fobo" :: "angular-locale_mua-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_mua-cm.js")
        case "fobo" :: "angular-locale_ru-kg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ru-kg.js")
        case "fobo" :: "angular-locale_uz-cyrl-uz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_uz-cyrl-uz.js")
        case "fobo" :: "angular-locale_en-vc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-vc.js")
        case "fobo" :: "angular-locale_es-ph.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-ph.js")
        case "fobo" :: "angular-locale_mfe-mu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_mfe-mu.js")
        case "fobo" :: "angular-locale_tn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tn.js")
        case "fobo" :: "angular-locale_sg-cf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sg-cf.js")
        case "fobo" :: "angular-locale_swc.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_swc.js")
        case "fobo" :: "angular-locale_fa-af.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fa-af.js")
        case "fobo" :: "angular-locale_ca-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ca-fr.js")
        case "fobo" :: "angular-locale_pl.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pl.js")
        case "fobo" :: "angular-locale_en-zw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-zw.js")
        case "fobo" :: "angular-locale_ff-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ff-cm.js")
        case "fobo" :: "angular-locale_fil.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fil.js")
        case "fobo" :: "angular-locale_is-is.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_is-is.js")
        case "fobo" :: "angular-locale_es-pa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-pa.js")
        case "fobo" :: "angular-locale_sv.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv.js")
        case "fobo" :: "angular-locale_nso-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nso-za.js")
        case "fobo" :: "angular-locale_fr-yt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-yt.js")
        case "fobo" :: "angular-locale_lb-lu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_lb-lu.js")
        case "fobo" :: "angular-locale_de.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_de.js")
        case "fobo" :: "angular-locale_ln-cf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ln-cf.js")
        case "fobo" :: "angular-locale_th-th.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_th-th.js")
        case "fobo" :: "angular-locale_en-bb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-bb.js")
        case "fobo" :: "angular-locale_teo-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_teo-ke.js")
        case "fobo" :: "angular-locale_es.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es.js")
        case "fobo" :: "angular-locale_dz-bt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_dz-bt.js")
        case "fobo" :: "angular-locale_nso.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nso.js")
        case "fobo" :: "angular-locale_lo-la.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_lo-la.js")
        case "fobo" :: "angular-locale_ti-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ti-er.js")
        case "fobo" :: "angular-locale_ff-mr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ff-mr.js")
        case "fobo" :: "angular-locale_om-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_om-ke.js")
        case "fobo" :: "angular-locale_luy.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_luy.js")
        case "fobo" :: "angular-locale_naq-na.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_naq-na.js")
        case "fobo" :: "angular-locale_en-sx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-sx.js")
        case "fobo" :: "angular-locale_nl-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nl-be.js")
        case "fobo" :: "angular-locale_si-lk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_si-lk.js")
        case "fobo" :: "angular-locale_kn-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_kn-in.js")
        case "fobo" :: "angular-locale_mua.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mua.js")
        case "fobo" :: "angular-locale_kab-dz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_kab-dz.js")
        case "fobo" :: "angular-locale_lv-lv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_lv-lv.js")
        case "fobo" :: "angular-locale_en-mh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-mh.js")
        case "fobo" :: "angular-locale_en-cc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-cc.js")
        case "fobo" :: "angular-locale_jmc-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_jmc-tz.js")
        case "fobo" :: "angular-locale_dav.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dav.js")
        case "fobo" :: "angular-locale_sg.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sg.js")
        case "fobo" :: "angular-locale_eu-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_eu-es.js")
        case "fobo" :: "angular-locale_ar-eg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-eg.js")
        case "fobo" :: "angular-locale_es-sv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-sv.js")
        case "fobo" :: "angular-locale_ca-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ca-es.js")
        case "fobo" :: "angular-locale_bm.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bm.js")
        case "fobo" :: "angular-locale_ckb.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ckb.js")
        case "fobo" :: "angular-locale_es-ea.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-ea.js")
        case "fobo" :: "angular-locale_sr-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sr-latn.js")
        case "fobo" :: "angular-locale_tig.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tig.js")
        case "fobo" :: "angular-locale_fr-gf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-gf.js")
        case "fobo" :: "angular-locale_ps.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ps.js")
        case "fobo" :: "angular-locale_en-dg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-dg.js")
        case "fobo" :: "angular-locale_ar-ss.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-ss.js")
        case "fobo" :: "angular-locale_fr-mr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-mr.js")
        case "fobo" :: "angular-locale_kk-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_kk-cyrl.js")
        case "fobo" :: "angular-locale_ksb-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ksb-tz.js")
        case "fobo" :: "angular-locale_ff-sn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ff-sn.js")
        case "fobo" :: "angular-locale_hr-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_hr-ba.js")
        case "fobo" :: "angular-locale_gl-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_gl-es.js")
        case "fobo" :: "angular-locale_bo-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bo-in.js")
        case "fobo" :: "angular-locale_vai-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_vai-latn.js")
        case "fobo" :: "angular-locale_sq.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sq.js")
        case "fobo" :: "angular-locale_fr-gp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-gp.js")
        case "fobo" :: "angular-locale_ar-mr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-mr.js")
        case "fobo" :: "angular-locale_sr-cyrl-rs.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sr-cyrl-rs.js")
        case "fobo" :: "angular-locale_ve-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ve-za.js")
        case "fobo" :: "angular-locale_or-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_or-in.js")
        case "fobo" :: "angular-locale_ru.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ru.js")
        case "fobo" :: "angular-locale_en-gm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-gm.js")
        case "fobo" :: "angular-locale_sq-mk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sq-mk.js")
        case "fobo" :: "angular-locale_hi.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hi.js")
        case "fobo" :: "angular-locale_saq.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_saq.js")
        case "fobo" :: "angular-locale_en-bm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-bm.js")
        case "fobo" :: "angular-locale_mg.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mg.js")
        case "fobo" :: "angular-locale_de-lu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_de-lu.js")
        case "fobo" :: "angular-locale_es-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-es.js")
        case "fobo" :: "angular-locale_shi-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_shi-latn.js")
        case "fobo" :: "angular-locale_bs-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bs-latn.js")
        case "fobo" :: "angular-locale_sah.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sah.js")
        case "fobo" :: "angular-locale_fy.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fy.js")
        case "fobo" :: "angular-locale_ksh.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ksh.js")
        case "fobo" :: "angular-locale_bem-zm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bem-zm.js")
        case "fobo" :: "angular-locale_tr.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tr.js")
        case "fobo" :: "angular-locale_swc-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_swc-cd.js")
        case "fobo" :: "angular-locale_gv.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gv.js")
        case "fobo" :: "angular-locale_br-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_br-fr.js")
        case "fobo" :: "angular-locale_fr-bi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-bi.js")
        case "fobo" :: "angular-locale_pt-gw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_pt-gw.js")
        case "fobo" :: "angular-locale_af-na.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_af-na.js")
        case "fobo" :: "angular-locale_en-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-001.js")
        case "fobo" :: "angular-locale_sn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sn.js")
        case "fobo" :: "angular-locale_jgo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_jgo.js")
        case "fobo" :: "angular-locale_ur.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ur.js")
        case "fobo" :: "angular-locale_uz-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_uz-arab.js")
        case "fobo" :: "angular-locale_en-vi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-vi.js")
        case "fobo" :: "angular-locale_ks-arab-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ks-arab-in.js")
        case "fobo" :: "angular-locale_ee.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ee.js")
        case "fobo" :: "angular-locale_pt-br.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_pt-br.js")
        case "fobo" :: "angular-locale_eo-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_eo-001.js")
        case "fobo" :: "angular-locale_da-dk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_da-dk.js")
        case "fobo" :: "angular-locale_pt-cv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_pt-cv.js")
        case "fobo" :: "angular-locale_nb.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nb.js")
        case "fobo" :: "angular-locale_ar-sd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-sd.js")
        case "fobo" :: "angular-locale_pa.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pa.js")
        case "fobo" :: "angular-locale_fa-ir.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fa-ir.js")
        case "fobo" :: "angular-locale_nl-nl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nl-nl.js")
        case "fobo" :: "angular-locale_yo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_yo.js")
        case "fobo" :: "angular-locale_ts.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ts.js")
        case "fobo" :: "angular-locale_jmc.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_jmc.js")
        case "fobo" :: "angular-locale_en-sh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-sh.js")
        case "fobo" :: "angular-locale_rwk.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rwk.js")
        case "fobo" :: "angular-locale_teo-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_teo-ug.js")
        case "fobo" :: "angular-locale_kea-cv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_kea-cv.js")
        case "fobo" :: "angular-locale_nmg-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nmg-cm.js")
        case "fobo" :: "angular-locale_en-lr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-lr.js")
        case "fobo" :: "angular-locale_byn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_byn.js")
        case "fobo" :: "angular-locale_lg.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lg.js")
        case "fobo" :: "angular-locale_ses.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ses.js")
        case "fobo" :: "angular-locale_fr-bj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-bj.js")
        case "fobo" :: "angular-locale_fo-fo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fo-fo.js")
        case "fobo" :: "angular-locale_or.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_or.js")
        case "fobo" :: "angular-locale_nmg.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nmg.js")
        case "fobo" :: "angular-locale_mgo-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_mgo-cm.js")
        case "fobo" :: "angular-locale_ia.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ia.js")
        case "fobo" :: "angular-locale_so-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_so-ke.js")
        case "fobo" :: "angular-locale_nl.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nl.js")
        case "fobo" :: "angular-locale_en-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ke.js")
        case "fobo" :: "angular-locale_en-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-hk.js")
        case "fobo" :: "angular-locale_ka-ge.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ka-ge.js")
        case "fobo" :: "angular-locale_sr-latn-xk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sr-latn-xk.js")
        case "fobo" :: "angular-locale_zh-hans.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_zh-hans.js")
        case "fobo" :: "angular-locale_ig.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ig.js")
        case "fobo" :: "angular-locale_sv-se.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sv-se.js")
        case "fobo" :: "angular-locale_wal.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_wal.js")
        case "fobo" :: "angular-locale_qu-pe.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_qu-pe.js")
        case "fobo" :: "angular-locale_pa-guru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_pa-guru.js")
        case "fobo" :: "angular-locale_ru-ua.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ru-ua.js")
        case "fobo" :: "angular-locale_ar-sy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-sy.js")
        case "fobo" :: "angular-locale_guz-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_guz-ke.js")
        case "fobo" :: "angular-locale_bm-latn-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bm-latn-ml.js")
        case "fobo" :: "angular-locale_se-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_se-no.js")
        case "fobo" :: "angular-locale_fr-mq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-mq.js")
        case "fobo" :: "angular-locale_ky-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ky-cyrl.js")
        case "fobo" :: "angular-locale_si.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_si.js")
        case "fobo" :: "angular-locale_ro-ro.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ro-ro.js")
        case "fobo" :: "angular-locale_ja-jp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ja-jp.js")
        case "fobo" :: "angular-locale_fr-cf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-cf.js")
        case "fobo" :: "angular-locale_ja.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ja.js")
        case "fobo" :: "angular-locale_ka.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ka.js")
        case "fobo" :: "angular-locale_ko.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ko.js")
        case "fobo" :: "angular-locale_fr-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-cm.js")
        case "fobo" :: "angular-locale_chr.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_chr.js")
        case "fobo" :: "angular-locale_bs-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bs-cyrl.js")
        case "fobo" :: "angular-locale_en-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ng.js")
        case "fobo" :: "angular-locale_eu.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_eu.js")
        case "fobo" :: "angular-locale_ee-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ee-gh.js")
        case "fobo" :: "angular-locale_az-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_az-latn.js")
        case "fobo" :: "angular-locale_rm-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_rm-ch.js")
        case "fobo" :: "angular-locale_en-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-in.js")
        case "fobo" :: "angular-locale_sr-cyrl-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sr-cyrl-ba.js")
        case "fobo" :: "angular-locale_as-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_as-in.js")
        case "fobo" :: "angular-locale_en-nz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-nz.js")
        case "fobo" :: "angular-locale_om-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_om-et.js")
        case "fobo" :: "angular-locale_as.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_as.js")
        case "fobo" :: "angular-locale_ky-cyrl-kg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ky-cyrl-kg.js")
        case "fobo" :: "angular-locale_ckb-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ckb-iq.js")
      }
    }

    lazy val angularjs148i18n4 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_de-at.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_de-at.js")
        case "fobo" :: "angular-locale_ebu-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ebu-ke.js")
        case "fobo" :: "angular-locale_twq-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_twq-ne.js")
        case "fobo" :: "angular-locale_hsb.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hsb.js")
        case "fobo" :: "angular-locale_sv-ax.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sv-ax.js")
        case "fobo" :: "angular-locale_kde-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_kde-tz.js")
        case "fobo" :: "angular-locale_ebu.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ebu.js")
        case "fobo" :: "angular-locale_en-gg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-gg.js")
        case "fobo" :: "angular-locale_cs.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_cs.js")
        case "fobo" :: "angular-locale_vi.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vi.js")
        case "fobo" :: "angular-locale_seh.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_seh.js")
        case "fobo" :: "angular-locale_kk.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kk.js")
        case "fobo" :: "angular-locale_en-bs.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-bs.js")
        case "fobo" :: "angular-locale_en-fk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-fk.js")
        case "fobo" :: "angular-locale_fr-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-fr.js")
        case "fobo" :: "angular-locale_shi-tfng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_shi-tfng.js")
        case "fobo" :: "angular-locale_vo-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_vo-001.js")
        case "fobo" :: "angular-locale_pt-pt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_pt-pt.js")
        case "fobo" :: "angular-locale_ast.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ast.js")
        case "fobo" :: "angular-locale_vi-vn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_vi-vn.js")
        case "fobo" :: "angular-locale_fo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fo.js")
        case "fobo" :: "angular-locale_ar-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-er.js")
        case "fobo" :: "angular-locale_ar-kw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-kw.js")
        case "fobo" :: "angular-locale_es-uy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-uy.js")
        case "fobo" :: "angular-locale_rw-rw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_rw-rw.js")
        case "fobo" :: "angular-locale_ar-so.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-so.js")
        case "fobo" :: "angular-locale_en-vu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-vu.js")
        case "fobo" :: "angular-locale_ksf.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ksf.js")
        case "fobo" :: "angular-locale_ar-eh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-eh.js")
        case "fobo" :: "angular-locale_fr-mu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-mu.js")
        case "fobo" :: "angular-locale_bg.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bg.js")
        case "fobo" :: "angular-locale_en-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-gh.js")
        case "fobo" :: "angular-locale_ru-by.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ru-by.js")
        case "fobo" :: "angular-locale_ig-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ig-ng.js")
        case "fobo" :: "angular-locale_to.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_to.js")
        case "fobo" :: "angular-locale_nus-sd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nus-sd.js")
        case "fobo" :: "angular-locale_kl-gl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_kl-gl.js")
        case "fobo" :: "angular-locale_ms-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ms-latn.js")
        case "fobo" :: "angular-locale_nl-aw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nl-aw.js")
        case "fobo" :: "angular-locale_en-na.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-na.js")
        case "fobo" :: "angular-locale_kkj-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_kkj-cm.js")
        case "fobo" :: "angular-locale_af-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_af-za.js")
        case "fobo" :: "angular-locale_kok-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_kok-in.js")
        case "fobo" :: "angular-locale_so-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_so-dj.js")
        case "fobo" :: "angular-locale_fur.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fur.js")
        case "fobo" :: "angular-locale_sbp.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sbp.js")
        case "fobo" :: "angular-locale_en-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-tz.js")
        case "fobo" :: "angular-locale_en-ss.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ss.js")
        case "fobo" :: "angular-locale_lt-lt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_lt-lt.js")
        case "fobo" :: "angular-locale_en-cx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-cx.js")
        case "fobo" :: "angular-locale_zh-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_zh-hk.js")
        case "fobo" :: "angular-locale_fi-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fi-fi.js")
        case "fobo" :: "angular-locale_mer.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mer.js")
        case "fobo" :: "angular-locale_tig-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_tig-er.js")
        case "fobo" :: "angular-locale_mas-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_mas-tz.js")
        case "fobo" :: "angular-locale_en-dm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-dm.js")
        case "fobo" :: "angular-locale_en-kn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-kn.js")
        case "fobo" :: "angular-locale_ko-kp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ko-kp.js")
        case "fobo" :: "angular-locale_en-iso.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-iso.js")
        case "fobo" :: "angular-locale_sbp-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_sbp-tz.js")
        case "fobo" :: "angular-locale_ha.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ha.js")
        case "fobo" :: "angular-locale_kk-cyrl-kz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_kk-cyrl-kz.js")
        case "fobo" :: "angular-locale_tg-cyrl-tj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_tg-cyrl-tj.js")
        case "fobo" :: "angular-locale_ga-ie.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ga-ie.js")
        case "fobo" :: "angular-locale_kln-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_kln-ke.js")
        case "fobo" :: "angular-locale_ar-om.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-om.js")
        case "fobo" :: "angular-locale_bas.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bas.js")
        case "fobo" :: "angular-locale_bas-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bas-cm.js")
        case "fobo" :: "angular-locale_zh-hant-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_zh-hant-mo.js")
        case "fobo" :: "angular-locale_ln-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ln-cd.js")
        case "fobo" :: "angular-locale_en-lc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-lc.js")
        case "fobo" :: "angular-locale_en-sz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-sz.js")
        case "fobo" :: "angular-locale_hsb-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_hsb-de.js")
        case "fobo" :: "angular-locale_ii-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ii-cn.js")
        case "fobo" :: "angular-locale_en-tk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-tk.js")
        case "fobo" :: "angular-locale_fr-ci.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-ci.js")
        case "fobo" :: "angular-locale_ms.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ms.js")
        case "fobo" :: "angular-locale_kde.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kde.js")
        case "fobo" :: "angular-locale_ar-td.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-td.js")
        case "fobo" :: "angular-locale_ca-es-valencia.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ca-es-valencia.js")
        case "fobo" :: "angular-locale_vai-vaii.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_vai-vaii.js")
        case "fobo" :: "angular-locale_fr-mf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-mf.js")
        case "fobo" :: "angular-locale_en-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-er.js")
        case "fobo" :: "angular-locale_fur-it.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fur-it.js")
        case "fobo" :: "angular-locale_mn-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_mn-cyrl.js")
        case "fobo" :: "angular-locale_ar-ps.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-ps.js")
        case "fobo" :: "angular-locale_lag-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_lag-tz.js")
        case "fobo" :: "angular-locale_xog.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_xog.js")
        case "fobo" :: "angular-locale_khq-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_khq-ml.js")
        case "fobo" :: "angular-locale_ar-bh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-bh.js")
        case "fobo" :: "angular-locale_yav.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_yav.js")
        case "fobo" :: "angular-locale_be.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_be.js")
        case "fobo" :: "angular-locale_en-je.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-je.js")
        case "fobo" :: "angular-locale_rn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rn.js")
        case "fobo" :: "angular-locale_en-ck.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ck.js")
        case "fobo" :: "angular-locale_en-tt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-tt.js")
        case "fobo" :: "angular-locale_dyo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dyo.js")
        case "fobo" :: "angular-locale_da-gl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_da-gl.js")
        case "fobo" :: "angular-locale_nnh-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_nnh-cm.js")
        case "fobo" :: "angular-locale_ml.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ml.js")
        case "fobo" :: "angular-locale_ru-ru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ru-ru.js")
        case "fobo" :: "angular-locale_bm-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_bm-latn.js")
        case "fobo" :: "angular-locale_twq.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_twq.js")
        case "fobo" :: "angular-locale_kam.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kam.js")
        case "fobo" :: "angular-locale_dua.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dua.js")
        case "fobo" :: "angular-locale_uz-latn-uz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_uz-latn-uz.js")
        case "fobo" :: "angular-locale_es-419.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-419.js")
        case "fobo" :: "angular-locale_en-sc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-sc.js")
        case "fobo" :: "angular-locale_ar-il.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-il.js")
        case "fobo" :: "angular-locale_nus.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nus.js")
        case "fobo" :: "angular-locale_in.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_in.js")
        case "fobo" :: "angular-locale_ml-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ml-in.js")
        case "fobo" :: "angular-locale_fr-nc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-nc.js")
        case "fobo" :: "angular-locale_en-fj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-fj.js")
        case "fobo" :: "angular-locale_en-ky.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-ky.js")
        case "fobo" :: "angular-locale_fr-bf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-bf.js")
        case "fobo" :: "angular-locale_dav-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_dav-ke.js")
        case "fobo" :: "angular-locale_uz-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_uz-cyrl.js")
        case "fobo" :: "angular-locale_ar-qa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ar-qa.js")
        case "fobo" :: "angular-locale_en.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en.js")
        case "fobo" :: "angular-locale_km-kh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_km-kh.js")
        case "fobo" :: "angular-locale_aa.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_aa.js")
        case "fobo" :: "angular-locale_fil-ph.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fil-ph.js")
        case "fobo" :: "angular-locale_mn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mn.js")
        case "fobo" :: "angular-locale_nnh.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nnh.js")
        case "fobo" :: "angular-locale_ca-it.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ca-it.js")
        case "fobo" :: "angular-locale_tn-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_tn-za.js")
        case "fobo" :: "angular-locale_en-mw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-mw.js")
        case "fobo" :: "angular-locale_vun.js" :: Nil =>
          List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vun.js")
        case "fobo" :: "angular-locale_kam-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_kam-ke.js")
        case "fobo" :: "angular-locale_en-vg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_en-vg.js")
        case "fobo" :: "angular-locale_ak-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ak-gh.js")
        case "fobo" :: "angular-locale_fr-ga.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-ga.js")
        case "fobo" :: "angular-locale_es-py.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-py.js")
        case "fobo" :: "angular-locale_dje-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_dje-ne.js")
        case "fobo" :: "angular-locale_fr-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_fr-ne.js")
        case "fobo" :: "angular-locale_mg-mg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_mg-mg.js")
        case "fobo" :: "angular-locale_gsw-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_gsw-fr.js")
        case "fobo" :: "angular-locale_ia-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_ia-fr.js")
        case "fobo" :: "angular-locale_es-bo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.8",
               "i18n",
               "angular-locale_es-bo.js")
      }
    }

    lazy val angularjs141 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.1", "js", "angular.js")
        case "fobo" :: "angular.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
        case "fobo" :: "angular.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular.min.js.map")

        case "fobo" :: "angular-animate.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-animate.js")
        case "fobo" :: "angular-animate.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-animate.min.js")
        case "fobo" :: "angular-animate.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "js",
               "angular-animate.min.js.map")

        case "fobo" :: "angular-aria.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-aria.js")
        case "fobo" :: "angular-aria.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-aria.min.js")
        case "fobo" :: "angular-aria.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-aria.min.js.map")

        case "fobo" :: "angular-cookies.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-cookies.js")
        case "fobo" :: "angular-cookies.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-cookies.min.js")
        case "fobo" :: "angular-cookies.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "js",
               "angular-cookies.min.js.map")

        case "fobo" :: "angular-loader.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-loader.js")
        case "fobo" :: "angular-loader.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-loader.min.js")
        case "fobo" :: "angular-loader.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "js",
               "angular.min-loader.js.map")

        case "fobo" :: "angular-message-format.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-messages.js")
        case "fobo" :: "angular-message-format.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-messages.min.js")
        case "fobo" :: "angular-message-format.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "js",
               "angular.min-messages.js.map")

        case "fobo" :: "angular-messages.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-messages.js")
        case "fobo" :: "angular-messages.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-messages.min.js")
        case "fobo" :: "angular-messages.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "js",
               "angular.min-messages.js.map")

        //dev/test only
        case "fobo" :: "angular-mocks.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-mocks.js")

        case "fobo" :: "angular-resource.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-resource.js")
        case "fobo" :: "angular-resource.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-resource.min.js")
        case "fobo" :: "angular-resource.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "js",
               "angular-resource.min.js.map")

        case "fobo" :: "angular-route.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-route.js")
        case "fobo" :: "angular-route.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-route.min.js")
        case "fobo" :: "angular-route.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-route.min.js.map")

        case "fobo" :: "angular-sanitize.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-sanitize.js")
        case "fobo" :: "angular-sanitize.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-sanitize.min.js")
        case "fobo" :: "angular-sanitize.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "js",
               "angular-sanitize.min.js.map")
        //dev/test only 
        case "fobo" :: "angular-scenario.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-scenario.js")

        case "fobo" :: "angular-touch.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-touch.js")
        case "fobo" :: "angular-touch.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-touch.min.js")
        case "fobo" :: "angular-touch.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "js", "angular-touch.min.js.map")

        //CSS files
        case "fobo" :: "angular-csp.css" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.4.1", "css", "angular-csp.css")
        case "fobo" :: "angular-csp.css" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "css", "angular-csp.min.css")

      }
    }

    lazy val angularjs141i18n = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_nl-cw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nl-cw.js")
        case "fobo" :: "angular-locale_se-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_se-fi.js")
        case "fobo" :: "angular-locale_en-bz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-bz.js")
        case "fobo" :: "angular-locale_os-ru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_os-ru.js")
        case "fobo" :: "angular-locale_lkt-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_lkt-us.js")
        case "fobo" :: "angular-locale_en-pk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-pk.js")
        case "fobo" :: "angular-locale_he.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_he.js")
        case "fobo" :: "angular-locale_sr-latn-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sr-latn-ba.js")
        case "fobo" :: "angular-locale_teo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_teo.js")
        case "fobo" :: "angular-locale_hy.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hy.js")
        case "fobo" :: "angular-locale_ms-latn-bn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ms-latn-bn.js")
        case "fobo" :: "angular-locale_az.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_az.js")
        case "fobo" :: "angular-locale_nd.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nd.js")
        case "fobo" :: "angular-locale_fr-rw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-rw.js")
        case "fobo" :: "angular-locale_so-so.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_so-so.js")
        case "fobo" :: "angular-locale_ckb-latn-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ckb-latn-iq.js")
        case "fobo" :: "angular-locale_de-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_de-ch.js")
        case "fobo" :: "angular-locale_ar-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-iq.js")
        case "fobo" :: "angular-locale_yav-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_yav-cm.js")
        case "fobo" :: "angular-locale_tg-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_tg-cyrl.js")
        case "fobo" :: "angular-locale_os-ge.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_os-ge.js")
        case "fobo" :: "angular-locale_hu.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hu.js")
        case "fobo" :: "angular-locale_pt-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_pt-mo.js")
        case "fobo" :: "angular-locale_ha-latn-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ha-latn-gh.js")
        case "fobo" :: "angular-locale_fr-cg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-cg.js")
        case "fobo" :: "angular-locale_mfe.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mfe.js")
        case "fobo" :: "angular-locale_en-ca.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ca.js")
        case "fobo" :: "angular-locale_st-ls.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_st-ls.js")
        case "fobo" :: "angular-locale_kw-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_kw-gb.js")
        case "fobo" :: "angular-locale_ss.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ss.js")
        case "fobo" :: "angular-locale_zgh.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zgh.js")
        case "fobo" :: "angular-locale_fr-dz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-dz.js")
        case "fobo" :: "angular-locale_fr-bl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-bl.js")
        case "fobo" :: "angular-locale_fa.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fa.js")
        case "fobo" :: "angular-locale_mk.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mk.js")
        case "fobo" :: "angular-locale_mr-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_mr-in.js")
        case "fobo" :: "angular-locale_sv-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sv-fi.js")
        case "fobo" :: "angular-locale_it.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_it.js")
        case "fobo" :: "angular-locale_en-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-cm.js")
        case "fobo" :: "angular-locale_no-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_no-no.js")
        case "fobo" :: "angular-locale_ckb-ir.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ckb-ir.js")
        case "fobo" :: "angular-locale_en-to.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-to.js")
        case "fobo" :: "angular-locale_fr-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-cd.js")
        case "fobo" :: "angular-locale_fr-sn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-sn.js")
        case "fobo" :: "angular-locale_cgg.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_cgg.js")
        case "fobo" :: "angular-locale_ky.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ky.js")
        case "fobo" :: "angular-locale_chr-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_chr-us.js")
        case "fobo" :: "angular-locale_naq.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_naq.js")
        case "fobo" :: "angular-locale_ar.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar.js")
        case "fobo" :: "angular-locale_fr-pm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-pm.js")
        case "fobo" :: "angular-locale_qu-bo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_qu-bo.js")
        case "fobo" :: "angular-locale_gv-im.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_gv-im.js")
        case "fobo" :: "angular-locale_is.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_is.js")
        case "fobo" :: "angular-locale_bg-bg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bg-bg.js")
        case "fobo" :: "angular-locale_fi.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fi.js")
        case "fobo" :: "angular-locale_bn-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bn-in.js")
        case "fobo" :: "angular-locale_agq.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_agq.js")
        case "fobo" :: "angular-locale_khq.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_khq.js")
        case "fobo" :: "angular-locale_bs-latn-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bs-latn-ba.js")
        case "fobo" :: "angular-locale_en-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-sg.js")
        case "fobo" :: "angular-locale_zh-hant-tw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_zh-hant-tw.js")
        case "fobo" :: "angular-locale_fr-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-ch.js")
        case "fobo" :: "angular-locale_zgh-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_zgh-ma.js")
        case "fobo" :: "angular-locale_ms-latn-my.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ms-latn-my.js")
        case "fobo" :: "angular-locale_fr-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-ma.js")
        case "fobo" :: "angular-locale_en-fm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-fm.js")
        case "fobo" :: "angular-locale_mgh.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mgh.js")
        case "fobo" :: "angular-locale_jgo-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_jgo-cm.js")
        case "fobo" :: "angular-locale_en-zm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-zm.js")
        case "fobo" :: "angular-locale_zh-tw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_zh-tw.js")
        case "fobo" :: "angular-locale_ki-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ki-ke.js")
        case "fobo" :: "angular-locale_vai.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vai.js")
        case "fobo" :: "angular-locale_fr-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-ml.js")
        case "fobo" :: "angular-locale_lu.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lu.js")
        case "fobo" :: "angular-locale_en-gu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-gu.js")
        case "fobo" :: "angular-locale_sw-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sw-ke.js")
        case "fobo" :: "angular-locale_asa.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_asa.js")
        case "fobo" :: "angular-locale_pt.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pt.js")
        case "fobo" :: "angular-locale_nd-zw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nd-zw.js")
        case "fobo" :: "angular-locale_uz.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_uz.js")
        case "fobo" :: "angular-locale_shi.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_shi.js")
        case "fobo" :: "angular-locale_sk.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sk.js")
        case "fobo" :: "angular-locale_gu.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gu.js")
        case "fobo" :: "angular-locale_pa-guru-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_pa-guru-in.js")
        case "fobo" :: "angular-locale_lb.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lb.js")
        case "fobo" :: "angular-locale_ps-af.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ps-af.js")
        case "fobo" :: "angular-locale_ar-dz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-dz.js")
        case "fobo" :: "angular-locale_ru-kz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ru-kz.js")
        case "fobo" :: "angular-locale_en-sl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-sl.js")
        case "fobo" :: "angular-locale_zh-hant-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_zh-hant-hk.js")
        case "fobo" :: "angular-locale_ts-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ts-za.js")
        case "fobo" :: "angular-locale_sah-ru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sah-ru.js")
        case "fobo" :: "angular-locale_rwk-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_rwk-tz.js")
        case "fobo" :: "angular-locale_dyo-sn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_dyo-sn.js")
        case "fobo" :: "angular-locale_et.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_et.js")
        case "fobo" :: "angular-locale_ss-sz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ss-sz.js")
        case "fobo" :: "angular-locale_nn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nn.js")
        case "fobo" :: "angular-locale_bem.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bem.js")
        case "fobo" :: "angular-locale_ssy-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ssy-er.js")
        case "fobo" :: "angular-locale_en-nu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-nu.js")
        case "fobo" :: "angular-locale_mt.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mt.js")
        case "fobo" :: "angular-locale_pt-mz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_pt-mz.js")
        case "fobo" :: "angular-locale_nyn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nyn.js")
        case "fobo" :: "angular-locale_ksh-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ksh-de.js")
        case "fobo" :: "angular-locale_bez-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bez-tz.js")
        case "fobo" :: "angular-locale_es-gq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-gq.js")
        case "fobo" :: "angular-locale_ii.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ii.js")
        case "fobo" :: "angular-locale_es-ve.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-ve.js")
        case "fobo" :: "angular-locale_ta-my.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ta-my.js")
        case "fobo" :: "angular-locale_bs.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bs.js")
        case "fobo" :: "angular-locale_zh-hant.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_zh-hant.js")
        case "fobo" :: "angular-locale_bs-cyrl-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bs-cyrl-ba.js")
        case "fobo" :: "angular-locale_el-gr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_el-gr.js")
        case "fobo" :: "angular-locale_it-it.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_it-it.js")
        case "fobo" :: "angular-locale_mgh-mz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_mgh-mz.js")
        case "fobo" :: "angular-locale_es-do.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-do.js")
        case "fobo" :: "angular-locale_ff.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ff.js")
        case "fobo" :: "angular-locale_wal-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_wal-et.js")
        case "fobo" :: "angular-locale_hi-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_hi-in.js")
        case "fobo" :: "angular-locale_cs-cz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_cs-cz.js")
        case "fobo" :: "angular-locale_ssy.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ssy.js")
        case "fobo" :: "angular-locale_hr-hr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_hr-hr.js")
        case "fobo" :: "angular-locale_yo-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_yo-ng.js")
        case "fobo" :: "angular-locale_en-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-za.js")
        case "fobo" :: "angular-locale_ln-ao.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ln-ao.js")
        case "fobo" :: "angular-locale_ms-latn-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ms-latn-sg.js")
        case "fobo" :: "angular-locale_el-cy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_el-cy.js")
        case "fobo" :: "angular-locale_ur-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ur-in.js")
        case "fobo" :: "angular-locale_bn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bn.js")
        case "fobo" :: "angular-locale_zu-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_zu-za.js")
        case "fobo" :: "angular-locale_ca.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ca.js")
        case "fobo" :: "angular-locale_sw.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sw.js")
        case "fobo" :: "angular-locale_tzm-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_tzm-latn.js")
        case "fobo" :: "angular-locale_fr-tn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-tn.js")
        case "fobo" :: "angular-locale_en-ai.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ai.js")
        case "fobo" :: "angular-locale_yi-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_yi-001.js")
        case "fobo" :: "angular-locale_en-ie.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ie.js")
        case "fobo" :: "angular-locale_es-hn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-hn.js")
        case "fobo" :: "angular-locale_es-cr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-cr.js")
        case "fobo" :: "angular-locale_ar-jo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-jo.js")
        case "fobo" :: "angular-locale_xh-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_xh-za.js")
        case "fobo" :: "angular-locale_sr.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sr.js")
        case "fobo" :: "angular-locale_fr-lu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-lu.js")
        case "fobo" :: "angular-locale_en-um.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-um.js")
        case "fobo" :: "angular-locale_es-cu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-cu.js")
        case "fobo" :: "angular-locale_qu-ec.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_qu-ec.js")
        case "fobo" :: "angular-locale_ro-md.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ro-md.js")
        case "fobo" :: "angular-locale_to-to.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_to-to.js")
        case "fobo" :: "angular-locale_zh-hans-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_zh-hans-hk.js")
        case "fobo" :: "angular-locale_fr-mg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-mg.js")
        case "fobo" :: "angular-locale_haw.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_haw.js")
        case "fobo" :: "angular-locale_ro.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ro.js")
        case "fobo" :: "angular-locale_es-ar.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-ar.js")
        case "fobo" :: "angular-locale_fr.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr.js")
        case "fobo" :: "angular-locale_it-sm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_it-sm.js")
        case "fobo" :: "angular-locale_uk-ua.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_uk-ua.js")
        case "fobo" :: "angular-locale_aa-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_aa-er.js")
        case "fobo" :: "angular-locale_ha-latn-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ha-latn-ne.js")
        case "fobo" :: "angular-locale_pt-st.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_pt-st.js")
        case "fobo" :: "angular-locale_en-ki.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ki.js")
        case "fobo" :: "angular-locale_rof.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rof.js")
        case "fobo" :: "angular-locale_kn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kn.js")
        case "fobo" :: "angular-locale_sr-latn-me.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sr-latn-me.js")
        case "fobo" :: "angular-locale_kok.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kok.js")
        case "fobo" :: "angular-locale_en-pr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-pr.js")
        case "fobo" :: "angular-locale_ne-np.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ne-np.js")
        case "fobo" :: "angular-locale_lu-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_lu-cd.js")
        case "fobo" :: "angular-locale_sl.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sl.js")
        case "fobo" :: "angular-locale_ckb-arab-ir.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ckb-arab-ir.js")
        case "fobo" :: "angular-locale_ug-arab-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ug-arab-cn.js")
        case "fobo" :: "angular-locale_mn-cyrl-mn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_mn-cyrl-mn.js")
        case "fobo" :: "angular-locale_fr-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-dj.js")
        case "fobo" :: "angular-locale_ks-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ks-arab.js")
        case "fobo" :: "angular-locale_luo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_luo.js")
        case "fobo" :: "angular-locale_xh.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_xh.js")
        case "fobo" :: "angular-locale_luo-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_luo-ke.js")
        case "fobo" :: "angular-locale_it-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_it-ch.js")
        case "fobo" :: "angular-locale_mas.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mas.js")
        case "fobo" :: "angular-locale_ksf-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ksf-cm.js")
        case "fobo" :: "angular-locale_sq-xk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sq-xk.js")
        case "fobo" :: "angular-locale_en-gd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-gd.js")
        case "fobo" :: "angular-locale_kea.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kea.js")
        case "fobo" :: "angular-locale_ve.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ve.js")
        case "fobo" :: "angular-locale_rof-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_rof-tz.js")
        case "fobo" :: "angular-locale_en-sb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-sb.js")
        case "fobo" :: "angular-locale_ne.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ne.js")
        case "fobo" :: "angular-locale_fr-km.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-km.js")
        case "fobo" :: "angular-locale_my.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_my.js")
        case "fobo" :: "angular-locale_sr-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sr-cyrl.js")
        case "fobo" :: "angular-locale_cy.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_cy.js")
        case "fobo" :: "angular-locale_gu-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_gu-in.js")
        case "fobo" :: "angular-locale_es-mx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-mx.js")
        case "fobo" :: "angular-locale_bn-bd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bn-bd.js")
        case "fobo" :: "angular-locale_am-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_am-et.js")
        case "fobo" :: "angular-locale_mk-mk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_mk-mk.js")
        case "fobo" :: "angular-locale_lag.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lag.js")
        case "fobo" :: "angular-locale_en-ms.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ms.js")
        case "fobo" :: "angular-locale_brx-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_brx-in.js")
        case "fobo" :: "angular-locale_sr-latn-rs.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sr-latn-rs.js")
        case "fobo" :: "angular-locale_sl-si.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sl-si.js")
        case "fobo" :: "angular-locale_mgo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mgo.js")
      }
    }

    lazy val angularjs141i18n2 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_ha-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ha-latn.js")
        case "fobo" :: "angular-locale_tg.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tg.js")
        case "fobo" :: "angular-locale_am.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_am.js")
        case "fobo" :: "angular-locale_bo-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bo-cn.js")
        case "fobo" :: "angular-locale_en-mt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-mt.js")
        case "fobo" :: "angular-locale_dua-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_dua-cm.js")
        case "fobo" :: "angular-locale_sr-cyrl-xk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sr-cyrl-xk.js")
        case "fobo" :: "angular-locale_ar-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-ma.js")
        case "fobo" :: "angular-locale_en-pn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-pn.js")
        case "fobo" :: "angular-locale_te.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_te.js")
        case "fobo" :: "angular-locale_ast-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ast-es.js")
        case "fobo" :: "angular-locale_pa-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_pa-arab.js")
        case "fobo" :: "angular-locale_zh.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zh.js")
        case "fobo" :: "angular-locale_es-pr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-pr.js")
        case "fobo" :: "angular-locale_nb-sj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nb-sj.js")
        case "fobo" :: "angular-locale_ar-ye.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-ye.js")
        case "fobo" :: "angular-locale_fr-pf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-pf.js")
        case "fobo" :: "angular-locale_saq-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_saq-ke.js")
        case "fobo" :: "angular-locale_de-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_de-be.js")
        case "fobo" :: "angular-locale_fr-wf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-wf.js")
        case "fobo" :: "angular-locale_gd.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gd.js")
        case "fobo" :: "angular-locale_no.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_no.js")
        case "fobo" :: "angular-locale_el.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_el.js")
        case "fobo" :: "angular-locale_ca-ad.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ca-ad.js")
        case "fobo" :: "angular-locale_km.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_km.js")
        case "fobo" :: "angular-locale_en-tc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-tc.js")
        case "fobo" :: "angular-locale_es-ni.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-ni.js")
        case "fobo" :: "angular-locale_so.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_so.js")
        case "fobo" :: "angular-locale_kkj.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kkj.js")
        case "fobo" :: "angular-locale_tr-cy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_tr-cy.js")
        case "fobo" :: "angular-locale_en-150.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-150.js")
        case "fobo" :: "angular-locale_kln.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kln.js")
        case "fobo" :: "angular-locale_qu.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_qu.js")
        case "fobo" :: "angular-locale_lo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lo.js")
        case "fobo" :: "angular-locale_os.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_os.js")
        case "fobo" :: "angular-locale_zh-hans-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_zh-hans-mo.js")
        case "fobo" :: "angular-locale_ses-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ses-ml.js")
        case "fobo" :: "angular-locale_fr-sy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-sy.js")
        case "fobo" :: "angular-locale_fr-td.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-td.js")
        case "fobo" :: "angular-locale_mt-mt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_mt-mt.js")
        case "fobo" :: "angular-locale_en-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-us.js")
        case "fobo" :: "angular-locale_zh-hans-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_zh-hans-sg.js")
        case "fobo" :: "angular-locale_az-latn-az.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_az-latn-az.js")
        case "fobo" :: "angular-locale_uz-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_uz-latn.js")
        case "fobo" :: "angular-locale_dsb.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dsb.js")
        case "fobo" :: "angular-locale_bez.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bez.js")
        case "fobo" :: "angular-locale_fr-vu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-vu.js")
        case "fobo" :: "angular-locale_fr-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-be.js")
        case "fobo" :: "angular-locale_hr.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hr.js")
        case "fobo" :: "angular-locale_agq-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_agq-cm.js")
        case "fobo" :: "angular-locale_smn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_smn.js")
        case "fobo" :: "angular-locale_kl.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kl.js")
        case "fobo" :: "angular-locale_ak.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ak.js")
        case "fobo" :: "angular-locale_nr.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nr.js")
        case "fobo" :: "angular-locale_en-sd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-sd.js")
        case "fobo" :: "angular-locale_fr-ht.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-ht.js")
        case "fobo" :: "angular-locale_fr-gn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-gn.js")
        case "fobo" :: "angular-locale_st-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_st-za.js")
        case "fobo" :: "angular-locale_es-ec.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-ec.js")
        case "fobo" :: "angular-locale_mas-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_mas-ke.js")
        case "fobo" :: "angular-locale_seh-mz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_seh-mz.js")
        case "fobo" :: "angular-locale_ta-lk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ta-lk.js")
        case "fobo" :: "angular-locale_bo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bo.js")
        case "fobo" :: "angular-locale_ewo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ewo.js")
        case "fobo" :: "angular-locale_en-nr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-nr.js")
        case "fobo" :: "angular-locale_en-au.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-au.js")
        case "fobo" :: "angular-locale_shi-tfng-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_shi-tfng-ma.js")
        case "fobo" :: "angular-locale_guz.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_guz.js")
        case "fobo" :: "angular-locale_id-id.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_id-id.js")
        case "fobo" :: "angular-locale_en-ws.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ws.js")
        case "fobo" :: "angular-locale_tn-bw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_tn-bw.js")
        case "fobo" :: "angular-locale_sw-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sw-tz.js")
        case "fobo" :: "angular-locale_kab.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kab.js")
        case "fobo" :: "angular-locale_az-cyrl-az.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_az-cyrl-az.js")
        case "fobo" :: "angular-locale_de-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_de-de.js")
        case "fobo" :: "angular-locale_en-pg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-pg.js")
        case "fobo" :: "angular-locale_sr-cyrl-me.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sr-cyrl-me.js")
        case "fobo" :: "angular-locale_ar-km.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-km.js")
        case "fobo" :: "angular-locale_ar-lb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-lb.js")
        case "fobo" :: "angular-locale_wae-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_wae-ch.js")
        case "fobo" :: "angular-locale_luy-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_luy-ke.js")
        case "fobo" :: "angular-locale_be-by.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_be-by.js")
        case "fobo" :: "angular-locale_ar-tn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-tn.js")
        case "fobo" :: "angular-locale_en-gi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-gi.js")
        case "fobo" :: "angular-locale_te-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_te-in.js")
        case "fobo" :: "angular-locale_en-my.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-my.js")
        case "fobo" :: "angular-locale_en-ag.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ag.js")
        case "fobo" :: "angular-locale_ta-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ta-in.js")
        case "fobo" :: "angular-locale_es-cl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-cl.js")
        case "fobo" :: "angular-locale_shi-latn-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_shi-latn-ma.js")
        case "fobo" :: "angular-locale_hu-hu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_hu-hu.js")
        case "fobo" :: "angular-locale_ln-cg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ln-cg.js")
        case "fobo" :: "angular-locale_tzm.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tzm.js")
        case "fobo" :: "angular-locale_aa-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_aa-et.js")
        case "fobo" :: "angular-locale_ff-gn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ff-gn.js")
        case "fobo" :: "angular-locale_fr-ca.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-ca.js")
        case "fobo" :: "angular-locale_he-il.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_he-il.js")
        case "fobo" :: "angular-locale_vo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vo.js")
        case "fobo" :: "angular-locale_es-gt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-gt.js")
        case "fobo" :: "angular-locale_rw.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rw.js")
        case "fobo" :: "angular-locale_uz-arab-af.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_uz-arab-af.js")
        case "fobo" :: "angular-locale_id.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_id.js")
        case "fobo" :: "angular-locale_en-gy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-gy.js")
        case "fobo" :: "angular-locale_ko-kr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ko-kr.js")
        case "fobo" :: "angular-locale_smn-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_smn-fi.js")
        case "fobo" :: "angular-locale_lkt.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lkt.js")
        case "fobo" :: "angular-locale_hy-am.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_hy-am.js")
        case "fobo" :: "angular-locale_ksb.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ksb.js")
        case "fobo" :: "angular-locale_pt-tl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_pt-tl.js")
        case "fobo" :: "angular-locale_ar-ly.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-ly.js")
        case "fobo" :: "angular-locale_ur-pk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ur-pk.js")
        case "fobo" :: "angular-locale_dsb-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_dsb-de.js")
        case "fobo" :: "angular-locale_en-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-mo.js")
        case "fobo" :: "angular-locale_nl-sr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nl-sr.js")
        case "fobo" :: "angular-locale_fy-nl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fy-nl.js")
        case "fobo" :: "angular-locale_yo-bj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_yo-bj.js")
        case "fobo" :: "angular-locale_xog-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_xog-ug.js")
        case "fobo" :: "angular-locale_ar-sa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-sa.js")
        case "fobo" :: "angular-locale_dje.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dje.js")
        case "fobo" :: "angular-locale_fr-sc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-sc.js")
        case "fobo" :: "angular-locale_en-mp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-mp.js")
        case "fobo" :: "angular-locale_es-pe.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-pe.js")
        case "fobo" :: "angular-locale_fr-re.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-re.js")
        case "fobo" :: "angular-locale_uk.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_uk.js")
        case "fobo" :: "angular-locale_en-rw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-rw.js")
        case "fobo" :: "angular-locale_pt-ao.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_pt-ao.js")
        case "fobo" :: "angular-locale_zh-hans-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_zh-hans-cn.js")
        case "fobo" :: "angular-locale_yi.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_yi.js")
        case "fobo" :: "angular-locale_ug-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ug-arab.js")
        case "fobo" :: "angular-locale_my-mm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_my-mm.js")
        case "fobo" :: "angular-locale_lt.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lt.js")
        case "fobo" :: "angular-locale_ta.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ta.js")
        case "fobo" :: "angular-locale_ki.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ki.js")
        case "fobo" :: "angular-locale_iw.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_iw.js")
        case "fobo" :: "angular-locale_fr-gq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-gq.js")
        case "fobo" :: "angular-locale_om.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_om.js")
        case "fobo" :: "angular-locale_ne-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ne-in.js")
        case "fobo" :: "angular-locale_rn-bi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_rn-bi.js")
        case "fobo" :: "angular-locale_ckb-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ckb-arab.js")
        case "fobo" :: "angular-locale_nn-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nn-no.js")
        case "fobo" :: "angular-locale_en-mg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-mg.js")
        case "fobo" :: "angular-locale_ga.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ga.js")
        case "fobo" :: "angular-locale_es-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-us.js")
        case "fobo" :: "angular-locale_en-tv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-tv.js")
        case "fobo" :: "angular-locale_mer-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_mer-ke.js")
        case "fobo" :: "angular-locale_ss-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ss-za.js")
        case "fobo" :: "angular-locale_en-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-gb.js")
        case "fobo" :: "angular-locale_en-mu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-mu.js")
        case "fobo" :: "angular-locale_lv.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lv.js")
        case "fobo" :: "angular-locale_fr-tg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-tg.js")
        case "fobo" :: "angular-locale_vun-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_vun-tz.js")
        case "fobo" :: "angular-locale_gd-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_gd-gb.js")
        case "fobo" :: "angular-locale_st.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_st.js")
        case "fobo" :: "angular-locale_pl-pl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_pl-pl.js")
        case "fobo" :: "angular-locale_bm-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bm-ml.js")
        case "fobo" :: "angular-locale_ar-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-dj.js")
        case "fobo" :: "angular-locale_en-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-be.js")
        case "fobo" :: "angular-locale_en-ls.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ls.js")
        case "fobo" :: "angular-locale_aa-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_aa-dj.js")
        case "fobo" :: "angular-locale_haw-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_haw-us.js")
        case "fobo" :: "angular-locale_ta-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ta-sg.js")
        case "fobo" :: "angular-locale_sw-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sw-ug.js")
        case "fobo" :: "angular-locale_gl.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gl.js")
        case "fobo" :: "angular-locale_es-ic.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-ic.js")
        case "fobo" :: "angular-locale_en-pw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-pw.js")
        case "fobo" :: "angular-locale_nr-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nr-za.js")
        case "fobo" :: "angular-locale_ti.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ti.js")
        case "fobo" :: "angular-locale_en-bw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-bw.js")
        case "fobo" :: "angular-locale_az-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_az-cyrl.js")
        case "fobo" :: "angular-locale_gsw.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gsw.js")
        case "fobo" :: "angular-locale_en-jm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-jm.js")
        case "fobo" :: "angular-locale_cgg-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_cgg-ug.js")
        case "fobo" :: "angular-locale_rm.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rm.js")
        case "fobo" :: "angular-locale_mr.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mr.js")
        case "fobo" :: "angular-locale_th.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_th.js")
        case "fobo" :: "angular-locale_br.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_br.js")
        case "fobo" :: "angular-locale_en-im.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-im.js")
        case "fobo" :: "angular-locale_lg-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_lg-ug.js")
        case "fobo" :: "angular-locale_en-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ug.js")
        case "fobo" :: "angular-locale_dz.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dz.js")
        case "fobo" :: "angular-locale_vai-latn-lr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_vai-latn-lr.js")
        case "fobo" :: "angular-locale_nb-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nb-no.js")
        case "fobo" :: "angular-locale_se.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_se.js")
        case "fobo" :: "angular-locale_ckb-arab-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ckb-arab-iq.js")
        case "fobo" :: "angular-locale_asa-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_asa-tz.js")
        case "fobo" :: "angular-locale_ar-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-001.js")
        case "fobo" :: "angular-locale_brx.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_brx.js")
        case "fobo" :: "angular-locale_es-co.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-co.js")
        case "fobo" :: "angular-locale_ewo-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ewo-cm.js")
        case "fobo" :: "angular-locale_ln.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ln.js")
        case "fobo" :: "angular-locale_sk-sk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sk-sk.js")
        case "fobo" :: "angular-locale_vai-vaii-lr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_vai-vaii-lr.js")
        case "fobo" :: "angular-locale_ug.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ug.js")
        case "fobo" :: "angular-locale_af.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_af.js")
        case "fobo" :: "angular-locale_de-li.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_de-li.js")
        case "fobo" :: "angular-locale_kw.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kw.js")
        case "fobo" :: "angular-locale_so-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_so-et.js")
        case "fobo" :: "angular-locale_ti-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ti-et.js")
        case "fobo" :: "angular-locale_nyn-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nyn-ug.js")
        case "fobo" :: "angular-locale_gsw-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_gsw-ch.js")
        case "fobo" :: "angular-locale_ckb-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ckb-latn.js")
      }
    }

    lazy val angularjs141i18n3 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_nl-sx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nl-sx.js")
        case "fobo" :: "angular-locale_da.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_da.js")
        case "fobo" :: "angular-locale_sq-al.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sq-al.js")
        case "fobo" :: "angular-locale_zh-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_zh-cn.js")
        case "fobo" :: "angular-locale_en-ph.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ph.js")
        case "fobo" :: "angular-locale_ru-md.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ru-md.js")
        case "fobo" :: "angular-locale_tl.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tl.js")
        case "fobo" :: "angular-locale_ks.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ks.js")
        case "fobo" :: "angular-locale_tzm-latn-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_tzm-latn-ma.js")
        case "fobo" :: "angular-locale_zu.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zu.js")
        case "fobo" :: "angular-locale_et-ee.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_et-ee.js")
        case "fobo" :: "angular-locale_ar-ae.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-ae.js")
        case "fobo" :: "angular-locale_ha-latn-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ha-latn-ng.js")
        case "fobo" :: "angular-locale_cy-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_cy-gb.js")
        case "fobo" :: "angular-locale_en-as.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-as.js")
        case "fobo" :: "angular-locale_byn-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_byn-er.js")
        case "fobo" :: "angular-locale_sn-zw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sn-zw.js")
        case "fobo" :: "angular-locale_en-nf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-nf.js")
        case "fobo" :: "angular-locale_eo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_eo.js")
        case "fobo" :: "angular-locale_nl-bq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nl-bq.js")
        case "fobo" :: "angular-locale_ee-tg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ee-tg.js")
        case "fobo" :: "angular-locale_pa-arab-pk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_pa-arab-pk.js")
        case "fobo" :: "angular-locale_gsw-li.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_gsw-li.js")
        case "fobo" :: "angular-locale_en-io.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-io.js")
        case "fobo" :: "angular-locale_se-se.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_se-se.js")
        case "fobo" :: "angular-locale_tr-tr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_tr-tr.js")
        case "fobo" :: "angular-locale_fr-mc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-mc.js")
        case "fobo" :: "angular-locale_wae.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_wae.js")
        case "fobo" :: "angular-locale_mua-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_mua-cm.js")
        case "fobo" :: "angular-locale_ru-kg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ru-kg.js")
        case "fobo" :: "angular-locale_uz-cyrl-uz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_uz-cyrl-uz.js")
        case "fobo" :: "angular-locale_en-vc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-vc.js")
        case "fobo" :: "angular-locale_es-ph.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-ph.js")
        case "fobo" :: "angular-locale_mfe-mu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_mfe-mu.js")
        case "fobo" :: "angular-locale_tn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tn.js")
        case "fobo" :: "angular-locale_sg-cf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sg-cf.js")
        case "fobo" :: "angular-locale_swc.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_swc.js")
        case "fobo" :: "angular-locale_fa-af.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fa-af.js")
        case "fobo" :: "angular-locale_ca-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ca-fr.js")
        case "fobo" :: "angular-locale_pl.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pl.js")
        case "fobo" :: "angular-locale_en-zw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-zw.js")
        case "fobo" :: "angular-locale_ff-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ff-cm.js")
        case "fobo" :: "angular-locale_fil.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fil.js")
        case "fobo" :: "angular-locale_is-is.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_is-is.js")
        case "fobo" :: "angular-locale_es-pa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-pa.js")
        case "fobo" :: "angular-locale_sv.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv.js")
        case "fobo" :: "angular-locale_nso-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nso-za.js")
        case "fobo" :: "angular-locale_fr-yt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-yt.js")
        case "fobo" :: "angular-locale_lb-lu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_lb-lu.js")
        case "fobo" :: "angular-locale_de.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_de.js")
        case "fobo" :: "angular-locale_ln-cf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ln-cf.js")
        case "fobo" :: "angular-locale_th-th.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_th-th.js")
        case "fobo" :: "angular-locale_en-bb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-bb.js")
        case "fobo" :: "angular-locale_teo-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_teo-ke.js")
        case "fobo" :: "angular-locale_es.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es.js")
        case "fobo" :: "angular-locale_dz-bt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_dz-bt.js")
        case "fobo" :: "angular-locale_nso.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nso.js")
        case "fobo" :: "angular-locale_lo-la.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_lo-la.js")
        case "fobo" :: "angular-locale_ti-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ti-er.js")
        case "fobo" :: "angular-locale_ff-mr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ff-mr.js")
        case "fobo" :: "angular-locale_om-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_om-ke.js")
        case "fobo" :: "angular-locale_luy.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_luy.js")
        case "fobo" :: "angular-locale_naq-na.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_naq-na.js")
        case "fobo" :: "angular-locale_en-sx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-sx.js")
        case "fobo" :: "angular-locale_nl-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nl-be.js")
        case "fobo" :: "angular-locale_si-lk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_si-lk.js")
        case "fobo" :: "angular-locale_kn-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_kn-in.js")
        case "fobo" :: "angular-locale_mua.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mua.js")
        case "fobo" :: "angular-locale_kab-dz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_kab-dz.js")
        case "fobo" :: "angular-locale_lv-lv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_lv-lv.js")
        case "fobo" :: "angular-locale_en-mh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-mh.js")
        case "fobo" :: "angular-locale_en-cc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-cc.js")
        case "fobo" :: "angular-locale_jmc-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_jmc-tz.js")
        case "fobo" :: "angular-locale_dav.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dav.js")
        case "fobo" :: "angular-locale_sg.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sg.js")
        case "fobo" :: "angular-locale_eu-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_eu-es.js")
        case "fobo" :: "angular-locale_ar-eg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-eg.js")
        case "fobo" :: "angular-locale_es-sv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-sv.js")
        case "fobo" :: "angular-locale_ca-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ca-es.js")
        case "fobo" :: "angular-locale_bm.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bm.js")
        case "fobo" :: "angular-locale_ckb.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ckb.js")
        case "fobo" :: "angular-locale_es-ea.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-ea.js")
        case "fobo" :: "angular-locale_sr-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sr-latn.js")
        case "fobo" :: "angular-locale_tig.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tig.js")
        case "fobo" :: "angular-locale_fr-gf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-gf.js")
        case "fobo" :: "angular-locale_ps.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ps.js")
        case "fobo" :: "angular-locale_en-dg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-dg.js")
        case "fobo" :: "angular-locale_ar-ss.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-ss.js")
        case "fobo" :: "angular-locale_fr-mr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-mr.js")
        case "fobo" :: "angular-locale_kk-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_kk-cyrl.js")
        case "fobo" :: "angular-locale_ksb-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ksb-tz.js")
        case "fobo" :: "angular-locale_ff-sn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ff-sn.js")
        case "fobo" :: "angular-locale_hr-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_hr-ba.js")
        case "fobo" :: "angular-locale_gl-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_gl-es.js")
        case "fobo" :: "angular-locale_bo-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bo-in.js")
        case "fobo" :: "angular-locale_vai-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_vai-latn.js")
        case "fobo" :: "angular-locale_sq.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sq.js")
        case "fobo" :: "angular-locale_fr-gp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-gp.js")
        case "fobo" :: "angular-locale_ar-mr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-mr.js")
        case "fobo" :: "angular-locale_sr-cyrl-rs.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sr-cyrl-rs.js")
        case "fobo" :: "angular-locale_ve-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ve-za.js")
        case "fobo" :: "angular-locale_or-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_or-in.js")
        case "fobo" :: "angular-locale_ru.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ru.js")
        case "fobo" :: "angular-locale_en-gm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-gm.js")
        case "fobo" :: "angular-locale_sq-mk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sq-mk.js")
        case "fobo" :: "angular-locale_hi.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hi.js")
        case "fobo" :: "angular-locale_saq.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_saq.js")
        case "fobo" :: "angular-locale_en-bm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-bm.js")
        case "fobo" :: "angular-locale_mg.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mg.js")
        case "fobo" :: "angular-locale_de-lu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_de-lu.js")
        case "fobo" :: "angular-locale_es-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-es.js")
        case "fobo" :: "angular-locale_shi-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_shi-latn.js")
        case "fobo" :: "angular-locale_bs-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bs-latn.js")
        case "fobo" :: "angular-locale_sah.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sah.js")
        case "fobo" :: "angular-locale_fy.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fy.js")
        case "fobo" :: "angular-locale_ksh.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ksh.js")
        case "fobo" :: "angular-locale_bem-zm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bem-zm.js")
        case "fobo" :: "angular-locale_tr.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tr.js")
        case "fobo" :: "angular-locale_swc-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_swc-cd.js")
        case "fobo" :: "angular-locale_gv.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gv.js")
        case "fobo" :: "angular-locale_br-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_br-fr.js")
        case "fobo" :: "angular-locale_fr-bi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-bi.js")
        case "fobo" :: "angular-locale_pt-gw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_pt-gw.js")
        case "fobo" :: "angular-locale_af-na.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_af-na.js")
        case "fobo" :: "angular-locale_en-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-001.js")
        case "fobo" :: "angular-locale_sn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sn.js")
        case "fobo" :: "angular-locale_jgo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_jgo.js")
        case "fobo" :: "angular-locale_ur.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ur.js")
        case "fobo" :: "angular-locale_uz-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_uz-arab.js")
        case "fobo" :: "angular-locale_en-vi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-vi.js")
        case "fobo" :: "angular-locale_ks-arab-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ks-arab-in.js")
        case "fobo" :: "angular-locale_ee.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ee.js")
        case "fobo" :: "angular-locale_pt-br.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_pt-br.js")
        case "fobo" :: "angular-locale_eo-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_eo-001.js")
        case "fobo" :: "angular-locale_da-dk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_da-dk.js")
        case "fobo" :: "angular-locale_pt-cv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_pt-cv.js")
        case "fobo" :: "angular-locale_nb.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nb.js")
        case "fobo" :: "angular-locale_ar-sd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-sd.js")
        case "fobo" :: "angular-locale_pa.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pa.js")
        case "fobo" :: "angular-locale_fa-ir.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fa-ir.js")
        case "fobo" :: "angular-locale_nl-nl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nl-nl.js")
        case "fobo" :: "angular-locale_yo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_yo.js")
        case "fobo" :: "angular-locale_ts.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ts.js")
        case "fobo" :: "angular-locale_jmc.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_jmc.js")
        case "fobo" :: "angular-locale_en-sh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-sh.js")
        case "fobo" :: "angular-locale_rwk.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rwk.js")
        case "fobo" :: "angular-locale_teo-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_teo-ug.js")
        case "fobo" :: "angular-locale_kea-cv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_kea-cv.js")
        case "fobo" :: "angular-locale_nmg-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nmg-cm.js")
        case "fobo" :: "angular-locale_en-lr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-lr.js")
        case "fobo" :: "angular-locale_byn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_byn.js")
        case "fobo" :: "angular-locale_lg.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lg.js")
        case "fobo" :: "angular-locale_ses.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ses.js")
        case "fobo" :: "angular-locale_fr-bj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-bj.js")
        case "fobo" :: "angular-locale_fo-fo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fo-fo.js")
        case "fobo" :: "angular-locale_or.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_or.js")
        case "fobo" :: "angular-locale_nmg.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nmg.js")
        case "fobo" :: "angular-locale_mgo-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_mgo-cm.js")
        case "fobo" :: "angular-locale_ia.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ia.js")
        case "fobo" :: "angular-locale_so-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_so-ke.js")
        case "fobo" :: "angular-locale_nl.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nl.js")
        case "fobo" :: "angular-locale_en-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ke.js")
        case "fobo" :: "angular-locale_en-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-hk.js")
        case "fobo" :: "angular-locale_ka-ge.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ka-ge.js")
        case "fobo" :: "angular-locale_sr-latn-xk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sr-latn-xk.js")
        case "fobo" :: "angular-locale_zh-hans.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_zh-hans.js")
        case "fobo" :: "angular-locale_ig.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ig.js")
        case "fobo" :: "angular-locale_sv-se.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sv-se.js")
        case "fobo" :: "angular-locale_wal.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_wal.js")
        case "fobo" :: "angular-locale_qu-pe.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_qu-pe.js")
        case "fobo" :: "angular-locale_pa-guru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_pa-guru.js")
        case "fobo" :: "angular-locale_ru-ua.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ru-ua.js")
        case "fobo" :: "angular-locale_ar-sy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-sy.js")
        case "fobo" :: "angular-locale_guz-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_guz-ke.js")
        case "fobo" :: "angular-locale_bm-latn-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bm-latn-ml.js")
        case "fobo" :: "angular-locale_se-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_se-no.js")
        case "fobo" :: "angular-locale_fr-mq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-mq.js")
        case "fobo" :: "angular-locale_ky-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ky-cyrl.js")
        case "fobo" :: "angular-locale_si.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_si.js")
        case "fobo" :: "angular-locale_ro-ro.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ro-ro.js")
        case "fobo" :: "angular-locale_ja-jp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ja-jp.js")
        case "fobo" :: "angular-locale_fr-cf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-cf.js")
        case "fobo" :: "angular-locale_ja.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ja.js")
        case "fobo" :: "angular-locale_ka.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ka.js")
        case "fobo" :: "angular-locale_ko.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ko.js")
        case "fobo" :: "angular-locale_fr-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-cm.js")
        case "fobo" :: "angular-locale_chr.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_chr.js")
        case "fobo" :: "angular-locale_bs-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bs-cyrl.js")
        case "fobo" :: "angular-locale_en-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ng.js")
        case "fobo" :: "angular-locale_eu.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_eu.js")
        case "fobo" :: "angular-locale_ee-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ee-gh.js")
        case "fobo" :: "angular-locale_az-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_az-latn.js")
        case "fobo" :: "angular-locale_rm-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_rm-ch.js")
        case "fobo" :: "angular-locale_en-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-in.js")
        case "fobo" :: "angular-locale_sr-cyrl-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sr-cyrl-ba.js")
        case "fobo" :: "angular-locale_as-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_as-in.js")
        case "fobo" :: "angular-locale_en-nz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-nz.js")
        case "fobo" :: "angular-locale_om-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_om-et.js")
        case "fobo" :: "angular-locale_as.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_as.js")
        case "fobo" :: "angular-locale_ky-cyrl-kg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ky-cyrl-kg.js")
        case "fobo" :: "angular-locale_ckb-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ckb-iq.js")
      }
    }

    lazy val angularjs141i18n4 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_de-at.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_de-at.js")
        case "fobo" :: "angular-locale_ebu-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ebu-ke.js")
        case "fobo" :: "angular-locale_twq-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_twq-ne.js")
        case "fobo" :: "angular-locale_hsb.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hsb.js")
        case "fobo" :: "angular-locale_sv-ax.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sv-ax.js")
        case "fobo" :: "angular-locale_kde-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_kde-tz.js")
        case "fobo" :: "angular-locale_ebu.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ebu.js")
        case "fobo" :: "angular-locale_en-gg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-gg.js")
        case "fobo" :: "angular-locale_cs.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_cs.js")
        case "fobo" :: "angular-locale_vi.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vi.js")
        case "fobo" :: "angular-locale_seh.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_seh.js")
        case "fobo" :: "angular-locale_kk.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kk.js")
        case "fobo" :: "angular-locale_en-bs.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-bs.js")
        case "fobo" :: "angular-locale_en-fk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-fk.js")
        case "fobo" :: "angular-locale_fr-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-fr.js")
        case "fobo" :: "angular-locale_shi-tfng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_shi-tfng.js")
        case "fobo" :: "angular-locale_vo-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_vo-001.js")
        case "fobo" :: "angular-locale_pt-pt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_pt-pt.js")
        case "fobo" :: "angular-locale_ast.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ast.js")
        case "fobo" :: "angular-locale_vi-vn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_vi-vn.js")
        case "fobo" :: "angular-locale_fo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fo.js")
        case "fobo" :: "angular-locale_ar-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-er.js")
        case "fobo" :: "angular-locale_ar-kw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-kw.js")
        case "fobo" :: "angular-locale_es-uy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-uy.js")
        case "fobo" :: "angular-locale_rw-rw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_rw-rw.js")
        case "fobo" :: "angular-locale_ar-so.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-so.js")
        case "fobo" :: "angular-locale_en-vu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-vu.js")
        case "fobo" :: "angular-locale_ksf.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ksf.js")
        case "fobo" :: "angular-locale_ar-eh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-eh.js")
        case "fobo" :: "angular-locale_fr-mu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-mu.js")
        case "fobo" :: "angular-locale_bg.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bg.js")
        case "fobo" :: "angular-locale_en-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-gh.js")
        case "fobo" :: "angular-locale_ru-by.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ru-by.js")
        case "fobo" :: "angular-locale_ig-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ig-ng.js")
        case "fobo" :: "angular-locale_to.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_to.js")
        case "fobo" :: "angular-locale_nus-sd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nus-sd.js")
        case "fobo" :: "angular-locale_kl-gl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_kl-gl.js")
        case "fobo" :: "angular-locale_ms-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ms-latn.js")
        case "fobo" :: "angular-locale_nl-aw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nl-aw.js")
        case "fobo" :: "angular-locale_en-na.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-na.js")
        case "fobo" :: "angular-locale_kkj-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_kkj-cm.js")
        case "fobo" :: "angular-locale_af-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_af-za.js")
        case "fobo" :: "angular-locale_kok-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_kok-in.js")
        case "fobo" :: "angular-locale_so-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_so-dj.js")
        case "fobo" :: "angular-locale_fur.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fur.js")
        case "fobo" :: "angular-locale_sbp.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sbp.js")
        case "fobo" :: "angular-locale_en-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-tz.js")
        case "fobo" :: "angular-locale_en-ss.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ss.js")
        case "fobo" :: "angular-locale_lt-lt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_lt-lt.js")
        case "fobo" :: "angular-locale_en-cx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-cx.js")
        case "fobo" :: "angular-locale_zh-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_zh-hk.js")
        case "fobo" :: "angular-locale_fi-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fi-fi.js")
        case "fobo" :: "angular-locale_mer.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mer.js")
        case "fobo" :: "angular-locale_tig-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_tig-er.js")
        case "fobo" :: "angular-locale_mas-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_mas-tz.js")
        case "fobo" :: "angular-locale_en-dm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-dm.js")
        case "fobo" :: "angular-locale_en-kn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-kn.js")
        case "fobo" :: "angular-locale_ko-kp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ko-kp.js")
        case "fobo" :: "angular-locale_en-iso.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-iso.js")
        case "fobo" :: "angular-locale_sbp-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_sbp-tz.js")
        case "fobo" :: "angular-locale_ha.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ha.js")
        case "fobo" :: "angular-locale_kk-cyrl-kz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_kk-cyrl-kz.js")
        case "fobo" :: "angular-locale_tg-cyrl-tj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_tg-cyrl-tj.js")
        case "fobo" :: "angular-locale_ga-ie.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ga-ie.js")
        case "fobo" :: "angular-locale_kln-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_kln-ke.js")
        case "fobo" :: "angular-locale_ar-om.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-om.js")
        case "fobo" :: "angular-locale_bas.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bas.js")
        case "fobo" :: "angular-locale_bas-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bas-cm.js")
        case "fobo" :: "angular-locale_zh-hant-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_zh-hant-mo.js")
        case "fobo" :: "angular-locale_ln-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ln-cd.js")
        case "fobo" :: "angular-locale_en-lc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-lc.js")
        case "fobo" :: "angular-locale_en-sz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-sz.js")
        case "fobo" :: "angular-locale_hsb-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_hsb-de.js")
        case "fobo" :: "angular-locale_ii-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ii-cn.js")
        case "fobo" :: "angular-locale_en-tk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-tk.js")
        case "fobo" :: "angular-locale_fr-ci.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-ci.js")
        case "fobo" :: "angular-locale_ms.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ms.js")
        case "fobo" :: "angular-locale_kde.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kde.js")
        case "fobo" :: "angular-locale_ar-td.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-td.js")
        case "fobo" :: "angular-locale_ca-es-valencia.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ca-es-valencia.js")
        case "fobo" :: "angular-locale_vai-vaii.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_vai-vaii.js")
        case "fobo" :: "angular-locale_fr-mf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-mf.js")
        case "fobo" :: "angular-locale_en-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-er.js")
        case "fobo" :: "angular-locale_fur-it.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fur-it.js")
        case "fobo" :: "angular-locale_mn-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_mn-cyrl.js")
        case "fobo" :: "angular-locale_ar-ps.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-ps.js")
        case "fobo" :: "angular-locale_lag-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_lag-tz.js")
        case "fobo" :: "angular-locale_xog.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_xog.js")
        case "fobo" :: "angular-locale_khq-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_khq-ml.js")
        case "fobo" :: "angular-locale_ar-bh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-bh.js")
        case "fobo" :: "angular-locale_yav.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_yav.js")
        case "fobo" :: "angular-locale_be.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_be.js")
        case "fobo" :: "angular-locale_en-je.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-je.js")
        case "fobo" :: "angular-locale_rn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rn.js")
        case "fobo" :: "angular-locale_en-ck.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ck.js")
        case "fobo" :: "angular-locale_en-tt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-tt.js")
        case "fobo" :: "angular-locale_dyo.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dyo.js")
        case "fobo" :: "angular-locale_da-gl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_da-gl.js")
        case "fobo" :: "angular-locale_nnh-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_nnh-cm.js")
        case "fobo" :: "angular-locale_ml.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ml.js")
        case "fobo" :: "angular-locale_ru-ru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ru-ru.js")
        case "fobo" :: "angular-locale_bm-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_bm-latn.js")
        case "fobo" :: "angular-locale_twq.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_twq.js")
        case "fobo" :: "angular-locale_kam.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kam.js")
        case "fobo" :: "angular-locale_dua.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dua.js")
        case "fobo" :: "angular-locale_uz-latn-uz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_uz-latn-uz.js")
        case "fobo" :: "angular-locale_es-419.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-419.js")
        case "fobo" :: "angular-locale_en-sc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-sc.js")
        case "fobo" :: "angular-locale_ar-il.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-il.js")
        case "fobo" :: "angular-locale_nus.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nus.js")
        case "fobo" :: "angular-locale_in.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_in.js")
        case "fobo" :: "angular-locale_ml-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ml-in.js")
        case "fobo" :: "angular-locale_fr-nc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-nc.js")
        case "fobo" :: "angular-locale_en-fj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-fj.js")
        case "fobo" :: "angular-locale_en-ky.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-ky.js")
        case "fobo" :: "angular-locale_fr-bf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-bf.js")
        case "fobo" :: "angular-locale_dav-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_dav-ke.js")
        case "fobo" :: "angular-locale_uz-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_uz-cyrl.js")
        case "fobo" :: "angular-locale_ar-qa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ar-qa.js")
        case "fobo" :: "angular-locale_en.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en.js")
        case "fobo" :: "angular-locale_km-kh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_km-kh.js")
        case "fobo" :: "angular-locale_aa.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_aa.js")
        case "fobo" :: "angular-locale_fil-ph.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fil-ph.js")
        case "fobo" :: "angular-locale_mn.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mn.js")
        case "fobo" :: "angular-locale_nnh.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nnh.js")
        case "fobo" :: "angular-locale_ca-it.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ca-it.js")
        case "fobo" :: "angular-locale_tn-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_tn-za.js")
        case "fobo" :: "angular-locale_en-mw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-mw.js")
        case "fobo" :: "angular-locale_vun.js" :: Nil =>
          List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vun.js")
        case "fobo" :: "angular-locale_kam-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_kam-ke.js")
        case "fobo" :: "angular-locale_en-vg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_en-vg.js")
        case "fobo" :: "angular-locale_ak-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ak-gh.js")
        case "fobo" :: "angular-locale_fr-ga.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-ga.js")
        case "fobo" :: "angular-locale_es-py.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-py.js")
        case "fobo" :: "angular-locale_dje-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_dje-ne.js")
        case "fobo" :: "angular-locale_fr-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_fr-ne.js")
        case "fobo" :: "angular-locale_mg-mg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_mg-mg.js")
        case "fobo" :: "angular-locale_gsw-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_gsw-fr.js")
        case "fobo" :: "angular-locale_ia-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_ia-fr.js")
        case "fobo" :: "angular-locale_es-bo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.4.1",
               "i18n",
               "angular-locale_es-bo.js")
      }
    }

    lazy val angularjs1315 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.3.15", "js", "angular.js")
        case "fobo" :: "angular.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")
        case "fobo" :: "angular.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "js", "angular.min.js.map")

        case "fobo" :: "angular-animate.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-animate.js")
        case "fobo" :: "angular-animate.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-animate.min.js")
        case "fobo" :: "angular-animate.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "js",
               "angular-animate.min.js.map")

        case "fobo" :: "angular-aria.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-aria.js")
        case "fobo" :: "angular-aria.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-aria.min.js")
        case "fobo" :: "angular-aria.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-aria.min.js.map")

        case "fobo" :: "angular-cookies.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-cookies.js")
        case "fobo" :: "angular-cookies.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-cookies.min.js")
        case "fobo" :: "angular-cookies.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "js",
               "angular-cookies.min.js.map")

        case "fobo" :: "angular-loader.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-loader.js")
        case "fobo" :: "angular-loader.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-loader.min.js")
        case "fobo" :: "angular-loader.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "js",
               "angular.min-loader.js.map")

        case "fobo" :: "angular-messages.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-messages.js")
        case "fobo" :: "angular-messages.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-messages.min.js")
        case "fobo" :: "angular-messages.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "js",
               "angular.min-messages.js.map")

        //dev/test only
        case "fobo" :: "angular-mocks.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-mocks.js")

        case "fobo" :: "angular-resource.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-resource.js")
        case "fobo" :: "angular-resource.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-resource.min.js")
        case "fobo" :: "angular-resource.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "js",
               "angular-resource.min.js.map")

        case "fobo" :: "angular-route.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-route.js")
        case "fobo" :: "angular-route.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-route.min.js")
        case "fobo" :: "angular-route.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "js",
               "angular-route.min.js.map")

        case "fobo" :: "angular-sanitize.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-sanitize.js")
        case "fobo" :: "angular-sanitize.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-sanitize.min.js")
        case "fobo" :: "angular-sanitize.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "js",
               "angular-sanitize.min.js.map")
        //dev/test only 
        case "fobo" :: "angular-scenario.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-scenario.js")

        case "fobo" :: "angular-touch.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-touch.js")
        case "fobo" :: "angular-touch.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "js", "angular-touch.min.js")
        case "fobo" :: "angular-touch.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "js",
               "angular-touch.min.js.map")

        //CSS files
        case "fobo" :: "angular-csp.css" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.3.15", "css", "angular-csp.css")
        case "fobo" :: "angular-csp.css" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "css", "angular-csp.min.css")

      }
    }

    lazy val angularjs1315i18n = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_nl-cw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nl-cw.js")
        case "fobo" :: "angular-locale_se-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_se-fi.js")
        case "fobo" :: "angular-locale_en-bz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-bz.js")
        case "fobo" :: "angular-locale_os-ru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_os-ru.js")
        case "fobo" :: "angular-locale_lkt-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_lkt-us.js")
        case "fobo" :: "angular-locale_en-pk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-pk.js")
        case "fobo" :: "angular-locale_he.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_he.js")
        case "fobo" :: "angular-locale_sr-latn-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sr-latn-ba.js")
        case "fobo" :: "angular-locale_teo.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_teo.js")
        case "fobo" :: "angular-locale_hy.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hy.js")
        case "fobo" :: "angular-locale_ms-latn-bn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ms-latn-bn.js")
        case "fobo" :: "angular-locale_az.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_az.js")
        case "fobo" :: "angular-locale_nd.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nd.js")
        case "fobo" :: "angular-locale_fr-rw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-rw.js")
        case "fobo" :: "angular-locale_so-so.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_so-so.js")
        case "fobo" :: "angular-locale_ckb-latn-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ckb-latn-iq.js")
        case "fobo" :: "angular-locale_de-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_de-ch.js")
        case "fobo" :: "angular-locale_ar-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-iq.js")
        case "fobo" :: "angular-locale_yav-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_yav-cm.js")
        case "fobo" :: "angular-locale_tg-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_tg-cyrl.js")
        case "fobo" :: "angular-locale_os-ge.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_os-ge.js")
        case "fobo" :: "angular-locale_hu.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hu.js")
        case "fobo" :: "angular-locale_pt-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_pt-mo.js")
        case "fobo" :: "angular-locale_ha-latn-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ha-latn-gh.js")
        case "fobo" :: "angular-locale_fr-cg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-cg.js")
        case "fobo" :: "angular-locale_mfe.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mfe.js")
        case "fobo" :: "angular-locale_en-ca.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ca.js")
        case "fobo" :: "angular-locale_st-ls.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_st-ls.js")
        case "fobo" :: "angular-locale_kw-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_kw-gb.js")
        case "fobo" :: "angular-locale_ss.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ss.js")
        case "fobo" :: "angular-locale_zgh.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zgh.js")
        case "fobo" :: "angular-locale_fr-dz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-dz.js")
        case "fobo" :: "angular-locale_fr-bl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-bl.js")
        case "fobo" :: "angular-locale_fa.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fa.js")
        case "fobo" :: "angular-locale_mk.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mk.js")
        case "fobo" :: "angular-locale_mr-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_mr-in.js")
        case "fobo" :: "angular-locale_sv-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sv-fi.js")
        case "fobo" :: "angular-locale_it.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_it.js")
        case "fobo" :: "angular-locale_en-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-cm.js")
        case "fobo" :: "angular-locale_no-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_no-no.js")
        case "fobo" :: "angular-locale_ckb-ir.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ckb-ir.js")
        case "fobo" :: "angular-locale_en-to.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-to.js")
        case "fobo" :: "angular-locale_fr-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-cd.js")
        case "fobo" :: "angular-locale_fr-sn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-sn.js")
        case "fobo" :: "angular-locale_cgg.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_cgg.js")
        case "fobo" :: "angular-locale_ky.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ky.js")
        case "fobo" :: "angular-locale_chr-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_chr-us.js")
        case "fobo" :: "angular-locale_naq.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_naq.js")
        case "fobo" :: "angular-locale_ar.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar.js")
        case "fobo" :: "angular-locale_fr-pm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-pm.js")
        case "fobo" :: "angular-locale_qu-bo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_qu-bo.js")
        case "fobo" :: "angular-locale_gv-im.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_gv-im.js")
        case "fobo" :: "angular-locale_is.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_is.js")
        case "fobo" :: "angular-locale_bg-bg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bg-bg.js")
        case "fobo" :: "angular-locale_fi.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fi.js")
        case "fobo" :: "angular-locale_bn-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bn-in.js")
        case "fobo" :: "angular-locale_agq.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_agq.js")
        case "fobo" :: "angular-locale_khq.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_khq.js")
        case "fobo" :: "angular-locale_bs-latn-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bs-latn-ba.js")
        case "fobo" :: "angular-locale_en-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-sg.js")
        case "fobo" :: "angular-locale_zh-hant-tw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_zh-hant-tw.js")
        case "fobo" :: "angular-locale_fr-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-ch.js")
        case "fobo" :: "angular-locale_zgh-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_zgh-ma.js")
        case "fobo" :: "angular-locale_ms-latn-my.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ms-latn-my.js")
        case "fobo" :: "angular-locale_fr-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-ma.js")
        case "fobo" :: "angular-locale_en-fm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-fm.js")
        case "fobo" :: "angular-locale_mgh.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mgh.js")
        case "fobo" :: "angular-locale_jgo-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_jgo-cm.js")
        case "fobo" :: "angular-locale_en-zm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-zm.js")
        case "fobo" :: "angular-locale_zh-tw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_zh-tw.js")
        case "fobo" :: "angular-locale_ki-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ki-ke.js")
        case "fobo" :: "angular-locale_vai.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vai.js")
        case "fobo" :: "angular-locale_fr-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-ml.js")
        case "fobo" :: "angular-locale_lu.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lu.js")
        case "fobo" :: "angular-locale_en-gu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-gu.js")
        case "fobo" :: "angular-locale_sw-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sw-ke.js")
        case "fobo" :: "angular-locale_asa.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_asa.js")
        case "fobo" :: "angular-locale_pt.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pt.js")
        case "fobo" :: "angular-locale_nd-zw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nd-zw.js")
        case "fobo" :: "angular-locale_uz.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_uz.js")
        case "fobo" :: "angular-locale_shi.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_shi.js")
        case "fobo" :: "angular-locale_sk.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sk.js")
        case "fobo" :: "angular-locale_gu.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gu.js")
        case "fobo" :: "angular-locale_pa-guru-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_pa-guru-in.js")
        case "fobo" :: "angular-locale_lb.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lb.js")
        case "fobo" :: "angular-locale_ps-af.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ps-af.js")
        case "fobo" :: "angular-locale_ar-dz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-dz.js")
        case "fobo" :: "angular-locale_ru-kz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ru-kz.js")
        case "fobo" :: "angular-locale_en-sl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-sl.js")
        case "fobo" :: "angular-locale_zh-hant-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_zh-hant-hk.js")
        case "fobo" :: "angular-locale_ts-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ts-za.js")
        case "fobo" :: "angular-locale_sah-ru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sah-ru.js")
        case "fobo" :: "angular-locale_rwk-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_rwk-tz.js")
        case "fobo" :: "angular-locale_dyo-sn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_dyo-sn.js")
        case "fobo" :: "angular-locale_et.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_et.js")
        case "fobo" :: "angular-locale_ss-sz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ss-sz.js")
        case "fobo" :: "angular-locale_nn.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nn.js")
        case "fobo" :: "angular-locale_bem.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bem.js")
        case "fobo" :: "angular-locale_ssy-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ssy-er.js")
        case "fobo" :: "angular-locale_en-nu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-nu.js")
        case "fobo" :: "angular-locale_mt.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mt.js")
        case "fobo" :: "angular-locale_pt-mz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_pt-mz.js")
        case "fobo" :: "angular-locale_nyn.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nyn.js")
        case "fobo" :: "angular-locale_ksh-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ksh-de.js")
        case "fobo" :: "angular-locale_bez-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bez-tz.js")
        case "fobo" :: "angular-locale_es-gq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-gq.js")
        case "fobo" :: "angular-locale_ii.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ii.js")
        case "fobo" :: "angular-locale_es-ve.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-ve.js")
        case "fobo" :: "angular-locale_ta-my.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ta-my.js")
        case "fobo" :: "angular-locale_bs.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bs.js")
        case "fobo" :: "angular-locale_zh-hant.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_zh-hant.js")
        case "fobo" :: "angular-locale_bs-cyrl-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bs-cyrl-ba.js")
        case "fobo" :: "angular-locale_el-gr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_el-gr.js")
        case "fobo" :: "angular-locale_it-it.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_it-it.js")
        case "fobo" :: "angular-locale_mgh-mz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_mgh-mz.js")
        case "fobo" :: "angular-locale_es-do.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-do.js")
        case "fobo" :: "angular-locale_ff.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ff.js")
        case "fobo" :: "angular-locale_wal-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_wal-et.js")
        case "fobo" :: "angular-locale_hi-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_hi-in.js")
        case "fobo" :: "angular-locale_cs-cz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_cs-cz.js")
        case "fobo" :: "angular-locale_ssy.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ssy.js")
        case "fobo" :: "angular-locale_hr-hr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_hr-hr.js")
        case "fobo" :: "angular-locale_yo-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_yo-ng.js")
        case "fobo" :: "angular-locale_en-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-za.js")
        case "fobo" :: "angular-locale_ln-ao.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ln-ao.js")
        case "fobo" :: "angular-locale_ms-latn-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ms-latn-sg.js")
        case "fobo" :: "angular-locale_el-cy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_el-cy.js")
        case "fobo" :: "angular-locale_ur-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ur-in.js")
        case "fobo" :: "angular-locale_bn.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bn.js")
        case "fobo" :: "angular-locale_zu-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_zu-za.js")
        case "fobo" :: "angular-locale_ca.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ca.js")
        case "fobo" :: "angular-locale_sw.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sw.js")
        case "fobo" :: "angular-locale_tzm-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_tzm-latn.js")
        case "fobo" :: "angular-locale_fr-tn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-tn.js")
        case "fobo" :: "angular-locale_en-ai.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ai.js")
        case "fobo" :: "angular-locale_yi-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_yi-001.js")
        case "fobo" :: "angular-locale_en-ie.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ie.js")
        case "fobo" :: "angular-locale_es-hn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-hn.js")
        case "fobo" :: "angular-locale_es-cr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-cr.js")
        case "fobo" :: "angular-locale_ar-jo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-jo.js")
        case "fobo" :: "angular-locale_xh-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_xh-za.js")
        case "fobo" :: "angular-locale_sr.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sr.js")
        case "fobo" :: "angular-locale_fr-lu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-lu.js")
        case "fobo" :: "angular-locale_en-um.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-um.js")
        case "fobo" :: "angular-locale_es-cu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-cu.js")
        case "fobo" :: "angular-locale_qu-ec.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_qu-ec.js")
        case "fobo" :: "angular-locale_ro-md.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ro-md.js")
        case "fobo" :: "angular-locale_to-to.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_to-to.js")
        case "fobo" :: "angular-locale_zh-hans-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_zh-hans-hk.js")
        case "fobo" :: "angular-locale_fr-mg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-mg.js")
        case "fobo" :: "angular-locale_haw.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_haw.js")
        case "fobo" :: "angular-locale_ro.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ro.js")
        case "fobo" :: "angular-locale_es-ar.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-ar.js")
        case "fobo" :: "angular-locale_fr.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr.js")
        case "fobo" :: "angular-locale_it-sm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_it-sm.js")
        case "fobo" :: "angular-locale_uk-ua.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_uk-ua.js")
        case "fobo" :: "angular-locale_aa-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_aa-er.js")
        case "fobo" :: "angular-locale_ha-latn-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ha-latn-ne.js")
        case "fobo" :: "angular-locale_pt-st.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_pt-st.js")
        case "fobo" :: "angular-locale_en-ki.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ki.js")
        case "fobo" :: "angular-locale_rof.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rof.js")
        case "fobo" :: "angular-locale_kn.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kn.js")
        case "fobo" :: "angular-locale_sr-latn-me.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sr-latn-me.js")
        case "fobo" :: "angular-locale_kok.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kok.js")
        case "fobo" :: "angular-locale_en-pr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-pr.js")
        case "fobo" :: "angular-locale_ne-np.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ne-np.js")
        case "fobo" :: "angular-locale_lu-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_lu-cd.js")
        case "fobo" :: "angular-locale_sl.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sl.js")
        case "fobo" :: "angular-locale_ckb-arab-ir.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ckb-arab-ir.js")
        case "fobo" :: "angular-locale_ug-arab-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ug-arab-cn.js")
        case "fobo" :: "angular-locale_mn-cyrl-mn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_mn-cyrl-mn.js")
        case "fobo" :: "angular-locale_fr-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-dj.js")
        case "fobo" :: "angular-locale_ks-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ks-arab.js")
        case "fobo" :: "angular-locale_luo.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_luo.js")
        case "fobo" :: "angular-locale_xh.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_xh.js")
        case "fobo" :: "angular-locale_luo-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_luo-ke.js")
        case "fobo" :: "angular-locale_it-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_it-ch.js")
        case "fobo" :: "angular-locale_mas.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mas.js")
        case "fobo" :: "angular-locale_ksf-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ksf-cm.js")
        case "fobo" :: "angular-locale_sq-xk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sq-xk.js")
        case "fobo" :: "angular-locale_en-gd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-gd.js")
        case "fobo" :: "angular-locale_kea.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kea.js")
        case "fobo" :: "angular-locale_ve.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ve.js")
        case "fobo" :: "angular-locale_rof-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_rof-tz.js")
        case "fobo" :: "angular-locale_en-sb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-sb.js")
        case "fobo" :: "angular-locale_ne.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ne.js")
        case "fobo" :: "angular-locale_fr-km.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-km.js")
        case "fobo" :: "angular-locale_my.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_my.js")
        case "fobo" :: "angular-locale_sr-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sr-cyrl.js")
        case "fobo" :: "angular-locale_cy.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_cy.js")
        case "fobo" :: "angular-locale_gu-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_gu-in.js")
        case "fobo" :: "angular-locale_es-mx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-mx.js")
        case "fobo" :: "angular-locale_bn-bd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bn-bd.js")
        case "fobo" :: "angular-locale_am-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_am-et.js")
      }
    }

    lazy val angularjs1315i18n2 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_mk-mk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_mk-mk.js")
        case "fobo" :: "angular-locale_lag.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lag.js")
        case "fobo" :: "angular-locale_en-ms.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ms.js")
        case "fobo" :: "angular-locale_brx-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_brx-in.js")
        case "fobo" :: "angular-locale_sr-latn-rs.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sr-latn-rs.js")
        case "fobo" :: "angular-locale_sl-si.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sl-si.js")
        case "fobo" :: "angular-locale_mgo.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mgo.js")
        case "fobo" :: "angular-locale_ha-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ha-latn.js")
        case "fobo" :: "angular-locale_tg.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tg.js")
        case "fobo" :: "angular-locale_am.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_am.js")
        case "fobo" :: "angular-locale_bo-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bo-cn.js")
        case "fobo" :: "angular-locale_en-mt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-mt.js")
        case "fobo" :: "angular-locale_dua-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_dua-cm.js")
        case "fobo" :: "angular-locale_sr-cyrl-xk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sr-cyrl-xk.js")
        case "fobo" :: "angular-locale_ar-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-ma.js")
        case "fobo" :: "angular-locale_en-pn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-pn.js")
        case "fobo" :: "angular-locale_te.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_te.js")
        case "fobo" :: "angular-locale_ast-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ast-es.js")
        case "fobo" :: "angular-locale_pa-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_pa-arab.js")
        case "fobo" :: "angular-locale_zh.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zh.js")
        case "fobo" :: "angular-locale_es-pr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-pr.js")
        case "fobo" :: "angular-locale_nb-sj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nb-sj.js")
        case "fobo" :: "angular-locale_ar-ye.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-ye.js")
        case "fobo" :: "angular-locale_fr-pf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-pf.js")
        case "fobo" :: "angular-locale_saq-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_saq-ke.js")
        case "fobo" :: "angular-locale_de-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_de-be.js")
        case "fobo" :: "angular-locale_fr-wf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-wf.js")
        case "fobo" :: "angular-locale_gd.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gd.js")
        case "fobo" :: "angular-locale_no.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_no.js")
        case "fobo" :: "angular-locale_el.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_el.js")
        case "fobo" :: "angular-locale_ca-ad.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ca-ad.js")
        case "fobo" :: "angular-locale_km.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_km.js")
        case "fobo" :: "angular-locale_en-tc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-tc.js")
        case "fobo" :: "angular-locale_es-ni.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-ni.js")
        case "fobo" :: "angular-locale_so.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_so.js")
        case "fobo" :: "angular-locale_kkj.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kkj.js")
        case "fobo" :: "angular-locale_tr-cy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_tr-cy.js")
        case "fobo" :: "angular-locale_en-150.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-150.js")
        case "fobo" :: "angular-locale_kln.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kln.js")
        case "fobo" :: "angular-locale_qu.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_qu.js")
        case "fobo" :: "angular-locale_lo.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lo.js")
        case "fobo" :: "angular-locale_os.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_os.js")
        case "fobo" :: "angular-locale_zh-hans-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_zh-hans-mo.js")
        case "fobo" :: "angular-locale_ses-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ses-ml.js")
        case "fobo" :: "angular-locale_fr-sy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-sy.js")
        case "fobo" :: "angular-locale_fr-td.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-td.js")
        case "fobo" :: "angular-locale_mt-mt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_mt-mt.js")
        case "fobo" :: "angular-locale_en-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-us.js")
        case "fobo" :: "angular-locale_zh-hans-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_zh-hans-sg.js")
        case "fobo" :: "angular-locale_az-latn-az.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_az-latn-az.js")
        case "fobo" :: "angular-locale_uz-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_uz-latn.js")
        case "fobo" :: "angular-locale_dsb.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dsb.js")
        case "fobo" :: "angular-locale_bez.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bez.js")
        case "fobo" :: "angular-locale_fr-vu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-vu.js")
        case "fobo" :: "angular-locale_fr-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-be.js")
        case "fobo" :: "angular-locale_hr.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hr.js")
        case "fobo" :: "angular-locale_agq-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_agq-cm.js")
        case "fobo" :: "angular-locale_smn.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_smn.js")
        case "fobo" :: "angular-locale_kl.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kl.js")
        case "fobo" :: "angular-locale_ak.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ak.js")
        case "fobo" :: "angular-locale_nr.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nr.js")
        case "fobo" :: "angular-locale_en-sd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-sd.js")
        case "fobo" :: "angular-locale_fr-ht.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-ht.js")
        case "fobo" :: "angular-locale_fr-gn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-gn.js")
        case "fobo" :: "angular-locale_st-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_st-za.js")
        case "fobo" :: "angular-locale_es-ec.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-ec.js")
        case "fobo" :: "angular-locale_mas-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_mas-ke.js")
        case "fobo" :: "angular-locale_seh-mz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_seh-mz.js")
        case "fobo" :: "angular-locale_ta-lk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ta-lk.js")
        case "fobo" :: "angular-locale_bo.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bo.js")
        case "fobo" :: "angular-locale_ewo.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ewo.js")
        case "fobo" :: "angular-locale_en-nr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-nr.js")
        case "fobo" :: "angular-locale_en-au.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-au.js")
        case "fobo" :: "angular-locale_shi-tfng-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_shi-tfng-ma.js")
        case "fobo" :: "angular-locale_guz.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_guz.js")
        case "fobo" :: "angular-locale_id-id.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_id-id.js")
        case "fobo" :: "angular-locale_en-ws.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ws.js")
        case "fobo" :: "angular-locale_tn-bw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_tn-bw.js")
        case "fobo" :: "angular-locale_sw-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sw-tz.js")
        case "fobo" :: "angular-locale_kab.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kab.js")
        case "fobo" :: "angular-locale_az-cyrl-az.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_az-cyrl-az.js")
        case "fobo" :: "angular-locale_de-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_de-de.js")
        case "fobo" :: "angular-locale_en-pg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-pg.js")
        case "fobo" :: "angular-locale_sr-cyrl-me.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sr-cyrl-me.js")
        case "fobo" :: "angular-locale_ar-km.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-km.js")
        case "fobo" :: "angular-locale_ar-lb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-lb.js")
        case "fobo" :: "angular-locale_wae-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_wae-ch.js")
        case "fobo" :: "angular-locale_luy-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_luy-ke.js")
        case "fobo" :: "angular-locale_be-by.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_be-by.js")
        case "fobo" :: "angular-locale_ar-tn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-tn.js")
        case "fobo" :: "angular-locale_en-gi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-gi.js")
        case "fobo" :: "angular-locale_te-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_te-in.js")
        case "fobo" :: "angular-locale_en-my.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-my.js")
        case "fobo" :: "angular-locale_en-ag.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ag.js")
        case "fobo" :: "angular-locale_ta-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ta-in.js")
        case "fobo" :: "angular-locale_es-cl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-cl.js")
        case "fobo" :: "angular-locale_shi-latn-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_shi-latn-ma.js")
        case "fobo" :: "angular-locale_hu-hu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_hu-hu.js")
        case "fobo" :: "angular-locale_ln-cg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ln-cg.js")
        case "fobo" :: "angular-locale_tzm.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tzm.js")
        case "fobo" :: "angular-locale_aa-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_aa-et.js")
        case "fobo" :: "angular-locale_ff-gn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ff-gn.js")
        case "fobo" :: "angular-locale_fr-ca.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-ca.js")
        case "fobo" :: "angular-locale_he-il.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_he-il.js")
        case "fobo" :: "angular-locale_vo.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vo.js")
        case "fobo" :: "angular-locale_es-gt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-gt.js")
        case "fobo" :: "angular-locale_rw.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rw.js")
        case "fobo" :: "angular-locale_uz-arab-af.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_uz-arab-af.js")
        case "fobo" :: "angular-locale_id.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_id.js")
        case "fobo" :: "angular-locale_en-gy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-gy.js")
        case "fobo" :: "angular-locale_ko-kr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ko-kr.js")
        case "fobo" :: "angular-locale_smn-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_smn-fi.js")
        case "fobo" :: "angular-locale_lkt.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lkt.js")
        case "fobo" :: "angular-locale_hy-am.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_hy-am.js")
        case "fobo" :: "angular-locale_ksb.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ksb.js")
        case "fobo" :: "angular-locale_pt-tl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_pt-tl.js")
        case "fobo" :: "angular-locale_ar-ly.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-ly.js")
        case "fobo" :: "angular-locale_ur-pk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ur-pk.js")
        case "fobo" :: "angular-locale_dsb-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_dsb-de.js")
        case "fobo" :: "angular-locale_en-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-mo.js")
        case "fobo" :: "angular-locale_nl-sr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nl-sr.js")
        case "fobo" :: "angular-locale_fy-nl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fy-nl.js")
        case "fobo" :: "angular-locale_yo-bj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_yo-bj.js")
        case "fobo" :: "angular-locale_xog-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_xog-ug.js")
        case "fobo" :: "angular-locale_ar-sa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-sa.js")
        case "fobo" :: "angular-locale_dje.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dje.js")
        case "fobo" :: "angular-locale_fr-sc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-sc.js")
        case "fobo" :: "angular-locale_en-mp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-mp.js")
        case "fobo" :: "angular-locale_es-pe.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-pe.js")
        case "fobo" :: "angular-locale_fr-re.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-re.js")
        case "fobo" :: "angular-locale_uk.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_uk.js")
        case "fobo" :: "angular-locale_en-rw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-rw.js")
        case "fobo" :: "angular-locale_pt-ao.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_pt-ao.js")
        case "fobo" :: "angular-locale_zh-hans-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_zh-hans-cn.js")
        case "fobo" :: "angular-locale_yi.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_yi.js")
        case "fobo" :: "angular-locale_ug-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ug-arab.js")
        case "fobo" :: "angular-locale_my-mm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_my-mm.js")
        case "fobo" :: "angular-locale_lt.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lt.js")
        case "fobo" :: "angular-locale_ta.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ta.js")
        case "fobo" :: "angular-locale_ki.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ki.js")
        case "fobo" :: "angular-locale_iw.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_iw.js")
        case "fobo" :: "angular-locale_fr-gq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-gq.js")
        case "fobo" :: "angular-locale_om.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_om.js")
        case "fobo" :: "angular-locale_ne-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ne-in.js")
        case "fobo" :: "angular-locale_rn-bi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_rn-bi.js")
        case "fobo" :: "angular-locale_ckb-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ckb-arab.js")
        case "fobo" :: "angular-locale_nn-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nn-no.js")
        case "fobo" :: "angular-locale_en-mg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-mg.js")
        case "fobo" :: "angular-locale_ga.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ga.js")
        case "fobo" :: "angular-locale_es-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-us.js")
        case "fobo" :: "angular-locale_en-tv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-tv.js")
        case "fobo" :: "angular-locale_mer-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_mer-ke.js")
        case "fobo" :: "angular-locale_ss-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ss-za.js")
        case "fobo" :: "angular-locale_en-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-gb.js")
        case "fobo" :: "angular-locale_en-mu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-mu.js")
        case "fobo" :: "angular-locale_lv.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lv.js")
        case "fobo" :: "angular-locale_fr-tg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-tg.js")
        case "fobo" :: "angular-locale_vun-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_vun-tz.js")
        case "fobo" :: "angular-locale_gd-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_gd-gb.js")
        case "fobo" :: "angular-locale_st.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_st.js")
        case "fobo" :: "angular-locale_pl-pl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_pl-pl.js")
        case "fobo" :: "angular-locale_bm-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bm-ml.js")
        case "fobo" :: "angular-locale_ar-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-dj.js")
        case "fobo" :: "angular-locale_en-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-be.js")
        case "fobo" :: "angular-locale_en-ls.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ls.js")
        case "fobo" :: "angular-locale_aa-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_aa-dj.js")
        case "fobo" :: "angular-locale_haw-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_haw-us.js")
        case "fobo" :: "angular-locale_ta-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ta-sg.js")
        case "fobo" :: "angular-locale_sw-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sw-ug.js")
        case "fobo" :: "angular-locale_gl.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gl.js")
        case "fobo" :: "angular-locale_es-ic.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-ic.js")
        case "fobo" :: "angular-locale_en-pw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-pw.js")
        case "fobo" :: "angular-locale_nr-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nr-za.js")
        case "fobo" :: "angular-locale_ti.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ti.js")
        case "fobo" :: "angular-locale_en-bw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-bw.js")
        case "fobo" :: "angular-locale_az-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_az-cyrl.js")
        case "fobo" :: "angular-locale_gsw.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gsw.js")
      }
    }

    lazy val angularjs1315i18n3 = {
      ResourceServer.rewrite {
        //i18n files    
        case "fobo" :: "angular-locale_en-jm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-jm.js")
        case "fobo" :: "angular-locale_cgg-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_cgg-ug.js")
        case "fobo" :: "angular-locale_rm.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rm.js")
        case "fobo" :: "angular-locale_mr.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mr.js")
        case "fobo" :: "angular-locale_th.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_th.js")
        case "fobo" :: "angular-locale_br.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_br.js")
        case "fobo" :: "angular-locale_en-im.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-im.js")
        case "fobo" :: "angular-locale_lg-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_lg-ug.js")
        case "fobo" :: "angular-locale_en-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ug.js")
        case "fobo" :: "angular-locale_dz.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dz.js")
        case "fobo" :: "angular-locale_vai-latn-lr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_vai-latn-lr.js")
        case "fobo" :: "angular-locale_nb-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nb-no.js")
        case "fobo" :: "angular-locale_se.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_se.js")
        case "fobo" :: "angular-locale_ckb-arab-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ckb-arab-iq.js")
        case "fobo" :: "angular-locale_asa-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_asa-tz.js")
        case "fobo" :: "angular-locale_ar-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-001.js")
        case "fobo" :: "angular-locale_brx.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_brx.js")
        case "fobo" :: "angular-locale_es-co.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-co.js")
        case "fobo" :: "angular-locale_ewo-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ewo-cm.js")
        case "fobo" :: "angular-locale_ln.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ln.js")
        case "fobo" :: "angular-locale_sk-sk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sk-sk.js")
        case "fobo" :: "angular-locale_vai-vaii-lr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_vai-vaii-lr.js")
        case "fobo" :: "angular-locale_ug.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ug.js")
        case "fobo" :: "angular-locale_af.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_af.js")
        case "fobo" :: "angular-locale_de-li.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_de-li.js")
        case "fobo" :: "angular-locale_kw.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kw.js")
        case "fobo" :: "angular-locale_so-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_so-et.js")
        case "fobo" :: "angular-locale_ti-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ti-et.js")
        case "fobo" :: "angular-locale_nyn-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nyn-ug.js")
        case "fobo" :: "angular-locale_gsw-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_gsw-ch.js")
        case "fobo" :: "angular-locale_ckb-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ckb-latn.js")
        case "fobo" :: "angular-locale_nl-sx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nl-sx.js")
        case "fobo" :: "angular-locale_da.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_da.js")
        case "fobo" :: "angular-locale_sq-al.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sq-al.js")
        case "fobo" :: "angular-locale_zh-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_zh-cn.js")
        case "fobo" :: "angular-locale_en-ph.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ph.js")
        case "fobo" :: "angular-locale_ru-md.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ru-md.js")
        case "fobo" :: "angular-locale_tl.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tl.js")
        case "fobo" :: "angular-locale_ks.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ks.js")
        case "fobo" :: "angular-locale_tzm-latn-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_tzm-latn-ma.js")
        case "fobo" :: "angular-locale_zu.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zu.js")
        case "fobo" :: "angular-locale_et-ee.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_et-ee.js")
        case "fobo" :: "angular-locale_ar-ae.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-ae.js")
        case "fobo" :: "angular-locale_ha-latn-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ha-latn-ng.js")
        case "fobo" :: "angular-locale_cy-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_cy-gb.js")
        case "fobo" :: "angular-locale_en-as.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-as.js")
        case "fobo" :: "angular-locale_byn-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_byn-er.js")
        case "fobo" :: "angular-locale_sn-zw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sn-zw.js")
        case "fobo" :: "angular-locale_en-nf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-nf.js")
        case "fobo" :: "angular-locale_eo.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_eo.js")
        case "fobo" :: "angular-locale_nl-bq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nl-bq.js")
        case "fobo" :: "angular-locale_ee-tg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ee-tg.js")
        case "fobo" :: "angular-locale_pa-arab-pk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_pa-arab-pk.js")
        case "fobo" :: "angular-locale_gsw-li.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_gsw-li.js")
        case "fobo" :: "angular-locale_en-io.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-io.js")
        case "fobo" :: "angular-locale_se-se.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_se-se.js")
        case "fobo" :: "angular-locale_tr-tr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_tr-tr.js")
        case "fobo" :: "angular-locale_fr-mc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-mc.js")
        case "fobo" :: "angular-locale_wae.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_wae.js")
        case "fobo" :: "angular-locale_mua-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_mua-cm.js")
        case "fobo" :: "angular-locale_ru-kg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ru-kg.js")
        case "fobo" :: "angular-locale_uz-cyrl-uz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_uz-cyrl-uz.js")
        case "fobo" :: "angular-locale_en-vc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-vc.js")
        case "fobo" :: "angular-locale_es-ph.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-ph.js")
        case "fobo" :: "angular-locale_mfe-mu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_mfe-mu.js")
        case "fobo" :: "angular-locale_tn.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tn.js")
        case "fobo" :: "angular-locale_sg-cf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sg-cf.js")
        case "fobo" :: "angular-locale_swc.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_swc.js")
        case "fobo" :: "angular-locale_fa-af.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fa-af.js")
        case "fobo" :: "angular-locale_ca-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ca-fr.js")
        case "fobo" :: "angular-locale_pl.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pl.js")
        case "fobo" :: "angular-locale_en-zw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-zw.js")
        case "fobo" :: "angular-locale_ff-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ff-cm.js")
        case "fobo" :: "angular-locale_fil.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fil.js")
        case "fobo" :: "angular-locale_is-is.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_is-is.js")
        case "fobo" :: "angular-locale_es-pa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-pa.js")
        case "fobo" :: "angular-locale_sv.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv.js")
        case "fobo" :: "angular-locale_nso-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nso-za.js")
        case "fobo" :: "angular-locale_fr-yt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-yt.js")
        case "fobo" :: "angular-locale_lb-lu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_lb-lu.js")
        case "fobo" :: "angular-locale_de.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_de.js")
        case "fobo" :: "angular-locale_ln-cf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ln-cf.js")
        case "fobo" :: "angular-locale_th-th.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_th-th.js")
        case "fobo" :: "angular-locale_en-bb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-bb.js")
        case "fobo" :: "angular-locale_teo-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_teo-ke.js")
        case "fobo" :: "angular-locale_es.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es.js")
        case "fobo" :: "angular-locale_dz-bt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_dz-bt.js")
        case "fobo" :: "angular-locale_nso.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nso.js")
        case "fobo" :: "angular-locale_lo-la.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_lo-la.js")
        case "fobo" :: "angular-locale_ti-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ti-er.js")
        case "fobo" :: "angular-locale_ff-mr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ff-mr.js")
        case "fobo" :: "angular-locale_om-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_om-ke.js")
        case "fobo" :: "angular-locale_luy.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_luy.js")
        case "fobo" :: "angular-locale_naq-na.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_naq-na.js")
        case "fobo" :: "angular-locale_en-sx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-sx.js")
        case "fobo" :: "angular-locale_nl-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nl-be.js")
        case "fobo" :: "angular-locale_si-lk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_si-lk.js")
        case "fobo" :: "angular-locale_kn-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_kn-in.js")
        case "fobo" :: "angular-locale_mua.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mua.js")
        case "fobo" :: "angular-locale_kab-dz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_kab-dz.js")
        case "fobo" :: "angular-locale_lv-lv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_lv-lv.js")
        case "fobo" :: "angular-locale_en-mh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-mh.js")
        case "fobo" :: "angular-locale_en-cc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-cc.js")
        case "fobo" :: "angular-locale_jmc-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_jmc-tz.js")
        case "fobo" :: "angular-locale_dav.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dav.js")
        case "fobo" :: "angular-locale_sg.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sg.js")
        case "fobo" :: "angular-locale_eu-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_eu-es.js")
        case "fobo" :: "angular-locale_ar-eg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-eg.js")
        case "fobo" :: "angular-locale_es-sv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-sv.js")
        case "fobo" :: "angular-locale_ca-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ca-es.js")
        case "fobo" :: "angular-locale_bm.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bm.js")
        case "fobo" :: "angular-locale_ckb.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ckb.js")
        case "fobo" :: "angular-locale_es-ea.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-ea.js")
        case "fobo" :: "angular-locale_sr-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sr-latn.js")
        case "fobo" :: "angular-locale_tig.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tig.js")
        case "fobo" :: "angular-locale_fr-gf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-gf.js")
        case "fobo" :: "angular-locale_ps.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ps.js")
        case "fobo" :: "angular-locale_en-dg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-dg.js")
        case "fobo" :: "angular-locale_ar-ss.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-ss.js")
        case "fobo" :: "angular-locale_fr-mr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-mr.js")
        case "fobo" :: "angular-locale_kk-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_kk-cyrl.js")
        case "fobo" :: "angular-locale_ksb-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ksb-tz.js")
        case "fobo" :: "angular-locale_ff-sn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ff-sn.js")
        case "fobo" :: "angular-locale_hr-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_hr-ba.js")
        case "fobo" :: "angular-locale_gl-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_gl-es.js")
        case "fobo" :: "angular-locale_bo-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bo-in.js")
        case "fobo" :: "angular-locale_vai-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_vai-latn.js")
        case "fobo" :: "angular-locale_sq.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sq.js")
        case "fobo" :: "angular-locale_fr-gp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-gp.js")
        case "fobo" :: "angular-locale_ar-mr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-mr.js")
        case "fobo" :: "angular-locale_sr-cyrl-rs.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sr-cyrl-rs.js")
        case "fobo" :: "angular-locale_ve-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ve-za.js")
        case "fobo" :: "angular-locale_or-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_or-in.js")
        case "fobo" :: "angular-locale_ru.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ru.js")
        case "fobo" :: "angular-locale_en-gm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-gm.js")
        case "fobo" :: "angular-locale_sq-mk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sq-mk.js")
        case "fobo" :: "angular-locale_hi.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hi.js")
        case "fobo" :: "angular-locale_saq.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_saq.js")
        case "fobo" :: "angular-locale_en-bm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-bm.js")
        case "fobo" :: "angular-locale_mg.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mg.js")
        case "fobo" :: "angular-locale_de-lu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_de-lu.js")
        case "fobo" :: "angular-locale_es-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-es.js")
        case "fobo" :: "angular-locale_shi-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_shi-latn.js")
        case "fobo" :: "angular-locale_bs-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bs-latn.js")
        case "fobo" :: "angular-locale_sah.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sah.js")
        case "fobo" :: "angular-locale_fy.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fy.js")
        case "fobo" :: "angular-locale_ksh.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ksh.js")
        case "fobo" :: "angular-locale_bem-zm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bem-zm.js")
        case "fobo" :: "angular-locale_tr.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tr.js")
        case "fobo" :: "angular-locale_swc-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_swc-cd.js")
        case "fobo" :: "angular-locale_gv.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gv.js")
        case "fobo" :: "angular-locale_br-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_br-fr.js")
        case "fobo" :: "angular-locale_fr-bi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-bi.js")
        case "fobo" :: "angular-locale_pt-gw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_pt-gw.js")
        case "fobo" :: "angular-locale_af-na.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_af-na.js")
        case "fobo" :: "angular-locale_en-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-001.js")
        case "fobo" :: "angular-locale_sn.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sn.js")
        case "fobo" :: "angular-locale_jgo.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_jgo.js")
        case "fobo" :: "angular-locale_ur.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ur.js")
        case "fobo" :: "angular-locale_uz-arab.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_uz-arab.js")
        case "fobo" :: "angular-locale_en-vi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-vi.js")
        case "fobo" :: "angular-locale_ks-arab-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ks-arab-in.js")
        case "fobo" :: "angular-locale_ee.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ee.js")
        case "fobo" :: "angular-locale_pt-br.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_pt-br.js")
        case "fobo" :: "angular-locale_eo-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_eo-001.js")
        case "fobo" :: "angular-locale_da-dk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_da-dk.js")
        case "fobo" :: "angular-locale_pt-cv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_pt-cv.js")
        case "fobo" :: "angular-locale_nb.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nb.js")
        case "fobo" :: "angular-locale_ar-sd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-sd.js")
        case "fobo" :: "angular-locale_pa.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pa.js")
        case "fobo" :: "angular-locale_fa-ir.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fa-ir.js")
        case "fobo" :: "angular-locale_nl-nl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nl-nl.js")
        case "fobo" :: "angular-locale_yo.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_yo.js")
        case "fobo" :: "angular-locale_ts.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ts.js")
        case "fobo" :: "angular-locale_jmc.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_jmc.js")
        case "fobo" :: "angular-locale_en-sh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-sh.js")
        case "fobo" :: "angular-locale_rwk.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rwk.js")
        case "fobo" :: "angular-locale_teo-ug.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_teo-ug.js")
        case "fobo" :: "angular-locale_kea-cv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_kea-cv.js")
        case "fobo" :: "angular-locale_nmg-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nmg-cm.js")
        case "fobo" :: "angular-locale_en-lr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-lr.js")
        case "fobo" :: "angular-locale_byn.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_byn.js")
        case "fobo" :: "angular-locale_lg.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lg.js")
        case "fobo" :: "angular-locale_ses.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ses.js")
        case "fobo" :: "angular-locale_fr-bj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-bj.js")
        case "fobo" :: "angular-locale_fo-fo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fo-fo.js")
        case "fobo" :: "angular-locale_or.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_or.js")
        case "fobo" :: "angular-locale_nmg.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nmg.js")
        case "fobo" :: "angular-locale_mgo-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_mgo-cm.js")
        case "fobo" :: "angular-locale_ia.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ia.js")
        case "fobo" :: "angular-locale_so-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_so-ke.js")
        case "fobo" :: "angular-locale_nl.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nl.js")
        case "fobo" :: "angular-locale_en-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ke.js")
        case "fobo" :: "angular-locale_en-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-hk.js")
        case "fobo" :: "angular-locale_ka-ge.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ka-ge.js")
        case "fobo" :: "angular-locale_sr-latn-xk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sr-latn-xk.js")
        case "fobo" :: "angular-locale_zh-hans.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_zh-hans.js")
        case "fobo" :: "angular-locale_ig.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ig.js")
        case "fobo" :: "angular-locale_sv-se.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sv-se.js")
        case "fobo" :: "angular-locale_wal.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_wal.js")
      }
    }

    lazy val angularjs1315i18n4 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_qu-pe.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_qu-pe.js")
        case "fobo" :: "angular-locale_pa-guru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_pa-guru.js")
        case "fobo" :: "angular-locale_ru-ua.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ru-ua.js")
        case "fobo" :: "angular-locale_ar-sy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-sy.js")
        case "fobo" :: "angular-locale_guz-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_guz-ke.js")
        case "fobo" :: "angular-locale_bm-latn-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bm-latn-ml.js")
        case "fobo" :: "angular-locale_se-no.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_se-no.js")
        case "fobo" :: "angular-locale_fr-mq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-mq.js")
        case "fobo" :: "angular-locale_ky-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ky-cyrl.js")
        case "fobo" :: "angular-locale_si.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_si.js")
        case "fobo" :: "angular-locale_ro-ro.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ro-ro.js")
        case "fobo" :: "angular-locale_ja-jp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ja-jp.js")
        case "fobo" :: "angular-locale_fr-cf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-cf.js")
        case "fobo" :: "angular-locale_ja.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ja.js")
        case "fobo" :: "angular-locale_ka.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ka.js")
        case "fobo" :: "angular-locale_ko.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ko.js")
        case "fobo" :: "angular-locale_fr-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-cm.js")
        case "fobo" :: "angular-locale_chr.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_chr.js")
        case "fobo" :: "angular-locale_bs-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bs-cyrl.js")
        case "fobo" :: "angular-locale_en-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ng.js")
        case "fobo" :: "angular-locale_eu.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_eu.js")
        case "fobo" :: "angular-locale_ee-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ee-gh.js")
        case "fobo" :: "angular-locale_az-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_az-latn.js")
        case "fobo" :: "angular-locale_rm-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_rm-ch.js")
        case "fobo" :: "angular-locale_en-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-in.js")
        case "fobo" :: "angular-locale_sr-cyrl-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sr-cyrl-ba.js")
        case "fobo" :: "angular-locale_as-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_as-in.js")
        case "fobo" :: "angular-locale_en-nz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-nz.js")
        case "fobo" :: "angular-locale_om-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_om-et.js")
        case "fobo" :: "angular-locale_as.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_as.js")
        case "fobo" :: "angular-locale_ky-cyrl-kg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ky-cyrl-kg.js")
        case "fobo" :: "angular-locale_ckb-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ckb-iq.js")
        case "fobo" :: "angular-locale_de-at.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_de-at.js")
        case "fobo" :: "angular-locale_ebu-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ebu-ke.js")
        case "fobo" :: "angular-locale_twq-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_twq-ne.js")
        case "fobo" :: "angular-locale_hsb.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hsb.js")
        case "fobo" :: "angular-locale_sv-ax.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sv-ax.js")
        case "fobo" :: "angular-locale_kde-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_kde-tz.js")
        case "fobo" :: "angular-locale_ebu.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ebu.js")
        case "fobo" :: "angular-locale_en-gg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-gg.js")
        case "fobo" :: "angular-locale_cs.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_cs.js")
        case "fobo" :: "angular-locale_vi.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vi.js")
        case "fobo" :: "angular-locale_seh.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_seh.js")
        case "fobo" :: "angular-locale_kk.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kk.js")
        case "fobo" :: "angular-locale_en-bs.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-bs.js")
        case "fobo" :: "angular-locale_en-fk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-fk.js")
        case "fobo" :: "angular-locale_fr-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-fr.js")
        case "fobo" :: "angular-locale_shi-tfng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_shi-tfng.js")
        case "fobo" :: "angular-locale_vo-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_vo-001.js")
        case "fobo" :: "angular-locale_pt-pt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_pt-pt.js")
        case "fobo" :: "angular-locale_ast.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ast.js")
        case "fobo" :: "angular-locale_vi-vn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_vi-vn.js")
        case "fobo" :: "angular-locale_fo.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fo.js")
        case "fobo" :: "angular-locale_ar-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-er.js")
        case "fobo" :: "angular-locale_ar-kw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-kw.js")
        case "fobo" :: "angular-locale_es-uy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-uy.js")
        case "fobo" :: "angular-locale_rw-rw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_rw-rw.js")
        case "fobo" :: "angular-locale_ar-so.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-so.js")
        case "fobo" :: "angular-locale_en-vu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-vu.js")
        case "fobo" :: "angular-locale_ksf.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ksf.js")
        case "fobo" :: "angular-locale_ar-eh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-eh.js")
        case "fobo" :: "angular-locale_fr-mu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-mu.js")
        case "fobo" :: "angular-locale_bg.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bg.js")
        case "fobo" :: "angular-locale_en-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-gh.js")
        case "fobo" :: "angular-locale_ru-by.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ru-by.js")
        case "fobo" :: "angular-locale_ig-ng.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ig-ng.js")
        case "fobo" :: "angular-locale_to.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_to.js")
        case "fobo" :: "angular-locale_nus-sd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nus-sd.js")
        case "fobo" :: "angular-locale_kl-gl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_kl-gl.js")
        case "fobo" :: "angular-locale_ms-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ms-latn.js")
        case "fobo" :: "angular-locale_nl-aw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nl-aw.js")
        case "fobo" :: "angular-locale_en-na.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-na.js")
        case "fobo" :: "angular-locale_kkj-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_kkj-cm.js")
        case "fobo" :: "angular-locale_af-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_af-za.js")
        case "fobo" :: "angular-locale_kok-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_kok-in.js")
        case "fobo" :: "angular-locale_so-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_so-dj.js")
        case "fobo" :: "angular-locale_fur.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fur.js")
        case "fobo" :: "angular-locale_sbp.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sbp.js")
        case "fobo" :: "angular-locale_en-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-tz.js")
        case "fobo" :: "angular-locale_en-ss.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ss.js")
        case "fobo" :: "angular-locale_lt-lt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_lt-lt.js")
        case "fobo" :: "angular-locale_en-cx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-cx.js")
        case "fobo" :: "angular-locale_zh-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_zh-hk.js")
        case "fobo" :: "angular-locale_fi-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fi-fi.js")
        case "fobo" :: "angular-locale_mer.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mer.js")
        case "fobo" :: "angular-locale_tig-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_tig-er.js")
        case "fobo" :: "angular-locale_mas-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_mas-tz.js")
        case "fobo" :: "angular-locale_en-dm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-dm.js")
        case "fobo" :: "angular-locale_en-kn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-kn.js")
        case "fobo" :: "angular-locale_ko-kp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ko-kp.js")
        case "fobo" :: "angular-locale_en-iso.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-iso.js")
        case "fobo" :: "angular-locale_sbp-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_sbp-tz.js")
        case "fobo" :: "angular-locale_ha.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ha.js")
        case "fobo" :: "angular-locale_kk-cyrl-kz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_kk-cyrl-kz.js")
        case "fobo" :: "angular-locale_tg-cyrl-tj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_tg-cyrl-tj.js")
        case "fobo" :: "angular-locale_ga-ie.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ga-ie.js")
        case "fobo" :: "angular-locale_kln-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_kln-ke.js")
        case "fobo" :: "angular-locale_ar-om.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-om.js")
        case "fobo" :: "angular-locale_bas.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bas.js")
        case "fobo" :: "angular-locale_bas-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bas-cm.js")
        case "fobo" :: "angular-locale_zh-hant-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_zh-hant-mo.js")
        case "fobo" :: "angular-locale_ln-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ln-cd.js")
        case "fobo" :: "angular-locale_en-lc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-lc.js")
        case "fobo" :: "angular-locale_en-sz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-sz.js")
        case "fobo" :: "angular-locale_hsb-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_hsb-de.js")
        case "fobo" :: "angular-locale_ii-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ii-cn.js")
        case "fobo" :: "angular-locale_en-tk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-tk.js")
        case "fobo" :: "angular-locale_fr-ci.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-ci.js")
        case "fobo" :: "angular-locale_ms.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ms.js")
        case "fobo" :: "angular-locale_kde.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kde.js")
        case "fobo" :: "angular-locale_ar-td.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-td.js")
        case "fobo" :: "angular-locale_ca-es-valencia.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ca-es-valencia.js")
        case "fobo" :: "angular-locale_vai-vaii.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_vai-vaii.js")
        case "fobo" :: "angular-locale_fr-mf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-mf.js")
        case "fobo" :: "angular-locale_en-er.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-er.js")
        case "fobo" :: "angular-locale_fur-it.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fur-it.js")
        case "fobo" :: "angular-locale_mn-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_mn-cyrl.js")
        case "fobo" :: "angular-locale_ar-ps.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-ps.js")
        case "fobo" :: "angular-locale_lag-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_lag-tz.js")
        case "fobo" :: "angular-locale_xog.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_xog.js")
        case "fobo" :: "angular-locale_khq-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_khq-ml.js")
        case "fobo" :: "angular-locale_ar-bh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-bh.js")
        case "fobo" :: "angular-locale_yav.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_yav.js")
        case "fobo" :: "angular-locale_be.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_be.js")
        case "fobo" :: "angular-locale_en-je.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-je.js")
        case "fobo" :: "angular-locale_rn.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rn.js")
        case "fobo" :: "angular-locale_en-ck.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ck.js")
        case "fobo" :: "angular-locale_en-tt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-tt.js")
        case "fobo" :: "angular-locale_dyo.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dyo.js")
        case "fobo" :: "angular-locale_da-gl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_da-gl.js")
        case "fobo" :: "angular-locale_nnh-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_nnh-cm.js")
        case "fobo" :: "angular-locale_ml.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ml.js")
        case "fobo" :: "angular-locale_ru-ru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ru-ru.js")
        case "fobo" :: "angular-locale_bm-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_bm-latn.js")
        case "fobo" :: "angular-locale_twq.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_twq.js")
        case "fobo" :: "angular-locale_kam.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kam.js")
        case "fobo" :: "angular-locale_dua.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dua.js")
        case "fobo" :: "angular-locale_uz-latn-uz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_uz-latn-uz.js")
        case "fobo" :: "angular-locale_es-419.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-419.js")
        case "fobo" :: "angular-locale_en-sc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-sc.js")
        case "fobo" :: "angular-locale_ar-il.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-il.js")
        case "fobo" :: "angular-locale_nus.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nus.js")
        case "fobo" :: "angular-locale_in.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_in.js")
        case "fobo" :: "angular-locale_ml-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ml-in.js")
        case "fobo" :: "angular-locale_fr-nc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-nc.js")
        case "fobo" :: "angular-locale_en-fj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-fj.js")
        case "fobo" :: "angular-locale_en-ky.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-ky.js")
        case "fobo" :: "angular-locale_fr-bf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-bf.js")
        case "fobo" :: "angular-locale_dav-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_dav-ke.js")
        case "fobo" :: "angular-locale_uz-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_uz-cyrl.js")
        case "fobo" :: "angular-locale_ar-qa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ar-qa.js")
        case "fobo" :: "angular-locale_en.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en.js")
        case "fobo" :: "angular-locale_km-kh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_km-kh.js")
        case "fobo" :: "angular-locale_aa.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_aa.js")
        case "fobo" :: "angular-locale_fil-ph.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fil-ph.js")
        case "fobo" :: "angular-locale_mn.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mn.js")
        case "fobo" :: "angular-locale_nnh.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nnh.js")
        case "fobo" :: "angular-locale_ca-it.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ca-it.js")
        case "fobo" :: "angular-locale_tn-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_tn-za.js")
        case "fobo" :: "angular-locale_en-mw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-mw.js")
        case "fobo" :: "angular-locale_vun.js" :: Nil =>
          List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vun.js")
        case "fobo" :: "angular-locale_kam-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_kam-ke.js")
        case "fobo" :: "angular-locale_en-vg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_en-vg.js")
        case "fobo" :: "angular-locale_ak-gh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ak-gh.js")
        case "fobo" :: "angular-locale_fr-ga.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-ga.js")
        case "fobo" :: "angular-locale_es-py.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-py.js")
        case "fobo" :: "angular-locale_dje-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_dje-ne.js")
        case "fobo" :: "angular-locale_fr-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_fr-ne.js")
        case "fobo" :: "angular-locale_mg-mg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_mg-mg.js")
        case "fobo" :: "angular-locale_gsw-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_gsw-fr.js")
        case "fobo" :: "angular-locale_ia-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_ia-fr.js")
        case "fobo" :: "angular-locale_es-bo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.3.15",
               "i18n",
               "angular-locale_es-bo.js")
      }
    }

    lazy val angularjs1219 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.2.19", "js", "angular.js")
        case "fobo" :: "angular.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")
        case "fobo" :: "angular.min.js.map" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "js", "angular.min.js.map")

        case "fobo" :: "angular-animate.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-animate.js")
        case "fobo" :: "angular-animate.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-animate.min.js")
        case "fobo" :: "angular-animate.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "js",
               "angular-animate.min.js.map")

        case "fobo" :: "angular-cookies.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-cookies.js")
        case "fobo" :: "angular-cookies.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-cookies.min.js")
        case "fobo" :: "angular-cookies.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "js",
               "angular-cookies.min.js.map")

        case "fobo" :: "angular-loader.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-loader.js")
        case "fobo" :: "angular-loader.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-loader.min.js")
        case "fobo" :: "angular-loader.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "js",
               "angular.min-loader.js.map")
        //dev/test only
        case "fobo" :: "angular-mocks.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-mocks.js")

        case "fobo" :: "angular-resource.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-resource.js")
        case "fobo" :: "angular-resource.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-resource.min.js")
        case "fobo" :: "angular-resource.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "js",
               "angular-resource.min.js.map")

        case "fobo" :: "angular-route.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-route.js")
        case "fobo" :: "angular-route.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-route.min.js")
        case "fobo" :: "angular-route.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "js",
               "angular-route.min.js.map")

        case "fobo" :: "angular-sanitize.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-sanitize.js")
        case "fobo" :: "angular-sanitize.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-sanitize.min.js")
        case "fobo" :: "angular-sanitize.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "js",
               "angular-sanitize.min.js.map")
        //dev/test only 
        case "fobo" :: "angular-scenario.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-scenario.js")

        case "fobo" :: "angular-touch.js" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-touch.js")
        case "fobo" :: "angular-touch.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "js", "angular-touch.min.js")
        case "fobo" :: "angular-touch.min.js.map" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "js",
               "angular-touch.min.js.map")

        //CSS files
        case "fobo" :: "angular-csp.css" :: Nil if Props.devMode =>
          List("fobo", "angular-js", "1.2.19", "css", "angular-csp.css")
        case "fobo" :: "angular-csp.css" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "css", "angular-csp.min.css")

      }
    }

    lazy val angularjs1219i18n = {
      ResourceServer.rewrite {
        //i18n files
        case "fobo" :: "angular-locale_nl-cw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_nl-cw.js")
        case "fobo" :: "angular-locale_en-bz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-bz.js")
        case "fobo" :: "angular-locale_en-pk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-pk.js")
        case "fobo" :: "angular-locale_he.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_he.js")
        case "fobo" :: "angular-locale_sr-latn-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sr-latn-ba.js")
        case "fobo" :: "angular-locale_fr-rw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-rw.js")
        case "fobo" :: "angular-locale_de-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_de-ch.js")
        case "fobo" :: "angular-locale_ar-iq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-iq.js")
        case "fobo" :: "angular-locale_hu.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_hu.js")
        case "fobo" :: "angular-locale_fr-cg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-cg.js")
        case "fobo" :: "angular-locale_en-ca.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-ca.js")
        case "fobo" :: "angular-locale_fr-bl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-bl.js")
        case "fobo" :: "angular-locale_fa.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fa.js")
        case "fobo" :: "angular-locale_mr-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_mr-in.js")
        case "fobo" :: "angular-locale_sv-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sv-fi.js")
        case "fobo" :: "angular-locale_it.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_it.js")
        case "fobo" :: "angular-locale_fr-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-cd.js")
        case "fobo" :: "angular-locale_fr-sn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-sn.js")
        case "fobo" :: "angular-locale_ar.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar.js")
        case "fobo" :: "angular-locale_is.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_is.js")
        case "fobo" :: "angular-locale_bg-bg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_bg-bg.js")
        case "fobo" :: "angular-locale_fi.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fi.js")
        case "fobo" :: "angular-locale_bn-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_bn-in.js")
        case "fobo" :: "angular-locale_en-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-sg.js")
        case "fobo" :: "angular-locale_zh-hant-tw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_zh-hant-tw.js")
        case "fobo" :: "angular-locale_fr-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-ch.js")
        case "fobo" :: "angular-locale_en-fm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-fm.js")
        case "fobo" :: "angular-locale_zh-tw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_zh-tw.js")
        case "fobo" :: "angular-locale_fr-ml.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-ml.js")
        case "fobo" :: "angular-locale_en-gu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-gu.js")
        case "fobo" :: "angular-locale_sw-ke.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sw-ke.js")
        case "fobo" :: "angular-locale_pt.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_pt.js")
        case "fobo" :: "angular-locale_sk.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sk.js")
        case "fobo" :: "angular-locale_gu.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_gu.js")
        case "fobo" :: "angular-locale_ar-dz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-dz.js")
        case "fobo" :: "angular-locale_zh-hant-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_zh-hant-hk.js")
        case "fobo" :: "angular-locale_et.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_et.js")
        case "fobo" :: "angular-locale_mt.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_mt.js")
        case "fobo" :: "angular-locale_pt-mz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_pt-mz.js")
        case "fobo" :: "angular-locale_es-gq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-gq.js")
        case "fobo" :: "angular-locale_es-ve.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-ve.js")
        case "fobo" :: "angular-locale_zh-hant.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_zh-hant.js")
        case "fobo" :: "angular-locale_el-gr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_el-gr.js")
        case "fobo" :: "angular-locale_it-it.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_it-it.js")
        case "fobo" :: "angular-locale_es-do.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-do.js")
        case "fobo" :: "angular-locale_hi-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_hi-in.js")
        case "fobo" :: "angular-locale_cs-cz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_cs-cz.js")
        case "fobo" :: "angular-locale_hr-hr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_hr-hr.js")
        case "fobo" :: "angular-locale_en-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-za.js")
        case "fobo" :: "angular-locale_el-cy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_el-cy.js")
        case "fobo" :: "angular-locale_ur-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ur-in.js")
        case "fobo" :: "angular-locale_bn.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_bn.js")
        case "fobo" :: "angular-locale_zu-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_zu-za.js")
        case "fobo" :: "angular-locale_ca.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ca.js")
        case "fobo" :: "angular-locale_sw.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sw.js")
        case "fobo" :: "angular-locale_en-ie.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-ie.js")
        case "fobo" :: "angular-locale_es-hn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-hn.js")
        case "fobo" :: "angular-locale_es-cr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-cr.js")
        case "fobo" :: "angular-locale_ar-jo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-jo.js")
        case "fobo" :: "angular-locale_sr.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sr.js")
        case "fobo" :: "angular-locale_fr-lu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-lu.js")
        case "fobo" :: "angular-locale_en-um.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-um.js")
        case "fobo" :: "angular-locale_ro-md.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ro-md.js")
        case "fobo" :: "angular-locale_zh-hans-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_zh-hans-hk.js")
        case "fobo" :: "angular-locale_fr-mg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-mg.js")
        case "fobo" :: "angular-locale_ro.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ro.js")
        case "fobo" :: "angular-locale_es-ar.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-ar.js")
        case "fobo" :: "angular-locale_fr.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr.js")
        case "fobo" :: "angular-locale_it-sm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_it-sm.js")
        case "fobo" :: "angular-locale_uk-ua.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_uk-ua.js")
        case "fobo" :: "angular-locale_pt-st.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_pt-st.js")
        case "fobo" :: "angular-locale_kn.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_kn.js")
        case "fobo" :: "angular-locale_sr-latn-me.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sr-latn-me.js")
        case "fobo" :: "angular-locale_en-pr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-pr.js")
        case "fobo" :: "angular-locale_sl.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sl.js")
        case "fobo" :: "angular-locale_fr-dj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-dj.js")
        case "fobo" :: "angular-locale_it-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_it-ch.js")
        case "fobo" :: "angular-locale_fr-km.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-km.js")
        case "fobo" :: "angular-locale_sr-cyrl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sr-cyrl.js")
        case "fobo" :: "angular-locale_gu-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_gu-in.js")
        case "fobo" :: "angular-locale_es-mx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-mx.js")
        case "fobo" :: "angular-locale_bn-bd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_bn-bd.js")
        case "fobo" :: "angular-locale_am-et.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_am-et.js")
        case "fobo" :: "angular-locale_sr-latn-rs.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sr-latn-rs.js")
        case "fobo" :: "angular-locale_sl-si.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sl-si.js")
        case "fobo" :: "angular-locale_am.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_am.js")
        case "fobo" :: "angular-locale_en-mt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-mt.js")
        case "fobo" :: "angular-locale_ar-ma.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-ma.js")
        case "fobo" :: "angular-locale_te.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_te.js")
        case "fobo" :: "angular-locale_zh.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zh.js")
        case "fobo" :: "angular-locale_es-pr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-pr.js")
        case "fobo" :: "angular-locale_ar-ye.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-ye.js")
        case "fobo" :: "angular-locale_de-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_de-be.js")
        case "fobo" :: "angular-locale_no.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_no.js")
        case "fobo" :: "angular-locale_el.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_el.js")
        case "fobo" :: "angular-locale_ca-ad.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ca-ad.js")
        case "fobo" :: "angular-locale_en-tc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-tc.js")
        case "fobo" :: "angular-locale_es-ni.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-ni.js")
        case "fobo" :: "angular-locale_zh-hans-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_zh-hans-mo.js")
        case "fobo" :: "angular-locale_fr-td.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-td.js")
        case "fobo" :: "angular-locale_mt-mt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_mt-mt.js")
        case "fobo" :: "angular-locale_en-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-us.js")
        case "fobo" :: "angular-locale_zh-hans-sg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_zh-hans-sg.js")
        case "fobo" :: "angular-locale_fr-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-be.js")
        case "fobo" :: "angular-locale_hr.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_hr.js")
        case "fobo" :: "angular-locale_fr-gn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-gn.js")
        case "fobo" :: "angular-locale_es-ec.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-ec.js")
        case "fobo" :: "angular-locale_ta-lk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ta-lk.js")
        case "fobo" :: "angular-locale_en-au.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-au.js")
        case "fobo" :: "angular-locale_id-id.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_id-id.js")
        case "fobo" :: "angular-locale_sw-tz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sw-tz.js")
        case "fobo" :: "angular-locale_de-de.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_de-de.js")
        case "fobo" :: "angular-locale_sr-cyrl-me.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sr-cyrl-me.js")
        case "fobo" :: "angular-locale_ar-lb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-lb.js")

      }
    }

    lazy val angularjs1219i18n2 = {
      ResourceServer.rewrite {
        //i18n files
        case "fobo" :: "angular-locale_ar-tn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-tn.js")
        case "fobo" :: "angular-locale_te-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_te-in.js")
        case "fobo" :: "angular-locale_ta-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ta-in.js")
        case "fobo" :: "angular-locale_es-cl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-cl.js")
        case "fobo" :: "angular-locale_hu-hu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_hu-hu.js")
        case "fobo" :: "angular-locale_ln-cg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ln-cg.js")
        case "fobo" :: "angular-locale_fr-ca.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-ca.js")
        case "fobo" :: "angular-locale_he-il.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_he-il.js")
        case "fobo" :: "angular-locale_es-gt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-gt.js")
        case "fobo" :: "angular-locale_id.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_id.js")
        case "fobo" :: "angular-locale_en-gy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-gy.js")
        case "fobo" :: "angular-locale_ko-kr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ko-kr.js")
        case "fobo" :: "angular-locale_ar-ly.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-ly.js")
        case "fobo" :: "angular-locale_ur-pk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ur-pk.js")
        case "fobo" :: "angular-locale_ar-sa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-sa.js")
        case "fobo" :: "angular-locale_en-mp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-mp.js")
        case "fobo" :: "angular-locale_es-pe.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-pe.js")
        case "fobo" :: "angular-locale_fr-re.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-re.js")
        case "fobo" :: "angular-locale_uk.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_uk.js")
        case "fobo" :: "angular-locale_pt-ao.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_pt-ao.js")
        case "fobo" :: "angular-locale_zh-hans-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_zh-hans-cn.js")
        case "fobo" :: "angular-locale_lt.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_lt.js")
        case "fobo" :: "angular-locale_ta.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ta.js")
        case "fobo" :: "angular-locale_iw.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_iw.js")
        case "fobo" :: "angular-locale_fr-gq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-gq.js")
        case "fobo" :: "angular-locale_es-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-us.js")
        case "fobo" :: "angular-locale_en-gb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-gb.js")
        case "fobo" :: "angular-locale_en-mu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-mu.js")
        case "fobo" :: "angular-locale_lv.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_lv.js")
        case "fobo" :: "angular-locale_fr-tg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-tg.js")
        case "fobo" :: "angular-locale_pl-pl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_pl-pl.js")
        case "fobo" :: "angular-locale_en-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-be.js")
        case "fobo" :: "angular-locale_gl.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_gl.js")
        case "fobo" :: "angular-locale_es-ic.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-ic.js")
        case "fobo" :: "angular-locale_en-pw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-pw.js")
        case "fobo" :: "angular-locale_en-bw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-bw.js")
        case "fobo" :: "angular-locale_gsw.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_gsw.js")
        case "fobo" :: "angular-locale_en-jm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-jm.js")
        case "fobo" :: "angular-locale_ms-my.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ms-my.js")
        case "fobo" :: "angular-locale_mr.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_mr.js")
        case "fobo" :: "angular-locale_th.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_th.js")
        case "fobo" :: "angular-locale_ar-001.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-001.js")
        case "fobo" :: "angular-locale_es-co.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-co.js")
        case "fobo" :: "angular-locale_ln.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ln.js")
        case "fobo" :: "angular-locale_sk-sk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sk-sk.js")
        case "fobo" :: "angular-locale_af.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_af.js")
        case "fobo" :: "angular-locale_de-li.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_de-li.js")
        case "fobo" :: "angular-locale_gsw-ch.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_gsw-ch.js")
        case "fobo" :: "angular-locale_nl-sx.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_nl-sx.js")
        case "fobo" :: "angular-locale_da.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_da.js")
        case "fobo" :: "angular-locale_sq-al.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sq-al.js")
        case "fobo" :: "angular-locale_zh-cn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_zh-cn.js")
        case "fobo" :: "angular-locale_en-ph.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-ph.js")
        case "fobo" :: "angular-locale_ru-md.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ru-md.js")
        case "fobo" :: "angular-locale_tl.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_tl.js")
        case "fobo" :: "angular-locale_zu.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zu.js")
        case "fobo" :: "angular-locale_et-ee.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_et-ee.js")
        case "fobo" :: "angular-locale_ar-ae.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-ae.js")
        case "fobo" :: "angular-locale_en-as.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-as.js")
        case "fobo" :: "angular-locale_tr-tr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_tr-tr.js")
        case "fobo" :: "angular-locale_fr-mc.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-mc.js")
        case "fobo" :: "angular-locale_fa-af.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fa-af.js")
        case "fobo" :: "angular-locale_pl.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_pl.js")
        case "fobo" :: "angular-locale_en-zw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-zw.js")
        case "fobo" :: "angular-locale_fil.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fil.js")
        case "fobo" :: "angular-locale_is-is.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_is-is.js")
        case "fobo" :: "angular-locale_es-pa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-pa.js")
        case "fobo" :: "angular-locale_sv.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv.js")
        case "fobo" :: "angular-locale_fr-yt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-yt.js")
        case "fobo" :: "angular-locale_de.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_de.js")
        case "fobo" :: "angular-locale_th-th.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_th-th.js")
        case "fobo" :: "angular-locale_en-bb.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-bb.js")
        case "fobo" :: "angular-locale_es.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es.js")
        case "fobo" :: "angular-locale_nl-be.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_nl-be.js")
        case "fobo" :: "angular-locale_kn-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_kn-in.js")
        case "fobo" :: "angular-locale_lv-lv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_lv-lv.js")
        case "fobo" :: "angular-locale_en-mh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-mh.js")
        case "fobo" :: "angular-locale_en-dsrt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-dsrt.js")
        case "fobo" :: "angular-locale_en-dsrt-us.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-dsrt-us.js")
        case "fobo" :: "angular-locale_eu-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_eu-es.js")
        case "fobo" :: "angular-locale_ar-eg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-eg.js")
        case "fobo" :: "angular-locale_es-sv.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-sv.js")
        case "fobo" :: "angular-locale_ca-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ca-es.js")
        case "fobo" :: "angular-locale_es-ea.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-ea.js")
        case "fobo" :: "angular-locale_sr-latn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sr-latn.js")
        case "fobo" :: "angular-locale_fr-gf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-gf.js")
        case "fobo" :: "angular-locale_gl-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_gl-es.js")
        case "fobo" :: "angular-locale_sq.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sq.js")
        case "fobo" :: "angular-locale_fr-gp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-gp.js")
        case "fobo" :: "angular-locale_sr-cyrl-rs.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sr-cyrl-rs.js")
        case "fobo" :: "angular-locale_or-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_or-in.js")
        case "fobo" :: "angular-locale_ru.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ru.js")
        case "fobo" :: "angular-locale_hi.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_hi.js")
        case "fobo" :: "angular-locale_en-bm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-bm.js")
        case "fobo" :: "angular-locale_de-lu.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_de-lu.js")
        case "fobo" :: "angular-locale_es-es.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-es.js")
        case "fobo" :: "angular-locale_tr.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_tr.js")
        case "fobo" :: "angular-locale_fr-bi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-bi.js")
        case "fobo" :: "angular-locale_pt-gw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_pt-gw.js")
        case "fobo" :: "angular-locale_af-na.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_af-na.js")
        case "fobo" :: "angular-locale_ur.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ur.js")
        case "fobo" :: "angular-locale_en-vi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-vi.js")
        case "fobo" :: "angular-locale_pt-br.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_pt-br.js")
        case "fobo" :: "angular-locale_da-dk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_da-dk.js")
        case "fobo" :: "angular-locale_ar-sd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-sd.js")
        case "fobo" :: "angular-locale_fa-ir.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fa-ir.js")
        case "fobo" :: "angular-locale_nl-nl.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_nl-nl.js")
        case "fobo" :: "angular-locale_ms-bn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ms-bn.js")
        case "fobo" :: "angular-locale_fr-bj.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-bj.js")
        case "fobo" :: "angular-locale_or.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_or.js")
        case "fobo" :: "angular-locale_nl.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_nl.js")
        case "fobo" :: "angular-locale_en-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-hk.js")
        case "fobo" :: "angular-locale_zh-hans.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_zh-hans.js")
        case "fobo" :: "angular-locale_sv-se.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sv-se.js")
        case "fobo" :: "angular-locale_ru-ua.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ru-ua.js")
        case "fobo" :: "angular-locale_ar-sy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-sy.js")
        case "fobo" :: "angular-locale_fr-mq.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-mq.js")
        case "fobo" :: "angular-locale_ro-ro.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ro-ro.js")
        case "fobo" :: "angular-locale_ja-jp.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ja-jp.js")
        case "fobo" :: "angular-locale_fr-cf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-cf.js")
        case "fobo" :: "angular-locale_ja.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ja.js")
        case "fobo" :: "angular-locale_ko.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ko.js")
        case "fobo" :: "angular-locale_fr-cm.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-cm.js")
        case "fobo" :: "angular-locale_eu.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_eu.js")
        case "fobo" :: "angular-locale_en-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-in.js")
        case "fobo" :: "angular-locale_sr-cyrl-ba.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_sr-cyrl-ba.js")
        case "fobo" :: "angular-locale_en-nz.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-nz.js")
        case "fobo" :: "angular-locale_de-at.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_de-at.js")
        case "fobo" :: "angular-locale_cs.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_cs.js")
        case "fobo" :: "angular-locale_vi.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_vi.js")
        case "fobo" :: "angular-locale_fr-fr.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-fr.js")
        case "fobo" :: "angular-locale_pt-pt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_pt-pt.js")
        case "fobo" :: "angular-locale_vi-vn.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_vi-vn.js")
        case "fobo" :: "angular-locale_ar-kw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-kw.js")
        case "fobo" :: "angular-locale_es-uy.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-uy.js")
        case "fobo" :: "angular-locale_bg.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_bg.js")
        case "fobo" :: "angular-locale_nl-aw.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_nl-aw.js")
        case "fobo" :: "angular-locale_en-na.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-na.js")
        case "fobo" :: "angular-locale_af-za.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_af-za.js")
        case "fobo" :: "angular-locale_lt-lt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_lt-lt.js")
        case "fobo" :: "angular-locale_zh-hk.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_zh-hk.js")
        case "fobo" :: "angular-locale_fi-fi.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fi-fi.js")
        case "fobo" :: "angular-locale_en-iso.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-iso.js")
        case "fobo" :: "angular-locale_ar-om.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-om.js")
        case "fobo" :: "angular-locale_zh-hant-mo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_zh-hant-mo.js")
        case "fobo" :: "angular-locale_ln-cd.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ln-cd.js")
        case "fobo" :: "angular-locale_fr-ci.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-ci.js")
        case "fobo" :: "angular-locale_ms.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ms.js")
        case "fobo" :: "angular-locale_fr-mf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-mf.js")
        case "fobo" :: "angular-locale_ar-bh.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-bh.js")
        case "fobo" :: "angular-locale_en-tt.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-tt.js")
        case "fobo" :: "angular-locale_ml.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ml.js")
        case "fobo" :: "angular-locale_ru-ru.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ru-ru.js")
        case "fobo" :: "angular-locale_es-419.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-419.js")
        case "fobo" :: "angular-locale_in.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_in.js")
        case "fobo" :: "angular-locale_ml-in.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ml-in.js")
        case "fobo" :: "angular-locale_fr-bf.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-bf.js")
        case "fobo" :: "angular-locale_ar-qa.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_ar-qa.js")
        case "fobo" :: "angular-locale_en.js" :: Nil =>
          List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en.js")
        case "fobo" :: "angular-locale_fil-ph.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fil-ph.js")
        case "fobo" :: "angular-locale_en-vg.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_en-vg.js")
        case "fobo" :: "angular-locale_fr-ga.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-ga.js")
        case "fobo" :: "angular-locale_es-py.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-py.js")
        case "fobo" :: "angular-locale_fr-ne.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_fr-ne.js")
        case "fobo" :: "angular-locale_es-bo.js" :: Nil =>
          List("fobo",
               "angular-js",
               "1.2.19",
               "i18n",
               "angular-locale_es-bo.js")
      }
    }

    lazy val uibootstrap0100 = {
      ResourceServer.rewrite {
        case "fobo" :: "ui-bootstrap.js" :: Nil if Props.devMode =>
          List("fobo",
               "angular-ui",
               "bootstrap",
               "0.10.0",
               "js",
               "ui-bootstrap-0.10.0.js")
        case "fobo" :: "ui-bootstrap.js" :: Nil =>
          List("fobo",
               "angular-ui",
               "bootstrap",
               "0.10.0",
               "js",
               "ui-bootstrap-0.10.0.min.js")
        case "fobo" :: "ui-bootstrap-tpls.js" :: Nil if Props.devMode =>
          List("fobo",
               "angular-ui",
               "bootstrap",
               "0.10.0",
               "js",
               "ui-bootstrap-tpls-0.10.0.js")
        case "fobo" :: "ui-bootstrap-tpls.js" :: Nil =>
          List("fobo",
               "angular-ui",
               "bootstrap",
               "0.10.0",
               "js",
               "ui-bootstrap-tpls-0.10.0.min.js")
      }
    }

    lazy val uibootstrap070 = {
      ResourceServer.rewrite {
        case "fobo" :: "ui-bootstrap.js" :: Nil if Props.devMode =>
          List("fobo",
               "angular-ui",
               "bootstrap",
               "0.7.0",
               "js",
               "ui-bootstrap-0.7.0.js")
        case "fobo" :: "ui-bootstrap.js" :: Nil =>
          List("fobo",
               "angular-ui",
               "bootstrap",
               "0.7.0",
               "js",
               "ui-bootstrap-0.7.0.min.js")
        case "fobo" :: "ui-bootstrap-tpls.js" :: Nil if Props.devMode =>
          List("fobo",
               "angular-ui",
               "bootstrap",
               "0.7.0",
               "js",
               "ui-bootstrap-tpls-0.7.0.js")
        case "fobo" :: "ui-bootstrap-tpls.js" :: Nil =>
          List("fobo",
               "angular-ui",
               "bootstrap",
               "0.7.0",
               "js",
               "ui-bootstrap-tpls-0.7.0.min.js")
      }
    }

    lazy val uibootstrap020 = {
      ResourceServer.rewrite {
        case "fobo" :: "ui-bootstrap.js" :: Nil if Props.devMode =>
          List("fobo",
               "angular-ui",
               "bootstrap",
               "0.2.0",
               "js",
               "ui-bootstrap-0.2.0.js")
        case "fobo" :: "ui-bootstrap.js" :: Nil =>
          List("fobo",
               "angular-ui",
               "bootstrap",
               "0.2.0",
               "js",
               "ui-bootstrap-0.2.0.min.js")
        case "fobo" :: "ui-bootstrap-tpls.js" :: Nil if Props.devMode =>
          List("fobo",
               "angular-ui",
               "bootstrap",
               "0.2.0",
               "js",
               "ui-bootstrap-tpls-0.2.0.js")
        case "fobo" :: "ui-bootstrap-tpls.js" :: Nil =>
          List("fobo",
               "angular-ui",
               "bootstrap",
               "0.2.0",
               "js",
               "ui-bootstrap-tpls-0.2.0.min.js")
      }
    }

    lazy val nggrid207 = {
      ResourceServer.rewrite {
        case "fobo" :: "ng-grid.js" :: Nil if Props.devMode =>
          List("fobo",
               "angular-ui",
               "ng-grid",
               "2.0.7",
               "js",
               "ng-grid-2.0.7.debug.js")
        case "fobo" :: "ng-grid.js" :: Nil =>
          List("fobo",
               "angular-ui",
               "ng-grid",
               "2.0.7",
               "js",
               "ng-grid-2.0.7.min.js")
        case "fobo" :: "ng-grid.css" :: Nil if Props.devMode =>
          List("fobo", "angular-ui", "ng-grid", "2.0.7", "css", "ng-grid.css")
        case "fobo" :: "ng-grid.css" :: Nil =>
          List("fobo",
               "angular-ui",
               "ng-grid",
               "2.0.7",
               "css",
               "ng-grid.min.css")
      }
    }

    lazy val uigrid307 = {
      ResourceServer.rewrite {
        case "fobo" :: "ui-grid.js" :: Nil if Props.devMode =>
          List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.js")
        case "fobo" :: "ui-grid.js" :: Nil =>
          List("fobo",
               "angular-ui",
               "ui-grid",
               "3.0.7",
               "js",
               "ui-grid.min.js")
        case "fobo" :: "ui-grid.css" :: Nil if Props.devMode =>
          List("fobo", "angular-ui", "ui-grid", "3.0.7", "css", "ui-grid.css")
        case "fobo" :: "ui-grid.css" :: Nil =>
          List("fobo",
               "angular-ui",
               "ui-grid",
               "3.0.7",
               "css",
               "ui-grid.min.css")
      }
    }

    @deprecated("Use AJMaterial100 or later", "1.5.0")
    lazy val AJMaterial0100 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-material.js" :: Nil if Props.devMode =>
          List("fobo",
               "angular-material",
               "0.10.0",
               "js",
               "angular-material.js")
        case "fobo" :: "angular-material.js" :: Nil =>
          List("fobo",
               "angular-material",
               "0.10.0",
               "js",
               "angular-material.min.js")
        case "fobo" :: "angular-material.css" :: Nil if Props.devMode =>
          List("fobo",
               "angular-material",
               "0.10.0",
               "css",
               "angular-material.css")
        case "fobo" :: "angular-material.css" :: Nil =>
          List("fobo",
               "angular-material",
               "0.10.0",
               "css",
               "angular-material.css")
      }
    }

    lazy val AJMaterial101 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-material.js" :: Nil if Props.devMode =>
          List("fobo",
               "angular-material",
               "1.0.1",
               "js",
               "angular-material.js")
        case "fobo" :: "angular-material.js" :: Nil =>
          List("fobo",
               "angular-material",
               "1.0.1",
               "js",
               "angular-material.min.js")
        case "fobo" :: "angular-material-mocks.js" :: Nil if Props.devMode =>
          List("fobo",
               "angular-material",
               "1.0.1",
               "js",
               "angular-material-mocks.js")
        case "fobo" :: "angular-material-mocks.js" :: Nil =>
          List("fobo",
               "angular-material",
               "1.0.1",
               "js",
               "angular-material-mocks.js")
        case "fobo" :: "angular-material.css" :: Nil if Props.devMode =>
          List("fobo",
               "angular-material",
               "1.0.1",
               "css",
               "angular-material.css")
        case "fobo" :: "angular-material.css" :: Nil =>
          List("fobo",
               "angular-material",
               "1.0.1",
               "css",
               "angular-material.min.css")
        case "fobo" :: "angular-material.layout.css" :: Nil if Props.devMode =>
          List("fobo",
               "angular-material",
               "1.0.1",
               "css",
               "angular-material.layout.css")
        case "fobo" :: "angular-material.layout.css" :: Nil =>
          List("fobo",
               "angular-material",
               "1.0.1",
               "css",
               "angular-material.layout.min.css")

      }
    }

    lazy val AJMaterial108 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-material.js" :: Nil if Props.devMode =>
          List("fobo",
               "angular-material",
               "1.0.8",
               "js",
               "angular-material.js")
        case "fobo" :: "angular-material.js" :: Nil =>
          List("fobo",
               "angular-material",
               "1.0.8",
               "js",
               "angular-material.min.js")
        case "fobo" :: "angular-material-mocks.js" :: Nil =>
          List("fobo",
               "angular-material",
               "1.0.8",
               "js",
               "angular-material-mocks.js")
        case "fobo" :: "angular-material.css" :: Nil if Props.devMode =>
          List("fobo",
               "angular-material",
               "1.0.8",
               "css",
               "angular-material.css")
        case "fobo" :: "angular-material.css" :: Nil =>
          List("fobo",
               "angular-material",
               "1.0.8",
               "css",
               "angular-material.min.css")
      }
    }

//    lazy val AJMaterial110 = {
//      ResourceServer.rewrite {
//        case "fobo" :: "angular-material.js" :: Nil if Props.devMode         => List("fobo", "angular-material", "1.1.0", "js", "angular-material.js")
//        case "fobo" :: "angular-material.js" :: Nil                          => List("fobo", "angular-material", "1.1.0", "js", "angular-material.min.js")
//        case "fobo" :: "angular-material-mocks.js" :: Nil                    => List("fobo", "angular-material", "1.1.0", "js", "angular-material-mocks.js")
//        case "fobo" :: "angular-material.css" :: Nil if Props.devMode        => List("fobo", "angular-material", "1.1.0", "css", "angular-material.css")
//        case "fobo" :: "angular-material.css" :: Nil                         => List("fobo", "angular-material", "1.1.0", "css", "angular-material.min.css")
//      }
//    }     

  }
}
