package net.liftmodules.FoBo.snippet.FoBo

import scala.xml.{ NodeSeq, Text }
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http._
import net.liftweb._
import Helpers._
import net.liftmodules.FoBo.lib.{DataTablesScriptHelper=>sch}

/**
 * ==Script Helper Snippet==
 * 
 * This snippet class contains functions for common transform operations useful when working 
 * with the any toolkit.
 * '''Example''' Most of the functions in this class can be invoced using the following pattern. 
 * {{{ data-lift="FoBo.ScriptHelper.functionName?paramName=paramValue&...." }}} 
 * For more examples see the individual transform functions.
 */
class DataTables extends StatefulSnippet with Loggable {

  lazy val sch = new sch()
  
  def dispatch = {
    case "dataTable" => dataTable
  }
  
  /**
   * This function sets a dataTable element.
   *
   * '''Snippet Params:'''
   * 
   *  - '''Param''' ''id'' - The element id 
   * 
   * @example {{{ <script data-lift="FoBo.DataTables.dataTable?id=#theId"></script> }}}
   * 
   * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
   * {{{
   *   <script type="text/javascript">
   *     // <![CDATA[
   *       $(document).ready(function() {
			 $('#theId').dataTable();
		   });
   *     // ]]>
   *   </script> 
   * }}}
   */
  def dataTable = { 
    var id = S.attr("id") openOr "id: NOT DEFINED!?"
    var options = S.attr("options") openOr "" 
    " *" #> sch.dataTable(id)
  }

  
}
