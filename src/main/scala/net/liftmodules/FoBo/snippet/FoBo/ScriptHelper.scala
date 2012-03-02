package net.liftmodules.FoBo.snippet.FoBo

import scala.xml.{ NodeSeq, Text }
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http._
import net.liftweb._
import Helpers._
import net.liftmodules.FoBo.lib.{ScriptHelper=>sch}

/**
 * ==Script Helper Snippet==
 * 
 * This snippet class contains functions for common transform operations useful when working 
 * with the any toolkit.
 * '''Example''' Most of the functions in this class can be invoced using the following pattern. 
 * {{{ data-lift="FoBo.ScriptHelper.functionName?paramName=paramValue&...." }}} 
 * For more examples see the individual transform functions.
 */
class ScriptHelper extends StatefulSnippet with Loggable {

  lazy val sch = new sch()
  
  def dispatch = {
    case "registerLoadEventFactory" => registerLoadEventFactory
  }
  
  /**
   * This function register a load event factory script
   * 
   * '''Example'''  
   * {{{ 
   *     <head>
   *       :
   *       <script data-lift="FoBo.Bootstrap.activateDropdown?on=.dropdown-toggle"></script> 
   *       <script data-lift="FoBo.ScriptHelper.registerLoadEventFactory"></script>
   *     </head>
   * }}}
   * This load event factory script has to be registered ones before any activation can be loaded. 
   * 
   * '''Result:''' This example snippet invocation will result in the following script:
   * {{{
   *  <script type="text/javascript">// drop down activation that uses the load factory </script>
   *  <script type="text/javascript">
   *    // <![CDATA[
   *      function addLoadEvent(func) {
   *             var oldonload = window.onload;
   *             if (typeof window.onload != 'function') {
   *                window.onload = func;
   *             } else {
   *                window.onload = function() {
   *                   if (oldonload) {
   *                      oldonload();
   *                   }
   *                   func();

   *                }
   *             }
   *          }
   *    // ]]>  
   *  </script>
   * }}}
   * 
   */  
  def registerLoadEventFactory = {
    " *" #> sch.registerLoadEventFactory()
  }
 

  
}
