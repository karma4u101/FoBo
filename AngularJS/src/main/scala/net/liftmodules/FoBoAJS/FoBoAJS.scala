package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

package object FoBoAJS {

  def init() {
    LiftRules.addToPackages("net.liftmodules.FoBo")
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
   * Enable usage of AngularJS version 1_0_6 in your bootstrap liftweb Boot.
   * @version 1.0.6
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AngularJS106
   * }}}
   *
   */
  case object AngularJS106 extends AJSToolkit {
    AJSFoBoResources.angularjs106
  }

  /**
   * Enable usage of AngularUI-Bootstrap version 0_2_0 in your bootstrap liftweb Boot.
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
   * Enable usage of NG-Grid version 2_0_4 in your bootstrap liftweb Boot.
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
   * Enable usage of Angular-UI version 0_4_0 in your bootstrap liftweb Boot.
   * @version 0.4.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoAJS.InitParam.Toolkit=FoBoAJS.AJSUI040
   * }}}
   *
   */
  case object AJSUI040 extends AJSToolkit {
    AJSFoBoResources.ui040
  }   
  
  /**
   * Object holding internally used FoBo resources.
   */
  private object AJSFoBoResources {
    
    lazy val angularjs106 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular.js" :: Nil if Props.devMode => List("fobo", "angular-js", "1.0.6", "js", "angular.js")
        case "fobo" :: "angular.js" :: Nil => List("fobo", "angular-js", "1.0.6", "js", "angular.min.js")
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
    
    lazy val nggrid204 = {
      ResourceServer.rewrite {
        case "fobo" :: "ng-grid.js" :: Nil if Props.devMode => List("fobo", "angular-ui", "ng-grid", "2.0.4", "js", "ng-grid-2.0.4.debug.js")
        case "fobo" :: "ng-grid.js" :: Nil => List("fobo", "angular-ui", "ng-grid", "2.0.4", "js", "ng-grid-2.0.4.min.js")
        case "fobo" :: "ng-grid.css" :: Nil if Props.devMode => List("fobo", "angular-ui", "ng-grid", "2.0.4", "css", "ng-grid.css")
        case "fobo" :: "ng-grid.css" :: Nil => List("fobo", "angular-ui", "ng-grid", "2.0.4", "css", "ng-grid.css")

      }
    }    
    
    lazy val ui040 = {
      ResourceServer.rewrite {
        case "fobo" :: "angular-ui.js" :: Nil if Props.devMode => List("fobo", "angular-ui", "ui", "0.4.0", "js", "angular-ui.js")
        case "fobo" :: "angular-ui.js" :: Nil => List("fobo", "angular-ui", "ui", "0.4.0", "js", "angular-ui.js")
        case "fobo" :: "angular-ui-ieshiv.js" :: Nil if Props.devMode => List("fobo", "angular-ui", "ui", "0.4.0", "js", "angular-ui-ieshiv.js")
        case "fobo" :: "angular-ui-ieshiv.js" :: Nil => List("fobo", "angular-ui", "ui", "0.4.0", "js", "angular-ui-ieshiv.min.js")
      }
    }      
    
  }
}




