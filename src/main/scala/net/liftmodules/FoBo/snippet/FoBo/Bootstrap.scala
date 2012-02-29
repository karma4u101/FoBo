package net.liftmodules.FoBo.snippet.FoBo

import scala.xml.{ NodeSeq, Text }
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http._
import net.liftweb._
import Helpers._
import net.liftmodules.FoBo.lib.{BootstrapScriptHelper=>bsh}

/**
 * ==Bootstrap Snippet==
 * 
 * This snippet class contains functions for common transform operations useful when working 
 * with the Bootstrap toolkit.
 * @example Invoke with {{{ data-lift="FoBo.Bootstrap.functionName?paramName=paramValue&...." }}} 
 * For more examples see the individual transform functions.
 */
class Bootstrap extends StatefulSnippet with Loggable {

  lazy val bsh = new bsh()
  
  def dispatch = {
    case "popover" => popover
    case "popoverPreventDefault" => popoverPreventDefault
    case "activateDropdown" => activateDropdown
  }
  
  /**
   * This function sets a popover action on a element.
   *
   * '''Snippet Params:'''
   * 
   *  - '''Param''' ''id'' - The element id 
   *  - '''Param''' ''option'' - The option string see bootstrap documentation for available options.
   * 
   * @example {{{ <script data-lift="FoBo.Bootstrap.popover?id=#theId&option=placement:'left'"></script> }}}
   * 
   * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
   * {{{
   *   <script type="text/javascript">
   *     // <![CDATA[
   *       $(function () { $('#theId').popover({placement:'left'}); }); ;
   *     // ]]>
   *   </script> 
   * }}}
   */
  def popover = { 
    var id = S.attr("id") openOr "id: NOT DEFINED!?"
    var options = S.attr("options") openOr "" 
    " *" #> bsh.popover(id, options)
  }
 
  /**
   * This function prevents the default action on a popover element.
   * 
   * '''Snippet Params:'''
   * 
   *  - '''Param''' ''on'' - The element id or something more general like the default value a[rel=popover]
   * 
   * @example {{{ <script data-lift="FoBo.Bootstrap.popoverPreventDefault?on=#theId"></script> }}}
   * 
   * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
   * {{{
   *   <script type="text/javascript">
   *     // <![CDATA[
   *       $(function(){$('#theId').popover().click(function(e){e.preventDefault()});});;
   *     // ]]>
   *   </script> 
   * }}}
   */  
  def popoverPreventDefault = {
     var on = onTest(S.attr("on") openOr "a[rel=popover]")
    " *" #> bsh.popoverPreventDefault(on)
  }

  /**
   * This function loads the dropdown activation
   * 
   * '''Snippet Param:'''
   * 
   * - '''Param''' ''on'' - The element id or class to activate dropdown on 
   * 
   * @example 
   * {{{ 
   *     <head>
   *       :
   *       <script data-lift="FoBo.Bootstrap.activateDropdown?on=.dropdown-toggle"></script> 
   *       <script data-lift="FoBo.ScriptHelper.registerLoadEventFactory"></script>
   *     </head>
   * }}}
   * The load event factory has to be registered ones before any activation can be loaded. 
   * 
   * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
   * {{{
   *  <script type="text/javascript">
   *    // <![CDATA[
   *      addLoadEvent(function() { $('.dropdown-toggle').dropdown(); });;
   *    // ]]>
   *  </script>
   *  <script type="text/javascript">//registerLoadEventFactory script ...</script>
   * }}}
   * 
   */
  def activateDropdown = {
    var on = S.attr("on") openOr "on: ELEMENT CLASS or ID NOT DEFINED!?"
    " *" #> bsh.activateDropdown(on)
  }
  
  private def onTest(on:String):String = on match {
    case  "arelpop" => "a[rel=popover]"
    case  "a[rel" => "a[rel=popover]"
    case _ => on  
  }  
  
}