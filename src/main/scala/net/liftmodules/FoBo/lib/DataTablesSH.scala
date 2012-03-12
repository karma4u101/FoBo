package net.liftmodules.FoBo.lib

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._
import net.liftweb.http._
import net.liftweb.http.js._
import net.liftweb.http.js.JsCmds._
import net.liftweb.http.js.JE.JsRaw
import net.liftweb.http.js.JsCmd


/**
 * ==DataTables Script Helper==
 * DataTables script helper is a helper class that implements some commonly used DataTables 
 * script functions. 
 * This convenience script functions is used in the [[net.liftmodules.FoBo.snippet.FoBo.DataTablesScriptHelper]] snippet but
 * can also be used as a convenience helper in your own customized snippets.
 *  
 * @example If you find that the [[net.liftmodules.FoBo.snippet.FoBo.DataTables]] snippet dose not fit you exact needs 
 * your can still use the ScriptHelper class to customize your own project snippets.
 * {{{
 *   import net.liftmodules.FoBo.lib.{DataTablesSH=>sch}
 *    :
 *   class MySnippet {
 *     
 *     lazy val sch = new sch()
 *     
 *     def someFunc = {
 *       :
 *       sch.fobohelper(...)
 *       :
 *     }
 *     :
 *   }
 * }}}
 */
class DataTablesSH extends Loggable {

  /**
   * This function sets a dataTable element.
   * 
   * @param id - The id for which the dataTable should be set 
   * @param options - dataTable options default=""
   * 
   */
  def dataTable(id:String,options:String=""):scala.xml.Node = {
    var sc = JsRaw("""$(document).ready(function() {
				         oTable = $('%s').dataTable({%s});
			           } );""".format(id,options)).cmd
	logger.debug("lib.DataTablesSH.dataTable(id,options) id=%s options=%s"format(id,options))		           
    JsCmds.Script(sc)  
  }   
  
}