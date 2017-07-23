package net.liftmodules.fobobs.snippet.FoBo

import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http._
import Helpers._
import net.liftweb.http.js._
import net.liftmodules.fobobs.lib.BootstrapSH

/**
  * ==Bs3Component's Snippet Bootstrap v3.x==
  *
  * This snippet class contains a collection of functions for common transform operations useful when working
  * with the Bootstrap toolkit components.
  * @example Invoke with
  * {{{ data-lift="FoBo.Bs3Comp.functionName?paramName=paramValue&...." }}}
  * For more examples see the individual transform functions.
  * @since v1.1
  */
class Bs3Comp extends StatefulSnippet with Loggable {

  private lazy val sch = new BootstrapSH()

  def dispatch = {
    case "popover"                       => popover
    case "popoverAppendJs"               => popoverAppendJs
    case "popoverPreventDefault"         => popoverPreventDefault
    case "popoverPreventDefaultAppendJs" => popoverPreventDefaultAppendJs
    case "tooltip"                       => tooltip
    case "tooltipAppendJs"               => tooltipAppendJs
    case "activateDropdown"              => activateDropdown
    case "activateDropdownAppendJs"      => activateDropdownAppendJs

  }

  /**
    * This function sets a popover action on a element by inlining a script snippet on the page.
    *
    * '''Snippet Params:'''
    *
    *  - '''Param''' ''id'' - The element id
    *  - '''Param''' ''options'' - The option string see bootstrap documentation for available options.
    *
    * @example
    * {{{ <script data-lift="FoBo.Bs3Comp.popover?id=#theId&options=placement:'left'"></script> }}}
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
    " *" #> JsCmds.Script(sch.popoverScript(id, options))
  }

  /**
    * '''Lift 3 alternativ''' --
    * This function sets a popover action on a element by appending a script snippet to lift's page-script on page load function.
    *
    * '''Snippet Params:'''
    *
    *  - '''Param''' ''id'' - The element id
    *  - '''Param''' ''options'' - The option string see bootstrap documentation for available options.
    *
    * @example
    * {{{ <script data-lift="FoBo.Bs3Comp.popoverAppendJs?id=#theId&options=placement:'left'"></script> }}}
    *
    * '''Result:''' This example will result in the following being appended to lift's page-script on page load function:
    * {{{
    *       $(function () { $('#theId').popover({placement:'left'}); }); ;
    * }}}
    * @since v1.4
    */
  def popoverAppendJs: CssSel = {
    var id = S.attr("id") openOr "id: NOT DEFINED!?"
    var options = S.attr("options") openOr ""
    S.appendJs(sch.popoverScript(id, options))
    " *" #> ""
  }

  /**
    * This function inlines a tooltip action on a element in place of the snippet invocation.
    * @note If you are using Lift 3 you should use the AppendJs alternative.
    *
    * '''Snippet Params:'''
    *
    *  - '''Param''' ''id'' - The element id
    *  - '''Param''' ''options'' - The option string see bootstrap documentation for available options.
    *
    * @example Showing a example element using the tooltip and the actual snippet invocation
    * {{{
    *  <a id="aId"
    *     title="The most powerful, most secure web framework available today. It simply rocks!"
    *     href="http://liftweb.net/">Lift</a>
    *  <script data-lift="FoBo.Bs3Comp.tooltip?id=#aId&options=placement:'bottom'"></script>
    * }}}
    *
    * '''Result:''' The script tag with the snippet invocation will result in the following being injected in place of the snippet invocation:
    * {{{
    *   <script type="text/javascript">
    *     // <![CDATA[
    *       $(function () { $('#aId').tooltip({placement:'bottom'}); }); ;
    *     // ]]>
    *   </script>
    * }}}
    * @see [[net.liftmodules.fobobs.lib.BootstrapSH.tooltipScript]]
    */
  def tooltip: CssSel = {
    var id = S.attr("id") openOr "id: NOT DEFINED!?"
    var options = S.attr("options") openOr ""
    " *" #> JsCmds.Script(sch.tooltipScript(id, options))
  }

  /**
    * '''Lift 3 alternativ''' -- This function sets a tooltip action on a element by appending to lift's page-script on page load function.
    *
    * '''Snippet Params:'''
    *
    *  - '''Param''' ''id'' - The element id
    *  - '''Param''' ''options'' - The option string see bootstrap documentation for available options.
    *
    * @example Showing a example element using the tooltip and the actual snippet invocation
    * {{{
    *  <a id="aId"
    *     title="The most powerful, most secure web framework available today. It simply rocks!"
    *     href="http://liftweb.net/">Lift</a>
    *  <script data-lift="FoBo.Bs3Comp.tooltip?id=#aId&options=placement:'bottom'"></script>
    * }}}
    *
    * '''Result:''' The script tag with the snippet invocation will result in the following being
    * injected in the lift page script :
    * {{{
    *       $(function () { $('#aId').tooltip({placement:'bottom'}); });
    * }}}
    * @since v1.4
    */
  def tooltipAppendJs: CssSel = {
    var id = S.attr("id") openOr "id: NOT DEFINED!?"
    var options = S.attr("options") openOr ""
    S.appendJs(sch.tooltipScript(id, options))
    " *" #> ""
  }

  /**
    * This function prevents the default action on a popover element.
    *
    * '''Snippet Params:'''
    *
    *  - '''Param''' ''on'' - The element id or something more general like the default value a[rel=popover]
    *
    * @example
    * {{{ <script data-lift="FoBo.Bs3Comp.popoverPreventDefault?on=#theId"></script> }}}
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
    " *" #> JsCmds.Script(sch.popoverPreventDefaultScript(on)) //  sch.popoverPreventDefault(on)
  }

  /**
    * '''Lift 3 alternativ''' -- This function prevents the default action on a popover element.
    *
    * '''Snippet Params:'''
    *
    *  - '''Param''' ''on'' - The element id or something more general like the default value a[rel=popover]
    *
    * @example
    * {{{ <script data-lift="FoBo.Bs3Comp.popoverPreventDefault?on=#theId"></script> }}}
    *
    * '''Result:''' This example will result in the following being appended to lift's
    * page-script document ready function:
    * {{{
    *       $(function(){$('#theId').popover().click(function(e){e.preventDefault()});});;
    * }}}
    * @since v1.4
    */
  def popoverPreventDefaultAppendJs: CssSel = {
    var on = onTest(S.attr("on") openOr "a[rel=popover]")
    S.appendJs(sch.popoverPreventDefaultScript(on))
    " *" #> ""
  }

  /**
    * This function loads the dropdown activation
    * @note If you are using Lift 3 you should use the AppendJs alternative.
    *
    * '''Snippet Param:'''
    *
    * - '''Param''' ''on'' - The element id or class to activate dropdown on
    *
    * @example
    * {{{
    *     <head>
    *       :
    *       <script data-lift="FoBo.Bs3Comp.activateDropdown?on=.dropdown-toggle"></script>
    *       <script data-lift="FoBo.Bs3ScriptHelper.registerLoadEventFactory"></script>
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
    " *" #> JsCmds.Script(sch.activateDropdownScript(on))
  }

  /**
    * '''Lift 3 alternativ''' -- This function loads the dropdown activation
    *
    * '''Snippet Param:'''
    *
    * - '''Param''' ''on'' - The element id or class to activate dropdown on
    *
    * @example
    * {{{
    *     <head>
    *       :
    *       <script data-lift="FoBo.Bs3Comp.activateDropdownAppendJs?on=.dropdown-toggle"></script>
    *       <script data-lift="FoBo.ScriptHelper.registerLoadEventFactoryAppendGlobalJs"></script>
    *     </head>
    * }}}
    * The load event factory has to be registered ones before any activation can be loaded.
    *
    * '''Result:''' This example will result in the following being appended to lift's
    * page-script document ready function:
    * {{{
    *      addLoadEvent(function() { $('.dropdown-toggle').dropdown(); });;
    * }}}
    * @since v1.4
    */
  def activateDropdownAppendJs = {
    var on = S.attr("on") openOr "on: ELEMENT CLASS or ID NOT DEFINED!?"
    S.appendJs(sch.activateDropdownScript(on))
    " *" #> ""
  }

  private def onTest(on: String): String = on match {
    case "arelpop" => "a[rel=popover]"
    case "a[rel"   => "a[rel=popover]"
    case _         => on
  }

}
