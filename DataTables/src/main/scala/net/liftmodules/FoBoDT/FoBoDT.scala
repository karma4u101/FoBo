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
package object FoBoDT {

  def init() {
    LiftRules.addToPackages("net.liftmodules.FoBoDT")
    ResourceServer.allow {
      case "fobo" :: tail => true
    }
  }

  abstract trait DTToolkit

  /**
   *
   */
  object InitParam extends DTToolkit {
    var ToolKit: DTToolkit = null //FontAwesome200
  }

  /**
   * Enable usage of DataTables version 1&#8228;9&#8228;0 in your bootstrap liftweb Boot.
   * @version 1.9.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoDT.InitParam.Toolkit=FoBoDT.DataTables190
   * }}}
   *
   */
  case object DataTables190 extends DTToolkit {
    DTResources.dataTables190
  }

  /**
   * Object holding internally used FoBo resources.
   */
  private object DTResources {

    lazy val dataTables190 = {
      ResourceServer.rewrite {

        case "fobo" :: "jquery.dataTables.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "jquery.dataTables.css")
        case "fobo" :: "jquery.dataTables.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "jquery.dataTables-min.css")

        case "fobo" :: "jquery.dataTables_themeroller.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "jquery.dataTables_themeroller.css")
        case "fobo" :: "jquery.dataTables_themeroller.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "jquery.dataTables_themeroller-min.css")

        case "fobo" :: "AutoFill.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "AutoFill.css")
        case "fobo" :: "AutoFill.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "AutoFill-min.css")

        case "fobo" :: "ColReorder.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "ColReorder.css")
        case "fobo" :: "ColReorder.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "ColReorder-min.css")

        case "fobo" :: "ColVis.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "ColVis.css")
        case "fobo" :: "ColVis.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "ColVis-min.css")

        case "fobo" :: "ColVisAlt.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "ColVisAlt.css")
        case "fobo" :: "ColVisAlt.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "ColVisAlt-min.css")

        case "fobo" :: "TableTools_JUI.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "TableTools_JUI.css")
        case "fobo" :: "TableTools_JUI.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "TableTools_JUI-min.css")

        case "fobo" :: "TableTools.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "TableTools.css")
        case "fobo" :: "TableTools.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "TableTools-min.css")

        case "fobo" :: "themes" :: "smoothness.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "themes", "smoothness", "jquery-ui-1.8.4.custom.css")
        case "fobo" :: "themes" :: "smoothness.css" :: Nil => List("fobo", "datatables", "1.9.0", "themes", "smoothness", "jquery-ui-1.8.4.custom-min.css")

        case "fobo" :: "themes" :: "ui-lightness.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "themes", "ui-lightness", "jquery-ui-1.8.4.custom.css")
        case "fobo" :: "themes" :: "ui-lightness.css" :: Nil => List("fobo", "datatables", "1.9.0", "themes", "ui-lightness", "jquery-ui-1.8.4.custom-min.css")

        case "fobo" :: "jquery.dataTables.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "jquery.dataTables.js")
        case "fobo" :: "jquery.dataTables.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "jquery.dataTables.js")

        case "fobo" :: "AutoFill.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "AutoFill.js")
        case "fobo" :: "AutoFill.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "AutoFill.js")

        case "fobo" :: "ColReorder.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "ColReorder.js")
        case "fobo" :: "ColReorder.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "ColReorder.js")

        case "fobo" :: "ColVis.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "ColVis.js")
        case "fobo" :: "ColVis.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "ColVis.js")

        case "fobo" :: "FixedColumns.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "FixedColumns.js")
        case "fobo" :: "FixedColumns.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "FixedColumns.js")

        case "fobo" :: "FixedHeader.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "FixedHeader.js")
        case "fobo" :: "FixedHeader.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "FixedHeader.js")

        case "fobo" :: "KeyTable.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "KeyTable.js")
        case "fobo" :: "KeyTable.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "KeyTable.js")

        case "fobo" :: "Scroller.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "Scroller.js")
        case "fobo" :: "Scroller.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "Scroller.js")

        case "fobo" :: "TableTools.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "TableTools.js")
        case "fobo" :: "TableTools.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "TableTools.js")

        case "fobo" :: "ZeroClipboard.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "ZeroClipboard.js")
        case "fobo" :: "ZeroClipboard.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "ZeroClipboard.js")

        case "fobo" :: "copy_cvs_xls_pdf.swf" :: Nil => List("fobo", "datatables", "1.9.0", "swf", "copy_cvs_xls_pdf.swf")
        case "fobo" :: "copy_cvs_xls.swf" :: Nil => List("fobo", "datatables", "1.9.0", "swf", "copy_cvs_xls.swf")

      }
    }

  }

}




