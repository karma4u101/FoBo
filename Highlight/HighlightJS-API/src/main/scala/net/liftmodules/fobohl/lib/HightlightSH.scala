package net.liftmodules.fobohl.lib

import net.liftweb.http.js.JE.JsRaw
import net.liftweb.http.js.JsCmd

/**
  * ==Angular Highlight Script Helper==
  *
  * Highlight script helper is a helper class that implements some commonly
  * used higlight script functions.
  *
  */
class HightlightSH() extends ScriptHelper {

  /**
    * This function returns a JsCmd that contains a script to highlight js code blocks via jquery.
    *
    * '''Result:''' This will result in the following being returned in a JsCmd:
    * {{{
    *       $('pre code').each(function(i, block) { hljs.highlightBlock(block); });
    * }}}
    * @return net.liftweb.http.js.JsCmd
    * @since v1.6
    */
  def highlightBlocks(): JsCmd = {
    JsRaw(
      """$('pre code').each(function(i, block) { hljs.highlightBlock(block); });""").cmd
  }

}
