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
   * Enable usage of AngularJS version 1&sdot;2&sdot;19 in your bootstrap liftweb Boot.
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
   * Enable usage of AngularJS version 1&sdot;2&sdot;11 in your bootstrap liftweb Boot.
   * @version 1.2.11
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AngularJS1211
   * }}}
   *
   */
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
  case object AngularJS1211i18n extends AJSToolkit {
    AJSFoBoResources.angularjs1211i18n
  }  
  
  
  /**
   * Enable usage of AngularJS version 1&sdot;0&sdot;6 in your bootstrap liftweb Boot.
   * @version 1.0.6
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AngularJS106
   * }}}
   *
   */
  @deprecated("Use AngularJS1211 or later","FoBo v1.2.0")
  case object AngularJS106 extends AJSToolkit {
    AJSFoBoResources.angularjs106
  }
  
    /**
   * Enable usage of AngularUI-Bootstrap version 0&sdot;10&sdot;0 in your bootstrap liftweb Boot.
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
   * Enable usage of AngularUI-Bootstrap version 0&sdot;7&sdot;0 in your bootstrap liftweb Boot.
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
   * Enable usage of AngularUI-Bootstrap version 0&sdot;2&sdot;0 in your bootstrap liftweb Boot.
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
   * Enable usage of NG-Grid version 2&sdot;0&sdot;7 in your bootstrap liftweb Boot.
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
   * Enable usage of NG-Grid version 2&sdot;0&sdot;4 in your bootstrap liftweb Boot.
   * @version 2.0.4
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AJSNGGrid204
   * }}}
   *
   */
  case object AJSNGGrid204 extends AJSToolkit {
    AJSFoBoResources.nggrid204
  }   
  
  /**
   * Object holding internally used FoBo resources.
   */
  private object AJSFoBoResources {
    
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
    
    
    lazy val angularjs106 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.0.6", "js", "angular.js")
        case "fobo" :: "angular.js" :: Nil => List("fobo", "angular-js", "1.0.6", "js", "angular.min.js")
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
    
  }
}




