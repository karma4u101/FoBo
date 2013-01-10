package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

package object FoBoFA {

    def init() {
      LiftRules.addToPackages("net.liftmodules.FoBo")
      ResourceServer.allow {
        case "fobo" :: tail => true
      }
    }

    abstract trait FAToolkit

    /**
     * Enable Toolkit(s)/JQuery options for the FoBo module in your bootstrap liftweb Boot
     *
     * '''Example:'''
     *
     * {{{
     *   FoBo.InitParam.JQuery=FoBo.JQuery172
     *   FoBo.InitParam.Toolkit=FoBo.Bootstrap222
     *   FoBo.InitParam.Toolkit=FoBo.PrettifyJun2011
     * }}}
     * This example uses the Bootstrap v2.2.2 option and adds the Google code Prettify vJun2011
     * to the enabled toolkits.
     */
    object InitParam extends FAToolkit {
      var ToolKit: FAToolkit = null //FontAwesome200
    }

    /**
     * Enable usage of Font-Awesome version 2_0_0 in your bootstrap liftweb Boot.
     * @version 2.0.0
     *
     *  '''Example:'''
     *
     * {{{
     *   FoBo.InitParam.Toolkit=FoBo.FontAwesome200
     * }}}
     *
     */
    case object FontAwesome200 extends FAToolkit {
      FAResources.fontAwesome200
    }
    
    /**
     * Enable usage of Font-Awesome version 2_0_0 in your bootstrap liftweb Boot.
     * 
     * @version 2.0.0
     *
     *  '''Example:'''
     *
     * {{{
     *   FoBo.InitParam.Toolkit=FoBo.FontAwesome200
     * }}}
     *
     */
    case object FontAwesome200TB222 extends FAToolkit {
      FAResources.fontAwesome200TB222
    }    

    /**
     * Object holding internally used FoBo resources.
     */
    private object FAResources {

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




