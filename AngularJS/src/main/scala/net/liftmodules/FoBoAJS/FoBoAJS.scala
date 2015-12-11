package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo - Sub-module== 
 * This package object is only of interest to you if you are using this module 
 * as a stand alone artifact dependency in your project (without FoBo).
 * This package object provides information on how to initiate and use this module 
 * in your project. If you are using this module in FoBo see [[net.liftmodules.FoBo]] 
 * for usage information. 
 */
package object FoBoAJS {

  def init() {
    LiftRules.addToPackages("net.liftmodules.FoBoAJS")
    ResourceServer.allow {
      case "fobo" :: tail => true
    }
  }

  abstract trait AJSToolkit

  /**
   *
   */
  object InitParam extends AJSToolkit {
    var ToolKit: AJSToolkit = null 
  }
 
  /**
   * Enable usage of AngularJS version 1&#8228;4&#8228;8 in your bootstrap liftweb Boot.
   * @version 1.4.8
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AngularJS148
   * }}}
   *
   */
  case object AngularJS148 extends AJSToolkit {
    AJSFoBoResources.angularjs148
  } 
  
    /**
   * Enable usage of AngularJS i18n files in your bootstrap liftweb Boot.
   * @version 1.4.8 i18n
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AngularJS148i18n
   * }}}
   *
   */
  case object AngularJS148i18n extends AJSToolkit {
    AJSFoBoResources.angularjs148i18n
    AJSFoBoResources.angularjs148i18n2
    AJSFoBoResources.angularjs148i18n3
    AJSFoBoResources.angularjs148i18n4
  } 
  
  
    /**
   * Enable usage of AngularJS version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
   * @version 1.4.1
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AngularJS141
   * }}}
   *
   */
  case object AngularJS141 extends AJSToolkit {
    AJSFoBoResources.angularjs141
  } 
  
    /**
   * Enable usage of AngularJS i18n files in your bootstrap liftweb Boot.
   * @version 1.4.1 i18n
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AngularJS141i18n
   * }}}
   *
   */
  case object AngularJS141i18n extends AJSToolkit {
    AJSFoBoResources.angularjs141i18n
    AJSFoBoResources.angularjs141i18n2
    AJSFoBoResources.angularjs141i18n3
    AJSFoBoResources.angularjs141i18n4
  } 
   
  /**
   * Enable usage of AngularJS version 1&#8228;3&#8228;15 in your bootstrap liftweb Boot.
   * @version 1.3.15
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AngularJS1315
   * }}}
   *
   */
  case object AngularJS1315 extends AJSToolkit {
    AJSFoBoResources.angularjs1315
  } 
  
   /**
   * Enable usage of AngularJS i18n files in your bootstrap liftweb Boot.
   * @version 1.3.15 i18n
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AngularJS1315i18n
   * }}}
   *
   */
  case object AngularJS1315i18n extends AJSToolkit {
    AJSFoBoResources.angularjs1315i18n
    AJSFoBoResources.angularjs1315i18n2
    AJSFoBoResources.angularjs1315i18n3
    AJSFoBoResources.angularjs1315i18n4
  }   
  
  
  /**
   * Enable usage of AngularJS version 1&#8228;2&#8228;19 in your bootstrap liftweb Boot.
   * @version 1.2.19
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AngularJS1219
   * }}}
   *
   */
  case object AngularJS1219 extends AJSToolkit {
    AJSFoBoResources.angularjs1219
  } 
  
   /**
   * Enable usage of AngularJS i18n files in your bootstrap liftweb Boot.
   * @version 1.2.19 i18n
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AngularJS1219i18n
   * }}}
   *
   */
  case object AngularJS1219i18n extends AJSToolkit {
    AJSFoBoResources.angularjs1219i18n
    AJSFoBoResources.angularjs1219i18n2
   
  } 
  
    /**
   * Enable usage of AngularJS version 1&#8228;2&#8228;11 in your bootstrap liftweb Boot.
   * @version 1.2.11
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AngularJS1211
   * }}}
   *
   */
  @deprecated("Use AngularJS1219 or later","1.3.0")
  case object AngularJS1211 extends AJSToolkit {
    AJSFoBoResources.angularjs1211
  } 
  
   /**
   * Enable usage of AngularJS i18n files in your bootstrap liftweb Boot.
   * @version 1.2.11 i18n
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AngularJS1211i18n
   * }}}
   *
   */
  @deprecated("Use AngularJS1219i18n or later","1.3.0")
  case object AngularJS1211i18n extends AJSToolkit {
    AJSFoBoResources.angularjs1211i18n
  } 
  
  
   /**
   * Enable usage of Angular Material version 0&#8228;10&#8228;0 in your bootstrap liftweb Boot.
   * @version 0.10.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AJMaterial0100
   * }}}
   *
   */
  @deprecated("Use AJMaterial100RC5 or later","1.5.0")
  case object AJMaterial0100 extends AJSToolkit {
    AJSFoBoResources.AJMaterial0100
  }
  

   /**
   * Enable usage of Angular Material version 1&#8228;0&#8228;0-rc5 in your bootstrap liftweb Boot.
   * @version 1.0.0-rc5
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AJMaterial100RC5
   * }}}
   *
   */
  case object AJMaterial100RC extends AJSToolkit {
    AJSFoBoResources.AJMaterial100RC
  }  
  
   /**
   * Enable usage of AngularUI-Bootstrap version 0&#8228;10&#8228;0 in your bootstrap liftweb Boot.
   * @version 0.10.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AJSUIBootstrap0100
   * }}}
   *
   */
  case object AJSUIBootstrap0100 extends AJSToolkit {
    AJSFoBoResources.uibootstrap0100
  }   
  
  /**
   * Enable usage of AngularUI-Bootstrap version 0&#8228;7&#8228;0 in your bootstrap liftweb Boot.
   * @version 0.7.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AJSUIBootstrap070
   * }}}
   *
   */
  case object AJSUIBootstrap070 extends AJSToolkit {
    AJSFoBoResources.uibootstrap070
  }   

  /**
   * Enable usage of AngularUI-Bootstrap version 0&#8228;2&#8228;0 in your bootstrap liftweb Boot.
   * @version 0.2.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AJSUIBootstrap020
   * }}}
   *
   */
  case object AJSUIBootstrap020 extends AJSToolkit {
    AJSFoBoResources.uibootstrap020
  }   
 
  /**
   * Enable usage of NG-Grid version 2&#8228;0&#8228;7 in your bootstrap liftweb Boot.
   * @version 2.0.7
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AJSNGGrid207
   * }}}
   *
   */
  case object AJSNGGrid207 extends AJSToolkit {
    AJSFoBoResources.nggrid207
  }   
  
  /**
   * Enable usage of NG-Grid version 2&#8228;0&#8228;4 in your bootstrap liftweb Boot.
   * @version 2.0.4
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AJSNGGrid204
   * }}}
   *
   */
  @deprecated("Use AJSNGGrid207 or later","1.2.0")
  case object AJSNGGrid204 extends AJSToolkit {
    AJSFoBoResources.nggrid204
  }   
  
  /**
   * Object holding internally used FoBo resources.
   */
  private object AJSFoBoResources {

    lazy val angularjs148 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.8", "js", "angular.js")
        case "fobo" :: "angular.js" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
        case "fobo" :: "angular.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular.min.js.map")

        case "fobo" :: "angular-animate.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.8", "js", "angular-animate.js")
        case "fobo" :: "angular-animate.js" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-animate.min.js")
        case "fobo" :: "angular-animate.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-animate.min.js.map")
        
        case "fobo" :: "angular-aria.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.8", "js", "angular-aria.js")
        case "fobo" :: "angular-aria.js" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-aria.min.js")
        case "fobo" :: "angular-aria.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-aria.min.js.map")        

        case "fobo" :: "angular-cookies.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.8", "js", "angular-cookies.js")
        case "fobo" :: "angular-cookies.js" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-cookies.min.js")
        case "fobo" :: "angular-cookies.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-cookies.min.js.map")

        case "fobo" :: "angular-loader.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.8", "js", "angular-loader.js")
        case "fobo" :: "angular-loader.js" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-loader.min.js")
        case "fobo" :: "angular-loader.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular.min-loader.js.map")

        case "fobo" :: "angular-message-format.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.8", "js", "angular-messages.js")
        case "fobo" :: "angular-message-format.js" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-messages.min.js")
        case "fobo" :: "angular-message-format.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular.min-messages.js.map")

        case "fobo" :: "angular-messages.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.8", "js", "angular-messages.js")
        case "fobo" :: "angular-messages.js" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-messages.min.js")
        case "fobo" :: "angular-messages.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular.min-messages.js.map")
        
        //dev/test only
        case "fobo" :: "angular-mocks.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.8", "js", "angular-mocks.js")

        case "fobo" :: "angular-resource.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.8", "js", "angular-resource.js")
        case "fobo" :: "angular-resource.js" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-resource.min.js")
        case "fobo" :: "angular-resource.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-resource.min.js.map")
 
        case "fobo" :: "angular-route.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.8", "js", "angular-route.js")
        case "fobo" :: "angular-route.js" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-route.min.js")
        case "fobo" :: "angular-route.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-route.min.js.map")
 
        case "fobo" :: "angular-sanitize.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.8", "js", "angular-sanitize.js")
        case "fobo" :: "angular-sanitize.js" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-sanitize.min.js")
        case "fobo" :: "angular-sanitize.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-sanitize.min.js.map")
        //dev/test only 
        case "fobo" :: "angular-scenario.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.8", "js", "angular-scenario.js")
 
        case "fobo" :: "angular-touch.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.8", "js", "angular-touch.js")
        case "fobo" :: "angular-touch.js" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-touch.min.js")
        case "fobo" :: "angular-touch.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.8", "js", "angular-touch.min.js.map")
        
        
        //CSS files
        case "fobo" :: "angular-csp.css" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.8", "css", "angular-csp.css")
        case "fobo" :: "angular-csp.css" :: Nil => List("fobo", "angular-js", "1.4.8", "css", "angular-csp.min.css")
       
      }
    }    
    
    lazy val angularjs148i18n = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_nl-cw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nl-cw.js")
        case "fobo" :: "angular-locale_se-fi.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_se-fi.js")
        case "fobo" :: "angular-locale_en-bz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-bz.js")
        case "fobo" :: "angular-locale_os-ru.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_os-ru.js")
        case "fobo" :: "angular-locale_lkt-us.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lkt-us.js")
        case "fobo" :: "angular-locale_en-pk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-pk.js")
        case "fobo" :: "angular-locale_he.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_he.js")
        case "fobo" :: "angular-locale_sr-latn-ba.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sr-latn-ba.js")
        case "fobo" :: "angular-locale_teo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_teo.js")
        case "fobo" :: "angular-locale_hy.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hy.js")
        case "fobo" :: "angular-locale_ms-latn-bn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ms-latn-bn.js")
        case "fobo" :: "angular-locale_az.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_az.js")
        case "fobo" :: "angular-locale_nd.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nd.js")
        case "fobo" :: "angular-locale_fr-rw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-rw.js")
        case "fobo" :: "angular-locale_so-so.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_so-so.js")
        case "fobo" :: "angular-locale_ckb-latn-iq.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ckb-latn-iq.js")
        case "fobo" :: "angular-locale_de-ch.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_de-ch.js")
        case "fobo" :: "angular-locale_ar-iq.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-iq.js")
        case "fobo" :: "angular-locale_yav-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_yav-cm.js")
        case "fobo" :: "angular-locale_tg-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tg-cyrl.js")
        case "fobo" :: "angular-locale_os-ge.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_os-ge.js")
        case "fobo" :: "angular-locale_hu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hu.js")
        case "fobo" :: "angular-locale_pt-mo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pt-mo.js")
        case "fobo" :: "angular-locale_ha-latn-gh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ha-latn-gh.js")
        case "fobo" :: "angular-locale_fr-cg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-cg.js")
        case "fobo" :: "angular-locale_mfe.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mfe.js")
        case "fobo" :: "angular-locale_en-ca.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ca.js")
        case "fobo" :: "angular-locale_st-ls.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_st-ls.js")
        case "fobo" :: "angular-locale_kw-gb.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kw-gb.js")
        case "fobo" :: "angular-locale_ss.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ss.js")
        case "fobo" :: "angular-locale_zgh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zgh.js")
        case "fobo" :: "angular-locale_fr-dz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-dz.js")
        case "fobo" :: "angular-locale_fr-bl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-bl.js")
        case "fobo" :: "angular-locale_fa.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fa.js")
        case "fobo" :: "angular-locale_mk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mk.js")
        case "fobo" :: "angular-locale_mr-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mr-in.js")
        case "fobo" :: "angular-locale_sv-fi.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-fi.js")
        case "fobo" :: "angular-locale_it.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_it.js")
        case "fobo" :: "angular-locale_en-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-cm.js")
        case "fobo" :: "angular-locale_no-no.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_no-no.js")
        case "fobo" :: "angular-locale_ckb-ir.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ckb-ir.js")
        case "fobo" :: "angular-locale_en-to.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-to.js")
        case "fobo" :: "angular-locale_fr-cd.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-cd.js")
        case "fobo" :: "angular-locale_fr-sn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-sn.js")
        case "fobo" :: "angular-locale_cgg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_cgg.js")
        case "fobo" :: "angular-locale_ky.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ky.js")
        case "fobo" :: "angular-locale_chr-us.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_chr-us.js")
        case "fobo" :: "angular-locale_naq.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_naq.js")
        case "fobo" :: "angular-locale_ar.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar.js")
        case "fobo" :: "angular-locale_fr-pm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-pm.js")
        case "fobo" :: "angular-locale_qu-bo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_qu-bo.js")
        case "fobo" :: "angular-locale_gv-im.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gv-im.js")
        case "fobo" :: "angular-locale_is.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_is.js")
        case "fobo" :: "angular-locale_bg-bg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bg-bg.js")
        case "fobo" :: "angular-locale_fi.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fi.js")
        case "fobo" :: "angular-locale_bn-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bn-in.js")
        case "fobo" :: "angular-locale_agq.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_agq.js")
        case "fobo" :: "angular-locale_khq.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_khq.js")
        case "fobo" :: "angular-locale_bs-latn-ba.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bs-latn-ba.js")
        case "fobo" :: "angular-locale_en-sg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-sg.js")
        case "fobo" :: "angular-locale_zh-hant-tw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zh-hant-tw.js")
        case "fobo" :: "angular-locale_fr-ch.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-ch.js")
        case "fobo" :: "angular-locale_zgh-ma.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zgh-ma.js")
        case "fobo" :: "angular-locale_ms-latn-my.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ms-latn-my.js")
        case "fobo" :: "angular-locale_fr-ma.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-ma.js")
        case "fobo" :: "angular-locale_en-fm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-fm.js")
        case "fobo" :: "angular-locale_mgh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mgh.js")
        case "fobo" :: "angular-locale_jgo-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_jgo-cm.js")
        case "fobo" :: "angular-locale_en-zm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-zm.js")
        case "fobo" :: "angular-locale_zh-tw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zh-tw.js")
        case "fobo" :: "angular-locale_ki-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ki-ke.js")
        case "fobo" :: "angular-locale_vai.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vai.js")
        case "fobo" :: "angular-locale_fr-ml.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-ml.js")
        case "fobo" :: "angular-locale_lu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lu.js")
        case "fobo" :: "angular-locale_en-gu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-gu.js")
        case "fobo" :: "angular-locale_sw-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sw-ke.js")
        case "fobo" :: "angular-locale_asa.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_asa.js")
        case "fobo" :: "angular-locale_pt.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pt.js")
        case "fobo" :: "angular-locale_nd-zw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nd-zw.js")
        case "fobo" :: "angular-locale_uz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_uz.js")
        case "fobo" :: "angular-locale_shi.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_shi.js")
        case "fobo" :: "angular-locale_sk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sk.js")
        case "fobo" :: "angular-locale_gu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gu.js")
        case "fobo" :: "angular-locale_pa-guru-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pa-guru-in.js")
        case "fobo" :: "angular-locale_lb.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lb.js")
        case "fobo" :: "angular-locale_ps-af.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ps-af.js")
        case "fobo" :: "angular-locale_ar-dz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-dz.js")
        case "fobo" :: "angular-locale_ru-kz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ru-kz.js")
        case "fobo" :: "angular-locale_en-sl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-sl.js")
        case "fobo" :: "angular-locale_zh-hant-hk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zh-hant-hk.js")
        case "fobo" :: "angular-locale_ts-za.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ts-za.js")
        case "fobo" :: "angular-locale_sah-ru.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sah-ru.js")
        case "fobo" :: "angular-locale_rwk-tz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rwk-tz.js")
        case "fobo" :: "angular-locale_dyo-sn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dyo-sn.js")
        case "fobo" :: "angular-locale_et.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_et.js")
        case "fobo" :: "angular-locale_ss-sz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ss-sz.js")
        case "fobo" :: "angular-locale_nn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nn.js")
        case "fobo" :: "angular-locale_bem.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bem.js")
        case "fobo" :: "angular-locale_ssy-er.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ssy-er.js")
        case "fobo" :: "angular-locale_en-nu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-nu.js")
        case "fobo" :: "angular-locale_mt.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mt.js")
        case "fobo" :: "angular-locale_pt-mz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pt-mz.js")
        case "fobo" :: "angular-locale_nyn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nyn.js")
        case "fobo" :: "angular-locale_ksh-de.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ksh-de.js")
        case "fobo" :: "angular-locale_bez-tz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bez-tz.js")
        case "fobo" :: "angular-locale_es-gq.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-gq.js")
        case "fobo" :: "angular-locale_ii.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ii.js")
        case "fobo" :: "angular-locale_es-ve.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-ve.js")
        case "fobo" :: "angular-locale_ta-my.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ta-my.js")
        case "fobo" :: "angular-locale_bs.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bs.js")
        case "fobo" :: "angular-locale_zh-hant.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zh-hant.js")
        case "fobo" :: "angular-locale_bs-cyrl-ba.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bs-cyrl-ba.js")
        case "fobo" :: "angular-locale_el-gr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_el-gr.js")
        case "fobo" :: "angular-locale_it-it.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_it-it.js")
        case "fobo" :: "angular-locale_mgh-mz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mgh-mz.js")
        case "fobo" :: "angular-locale_es-do.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-do.js")
        case "fobo" :: "angular-locale_ff.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ff.js")
        case "fobo" :: "angular-locale_wal-et.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_wal-et.js")
        case "fobo" :: "angular-locale_hi-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hi-in.js")
        case "fobo" :: "angular-locale_cs-cz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_cs-cz.js")
        case "fobo" :: "angular-locale_ssy.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ssy.js")
        case "fobo" :: "angular-locale_hr-hr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hr-hr.js")
        case "fobo" :: "angular-locale_yo-ng.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_yo-ng.js")
        case "fobo" :: "angular-locale_en-za.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-za.js")
        case "fobo" :: "angular-locale_ln-ao.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ln-ao.js")
        case "fobo" :: "angular-locale_ms-latn-sg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ms-latn-sg.js")
        case "fobo" :: "angular-locale_el-cy.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_el-cy.js")
        case "fobo" :: "angular-locale_ur-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ur-in.js")
        case "fobo" :: "angular-locale_bn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bn.js")
        case "fobo" :: "angular-locale_zu-za.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zu-za.js")
        case "fobo" :: "angular-locale_ca.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ca.js")
        case "fobo" :: "angular-locale_sw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sw.js")
        case "fobo" :: "angular-locale_tzm-latn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tzm-latn.js")
        case "fobo" :: "angular-locale_fr-tn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-tn.js")
        case "fobo" :: "angular-locale_en-ai.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ai.js")
        case "fobo" :: "angular-locale_yi-001.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_yi-001.js")
        case "fobo" :: "angular-locale_en-ie.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ie.js")
        case "fobo" :: "angular-locale_es-hn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-hn.js")
        case "fobo" :: "angular-locale_es-cr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-cr.js")
        case "fobo" :: "angular-locale_ar-jo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-jo.js")
        case "fobo" :: "angular-locale_xh-za.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_xh-za.js")
        case "fobo" :: "angular-locale_sr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sr.js")
        case "fobo" :: "angular-locale_fr-lu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-lu.js")
        case "fobo" :: "angular-locale_en-um.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-um.js")
        case "fobo" :: "angular-locale_es-cu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-cu.js")
        case "fobo" :: "angular-locale_qu-ec.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_qu-ec.js")
        case "fobo" :: "angular-locale_ro-md.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ro-md.js")
        case "fobo" :: "angular-locale_to-to.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_to-to.js")
        case "fobo" :: "angular-locale_zh-hans-hk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zh-hans-hk.js")
        case "fobo" :: "angular-locale_fr-mg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-mg.js")
        case "fobo" :: "angular-locale_haw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_haw.js")
        case "fobo" :: "angular-locale_ro.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ro.js")
        case "fobo" :: "angular-locale_es-ar.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-ar.js")
        case "fobo" :: "angular-locale_fr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr.js")
        case "fobo" :: "angular-locale_it-sm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_it-sm.js")
        case "fobo" :: "angular-locale_uk-ua.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_uk-ua.js")
        case "fobo" :: "angular-locale_aa-er.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_aa-er.js")
        case "fobo" :: "angular-locale_ha-latn-ne.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ha-latn-ne.js")
        case "fobo" :: "angular-locale_pt-st.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pt-st.js")
        case "fobo" :: "angular-locale_en-ki.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ki.js")
        case "fobo" :: "angular-locale_rof.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rof.js")
        case "fobo" :: "angular-locale_kn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kn.js")
        case "fobo" :: "angular-locale_sr-latn-me.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sr-latn-me.js")
        case "fobo" :: "angular-locale_kok.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kok.js")
        case "fobo" :: "angular-locale_en-pr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-pr.js")
        case "fobo" :: "angular-locale_ne-np.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ne-np.js")
        case "fobo" :: "angular-locale_lu-cd.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lu-cd.js")
        case "fobo" :: "angular-locale_sl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sl.js")
        case "fobo" :: "angular-locale_ckb-arab-ir.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ckb-arab-ir.js")
        case "fobo" :: "angular-locale_ug-arab-cn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ug-arab-cn.js")
        case "fobo" :: "angular-locale_mn-cyrl-mn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mn-cyrl-mn.js")
        case "fobo" :: "angular-locale_fr-dj.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-dj.js")
        case "fobo" :: "angular-locale_ks-arab.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ks-arab.js")
        case "fobo" :: "angular-locale_luo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_luo.js")
        case "fobo" :: "angular-locale_xh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_xh.js")
        case "fobo" :: "angular-locale_luo-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_luo-ke.js")
        case "fobo" :: "angular-locale_it-ch.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_it-ch.js")
        case "fobo" :: "angular-locale_mas.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mas.js")
        case "fobo" :: "angular-locale_ksf-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ksf-cm.js")
        case "fobo" :: "angular-locale_sq-xk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sq-xk.js")
        case "fobo" :: "angular-locale_en-gd.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-gd.js")
        case "fobo" :: "angular-locale_kea.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kea.js")
        case "fobo" :: "angular-locale_ve.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ve.js")
        case "fobo" :: "angular-locale_rof-tz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rof-tz.js")
        case "fobo" :: "angular-locale_en-sb.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-sb.js")
        case "fobo" :: "angular-locale_ne.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ne.js")
        case "fobo" :: "angular-locale_fr-km.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-km.js")
        case "fobo" :: "angular-locale_my.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_my.js")
        case "fobo" :: "angular-locale_sr-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sr-cyrl.js")
        case "fobo" :: "angular-locale_cy.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_cy.js")
        case "fobo" :: "angular-locale_gu-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gu-in.js")
        case "fobo" :: "angular-locale_es-mx.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-mx.js")
        case "fobo" :: "angular-locale_bn-bd.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bn-bd.js")
        case "fobo" :: "angular-locale_am-et.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_am-et.js")
        case "fobo" :: "angular-locale_mk-mk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mk-mk.js")
        case "fobo" :: "angular-locale_lag.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lag.js")
        case "fobo" :: "angular-locale_en-ms.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ms.js")
        case "fobo" :: "angular-locale_brx-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_brx-in.js")
        case "fobo" :: "angular-locale_sr-latn-rs.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sr-latn-rs.js")
        case "fobo" :: "angular-locale_sl-si.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sl-si.js")
        case "fobo" :: "angular-locale_mgo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mgo.js")
      }
    }
    
    lazy val angularjs148i18n2 = {
      ResourceServer.rewrite {    
        case "fobo" :: "angular-locale_ha-latn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ha-latn.js")
        case "fobo" :: "angular-locale_tg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tg.js")
        case "fobo" :: "angular-locale_am.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_am.js")
        case "fobo" :: "angular-locale_bo-cn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bo-cn.js")
        case "fobo" :: "angular-locale_en-mt.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-mt.js")
        case "fobo" :: "angular-locale_dua-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dua-cm.js")
        case "fobo" :: "angular-locale_sr-cyrl-xk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sr-cyrl-xk.js")
        case "fobo" :: "angular-locale_ar-ma.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-ma.js")
        case "fobo" :: "angular-locale_en-pn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-pn.js")
        case "fobo" :: "angular-locale_te.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_te.js")
        case "fobo" :: "angular-locale_ast-es.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ast-es.js")
        case "fobo" :: "angular-locale_pa-arab.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pa-arab.js")
        case "fobo" :: "angular-locale_zh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zh.js")
        case "fobo" :: "angular-locale_es-pr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-pr.js")
        case "fobo" :: "angular-locale_nb-sj.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nb-sj.js")
        case "fobo" :: "angular-locale_ar-ye.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-ye.js")
        case "fobo" :: "angular-locale_fr-pf.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-pf.js")
        case "fobo" :: "angular-locale_saq-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_saq-ke.js")
        case "fobo" :: "angular-locale_de-be.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_de-be.js")
        case "fobo" :: "angular-locale_fr-wf.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-wf.js")
        case "fobo" :: "angular-locale_gd.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gd.js")
        case "fobo" :: "angular-locale_no.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_no.js")
        case "fobo" :: "angular-locale_el.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_el.js")
        case "fobo" :: "angular-locale_ca-ad.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ca-ad.js")
        case "fobo" :: "angular-locale_km.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_km.js")
        case "fobo" :: "angular-locale_en-tc.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-tc.js")
        case "fobo" :: "angular-locale_es-ni.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-ni.js")
        case "fobo" :: "angular-locale_so.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_so.js")
        case "fobo" :: "angular-locale_kkj.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kkj.js")
        case "fobo" :: "angular-locale_tr-cy.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tr-cy.js")
        case "fobo" :: "angular-locale_en-150.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-150.js")
        case "fobo" :: "angular-locale_kln.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kln.js")
        case "fobo" :: "angular-locale_qu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_qu.js")
        case "fobo" :: "angular-locale_lo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lo.js")
        case "fobo" :: "angular-locale_os.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_os.js")
        case "fobo" :: "angular-locale_zh-hans-mo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zh-hans-mo.js")
        case "fobo" :: "angular-locale_ses-ml.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ses-ml.js")
        case "fobo" :: "angular-locale_fr-sy.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-sy.js")
        case "fobo" :: "angular-locale_fr-td.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-td.js")
        case "fobo" :: "angular-locale_mt-mt.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mt-mt.js")
        case "fobo" :: "angular-locale_en-us.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-us.js")
        case "fobo" :: "angular-locale_zh-hans-sg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zh-hans-sg.js")
        case "fobo" :: "angular-locale_az-latn-az.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_az-latn-az.js")
        case "fobo" :: "angular-locale_uz-latn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_uz-latn.js")
        case "fobo" :: "angular-locale_dsb.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dsb.js")
        case "fobo" :: "angular-locale_bez.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bez.js")
        case "fobo" :: "angular-locale_fr-vu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-vu.js")
        case "fobo" :: "angular-locale_fr-be.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-be.js")
        case "fobo" :: "angular-locale_hr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hr.js")
        case "fobo" :: "angular-locale_agq-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_agq-cm.js")
        case "fobo" :: "angular-locale_smn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_smn.js")
        case "fobo" :: "angular-locale_kl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kl.js")
        case "fobo" :: "angular-locale_ak.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ak.js")
        case "fobo" :: "angular-locale_nr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nr.js")
        case "fobo" :: "angular-locale_en-sd.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-sd.js")
        case "fobo" :: "angular-locale_fr-ht.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-ht.js")
        case "fobo" :: "angular-locale_fr-gn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-gn.js")
        case "fobo" :: "angular-locale_st-za.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_st-za.js")
        case "fobo" :: "angular-locale_es-ec.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-ec.js")
        case "fobo" :: "angular-locale_mas-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mas-ke.js")
        case "fobo" :: "angular-locale_seh-mz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_seh-mz.js")
        case "fobo" :: "angular-locale_ta-lk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ta-lk.js")
        case "fobo" :: "angular-locale_bo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bo.js")
        case "fobo" :: "angular-locale_ewo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ewo.js")
        case "fobo" :: "angular-locale_en-nr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-nr.js")
        case "fobo" :: "angular-locale_en-au.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-au.js")
        case "fobo" :: "angular-locale_shi-tfng-ma.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_shi-tfng-ma.js")
        case "fobo" :: "angular-locale_guz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_guz.js")
        case "fobo" :: "angular-locale_id-id.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_id-id.js")
        case "fobo" :: "angular-locale_en-ws.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ws.js")
        case "fobo" :: "angular-locale_tn-bw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tn-bw.js")
        case "fobo" :: "angular-locale_sw-tz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sw-tz.js")
        case "fobo" :: "angular-locale_kab.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kab.js")
        case "fobo" :: "angular-locale_az-cyrl-az.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_az-cyrl-az.js")
        case "fobo" :: "angular-locale_de-de.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_de-de.js")
        case "fobo" :: "angular-locale_en-pg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-pg.js")
        case "fobo" :: "angular-locale_sr-cyrl-me.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sr-cyrl-me.js")
        case "fobo" :: "angular-locale_ar-km.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-km.js")
        case "fobo" :: "angular-locale_ar-lb.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-lb.js")
        case "fobo" :: "angular-locale_wae-ch.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_wae-ch.js")
        case "fobo" :: "angular-locale_luy-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_luy-ke.js")
        case "fobo" :: "angular-locale_be-by.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_be-by.js")
        case "fobo" :: "angular-locale_ar-tn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-tn.js")
        case "fobo" :: "angular-locale_en-gi.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-gi.js")
        case "fobo" :: "angular-locale_te-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_te-in.js")
        case "fobo" :: "angular-locale_en-my.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-my.js")
        case "fobo" :: "angular-locale_en-ag.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ag.js")
        case "fobo" :: "angular-locale_ta-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ta-in.js")
        case "fobo" :: "angular-locale_es-cl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-cl.js")
        case "fobo" :: "angular-locale_shi-latn-ma.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_shi-latn-ma.js")
        case "fobo" :: "angular-locale_hu-hu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hu-hu.js")
        case "fobo" :: "angular-locale_ln-cg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ln-cg.js")
        case "fobo" :: "angular-locale_tzm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tzm.js")
        case "fobo" :: "angular-locale_aa-et.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_aa-et.js")
        case "fobo" :: "angular-locale_ff-gn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ff-gn.js")
        case "fobo" :: "angular-locale_fr-ca.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-ca.js")
        case "fobo" :: "angular-locale_he-il.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_he-il.js")
        case "fobo" :: "angular-locale_vo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vo.js")
        case "fobo" :: "angular-locale_es-gt.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-gt.js")
        case "fobo" :: "angular-locale_rw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rw.js")
        case "fobo" :: "angular-locale_uz-arab-af.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_uz-arab-af.js")
        case "fobo" :: "angular-locale_id.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_id.js")
        case "fobo" :: "angular-locale_en-gy.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-gy.js")
        case "fobo" :: "angular-locale_ko-kr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ko-kr.js")
        case "fobo" :: "angular-locale_smn-fi.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_smn-fi.js")
        case "fobo" :: "angular-locale_lkt.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lkt.js")
        case "fobo" :: "angular-locale_hy-am.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hy-am.js")
        case "fobo" :: "angular-locale_ksb.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ksb.js")
        case "fobo" :: "angular-locale_pt-tl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pt-tl.js")
        case "fobo" :: "angular-locale_ar-ly.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-ly.js")
        case "fobo" :: "angular-locale_ur-pk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ur-pk.js")
        case "fobo" :: "angular-locale_dsb-de.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dsb-de.js")
        case "fobo" :: "angular-locale_en-mo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-mo.js")
        case "fobo" :: "angular-locale_nl-sr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nl-sr.js")
        case "fobo" :: "angular-locale_fy-nl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fy-nl.js")
        case "fobo" :: "angular-locale_yo-bj.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_yo-bj.js")
        case "fobo" :: "angular-locale_xog-ug.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_xog-ug.js")
        case "fobo" :: "angular-locale_ar-sa.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-sa.js")
        case "fobo" :: "angular-locale_dje.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dje.js")
        case "fobo" :: "angular-locale_fr-sc.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-sc.js")
        case "fobo" :: "angular-locale_en-mp.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-mp.js")
        case "fobo" :: "angular-locale_es-pe.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-pe.js")
        case "fobo" :: "angular-locale_fr-re.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-re.js")
        case "fobo" :: "angular-locale_uk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_uk.js")
        case "fobo" :: "angular-locale_en-rw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-rw.js")
        case "fobo" :: "angular-locale_pt-ao.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pt-ao.js")
        case "fobo" :: "angular-locale_zh-hans-cn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zh-hans-cn.js")
        case "fobo" :: "angular-locale_yi.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_yi.js")
        case "fobo" :: "angular-locale_ug-arab.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ug-arab.js")
        case "fobo" :: "angular-locale_my-mm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_my-mm.js")
        case "fobo" :: "angular-locale_lt.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lt.js")
        case "fobo" :: "angular-locale_ta.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ta.js")
        case "fobo" :: "angular-locale_ki.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ki.js")
        case "fobo" :: "angular-locale_iw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_iw.js")
        case "fobo" :: "angular-locale_fr-gq.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-gq.js")
        case "fobo" :: "angular-locale_om.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_om.js")
        case "fobo" :: "angular-locale_ne-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ne-in.js")
        case "fobo" :: "angular-locale_rn-bi.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rn-bi.js")
        case "fobo" :: "angular-locale_ckb-arab.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ckb-arab.js")
        case "fobo" :: "angular-locale_nn-no.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nn-no.js")
        case "fobo" :: "angular-locale_en-mg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-mg.js")
        case "fobo" :: "angular-locale_ga.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ga.js")
        case "fobo" :: "angular-locale_es-us.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-us.js")
        case "fobo" :: "angular-locale_en-tv.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-tv.js")
        case "fobo" :: "angular-locale_mer-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mer-ke.js")
        case "fobo" :: "angular-locale_ss-za.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ss-za.js")
        case "fobo" :: "angular-locale_en-gb.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-gb.js")
        case "fobo" :: "angular-locale_en-mu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-mu.js")
        case "fobo" :: "angular-locale_lv.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lv.js")
        case "fobo" :: "angular-locale_fr-tg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-tg.js")
        case "fobo" :: "angular-locale_vun-tz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vun-tz.js")
        case "fobo" :: "angular-locale_gd-gb.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gd-gb.js")
        case "fobo" :: "angular-locale_st.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_st.js")
        case "fobo" :: "angular-locale_pl-pl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pl-pl.js")
        case "fobo" :: "angular-locale_bm-ml.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bm-ml.js")
        case "fobo" :: "angular-locale_ar-dj.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-dj.js")
        case "fobo" :: "angular-locale_en-be.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-be.js")
        case "fobo" :: "angular-locale_en-ls.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ls.js")
        case "fobo" :: "angular-locale_aa-dj.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_aa-dj.js")
        case "fobo" :: "angular-locale_haw-us.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_haw-us.js")
        case "fobo" :: "angular-locale_ta-sg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ta-sg.js")
        case "fobo" :: "angular-locale_sw-ug.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sw-ug.js")
        case "fobo" :: "angular-locale_gl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gl.js")
        case "fobo" :: "angular-locale_es-ic.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-ic.js")
        case "fobo" :: "angular-locale_en-pw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-pw.js")
        case "fobo" :: "angular-locale_nr-za.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nr-za.js")
        case "fobo" :: "angular-locale_ti.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ti.js")
        case "fobo" :: "angular-locale_en-bw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-bw.js")
        case "fobo" :: "angular-locale_az-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_az-cyrl.js")
        case "fobo" :: "angular-locale_gsw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gsw.js")
        case "fobo" :: "angular-locale_en-jm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-jm.js")
        case "fobo" :: "angular-locale_cgg-ug.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_cgg-ug.js")
        case "fobo" :: "angular-locale_rm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rm.js")
        case "fobo" :: "angular-locale_mr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mr.js")
        case "fobo" :: "angular-locale_th.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_th.js")
        case "fobo" :: "angular-locale_br.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_br.js")
        case "fobo" :: "angular-locale_en-im.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-im.js")
        case "fobo" :: "angular-locale_lg-ug.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lg-ug.js")
        case "fobo" :: "angular-locale_en-ug.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ug.js")
        case "fobo" :: "angular-locale_dz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dz.js")
        case "fobo" :: "angular-locale_vai-latn-lr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vai-latn-lr.js")
        case "fobo" :: "angular-locale_nb-no.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nb-no.js")
        case "fobo" :: "angular-locale_se.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_se.js")
        case "fobo" :: "angular-locale_ckb-arab-iq.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ckb-arab-iq.js")
        case "fobo" :: "angular-locale_asa-tz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_asa-tz.js")
        case "fobo" :: "angular-locale_ar-001.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-001.js")
        case "fobo" :: "angular-locale_brx.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_brx.js")
        case "fobo" :: "angular-locale_es-co.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-co.js")
        case "fobo" :: "angular-locale_ewo-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ewo-cm.js")
        case "fobo" :: "angular-locale_ln.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ln.js")
        case "fobo" :: "angular-locale_sk-sk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sk-sk.js")
        case "fobo" :: "angular-locale_vai-vaii-lr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vai-vaii-lr.js")
        case "fobo" :: "angular-locale_ug.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ug.js")
        case "fobo" :: "angular-locale_af.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_af.js")
        case "fobo" :: "angular-locale_de-li.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_de-li.js")
        case "fobo" :: "angular-locale_kw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kw.js")
        case "fobo" :: "angular-locale_so-et.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_so-et.js")
        case "fobo" :: "angular-locale_ti-et.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ti-et.js")
        case "fobo" :: "angular-locale_nyn-ug.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nyn-ug.js")
        case "fobo" :: "angular-locale_gsw-ch.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gsw-ch.js")
        case "fobo" :: "angular-locale_ckb-latn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ckb-latn.js")
      }
    }
    
    lazy val angularjs148i18n3 = {
      ResourceServer.rewrite {   
        case "fobo" :: "angular-locale_nl-sx.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nl-sx.js")
        case "fobo" :: "angular-locale_da.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_da.js")
        case "fobo" :: "angular-locale_sq-al.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sq-al.js")
        case "fobo" :: "angular-locale_zh-cn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zh-cn.js")
        case "fobo" :: "angular-locale_en-ph.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ph.js")
        case "fobo" :: "angular-locale_ru-md.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ru-md.js")
        case "fobo" :: "angular-locale_tl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tl.js")
        case "fobo" :: "angular-locale_ks.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ks.js")
        case "fobo" :: "angular-locale_tzm-latn-ma.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tzm-latn-ma.js")
        case "fobo" :: "angular-locale_zu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zu.js")
        case "fobo" :: "angular-locale_et-ee.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_et-ee.js")
        case "fobo" :: "angular-locale_ar-ae.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-ae.js")
        case "fobo" :: "angular-locale_ha-latn-ng.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ha-latn-ng.js")
        case "fobo" :: "angular-locale_cy-gb.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_cy-gb.js")
        case "fobo" :: "angular-locale_en-as.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-as.js")
        case "fobo" :: "angular-locale_byn-er.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_byn-er.js")
        case "fobo" :: "angular-locale_sn-zw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sn-zw.js")
        case "fobo" :: "angular-locale_en-nf.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-nf.js")
        case "fobo" :: "angular-locale_eo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_eo.js")
        case "fobo" :: "angular-locale_nl-bq.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nl-bq.js")
        case "fobo" :: "angular-locale_ee-tg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ee-tg.js")
        case "fobo" :: "angular-locale_pa-arab-pk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pa-arab-pk.js")
        case "fobo" :: "angular-locale_gsw-li.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gsw-li.js")
        case "fobo" :: "angular-locale_en-io.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-io.js")
        case "fobo" :: "angular-locale_se-se.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_se-se.js")
        case "fobo" :: "angular-locale_tr-tr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tr-tr.js")
        case "fobo" :: "angular-locale_fr-mc.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-mc.js")
        case "fobo" :: "angular-locale_wae.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_wae.js")
        case "fobo" :: "angular-locale_mua-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mua-cm.js")
        case "fobo" :: "angular-locale_ru-kg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ru-kg.js")
        case "fobo" :: "angular-locale_uz-cyrl-uz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_uz-cyrl-uz.js")
        case "fobo" :: "angular-locale_en-vc.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-vc.js")
        case "fobo" :: "angular-locale_es-ph.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-ph.js")
        case "fobo" :: "angular-locale_mfe-mu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mfe-mu.js")
        case "fobo" :: "angular-locale_tn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tn.js")
        case "fobo" :: "angular-locale_sg-cf.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sg-cf.js")
        case "fobo" :: "angular-locale_swc.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_swc.js")
        case "fobo" :: "angular-locale_fa-af.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fa-af.js")
        case "fobo" :: "angular-locale_ca-fr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ca-fr.js")
        case "fobo" :: "angular-locale_pl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pl.js")
        case "fobo" :: "angular-locale_en-zw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-zw.js")
        case "fobo" :: "angular-locale_ff-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ff-cm.js")
        case "fobo" :: "angular-locale_fil.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fil.js")
        case "fobo" :: "angular-locale_is-is.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_is-is.js")
        case "fobo" :: "angular-locale_es-pa.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-pa.js")
        case "fobo" :: "angular-locale_sv.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv.js")
        case "fobo" :: "angular-locale_nso-za.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nso-za.js")
        case "fobo" :: "angular-locale_fr-yt.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-yt.js")
        case "fobo" :: "angular-locale_lb-lu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lb-lu.js")
        case "fobo" :: "angular-locale_de.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_de.js")
        case "fobo" :: "angular-locale_ln-cf.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ln-cf.js")
        case "fobo" :: "angular-locale_th-th.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_th-th.js")
        case "fobo" :: "angular-locale_en-bb.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-bb.js")
        case "fobo" :: "angular-locale_teo-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_teo-ke.js")
        case "fobo" :: "angular-locale_es.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es.js")
        case "fobo" :: "angular-locale_dz-bt.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dz-bt.js")
        case "fobo" :: "angular-locale_nso.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nso.js")
        case "fobo" :: "angular-locale_lo-la.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lo-la.js")
        case "fobo" :: "angular-locale_ti-er.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ti-er.js")
        case "fobo" :: "angular-locale_ff-mr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ff-mr.js")
        case "fobo" :: "angular-locale_om-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_om-ke.js")
        case "fobo" :: "angular-locale_luy.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_luy.js")
        case "fobo" :: "angular-locale_naq-na.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_naq-na.js")
        case "fobo" :: "angular-locale_en-sx.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-sx.js")
        case "fobo" :: "angular-locale_nl-be.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nl-be.js")
        case "fobo" :: "angular-locale_si-lk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_si-lk.js")
        case "fobo" :: "angular-locale_kn-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kn-in.js")
        case "fobo" :: "angular-locale_mua.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mua.js")
        case "fobo" :: "angular-locale_kab-dz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kab-dz.js")
        case "fobo" :: "angular-locale_lv-lv.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lv-lv.js")
        case "fobo" :: "angular-locale_en-mh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-mh.js")
        case "fobo" :: "angular-locale_en-cc.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-cc.js")
        case "fobo" :: "angular-locale_jmc-tz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_jmc-tz.js")
        case "fobo" :: "angular-locale_dav.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dav.js")
        case "fobo" :: "angular-locale_sg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sg.js")
        case "fobo" :: "angular-locale_eu-es.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_eu-es.js")
        case "fobo" :: "angular-locale_ar-eg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-eg.js")
        case "fobo" :: "angular-locale_es-sv.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-sv.js")
        case "fobo" :: "angular-locale_ca-es.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ca-es.js")
        case "fobo" :: "angular-locale_bm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bm.js")
        case "fobo" :: "angular-locale_ckb.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ckb.js")
        case "fobo" :: "angular-locale_es-ea.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-ea.js")
        case "fobo" :: "angular-locale_sr-latn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sr-latn.js")
        case "fobo" :: "angular-locale_tig.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tig.js")
        case "fobo" :: "angular-locale_fr-gf.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-gf.js")
        case "fobo" :: "angular-locale_ps.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ps.js")
        case "fobo" :: "angular-locale_en-dg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-dg.js")
        case "fobo" :: "angular-locale_ar-ss.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-ss.js")
        case "fobo" :: "angular-locale_fr-mr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-mr.js")
        case "fobo" :: "angular-locale_kk-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kk-cyrl.js")
        case "fobo" :: "angular-locale_ksb-tz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ksb-tz.js")
        case "fobo" :: "angular-locale_ff-sn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ff-sn.js")
        case "fobo" :: "angular-locale_hr-ba.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hr-ba.js")
        case "fobo" :: "angular-locale_gl-es.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gl-es.js")
        case "fobo" :: "angular-locale_bo-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bo-in.js")
        case "fobo" :: "angular-locale_vai-latn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vai-latn.js")
        case "fobo" :: "angular-locale_sq.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sq.js")
        case "fobo" :: "angular-locale_fr-gp.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-gp.js")
        case "fobo" :: "angular-locale_ar-mr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-mr.js")
        case "fobo" :: "angular-locale_sr-cyrl-rs.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sr-cyrl-rs.js")
        case "fobo" :: "angular-locale_ve-za.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ve-za.js")
        case "fobo" :: "angular-locale_or-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_or-in.js")
        case "fobo" :: "angular-locale_ru.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ru.js")
        case "fobo" :: "angular-locale_en-gm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-gm.js")
        case "fobo" :: "angular-locale_sq-mk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sq-mk.js")
        case "fobo" :: "angular-locale_hi.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hi.js")
        case "fobo" :: "angular-locale_saq.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_saq.js")
        case "fobo" :: "angular-locale_en-bm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-bm.js")
        case "fobo" :: "angular-locale_mg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mg.js")
        case "fobo" :: "angular-locale_de-lu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_de-lu.js")
        case "fobo" :: "angular-locale_es-es.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-es.js")
        case "fobo" :: "angular-locale_shi-latn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_shi-latn.js")
        case "fobo" :: "angular-locale_bs-latn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bs-latn.js")
        case "fobo" :: "angular-locale_sah.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sah.js")
        case "fobo" :: "angular-locale_fy.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fy.js")
        case "fobo" :: "angular-locale_ksh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ksh.js")
        case "fobo" :: "angular-locale_bem-zm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bem-zm.js")
        case "fobo" :: "angular-locale_tr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tr.js")
        case "fobo" :: "angular-locale_swc-cd.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_swc-cd.js")
        case "fobo" :: "angular-locale_gv.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gv.js")
        case "fobo" :: "angular-locale_br-fr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_br-fr.js")
        case "fobo" :: "angular-locale_fr-bi.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-bi.js")
        case "fobo" :: "angular-locale_pt-gw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pt-gw.js")
        case "fobo" :: "angular-locale_af-na.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_af-na.js")
        case "fobo" :: "angular-locale_en-001.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-001.js")
        case "fobo" :: "angular-locale_sn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sn.js")
        case "fobo" :: "angular-locale_jgo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_jgo.js")
        case "fobo" :: "angular-locale_ur.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ur.js")
        case "fobo" :: "angular-locale_uz-arab.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_uz-arab.js")
        case "fobo" :: "angular-locale_en-vi.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-vi.js")
        case "fobo" :: "angular-locale_ks-arab-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ks-arab-in.js")
        case "fobo" :: "angular-locale_ee.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ee.js")
        case "fobo" :: "angular-locale_pt-br.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pt-br.js")
        case "fobo" :: "angular-locale_eo-001.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_eo-001.js")
        case "fobo" :: "angular-locale_da-dk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_da-dk.js")
        case "fobo" :: "angular-locale_pt-cv.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pt-cv.js")
        case "fobo" :: "angular-locale_nb.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nb.js")
        case "fobo" :: "angular-locale_ar-sd.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-sd.js")
        case "fobo" :: "angular-locale_pa.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pa.js")
        case "fobo" :: "angular-locale_fa-ir.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fa-ir.js")
        case "fobo" :: "angular-locale_nl-nl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nl-nl.js")
        case "fobo" :: "angular-locale_yo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_yo.js")
        case "fobo" :: "angular-locale_ts.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ts.js")
        case "fobo" :: "angular-locale_jmc.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_jmc.js")
        case "fobo" :: "angular-locale_en-sh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-sh.js")
        case "fobo" :: "angular-locale_rwk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rwk.js")
        case "fobo" :: "angular-locale_teo-ug.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_teo-ug.js")
        case "fobo" :: "angular-locale_kea-cv.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kea-cv.js")
        case "fobo" :: "angular-locale_nmg-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nmg-cm.js")
        case "fobo" :: "angular-locale_en-lr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-lr.js")
        case "fobo" :: "angular-locale_byn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_byn.js")
        case "fobo" :: "angular-locale_lg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lg.js")
        case "fobo" :: "angular-locale_ses.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ses.js")
        case "fobo" :: "angular-locale_fr-bj.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-bj.js")
        case "fobo" :: "angular-locale_fo-fo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fo-fo.js")
        case "fobo" :: "angular-locale_or.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_or.js")
        case "fobo" :: "angular-locale_nmg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nmg.js")
        case "fobo" :: "angular-locale_mgo-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mgo-cm.js")
        case "fobo" :: "angular-locale_ia.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ia.js")
        case "fobo" :: "angular-locale_so-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_so-ke.js")
        case "fobo" :: "angular-locale_nl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nl.js")
        case "fobo" :: "angular-locale_en-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ke.js")
        case "fobo" :: "angular-locale_en-hk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-hk.js")
        case "fobo" :: "angular-locale_ka-ge.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ka-ge.js")
        case "fobo" :: "angular-locale_sr-latn-xk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sr-latn-xk.js")
        case "fobo" :: "angular-locale_zh-hans.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zh-hans.js")
        case "fobo" :: "angular-locale_ig.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ig.js")
        case "fobo" :: "angular-locale_sv-se.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")
        case "fobo" :: "angular-locale_wal.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_wal.js")
        case "fobo" :: "angular-locale_qu-pe.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_qu-pe.js")
        case "fobo" :: "angular-locale_pa-guru.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pa-guru.js")
        case "fobo" :: "angular-locale_ru-ua.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ru-ua.js")
        case "fobo" :: "angular-locale_ar-sy.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-sy.js")
        case "fobo" :: "angular-locale_guz-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_guz-ke.js")
        case "fobo" :: "angular-locale_bm-latn-ml.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bm-latn-ml.js")
        case "fobo" :: "angular-locale_se-no.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_se-no.js")
        case "fobo" :: "angular-locale_fr-mq.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-mq.js")
        case "fobo" :: "angular-locale_ky-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ky-cyrl.js")
        case "fobo" :: "angular-locale_si.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_si.js")
        case "fobo" :: "angular-locale_ro-ro.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ro-ro.js")
        case "fobo" :: "angular-locale_ja-jp.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ja-jp.js")
        case "fobo" :: "angular-locale_fr-cf.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-cf.js")
        case "fobo" :: "angular-locale_ja.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ja.js")
        case "fobo" :: "angular-locale_ka.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ka.js")
        case "fobo" :: "angular-locale_ko.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ko.js")
        case "fobo" :: "angular-locale_fr-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-cm.js")
        case "fobo" :: "angular-locale_chr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_chr.js")
        case "fobo" :: "angular-locale_bs-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bs-cyrl.js")
        case "fobo" :: "angular-locale_en-ng.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ng.js")
        case "fobo" :: "angular-locale_eu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_eu.js")
        case "fobo" :: "angular-locale_ee-gh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ee-gh.js")
        case "fobo" :: "angular-locale_az-latn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_az-latn.js")
        case "fobo" :: "angular-locale_rm-ch.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rm-ch.js")
        case "fobo" :: "angular-locale_en-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-in.js")
        case "fobo" :: "angular-locale_sr-cyrl-ba.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sr-cyrl-ba.js")
        case "fobo" :: "angular-locale_as-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_as-in.js")
        case "fobo" :: "angular-locale_en-nz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-nz.js")
        case "fobo" :: "angular-locale_om-et.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_om-et.js")
        case "fobo" :: "angular-locale_as.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_as.js")
        case "fobo" :: "angular-locale_ky-cyrl-kg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ky-cyrl-kg.js")
        case "fobo" :: "angular-locale_ckb-iq.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ckb-iq.js")
      }
    }
    
    lazy val angularjs148i18n4 = {
      ResourceServer.rewrite {      
        case "fobo" :: "angular-locale_de-at.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_de-at.js")
        case "fobo" :: "angular-locale_ebu-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ebu-ke.js")
        case "fobo" :: "angular-locale_twq-ne.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_twq-ne.js")
        case "fobo" :: "angular-locale_hsb.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hsb.js")
        case "fobo" :: "angular-locale_sv-ax.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-ax.js")
        case "fobo" :: "angular-locale_kde-tz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kde-tz.js")
        case "fobo" :: "angular-locale_ebu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ebu.js")
        case "fobo" :: "angular-locale_en-gg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-gg.js")
        case "fobo" :: "angular-locale_cs.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_cs.js")
        case "fobo" :: "angular-locale_vi.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vi.js")
        case "fobo" :: "angular-locale_seh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_seh.js")
        case "fobo" :: "angular-locale_kk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kk.js")
        case "fobo" :: "angular-locale_en-bs.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-bs.js")
        case "fobo" :: "angular-locale_en-fk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-fk.js")
        case "fobo" :: "angular-locale_fr-fr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-fr.js")
        case "fobo" :: "angular-locale_shi-tfng.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_shi-tfng.js")
        case "fobo" :: "angular-locale_vo-001.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vo-001.js")
        case "fobo" :: "angular-locale_pt-pt.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_pt-pt.js")
        case "fobo" :: "angular-locale_ast.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ast.js")
        case "fobo" :: "angular-locale_vi-vn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vi-vn.js")
        case "fobo" :: "angular-locale_fo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fo.js")
        case "fobo" :: "angular-locale_ar-er.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-er.js")
        case "fobo" :: "angular-locale_ar-kw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-kw.js")
        case "fobo" :: "angular-locale_es-uy.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-uy.js")
        case "fobo" :: "angular-locale_rw-rw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rw-rw.js")
        case "fobo" :: "angular-locale_ar-so.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-so.js")
        case "fobo" :: "angular-locale_en-vu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-vu.js")
        case "fobo" :: "angular-locale_ksf.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ksf.js")
        case "fobo" :: "angular-locale_ar-eh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-eh.js")
        case "fobo" :: "angular-locale_fr-mu.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-mu.js")
        case "fobo" :: "angular-locale_bg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bg.js")
        case "fobo" :: "angular-locale_en-gh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-gh.js")
        case "fobo" :: "angular-locale_ru-by.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ru-by.js")
        case "fobo" :: "angular-locale_ig-ng.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ig-ng.js")
        case "fobo" :: "angular-locale_to.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_to.js")
        case "fobo" :: "angular-locale_nus-sd.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nus-sd.js")
        case "fobo" :: "angular-locale_kl-gl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kl-gl.js")
        case "fobo" :: "angular-locale_ms-latn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ms-latn.js")
        case "fobo" :: "angular-locale_nl-aw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nl-aw.js")
        case "fobo" :: "angular-locale_en-na.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-na.js")
        case "fobo" :: "angular-locale_kkj-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kkj-cm.js")
        case "fobo" :: "angular-locale_af-za.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_af-za.js")
        case "fobo" :: "angular-locale_kok-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kok-in.js")
        case "fobo" :: "angular-locale_so-dj.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_so-dj.js")
        case "fobo" :: "angular-locale_fur.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fur.js")
        case "fobo" :: "angular-locale_sbp.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sbp.js")
        case "fobo" :: "angular-locale_en-tz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-tz.js")
        case "fobo" :: "angular-locale_en-ss.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ss.js")
        case "fobo" :: "angular-locale_lt-lt.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lt-lt.js")
        case "fobo" :: "angular-locale_en-cx.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-cx.js")
        case "fobo" :: "angular-locale_zh-hk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zh-hk.js")
        case "fobo" :: "angular-locale_fi-fi.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fi-fi.js")
        case "fobo" :: "angular-locale_mer.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mer.js")
        case "fobo" :: "angular-locale_tig-er.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tig-er.js")
        case "fobo" :: "angular-locale_mas-tz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mas-tz.js")
        case "fobo" :: "angular-locale_en-dm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-dm.js")
        case "fobo" :: "angular-locale_en-kn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-kn.js")
        case "fobo" :: "angular-locale_ko-kp.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ko-kp.js")
        case "fobo" :: "angular-locale_en-iso.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-iso.js")
        case "fobo" :: "angular-locale_sbp-tz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sbp-tz.js")
        case "fobo" :: "angular-locale_ha.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ha.js")
        case "fobo" :: "angular-locale_kk-cyrl-kz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kk-cyrl-kz.js")
        case "fobo" :: "angular-locale_tg-cyrl-tj.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tg-cyrl-tj.js")
        case "fobo" :: "angular-locale_ga-ie.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ga-ie.js")
        case "fobo" :: "angular-locale_kln-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kln-ke.js")
        case "fobo" :: "angular-locale_ar-om.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-om.js")
        case "fobo" :: "angular-locale_bas.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bas.js")
        case "fobo" :: "angular-locale_bas-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bas-cm.js")
        case "fobo" :: "angular-locale_zh-hant-mo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_zh-hant-mo.js")
        case "fobo" :: "angular-locale_ln-cd.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ln-cd.js")
        case "fobo" :: "angular-locale_en-lc.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-lc.js")
        case "fobo" :: "angular-locale_en-sz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-sz.js")
        case "fobo" :: "angular-locale_hsb-de.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_hsb-de.js")
        case "fobo" :: "angular-locale_ii-cn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ii-cn.js")
        case "fobo" :: "angular-locale_en-tk.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-tk.js")
        case "fobo" :: "angular-locale_fr-ci.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-ci.js")
        case "fobo" :: "angular-locale_ms.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ms.js")
        case "fobo" :: "angular-locale_kde.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kde.js")
        case "fobo" :: "angular-locale_ar-td.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-td.js")
        case "fobo" :: "angular-locale_ca-es-valencia.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ca-es-valencia.js")
        case "fobo" :: "angular-locale_vai-vaii.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vai-vaii.js")
        case "fobo" :: "angular-locale_fr-mf.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-mf.js")
        case "fobo" :: "angular-locale_en-er.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-er.js")
        case "fobo" :: "angular-locale_fur-it.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fur-it.js")
        case "fobo" :: "angular-locale_mn-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mn-cyrl.js")
        case "fobo" :: "angular-locale_ar-ps.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-ps.js")
        case "fobo" :: "angular-locale_lag-tz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_lag-tz.js")
        case "fobo" :: "angular-locale_xog.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_xog.js")
        case "fobo" :: "angular-locale_khq-ml.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_khq-ml.js")
        case "fobo" :: "angular-locale_ar-bh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-bh.js")
        case "fobo" :: "angular-locale_yav.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_yav.js")
        case "fobo" :: "angular-locale_be.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_be.js")
        case "fobo" :: "angular-locale_en-je.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-je.js")
        case "fobo" :: "angular-locale_rn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_rn.js")
        case "fobo" :: "angular-locale_en-ck.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ck.js")
        case "fobo" :: "angular-locale_en-tt.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-tt.js")
        case "fobo" :: "angular-locale_dyo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dyo.js")
        case "fobo" :: "angular-locale_da-gl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_da-gl.js")
        case "fobo" :: "angular-locale_nnh-cm.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nnh-cm.js")
        case "fobo" :: "angular-locale_ml.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ml.js")
        case "fobo" :: "angular-locale_ru-ru.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ru-ru.js")
        case "fobo" :: "angular-locale_bm-latn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_bm-latn.js")
        case "fobo" :: "angular-locale_twq.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_twq.js")
        case "fobo" :: "angular-locale_kam.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kam.js")
        case "fobo" :: "angular-locale_dua.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dua.js")
        case "fobo" :: "angular-locale_uz-latn-uz.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_uz-latn-uz.js")
        case "fobo" :: "angular-locale_es-419.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-419.js")
        case "fobo" :: "angular-locale_en-sc.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-sc.js")
        case "fobo" :: "angular-locale_ar-il.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-il.js")
        case "fobo" :: "angular-locale_nus.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nus.js")
        case "fobo" :: "angular-locale_in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_in.js")
        case "fobo" :: "angular-locale_ml-in.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ml-in.js")
        case "fobo" :: "angular-locale_fr-nc.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-nc.js")
        case "fobo" :: "angular-locale_en-fj.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-fj.js")
        case "fobo" :: "angular-locale_en-ky.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-ky.js")
        case "fobo" :: "angular-locale_fr-bf.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-bf.js")
        case "fobo" :: "angular-locale_dav-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dav-ke.js")
        case "fobo" :: "angular-locale_uz-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_uz-cyrl.js")
        case "fobo" :: "angular-locale_ar-qa.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ar-qa.js")
        case "fobo" :: "angular-locale_en.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en.js")
        case "fobo" :: "angular-locale_km-kh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_km-kh.js")
        case "fobo" :: "angular-locale_aa.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_aa.js")
        case "fobo" :: "angular-locale_fil-ph.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fil-ph.js")
        case "fobo" :: "angular-locale_mn.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mn.js")
        case "fobo" :: "angular-locale_nnh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_nnh.js")
        case "fobo" :: "angular-locale_ca-it.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ca-it.js")
        case "fobo" :: "angular-locale_tn-za.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_tn-za.js")
        case "fobo" :: "angular-locale_en-mw.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-mw.js")
        case "fobo" :: "angular-locale_vun.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_vun.js")
        case "fobo" :: "angular-locale_kam-ke.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_kam-ke.js")
        case "fobo" :: "angular-locale_en-vg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_en-vg.js")
        case "fobo" :: "angular-locale_ak-gh.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ak-gh.js")
        case "fobo" :: "angular-locale_fr-ga.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-ga.js")
        case "fobo" :: "angular-locale_es-py.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-py.js")
        case "fobo" :: "angular-locale_dje-ne.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_dje-ne.js")
        case "fobo" :: "angular-locale_fr-ne.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_fr-ne.js")
        case "fobo" :: "angular-locale_mg-mg.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_mg-mg.js")
        case "fobo" :: "angular-locale_gsw-fr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_gsw-fr.js")
        case "fobo" :: "angular-locale_ia-fr.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_ia-fr.js")
        case "fobo" :: "angular-locale_es-bo.js" :: Nil => List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_es-bo.js")
      }
    }
    
   
    lazy val angularjs141 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.1", "js", "angular.js")
        case "fobo" :: "angular.js" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
        case "fobo" :: "angular.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular.min.js.map")

        case "fobo" :: "angular-animate.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.1", "js", "angular-animate.js")
        case "fobo" :: "angular-animate.js" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-animate.min.js")
        case "fobo" :: "angular-animate.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-animate.min.js.map")
        
        case "fobo" :: "angular-aria.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.1", "js", "angular-aria.js")
        case "fobo" :: "angular-aria.js" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-aria.min.js")
        case "fobo" :: "angular-aria.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-aria.min.js.map")        

        case "fobo" :: "angular-cookies.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.1", "js", "angular-cookies.js")
        case "fobo" :: "angular-cookies.js" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-cookies.min.js")
        case "fobo" :: "angular-cookies.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-cookies.min.js.map")

        case "fobo" :: "angular-loader.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.1", "js", "angular-loader.js")
        case "fobo" :: "angular-loader.js" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-loader.min.js")
        case "fobo" :: "angular-loader.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular.min-loader.js.map")

        case "fobo" :: "angular-message-format.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.1", "js", "angular-messages.js")
        case "fobo" :: "angular-message-format.js" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-messages.min.js")
        case "fobo" :: "angular-message-format.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular.min-messages.js.map")

        case "fobo" :: "angular-messages.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.1", "js", "angular-messages.js")
        case "fobo" :: "angular-messages.js" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-messages.min.js")
        case "fobo" :: "angular-messages.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular.min-messages.js.map")
        
        //dev/test only
        case "fobo" :: "angular-mocks.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.1", "js", "angular-mocks.js")

        case "fobo" :: "angular-resource.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.1", "js", "angular-resource.js")
        case "fobo" :: "angular-resource.js" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-resource.min.js")
        case "fobo" :: "angular-resource.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-resource.min.js.map")
 
        case "fobo" :: "angular-route.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.1", "js", "angular-route.js")
        case "fobo" :: "angular-route.js" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-route.min.js")
        case "fobo" :: "angular-route.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-route.min.js.map")
 
        case "fobo" :: "angular-sanitize.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.1", "js", "angular-sanitize.js")
        case "fobo" :: "angular-sanitize.js" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-sanitize.min.js")
        case "fobo" :: "angular-sanitize.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-sanitize.min.js.map")
        //dev/test only 
        case "fobo" :: "angular-scenario.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.1", "js", "angular-scenario.js")
 
        case "fobo" :: "angular-touch.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.1", "js", "angular-touch.js")
        case "fobo" :: "angular-touch.js" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-touch.min.js")
        case "fobo" :: "angular-touch.min.js.map" :: Nil => List("fobo", "angular-js", "1.4.1", "js", "angular-touch.min.js.map")
        
        
        //CSS files
        case "fobo" :: "angular-csp.css" :: Nil if Props.devMode => List("fobo", "angular-js", "1.4.1", "css", "angular-csp.css")
        case "fobo" :: "angular-csp.css" :: Nil => List("fobo", "angular-js", "1.4.1", "css", "angular-csp.min.css")
       
      }
    }    
    
    lazy val angularjs141i18n = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_nl-cw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nl-cw.js")
        case "fobo" :: "angular-locale_se-fi.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_se-fi.js")
        case "fobo" :: "angular-locale_en-bz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-bz.js")
        case "fobo" :: "angular-locale_os-ru.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_os-ru.js")
        case "fobo" :: "angular-locale_lkt-us.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lkt-us.js")
        case "fobo" :: "angular-locale_en-pk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-pk.js")
        case "fobo" :: "angular-locale_he.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_he.js")
        case "fobo" :: "angular-locale_sr-latn-ba.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sr-latn-ba.js")
        case "fobo" :: "angular-locale_teo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_teo.js")
        case "fobo" :: "angular-locale_hy.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hy.js")
        case "fobo" :: "angular-locale_ms-latn-bn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ms-latn-bn.js")
        case "fobo" :: "angular-locale_az.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_az.js")
        case "fobo" :: "angular-locale_nd.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nd.js")
        case "fobo" :: "angular-locale_fr-rw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-rw.js")
        case "fobo" :: "angular-locale_so-so.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_so-so.js")
        case "fobo" :: "angular-locale_ckb-latn-iq.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ckb-latn-iq.js")
        case "fobo" :: "angular-locale_de-ch.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_de-ch.js")
        case "fobo" :: "angular-locale_ar-iq.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-iq.js")
        case "fobo" :: "angular-locale_yav-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_yav-cm.js")
        case "fobo" :: "angular-locale_tg-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tg-cyrl.js")
        case "fobo" :: "angular-locale_os-ge.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_os-ge.js")
        case "fobo" :: "angular-locale_hu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hu.js")
        case "fobo" :: "angular-locale_pt-mo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pt-mo.js")
        case "fobo" :: "angular-locale_ha-latn-gh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ha-latn-gh.js")
        case "fobo" :: "angular-locale_fr-cg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-cg.js")
        case "fobo" :: "angular-locale_mfe.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mfe.js")
        case "fobo" :: "angular-locale_en-ca.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ca.js")
        case "fobo" :: "angular-locale_st-ls.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_st-ls.js")
        case "fobo" :: "angular-locale_kw-gb.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kw-gb.js")
        case "fobo" :: "angular-locale_ss.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ss.js")
        case "fobo" :: "angular-locale_zgh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zgh.js")
        case "fobo" :: "angular-locale_fr-dz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-dz.js")
        case "fobo" :: "angular-locale_fr-bl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-bl.js")
        case "fobo" :: "angular-locale_fa.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fa.js")
        case "fobo" :: "angular-locale_mk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mk.js")
        case "fobo" :: "angular-locale_mr-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mr-in.js")
        case "fobo" :: "angular-locale_sv-fi.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-fi.js")
        case "fobo" :: "angular-locale_it.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_it.js")
        case "fobo" :: "angular-locale_en-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-cm.js")
        case "fobo" :: "angular-locale_no-no.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_no-no.js")
        case "fobo" :: "angular-locale_ckb-ir.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ckb-ir.js")
        case "fobo" :: "angular-locale_en-to.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-to.js")
        case "fobo" :: "angular-locale_fr-cd.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-cd.js")
        case "fobo" :: "angular-locale_fr-sn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-sn.js")
        case "fobo" :: "angular-locale_cgg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_cgg.js")
        case "fobo" :: "angular-locale_ky.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ky.js")
        case "fobo" :: "angular-locale_chr-us.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_chr-us.js")
        case "fobo" :: "angular-locale_naq.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_naq.js")
        case "fobo" :: "angular-locale_ar.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar.js")
        case "fobo" :: "angular-locale_fr-pm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-pm.js")
        case "fobo" :: "angular-locale_qu-bo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_qu-bo.js")
        case "fobo" :: "angular-locale_gv-im.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gv-im.js")
        case "fobo" :: "angular-locale_is.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_is.js")
        case "fobo" :: "angular-locale_bg-bg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bg-bg.js")
        case "fobo" :: "angular-locale_fi.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fi.js")
        case "fobo" :: "angular-locale_bn-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bn-in.js")
        case "fobo" :: "angular-locale_agq.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_agq.js")
        case "fobo" :: "angular-locale_khq.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_khq.js")
        case "fobo" :: "angular-locale_bs-latn-ba.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bs-latn-ba.js")
        case "fobo" :: "angular-locale_en-sg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-sg.js")
        case "fobo" :: "angular-locale_zh-hant-tw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zh-hant-tw.js")
        case "fobo" :: "angular-locale_fr-ch.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-ch.js")
        case "fobo" :: "angular-locale_zgh-ma.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zgh-ma.js")
        case "fobo" :: "angular-locale_ms-latn-my.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ms-latn-my.js")
        case "fobo" :: "angular-locale_fr-ma.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-ma.js")
        case "fobo" :: "angular-locale_en-fm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-fm.js")
        case "fobo" :: "angular-locale_mgh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mgh.js")
        case "fobo" :: "angular-locale_jgo-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_jgo-cm.js")
        case "fobo" :: "angular-locale_en-zm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-zm.js")
        case "fobo" :: "angular-locale_zh-tw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zh-tw.js")
        case "fobo" :: "angular-locale_ki-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ki-ke.js")
        case "fobo" :: "angular-locale_vai.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vai.js")
        case "fobo" :: "angular-locale_fr-ml.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-ml.js")
        case "fobo" :: "angular-locale_lu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lu.js")
        case "fobo" :: "angular-locale_en-gu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-gu.js")
        case "fobo" :: "angular-locale_sw-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sw-ke.js")
        case "fobo" :: "angular-locale_asa.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_asa.js")
        case "fobo" :: "angular-locale_pt.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pt.js")
        case "fobo" :: "angular-locale_nd-zw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nd-zw.js")
        case "fobo" :: "angular-locale_uz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_uz.js")
        case "fobo" :: "angular-locale_shi.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_shi.js")
        case "fobo" :: "angular-locale_sk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sk.js")
        case "fobo" :: "angular-locale_gu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gu.js")
        case "fobo" :: "angular-locale_pa-guru-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pa-guru-in.js")
        case "fobo" :: "angular-locale_lb.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lb.js")
        case "fobo" :: "angular-locale_ps-af.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ps-af.js")
        case "fobo" :: "angular-locale_ar-dz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-dz.js")
        case "fobo" :: "angular-locale_ru-kz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ru-kz.js")
        case "fobo" :: "angular-locale_en-sl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-sl.js")
        case "fobo" :: "angular-locale_zh-hant-hk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zh-hant-hk.js")
        case "fobo" :: "angular-locale_ts-za.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ts-za.js")
        case "fobo" :: "angular-locale_sah-ru.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sah-ru.js")
        case "fobo" :: "angular-locale_rwk-tz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rwk-tz.js")
        case "fobo" :: "angular-locale_dyo-sn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dyo-sn.js")
        case "fobo" :: "angular-locale_et.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_et.js")
        case "fobo" :: "angular-locale_ss-sz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ss-sz.js")
        case "fobo" :: "angular-locale_nn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nn.js")
        case "fobo" :: "angular-locale_bem.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bem.js")
        case "fobo" :: "angular-locale_ssy-er.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ssy-er.js")
        case "fobo" :: "angular-locale_en-nu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-nu.js")
        case "fobo" :: "angular-locale_mt.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mt.js")
        case "fobo" :: "angular-locale_pt-mz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pt-mz.js")
        case "fobo" :: "angular-locale_nyn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nyn.js")
        case "fobo" :: "angular-locale_ksh-de.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ksh-de.js")
        case "fobo" :: "angular-locale_bez-tz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bez-tz.js")
        case "fobo" :: "angular-locale_es-gq.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-gq.js")
        case "fobo" :: "angular-locale_ii.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ii.js")
        case "fobo" :: "angular-locale_es-ve.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-ve.js")
        case "fobo" :: "angular-locale_ta-my.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ta-my.js")
        case "fobo" :: "angular-locale_bs.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bs.js")
        case "fobo" :: "angular-locale_zh-hant.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zh-hant.js")
        case "fobo" :: "angular-locale_bs-cyrl-ba.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bs-cyrl-ba.js")
        case "fobo" :: "angular-locale_el-gr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_el-gr.js")
        case "fobo" :: "angular-locale_it-it.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_it-it.js")
        case "fobo" :: "angular-locale_mgh-mz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mgh-mz.js")
        case "fobo" :: "angular-locale_es-do.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-do.js")
        case "fobo" :: "angular-locale_ff.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ff.js")
        case "fobo" :: "angular-locale_wal-et.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_wal-et.js")
        case "fobo" :: "angular-locale_hi-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hi-in.js")
        case "fobo" :: "angular-locale_cs-cz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_cs-cz.js")
        case "fobo" :: "angular-locale_ssy.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ssy.js")
        case "fobo" :: "angular-locale_hr-hr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hr-hr.js")
        case "fobo" :: "angular-locale_yo-ng.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_yo-ng.js")
        case "fobo" :: "angular-locale_en-za.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-za.js")
        case "fobo" :: "angular-locale_ln-ao.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ln-ao.js")
        case "fobo" :: "angular-locale_ms-latn-sg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ms-latn-sg.js")
        case "fobo" :: "angular-locale_el-cy.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_el-cy.js")
        case "fobo" :: "angular-locale_ur-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ur-in.js")
        case "fobo" :: "angular-locale_bn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bn.js")
        case "fobo" :: "angular-locale_zu-za.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zu-za.js")
        case "fobo" :: "angular-locale_ca.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ca.js")
        case "fobo" :: "angular-locale_sw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sw.js")
        case "fobo" :: "angular-locale_tzm-latn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tzm-latn.js")
        case "fobo" :: "angular-locale_fr-tn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-tn.js")
        case "fobo" :: "angular-locale_en-ai.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ai.js")
        case "fobo" :: "angular-locale_yi-001.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_yi-001.js")
        case "fobo" :: "angular-locale_en-ie.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ie.js")
        case "fobo" :: "angular-locale_es-hn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-hn.js")
        case "fobo" :: "angular-locale_es-cr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-cr.js")
        case "fobo" :: "angular-locale_ar-jo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-jo.js")
        case "fobo" :: "angular-locale_xh-za.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_xh-za.js")
        case "fobo" :: "angular-locale_sr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sr.js")
        case "fobo" :: "angular-locale_fr-lu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-lu.js")
        case "fobo" :: "angular-locale_en-um.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-um.js")
        case "fobo" :: "angular-locale_es-cu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-cu.js")
        case "fobo" :: "angular-locale_qu-ec.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_qu-ec.js")
        case "fobo" :: "angular-locale_ro-md.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ro-md.js")
        case "fobo" :: "angular-locale_to-to.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_to-to.js")
        case "fobo" :: "angular-locale_zh-hans-hk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zh-hans-hk.js")
        case "fobo" :: "angular-locale_fr-mg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-mg.js")
        case "fobo" :: "angular-locale_haw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_haw.js")
        case "fobo" :: "angular-locale_ro.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ro.js")
        case "fobo" :: "angular-locale_es-ar.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-ar.js")
        case "fobo" :: "angular-locale_fr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr.js")
        case "fobo" :: "angular-locale_it-sm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_it-sm.js")
        case "fobo" :: "angular-locale_uk-ua.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_uk-ua.js")
        case "fobo" :: "angular-locale_aa-er.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_aa-er.js")
        case "fobo" :: "angular-locale_ha-latn-ne.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ha-latn-ne.js")
        case "fobo" :: "angular-locale_pt-st.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pt-st.js")
        case "fobo" :: "angular-locale_en-ki.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ki.js")
        case "fobo" :: "angular-locale_rof.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rof.js")
        case "fobo" :: "angular-locale_kn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kn.js")
        case "fobo" :: "angular-locale_sr-latn-me.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sr-latn-me.js")
        case "fobo" :: "angular-locale_kok.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kok.js")
        case "fobo" :: "angular-locale_en-pr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-pr.js")
        case "fobo" :: "angular-locale_ne-np.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ne-np.js")
        case "fobo" :: "angular-locale_lu-cd.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lu-cd.js")
        case "fobo" :: "angular-locale_sl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sl.js")
        case "fobo" :: "angular-locale_ckb-arab-ir.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ckb-arab-ir.js")
        case "fobo" :: "angular-locale_ug-arab-cn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ug-arab-cn.js")
        case "fobo" :: "angular-locale_mn-cyrl-mn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mn-cyrl-mn.js")
        case "fobo" :: "angular-locale_fr-dj.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-dj.js")
        case "fobo" :: "angular-locale_ks-arab.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ks-arab.js")
        case "fobo" :: "angular-locale_luo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_luo.js")
        case "fobo" :: "angular-locale_xh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_xh.js")
        case "fobo" :: "angular-locale_luo-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_luo-ke.js")
        case "fobo" :: "angular-locale_it-ch.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_it-ch.js")
        case "fobo" :: "angular-locale_mas.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mas.js")
        case "fobo" :: "angular-locale_ksf-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ksf-cm.js")
        case "fobo" :: "angular-locale_sq-xk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sq-xk.js")
        case "fobo" :: "angular-locale_en-gd.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-gd.js")
        case "fobo" :: "angular-locale_kea.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kea.js")
        case "fobo" :: "angular-locale_ve.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ve.js")
        case "fobo" :: "angular-locale_rof-tz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rof-tz.js")
        case "fobo" :: "angular-locale_en-sb.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-sb.js")
        case "fobo" :: "angular-locale_ne.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ne.js")
        case "fobo" :: "angular-locale_fr-km.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-km.js")
        case "fobo" :: "angular-locale_my.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_my.js")
        case "fobo" :: "angular-locale_sr-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sr-cyrl.js")
        case "fobo" :: "angular-locale_cy.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_cy.js")
        case "fobo" :: "angular-locale_gu-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gu-in.js")
        case "fobo" :: "angular-locale_es-mx.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-mx.js")
        case "fobo" :: "angular-locale_bn-bd.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bn-bd.js")
        case "fobo" :: "angular-locale_am-et.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_am-et.js")
        case "fobo" :: "angular-locale_mk-mk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mk-mk.js")
        case "fobo" :: "angular-locale_lag.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lag.js")
        case "fobo" :: "angular-locale_en-ms.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ms.js")
        case "fobo" :: "angular-locale_brx-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_brx-in.js")
        case "fobo" :: "angular-locale_sr-latn-rs.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sr-latn-rs.js")
        case "fobo" :: "angular-locale_sl-si.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sl-si.js")
        case "fobo" :: "angular-locale_mgo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mgo.js")
      }
    }
    
    lazy val angularjs141i18n2 = {
      ResourceServer.rewrite {    
        case "fobo" :: "angular-locale_ha-latn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ha-latn.js")
        case "fobo" :: "angular-locale_tg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tg.js")
        case "fobo" :: "angular-locale_am.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_am.js")
        case "fobo" :: "angular-locale_bo-cn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bo-cn.js")
        case "fobo" :: "angular-locale_en-mt.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-mt.js")
        case "fobo" :: "angular-locale_dua-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dua-cm.js")
        case "fobo" :: "angular-locale_sr-cyrl-xk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sr-cyrl-xk.js")
        case "fobo" :: "angular-locale_ar-ma.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-ma.js")
        case "fobo" :: "angular-locale_en-pn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-pn.js")
        case "fobo" :: "angular-locale_te.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_te.js")
        case "fobo" :: "angular-locale_ast-es.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ast-es.js")
        case "fobo" :: "angular-locale_pa-arab.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pa-arab.js")
        case "fobo" :: "angular-locale_zh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zh.js")
        case "fobo" :: "angular-locale_es-pr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-pr.js")
        case "fobo" :: "angular-locale_nb-sj.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nb-sj.js")
        case "fobo" :: "angular-locale_ar-ye.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-ye.js")
        case "fobo" :: "angular-locale_fr-pf.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-pf.js")
        case "fobo" :: "angular-locale_saq-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_saq-ke.js")
        case "fobo" :: "angular-locale_de-be.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_de-be.js")
        case "fobo" :: "angular-locale_fr-wf.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-wf.js")
        case "fobo" :: "angular-locale_gd.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gd.js")
        case "fobo" :: "angular-locale_no.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_no.js")
        case "fobo" :: "angular-locale_el.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_el.js")
        case "fobo" :: "angular-locale_ca-ad.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ca-ad.js")
        case "fobo" :: "angular-locale_km.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_km.js")
        case "fobo" :: "angular-locale_en-tc.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-tc.js")
        case "fobo" :: "angular-locale_es-ni.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-ni.js")
        case "fobo" :: "angular-locale_so.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_so.js")
        case "fobo" :: "angular-locale_kkj.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kkj.js")
        case "fobo" :: "angular-locale_tr-cy.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tr-cy.js")
        case "fobo" :: "angular-locale_en-150.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-150.js")
        case "fobo" :: "angular-locale_kln.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kln.js")
        case "fobo" :: "angular-locale_qu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_qu.js")
        case "fobo" :: "angular-locale_lo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lo.js")
        case "fobo" :: "angular-locale_os.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_os.js")
        case "fobo" :: "angular-locale_zh-hans-mo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zh-hans-mo.js")
        case "fobo" :: "angular-locale_ses-ml.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ses-ml.js")
        case "fobo" :: "angular-locale_fr-sy.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-sy.js")
        case "fobo" :: "angular-locale_fr-td.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-td.js")
        case "fobo" :: "angular-locale_mt-mt.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mt-mt.js")
        case "fobo" :: "angular-locale_en-us.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-us.js")
        case "fobo" :: "angular-locale_zh-hans-sg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zh-hans-sg.js")
        case "fobo" :: "angular-locale_az-latn-az.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_az-latn-az.js")
        case "fobo" :: "angular-locale_uz-latn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_uz-latn.js")
        case "fobo" :: "angular-locale_dsb.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dsb.js")
        case "fobo" :: "angular-locale_bez.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bez.js")
        case "fobo" :: "angular-locale_fr-vu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-vu.js")
        case "fobo" :: "angular-locale_fr-be.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-be.js")
        case "fobo" :: "angular-locale_hr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hr.js")
        case "fobo" :: "angular-locale_agq-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_agq-cm.js")
        case "fobo" :: "angular-locale_smn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_smn.js")
        case "fobo" :: "angular-locale_kl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kl.js")
        case "fobo" :: "angular-locale_ak.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ak.js")
        case "fobo" :: "angular-locale_nr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nr.js")
        case "fobo" :: "angular-locale_en-sd.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-sd.js")
        case "fobo" :: "angular-locale_fr-ht.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-ht.js")
        case "fobo" :: "angular-locale_fr-gn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-gn.js")
        case "fobo" :: "angular-locale_st-za.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_st-za.js")
        case "fobo" :: "angular-locale_es-ec.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-ec.js")
        case "fobo" :: "angular-locale_mas-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mas-ke.js")
        case "fobo" :: "angular-locale_seh-mz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_seh-mz.js")
        case "fobo" :: "angular-locale_ta-lk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ta-lk.js")
        case "fobo" :: "angular-locale_bo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bo.js")
        case "fobo" :: "angular-locale_ewo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ewo.js")
        case "fobo" :: "angular-locale_en-nr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-nr.js")
        case "fobo" :: "angular-locale_en-au.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-au.js")
        case "fobo" :: "angular-locale_shi-tfng-ma.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_shi-tfng-ma.js")
        case "fobo" :: "angular-locale_guz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_guz.js")
        case "fobo" :: "angular-locale_id-id.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_id-id.js")
        case "fobo" :: "angular-locale_en-ws.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ws.js")
        case "fobo" :: "angular-locale_tn-bw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tn-bw.js")
        case "fobo" :: "angular-locale_sw-tz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sw-tz.js")
        case "fobo" :: "angular-locale_kab.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kab.js")
        case "fobo" :: "angular-locale_az-cyrl-az.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_az-cyrl-az.js")
        case "fobo" :: "angular-locale_de-de.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_de-de.js")
        case "fobo" :: "angular-locale_en-pg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-pg.js")
        case "fobo" :: "angular-locale_sr-cyrl-me.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sr-cyrl-me.js")
        case "fobo" :: "angular-locale_ar-km.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-km.js")
        case "fobo" :: "angular-locale_ar-lb.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-lb.js")
        case "fobo" :: "angular-locale_wae-ch.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_wae-ch.js")
        case "fobo" :: "angular-locale_luy-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_luy-ke.js")
        case "fobo" :: "angular-locale_be-by.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_be-by.js")
        case "fobo" :: "angular-locale_ar-tn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-tn.js")
        case "fobo" :: "angular-locale_en-gi.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-gi.js")
        case "fobo" :: "angular-locale_te-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_te-in.js")
        case "fobo" :: "angular-locale_en-my.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-my.js")
        case "fobo" :: "angular-locale_en-ag.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ag.js")
        case "fobo" :: "angular-locale_ta-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ta-in.js")
        case "fobo" :: "angular-locale_es-cl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-cl.js")
        case "fobo" :: "angular-locale_shi-latn-ma.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_shi-latn-ma.js")
        case "fobo" :: "angular-locale_hu-hu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hu-hu.js")
        case "fobo" :: "angular-locale_ln-cg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ln-cg.js")
        case "fobo" :: "angular-locale_tzm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tzm.js")
        case "fobo" :: "angular-locale_aa-et.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_aa-et.js")
        case "fobo" :: "angular-locale_ff-gn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ff-gn.js")
        case "fobo" :: "angular-locale_fr-ca.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-ca.js")
        case "fobo" :: "angular-locale_he-il.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_he-il.js")
        case "fobo" :: "angular-locale_vo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vo.js")
        case "fobo" :: "angular-locale_es-gt.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-gt.js")
        case "fobo" :: "angular-locale_rw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rw.js")
        case "fobo" :: "angular-locale_uz-arab-af.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_uz-arab-af.js")
        case "fobo" :: "angular-locale_id.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_id.js")
        case "fobo" :: "angular-locale_en-gy.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-gy.js")
        case "fobo" :: "angular-locale_ko-kr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ko-kr.js")
        case "fobo" :: "angular-locale_smn-fi.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_smn-fi.js")
        case "fobo" :: "angular-locale_lkt.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lkt.js")
        case "fobo" :: "angular-locale_hy-am.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hy-am.js")
        case "fobo" :: "angular-locale_ksb.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ksb.js")
        case "fobo" :: "angular-locale_pt-tl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pt-tl.js")
        case "fobo" :: "angular-locale_ar-ly.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-ly.js")
        case "fobo" :: "angular-locale_ur-pk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ur-pk.js")
        case "fobo" :: "angular-locale_dsb-de.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dsb-de.js")
        case "fobo" :: "angular-locale_en-mo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-mo.js")
        case "fobo" :: "angular-locale_nl-sr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nl-sr.js")
        case "fobo" :: "angular-locale_fy-nl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fy-nl.js")
        case "fobo" :: "angular-locale_yo-bj.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_yo-bj.js")
        case "fobo" :: "angular-locale_xog-ug.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_xog-ug.js")
        case "fobo" :: "angular-locale_ar-sa.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-sa.js")
        case "fobo" :: "angular-locale_dje.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dje.js")
        case "fobo" :: "angular-locale_fr-sc.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-sc.js")
        case "fobo" :: "angular-locale_en-mp.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-mp.js")
        case "fobo" :: "angular-locale_es-pe.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-pe.js")
        case "fobo" :: "angular-locale_fr-re.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-re.js")
        case "fobo" :: "angular-locale_uk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_uk.js")
        case "fobo" :: "angular-locale_en-rw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-rw.js")
        case "fobo" :: "angular-locale_pt-ao.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pt-ao.js")
        case "fobo" :: "angular-locale_zh-hans-cn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zh-hans-cn.js")
        case "fobo" :: "angular-locale_yi.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_yi.js")
        case "fobo" :: "angular-locale_ug-arab.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ug-arab.js")
        case "fobo" :: "angular-locale_my-mm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_my-mm.js")
        case "fobo" :: "angular-locale_lt.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lt.js")
        case "fobo" :: "angular-locale_ta.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ta.js")
        case "fobo" :: "angular-locale_ki.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ki.js")
        case "fobo" :: "angular-locale_iw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_iw.js")
        case "fobo" :: "angular-locale_fr-gq.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-gq.js")
        case "fobo" :: "angular-locale_om.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_om.js")
        case "fobo" :: "angular-locale_ne-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ne-in.js")
        case "fobo" :: "angular-locale_rn-bi.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rn-bi.js")
        case "fobo" :: "angular-locale_ckb-arab.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ckb-arab.js")
        case "fobo" :: "angular-locale_nn-no.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nn-no.js")
        case "fobo" :: "angular-locale_en-mg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-mg.js")
        case "fobo" :: "angular-locale_ga.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ga.js")
        case "fobo" :: "angular-locale_es-us.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-us.js")
        case "fobo" :: "angular-locale_en-tv.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-tv.js")
        case "fobo" :: "angular-locale_mer-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mer-ke.js")
        case "fobo" :: "angular-locale_ss-za.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ss-za.js")
        case "fobo" :: "angular-locale_en-gb.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-gb.js")
        case "fobo" :: "angular-locale_en-mu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-mu.js")
        case "fobo" :: "angular-locale_lv.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lv.js")
        case "fobo" :: "angular-locale_fr-tg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-tg.js")
        case "fobo" :: "angular-locale_vun-tz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vun-tz.js")
        case "fobo" :: "angular-locale_gd-gb.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gd-gb.js")
        case "fobo" :: "angular-locale_st.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_st.js")
        case "fobo" :: "angular-locale_pl-pl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pl-pl.js")
        case "fobo" :: "angular-locale_bm-ml.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bm-ml.js")
        case "fobo" :: "angular-locale_ar-dj.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-dj.js")
        case "fobo" :: "angular-locale_en-be.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-be.js")
        case "fobo" :: "angular-locale_en-ls.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ls.js")
        case "fobo" :: "angular-locale_aa-dj.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_aa-dj.js")
        case "fobo" :: "angular-locale_haw-us.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_haw-us.js")
        case "fobo" :: "angular-locale_ta-sg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ta-sg.js")
        case "fobo" :: "angular-locale_sw-ug.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sw-ug.js")
        case "fobo" :: "angular-locale_gl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gl.js")
        case "fobo" :: "angular-locale_es-ic.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-ic.js")
        case "fobo" :: "angular-locale_en-pw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-pw.js")
        case "fobo" :: "angular-locale_nr-za.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nr-za.js")
        case "fobo" :: "angular-locale_ti.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ti.js")
        case "fobo" :: "angular-locale_en-bw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-bw.js")
        case "fobo" :: "angular-locale_az-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_az-cyrl.js")
        case "fobo" :: "angular-locale_gsw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gsw.js")
        case "fobo" :: "angular-locale_en-jm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-jm.js")
        case "fobo" :: "angular-locale_cgg-ug.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_cgg-ug.js")
        case "fobo" :: "angular-locale_rm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rm.js")
        case "fobo" :: "angular-locale_mr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mr.js")
        case "fobo" :: "angular-locale_th.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_th.js")
        case "fobo" :: "angular-locale_br.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_br.js")
        case "fobo" :: "angular-locale_en-im.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-im.js")
        case "fobo" :: "angular-locale_lg-ug.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lg-ug.js")
        case "fobo" :: "angular-locale_en-ug.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ug.js")
        case "fobo" :: "angular-locale_dz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dz.js")
        case "fobo" :: "angular-locale_vai-latn-lr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vai-latn-lr.js")
        case "fobo" :: "angular-locale_nb-no.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nb-no.js")
        case "fobo" :: "angular-locale_se.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_se.js")
        case "fobo" :: "angular-locale_ckb-arab-iq.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ckb-arab-iq.js")
        case "fobo" :: "angular-locale_asa-tz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_asa-tz.js")
        case "fobo" :: "angular-locale_ar-001.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-001.js")
        case "fobo" :: "angular-locale_brx.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_brx.js")
        case "fobo" :: "angular-locale_es-co.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-co.js")
        case "fobo" :: "angular-locale_ewo-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ewo-cm.js")
        case "fobo" :: "angular-locale_ln.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ln.js")
        case "fobo" :: "angular-locale_sk-sk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sk-sk.js")
        case "fobo" :: "angular-locale_vai-vaii-lr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vai-vaii-lr.js")
        case "fobo" :: "angular-locale_ug.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ug.js")
        case "fobo" :: "angular-locale_af.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_af.js")
        case "fobo" :: "angular-locale_de-li.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_de-li.js")
        case "fobo" :: "angular-locale_kw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kw.js")
        case "fobo" :: "angular-locale_so-et.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_so-et.js")
        case "fobo" :: "angular-locale_ti-et.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ti-et.js")
        case "fobo" :: "angular-locale_nyn-ug.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nyn-ug.js")
        case "fobo" :: "angular-locale_gsw-ch.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gsw-ch.js")
        case "fobo" :: "angular-locale_ckb-latn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ckb-latn.js")
      }
    }
    
    lazy val angularjs141i18n3 = {
      ResourceServer.rewrite {   
        case "fobo" :: "angular-locale_nl-sx.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nl-sx.js")
        case "fobo" :: "angular-locale_da.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_da.js")
        case "fobo" :: "angular-locale_sq-al.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sq-al.js")
        case "fobo" :: "angular-locale_zh-cn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zh-cn.js")
        case "fobo" :: "angular-locale_en-ph.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ph.js")
        case "fobo" :: "angular-locale_ru-md.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ru-md.js")
        case "fobo" :: "angular-locale_tl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tl.js")
        case "fobo" :: "angular-locale_ks.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ks.js")
        case "fobo" :: "angular-locale_tzm-latn-ma.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tzm-latn-ma.js")
        case "fobo" :: "angular-locale_zu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zu.js")
        case "fobo" :: "angular-locale_et-ee.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_et-ee.js")
        case "fobo" :: "angular-locale_ar-ae.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-ae.js")
        case "fobo" :: "angular-locale_ha-latn-ng.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ha-latn-ng.js")
        case "fobo" :: "angular-locale_cy-gb.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_cy-gb.js")
        case "fobo" :: "angular-locale_en-as.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-as.js")
        case "fobo" :: "angular-locale_byn-er.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_byn-er.js")
        case "fobo" :: "angular-locale_sn-zw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sn-zw.js")
        case "fobo" :: "angular-locale_en-nf.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-nf.js")
        case "fobo" :: "angular-locale_eo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_eo.js")
        case "fobo" :: "angular-locale_nl-bq.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nl-bq.js")
        case "fobo" :: "angular-locale_ee-tg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ee-tg.js")
        case "fobo" :: "angular-locale_pa-arab-pk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pa-arab-pk.js")
        case "fobo" :: "angular-locale_gsw-li.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gsw-li.js")
        case "fobo" :: "angular-locale_en-io.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-io.js")
        case "fobo" :: "angular-locale_se-se.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_se-se.js")
        case "fobo" :: "angular-locale_tr-tr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tr-tr.js")
        case "fobo" :: "angular-locale_fr-mc.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-mc.js")
        case "fobo" :: "angular-locale_wae.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_wae.js")
        case "fobo" :: "angular-locale_mua-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mua-cm.js")
        case "fobo" :: "angular-locale_ru-kg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ru-kg.js")
        case "fobo" :: "angular-locale_uz-cyrl-uz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_uz-cyrl-uz.js")
        case "fobo" :: "angular-locale_en-vc.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-vc.js")
        case "fobo" :: "angular-locale_es-ph.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-ph.js")
        case "fobo" :: "angular-locale_mfe-mu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mfe-mu.js")
        case "fobo" :: "angular-locale_tn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tn.js")
        case "fobo" :: "angular-locale_sg-cf.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sg-cf.js")
        case "fobo" :: "angular-locale_swc.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_swc.js")
        case "fobo" :: "angular-locale_fa-af.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fa-af.js")
        case "fobo" :: "angular-locale_ca-fr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ca-fr.js")
        case "fobo" :: "angular-locale_pl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pl.js")
        case "fobo" :: "angular-locale_en-zw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-zw.js")
        case "fobo" :: "angular-locale_ff-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ff-cm.js")
        case "fobo" :: "angular-locale_fil.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fil.js")
        case "fobo" :: "angular-locale_is-is.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_is-is.js")
        case "fobo" :: "angular-locale_es-pa.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-pa.js")
        case "fobo" :: "angular-locale_sv.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv.js")
        case "fobo" :: "angular-locale_nso-za.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nso-za.js")
        case "fobo" :: "angular-locale_fr-yt.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-yt.js")
        case "fobo" :: "angular-locale_lb-lu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lb-lu.js")
        case "fobo" :: "angular-locale_de.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_de.js")
        case "fobo" :: "angular-locale_ln-cf.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ln-cf.js")
        case "fobo" :: "angular-locale_th-th.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_th-th.js")
        case "fobo" :: "angular-locale_en-bb.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-bb.js")
        case "fobo" :: "angular-locale_teo-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_teo-ke.js")
        case "fobo" :: "angular-locale_es.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es.js")
        case "fobo" :: "angular-locale_dz-bt.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dz-bt.js")
        case "fobo" :: "angular-locale_nso.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nso.js")
        case "fobo" :: "angular-locale_lo-la.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lo-la.js")
        case "fobo" :: "angular-locale_ti-er.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ti-er.js")
        case "fobo" :: "angular-locale_ff-mr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ff-mr.js")
        case "fobo" :: "angular-locale_om-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_om-ke.js")
        case "fobo" :: "angular-locale_luy.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_luy.js")
        case "fobo" :: "angular-locale_naq-na.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_naq-na.js")
        case "fobo" :: "angular-locale_en-sx.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-sx.js")
        case "fobo" :: "angular-locale_nl-be.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nl-be.js")
        case "fobo" :: "angular-locale_si-lk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_si-lk.js")
        case "fobo" :: "angular-locale_kn-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kn-in.js")
        case "fobo" :: "angular-locale_mua.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mua.js")
        case "fobo" :: "angular-locale_kab-dz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kab-dz.js")
        case "fobo" :: "angular-locale_lv-lv.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lv-lv.js")
        case "fobo" :: "angular-locale_en-mh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-mh.js")
        case "fobo" :: "angular-locale_en-cc.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-cc.js")
        case "fobo" :: "angular-locale_jmc-tz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_jmc-tz.js")
        case "fobo" :: "angular-locale_dav.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dav.js")
        case "fobo" :: "angular-locale_sg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sg.js")
        case "fobo" :: "angular-locale_eu-es.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_eu-es.js")
        case "fobo" :: "angular-locale_ar-eg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-eg.js")
        case "fobo" :: "angular-locale_es-sv.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-sv.js")
        case "fobo" :: "angular-locale_ca-es.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ca-es.js")
        case "fobo" :: "angular-locale_bm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bm.js")
        case "fobo" :: "angular-locale_ckb.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ckb.js")
        case "fobo" :: "angular-locale_es-ea.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-ea.js")
        case "fobo" :: "angular-locale_sr-latn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sr-latn.js")
        case "fobo" :: "angular-locale_tig.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tig.js")
        case "fobo" :: "angular-locale_fr-gf.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-gf.js")
        case "fobo" :: "angular-locale_ps.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ps.js")
        case "fobo" :: "angular-locale_en-dg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-dg.js")
        case "fobo" :: "angular-locale_ar-ss.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-ss.js")
        case "fobo" :: "angular-locale_fr-mr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-mr.js")
        case "fobo" :: "angular-locale_kk-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kk-cyrl.js")
        case "fobo" :: "angular-locale_ksb-tz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ksb-tz.js")
        case "fobo" :: "angular-locale_ff-sn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ff-sn.js")
        case "fobo" :: "angular-locale_hr-ba.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hr-ba.js")
        case "fobo" :: "angular-locale_gl-es.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gl-es.js")
        case "fobo" :: "angular-locale_bo-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bo-in.js")
        case "fobo" :: "angular-locale_vai-latn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vai-latn.js")
        case "fobo" :: "angular-locale_sq.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sq.js")
        case "fobo" :: "angular-locale_fr-gp.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-gp.js")
        case "fobo" :: "angular-locale_ar-mr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-mr.js")
        case "fobo" :: "angular-locale_sr-cyrl-rs.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sr-cyrl-rs.js")
        case "fobo" :: "angular-locale_ve-za.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ve-za.js")
        case "fobo" :: "angular-locale_or-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_or-in.js")
        case "fobo" :: "angular-locale_ru.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ru.js")
        case "fobo" :: "angular-locale_en-gm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-gm.js")
        case "fobo" :: "angular-locale_sq-mk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sq-mk.js")
        case "fobo" :: "angular-locale_hi.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hi.js")
        case "fobo" :: "angular-locale_saq.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_saq.js")
        case "fobo" :: "angular-locale_en-bm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-bm.js")
        case "fobo" :: "angular-locale_mg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mg.js")
        case "fobo" :: "angular-locale_de-lu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_de-lu.js")
        case "fobo" :: "angular-locale_es-es.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-es.js")
        case "fobo" :: "angular-locale_shi-latn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_shi-latn.js")
        case "fobo" :: "angular-locale_bs-latn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bs-latn.js")
        case "fobo" :: "angular-locale_sah.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sah.js")
        case "fobo" :: "angular-locale_fy.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fy.js")
        case "fobo" :: "angular-locale_ksh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ksh.js")
        case "fobo" :: "angular-locale_bem-zm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bem-zm.js")
        case "fobo" :: "angular-locale_tr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tr.js")
        case "fobo" :: "angular-locale_swc-cd.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_swc-cd.js")
        case "fobo" :: "angular-locale_gv.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gv.js")
        case "fobo" :: "angular-locale_br-fr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_br-fr.js")
        case "fobo" :: "angular-locale_fr-bi.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-bi.js")
        case "fobo" :: "angular-locale_pt-gw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pt-gw.js")
        case "fobo" :: "angular-locale_af-na.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_af-na.js")
        case "fobo" :: "angular-locale_en-001.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-001.js")
        case "fobo" :: "angular-locale_sn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sn.js")
        case "fobo" :: "angular-locale_jgo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_jgo.js")
        case "fobo" :: "angular-locale_ur.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ur.js")
        case "fobo" :: "angular-locale_uz-arab.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_uz-arab.js")
        case "fobo" :: "angular-locale_en-vi.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-vi.js")
        case "fobo" :: "angular-locale_ks-arab-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ks-arab-in.js")
        case "fobo" :: "angular-locale_ee.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ee.js")
        case "fobo" :: "angular-locale_pt-br.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pt-br.js")
        case "fobo" :: "angular-locale_eo-001.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_eo-001.js")
        case "fobo" :: "angular-locale_da-dk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_da-dk.js")
        case "fobo" :: "angular-locale_pt-cv.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pt-cv.js")
        case "fobo" :: "angular-locale_nb.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nb.js")
        case "fobo" :: "angular-locale_ar-sd.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-sd.js")
        case "fobo" :: "angular-locale_pa.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pa.js")
        case "fobo" :: "angular-locale_fa-ir.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fa-ir.js")
        case "fobo" :: "angular-locale_nl-nl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nl-nl.js")
        case "fobo" :: "angular-locale_yo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_yo.js")
        case "fobo" :: "angular-locale_ts.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ts.js")
        case "fobo" :: "angular-locale_jmc.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_jmc.js")
        case "fobo" :: "angular-locale_en-sh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-sh.js")
        case "fobo" :: "angular-locale_rwk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rwk.js")
        case "fobo" :: "angular-locale_teo-ug.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_teo-ug.js")
        case "fobo" :: "angular-locale_kea-cv.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kea-cv.js")
        case "fobo" :: "angular-locale_nmg-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nmg-cm.js")
        case "fobo" :: "angular-locale_en-lr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-lr.js")
        case "fobo" :: "angular-locale_byn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_byn.js")
        case "fobo" :: "angular-locale_lg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lg.js")
        case "fobo" :: "angular-locale_ses.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ses.js")
        case "fobo" :: "angular-locale_fr-bj.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-bj.js")
        case "fobo" :: "angular-locale_fo-fo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fo-fo.js")
        case "fobo" :: "angular-locale_or.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_or.js")
        case "fobo" :: "angular-locale_nmg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nmg.js")
        case "fobo" :: "angular-locale_mgo-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mgo-cm.js")
        case "fobo" :: "angular-locale_ia.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ia.js")
        case "fobo" :: "angular-locale_so-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_so-ke.js")
        case "fobo" :: "angular-locale_nl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nl.js")
        case "fobo" :: "angular-locale_en-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ke.js")
        case "fobo" :: "angular-locale_en-hk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-hk.js")
        case "fobo" :: "angular-locale_ka-ge.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ka-ge.js")
        case "fobo" :: "angular-locale_sr-latn-xk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sr-latn-xk.js")
        case "fobo" :: "angular-locale_zh-hans.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zh-hans.js")
        case "fobo" :: "angular-locale_ig.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ig.js")
        case "fobo" :: "angular-locale_sv-se.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")
        case "fobo" :: "angular-locale_wal.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_wal.js")
        case "fobo" :: "angular-locale_qu-pe.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_qu-pe.js")
        case "fobo" :: "angular-locale_pa-guru.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pa-guru.js")
        case "fobo" :: "angular-locale_ru-ua.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ru-ua.js")
        case "fobo" :: "angular-locale_ar-sy.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-sy.js")
        case "fobo" :: "angular-locale_guz-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_guz-ke.js")
        case "fobo" :: "angular-locale_bm-latn-ml.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bm-latn-ml.js")
        case "fobo" :: "angular-locale_se-no.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_se-no.js")
        case "fobo" :: "angular-locale_fr-mq.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-mq.js")
        case "fobo" :: "angular-locale_ky-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ky-cyrl.js")
        case "fobo" :: "angular-locale_si.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_si.js")
        case "fobo" :: "angular-locale_ro-ro.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ro-ro.js")
        case "fobo" :: "angular-locale_ja-jp.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ja-jp.js")
        case "fobo" :: "angular-locale_fr-cf.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-cf.js")
        case "fobo" :: "angular-locale_ja.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ja.js")
        case "fobo" :: "angular-locale_ka.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ka.js")
        case "fobo" :: "angular-locale_ko.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ko.js")
        case "fobo" :: "angular-locale_fr-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-cm.js")
        case "fobo" :: "angular-locale_chr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_chr.js")
        case "fobo" :: "angular-locale_bs-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bs-cyrl.js")
        case "fobo" :: "angular-locale_en-ng.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ng.js")
        case "fobo" :: "angular-locale_eu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_eu.js")
        case "fobo" :: "angular-locale_ee-gh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ee-gh.js")
        case "fobo" :: "angular-locale_az-latn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_az-latn.js")
        case "fobo" :: "angular-locale_rm-ch.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rm-ch.js")
        case "fobo" :: "angular-locale_en-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-in.js")
        case "fobo" :: "angular-locale_sr-cyrl-ba.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sr-cyrl-ba.js")
        case "fobo" :: "angular-locale_as-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_as-in.js")
        case "fobo" :: "angular-locale_en-nz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-nz.js")
        case "fobo" :: "angular-locale_om-et.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_om-et.js")
        case "fobo" :: "angular-locale_as.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_as.js")
        case "fobo" :: "angular-locale_ky-cyrl-kg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ky-cyrl-kg.js")
        case "fobo" :: "angular-locale_ckb-iq.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ckb-iq.js")
      }
    }
    
    lazy val angularjs141i18n4 = {
      ResourceServer.rewrite {      
        case "fobo" :: "angular-locale_de-at.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_de-at.js")
        case "fobo" :: "angular-locale_ebu-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ebu-ke.js")
        case "fobo" :: "angular-locale_twq-ne.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_twq-ne.js")
        case "fobo" :: "angular-locale_hsb.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hsb.js")
        case "fobo" :: "angular-locale_sv-ax.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-ax.js")
        case "fobo" :: "angular-locale_kde-tz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kde-tz.js")
        case "fobo" :: "angular-locale_ebu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ebu.js")
        case "fobo" :: "angular-locale_en-gg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-gg.js")
        case "fobo" :: "angular-locale_cs.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_cs.js")
        case "fobo" :: "angular-locale_vi.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vi.js")
        case "fobo" :: "angular-locale_seh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_seh.js")
        case "fobo" :: "angular-locale_kk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kk.js")
        case "fobo" :: "angular-locale_en-bs.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-bs.js")
        case "fobo" :: "angular-locale_en-fk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-fk.js")
        case "fobo" :: "angular-locale_fr-fr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-fr.js")
        case "fobo" :: "angular-locale_shi-tfng.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_shi-tfng.js")
        case "fobo" :: "angular-locale_vo-001.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vo-001.js")
        case "fobo" :: "angular-locale_pt-pt.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_pt-pt.js")
        case "fobo" :: "angular-locale_ast.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ast.js")
        case "fobo" :: "angular-locale_vi-vn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vi-vn.js")
        case "fobo" :: "angular-locale_fo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fo.js")
        case "fobo" :: "angular-locale_ar-er.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-er.js")
        case "fobo" :: "angular-locale_ar-kw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-kw.js")
        case "fobo" :: "angular-locale_es-uy.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-uy.js")
        case "fobo" :: "angular-locale_rw-rw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rw-rw.js")
        case "fobo" :: "angular-locale_ar-so.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-so.js")
        case "fobo" :: "angular-locale_en-vu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-vu.js")
        case "fobo" :: "angular-locale_ksf.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ksf.js")
        case "fobo" :: "angular-locale_ar-eh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-eh.js")
        case "fobo" :: "angular-locale_fr-mu.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-mu.js")
        case "fobo" :: "angular-locale_bg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bg.js")
        case "fobo" :: "angular-locale_en-gh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-gh.js")
        case "fobo" :: "angular-locale_ru-by.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ru-by.js")
        case "fobo" :: "angular-locale_ig-ng.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ig-ng.js")
        case "fobo" :: "angular-locale_to.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_to.js")
        case "fobo" :: "angular-locale_nus-sd.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nus-sd.js")
        case "fobo" :: "angular-locale_kl-gl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kl-gl.js")
        case "fobo" :: "angular-locale_ms-latn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ms-latn.js")
        case "fobo" :: "angular-locale_nl-aw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nl-aw.js")
        case "fobo" :: "angular-locale_en-na.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-na.js")
        case "fobo" :: "angular-locale_kkj-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kkj-cm.js")
        case "fobo" :: "angular-locale_af-za.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_af-za.js")
        case "fobo" :: "angular-locale_kok-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kok-in.js")
        case "fobo" :: "angular-locale_so-dj.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_so-dj.js")
        case "fobo" :: "angular-locale_fur.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fur.js")
        case "fobo" :: "angular-locale_sbp.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sbp.js")
        case "fobo" :: "angular-locale_en-tz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-tz.js")
        case "fobo" :: "angular-locale_en-ss.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ss.js")
        case "fobo" :: "angular-locale_lt-lt.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lt-lt.js")
        case "fobo" :: "angular-locale_en-cx.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-cx.js")
        case "fobo" :: "angular-locale_zh-hk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zh-hk.js")
        case "fobo" :: "angular-locale_fi-fi.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fi-fi.js")
        case "fobo" :: "angular-locale_mer.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mer.js")
        case "fobo" :: "angular-locale_tig-er.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tig-er.js")
        case "fobo" :: "angular-locale_mas-tz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mas-tz.js")
        case "fobo" :: "angular-locale_en-dm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-dm.js")
        case "fobo" :: "angular-locale_en-kn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-kn.js")
        case "fobo" :: "angular-locale_ko-kp.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ko-kp.js")
        case "fobo" :: "angular-locale_en-iso.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-iso.js")
        case "fobo" :: "angular-locale_sbp-tz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sbp-tz.js")
        case "fobo" :: "angular-locale_ha.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ha.js")
        case "fobo" :: "angular-locale_kk-cyrl-kz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kk-cyrl-kz.js")
        case "fobo" :: "angular-locale_tg-cyrl-tj.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tg-cyrl-tj.js")
        case "fobo" :: "angular-locale_ga-ie.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ga-ie.js")
        case "fobo" :: "angular-locale_kln-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kln-ke.js")
        case "fobo" :: "angular-locale_ar-om.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-om.js")
        case "fobo" :: "angular-locale_bas.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bas.js")
        case "fobo" :: "angular-locale_bas-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bas-cm.js")
        case "fobo" :: "angular-locale_zh-hant-mo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_zh-hant-mo.js")
        case "fobo" :: "angular-locale_ln-cd.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ln-cd.js")
        case "fobo" :: "angular-locale_en-lc.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-lc.js")
        case "fobo" :: "angular-locale_en-sz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-sz.js")
        case "fobo" :: "angular-locale_hsb-de.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_hsb-de.js")
        case "fobo" :: "angular-locale_ii-cn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ii-cn.js")
        case "fobo" :: "angular-locale_en-tk.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-tk.js")
        case "fobo" :: "angular-locale_fr-ci.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-ci.js")
        case "fobo" :: "angular-locale_ms.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ms.js")
        case "fobo" :: "angular-locale_kde.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kde.js")
        case "fobo" :: "angular-locale_ar-td.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-td.js")
        case "fobo" :: "angular-locale_ca-es-valencia.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ca-es-valencia.js")
        case "fobo" :: "angular-locale_vai-vaii.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vai-vaii.js")
        case "fobo" :: "angular-locale_fr-mf.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-mf.js")
        case "fobo" :: "angular-locale_en-er.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-er.js")
        case "fobo" :: "angular-locale_fur-it.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fur-it.js")
        case "fobo" :: "angular-locale_mn-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mn-cyrl.js")
        case "fobo" :: "angular-locale_ar-ps.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-ps.js")
        case "fobo" :: "angular-locale_lag-tz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_lag-tz.js")
        case "fobo" :: "angular-locale_xog.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_xog.js")
        case "fobo" :: "angular-locale_khq-ml.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_khq-ml.js")
        case "fobo" :: "angular-locale_ar-bh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-bh.js")
        case "fobo" :: "angular-locale_yav.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_yav.js")
        case "fobo" :: "angular-locale_be.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_be.js")
        case "fobo" :: "angular-locale_en-je.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-je.js")
        case "fobo" :: "angular-locale_rn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_rn.js")
        case "fobo" :: "angular-locale_en-ck.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ck.js")
        case "fobo" :: "angular-locale_en-tt.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-tt.js")
        case "fobo" :: "angular-locale_dyo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dyo.js")
        case "fobo" :: "angular-locale_da-gl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_da-gl.js")
        case "fobo" :: "angular-locale_nnh-cm.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nnh-cm.js")
        case "fobo" :: "angular-locale_ml.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ml.js")
        case "fobo" :: "angular-locale_ru-ru.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ru-ru.js")
        case "fobo" :: "angular-locale_bm-latn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_bm-latn.js")
        case "fobo" :: "angular-locale_twq.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_twq.js")
        case "fobo" :: "angular-locale_kam.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kam.js")
        case "fobo" :: "angular-locale_dua.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dua.js")
        case "fobo" :: "angular-locale_uz-latn-uz.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_uz-latn-uz.js")
        case "fobo" :: "angular-locale_es-419.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-419.js")
        case "fobo" :: "angular-locale_en-sc.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-sc.js")
        case "fobo" :: "angular-locale_ar-il.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-il.js")
        case "fobo" :: "angular-locale_nus.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nus.js")
        case "fobo" :: "angular-locale_in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_in.js")
        case "fobo" :: "angular-locale_ml-in.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ml-in.js")
        case "fobo" :: "angular-locale_fr-nc.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-nc.js")
        case "fobo" :: "angular-locale_en-fj.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-fj.js")
        case "fobo" :: "angular-locale_en-ky.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-ky.js")
        case "fobo" :: "angular-locale_fr-bf.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-bf.js")
        case "fobo" :: "angular-locale_dav-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dav-ke.js")
        case "fobo" :: "angular-locale_uz-cyrl.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_uz-cyrl.js")
        case "fobo" :: "angular-locale_ar-qa.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ar-qa.js")
        case "fobo" :: "angular-locale_en.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en.js")
        case "fobo" :: "angular-locale_km-kh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_km-kh.js")
        case "fobo" :: "angular-locale_aa.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_aa.js")
        case "fobo" :: "angular-locale_fil-ph.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fil-ph.js")
        case "fobo" :: "angular-locale_mn.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mn.js")
        case "fobo" :: "angular-locale_nnh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_nnh.js")
        case "fobo" :: "angular-locale_ca-it.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ca-it.js")
        case "fobo" :: "angular-locale_tn-za.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_tn-za.js")
        case "fobo" :: "angular-locale_en-mw.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-mw.js")
        case "fobo" :: "angular-locale_vun.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_vun.js")
        case "fobo" :: "angular-locale_kam-ke.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_kam-ke.js")
        case "fobo" :: "angular-locale_en-vg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_en-vg.js")
        case "fobo" :: "angular-locale_ak-gh.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ak-gh.js")
        case "fobo" :: "angular-locale_fr-ga.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-ga.js")
        case "fobo" :: "angular-locale_es-py.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-py.js")
        case "fobo" :: "angular-locale_dje-ne.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_dje-ne.js")
        case "fobo" :: "angular-locale_fr-ne.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_fr-ne.js")
        case "fobo" :: "angular-locale_mg-mg.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_mg-mg.js")
        case "fobo" :: "angular-locale_gsw-fr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_gsw-fr.js")
        case "fobo" :: "angular-locale_ia-fr.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_ia-fr.js")
        case "fobo" :: "angular-locale_es-bo.js" :: Nil => List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_es-bo.js")
      }
    }    
    
       
    lazy val angularjs1315 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.3.15", "js", "angular.js")
        case "fobo" :: "angular.js" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")
        case "fobo" :: "angular.min.js.map" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular.min.js.map")

        case "fobo" :: "angular-animate.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.3.15", "js", "angular-animate.js")
        case "fobo" :: "angular-animate.js" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-animate.min.js")
        case "fobo" :: "angular-animate.min.js.map" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-animate.min.js.map")

        case "fobo" :: "angular-aria.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.3.15", "js", "angular-aria.js")
        case "fobo" :: "angular-aria.js" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-aria.min.js")
        case "fobo" :: "angular-aria.min.js.map" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-aria.min.js.map")

        case "fobo" :: "angular-cookies.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.3.15", "js", "angular-cookies.js")
        case "fobo" :: "angular-cookies.js" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-cookies.min.js")
        case "fobo" :: "angular-cookies.min.js.map" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-cookies.min.js.map")

        case "fobo" :: "angular-loader.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.3.15", "js", "angular-loader.js")
        case "fobo" :: "angular-loader.js" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-loader.min.js")
        case "fobo" :: "angular-loader.min.js.map" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular.min-loader.js.map")

        case "fobo" :: "angular-messages.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.3.15", "js", "angular-messages.js")
        case "fobo" :: "angular-messages.js" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-messages.min.js")
        case "fobo" :: "angular-messages.min.js.map" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular.min-messages.js.map")

        //dev/test only
        case "fobo" :: "angular-mocks.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.3.15", "js", "angular-mocks.js")

        case "fobo" :: "angular-resource.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.3.15", "js", "angular-resource.js")
        case "fobo" :: "angular-resource.js" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-resource.min.js")
        case "fobo" :: "angular-resource.min.js.map" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-resource.min.js.map")

        case "fobo" :: "angular-route.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.3.15", "js", "angular-route.js")
        case "fobo" :: "angular-route.js" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-route.min.js")
        case "fobo" :: "angular-route.min.js.map" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-route.min.js.map")

        case "fobo" :: "angular-sanitize.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.3.15", "js", "angular-sanitize.js")
        case "fobo" :: "angular-sanitize.js" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-sanitize.min.js")
        case "fobo" :: "angular-sanitize.min.js.map" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-sanitize.min.js.map")
        //dev/test only 
        case "fobo" :: "angular-scenario.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.3.15", "js", "angular-scenario.js")

        case "fobo" :: "angular-touch.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.3.15", "js", "angular-touch.js")
        case "fobo" :: "angular-touch.js" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-touch.min.js")
        case "fobo" :: "angular-touch.min.js.map" :: Nil => List("fobo", "angular-js", "1.3.15", "js", "angular-touch.min.js.map")

        //CSS files
        case "fobo" :: "angular-csp.css" :: Nil if Props.devMode => List("fobo", "angular-js", "1.3.15", "css", "angular-csp.css")
        case "fobo" :: "angular-csp.css" :: Nil => List("fobo", "angular-js", "1.3.15", "css", "angular-csp.min.css")

      }
    }

    lazy val angularjs1315i18n = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_nl-cw.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nl-cw.js")
        case "fobo" :: "angular-locale_se-fi.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_se-fi.js")
        case "fobo" :: "angular-locale_en-bz.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-bz.js")
        case "fobo" :: "angular-locale_os-ru.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_os-ru.js")
        case "fobo" :: "angular-locale_lkt-us.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lkt-us.js")
        case "fobo" :: "angular-locale_en-pk.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-pk.js")
        case "fobo" :: "angular-locale_he.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_he.js")
        case "fobo" :: "angular-locale_sr-latn-ba.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sr-latn-ba.js")
        case "fobo" :: "angular-locale_teo.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_teo.js")
        case "fobo" :: "angular-locale_hy.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hy.js")
        case "fobo" :: "angular-locale_ms-latn-bn.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ms-latn-bn.js")
        case "fobo" :: "angular-locale_az.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_az.js")
        case "fobo" :: "angular-locale_nd.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nd.js")
        case "fobo" :: "angular-locale_fr-rw.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-rw.js")
        case "fobo" :: "angular-locale_so-so.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_so-so.js")
        case "fobo" :: "angular-locale_ckb-latn-iq.js" :: Nil => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ckb-latn-iq.js")
        case "fobo" :: "angular-locale_de-ch.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_de-ch.js")
        case "fobo" :: "angular-locale_ar-iq.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-iq.js")
        case "fobo" :: "angular-locale_yav-cm.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_yav-cm.js")
        case "fobo" :: "angular-locale_tg-cyrl.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tg-cyrl.js")
        case "fobo" :: "angular-locale_os-ge.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_os-ge.js")
        case "fobo" :: "angular-locale_hu.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hu.js")
        case "fobo" :: "angular-locale_pt-mo.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pt-mo.js")
        case "fobo" :: "angular-locale_ha-latn-gh.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ha-latn-gh.js")
        case "fobo" :: "angular-locale_fr-cg.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-cg.js")
        case "fobo" :: "angular-locale_mfe.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mfe.js")
        case "fobo" :: "angular-locale_en-ca.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ca.js")
        case "fobo" :: "angular-locale_st-ls.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_st-ls.js")
        case "fobo" :: "angular-locale_kw-gb.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kw-gb.js")
        case "fobo" :: "angular-locale_ss.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ss.js")
        case "fobo" :: "angular-locale_zgh.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zgh.js")
        case "fobo" :: "angular-locale_fr-dz.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-dz.js")
        case "fobo" :: "angular-locale_fr-bl.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-bl.js")
        case "fobo" :: "angular-locale_fa.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fa.js")
        case "fobo" :: "angular-locale_mk.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mk.js")
        case "fobo" :: "angular-locale_mr-in.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mr-in.js")
        case "fobo" :: "angular-locale_sv-fi.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-fi.js")
        case "fobo" :: "angular-locale_it.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_it.js")
        case "fobo" :: "angular-locale_en-cm.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-cm.js")
        case "fobo" :: "angular-locale_no-no.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_no-no.js")
        case "fobo" :: "angular-locale_ckb-ir.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ckb-ir.js")
        case "fobo" :: "angular-locale_en-to.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-to.js")
        case "fobo" :: "angular-locale_fr-cd.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-cd.js")
        case "fobo" :: "angular-locale_fr-sn.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-sn.js")
        case "fobo" :: "angular-locale_cgg.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_cgg.js")
        case "fobo" :: "angular-locale_ky.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ky.js")
        case "fobo" :: "angular-locale_chr-us.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_chr-us.js")
        case "fobo" :: "angular-locale_naq.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_naq.js")
        case "fobo" :: "angular-locale_ar.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar.js")
        case "fobo" :: "angular-locale_fr-pm.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-pm.js")
        case "fobo" :: "angular-locale_qu-bo.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_qu-bo.js")
        case "fobo" :: "angular-locale_gv-im.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gv-im.js")
        case "fobo" :: "angular-locale_is.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_is.js")
        case "fobo" :: "angular-locale_bg-bg.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bg-bg.js")
        case "fobo" :: "angular-locale_fi.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fi.js")
        case "fobo" :: "angular-locale_bn-in.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bn-in.js")
        case "fobo" :: "angular-locale_agq.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_agq.js")
        case "fobo" :: "angular-locale_khq.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_khq.js")
        case "fobo" :: "angular-locale_bs-latn-ba.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bs-latn-ba.js")
        case "fobo" :: "angular-locale_en-sg.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-sg.js")
        case "fobo" :: "angular-locale_zh-hant-tw.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zh-hant-tw.js")
        case "fobo" :: "angular-locale_fr-ch.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-ch.js")
        case "fobo" :: "angular-locale_zgh-ma.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zgh-ma.js")
        case "fobo" :: "angular-locale_ms-latn-my.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ms-latn-my.js")
        case "fobo" :: "angular-locale_fr-ma.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-ma.js")
        case "fobo" :: "angular-locale_en-fm.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-fm.js")
        case "fobo" :: "angular-locale_mgh.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mgh.js")
        case "fobo" :: "angular-locale_jgo-cm.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_jgo-cm.js")
        case "fobo" :: "angular-locale_en-zm.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-zm.js")
        case "fobo" :: "angular-locale_zh-tw.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zh-tw.js")
        case "fobo" :: "angular-locale_ki-ke.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ki-ke.js")
        case "fobo" :: "angular-locale_vai.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vai.js")
        case "fobo" :: "angular-locale_fr-ml.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-ml.js")
        case "fobo" :: "angular-locale_lu.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lu.js")
        case "fobo" :: "angular-locale_en-gu.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-gu.js")
        case "fobo" :: "angular-locale_sw-ke.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sw-ke.js")
        case "fobo" :: "angular-locale_asa.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_asa.js")
        case "fobo" :: "angular-locale_pt.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pt.js")
        case "fobo" :: "angular-locale_nd-zw.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nd-zw.js")
        case "fobo" :: "angular-locale_uz.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_uz.js")
        case "fobo" :: "angular-locale_shi.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_shi.js")
        case "fobo" :: "angular-locale_sk.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sk.js")
        case "fobo" :: "angular-locale_gu.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gu.js")
        case "fobo" :: "angular-locale_pa-guru-in.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pa-guru-in.js")
        case "fobo" :: "angular-locale_lb.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lb.js")
        case "fobo" :: "angular-locale_ps-af.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ps-af.js")
        case "fobo" :: "angular-locale_ar-dz.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-dz.js")
        case "fobo" :: "angular-locale_ru-kz.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ru-kz.js")
        case "fobo" :: "angular-locale_en-sl.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-sl.js")
        case "fobo" :: "angular-locale_zh-hant-hk.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zh-hant-hk.js")
        case "fobo" :: "angular-locale_ts-za.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ts-za.js")
        case "fobo" :: "angular-locale_sah-ru.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sah-ru.js")
        case "fobo" :: "angular-locale_rwk-tz.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rwk-tz.js")
        case "fobo" :: "angular-locale_dyo-sn.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dyo-sn.js")
        case "fobo" :: "angular-locale_et.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_et.js")
        case "fobo" :: "angular-locale_ss-sz.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ss-sz.js")
        case "fobo" :: "angular-locale_nn.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nn.js")
        case "fobo" :: "angular-locale_bem.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bem.js")
        case "fobo" :: "angular-locale_ssy-er.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ssy-er.js")
        case "fobo" :: "angular-locale_en-nu.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-nu.js")
        case "fobo" :: "angular-locale_mt.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mt.js")
        case "fobo" :: "angular-locale_pt-mz.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pt-mz.js")
        case "fobo" :: "angular-locale_nyn.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nyn.js")
        case "fobo" :: "angular-locale_ksh-de.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ksh-de.js")
        case "fobo" :: "angular-locale_bez-tz.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bez-tz.js")
        case "fobo" :: "angular-locale_es-gq.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-gq.js")
        case "fobo" :: "angular-locale_ii.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ii.js")
        case "fobo" :: "angular-locale_es-ve.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-ve.js")
        case "fobo" :: "angular-locale_ta-my.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ta-my.js")
        case "fobo" :: "angular-locale_bs.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bs.js")
        case "fobo" :: "angular-locale_zh-hant.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zh-hant.js")
        case "fobo" :: "angular-locale_bs-cyrl-ba.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bs-cyrl-ba.js")
        case "fobo" :: "angular-locale_el-gr.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_el-gr.js")
        case "fobo" :: "angular-locale_it-it.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_it-it.js")
        case "fobo" :: "angular-locale_mgh-mz.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mgh-mz.js")
        case "fobo" :: "angular-locale_es-do.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-do.js")
        case "fobo" :: "angular-locale_ff.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ff.js")
        case "fobo" :: "angular-locale_wal-et.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_wal-et.js")
        case "fobo" :: "angular-locale_hi-in.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hi-in.js")
        case "fobo" :: "angular-locale_cs-cz.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_cs-cz.js")
        case "fobo" :: "angular-locale_ssy.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ssy.js")
        case "fobo" :: "angular-locale_hr-hr.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hr-hr.js")
        case "fobo" :: "angular-locale_yo-ng.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_yo-ng.js")
        case "fobo" :: "angular-locale_en-za.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-za.js")
        case "fobo" :: "angular-locale_ln-ao.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ln-ao.js")
        case "fobo" :: "angular-locale_ms-latn-sg.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ms-latn-sg.js")
        case "fobo" :: "angular-locale_el-cy.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_el-cy.js")
        case "fobo" :: "angular-locale_ur-in.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ur-in.js")
        case "fobo" :: "angular-locale_bn.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bn.js")
        case "fobo" :: "angular-locale_zu-za.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zu-za.js")
        case "fobo" :: "angular-locale_ca.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ca.js")
        case "fobo" :: "angular-locale_sw.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sw.js")
        case "fobo" :: "angular-locale_tzm-latn.js" :: Nil    => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tzm-latn.js")
        case "fobo" :: "angular-locale_fr-tn.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-tn.js")
        case "fobo" :: "angular-locale_en-ai.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ai.js")
        case "fobo" :: "angular-locale_yi-001.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_yi-001.js")
        case "fobo" :: "angular-locale_en-ie.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ie.js")
        case "fobo" :: "angular-locale_es-hn.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-hn.js")
        case "fobo" :: "angular-locale_es-cr.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-cr.js")
        case "fobo" :: "angular-locale_ar-jo.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-jo.js")
        case "fobo" :: "angular-locale_xh-za.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_xh-za.js")
        case "fobo" :: "angular-locale_sr.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sr.js")
        case "fobo" :: "angular-locale_fr-lu.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-lu.js")
        case "fobo" :: "angular-locale_en-um.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-um.js")
        case "fobo" :: "angular-locale_es-cu.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-cu.js")
        case "fobo" :: "angular-locale_qu-ec.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_qu-ec.js")
        case "fobo" :: "angular-locale_ro-md.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ro-md.js")
        case "fobo" :: "angular-locale_to-to.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_to-to.js")
        case "fobo" :: "angular-locale_zh-hans-hk.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zh-hans-hk.js")
        case "fobo" :: "angular-locale_fr-mg.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-mg.js")
        case "fobo" :: "angular-locale_haw.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_haw.js")
        case "fobo" :: "angular-locale_ro.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ro.js")
        case "fobo" :: "angular-locale_es-ar.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-ar.js")
        case "fobo" :: "angular-locale_fr.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr.js")
        case "fobo" :: "angular-locale_it-sm.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_it-sm.js")
        case "fobo" :: "angular-locale_uk-ua.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_uk-ua.js")
        case "fobo" :: "angular-locale_aa-er.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_aa-er.js")
        case "fobo" :: "angular-locale_ha-latn-ne.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ha-latn-ne.js")
        case "fobo" :: "angular-locale_pt-st.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pt-st.js")
        case "fobo" :: "angular-locale_en-ki.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ki.js")
        case "fobo" :: "angular-locale_rof.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rof.js")
        case "fobo" :: "angular-locale_kn.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kn.js")
        case "fobo" :: "angular-locale_sr-latn-me.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sr-latn-me.js")
        case "fobo" :: "angular-locale_kok.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kok.js")
        case "fobo" :: "angular-locale_en-pr.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-pr.js")
        case "fobo" :: "angular-locale_ne-np.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ne-np.js")
        case "fobo" :: "angular-locale_lu-cd.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lu-cd.js")
        case "fobo" :: "angular-locale_sl.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sl.js")
        case "fobo" :: "angular-locale_ckb-arab-ir.js" :: Nil => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ckb-arab-ir.js")
        case "fobo" :: "angular-locale_ug-arab-cn.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ug-arab-cn.js")
        case "fobo" :: "angular-locale_mn-cyrl-mn.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mn-cyrl-mn.js")
        case "fobo" :: "angular-locale_fr-dj.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-dj.js")
        case "fobo" :: "angular-locale_ks-arab.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ks-arab.js")
        case "fobo" :: "angular-locale_luo.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_luo.js")
        case "fobo" :: "angular-locale_xh.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_xh.js")
        case "fobo" :: "angular-locale_luo-ke.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_luo-ke.js")
        case "fobo" :: "angular-locale_it-ch.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_it-ch.js")
        case "fobo" :: "angular-locale_mas.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mas.js")
        case "fobo" :: "angular-locale_ksf-cm.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ksf-cm.js")
        case "fobo" :: "angular-locale_sq-xk.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sq-xk.js")
        case "fobo" :: "angular-locale_en-gd.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-gd.js")
        case "fobo" :: "angular-locale_kea.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kea.js")
        case "fobo" :: "angular-locale_ve.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ve.js")
        case "fobo" :: "angular-locale_rof-tz.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rof-tz.js")
        case "fobo" :: "angular-locale_en-sb.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-sb.js")
        case "fobo" :: "angular-locale_ne.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ne.js")
        case "fobo" :: "angular-locale_fr-km.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-km.js")
        case "fobo" :: "angular-locale_my.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_my.js")
        case "fobo" :: "angular-locale_sr-cyrl.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sr-cyrl.js")
        case "fobo" :: "angular-locale_cy.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_cy.js")
        case "fobo" :: "angular-locale_gu-in.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gu-in.js")
        case "fobo" :: "angular-locale_es-mx.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-mx.js")
        case "fobo" :: "angular-locale_bn-bd.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bn-bd.js")
        case "fobo" :: "angular-locale_am-et.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_am-et.js")
      }
    }
    
    lazy val angularjs1315i18n2 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-locale_mk-mk.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mk-mk.js")
        case "fobo" :: "angular-locale_lag.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lag.js")
        case "fobo" :: "angular-locale_en-ms.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ms.js")
        case "fobo" :: "angular-locale_brx-in.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_brx-in.js")
        case "fobo" :: "angular-locale_sr-latn-rs.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sr-latn-rs.js")
        case "fobo" :: "angular-locale_sl-si.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sl-si.js")
        case "fobo" :: "angular-locale_mgo.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mgo.js")
        case "fobo" :: "angular-locale_ha-latn.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ha-latn.js")
        case "fobo" :: "angular-locale_tg.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tg.js")
        case "fobo" :: "angular-locale_am.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_am.js")
        case "fobo" :: "angular-locale_bo-cn.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bo-cn.js")
        case "fobo" :: "angular-locale_en-mt.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-mt.js")
        case "fobo" :: "angular-locale_dua-cm.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dua-cm.js")
        case "fobo" :: "angular-locale_sr-cyrl-xk.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sr-cyrl-xk.js")
        case "fobo" :: "angular-locale_ar-ma.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-ma.js")
        case "fobo" :: "angular-locale_en-pn.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-pn.js")
        case "fobo" :: "angular-locale_te.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_te.js")
        case "fobo" :: "angular-locale_ast-es.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ast-es.js")
        case "fobo" :: "angular-locale_pa-arab.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pa-arab.js")
        case "fobo" :: "angular-locale_zh.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zh.js")
        case "fobo" :: "angular-locale_es-pr.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-pr.js")
        case "fobo" :: "angular-locale_nb-sj.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nb-sj.js")
        case "fobo" :: "angular-locale_ar-ye.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-ye.js")
        case "fobo" :: "angular-locale_fr-pf.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-pf.js")
        case "fobo" :: "angular-locale_saq-ke.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_saq-ke.js")
        case "fobo" :: "angular-locale_de-be.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_de-be.js")
        case "fobo" :: "angular-locale_fr-wf.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-wf.js")
        case "fobo" :: "angular-locale_gd.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gd.js")
        case "fobo" :: "angular-locale_no.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_no.js")
        case "fobo" :: "angular-locale_el.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_el.js")
        case "fobo" :: "angular-locale_ca-ad.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ca-ad.js")
        case "fobo" :: "angular-locale_km.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_km.js")
        case "fobo" :: "angular-locale_en-tc.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-tc.js")
        case "fobo" :: "angular-locale_es-ni.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-ni.js")
        case "fobo" :: "angular-locale_so.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_so.js")
        case "fobo" :: "angular-locale_kkj.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kkj.js")
        case "fobo" :: "angular-locale_tr-cy.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tr-cy.js")
        case "fobo" :: "angular-locale_en-150.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-150.js")
        case "fobo" :: "angular-locale_kln.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kln.js")
        case "fobo" :: "angular-locale_qu.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_qu.js")
        case "fobo" :: "angular-locale_lo.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lo.js")
        case "fobo" :: "angular-locale_os.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_os.js")
        case "fobo" :: "angular-locale_zh-hans-mo.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zh-hans-mo.js")
        case "fobo" :: "angular-locale_ses-ml.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ses-ml.js")
        case "fobo" :: "angular-locale_fr-sy.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-sy.js")
        case "fobo" :: "angular-locale_fr-td.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-td.js")
        case "fobo" :: "angular-locale_mt-mt.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mt-mt.js")
        case "fobo" :: "angular-locale_en-us.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-us.js")
        case "fobo" :: "angular-locale_zh-hans-sg.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zh-hans-sg.js")
        case "fobo" :: "angular-locale_az-latn-az.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_az-latn-az.js")
        case "fobo" :: "angular-locale_uz-latn.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_uz-latn.js")
        case "fobo" :: "angular-locale_dsb.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dsb.js")
        case "fobo" :: "angular-locale_bez.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bez.js")
        case "fobo" :: "angular-locale_fr-vu.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-vu.js")
        case "fobo" :: "angular-locale_fr-be.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-be.js")
        case "fobo" :: "angular-locale_hr.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hr.js")
        case "fobo" :: "angular-locale_agq-cm.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_agq-cm.js")
        case "fobo" :: "angular-locale_smn.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_smn.js")
        case "fobo" :: "angular-locale_kl.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kl.js")
        case "fobo" :: "angular-locale_ak.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ak.js")
        case "fobo" :: "angular-locale_nr.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nr.js")
        case "fobo" :: "angular-locale_en-sd.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-sd.js")
        case "fobo" :: "angular-locale_fr-ht.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-ht.js")
        case "fobo" :: "angular-locale_fr-gn.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-gn.js")
        case "fobo" :: "angular-locale_st-za.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_st-za.js")
        case "fobo" :: "angular-locale_es-ec.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-ec.js")
        case "fobo" :: "angular-locale_mas-ke.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mas-ke.js")
        case "fobo" :: "angular-locale_seh-mz.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_seh-mz.js")
        case "fobo" :: "angular-locale_ta-lk.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ta-lk.js")
        case "fobo" :: "angular-locale_bo.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bo.js")
        case "fobo" :: "angular-locale_ewo.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ewo.js")
        case "fobo" :: "angular-locale_en-nr.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-nr.js")
        case "fobo" :: "angular-locale_en-au.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-au.js")
        case "fobo" :: "angular-locale_shi-tfng-ma.js" :: Nil => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_shi-tfng-ma.js")
        case "fobo" :: "angular-locale_guz.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_guz.js")
        case "fobo" :: "angular-locale_id-id.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_id-id.js")
        case "fobo" :: "angular-locale_en-ws.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ws.js")
        case "fobo" :: "angular-locale_tn-bw.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tn-bw.js")
        case "fobo" :: "angular-locale_sw-tz.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sw-tz.js")
        case "fobo" :: "angular-locale_kab.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kab.js")
        case "fobo" :: "angular-locale_az-cyrl-az.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_az-cyrl-az.js")
        case "fobo" :: "angular-locale_de-de.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_de-de.js")
        case "fobo" :: "angular-locale_en-pg.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-pg.js")
        case "fobo" :: "angular-locale_sr-cyrl-me.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sr-cyrl-me.js")
        case "fobo" :: "angular-locale_ar-km.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-km.js")
        case "fobo" :: "angular-locale_ar-lb.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-lb.js")
        case "fobo" :: "angular-locale_wae-ch.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_wae-ch.js")
        case "fobo" :: "angular-locale_luy-ke.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_luy-ke.js")
        case "fobo" :: "angular-locale_be-by.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_be-by.js")
        case "fobo" :: "angular-locale_ar-tn.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-tn.js")
        case "fobo" :: "angular-locale_en-gi.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-gi.js")
        case "fobo" :: "angular-locale_te-in.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_te-in.js")
        case "fobo" :: "angular-locale_en-my.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-my.js")
        case "fobo" :: "angular-locale_en-ag.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ag.js")
        case "fobo" :: "angular-locale_ta-in.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ta-in.js")
        case "fobo" :: "angular-locale_es-cl.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-cl.js")
        case "fobo" :: "angular-locale_shi-latn-ma.js" :: Nil => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_shi-latn-ma.js")
        case "fobo" :: "angular-locale_hu-hu.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hu-hu.js")
        case "fobo" :: "angular-locale_ln-cg.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ln-cg.js")
        case "fobo" :: "angular-locale_tzm.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tzm.js")
        case "fobo" :: "angular-locale_aa-et.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_aa-et.js")
        case "fobo" :: "angular-locale_ff-gn.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ff-gn.js")
        case "fobo" :: "angular-locale_fr-ca.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-ca.js")
        case "fobo" :: "angular-locale_he-il.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_he-il.js")
        case "fobo" :: "angular-locale_vo.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vo.js")
        case "fobo" :: "angular-locale_es-gt.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-gt.js")
        case "fobo" :: "angular-locale_rw.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rw.js")
        case "fobo" :: "angular-locale_uz-arab-af.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_uz-arab-af.js")
        case "fobo" :: "angular-locale_id.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_id.js")
        case "fobo" :: "angular-locale_en-gy.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-gy.js")
        case "fobo" :: "angular-locale_ko-kr.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ko-kr.js")
        case "fobo" :: "angular-locale_smn-fi.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_smn-fi.js")
        case "fobo" :: "angular-locale_lkt.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lkt.js")
        case "fobo" :: "angular-locale_hy-am.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hy-am.js")
        case "fobo" :: "angular-locale_ksb.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ksb.js")
        case "fobo" :: "angular-locale_pt-tl.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pt-tl.js")
        case "fobo" :: "angular-locale_ar-ly.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-ly.js")
        case "fobo" :: "angular-locale_ur-pk.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ur-pk.js")
        case "fobo" :: "angular-locale_dsb-de.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dsb-de.js")
        case "fobo" :: "angular-locale_en-mo.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-mo.js")
        case "fobo" :: "angular-locale_nl-sr.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nl-sr.js")
        case "fobo" :: "angular-locale_fy-nl.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fy-nl.js")
        case "fobo" :: "angular-locale_yo-bj.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_yo-bj.js")
        case "fobo" :: "angular-locale_xog-ug.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_xog-ug.js")
        case "fobo" :: "angular-locale_ar-sa.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-sa.js")
        case "fobo" :: "angular-locale_dje.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dje.js")
        case "fobo" :: "angular-locale_fr-sc.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-sc.js")
        case "fobo" :: "angular-locale_en-mp.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-mp.js")
        case "fobo" :: "angular-locale_es-pe.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-pe.js")
        case "fobo" :: "angular-locale_fr-re.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-re.js")
        case "fobo" :: "angular-locale_uk.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_uk.js")
        case "fobo" :: "angular-locale_en-rw.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-rw.js")
        case "fobo" :: "angular-locale_pt-ao.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pt-ao.js")
        case "fobo" :: "angular-locale_zh-hans-cn.js" :: Nil  => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zh-hans-cn.js")
        case "fobo" :: "angular-locale_yi.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_yi.js")
        case "fobo" :: "angular-locale_ug-arab.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ug-arab.js")
        case "fobo" :: "angular-locale_my-mm.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_my-mm.js")
        case "fobo" :: "angular-locale_lt.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lt.js")
        case "fobo" :: "angular-locale_ta.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ta.js")
        case "fobo" :: "angular-locale_ki.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ki.js")
        case "fobo" :: "angular-locale_iw.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_iw.js")
        case "fobo" :: "angular-locale_fr-gq.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-gq.js")
        case "fobo" :: "angular-locale_om.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_om.js")
        case "fobo" :: "angular-locale_ne-in.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ne-in.js")
        case "fobo" :: "angular-locale_rn-bi.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rn-bi.js")
        case "fobo" :: "angular-locale_ckb-arab.js" :: Nil    => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ckb-arab.js")
        case "fobo" :: "angular-locale_nn-no.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nn-no.js")
        case "fobo" :: "angular-locale_en-mg.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-mg.js")
        case "fobo" :: "angular-locale_ga.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ga.js")
        case "fobo" :: "angular-locale_es-us.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-us.js")
        case "fobo" :: "angular-locale_en-tv.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-tv.js")
        case "fobo" :: "angular-locale_mer-ke.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mer-ke.js")
        case "fobo" :: "angular-locale_ss-za.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ss-za.js")
        case "fobo" :: "angular-locale_en-gb.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-gb.js")
        case "fobo" :: "angular-locale_en-mu.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-mu.js")
        case "fobo" :: "angular-locale_lv.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lv.js")
        case "fobo" :: "angular-locale_fr-tg.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-tg.js")
        case "fobo" :: "angular-locale_vun-tz.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vun-tz.js")
        case "fobo" :: "angular-locale_gd-gb.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gd-gb.js")
        case "fobo" :: "angular-locale_st.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_st.js")
        case "fobo" :: "angular-locale_pl-pl.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pl-pl.js")
        case "fobo" :: "angular-locale_bm-ml.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bm-ml.js")
        case "fobo" :: "angular-locale_ar-dj.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-dj.js")
        case "fobo" :: "angular-locale_en-be.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-be.js")
        case "fobo" :: "angular-locale_en-ls.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ls.js")
        case "fobo" :: "angular-locale_aa-dj.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_aa-dj.js")
        case "fobo" :: "angular-locale_haw-us.js" :: Nil      => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_haw-us.js")
        case "fobo" :: "angular-locale_ta-sg.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ta-sg.js")
        case "fobo" :: "angular-locale_sw-ug.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sw-ug.js")
        case "fobo" :: "angular-locale_gl.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gl.js")
        case "fobo" :: "angular-locale_es-ic.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-ic.js")
        case "fobo" :: "angular-locale_en-pw.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-pw.js")
        case "fobo" :: "angular-locale_nr-za.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nr-za.js")
        case "fobo" :: "angular-locale_ti.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ti.js")
        case "fobo" :: "angular-locale_en-bw.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-bw.js")
        case "fobo" :: "angular-locale_az-cyrl.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_az-cyrl.js")
        case "fobo" :: "angular-locale_gsw.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gsw.js")
      }
    }

    lazy val angularjs1315i18n3 = {
      ResourceServer.rewrite {
        //i18n files    
        case "fobo" :: "angular-locale_en-jm.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-jm.js")
        case "fobo" :: "angular-locale_cgg-ug.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_cgg-ug.js")
        case "fobo" :: "angular-locale_rm.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rm.js")
        case "fobo" :: "angular-locale_mr.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mr.js")
        case "fobo" :: "angular-locale_th.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_th.js")
        case "fobo" :: "angular-locale_br.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_br.js")
        case "fobo" :: "angular-locale_en-im.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-im.js")
        case "fobo" :: "angular-locale_lg-ug.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lg-ug.js")
        case "fobo" :: "angular-locale_en-ug.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ug.js")
        case "fobo" :: "angular-locale_dz.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dz.js")
        case "fobo" :: "angular-locale_vai-latn-lr.js" :: Nil    => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vai-latn-lr.js")
        case "fobo" :: "angular-locale_nb-no.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nb-no.js")
        case "fobo" :: "angular-locale_se.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_se.js")
        case "fobo" :: "angular-locale_ckb-arab-iq.js" :: Nil    => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ckb-arab-iq.js")
        case "fobo" :: "angular-locale_asa-tz.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_asa-tz.js")
        case "fobo" :: "angular-locale_ar-001.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-001.js")
        case "fobo" :: "angular-locale_brx.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_brx.js")
        case "fobo" :: "angular-locale_es-co.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-co.js")
        case "fobo" :: "angular-locale_ewo-cm.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ewo-cm.js")
        case "fobo" :: "angular-locale_ln.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ln.js")
        case "fobo" :: "angular-locale_sk-sk.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sk-sk.js")
        case "fobo" :: "angular-locale_vai-vaii-lr.js" :: Nil    => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vai-vaii-lr.js")
        case "fobo" :: "angular-locale_ug.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ug.js")
        case "fobo" :: "angular-locale_af.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_af.js")
        case "fobo" :: "angular-locale_de-li.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_de-li.js")
        case "fobo" :: "angular-locale_kw.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kw.js")
        case "fobo" :: "angular-locale_so-et.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_so-et.js")
        case "fobo" :: "angular-locale_ti-et.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ti-et.js")
        case "fobo" :: "angular-locale_nyn-ug.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nyn-ug.js")
        case "fobo" :: "angular-locale_gsw-ch.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gsw-ch.js")
        case "fobo" :: "angular-locale_ckb-latn.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ckb-latn.js")
        case "fobo" :: "angular-locale_nl-sx.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nl-sx.js")
        case "fobo" :: "angular-locale_da.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_da.js")
        case "fobo" :: "angular-locale_sq-al.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sq-al.js")
        case "fobo" :: "angular-locale_zh-cn.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zh-cn.js")
        case "fobo" :: "angular-locale_en-ph.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ph.js")
        case "fobo" :: "angular-locale_ru-md.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ru-md.js")
        case "fobo" :: "angular-locale_tl.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tl.js")
        case "fobo" :: "angular-locale_ks.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ks.js")
        case "fobo" :: "angular-locale_tzm-latn-ma.js" :: Nil    => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tzm-latn-ma.js")
        case "fobo" :: "angular-locale_zu.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zu.js")
        case "fobo" :: "angular-locale_et-ee.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_et-ee.js")
        case "fobo" :: "angular-locale_ar-ae.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-ae.js")
        case "fobo" :: "angular-locale_ha-latn-ng.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ha-latn-ng.js")
        case "fobo" :: "angular-locale_cy-gb.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_cy-gb.js")
        case "fobo" :: "angular-locale_en-as.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-as.js")
        case "fobo" :: "angular-locale_byn-er.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_byn-er.js")
        case "fobo" :: "angular-locale_sn-zw.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sn-zw.js")
        case "fobo" :: "angular-locale_en-nf.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-nf.js")
        case "fobo" :: "angular-locale_eo.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_eo.js")
        case "fobo" :: "angular-locale_nl-bq.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nl-bq.js")
        case "fobo" :: "angular-locale_ee-tg.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ee-tg.js")
        case "fobo" :: "angular-locale_pa-arab-pk.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pa-arab-pk.js")
        case "fobo" :: "angular-locale_gsw-li.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gsw-li.js")
        case "fobo" :: "angular-locale_en-io.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-io.js")
        case "fobo" :: "angular-locale_se-se.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_se-se.js")
        case "fobo" :: "angular-locale_tr-tr.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tr-tr.js")
        case "fobo" :: "angular-locale_fr-mc.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-mc.js")
        case "fobo" :: "angular-locale_wae.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_wae.js")
        case "fobo" :: "angular-locale_mua-cm.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mua-cm.js")
        case "fobo" :: "angular-locale_ru-kg.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ru-kg.js")
        case "fobo" :: "angular-locale_uz-cyrl-uz.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_uz-cyrl-uz.js")
        case "fobo" :: "angular-locale_en-vc.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-vc.js")
        case "fobo" :: "angular-locale_es-ph.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-ph.js")
        case "fobo" :: "angular-locale_mfe-mu.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mfe-mu.js")
        case "fobo" :: "angular-locale_tn.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tn.js")
        case "fobo" :: "angular-locale_sg-cf.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sg-cf.js")
        case "fobo" :: "angular-locale_swc.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_swc.js")
        case "fobo" :: "angular-locale_fa-af.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fa-af.js")
        case "fobo" :: "angular-locale_ca-fr.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ca-fr.js")
        case "fobo" :: "angular-locale_pl.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pl.js")
        case "fobo" :: "angular-locale_en-zw.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-zw.js")
        case "fobo" :: "angular-locale_ff-cm.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ff-cm.js")
        case "fobo" :: "angular-locale_fil.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fil.js")
        case "fobo" :: "angular-locale_is-is.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_is-is.js")
        case "fobo" :: "angular-locale_es-pa.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-pa.js")
        case "fobo" :: "angular-locale_sv.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv.js")
        case "fobo" :: "angular-locale_nso-za.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nso-za.js")
        case "fobo" :: "angular-locale_fr-yt.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-yt.js")
        case "fobo" :: "angular-locale_lb-lu.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lb-lu.js")
        case "fobo" :: "angular-locale_de.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_de.js")
        case "fobo" :: "angular-locale_ln-cf.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ln-cf.js")
        case "fobo" :: "angular-locale_th-th.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_th-th.js")
        case "fobo" :: "angular-locale_en-bb.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-bb.js")
        case "fobo" :: "angular-locale_teo-ke.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_teo-ke.js")
        case "fobo" :: "angular-locale_es.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es.js")
        case "fobo" :: "angular-locale_dz-bt.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dz-bt.js")
        case "fobo" :: "angular-locale_nso.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nso.js")
        case "fobo" :: "angular-locale_lo-la.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lo-la.js")
        case "fobo" :: "angular-locale_ti-er.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ti-er.js")
        case "fobo" :: "angular-locale_ff-mr.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ff-mr.js")
        case "fobo" :: "angular-locale_om-ke.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_om-ke.js")
        case "fobo" :: "angular-locale_luy.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_luy.js")
        case "fobo" :: "angular-locale_naq-na.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_naq-na.js")
        case "fobo" :: "angular-locale_en-sx.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-sx.js")
        case "fobo" :: "angular-locale_nl-be.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nl-be.js")
        case "fobo" :: "angular-locale_si-lk.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_si-lk.js")
        case "fobo" :: "angular-locale_kn-in.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kn-in.js")
        case "fobo" :: "angular-locale_mua.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mua.js")
        case "fobo" :: "angular-locale_kab-dz.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kab-dz.js")
        case "fobo" :: "angular-locale_lv-lv.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lv-lv.js")
        case "fobo" :: "angular-locale_en-mh.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-mh.js")
        case "fobo" :: "angular-locale_en-cc.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-cc.js")
        case "fobo" :: "angular-locale_jmc-tz.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_jmc-tz.js")
        case "fobo" :: "angular-locale_dav.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dav.js")
        case "fobo" :: "angular-locale_sg.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sg.js")
        case "fobo" :: "angular-locale_eu-es.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_eu-es.js")
        case "fobo" :: "angular-locale_ar-eg.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-eg.js")
        case "fobo" :: "angular-locale_es-sv.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-sv.js")
        case "fobo" :: "angular-locale_ca-es.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ca-es.js")
        case "fobo" :: "angular-locale_bm.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bm.js")
        case "fobo" :: "angular-locale_ckb.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ckb.js")
        case "fobo" :: "angular-locale_es-ea.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-ea.js")
        case "fobo" :: "angular-locale_sr-latn.js" :: Nil        => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sr-latn.js")
        case "fobo" :: "angular-locale_tig.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tig.js")
        case "fobo" :: "angular-locale_fr-gf.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-gf.js")
        case "fobo" :: "angular-locale_ps.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ps.js")
        case "fobo" :: "angular-locale_en-dg.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-dg.js")
        case "fobo" :: "angular-locale_ar-ss.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-ss.js")
        case "fobo" :: "angular-locale_fr-mr.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-mr.js")
        case "fobo" :: "angular-locale_kk-cyrl.js" :: Nil        => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kk-cyrl.js")
        case "fobo" :: "angular-locale_ksb-tz.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ksb-tz.js")
        case "fobo" :: "angular-locale_ff-sn.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ff-sn.js")
        case "fobo" :: "angular-locale_hr-ba.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hr-ba.js")
        case "fobo" :: "angular-locale_gl-es.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gl-es.js")
        case "fobo" :: "angular-locale_bo-in.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bo-in.js")
        case "fobo" :: "angular-locale_vai-latn.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vai-latn.js")
        case "fobo" :: "angular-locale_sq.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sq.js")
        case "fobo" :: "angular-locale_fr-gp.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-gp.js")
        case "fobo" :: "angular-locale_ar-mr.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-mr.js")
        case "fobo" :: "angular-locale_sr-cyrl-rs.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sr-cyrl-rs.js")
        case "fobo" :: "angular-locale_ve-za.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ve-za.js")
        case "fobo" :: "angular-locale_or-in.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_or-in.js")
        case "fobo" :: "angular-locale_ru.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ru.js")
        case "fobo" :: "angular-locale_en-gm.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-gm.js")
        case "fobo" :: "angular-locale_sq-mk.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sq-mk.js")
        case "fobo" :: "angular-locale_hi.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hi.js")
        case "fobo" :: "angular-locale_saq.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_saq.js")
        case "fobo" :: "angular-locale_en-bm.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-bm.js")
        case "fobo" :: "angular-locale_mg.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mg.js")
        case "fobo" :: "angular-locale_de-lu.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_de-lu.js")
        case "fobo" :: "angular-locale_es-es.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-es.js")
        case "fobo" :: "angular-locale_shi-latn.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_shi-latn.js")
        case "fobo" :: "angular-locale_bs-latn.js" :: Nil        => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bs-latn.js")
        case "fobo" :: "angular-locale_sah.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sah.js")
        case "fobo" :: "angular-locale_fy.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fy.js")
        case "fobo" :: "angular-locale_ksh.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ksh.js")
        case "fobo" :: "angular-locale_bem-zm.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bem-zm.js")
        case "fobo" :: "angular-locale_tr.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tr.js")
        case "fobo" :: "angular-locale_swc-cd.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_swc-cd.js")
        case "fobo" :: "angular-locale_gv.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gv.js")
        case "fobo" :: "angular-locale_br-fr.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_br-fr.js")
        case "fobo" :: "angular-locale_fr-bi.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-bi.js")
        case "fobo" :: "angular-locale_pt-gw.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pt-gw.js")
        case "fobo" :: "angular-locale_af-na.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_af-na.js")
        case "fobo" :: "angular-locale_en-001.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-001.js")
        case "fobo" :: "angular-locale_sn.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sn.js")
        case "fobo" :: "angular-locale_jgo.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_jgo.js")
        case "fobo" :: "angular-locale_ur.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ur.js")
        case "fobo" :: "angular-locale_uz-arab.js" :: Nil        => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_uz-arab.js")
        case "fobo" :: "angular-locale_en-vi.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-vi.js")
        case "fobo" :: "angular-locale_ks-arab-in.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ks-arab-in.js")
        case "fobo" :: "angular-locale_ee.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ee.js")
        case "fobo" :: "angular-locale_pt-br.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pt-br.js")
        case "fobo" :: "angular-locale_eo-001.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_eo-001.js")
        case "fobo" :: "angular-locale_da-dk.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_da-dk.js")
        case "fobo" :: "angular-locale_pt-cv.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pt-cv.js")
        case "fobo" :: "angular-locale_nb.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nb.js")
        case "fobo" :: "angular-locale_ar-sd.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-sd.js")
        case "fobo" :: "angular-locale_pa.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pa.js")
        case "fobo" :: "angular-locale_fa-ir.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fa-ir.js")
        case "fobo" :: "angular-locale_nl-nl.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nl-nl.js")
        case "fobo" :: "angular-locale_yo.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_yo.js")
        case "fobo" :: "angular-locale_ts.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ts.js")
        case "fobo" :: "angular-locale_jmc.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_jmc.js")
        case "fobo" :: "angular-locale_en-sh.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-sh.js")
        case "fobo" :: "angular-locale_rwk.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rwk.js")
        case "fobo" :: "angular-locale_teo-ug.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_teo-ug.js")
        case "fobo" :: "angular-locale_kea-cv.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kea-cv.js")
        case "fobo" :: "angular-locale_nmg-cm.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nmg-cm.js")
        case "fobo" :: "angular-locale_en-lr.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-lr.js")
        case "fobo" :: "angular-locale_byn.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_byn.js")
        case "fobo" :: "angular-locale_lg.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lg.js")
        case "fobo" :: "angular-locale_ses.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ses.js")
        case "fobo" :: "angular-locale_fr-bj.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-bj.js")
        case "fobo" :: "angular-locale_fo-fo.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fo-fo.js")
        case "fobo" :: "angular-locale_or.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_or.js")
        case "fobo" :: "angular-locale_nmg.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nmg.js")
        case "fobo" :: "angular-locale_mgo-cm.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mgo-cm.js")
        case "fobo" :: "angular-locale_ia.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ia.js")
        case "fobo" :: "angular-locale_so-ke.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_so-ke.js")
        case "fobo" :: "angular-locale_nl.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nl.js")
        case "fobo" :: "angular-locale_en-ke.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ke.js")
        case "fobo" :: "angular-locale_en-hk.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-hk.js")
        case "fobo" :: "angular-locale_ka-ge.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ka-ge.js")
        case "fobo" :: "angular-locale_sr-latn-xk.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sr-latn-xk.js")
        case "fobo" :: "angular-locale_zh-hans.js" :: Nil        => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zh-hans.js")
        case "fobo" :: "angular-locale_ig.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ig.js")
        case "fobo" :: "angular-locale_sv-se.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")
        case "fobo" :: "angular-locale_wal.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_wal.js")
      }
    }
    
    
    lazy val angularjs1315i18n4 = {
      ResourceServer.rewrite {    
        case "fobo" :: "angular-locale_qu-pe.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_qu-pe.js")
        case "fobo" :: "angular-locale_pa-guru.js" :: Nil        => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pa-guru.js")
        case "fobo" :: "angular-locale_ru-ua.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ru-ua.js")
        case "fobo" :: "angular-locale_ar-sy.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-sy.js")
        case "fobo" :: "angular-locale_guz-ke.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_guz-ke.js")
        case "fobo" :: "angular-locale_bm-latn-ml.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bm-latn-ml.js")
        case "fobo" :: "angular-locale_se-no.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_se-no.js")
        case "fobo" :: "angular-locale_fr-mq.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-mq.js")
        case "fobo" :: "angular-locale_ky-cyrl.js" :: Nil        => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ky-cyrl.js")
        case "fobo" :: "angular-locale_si.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_si.js")
        case "fobo" :: "angular-locale_ro-ro.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ro-ro.js")
        case "fobo" :: "angular-locale_ja-jp.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ja-jp.js")
        case "fobo" :: "angular-locale_fr-cf.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-cf.js")
        case "fobo" :: "angular-locale_ja.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ja.js")
        case "fobo" :: "angular-locale_ka.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ka.js")
        case "fobo" :: "angular-locale_ko.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ko.js")
        case "fobo" :: "angular-locale_fr-cm.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-cm.js")
        case "fobo" :: "angular-locale_chr.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_chr.js")
        case "fobo" :: "angular-locale_bs-cyrl.js" :: Nil        => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bs-cyrl.js")
        case "fobo" :: "angular-locale_en-ng.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ng.js")
        case "fobo" :: "angular-locale_eu.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_eu.js")
        case "fobo" :: "angular-locale_ee-gh.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ee-gh.js")
        case "fobo" :: "angular-locale_az-latn.js" :: Nil        => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_az-latn.js")
        case "fobo" :: "angular-locale_rm-ch.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rm-ch.js")
        case "fobo" :: "angular-locale_en-in.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-in.js")
        case "fobo" :: "angular-locale_sr-cyrl-ba.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sr-cyrl-ba.js")
        case "fobo" :: "angular-locale_as-in.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_as-in.js")
        case "fobo" :: "angular-locale_en-nz.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-nz.js")
        case "fobo" :: "angular-locale_om-et.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_om-et.js")
        case "fobo" :: "angular-locale_as.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_as.js")
        case "fobo" :: "angular-locale_ky-cyrl-kg.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ky-cyrl-kg.js")
        case "fobo" :: "angular-locale_ckb-iq.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ckb-iq.js")
        case "fobo" :: "angular-locale_de-at.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_de-at.js")
        case "fobo" :: "angular-locale_ebu-ke.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ebu-ke.js")
        case "fobo" :: "angular-locale_twq-ne.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_twq-ne.js")
        case "fobo" :: "angular-locale_hsb.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hsb.js")
        case "fobo" :: "angular-locale_sv-ax.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-ax.js")
        case "fobo" :: "angular-locale_kde-tz.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kde-tz.js")
        case "fobo" :: "angular-locale_ebu.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ebu.js")
        case "fobo" :: "angular-locale_en-gg.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-gg.js")
        case "fobo" :: "angular-locale_cs.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_cs.js")
        case "fobo" :: "angular-locale_vi.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vi.js")
        case "fobo" :: "angular-locale_seh.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_seh.js")
        case "fobo" :: "angular-locale_kk.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kk.js")
        case "fobo" :: "angular-locale_en-bs.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-bs.js")
        case "fobo" :: "angular-locale_en-fk.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-fk.js")
        case "fobo" :: "angular-locale_fr-fr.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-fr.js")
        case "fobo" :: "angular-locale_shi-tfng.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_shi-tfng.js")
        case "fobo" :: "angular-locale_vo-001.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vo-001.js")
        case "fobo" :: "angular-locale_pt-pt.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_pt-pt.js")
        case "fobo" :: "angular-locale_ast.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ast.js")
        case "fobo" :: "angular-locale_vi-vn.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vi-vn.js")
        case "fobo" :: "angular-locale_fo.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fo.js")
        case "fobo" :: "angular-locale_ar-er.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-er.js")
        case "fobo" :: "angular-locale_ar-kw.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-kw.js")
        case "fobo" :: "angular-locale_es-uy.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-uy.js")
        case "fobo" :: "angular-locale_rw-rw.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rw-rw.js")
        case "fobo" :: "angular-locale_ar-so.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-so.js")
        case "fobo" :: "angular-locale_en-vu.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-vu.js")
        case "fobo" :: "angular-locale_ksf.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ksf.js")
        case "fobo" :: "angular-locale_ar-eh.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-eh.js")
        case "fobo" :: "angular-locale_fr-mu.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-mu.js")
        case "fobo" :: "angular-locale_bg.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bg.js")
        case "fobo" :: "angular-locale_en-gh.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-gh.js")
        case "fobo" :: "angular-locale_ru-by.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ru-by.js")
        case "fobo" :: "angular-locale_ig-ng.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ig-ng.js")
        case "fobo" :: "angular-locale_to.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_to.js")
        case "fobo" :: "angular-locale_nus-sd.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nus-sd.js")
        case "fobo" :: "angular-locale_kl-gl.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kl-gl.js")
        case "fobo" :: "angular-locale_ms-latn.js" :: Nil        => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ms-latn.js")
        case "fobo" :: "angular-locale_nl-aw.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nl-aw.js")
        case "fobo" :: "angular-locale_en-na.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-na.js")
        case "fobo" :: "angular-locale_kkj-cm.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kkj-cm.js")
        case "fobo" :: "angular-locale_af-za.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_af-za.js")
        case "fobo" :: "angular-locale_kok-in.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kok-in.js")
        case "fobo" :: "angular-locale_so-dj.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_so-dj.js")
        case "fobo" :: "angular-locale_fur.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fur.js")
        case "fobo" :: "angular-locale_sbp.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sbp.js")
        case "fobo" :: "angular-locale_en-tz.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-tz.js")
        case "fobo" :: "angular-locale_en-ss.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ss.js")
        case "fobo" :: "angular-locale_lt-lt.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lt-lt.js")
        case "fobo" :: "angular-locale_en-cx.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-cx.js")
        case "fobo" :: "angular-locale_zh-hk.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zh-hk.js")
        case "fobo" :: "angular-locale_fi-fi.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fi-fi.js")
        case "fobo" :: "angular-locale_mer.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mer.js")
        case "fobo" :: "angular-locale_tig-er.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tig-er.js")
        case "fobo" :: "angular-locale_mas-tz.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mas-tz.js")
        case "fobo" :: "angular-locale_en-dm.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-dm.js")
        case "fobo" :: "angular-locale_en-kn.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-kn.js")
        case "fobo" :: "angular-locale_ko-kp.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ko-kp.js")
        case "fobo" :: "angular-locale_en-iso.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-iso.js")
        case "fobo" :: "angular-locale_sbp-tz.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sbp-tz.js")
        case "fobo" :: "angular-locale_ha.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ha.js")
        case "fobo" :: "angular-locale_kk-cyrl-kz.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kk-cyrl-kz.js")
        case "fobo" :: "angular-locale_tg-cyrl-tj.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tg-cyrl-tj.js")
        case "fobo" :: "angular-locale_ga-ie.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ga-ie.js")
        case "fobo" :: "angular-locale_kln-ke.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kln-ke.js")
        case "fobo" :: "angular-locale_ar-om.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-om.js")
        case "fobo" :: "angular-locale_bas.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bas.js")
        case "fobo" :: "angular-locale_bas-cm.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bas-cm.js")
        case "fobo" :: "angular-locale_zh-hant-mo.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_zh-hant-mo.js")
        case "fobo" :: "angular-locale_ln-cd.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ln-cd.js")
        case "fobo" :: "angular-locale_en-lc.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-lc.js")
        case "fobo" :: "angular-locale_en-sz.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-sz.js")
        case "fobo" :: "angular-locale_hsb-de.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_hsb-de.js")
        case "fobo" :: "angular-locale_ii-cn.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ii-cn.js")
        case "fobo" :: "angular-locale_en-tk.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-tk.js")
        case "fobo" :: "angular-locale_fr-ci.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-ci.js")
        case "fobo" :: "angular-locale_ms.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ms.js")
        case "fobo" :: "angular-locale_kde.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kde.js")
        case "fobo" :: "angular-locale_ar-td.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-td.js")
        case "fobo" :: "angular-locale_ca-es-valencia.js" :: Nil => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ca-es-valencia.js")
        case "fobo" :: "angular-locale_vai-vaii.js" :: Nil       => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vai-vaii.js")
        case "fobo" :: "angular-locale_fr-mf.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-mf.js")
        case "fobo" :: "angular-locale_en-er.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-er.js")
        case "fobo" :: "angular-locale_fur-it.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fur-it.js")
        case "fobo" :: "angular-locale_mn-cyrl.js" :: Nil        => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mn-cyrl.js")
        case "fobo" :: "angular-locale_ar-ps.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-ps.js")
        case "fobo" :: "angular-locale_lag-tz.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_lag-tz.js")
        case "fobo" :: "angular-locale_xog.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_xog.js")
        case "fobo" :: "angular-locale_khq-ml.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_khq-ml.js")
        case "fobo" :: "angular-locale_ar-bh.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-bh.js")
        case "fobo" :: "angular-locale_yav.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_yav.js")
        case "fobo" :: "angular-locale_be.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_be.js")
        case "fobo" :: "angular-locale_en-je.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-je.js")
        case "fobo" :: "angular-locale_rn.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_rn.js")
        case "fobo" :: "angular-locale_en-ck.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ck.js")
        case "fobo" :: "angular-locale_en-tt.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-tt.js")
        case "fobo" :: "angular-locale_dyo.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dyo.js")
        case "fobo" :: "angular-locale_da-gl.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_da-gl.js")
        case "fobo" :: "angular-locale_nnh-cm.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nnh-cm.js")
        case "fobo" :: "angular-locale_ml.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ml.js")
        case "fobo" :: "angular-locale_ru-ru.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ru-ru.js")
        case "fobo" :: "angular-locale_bm-latn.js" :: Nil        => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_bm-latn.js")
        case "fobo" :: "angular-locale_twq.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_twq.js")
        case "fobo" :: "angular-locale_kam.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kam.js")
        case "fobo" :: "angular-locale_dua.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dua.js")
        case "fobo" :: "angular-locale_uz-latn-uz.js" :: Nil     => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_uz-latn-uz.js")
        case "fobo" :: "angular-locale_es-419.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-419.js")
        case "fobo" :: "angular-locale_en-sc.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-sc.js")
        case "fobo" :: "angular-locale_ar-il.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-il.js")
        case "fobo" :: "angular-locale_nus.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nus.js")
        case "fobo" :: "angular-locale_in.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_in.js")
        case "fobo" :: "angular-locale_ml-in.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ml-in.js")
        case "fobo" :: "angular-locale_fr-nc.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-nc.js")
        case "fobo" :: "angular-locale_en-fj.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-fj.js")
        case "fobo" :: "angular-locale_en-ky.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-ky.js")
        case "fobo" :: "angular-locale_fr-bf.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-bf.js")
        case "fobo" :: "angular-locale_dav-ke.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dav-ke.js")
        case "fobo" :: "angular-locale_uz-cyrl.js" :: Nil        => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_uz-cyrl.js")
        case "fobo" :: "angular-locale_ar-qa.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ar-qa.js")
        case "fobo" :: "angular-locale_en.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en.js")
        case "fobo" :: "angular-locale_km-kh.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_km-kh.js")
        case "fobo" :: "angular-locale_aa.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_aa.js")
        case "fobo" :: "angular-locale_fil-ph.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fil-ph.js")
        case "fobo" :: "angular-locale_mn.js" :: Nil             => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mn.js")
        case "fobo" :: "angular-locale_nnh.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_nnh.js")
        case "fobo" :: "angular-locale_ca-it.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ca-it.js")
        case "fobo" :: "angular-locale_tn-za.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_tn-za.js")
        case "fobo" :: "angular-locale_en-mw.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-mw.js")
        case "fobo" :: "angular-locale_vun.js" :: Nil            => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_vun.js")
        case "fobo" :: "angular-locale_kam-ke.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_kam-ke.js")
        case "fobo" :: "angular-locale_en-vg.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_en-vg.js")
        case "fobo" :: "angular-locale_ak-gh.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ak-gh.js")
        case "fobo" :: "angular-locale_fr-ga.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-ga.js")
        case "fobo" :: "angular-locale_es-py.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-py.js")
        case "fobo" :: "angular-locale_dje-ne.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_dje-ne.js")
        case "fobo" :: "angular-locale_fr-ne.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_fr-ne.js")
        case "fobo" :: "angular-locale_mg-mg.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_mg-mg.js")
        case "fobo" :: "angular-locale_gsw-fr.js" :: Nil         => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_gsw-fr.js")
        case "fobo" :: "angular-locale_ia-fr.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_ia-fr.js")
        case "fobo" :: "angular-locale_es-bo.js" :: Nil          => List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_es-bo.js")
      }
    }
 
    
    lazy val angularjs1219 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.19", "js", "angular.js")
        case "fobo" :: "angular.js" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")
        case "fobo" :: "angular.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular.min.js.map")

        case "fobo" :: "angular-animate.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.19", "js", "angular-animate.js")
        case "fobo" :: "angular-animate.js" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular-animate.min.js")
        case "fobo" :: "angular-animate.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular-animate.min.js.map")

        case "fobo" :: "angular-cookies.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.19", "js", "angular-cookies.js")
        case "fobo" :: "angular-cookies.js" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular-cookies.min.js")
        case "fobo" :: "angular-cookies.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular-cookies.min.js.map")

        case "fobo" :: "angular-loader.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.19", "js", "angular-loader.js")
        case "fobo" :: "angular-loader.js" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular-loader.min.js")
        case "fobo" :: "angular-loader.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular.min-loader.js.map")
        //dev/test only
        case "fobo" :: "angular-mocks.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.19", "js", "angular-mocks.js")

        case "fobo" :: "angular-resource.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.19", "js", "angular-resource.js")
        case "fobo" :: "angular-resource.js" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular-resource.min.js")
        case "fobo" :: "angular-resource.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular-resource.min.js.map")
 
        case "fobo" :: "angular-route.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.19", "js", "angular-route.js")
        case "fobo" :: "angular-route.js" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular-route.min.js")
        case "fobo" :: "angular-route.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular-route.min.js.map")
 
        case "fobo" :: "angular-sanitize.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.19", "js", "angular-sanitize.js")
        case "fobo" :: "angular-sanitize.js" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular-sanitize.min.js")
        case "fobo" :: "angular-sanitize.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular-sanitize.min.js.map")
        //dev/test only 
        case "fobo" :: "angular-scenario.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.19", "js", "angular-scenario.js")
 
        case "fobo" :: "angular-touch.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.19", "js", "angular-touch.js")
        case "fobo" :: "angular-touch.js" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular-touch.min.js")
        case "fobo" :: "angular-touch.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.19", "js", "angular-touch.min.js.map")
        
        
        //CSS files
        case "fobo" :: "angular-csp.css" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.19", "css", "angular-csp.css")
        case "fobo" :: "angular-csp.css" :: Nil => List("fobo", "angular-js", "1.2.19", "css", "angular-csp.min.css")
       
      }
    }
    
    lazy val angularjs1219i18n = {
      ResourceServer.rewrite {
        //i18n files
        case "fobo" :: "angular-locale_nl-cw.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_nl-cw.js")
        case "fobo" :: "angular-locale_en-bz.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-bz.js")
        case "fobo" :: "angular-locale_en-pk.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-pk.js")
        case "fobo" :: "angular-locale_he.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_he.js")
        case "fobo" :: "angular-locale_sr-latn-ba.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sr-latn-ba.js")
        case "fobo" :: "angular-locale_fr-rw.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-rw.js")
        case "fobo" :: "angular-locale_de-ch.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_de-ch.js")
        case "fobo" :: "angular-locale_ar-iq.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-iq.js")
        case "fobo" :: "angular-locale_hu.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_hu.js")
        case "fobo" :: "angular-locale_fr-cg.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-cg.js")
        case "fobo" :: "angular-locale_en-ca.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-ca.js")
        case "fobo" :: "angular-locale_fr-bl.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-bl.js")
        case "fobo" :: "angular-locale_fa.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fa.js")
        case "fobo" :: "angular-locale_mr-in.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_mr-in.js")
        case "fobo" :: "angular-locale_sv-fi.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-fi.js")
        case "fobo" :: "angular-locale_it.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_it.js")
        case "fobo" :: "angular-locale_fr-cd.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-cd.js")
        case "fobo" :: "angular-locale_fr-sn.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-sn.js")
        case "fobo" :: "angular-locale_ar.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar.js")
        case "fobo" :: "angular-locale_is.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_is.js")
        case "fobo" :: "angular-locale_bg-bg.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_bg-bg.js")
        case "fobo" :: "angular-locale_fi.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fi.js")
        case "fobo" :: "angular-locale_bn-in.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_bn-in.js")
        case "fobo" :: "angular-locale_en-sg.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-sg.js")
        case "fobo" :: "angular-locale_zh-hant-tw.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zh-hant-tw.js")
        case "fobo" :: "angular-locale_fr-ch.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-ch.js")
        case "fobo" :: "angular-locale_en-fm.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-fm.js")
        case "fobo" :: "angular-locale_zh-tw.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zh-tw.js")
        case "fobo" :: "angular-locale_fr-ml.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-ml.js")
        case "fobo" :: "angular-locale_en-gu.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-gu.js")
        case "fobo" :: "angular-locale_sw-ke.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sw-ke.js")
        case "fobo" :: "angular-locale_pt.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_pt.js")
        case "fobo" :: "angular-locale_sk.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sk.js")
        case "fobo" :: "angular-locale_gu.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_gu.js")
        case "fobo" :: "angular-locale_ar-dz.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-dz.js")
        case "fobo" :: "angular-locale_zh-hant-hk.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zh-hant-hk.js")
        case "fobo" :: "angular-locale_et.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_et.js")
        case "fobo" :: "angular-locale_mt.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_mt.js")
        case "fobo" :: "angular-locale_pt-mz.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_pt-mz.js")
        case "fobo" :: "angular-locale_es-gq.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-gq.js")
        case "fobo" :: "angular-locale_es-ve.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-ve.js")
        case "fobo" :: "angular-locale_zh-hant.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zh-hant.js")
        case "fobo" :: "angular-locale_el-gr.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_el-gr.js")
        case "fobo" :: "angular-locale_it-it.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_it-it.js")
        case "fobo" :: "angular-locale_es-do.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-do.js")
        case "fobo" :: "angular-locale_hi-in.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_hi-in.js")
        case "fobo" :: "angular-locale_cs-cz.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_cs-cz.js")
        case "fobo" :: "angular-locale_hr-hr.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_hr-hr.js")
        case "fobo" :: "angular-locale_en-za.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-za.js")
        case "fobo" :: "angular-locale_el-cy.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_el-cy.js")
        case "fobo" :: "angular-locale_ur-in.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ur-in.js")
        case "fobo" :: "angular-locale_bn.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_bn.js")
        case "fobo" :: "angular-locale_zu-za.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zu-za.js")
        case "fobo" :: "angular-locale_ca.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ca.js")
        case "fobo" :: "angular-locale_sw.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sw.js")
        case "fobo" :: "angular-locale_en-ie.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-ie.js")
        case "fobo" :: "angular-locale_es-hn.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-hn.js")
        case "fobo" :: "angular-locale_es-cr.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-cr.js")
        case "fobo" :: "angular-locale_ar-jo.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-jo.js")
        case "fobo" :: "angular-locale_sr.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sr.js")
        case "fobo" :: "angular-locale_fr-lu.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-lu.js")
        case "fobo" :: "angular-locale_en-um.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-um.js")
        case "fobo" :: "angular-locale_ro-md.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ro-md.js")
        case "fobo" :: "angular-locale_zh-hans-hk.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zh-hans-hk.js")
        case "fobo" :: "angular-locale_fr-mg.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-mg.js")
        case "fobo" :: "angular-locale_ro.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ro.js")
        case "fobo" :: "angular-locale_es-ar.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-ar.js")
        case "fobo" :: "angular-locale_fr.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr.js")
        case "fobo" :: "angular-locale_it-sm.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_it-sm.js")
        case "fobo" :: "angular-locale_uk-ua.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_uk-ua.js")
        case "fobo" :: "angular-locale_pt-st.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_pt-st.js")
        case "fobo" :: "angular-locale_kn.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_kn.js")
        case "fobo" :: "angular-locale_sr-latn-me.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sr-latn-me.js")
        case "fobo" :: "angular-locale_en-pr.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-pr.js")
        case "fobo" :: "angular-locale_sl.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sl.js")
        case "fobo" :: "angular-locale_fr-dj.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-dj.js")
        case "fobo" :: "angular-locale_it-ch.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_it-ch.js")
        case "fobo" :: "angular-locale_fr-km.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-km.js")
        case "fobo" :: "angular-locale_sr-cyrl.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sr-cyrl.js")
        case "fobo" :: "angular-locale_gu-in.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_gu-in.js")
        case "fobo" :: "angular-locale_es-mx.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-mx.js")
        case "fobo" :: "angular-locale_bn-bd.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_bn-bd.js")
        case "fobo" :: "angular-locale_am-et.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_am-et.js")
        case "fobo" :: "angular-locale_sr-latn-rs.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sr-latn-rs.js")
        case "fobo" :: "angular-locale_sl-si.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sl-si.js")
        case "fobo" :: "angular-locale_am.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_am.js")
        case "fobo" :: "angular-locale_en-mt.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-mt.js")
        case "fobo" :: "angular-locale_ar-ma.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-ma.js")
        case "fobo" :: "angular-locale_te.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_te.js")
        case "fobo" :: "angular-locale_zh.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zh.js")
        case "fobo" :: "angular-locale_es-pr.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-pr.js")
        case "fobo" :: "angular-locale_ar-ye.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-ye.js")
        case "fobo" :: "angular-locale_de-be.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_de-be.js")
        case "fobo" :: "angular-locale_no.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_no.js")
        case "fobo" :: "angular-locale_el.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_el.js")
        case "fobo" :: "angular-locale_ca-ad.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ca-ad.js")
        case "fobo" :: "angular-locale_en-tc.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-tc.js")
        case "fobo" :: "angular-locale_es-ni.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-ni.js")
        case "fobo" :: "angular-locale_zh-hans-mo.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zh-hans-mo.js")
        case "fobo" :: "angular-locale_fr-td.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-td.js")
        case "fobo" :: "angular-locale_mt-mt.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_mt-mt.js")
        case "fobo" :: "angular-locale_en-us.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-us.js")
        case "fobo" :: "angular-locale_zh-hans-sg.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zh-hans-sg.js")
        case "fobo" :: "angular-locale_fr-be.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-be.js")
        case "fobo" :: "angular-locale_hr.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_hr.js")
        case "fobo" :: "angular-locale_fr-gn.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-gn.js")
        case "fobo" :: "angular-locale_es-ec.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-ec.js")
        case "fobo" :: "angular-locale_ta-lk.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ta-lk.js")
        case "fobo" :: "angular-locale_en-au.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-au.js")
        case "fobo" :: "angular-locale_id-id.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_id-id.js")
        case "fobo" :: "angular-locale_sw-tz.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sw-tz.js")
        case "fobo" :: "angular-locale_de-de.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_de-de.js")
        case "fobo" :: "angular-locale_sr-cyrl-me.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sr-cyrl-me.js")
        case "fobo" :: "angular-locale_ar-lb.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-lb.js")

      }
    }    
    
    lazy val angularjs1219i18n2 = {
      ResourceServer.rewrite {
        //i18n files
        case "fobo" :: "angular-locale_ar-tn.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-tn.js")
        case "fobo" :: "angular-locale_te-in.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_te-in.js")
        case "fobo" :: "angular-locale_ta-in.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ta-in.js")
        case "fobo" :: "angular-locale_es-cl.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-cl.js")
        case "fobo" :: "angular-locale_hu-hu.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_hu-hu.js")
        case "fobo" :: "angular-locale_ln-cg.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ln-cg.js")
        case "fobo" :: "angular-locale_fr-ca.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-ca.js")
        case "fobo" :: "angular-locale_he-il.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_he-il.js")
        case "fobo" :: "angular-locale_es-gt.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-gt.js")
        case "fobo" :: "angular-locale_id.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_id.js")
        case "fobo" :: "angular-locale_en-gy.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-gy.js")
        case "fobo" :: "angular-locale_ko-kr.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ko-kr.js")
        case "fobo" :: "angular-locale_ar-ly.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-ly.js")
        case "fobo" :: "angular-locale_ur-pk.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ur-pk.js")
        case "fobo" :: "angular-locale_ar-sa.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-sa.js")
        case "fobo" :: "angular-locale_en-mp.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-mp.js")
        case "fobo" :: "angular-locale_es-pe.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-pe.js")
        case "fobo" :: "angular-locale_fr-re.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-re.js")
        case "fobo" :: "angular-locale_uk.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_uk.js")
        case "fobo" :: "angular-locale_pt-ao.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_pt-ao.js")
        case "fobo" :: "angular-locale_zh-hans-cn.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zh-hans-cn.js")
        case "fobo" :: "angular-locale_lt.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_lt.js")
        case "fobo" :: "angular-locale_ta.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ta.js")
        case "fobo" :: "angular-locale_iw.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_iw.js")
        case "fobo" :: "angular-locale_fr-gq.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-gq.js")
        case "fobo" :: "angular-locale_es-us.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-us.js")
        case "fobo" :: "angular-locale_en-gb.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-gb.js")
        case "fobo" :: "angular-locale_en-mu.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-mu.js")
        case "fobo" :: "angular-locale_lv.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_lv.js")
        case "fobo" :: "angular-locale_fr-tg.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-tg.js")
        case "fobo" :: "angular-locale_pl-pl.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_pl-pl.js")
        case "fobo" :: "angular-locale_en-be.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-be.js")
        case "fobo" :: "angular-locale_gl.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_gl.js")
        case "fobo" :: "angular-locale_es-ic.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-ic.js")
        case "fobo" :: "angular-locale_en-pw.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-pw.js")
        case "fobo" :: "angular-locale_en-bw.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-bw.js")
        case "fobo" :: "angular-locale_gsw.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_gsw.js")
        case "fobo" :: "angular-locale_en-jm.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-jm.js")
        case "fobo" :: "angular-locale_ms-my.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ms-my.js")
        case "fobo" :: "angular-locale_mr.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_mr.js")
        case "fobo" :: "angular-locale_th.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_th.js")
        case "fobo" :: "angular-locale_ar-001.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-001.js")
        case "fobo" :: "angular-locale_es-co.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-co.js")
        case "fobo" :: "angular-locale_ln.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ln.js")
        case "fobo" :: "angular-locale_sk-sk.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sk-sk.js")
        case "fobo" :: "angular-locale_af.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_af.js")
        case "fobo" :: "angular-locale_de-li.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_de-li.js")
        case "fobo" :: "angular-locale_gsw-ch.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_gsw-ch.js")
        case "fobo" :: "angular-locale_nl-sx.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_nl-sx.js")
        case "fobo" :: "angular-locale_da.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_da.js")
        case "fobo" :: "angular-locale_sq-al.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sq-al.js")
        case "fobo" :: "angular-locale_zh-cn.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zh-cn.js")
        case "fobo" :: "angular-locale_en-ph.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-ph.js")
        case "fobo" :: "angular-locale_ru-md.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ru-md.js")
        case "fobo" :: "angular-locale_tl.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_tl.js")
        case "fobo" :: "angular-locale_zu.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zu.js")
        case "fobo" :: "angular-locale_et-ee.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_et-ee.js")
        case "fobo" :: "angular-locale_ar-ae.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-ae.js")
        case "fobo" :: "angular-locale_en-as.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-as.js")
        case "fobo" :: "angular-locale_tr-tr.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_tr-tr.js")
        case "fobo" :: "angular-locale_fr-mc.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-mc.js")
        case "fobo" :: "angular-locale_fa-af.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fa-af.js")
        case "fobo" :: "angular-locale_pl.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_pl.js")
        case "fobo" :: "angular-locale_en-zw.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-zw.js")
        case "fobo" :: "angular-locale_fil.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fil.js")
        case "fobo" :: "angular-locale_is-is.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_is-is.js")
        case "fobo" :: "angular-locale_es-pa.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-pa.js")
        case "fobo" :: "angular-locale_sv.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv.js")
        case "fobo" :: "angular-locale_fr-yt.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-yt.js")
        case "fobo" :: "angular-locale_de.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_de.js")
        case "fobo" :: "angular-locale_th-th.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_th-th.js")
        case "fobo" :: "angular-locale_en-bb.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-bb.js")
        case "fobo" :: "angular-locale_es.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es.js")
        case "fobo" :: "angular-locale_nl-be.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_nl-be.js")
        case "fobo" :: "angular-locale_kn-in.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_kn-in.js")
        case "fobo" :: "angular-locale_lv-lv.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_lv-lv.js")
        case "fobo" :: "angular-locale_en-mh.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-mh.js")
        case "fobo" :: "angular-locale_en-dsrt.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-dsrt.js")
        case "fobo" :: "angular-locale_en-dsrt-us.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-dsrt-us.js")
        case "fobo" :: "angular-locale_eu-es.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_eu-es.js")
        case "fobo" :: "angular-locale_ar-eg.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-eg.js")
        case "fobo" :: "angular-locale_es-sv.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-sv.js")
        case "fobo" :: "angular-locale_ca-es.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ca-es.js")
        case "fobo" :: "angular-locale_es-ea.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-ea.js")
        case "fobo" :: "angular-locale_sr-latn.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sr-latn.js")
        case "fobo" :: "angular-locale_fr-gf.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-gf.js")
        case "fobo" :: "angular-locale_gl-es.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_gl-es.js")
        case "fobo" :: "angular-locale_sq.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sq.js")
        case "fobo" :: "angular-locale_fr-gp.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-gp.js")
        case "fobo" :: "angular-locale_sr-cyrl-rs.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sr-cyrl-rs.js")
        case "fobo" :: "angular-locale_or-in.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_or-in.js")
        case "fobo" :: "angular-locale_ru.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ru.js")
        case "fobo" :: "angular-locale_hi.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_hi.js")
        case "fobo" :: "angular-locale_en-bm.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-bm.js")
        case "fobo" :: "angular-locale_de-lu.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_de-lu.js")
        case "fobo" :: "angular-locale_es-es.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-es.js")
        case "fobo" :: "angular-locale_tr.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_tr.js")
        case "fobo" :: "angular-locale_fr-bi.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-bi.js")
        case "fobo" :: "angular-locale_pt-gw.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_pt-gw.js")
        case "fobo" :: "angular-locale_af-na.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_af-na.js")
        case "fobo" :: "angular-locale_ur.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ur.js")
        case "fobo" :: "angular-locale_en-vi.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-vi.js")
        case "fobo" :: "angular-locale_pt-br.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_pt-br.js")
        case "fobo" :: "angular-locale_da-dk.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_da-dk.js")
        case "fobo" :: "angular-locale_ar-sd.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-sd.js")
        case "fobo" :: "angular-locale_fa-ir.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fa-ir.js")
        case "fobo" :: "angular-locale_nl-nl.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_nl-nl.js")
        case "fobo" :: "angular-locale_ms-bn.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ms-bn.js")
        case "fobo" :: "angular-locale_fr-bj.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-bj.js")
        case "fobo" :: "angular-locale_or.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_or.js")
        case "fobo" :: "angular-locale_nl.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_nl.js")
        case "fobo" :: "angular-locale_en-hk.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-hk.js")
        case "fobo" :: "angular-locale_zh-hans.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zh-hans.js")
        case "fobo" :: "angular-locale_sv-se.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")
        case "fobo" :: "angular-locale_ru-ua.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ru-ua.js")
        case "fobo" :: "angular-locale_ar-sy.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-sy.js")
        case "fobo" :: "angular-locale_fr-mq.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-mq.js")
        case "fobo" :: "angular-locale_ro-ro.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ro-ro.js")
        case "fobo" :: "angular-locale_ja-jp.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ja-jp.js")
        case "fobo" :: "angular-locale_fr-cf.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-cf.js")
        case "fobo" :: "angular-locale_ja.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ja.js")
        case "fobo" :: "angular-locale_ko.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ko.js")
        case "fobo" :: "angular-locale_fr-cm.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-cm.js")
        case "fobo" :: "angular-locale_eu.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_eu.js")
        case "fobo" :: "angular-locale_en-in.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-in.js")
        case "fobo" :: "angular-locale_sr-cyrl-ba.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sr-cyrl-ba.js")
        case "fobo" :: "angular-locale_en-nz.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-nz.js")
        case "fobo" :: "angular-locale_de-at.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_de-at.js")
        case "fobo" :: "angular-locale_cs.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_cs.js")
        case "fobo" :: "angular-locale_vi.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_vi.js")
        case "fobo" :: "angular-locale_fr-fr.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-fr.js")
        case "fobo" :: "angular-locale_pt-pt.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_pt-pt.js")
        case "fobo" :: "angular-locale_vi-vn.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_vi-vn.js")
        case "fobo" :: "angular-locale_ar-kw.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-kw.js")
        case "fobo" :: "angular-locale_es-uy.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-uy.js")
        case "fobo" :: "angular-locale_bg.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_bg.js")
        case "fobo" :: "angular-locale_nl-aw.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_nl-aw.js")
        case "fobo" :: "angular-locale_en-na.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-na.js")
        case "fobo" :: "angular-locale_af-za.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_af-za.js")
        case "fobo" :: "angular-locale_lt-lt.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_lt-lt.js")
        case "fobo" :: "angular-locale_zh-hk.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zh-hk.js")
        case "fobo" :: "angular-locale_fi-fi.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fi-fi.js")
        case "fobo" :: "angular-locale_en-iso.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-iso.js")
        case "fobo" :: "angular-locale_ar-om.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-om.js")
        case "fobo" :: "angular-locale_zh-hant-mo.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_zh-hant-mo.js")
        case "fobo" :: "angular-locale_ln-cd.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ln-cd.js")
        case "fobo" :: "angular-locale_fr-ci.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-ci.js")
        case "fobo" :: "angular-locale_ms.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ms.js")
        case "fobo" :: "angular-locale_fr-mf.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-mf.js")
        case "fobo" :: "angular-locale_ar-bh.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-bh.js")
        case "fobo" :: "angular-locale_en-tt.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-tt.js")
        case "fobo" :: "angular-locale_ml.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ml.js")
        case "fobo" :: "angular-locale_ru-ru.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ru-ru.js")
        case "fobo" :: "angular-locale_es-419.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-419.js")
        case "fobo" :: "angular-locale_in.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_in.js")
        case "fobo" :: "angular-locale_ml-in.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ml-in.js")
        case "fobo" :: "angular-locale_fr-bf.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-bf.js")
        case "fobo" :: "angular-locale_ar-qa.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_ar-qa.js")
        case "fobo" :: "angular-locale_en.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en.js")
        case "fobo" :: "angular-locale_fil-ph.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fil-ph.js")
        case "fobo" :: "angular-locale_en-vg.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_en-vg.js")
        case "fobo" :: "angular-locale_fr-ga.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-ga.js")
        case "fobo" :: "angular-locale_es-py.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-py.js")
        case "fobo" :: "angular-locale_fr-ne.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_fr-ne.js")
        case "fobo" :: "angular-locale_es-bo.js" :: Nil => List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_es-bo.js")        
      }
    }    

    lazy val angularjs1211 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.11", "js", "angular.js")
        case "fobo" :: "angular.js" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular.min.js")
        case "fobo" :: "angular.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular.min.js.map")

        case "fobo" :: "angular-animate.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.11", "js", "angular-animate.js")
        case "fobo" :: "angular-animate.js" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular-animate.min.js")
        case "fobo" :: "angular-animate.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular-animate.min.js.map")

        case "fobo" :: "angular-cookies.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.11", "js", "angular-cookies.js")
        case "fobo" :: "angular-cookies.js" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular-cookies.min.js")
        case "fobo" :: "angular-cookies.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular-cookies.min.js.map")

        case "fobo" :: "angular-loader.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.11", "js", "angular-loader.js")
        case "fobo" :: "angular-loader.js" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular-loader.min.js")
        case "fobo" :: "angular-loader.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular.min-loader.js.map")
        //dev/test only
        case "fobo" :: "angular-mocks.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.11", "js", "angular-mocks.js")

        case "fobo" :: "angular-resource.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.11", "js", "angular-resource.js")
        case "fobo" :: "angular-resource.js" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular-resource.min.js")
        case "fobo" :: "angular-resource.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular-resource.min.js.map")
 
        case "fobo" :: "angular-route.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.11", "js", "angular-route.js")
        case "fobo" :: "angular-route.js" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular-route.min.js")
        case "fobo" :: "angular-route.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular-route.min.js.map")
 
        case "fobo" :: "angular-sanitize.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.11", "js", "angular-sanitize.js")
        case "fobo" :: "angular-sanitize.js" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular-sanitize.min.js")
        case "fobo" :: "angular-sanitize.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular-sanitize.min.js.map")
        //dev/test only 
        case "fobo" :: "angular-scenario.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.11", "js", "angular-scenario.js")
 
        case "fobo" :: "angular-touch.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.11", "js", "angular-touch.js")
        case "fobo" :: "angular-touch.js" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular-touch.min.js")
        case "fobo" :: "angular-touch.min.js.map" :: Nil => List("fobo", "angular-js", "1.2.11", "js", "angular-touch.min.js.map")
        
        
        //CSS files
        case "fobo" :: "angular-csp.css" :: Nil if Props.devMode => List("fobo", "angular-js", "1.2.11", "css", "angular-csp.css")
        case "fobo" :: "angular-csp.css" :: Nil => List("fobo", "angular-js", "1.2.11", "css", "angular-csp.min.css")
       
      }
    }  
    
    
    lazy val angularjs1211i18n = {
      ResourceServer.rewrite {
     
        //i18n files
        case "fobo" :: "angular-locale_af.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_af.js")
        //angular-locale_af-na
        case "fobo" :: "angular-locale_af-na.js" :: Nil => List("fobo", "angular-js", "1.2.1", "i18n", "angular-locale_af-na.js")
        //angular-locale_af-za
        case "fobo" :: "angular-locale_af-za.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_af-za.js")
        //angular-locale_am
        case "fobo" :: "angular-locale_am.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_am.js")
        //angular-locale_am-et
        case "fobo" :: "angular-locale_am-et.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_am-et.js")
        //angular-locale_ar
        case "fobo" :: "angular-locale_ar.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar.js")
        //angular-locale_ar-001
        case "fobo" :: "angular-locale_ar-001.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-001.js")
        //angular-locale_ar-ae
        case "fobo" :: "angular-locale_ar-ae.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-ae.js")
        //angular-locale_ar-bh
        case "fobo" :: "angular-locale_ar-bh.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-bh.js")
        //angular-locale_ar-dz
        case "fobo" :: "angular-locale_ar-dz.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-dz.js")
        //angular-locale_ar-eg
        case "fobo" :: "angular-locale_ar-eg.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-eg.js")
        //angular-locale_ar-iq
        case "fobo" :: "angular-locale_ar-iq.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-iq.js")
        //angular-locale_ar-jo
        case "fobo" :: "angular-locale_ar-jo.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-jo.js")
        //angular-locale_ar-kw
        case "fobo" :: "angular-locale_ar-kw.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-kw.js")
        //angular-locale_ar-lb
        case "fobo" :: "angular-locale_ar-lb.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-lb.js")
        //angular-locale_ar-ly
        case "fobo" :: "angular-locale_ar-ly.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-ly.js")
        //angular-locale_ar-ma
        case "fobo" :: "angular-locale_ar-ma.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-ma.js")
        //angular-locale_ar-om
        case "fobo" :: "angular-locale_ar-om.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-om.js")
        //angular-locale_ar-qa
        case "fobo" :: "angular-locale_ar-qa.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-qa.js")
        //angular-locale_ar-sa
        case "fobo" :: "angular-locale_ar-sa.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-sa.js")
        //angular-locale_ar-sd
        case "fobo" :: "angular-locale_ar-sd.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-sd.js")
        //angular-locale_ar-sy
        case "fobo" :: "angular-locale_ar-sy.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-sy.js")
        //angular-locale_ar-tn
        case "fobo" :: "angular-locale_tn.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_tn.js")
        //angular-locale_ar-ye
        case "fobo" :: "angular-locale_ar-tn.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ar-tn.js")
        //angular-locale_bg
        case "fobo" :: "angular-locale_bg.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_bg.js")
        //angular-locale_bg-bg
        case "fobo" :: "angular-locale_bg-bg.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_bg-bg.js")
        //angular-locale_bn
        case "fobo" :: "angular-locale_bn.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_bn.js")
        //angular-locale_bn-bd
        case "fobo" :: "angular-locale_bn-bd.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_bn-bd.js")
        //angular-locale_bn-in
        case "fobo" :: "angular-locale_bn-in.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_bn-in.js")
        //angular-locale_ca
        case "fobo" :: "angular-locale_ca.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ca.js")
        //angular-locale_ca-ad
        case "fobo" :: "angular-locale_ca-ad.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ca-ad.js")
        //angular-locale_ca-es
        case "fobo" :: "angular-locale_ca-es.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ca-es.js")
        //angular-locale_cs
        case "fobo" :: "angular-locale_cs.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_cs.js")
        //angular-locale_cs-cz
        case "fobo" :: "angular-locale_cs-cz.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_cs-cz.js")
        //angular-locale_da
        case "fobo" :: "angular-locale_da.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_da.js")
        //angular-locale_da-dk
        case "fobo" :: "angular-locale_da-dk.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_da-dk.js")
        //angular-locale_de
        case "fobo" :: "angular-locale_de.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_de.js")
        //angular-locale_de-at
        case "fobo" :: "angular-locale_de-at.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_de-at.js")
        //angular-locale_de-be
        case "fobo" :: "angular-locale_de-be.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_de-be.js")
        //angular-locale_de-ch
        case "fobo" :: "angular-locale_de-ch.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_de-ch.js")
        //angular-locale_de-de
        case "fobo" :: "angular-locale_de-de.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_de-de.js")
        //angular-locale_de-li
        case "fobo" :: "angular-locale_de-li.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_de-li.js")
        //angular-locale_de-lu
        case "fobo" :: "angular-locale_de-lu.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_de-lu.js")
        //angular-locale_el
        case "fobo" :: "angular-locale_el.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_el.js")
        //angular-locale_el-cy
        case "fobo" :: "angular-locale_el-cy.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_el-cy.js")
        //angular-locale_el-gr
        case "fobo" :: "angular-locale_el-gr.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_el-gr.js")
        //angular-locale_en
        case "fobo" :: "angular-locale_en.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en.js")
        //angular-locale_en-as
        case "fobo" :: "angular-locale_en-as.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-as.js")
        //angular-locale_en-au
        case "fobo" :: "angular-locale_en-au.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-au.js")
        //angular-locale_en-bb
        case "fobo" :: "angular-locale_en-bb.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-bb.js")
        //angular-locale_en-be
        case "fobo" :: "angular-locale_en-be.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-be.js")
        //angular-locale_en-bm
        case "fobo" :: "angular-locale_en-bm.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-bm.js")
        //angular-locale_en-bw
        case "fobo" :: "angular-locale_en-bw.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-bw.js")
        //angular-locale_en-bz
        case "fobo" :: "angular-locale_en-bz.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-bz.js")
        //angular-locale_en-ca
        case "fobo" :: "angular-locale_en-ca.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-ca.js")
        //angular-locale_en-dsrt
        case "fobo" :: "angular-locale_en-dsrt.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-dsrt.js")
        //angular-locale_en-dsrt-us
        case "fobo" :: "angular-locale_en-dsrt-us.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-dsrt-us.js")
        //angular-locale_en-fm
        case "fobo" :: "angular-locale_en-fm.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-fm.js")
        //angular-locale_en-gb
        case "fobo" :: "angular-locale_en-gb.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-gb.js")
        //angular-locale_en-gu
        case "fobo" :: "angular-locale_en-gu.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-gu.js")
        //angular-locale_en-gy
        case "fobo" :: "angular-locale_en-gy.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-gy.js")
        //angular-locale_en-hk
        case "fobo" :: "angular-locale_en-hk.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-hk.js")
        //angular-locale_en-ie
        case "fobo" :: "angular-locale_en-ie.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-ie.js")
        //angular-locale_en-in
        case "fobo" :: "angular-locale_en-in.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-in.js")
        //angular-locale_en-iso
        case "fobo" :: "angular-locale_en-iso.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-iso.js")
        //angular-locale_en-jm
        case "fobo" :: "angular-locale_en-jm.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-jm.js")
        //angular-locale_en-mh
        case "fobo" :: "angular-locale_en-mh.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-mh.js")
        //angular-locale_en-mp
        case "fobo" :: "angular-locale_en-mp.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-mp.js")
        //angular-locale_en-mt
        case "fobo" :: "angular-locale_en-mt.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-mt.js")
        //angular-locale_en-mu
        case "fobo" :: "angular-locale_en-mu.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-mu.js")
        //angular-locale_en-na
        case "fobo" :: "angular-locale_en-na.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-na.js")
        //angular-locale_en-nz
        case "fobo" :: "angular-locale_en-nz.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-nz.js")
        //angular-locale_en-ph
        case "fobo" :: "angular-locale_en-ph.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-ph.js")
        //angular-locale_en-pk
        case "fobo" :: "angular-locale_en-pk.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-pk.js")
        //angular-locale_en-pr
        case "fobo" :: "angular-locale_en-pr.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-pr.js")
        //angular-locale_en-pw
        case "fobo" :: "angular-locale_en-pw.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-pw.js")
        //angular-locale_en-sg
        case "fobo" :: "angular-locale_en-sg.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-sg.js")
        //angular-locale_en-tc
        case "fobo" :: "angular-locale_en-tc.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-tc.js")
        //angular-locale_en-tt
        case "fobo" :: "angular-locale_en-tt.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-tt.js")
        //angular-locale_en-um
        case "fobo" :: "angular-locale_en-um.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-um.js")
        //angular-locale_en-us
        case "fobo" :: "angular-locale_en-us.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-us.js")
        //angular-locale_en-vg
        case "fobo" :: "angular-locale_en-vg.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-vg.js")
        //angular-locale_en-vi
        case "fobo" :: "angular-locale_en-vi.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-vi.js")
        //angular-locale_en-za
        case "fobo" :: "angular-locale_en-za.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-za.js")
        //angular-locale_en-zw
        case "fobo" :: "angular-locale_en-zw.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_en-zw.js")
        //angular-locale_es
        case "fobo" :: "angular-locale_es.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es.js")
        //angular-locale_es-419
        case "fobo" :: "angular-locale_es-419.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-419.js")
        //angular-locale_es-ar
        case "fobo" :: "angular-locale_es-ar.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-ar.js")
        //angular-locale_es-bo
        case "fobo" :: "angular-locale_es-bo.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-bo.js")
        //angular-locale_es-cl
        case "fobo" :: "angular-locale_es-cl.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-cl.js")
        //angular-locale_es-co
        case "fobo" :: "angular-locale_es-co.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-co.js")
        //angular-locale_es-cr
        case "fobo" :: "angular-locale_es-cr.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-cr.js")
        //angular-locale_es-do
        case "fobo" :: "angular-locale_es-do.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-do.js")
        //angular-locale_es-ea
        case "fobo" :: "angular-locale_es-ea.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-ea.js")
        //angular-locale_es-ec
        case "fobo" :: "angular-locale_es-ec.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-ec.js")
        //angular-locale_es-es
        case "fobo" :: "angular-locale_es-es.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-es.js")
        //angular-locale_es-gq
        case "fobo" :: "angular-locale_es-gq.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-gq.js")
        //angular-locale_es-gt
        case "fobo" :: "angular-locale_es-gt.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-gt.js")
        //angular-locale_es-hn
        case "fobo" :: "angular-locale_es-hn.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-hn.js")
        //angular-locale_es-ic
        case "fobo" :: "angular-locale_es-ic.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-ic.js")
        //angular-locale_es-mx
        case "fobo" :: "angular-locale_es-mx.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-mx.js")
        //angular-locale_es-ni
        case "fobo" :: "angular-locale_es-ni.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-ni.js")
        //angular-locale_es-pa
        case "fobo" :: "angular-locale_es-pa.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-pa.js")
        //angular-locale_es-pe
        case "fobo" :: "angular-locale_es-pe.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-pe.js")
        //angular-locale_es-pr
        case "fobo" :: "angular-locale_es-pr.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-pr.js")
        //angular-locale_es-py
        case "fobo" :: "angular-locale_es-py.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-py.js")
        //angular-locale_es-sv
        case "fobo" :: "angular-locale_es-sv.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-sv.js")
        //angular-locale_es-us
        case "fobo" :: "angular-locale_es-us.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-us.js")
        //angular-locale_es-uy
        case "fobo" :: "angular-locale_es-uy.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-uy.js")
        //angular-locale_es-ve
        case "fobo" :: "angular-locale_es-ve.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_es-ve.js")
        //angular-locale_et
        case "fobo" :: "angular-locale_et.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_et.js")
        //angular-locale_et-ee
        case "fobo" :: "angular-locale_et-ee.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_et-ee.js")
        //angular-locale_eu
        case "fobo" :: "angular-locale_eu.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_eu.js")
        //angular-locale_eu-es
        case "fobo" :: "angular-locale_eu-es.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_eu-es.js")
        //angular-locale_fa
        case "fobo" :: "angular-locale_fa.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fa.js")
        //angular-locale_fa-af
        case "fobo" :: "angular-locale_fa-af.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fa-af.js")
        //angular-locale_fa-ir
        case "fobo" :: "angular-locale_fa-ir.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fa-ir.js")
        //angular-locale_fi
        case "fobo" :: "angular-locale_fi.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fi.js")
        //angular-locale_fi-fi
        case "fobo" :: "angular-locale_fi-fi.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fi-fi.js")
        //angular-locale_fil
        case "fobo" :: "angular-locale_fil.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fil.js")
        //angular-locale_fil-ph
        case "fobo" :: "angular-locale_fil-ph.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fil-ph.js")
        //angular-locale_fr
        case "fobo" :: "angular-locale_fil-fr.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr.js")
        //angular-locale_fr-be
        case "fobo" :: "angular-locale_fr-be.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-be.js")
        //angular-locale_fr-bf
        case "fobo" :: "angular-locale_fr-bf.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-bf.js")
        //angular-locale_fr-bi
        case "fobo" :: "angular-locale_fr-bi.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-bi.js")
        //angular-locale_fr-bj
        case "fobo" :: "angular-locale_fr-bj.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-bj.js")
        //angular-locale_fr-bl
        case "fobo" :: "angular-locale_fr-bl.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-bl.js")
        //angular-locale_fr-ca
        case "fobo" :: "angular-locale_fr-ca.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-ca.js")
        //angular-locale_fr-cd
        case "fobo" :: "angular-locale_fr-cd.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-cd.js")
        //angular-locale_fr-cf
        case "fobo" :: "angular-locale_fr-cf.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-cf.js")
        //angular-locale_fr-cg
        case "fobo" :: "angular-locale_fr-cg.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-cg.js")
        //angular-locale_fr-ch
        case "fobo" :: "angular-locale_fr-ch.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-ch.js")
        //angular-locale_fr-ci
        case "fobo" :: "angular-locale_fr-ci.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-ci.js")
        //angular-locale_fr-cm
        case "fobo" :: "angular-locale_fr-cm.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-cm.js")
        //angular-locale_fr-dj
        case "fobo" :: "angular-locale_fr-dj.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-dj.js")
        //angular-locale_fr-fr
        case "fobo" :: "angular-locale_fr-fr.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-fr.js")
        //angular-locale_fr-ga
        case "fobo" :: "angular-locale_fr-ga.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-ga.js")
        //angular-locale_fr-gf
        case "fobo" :: "angular-locale_fr-gf.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-gf.js")
        //angular-locale_fr-gn
        case "fobo" :: "angular-locale_fr-gn.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-gn.js")
        //angular-locale_fr-gp
        case "fobo" :: "angular-locale_fr-gp.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-gp.js")
        //angular-locale_fr-gq
        case "fobo" :: "angular-locale_fr-gq.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-gq.js")
        //angular-locale_fr-km
        case "fobo" :: "angular-locale_fr-km.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-km.js")
        //angular-locale_fr-lu
        case "fobo" :: "angular-locale_fr-lu.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-lu.js")
        //angular-locale_fr-mc
        case "fobo" :: "angular-locale_fr-mc.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-mc.js")
        //angular-locale_fr-mf
        case "fobo" :: "angular-locale_fr-mf.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-mf.js")
        //angular-locale_fr-mg
        case "fobo" :: "angular-locale_fr-mg.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-mg.js")
        //angular-locale_fr-ml
        case "fobo" :: "angular-locale_fr-ml.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-ml.js")
        //angular-locale_fr-mq
        case "fobo" :: "angular-locale_fr-mq.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-mq.js")
        //angular-locale_fr-ne
        case "fobo" :: "angular-locale_fr-ne.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-ne.js")
        //angular-locale_fr-re
        case "fobo" :: "angular-locale_fr-re.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-re.js")
        //angular-locale_fr-yt
        case "fobo" :: "angular-locale_fr-yt.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_fr-yt.js")
        //angular-locale_gl
        case "fobo" :: "angular-locale_gl.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_gl.js")
        //angular-locale_gl-es
        case "fobo" :: "angular-locale_gl-es.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_gl-es.js")
        //angular-locale_gsw
        case "fobo" :: "angular-locale_gsw.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_gsw.js")
        //angular-locale_gsw-ch
        case "fobo" :: "angular-locale_gsw-ch.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_gsw-ch.js")
        //angular-locale_gu
        case "fobo" :: "angular-locale_gu.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_gu.js")
        //angular-locale_gu-in
        case "fobo" :: "angular-locale_gu-in.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_gu-in.js")
        //angular-locale_he
        case "fobo" :: "angular-locale_he.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_he.js")
        //angular-locale_he-il
        case "fobo" :: "angular-locale_he-il.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_he-il.js")
        //angular-locale_hi
        case "fobo" :: "angular-locale_hi.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_hi.js")
        //angular-locale_hi-in
        case "fobo" :: "angular-locale_hi-in.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_hi-in.js")
        //angular-locale_hr
        case "fobo" :: "angular-locale_hr.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_hr.js")
        //angular-locale_hr-hr
        case "fobo" :: "angular-locale_hr-hr.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_hr-hr.js")
        //angular-locale_hu
        case "fobo" :: "angular-locale_hu.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_hu.js")
        //angular-locale_hu-hu
        case "fobo" :: "angular-locale_hu-hu.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_hu-hu.js")
        //angular-locale_id
        case "fobo" :: "angular-locale_id.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_id.js")
        //angular-locale_id-id
        case "fobo" :: "angular-locale_id-id.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_id-id.js")
        //angular-locale_in
        case "fobo" :: "angular-locale_in.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_in.js")
        //angular-locale_is
        case "fobo" :: "angular-locale_is.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_is.js")
        //angular-locale_is-is
        case "fobo" :: "angular-locale_is-is.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_is-is.js")
        //angular-locale_it
        case "fobo" :: "angular-locale_it.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_it.js")
        //angular-locale_it-it
        case "fobo" :: "angular-locale_it-it.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_it-it.js")
        //angular-locale_it-sm
        case "fobo" :: "angular-locale_it-sm.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_it-sm.js")
        //angular-locale_iw
        case "fobo" :: "angular-locale_iw.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_iw.js")
        //angular-locale_ja
        case "fobo" :: "angular-locale_ja.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ja.js")
        //angular-locale_ja-jp
        case "fobo" :: "angular-locale_ja-jp.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ja-jp.js")
        //angular-locale_kn
        case "fobo" :: "angular-locale_kn.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_kn.js")
        //angular-locale_kn-in
        case "fobo" :: "angular-locale_kn-in.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_kn-in.js")
        //angular-locale_ko
        case "fobo" :: "angular-locale_ko.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ko.js")
        //angular-locale_ko-kr
        case "fobo" :: "angular-locale_ko-kr.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ko-kr.js")
        //angular-locale_ln
        case "fobo" :: "angular-locale_ln.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ln.js")
        //angular-locale_ln-cd
        case "fobo" :: "angular-locale_ln-cd.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ln-cd.js")
        //angular-locale_lt
        case "fobo" :: "angular-locale_lt.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_lt.js")
        //angular-locale_lt-lt
        case "fobo" :: "angular-locale_lt-lt.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_lt-lt.js")
        //angular-locale_lv
        case "fobo" :: "angular-locale_lv.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_lv.js")
        //angular-locale_lv-lv
        case "fobo" :: "angular-locale_lv-lv.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_lv-lv.js")
        //angular-locale_ml
        case "fobo" :: "angular-locale_ml.js" :: Nil => List("fobo", "angular-js", "1.2.1", "i18n", "angular-locale_ml.js")
        //angular-locale_ml-in
        case "fobo" :: "angular-locale_ml-in.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ml-in.js")
        //angular-locale_mr
        case "fobo" :: "angular-locale_mr.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_mr.js")
        //angular-locale_mr-in
        case "fobo" :: "angular-locale_mr-in.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_mr-in.js")
        //angular-locale_ms
        case "fobo" :: "angular-locale_ms.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ms.js")
        //angular-locale_ms-my
        case "fobo" :: "angular-locale_ms-my.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ms-my.js")
        //angular-locale_mt
        case "fobo" :: "angular-locale_mt.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_mt.js")
        //angular-locale_mt-mt
        case "fobo" :: "angular-locale_mt-mt.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_mt-mt.js")
        //angular-locale_nl
        case "fobo" :: "angular-locale_nl.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_nl.js")
        //angular-locale_nl-cw
        case "fobo" :: "angular-locale_nl-cw.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_nl-cw.js")
        //angular-locale_nl-nl
        case "fobo" :: "angular-locale_nl-nl.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_nl-nl.js")
        //angular-locale_nl-sx
        case "fobo" :: "angular-locale_nl-sx.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_nl-sx.js")
        //angular-locale_no
        case "fobo" :: "angular-locale_no.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_no.js")
        //angular-locale_or
        case "fobo" :: "angular-locale_or.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_or.js")
        //angular-locale_or-in
        case "fobo" :: "angular-locale_or-in.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_or-in.js")
        //angular-locale_pl
        case "fobo" :: "angular-locale_pl.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_pl.js")
        //angular-locale_pl-pl
        case "fobo" :: "angular-locale_pl-pl.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_pl-pl.js")
        //angular-locale_pt
        case "fobo" :: "angular-locale_pt.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_pt.js")
        //angular-locale_pt-br
        case "fobo" :: "angular-locale_pt-br.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_pt-br.js")
        //angular-locale_pt-pt
        case "fobo" :: "angular-locale_pt-pt.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_pt-pt.js")
        //angular-locale_ro
        case "fobo" :: "angular-locale_ro.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ro.js")
        //angular-locale_ro-ro
        case "fobo" :: "angular-locale_ro-ro.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ro-ro.js")
        //angular-locale_ru
        case "fobo" :: "angular-locale_ru.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ru.js")
        //angular-locale_ru-ru
        case "fobo" :: "angular-locale_ru-ru.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ru-ru.js")
        //angular-locale_sk
        case "fobo" :: "angular-locale_sk.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_sk.js")
        //angular-locale_sk-sk
        case "fobo" :: "angular-locale_sk-sk.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_sk-sk.js")
        //angular-locale_sl
        case "fobo" :: "angular-locale_sl.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_sl.js")
        //angular-locale_sl-si
        case "fobo" :: "angular-locale_sl-si.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_sl-si.js")
        //angular-locale_sq
        case "fobo" :: "angular-locale_sq.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_sq.js")
        //angular-locale_sq-al
        case "fobo" :: "angular-locale_sq-al.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_sq-al.js")
        //angular-locale_sr
        case "fobo" :: "angular-locale_sr.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_sr.js")
        //angular-locale_sr-cyrl-rs
        case "fobo" :: "angular-locale_sr-cyrl-rs.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_sr-cyrl-rs.js")
        //angular-locale_sr-latn-rs
        case "fobo" :: "angular-locale_sr-latn-rs.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_sr-latn-rs.js")
        //angular-locale_sv
        case "fobo" :: "angular-locale_sv.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_sv.js")
        //angular-locale_sv-se
        case "fobo" :: "angular-locale_sv-se.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_sv-se.js")
        //angular-locale_sw
        case "fobo" :: "angular-locale_sw.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_sw.js")
        //angular-locale_sw-tz
        case "fobo" :: "angular-locale_sw-tz.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_sw-tz.js")
        //angular-locale_ta
        case "fobo" :: "angular-locale_ta.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ta.js")
        //angular-locale_ta-in
        case "fobo" :: "angular-locale_ta-in.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ta-in.js")
        //angular-locale_te
        case "fobo" :: "angular-locale_te.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_te.js")
        //angular-locale_te-in
        case "fobo" :: "angular-locale_te-in.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_te-in.js")
        //angular-locale_th
        case "fobo" :: "angular-locale_th.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_th.js")
        //angular-locale_th-th
        case "fobo" :: "angular-locale_th-th.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_th-th.js")
        //angular-locale_tl
        case "fobo" :: "angular-locale_tl.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_tl.js")
        //angular-locale_tr
        case "fobo" :: "angular-locale_tr.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_tr.js")
        //angular-locale_tr-tr
        case "fobo" :: "angular-locale_tr-tr.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_tr-tr.js")
        //angular-locale_uk
        case "fobo" :: "angular-locale_uk.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_uk.js")
        //angular-locale_uk-ua
        case "fobo" :: "angular-locale_uk-ua.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_uk-ua.js")
        //angular-locale_ur
        case "fobo" :: "angular-locale_ur.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ur.js")
        //angular-locale_ur-pk
        case "fobo" :: "angular-locale_ur-pk.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_ur-pk.js")
        //angular-locale_vi
        case "fobo" :: "angular-locale_vi.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_vi.js")
        //angular-locale_vi-vn
        case "fobo" :: "angular-locale_vi-vn.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_vi-vn.js")
        //angular-locale_zh
        case "fobo" :: "angular-locale_zh.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_zh.js")
        //angular-locale_zh-cn
        case "fobo" :: "angular-locale_zh-cn.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_zh-cn.js")
        //angular-locale_zh-hans-cn
        case "fobo" :: "angular-locale_zh-hans-cn.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_zh-hans-cn.js")
        //angular-locale_zh-hk
        case "fobo" :: "angular-locale_zh-hk.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_zh-hk.js")
        //angular-locale_zh-tw
        case "fobo" :: "angular-locale_zh-tw.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_zh-tw.js")
        //angular-locale_zu
        case "fobo" :: "angular-locale_zu.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_zu.js")
        //angular-locale_zu-za
        case "fobo" :: "angular-locale_zu-za.js" :: Nil => List("fobo", "angular-js", "1.2.11", "i18n", "angular-locale_zu-za.js")        
        
      }
    }          
    
    lazy val uibootstrap0100 = {
      ResourceServer.rewrite {
        case "fobo" :: "ui-bootstrap.js" :: Nil if Props.devMode => List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-0.10.0.js")
        case "fobo" :: "ui-bootstrap.js" :: Nil => List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-0.10.0.min.js")
        case "fobo" :: "ui-bootstrap-tpls.js" :: Nil if Props.devMode => List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-tpls-0.10.0.js")
        case "fobo" :: "ui-bootstrap-tpls.js" :: Nil => List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-tpls-0.10.0.min.js")
      }
    }
    
    
    lazy val uibootstrap070 = {
      ResourceServer.rewrite {
        case "fobo" :: "ui-bootstrap.js" :: Nil if Props.devMode => List("fobo", "angular-ui", "bootstrap", "0.7.0", "js", "ui-bootstrap-0.7.0.js")
        case "fobo" :: "ui-bootstrap.js" :: Nil => List("fobo", "angular-ui", "bootstrap", "0.7.0", "js", "ui-bootstrap-0.7.0.min.js")
        case "fobo" :: "ui-bootstrap-tpls.js" :: Nil if Props.devMode => List("fobo", "angular-ui", "bootstrap", "0.7.0", "js", "ui-bootstrap-tpls-0.7.0.js")
        case "fobo" :: "ui-bootstrap-tpls.js" :: Nil => List("fobo", "angular-ui", "bootstrap", "0.7.0", "js", "ui-bootstrap-tpls-0.7.0.min.js")
      }
    }
    
    lazy val uibootstrap020 = {
      ResourceServer.rewrite {
        case "fobo" :: "ui-bootstrap.js" :: Nil if Props.devMode => List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-0.2.0.js")
        case "fobo" :: "ui-bootstrap.js" :: Nil => List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-0.2.0.min.js")
        case "fobo" :: "ui-bootstrap-tpls.js" :: Nil if Props.devMode => List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-tpls-0.2.0.js")
        case "fobo" :: "ui-bootstrap-tpls.js" :: Nil => List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-tpls-0.2.0.min.js")
      }
    }
    
    lazy val nggrid207 = {
      ResourceServer.rewrite {
        case "fobo" :: "ng-grid.js" :: Nil if Props.devMode => List("fobo", "angular-ui", "ng-grid", "2.0.7", "js", "ng-grid-2.0.7.debug.js")
        case "fobo" :: "ng-grid.js" :: Nil => List("fobo", "angular-ui", "ng-grid", "2.0.7", "js", "ng-grid-2.0.7.min.js")
        case "fobo" :: "ng-grid.css" :: Nil if Props.devMode => List("fobo", "angular-ui", "ng-grid", "2.0.7", "css", "ng-grid.css")
        case "fobo" :: "ng-grid.css" :: Nil => List("fobo", "angular-ui", "ng-grid", "2.0.7", "css", "ng-grid.min.css")
      }
    }     
    
    lazy val nggrid204 = {
      ResourceServer.rewrite {
        case "fobo" :: "ng-grid.js" :: Nil if Props.devMode => List("fobo", "angular-ui", "ng-grid", "2.0.4", "js", "ng-grid-2.0.4.debug.js")
        case "fobo" :: "ng-grid.js" :: Nil => List("fobo", "angular-ui", "ng-grid", "2.0.4", "js", "ng-grid-2.0.4.min.js")
        case "fobo" :: "ng-grid.css" :: Nil if Props.devMode => List("fobo", "angular-ui", "ng-grid", "2.0.4", "css", "ng-grid.css")
        case "fobo" :: "ng-grid.css" :: Nil => List("fobo", "angular-ui", "ng-grid", "2.0.4", "css", "ng-grid.min.css")
      }
    }   
    
    @deprecated("Use AJMaterial100RC5 or later","1.5.0")
    lazy val AJMaterial0100 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-material.js" :: Nil if Props.devMode => List("fobo", "angular-material", "0.10.0", "js", "angular-material.js")
        case "fobo" :: "angular-material.js" :: Nil => List("fobo", "angular-material", "0.10.0", "js", "angular-material.min.js")
        case "fobo" :: "angular-material.css" :: Nil if Props.devMode => List("fobo", "angular-material", "0.10.0", "css", "angular-material.css")
        case "fobo" :: "angular-material.css" :: Nil => List("fobo", "angular-material", "0.10.0", "css", "angular-material.css")
      }
    } 
    
    lazy val AJMaterial100RC = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-material.js" :: Nil if Props.devMode => List("fobo", "angular-material", "1.0.0-rc", "js", "angular-material.js")
        case "fobo" :: "angular-material.js" :: Nil => List("fobo", "angular-material", "1.0.0-rc", "js", "angular-material.min.js")
        case "fobo" :: "angular-material-mocks.js" :: Nil if Props.devMode => List("fobo", "angular-material", "1.0.0-rc", "js", "angular-material-mocks.js")
        case "fobo" :: "angular-material-mocks.js" :: Nil => List("fobo", "angular-material", "1.0.0-rc", "js", "angular-material-mocks.js")
        case "fobo" :: "angular-material.css" :: Nil if Props.devMode => List("fobo", "angular-material", "1.0.0-rc", "css", "angular-material.css")
        case "fobo" :: "angular-material.css" :: Nil => List("fobo", "angular-material", "1.0.0-rc", "css", "angular-material.css")
      }
    }    
    
  }
}




