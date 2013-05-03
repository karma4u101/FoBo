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
package object FoBoKO {

  def init() {
    LiftRules.addToPackages("net.liftmodules.FoBo")
    ResourceServer.allow {
      case "fobo" :: tail => true
    }
  }

  abstract trait KOToolkit

  /**
   *
   */
  object InitParam extends KOToolkit {
    var ToolKit: KOToolkit = null 
  }

  /**
   * Enable usage of KnockOut version 2_2_1 in your bootstrap liftweb Boot.
   * @version 2.2.1
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoKO.InitParam.Toolkit=FoBoKO.KnockOut221
   * }}}
   *
   */
  case object Knockout221 extends KOToolkit {
    KOFoBoResources.knockout221
  }

  /**
   * Enable usage of KnockOut version 2_0_0 in your bootstrap liftweb Boot.
   * @version 2.0.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoKO.InitParam.Toolkit=FoBoKO.KnockOut200
   * }}}
   *
   */
  case object Knockout210 extends KOToolkit {
    KOFoBoResources.knockout210
  }
  /**
   * Enable usage of KnockOut version 2_1_0 in your bootstrap liftweb Boot.
   * @version 2.1.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoKO.InitParam.Toolkit=FoBoKO.KnockOut210
   * }}}
   *
   */
  case object Knockout200 extends KOToolkit {
    KOFoBoResources.knockout200
  }

  /**
   * Object holding internally used FoBo resources.
   */
  private object KOFoBoResources {

    lazy val knockout200 = {
      ResourceServer.rewrite {
        case "fobo" :: "knockout.js" :: Nil if Props.devMode => List("fobo", "knockout", "2.0.0", "js", "knockout-2.0.0.debug.js")
        case "fobo" :: "knockout.js" :: Nil => List("fobo", "knockout", "2.0.0", "js", "knockout-2.0.0.js")
      }
    }
    lazy val knockout210 = {
      ResourceServer.rewrite {
        case "fobo" :: "knockout.js" :: Nil if Props.devMode => List("fobo", "knockout", "2.1.0", "js", "knockout-2.1.0.debug.js")
        case "fobo" :: "knockout.js" :: Nil => List("fobo", "knockout", "2.1.0", "js", "knockout-2.1.0.js")
      }
    }
    lazy val knockout221 = {
      ResourceServer.rewrite {
        case "fobo" :: "knockout.js" :: Nil if Props.devMode => List("fobo", "knockout", "2.2.1", "js", "knockout-2.2.1.debug.js")
        case "fobo" :: "knockout.js" :: Nil => List("fobo", "knockout", "2.2.1", "js", "knockout-2.2.1.js")
      }
    }

  }
}




