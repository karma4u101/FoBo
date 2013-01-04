package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

package object FoBoFontAwesome {


    def init() {
      LiftRules.addToPackages("net.liftmodules.FoBo")
      ResourceServer.allow {
        case "fobo" :: tail => true
      }
    }

    abstract trait FoBoToolkit

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
    object InitParam extends FoBoToolkit {
      var ToolKit: FoBoToolkit = FontAwesome200
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
    case object FontAwesome200 extends FoBoToolkit {
      FoBoResources.fontAwesome200
    }

    /**
     * Object holding internally used FoBo resources.
     */
    private object FoBoResources {

      lazy val fontAwesome200 = {
        ResourceServer.rewrite {
          case "fobo" :: "font-awesome.css" :: Nil if Props.devMode => List("fobo", "font-awesome", "2.0.0", "css", "font-awesome.css")
          case "fobo" :: "font-awesome.css" :: Nil => List("fobo", "font-awesome", "2.0.0", "css", "font-awesome-min.css")
        }
      }
    }

}

