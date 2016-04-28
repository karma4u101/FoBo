package net.liftmodules.FoBoHL.lib

import net.liftweb.util._
import net.liftweb.http._
import net.liftweb.http.js._
import net.liftweb.http.js.JsCmds._
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
   * This function returns a script that will sets a popover action.
   * 
   * @param id - The id of the element for which the popover should occur 
   * @param options - A string list of popover options 
   * @return net.liftweb.http.js.JsCmd 
   * @since v1.4
   */
  def initHighlightingOnLoad():JsCmd = {
    JsRaw("""$('pre code').each(function(i, block) { hljs.highlightBlock(block); });""").cmd
    //JsRaw("""$(function () { $('%s').popover({%s}); }); """.format(id,options)).cmd
    //$('pre code').each(function(i, block) { hljs.highlightBlock(block); });
  }    
  
}