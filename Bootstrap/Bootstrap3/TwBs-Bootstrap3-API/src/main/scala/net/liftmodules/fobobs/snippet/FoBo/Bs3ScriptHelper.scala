package net.liftmodules.fobobs.snippet.FoBo

import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http._
import Helpers._
import net.liftweb.http.js._
import net.liftmodules.fobobs.lib.BootstrapSH

/**
  * ==Script Helper Snippet Bootstrap v3.x==
  *
  * This snippet class contains functions for common transform operations useful when working
  * with the any toolkit, for convenience included as a Bootstrap v3.x snippet.
  * '''Example''' Most of the functions in this class can be invoked using the following pattern.
  * {{{ data-lift="FoBo.Bs3ScriptHelper.functionName?paramName=paramValue&...." }}}
  * For more examples see the individual transform functions.
  * @since v1.1
  */
class Bs3ScriptHelper extends StatefulSnippet with Loggable {

  private lazy val sch = new BootstrapSH()

  def dispatch = {
    case "registerLoadEventFactory" => registerLoadEventFactory
    case "registerLoadEventFactoryAppendGlobalJs" =>
      registerLoadEventFactoryAppendGlobalJs
  }

  /**
    * This function register a load event factory script
    *
    * '''Example'''
    * {{{
    *     <head>
    *       :
    *       <script data-lift="FoBo.Bs3Comp.activateDropdown?on=.dropdown-toggle"></script>
    *       <script data-lift="FoBo.Bs3ScriptHelper.registerLoadEventFactory"></script>
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
  def registerLoadEventFactory: CssSel = {
    " *" #> JsCmds.Script(sch.registerLoadEventFactoryScript())
  }

  /**
    * '''Lift 3 alternativ''' -- This function creates a register load event factory function and
    * appends it to lift's page-script global space.
    * @since v1.4
    */
  def registerLoadEventFactoryAppendGlobalJs: CssSel = {
    var js = sch.registerLoadEventFactoryScript()
    S.appendGlobalJs(js)
    " *" #> ""
  }

}
