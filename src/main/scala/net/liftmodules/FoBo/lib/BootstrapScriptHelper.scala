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
 * ==Bootstrap Script Helper==
 * Bootstrap script helper is a helper class that implements some commonly 
 * used bootstrap component init/usage script functions. 
 * This convenience script functions is used in the FoBo.Bootstrap snippet but
 * can also be used as a convenience helper in your own customized snippets.
 *  
 * @example If you find that the net.liftmodules.FoBo.Bootstrap snippet dose not fit you exact needs 
 * your can still use the BootstrapScriptHelper class to customize your own project snippets.
 * {{{
 *   import net.liftmodules.FoBo.lib.{BootstrapScriptHelper=>sch}
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
 *  
 */
class BootstrapScriptHelper() extends ScriptHelper {
  
  /**
   * This function prevents default action for a click on a popover. 
   * @param on - Can be a id attribute or something more general like the default a[rel=popover] 
   */
  def popoverPreventDefault(on:String="a[rel=popover]"):scala.xml.Node = {
      var sc = JsRaw("""$(function(){$('%s').popover().click(function(e){e.preventDefault()});});""".format(on)).cmd
      JsCmds.Script(sc)  
  }
  
  /**
   * This function sets a popover action on a element.
   * 
   * @param id - The id of the element for which the popover should occur 
   * @param options - A string list of popover options 
   * 
   */
  def popover(id:String,options:String=""):scala.xml.Node = {
    var sc = JsRaw("""$(function () { $('%s').popover({%s}); }); """.format(id,options)).cmd
    JsCmds.Script(sc)  
  }
  
  /**
   * This function will add a load event to activate the dropdown component for a given id.
   * 
   * @param on - The class or id of the element for which the dropdown component should be activated.
   * 
   */
  def activateDropdown(on:String):scala.xml.Node = {
    this.addLoadEvent(JsRaw("""$('%s').dropdown()""".format(on)).cmd)
  }
  /*
   * Generate script block 200
   */
  //def generateScriptBlock020(...)
}


  



