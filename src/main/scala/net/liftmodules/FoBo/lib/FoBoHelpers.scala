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
* This object is a helper that implements some commonly used 
* bootstrap convenience script functions used in the FoBo.Bootstrap snippet.
* It can also be used as a helper in your own customized snippets.  
*/
object BootstrapScriptHelper {
  
  /**
   * This function prevents default action for a click on a popover. 
   * @param on - Can be a id attribute or something more general like the default a[rel=popover] 
   */
  def popoverPreventDefault(on:String="a[rel=popover]"):scala.xml.Node = {
      var c = JsRaw("""$(function(){$('%s').popover().click(function(e){e.preventDefault()});});""".format(on)).cmd
      JsCmds.Script(c)  
  }
  
  /**
   * This function sets a popover action on a element.
   * 
   * @param id - The id of the element for which the popover should occur 
   * @param options - A string list of popover options 
   * 
   */
  def popover(id:String,options:String=""):scala.xml.Node = {
    var c = JsRaw("""$(function () { $('%s').popover({%s}); }); """.format(id,options)).cmd
    JsCmds.Script(c)  
  }
  
  /*
   * Generate script block 200
   */
  //def generateScriptBlock020(...)
}


  



