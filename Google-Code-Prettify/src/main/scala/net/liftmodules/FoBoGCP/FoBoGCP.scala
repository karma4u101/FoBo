package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo Toolkit sub-module== 
 * This package object provides Google Code Prettify integration into your Lift/FoBo application.
 * 
 * This package object is only of interest to you if you are using this module 
 * as a stand alone artifact dependency in your project (without the FoBo meta artifact).
 * This package object provides information on how to initiate and use it 
 * in your project. 
 * 
 * If you are using this module via the FoBo meta artifact 
 * see [[net.liftmodules.FoBo]] for usage information. 
 */
package object FoBoGCP {

  @deprecated("Init no longer nessesary as it is now automaticaly done for respective FoBoGCP.InitParam","1.6.0")
  def init() {
  }

  //@deprecated("","1.6.0")
  abstract sealed trait FoBoToolkit
  abstract sealed trait ToolKit
  abstract sealed trait Resource
  abstract sealed trait API
  
  
  /*=== ToolKit ============================================*/
  
  object ToolKit extends ToolKit {
    var Init: ToolKit = null 
    
   /**
     * Enable usage of FoBo's Google Code Prettify API and resources version Jun2011 in your bootstrap liftweb Boot.
     * @version Jun2011
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoGCP => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.PrettifyJun2011
     * }}}
     */    
     case object PrettifyJun2011 extends ToolKit {
       FoBoGCPRes.Resource.PrettifyJun2011
       //FoBoPaAPI.API.Prettify1
     }    
    
  }
  
  /*=== Resource ============================================*/
  
  object Resource extends Resource {
    var Init: Resource = null
    
   /**
     * Enable usage of FoBo's Google Code Prettify resources version Jun2011 in your bootstrap liftweb Boot.
     * @version Jun2011
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoGCP => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.PrettifyJun2011
     * }}}
     */    
     case object PrettifyJun2011 extends Resource {
       FoBoGCPRes.Resource.PrettifyJun2011
     }       
  }
  
  /*=== API ============================================*/
  
  object API extends API {
    var Init: API = null
    /**
     * Enable usage of FoBo's Google Code Prettify API version 1&#8228;X&#8228;X in your bootstrap liftweb Boot.
     * @version 1.X.X
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoGCP => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.Prettify1
     * }}}
     */    
     case object Prettify1 extends API {
       //ToDo get from module fobo-google-code-prettify-api in FoBoGCPAPI
       //FoBoGCPAPI.API.Prettify1
       FoBoAPI.init
     }
    
  }
  
  /*=== InitParam (deprecated) ============================================*/
  
  /**
   *
   */
  @deprecated("Use FoBoPa.ToolKit.Init=FoBoPa.ToolKit.[Toolkit Object]","1.6.0")
  object InitParam extends FoBoToolkit {
    var ToolKit: FoBoToolkit = null 
  }

  
 /**
  * Enable usage of Prettify version Jun2011 in your bootstrap liftweb Boot.
  * @version Jun2011
  * 
  * '''Example:'''
  * 
  * {{{
  *   FoBoGCP.InitParam.Toolkit=FoBoGCP.PrettifyJun2011
  * }}}
  */
  @deprecated("Use FoBoGCP.ToolKit.Init=FoBoGCP.ToolKit.PrettifyJun2011","1.6.0")
  case object PrettifyJun2011 extends FoBoToolkit {
    ToolKit.PrettifyJun2011
  }

  /**
   * Object for initiating FoBo API packages. 
   */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoGCP")  
    }
  }

}




