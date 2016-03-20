package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo Resource sub-module== 
 * This package object provides module initiation in FoBo's most fine grain level. 
 * 
 * This is useful if you want to depend on a small subset of FoBo's functionality 
 * by only pulling in some specific FoBo artifact(s) that provides toolkit resources
 * or FoBo API functions.
 * 
 * This module provides toolkit resources for the FontAwesome module.
 * 
 * For more information on how to set up and use the FoBo modules see the FoBo readme.
 */
package object FoBoFARes {

  abstract sealed trait Resource

  object Resource extends Resource {
    var Init: Resource = null 
    
    /**
     * Enable usage of FoBo's FontAwesome resources version 4&#8228;5&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.5.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFARes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome450
     * }}}
     */    
     case object FontAwesome450 extends Resource {
       FoBoResources.init
       FoBoResources.fontAwesome450
     } 
    
    /**
     * Enable usage of FoBo's FontAwesome resources version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.3.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFARes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome430
     * }}}
     */    
     case object FontAwesome430 extends Resource {
       FoBoResources.init
       FoBoResources.fontAwesome430
     } 
    
    /**
     * Enable usage of FoBo's FontAwesome resources version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.1.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFARes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome410
     * }}}
     */    
     case object FontAwesome410 extends Resource {
       FoBoResources.init
       FoBoResources.fontAwesome410
     }  
     
    /**
     * Enable usage of FoBo's FontAwesome resources version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
     * @version 4.0.3
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFARes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome403
     * }}}
     */    
     case object FontAwesome403 extends Resource {
       FoBoResources.init
       FoBoResources.fontAwesome403
     }   
     
    /**
     * Enable usage of FoBo's FontAwesome resources version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
     * @version 3.2.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFARes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome321
     * }}}
     */    
     case object FontAwesome321 extends Resource {
       FoBoResources.init
       FoBoResources.fontAwesome321
     }        
    
  } //end Resource object   
  
 /**
  * Object holding internally used FoBo resources.
  */
  private object FoBoResources {

      lazy val init: Unit = {
        ResourceServer.allow {
          case "fobo" :: tail => true
        }
      }      
      
      lazy val fontAwesome450 = {
        ResourceServer.rewrite {
          case "fobo" :: "font-awesome.css" :: Nil if Props.devMode => List("fobo", "font-awesome", "4.5.0", "css", "font-awesome.css")
          case "fobo" :: "font-awesome.css" :: Nil => List("fobo", "font-awesome", "4.5.0", "css", "font-awesome.min.css")
        }
      }
      
      lazy val fontAwesome430 = {
        ResourceServer.rewrite {
          case "fobo" :: "font-awesome.css" :: Nil if Props.devMode => List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.css")
          case "fobo" :: "font-awesome.css" :: Nil => List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
        }
      } 
      
      lazy val fontAwesome410 = {
        ResourceServer.rewrite {
          case "fobo" :: "font-awesome.css" :: Nil if Props.devMode => List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.css")
          case "fobo" :: "font-awesome.css" :: Nil => List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
        }
      } 
      
      lazy val fontAwesome403 = {
        ResourceServer.rewrite {
          case "fobo" :: "font-awesome.css" :: Nil if Props.devMode => List("fobo", "font-awesome", "4.0.3", "css", "font-awesome.css")
          case "fobo" :: "font-awesome.css" :: Nil => List("fobo", "font-awesome", "4.0.3", "css", "font-awesome.min.css")
        }
      }  
      
      lazy val fontAwesome321 = {
        ResourceServer.rewrite {
          case "fobo" :: "font-awesome.css" :: Nil if Props.devMode => List("fobo", "font-awesome", "3.2.1", "css", "font-awesome.css")
          case "fobo" :: "font-awesome.css" :: Nil => List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
          case "fobo" :: "font-awesome-ie7.css" :: Nil if Props.devMode => List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-ie7.css")
          case "fobo" :: "font-awesome-ie7.css" :: Nil => List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-ie7-min.css")

        }
      }  
             
  }

}




