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
package object FoBoFA {

    def init() {
      LiftRules.addToPackages("net.liftmodules.FoBoFA")
      ResourceServer.allow {
        case "fobo" :: tail => true
      }
    }

    abstract trait FAToolkit

    /**
     *
     */
    object InitParam extends FAToolkit {
      var ToolKit: FAToolkit = null //FontAwesome200
    }

    
     /**
     * Enable usage of Font-Awesome version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.3.0
     *
     *  '''Example:'''
     *
     * {{{
     *   FoBoFA.InitParam.Toolkit=FoBoFA.FontAwesome430
     * }}}
     * @since v1.4
     */
    case object FontAwesome430 extends FAToolkit {
      FAResources.fontAwesome430
    }    
    
     /**
     * Enable usage of Font-Awesome version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.1.0
     *
     *  '''Example:'''
     *
     * {{{
     *   FoBoFA.InitParam.Toolkit=FoBoFA.FontAwesome410
     * }}}
     * @since v1.3
     */
    case object FontAwesome410 extends FAToolkit {
      FAResources.fontAwesome410
    }     
    
     /**
     * Enable usage of Font-Awesome version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
     * @version 4.0.3
     *
     *  '''Example:'''
     *
     * {{{
     *   FoBoFA.InitParam.Toolkit=FoBoFA.FontAwesome403
     * }}}
     * @since v1.2
     */
    case object FontAwesome403 extends FAToolkit {
      FAResources.fontAwesome403
    } 
      
    
     /**
     * Enable usage of Font-Awesome version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
     * @version 3.2.1
     *
     *  '''Example:'''
     *
     * {{{
     *   FoBoFA.InitParam.Toolkit=FoBoFA.FontAwesome321
     * }}}
     *
     */
    case object FontAwesome321 extends FAToolkit {
      FAResources.fontAwesome321
    }
        
    
    /**
     * Object holding internally used FoBo resources.
     */
    private object FAResources {

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




