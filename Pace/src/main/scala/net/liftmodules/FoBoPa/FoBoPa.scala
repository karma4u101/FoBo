package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo Toolkit sub-module== 
 * This package object provides Pace integration into your Lift/FoBo application.
 * 
 * This package object is only of interest to you if you are using this module 
 * as a stand alone artifact dependency in your project (without the FoBo meta artifact).
 * This package object provides information on how to initiate and use it 
 * in your project. 
 * 
 * If you are using this module via the FoBo meta artifact 
 * see [[net.liftmodules.FoBo]] for usage information. 
 */
package object FoBoPa {
  
  @deprecated("Init no longer nessesary as it is now automaticaly done for respective FoBoPa.InitParam","1.6.0")
  def init() {
//    LiftRules.addToPackages("net.liftmodules.FoBoPa")
//    ResourceServer.allow {
//      case "fobo" :: tail => true
//    }
  }

  //@deprecated("","1.6.0")
  abstract sealed trait PaToolkit
  abstract sealed trait ToolKit
  abstract sealed trait Resource
  abstract sealed trait API

  
  object ToolKit extends ToolKit {
    var Init: ToolKit = null 
    
   /**
     * Enable usage of FoBo's Pace API and resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
     * @version 0.4.15
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoPa => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Pace0415
     * }}}
     */    
     case object Pace0415 extends ToolKit {
       Resource.Pace0415
       //API.Pace0415 //Nothing in the API 
     }    
  }

  object Resource extends Resource {
    var Init: Resource = null
    
    /**
     * Enable usage of FoBo's Pace resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
     * @version 0.4.15
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoPa => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Pace0415
     * }}}
     */    
     case object Pace0415 extends Resource {
       net.liftmodules.FoBoPaRes.Resource.Pace0415
     }      
  }
  
  object API extends API {
    var Init: API = null
    
    /**
     * Enable usage of FoBo's Pace API version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
     * @version 0.4.15
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoPa => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.Pace0415
     * }}}
     */    
     case object Pace0 extends API {
       //get from module fobo-pace-api in PaceAPI
       FoBoAPI.init
     }         
  }
  
  
  /**
   *
   */
  @deprecated("Use FoBoPa.ToolKit.Init=FoBoPa.ToolKit.[Toolkit Object]","1.6.0")
  object InitParam extends PaToolkit {
    var ToolKit: PaToolkit = null 
  }
  
 /**
  * Enable usage of Pace version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
  * @version 0.4.15
  * 
  * '''Example:'''
  * 
  * {{{
  *   import net.liftmodules.{FoBoPa => FoBo}
  *    :
  *   FoBo.InitParam.Toolkit=FoBo.Pace0415
  * }}}
  */
  @deprecated("Use FoBoPa.ToolKit.Init=FoBoPa.ToolKit.Pace0415","1.6.0")
  case object Pace0415 extends PaToolkit {
    ToolKit.Pace0415
    //API.Pace0415
  }

  /**
   * Object for initiating FoBo API packages. 
   */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoPa")  
      
    }
  }
  
}




