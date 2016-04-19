package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo Toolkit sub-module== 
 * This package object provides KineticJs integration into your Lift/FoBo application.
 * 
 * This package object is only of interest to you if you are using this module 
 * as a stand alone artifact dependency in your project (without the FoBo meta artifact).
 * This package object provides information on how to initiate and use it 
 * in your project. 
 * 
 * If you are using this module via the FoBo meta artifact 
 * see [[net.liftmodules.FoBo]] for usage information. 
 */
package object FoBoKi {

  override def toString() = {
    FoBoKi.ToolKit.toString()+" "+FoBoKi.Resource.toString()+" "+FoBoKi.API.toString()
  }   

  abstract sealed trait ToolKit
  abstract sealed trait Resource
  abstract sealed trait API
  
  /*===Kinetic ToolKit===============================================================*/
  
  object ToolKit extends ToolKit {
    
    //we don't actually need to store the objects (for now) so lets just save 
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[ToolKit]
    private var store:Store = List()
    def Init:Store = store
    def Init_=(t:ToolKit):Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }      
    override def toString() = "FoBoKi.ToolKit = "+store.toString()
    
    /**
     * Enable usage FoBo's KineticJS API and resources version 5&#8228;1&#8228;0 in your bootstrap liftweb Boot.
     * @version 5.1.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoKi => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.KineticJS510 
     * }}}
     *
     */
      case object KineticJS510 extends ToolKit {
        FoBoKiRes.Resource.KineticJS510
      }    
    
  }
  
  /*===Kinetic Resource===============================================================*/
  
  object Resource extends Resource {

    //we don't actually need to store the objects (for now) so lets just save 
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Resource]
    private var store:Store = List()
    def Init:Store = store
    def Init_=(t:Resource):Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }   
    override def toString() = "FoBoKi.Resource = "+store.toString() 
    
    /**
     * Enable usage FoBo's KineticJS resources version 5&#8228;1&#8228;0 in your bootstrap liftweb Boot.
     * @version 5.1.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoKi => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.KineticJS510 
     * }}}
     *
     */
      case object KineticJS510 extends Resource {
        FoBoKiRes.Resource.KineticJS510
      }      
    
  }

  /*=== API ============================================*/
  
  object API extends API {
  
    //we don't actually need to store the objects (for now) so lets just save 
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[API]
    private var store:Store = List()
    def Init:Store = store
    def Init_=(t:API):Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }    
    override def toString() = "FoBoKi.API = "+store.toString() 
    
    /**
     * Enable usage of FoBo's KineticJs API version 5&#8228;X&#8228;X in your bootstrap liftweb Boot.
     * @version 5.X.X
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoKi => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.KineticJS0
     * }}}
     */    
     case object KineticJS0 extends API {
       //ToDo get from module fobo-kineticjs-api in KinetciJSAPI
       //FoBoKiAPI.API.KineticJS0
       FoBoAPI.init
     }         
  }  
  
   /*=== InitParam (deprecated) ============================================*/

  @deprecated("Init no longer nessesary as it is now automaticaly done for respective FoBoKi.InitParam","1.6.0")
  def init() {
  }  
  
  //@deprecated("","1.6.0")
  abstract sealed trait FoBoToolkit
  
  /**
   *
   */
  @deprecated("Use FoBoKi.ToolKit.Init=FoBoKi.ToolKit.[Toolkit Object]","1.6.0")
  object InitParam extends FoBoToolkit {
    var ToolKit: FoBoToolkit = null 
  }
  
  
/**
 * Enable usage of KineticJS version 5&#8228;1&#8228;0 in your bootstrap liftweb Boot.
 * @version 5.1.0
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoKi.InitParam.Toolkit=FoBoKi.KineticJS510
 * }}}
 * @since v1.3
 */
  @deprecated("Use FoBoKi.ToolKit.Init=FoBoKi.ToolKit.KineticJS510","1.6.0")
  case object KineticJS510 extends FoBoToolkit {
    ToolKit.KineticJS510
    //API.KineticJS510
  }
   
  
//ToDo this should be fetched from KineticJSAPI
/**
 * Object for initiating FoBo API packages.
 * 
 */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoKi")  
    }
  }
  
}




