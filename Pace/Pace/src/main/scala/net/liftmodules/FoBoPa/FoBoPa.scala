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
  
  abstract sealed trait ToolKit
  abstract sealed trait Resource
  abstract sealed trait API

  /*=== ToolKit ============================================*/
  
  object ToolKit extends ToolKit {
    var Init: ToolKit = null 

   /**
     * Enable usage of FoBo's Pace API and resources version 1&#8228;0&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.0.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoPa => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Pace102
     * }}}
     */    
     case object Pace102 extends ToolKit {
       FoBoPaRes.Resource.Pace102
       //FoBoPaAPI.API.Pace0
     }
    
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
       FoBoPaRes.Resource.Pace0415
       //FoBoPaAPI.API.Pace0
     }    
  }

  /*=== Resource ============================================*/
  
  object Resource extends Resource {
    var Init: Resource = null
    
    /**
     * Enable usage of FoBo's Pace resources version 1&#8228;0&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.0.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoPa => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Pace102
     * }}}
     */    
     case object Pace102 extends Resource {
       FoBoPaRes.Resource.Pace102
     }  
    
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
       FoBoPaRes.Resource.Pace0415
     }      
  }
  
  /*=== API ============================================*/
  
  object API extends API {
    var Init: API = null
    
    /**
     * Enable usage of FoBo's Pace API version 0&#8228;X&#8228;X in your bootstrap liftweb Boot.
     * @version 0.X.X
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoPa => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.Pace0
     * }}}
     */    
     case object Pace0 extends API {
       //ToDo get from module fobo-pace-api in PaceAPI
       //FoBoPaAPI.API.Pace0
       FoBoAPI.init
     }         
  }
  
  /*=== InitParam (deprecated) ============================================*/

  @deprecated("Init no longer nessesary as it is now automaticaly done for respective FoBoPa.InitParam","1.6.0")
  def init() {
  }

  @deprecated("Use ToolKit or Resouce","1.6.0")
  abstract sealed trait PaToolkit
  
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




