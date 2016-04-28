package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo Highlight Toolkit Module==
 * 
 * This FoBo toolkit module provides Highlight API and Resource components to the 
 * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
 *
 * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.FoBo]] for setup information.
 *
 */
package object FoBoHL {
  
  override def toString() = {
    FoBoHL.ToolKit.toString()+" "+FoBoHL.Resource.toString()+" "+FoBoHL.API.toString()
  }   
  
  /**
   * Initiate FoBo's Highlight ToolKit(s) in you bootstrap liftweb Boot.
   * Using the ToolKit initiation you will bring in both the 
   * toolkit's resources and FoBo/Lift API associated 
   * with the toolkit.  
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoHL => FoBo}
   *    :
   *   FoBo.ToolKit.Init=FoBo.ToolKit.[ToolKit Object]
   * }}}
   * '''Note:''' To see available objects click on the round trait icon in the header of this page.
   */  
  abstract sealed trait ToolKit
  
  /**
   * Initiate FoBo's Highlight Resource(s) in you bootstrap liftweb Boot.
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoHL => FoBo}
   *    :
   *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
   * }}}
   * '''Note:''' To see available objects click on the round trait icon in the header of this page.
   */  
  abstract sealed trait Resource
  
  /**
   * Initiate FoBo's Highlight API in you bootstrap liftweb Boot.
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoHL => FoBo}
   *    :
   *   FoBo.API.Init=FoBo.API.[API Object]
   * }}}
   * '''Note:''' To see available objects click on the round trait icon in the header of this page.
   */   
  abstract sealed trait API

  /*=== ToolKit ============================================*/
  
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
    override def toString() = "FoBoHL.ToolKit = "+store.toString()
    
   /**
     * Enable usage of FoBo's Highlight API and resources version 9&#8228;3&#8228;0 in your bootstrap liftweb Boot.
     * @version 9.3.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoHL => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.HighlightJS930
     * }}}
     */    
     case object HighlightJS930 extends ToolKit {
       FoBoHLRes.Resource.HighlightJS930
       FoBoHLAPI.API.HighlightJS9
     }
      
  }

  /*=== Resource ============================================*/
  
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
    override def toString() = "FoBoHL.Resource = "+store.toString()
    
    /**
     * Enable usage of FoBo's Highlight resources version 9&#8228;3&#8228;0 in your bootstrap liftweb Boot.
     * @version 9.3.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoHL => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.HighlightJS930
     * }}}
     */    
     case object HighlightJS930 extends Resource {
       FoBoHLRes.Resource.HighlightJS930
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
    override def toString() = "FoBoHL.API = "+store.toString()
    
    /**
     * Enable usage of FoBo's Pace API version 9&#8228;X&#8228;X in your bootstrap liftweb Boot.
     * @version 9.X.X
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoHL => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.HighlightJS9
     * }}}
     */    
     case object HighlightJS9 extends API {
       FoBoHLAPI.API.HighlightJS9
     }         
  }
 
}




