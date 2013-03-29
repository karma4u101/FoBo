package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

package object FoBoJQ {

  def init() {
    LiftRules.addToPackages("net.liftmodules.FoBo")
    ResourceServer.allow {
      case "fobo" :: tail => true
    }
  }

 
  abstract trait FoBoJQ

  /**
   *
   */
  object InitParam extends FoBoJQ {
    var JQuery: FoBoJQ = JQuery182
  }

  
/**
 * Enable usage of JQuery version 1_8_2 in your bootstrap liftweb Boot.
 * @version 1.8.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery182
 * }}}
 */
case object JQuery182 extends FoBoJQ {
  JQFoBoResources.jquery182
}

/**
 * Enable usage of JQuery version 1_7_2 in your bootstrap liftweb Boot.
 * @version 1.7.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery172
 * }}}
 */
case object JQuery172 extends FoBoJQ {
  JQFoBoResources.jquery172
}

  /**
   * Object holding internally used FoBo resources.
   */
  private object JQFoBoResources {

  lazy val jquery182 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.8.2", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.8.2", "js", "jquery-min.js")
    }
  }   
   
  lazy val jquery172 = {
    ResourceServer.rewrite {
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.7.2", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.7.2", "js", "jquery-min.js")
    }
  }
  
  }
}




