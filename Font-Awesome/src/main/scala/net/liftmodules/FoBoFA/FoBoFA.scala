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
     * Enable usage of Font-Awesome version 4&#8228;0&#8228;1 in your bootstrap liftweb Boot.
     * @version 4.0.1
     *
     *  '''Example:'''
     *
     * {{{
     *   FoBoFA.InitParam.Toolkit=FoBoFA.FontAwesome401
     * }}}
     *
     */
    @deprecated("Use FontAwesome403 or later","FoBo v1.3.0")
    case object FontAwesome401 extends FAToolkit {
      FAResources.fontAwesome401
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
     * Enable usage of Font-Awesome version 3&#8228;0&#8228;0 in your bootstrap liftweb Boot.
     * @version 3.0.0
     *
     *  '''Example:'''
     *
     * {{{
     *   FoBoFA.InitParam.Toolkit=FoBoFA.FontAwesome300
     * }}}
     *
     */
    @deprecated("Use FontAwesome321 or later","FoBo v1.2.0")
    case object FontAwesome300 extends FAToolkit {
      FAResources.fontAwesome300
    }
        

    /**
     * Enable usage of Font-Awesome version 2&#8228;0&#8228;0 in your bootstrap liftweb Boot.
     * @version 2.0.0
     *
     *  '''Example:'''
     *
     * {{{
     *   FoBoFA.InitParam.Toolkit=FoBoFA.FontAwesome200
     * }}}
     *
     */
    @deprecated("Use FontAwesome321 or later","FoBo v1.2.0")
    case object FontAwesome200 extends FAToolkit {
      FAResources.fontAwesome200
    }
    
    /**
     * Enable usage of Font-Awesome version 2&#8228;0&#8228;0 in your bootstrap liftweb Boot.
     * 
     * @version 2.0.0
     *
     *  '''Example:'''
     *
     * {{{
     *   FoBoFA.InitParam.Toolkit=FoBoFA.FontAwesome200
     * }}}
     *
     */
    @deprecated("Use FontAwesome321 or later","FoBo v1.2.0")
    case object FontAwesome200TB222 extends FAToolkit {
      FAResources.fontAwesome200TB222
    }    

    /**
     * Object holding internally used FoBo resources.
     */
    private object FAResources {

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
      
      lazy val fontAwesome401 = {
        ResourceServer.rewrite {
          case "fobo" :: "font-awesome.css" :: Nil if Props.devMode => List("fobo", "font-awesome", "4.0.1", "css", "font-awesome.css")
          case "fobo" :: "font-awesome.css" :: Nil => List("fobo", "font-awesome", "4.0.1", "css", "font-awesome-min.css")
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
      
      lazy val fontAwesome300 = {
        ResourceServer.rewrite {
          case "fobo" :: "font-awesome.css" :: Nil if Props.devMode => List("fobo", "font-awesome", "3.0.0", "css", "font-awesome.css")
          case "fobo" :: "font-awesome.css" :: Nil => List("fobo", "font-awesome", "3.0.0", "css", "font-awesome.min.css")
          case "fobo" :: "font-awesome-ie7.css" :: Nil if Props.devMode => List("fobo", "font-awesome", "3.0.0", "css", "font-awesome-ie7.min.css")
          case "fobo" :: "font-awesome-ie7.css" :: Nil => List("fobo", "font-awesome", "3.0.0", "css", "font-awesome-ie7.min.css")

        }
      }      

      lazy val fontAwesome200 = {
        ResourceServer.rewrite {
          case "fobo" :: "font-awesome.css" :: Nil if Props.devMode => List("fobo", "font-awesome", "2.0.0", "css", "font-awesome.css")
          case "fobo" :: "font-awesome.css" :: Nil => List("fobo", "font-awesome", "2.0.0", "css", "font-awesome-min.css")
        }
      }
      
      lazy val fontAwesome200TB222 = {
        ResourceServer.rewrite {
          case "fobo" :: "font-awesome.css" :: Nil if Props.devMode => List("fobo", "font-awesome", "2.0.0", "css", "font-awesome.css")
          case "fobo" :: "font-awesome.css" :: Nil => List("fobo", "font-awesome", "2.0.0", "css", "font-awesome-min.css")
          //re-setting to icon less bootstrap 
          //this makes it possible to use the bootstrap.css setting instead of explicitly setting bootstrap-no-icons.css in the template 
          case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.2.2", "css", "bootstrap-no-icons.css")
          case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","2.2.2", "css", "bootstrap-no-icons-min.css")      

        }
      }
      
    }

}




