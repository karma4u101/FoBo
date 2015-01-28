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
package object FoBoMDE {
  
  /**
   * @example In bootstrap liftweb Boot set
   * {{{
   *   FoBoMDE.init()
   * }}}
   * The above example just calls init without specifying fobo init 
   * params so default Toolkit and JQuery values will be used. 
   */
  def init() {
    LiftRules.addToPackages("net.liftmodules.FoBoMDE")
    ResourceServer.allow {
      case "fobo" :: tail => true
    }
  }


abstract trait FoBoJQuery
abstract trait FoBoToolkit


/**
 * Enable Toolkit(s)/JQuery options for the FoBo module in your bootstrap liftweb Boot
 *
 * '''Example:'''
 *  
 * {{{
 *   FoBoBs.InitParam.JQuery=FoBoBs.JQuery192
 *   FoBoBs.InitParam.Toolkit=FoBoBs.Bootstrap301
 * }}}
 * This example uses the Bootstrap v3.0.1 option.  
 *   
 */
object InitParam extends FoBoToolkit with FoBoJQuery {
  var ToolKit: FoBoToolkit = null 
}

/**
 * Enable usage of Bootstrap version 3&#8228;2&#8228;0 in your bootstrap liftweb Boot.
 * @version 3.2.0
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoBs.InitParam.Toolkit=FoBoBs.Bootstrap320
 * }}}
 */
case object MarkdownEditor010 extends FoBoToolkit {
  FoBoResources.mdEditor010
}


/**
 * Object holding internally used FoBo resources. 
 */
private object FoBoResources { 

  lazy val mdEditor010: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap-markdown.css" :: Nil if Props.devMode => List("fobo", "bootstrap-markdown", "0.1.0", "css", "bootstrap-markdown.css")
      case "fobo" :: "bootstrap-markdown.css" :: Nil => List("fobo", "bootstrap-markdown","0.1.0", "css", "bootstrap-markdown.min.css")
      case "fobo" :: "bootstrap-markdown.js" :: Nil if Props.devMode => List("fobo",  "bootstrap-markdown", "0.1.0", "js", "bootstrap-markdown.js")
      case "fobo" :: "bootstrap-markdown.js" :: Nil => List("fobo",  "bootstrap","bootstrap-markdown", "0.1.0", "bootstrap-markdown.js") 

      //add lang 
      
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.2.0", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","3.2.0", "css", "bootstrap.min.css")
      case "fobo" :: "bootstrap.css.map" :: Nil => List("fobo", "bootstrap","3.2.0", "css", "bootstrap.css.map")
      case "fobo" :: "bootstrap-theme.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.2.0", "css", "bootstrap-theme.css")
      case "fobo" :: "bootstrap-theme.css" :: Nil => List("fobo", "bootstrap","3.2.0", "css", "bootstrap-theme.min.css")
      case "fobo" :: "bootstrap-theme.css.map" :: Nil => List("fobo", "bootstrap","3.2.0", "css", "bootstrap-theme.css.map")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","3.2.0", "js", "bootstrap.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","3.2.0", "js", "bootstrap.min.js") 
    }
  }
      

}
  
}

