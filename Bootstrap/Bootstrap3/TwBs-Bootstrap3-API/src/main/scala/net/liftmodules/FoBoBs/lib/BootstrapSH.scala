package net.liftmodules.FoBoBs.lib

import _root_.net.liftweb._
import util.{Props}
import http._
import common._
import net.liftweb.http._
import net.liftweb.http.js._
import net.liftweb.http.js.JsCmds._
import net.liftweb.http.js.JE.JsRaw
import net.liftweb.http.js.JsCmd

/**
  * ==Bootstrap Script Helper Bootstrap v3.x==
  * Bootstrap script helper is a helper class that implements some commonly 
  * used bootstrap component init/usage script functions. 
  * This convenience script functions is used in the [[net.liftmodules.FoBoBs.snippet.FoBo.Bs3Comp]] 
  * snippet but can also be used as a convenience helper in your own customized snippets.
  *  
  * @example If you find that the [[net.liftmodules.FoBoBs.snippet.FoBo.Bs3Comp]] snippet dose not fit you exact needs 
  * your can still use the BootstrapSH class to customize your own project snippets.
  * {{{
  *   import net.liftmodules.FoBoBs.lib.{BootstrapSH=>sch}
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
class BootstrapSH() extends ScriptHelper {

  /**
    * This function creates a inline script that will sets a modal action on a element.
    * 
    * @param id - The id of the element for which the modal should occur 
    * @param options - A string list of modal options 
    * @return scala.xml.Node
    * 
    */
  @deprecated("Use the modalScript function and wrap it in JsCmds.Script",
              "1.4.0")
  def modal(id: String, options: String = ""): scala.xml.Node = {
    var sc = modalScript(id, options)
    JsCmds.Script(sc)
  }

  /**
    * This function returns a script that sets a modal action.
    * 
    * @param id - The id of the element for which the modal should occur 
    * @param options - A string list of modal options 
    * @return net.liftweb.http.js.JsCmd
    * @since v1.4
    */
  def modalScript(id: String, options: String = ""): JsCmd = {
    JsRaw("""$(function () { $('%s').modal({%s}); }); """.format(id, options)).cmd
  }

  /**
    * This function creates a inline script that will sets a manual modal action on a element.
    * 
    * @param id - The id of the element for which the modal should occur 
    * @param action - toggle || show || hide || handleUpdate
    * @return scala.xml.Node   
    * 
    */
  @deprecated(
      "Use the modalManualActionScript function and wrap it in JsCmds.Script",
      "1.4.0")
  def modalManualAction(id: String, action: String = ""): scala.xml.Node = {
    var sc = modalManualActionScript(id, action)
    JsCmds.Script(sc)
  }

  /**
    * This function returns a script that sets a manual modal action.
    * 
    * @param id - The id of the element for which the modal should occur 
    * @param action - toggle || show || hide || handleUpdate  
    * @return net.liftweb.http.js.JsCmd
    * @since v1.4
    */
  def modalManualActionScript(id: String, action: String = ""): JsCmd = {
    JsRaw("""$(function () { $('%s').modal('%s'); }); """.format(id, action)).cmd
  }

  /**
    * This function returns a inline script that adds a load event to activate the dropdown component for a given id.
    * 
    * @param on - The class or id of the element for which the dropdown component should be activated.
    * @return scala.xml.Node
    * 
    */
  @deprecated(
      "Use the activateDropdownScript function and wrap it in JsCmds.Script",
      "1.4.0")
  def activateDropdown(on: String): scala.xml.Node = {
    var sc = this.loadEventScript(dropdownScript(on))
    JsCmds.Script(sc)
  }

  /**
    * This function returns a script that adds a load event to activate the dropdown component for a given id.
    * 
    * @param on - The class or id of the element for which the dropdown component should be activated.
    * @return net.liftweb.http.js.JsCmd 
    * @since v1.4  
    */
  def activateDropdownScript(on: String): JsCmd = {
    this.loadEventScript(dropdownScript(on))
  }

  /**
    * This function returns a script that sets a dropdown action.
    * 
    * @param on - The class or id of the element for which the dropdown component should be activated. 
    * @return net.liftweb.http.js.JsCmd 
    * @since v1.4
    */
  def dropdownScript(on: String): JsCmd = {
    JsRaw("""$('%s').dropdown()""".format(on)).cmd
  }

  /**
    * This function creates a script that sets a scrollspy action on a element.
    * 
    * @param id - The id of the element for which the scrollspy should occur 
    * @param options - A string list of scrollspy options
    * @return scala.xml.Node
    * 
    */
  @deprecated("Use the scrollspyScript function and wrap it in JsCmds.Script",
              "1.4.0")
  def scrollspy(id: String, options: String = ""): scala.xml.Node = {
    var sc = scrollspyScript(id, options)
    JsCmds.Script(sc)
  }

  /**
    * This function returns a script that sets a scrollspy action.
    * 
    * @param id - The id of the element for which the scrollspy should occur 
    * @param options - A string list of scrollspy options 
    * @return net.liftweb.http.js.JsCmd 
    * @since v1.4
    */
  def scrollspyScript(id: String, options: String = ""): JsCmd = {
    JsRaw(
        """$(function () { $('%s').scrollspy({%s}); }); """
          .format(id, options)).cmd
  }

  /**
    * This function creates a script that sets a tooltip action on a element.
    * 
    * @param id - The id of the element for which the tooltip should occur 
    * @param options - A string list of tooltip options 
    * @return scala.xml.Node
    * 
    */
  @deprecated("Use the tooltipScript function and wrap it in JsCmds.Script",
              "1.4.0")
  def tooltip(id: String, options: String = ""): scala.xml.Node = {
    var sc = tooltipScript(id, options)
    JsCmds.Script(sc)
  }

  /**
    * This function creates a script that sets a tooltip action.
    * 
    * @param id - The id of the element for which the tooltip should occur 
    * @param options - A string list of tooltip options 
    * @return net.liftweb.http.js.JsCmd 
    * @since v1.4
    */
  def tooltipScript(id: String, options: String = ""): JsCmd = {
    JsRaw(
        """$(function () { $('%s').tooltip({%s}); }); """
          .format(id, options)).cmd
  }

  /**
    * This function sets a manual tooltip action on a element.
    * 
    * @param id - The id of the element for which the tooltip should occur 
    * @param action - toggle || show || hide  
    * @return scala.xml.Node
    * 
    */
  @deprecated(
      "Use the tooltipManualActionScript function and wrap it in JsCmds.Script",
      "1.4.0")
  def tooltipManualAction(id: String, action: String = ""): scala.xml.Node = {
    JsCmds.Script(tooltipManualActionScript(id, action))
  }

  /**
    * This function returns a script that sets a manual tooltip action.
    * 
    * @param id - The id of the element for which the tooltip should occur 
    * @param action - toggle || show || hide  
    * @return net.liftweb.http.js.JsCmd
    * @since v1.4
    */
  def tooltipManualActionScript(id: String, action: String = ""): JsCmd = {
    JsRaw("""$(function () { $('%s').tooltip('%s'); }); """.format(id, action)).cmd
  }

  /**
    * This function sets a popover action on a element.
    * 
    * 
    * @param id - The id of the element for which the popover should occur 
    * @param options - A string list of popover options 
    * @return scala.xml.Node
    * 
    */
  @deprecated("Use the popoverScript function and wrap it in JsCmds.Script",
              "1.4.0")
  def popover(id: String, options: String = ""): scala.xml.Node = {
    var sc = popoverScript(id, options)
    JsCmds.Script(sc)
  }

  /**
    * This function returns a script that will sets a popover action.
    * 
    * @param id - The id of the element for which the popover should occur 
    * @param options - A string list of popover options 
    * @return net.liftweb.http.js.JsCmd 
    * @since v1.4
    */
  def popoverScript(id: String, options: String = ""): JsCmd = {
    JsRaw(
        """$(function () { $('%s').popover({%s}); }); """
          .format(id, options)).cmd
  }

  /**
    * This function sets a manual popover action on a element.
    * 
    * @param id - The id of the element for which the popover should occur 
    * @param action - toggle || show || hide  
    * @return scala.xml.Node
    * 
    */
  @deprecated(
      "Use the popoverManualActionScript function and wrap it in JsCmds.Script",
      "1.4.0")
  def popoverManualAction(id: String, action: String = ""): scala.xml.Node = {
    var sc = popoverManualActionScript(id, action)
    JsCmds.Script(sc)
  }

  /**
    * This function returns a script that sets a manual popover action.
    * 
    * @param id - The id of the element for which the popover should occur 
    * @param action - toggle || show || hide  
    * @return net.liftweb.http.js.JsCmd
    * @since v1.4
    */
  def popoverManualActionScript(id: String, action: String = ""): JsCmd = {
    JsRaw("""$(function () { $('%s').popover('%s'); }); """.format(id, action)).cmd
  }

  /**
    * This function prevents default action for a click on a popover. 
    * @param on - Can be a id attribute or something more general like the default a[rel=popover] 
    * @return scala.xml.Node
    * 
    */
  @deprecated(
      "Use the popoverPreventDefaultScript function and wrap it in JsCmds.Script",
      "1.4.0")
  def popoverPreventDefault(on: String = "a[rel=popover]"): scala.xml.Node = {
    var sc = popoverPreventDefaultScript(on)
    JsCmds.Script(sc)
  }

  /**
    * This function returns a script that prevents default action for a click on a popover. 
    * 
    * @param on - Can be a id attribute or something more general like the default a[rel=popover] 
    * @return net.liftweb.http.js.JsCmd 
    * @since v1.4
    */
  def popoverPreventDefaultScript(on: String = "a[rel=popover]"): JsCmd = {
    JsRaw(
        """$(function(){ $('%s').popover().click(function(e){e.preventDefault()});});"""
          .format(on)).cmd
  }

  /**
    * This function sets a collapse action on a element.
    * 
    * @param id - The id of the element for which the collapse should occur 
    * @param options - A string list of collapse options 
    * @return scala.xml.Node
    * 
    */
  @deprecated("Use the collapseScript function and wrap it in JsCmds.Script",
              "1.4.0")
  def collapse(id: String, options: String = ""): scala.xml.Node = {
    var sc = JsRaw(
        """$(function () { $('%s').collapse({%s}); }); """
          .format(id, options)).cmd
    JsCmds.Script(sc)
  }

  /**
    * This function returns a script that sets a collapse action.
    * 
    * @param id - The id of the element for which the collapse should occur 
    * @param options - A string list of collapse options 
    * @return net.liftweb.http.js.JsCmd
    * @since v1.4
    */
  def collapseScript(id: String, options: String = ""): JsCmd = {
    JsRaw(
        """$(function () { $('%s').collapse({%s}); }); """
          .format(id, options)).cmd
  }

  /**
    * This function sets a manual collapse action on a element.
    * 
    * @param id - The id of the element for which the collapse should occur 
    * @param action - toggle || show || hide  
    * @return scala.xml.Node
    * 
    */
  @deprecated(
      "Use the collapseManualActionScript function and wrap it in JsCmds.Script",
      "1.4.0")
  def collapseManualAction(id: String, action: String = ""): scala.xml.Node = {
    var sc = collapseManualActionScript(id, action)
    JsCmds.Script(sc)
  }

  /**
    * This function returns a script that sets a manual collapse action.
    * 
    * @param id - The id of the element for which the collapse should occur 
    * @param action - toggle || show || hide  
    * @return net.liftweb.http.js.JsCmd
    * @since v1.4
    */
  def collapseManualActionScript(id: String, action: String = ""): JsCmd = {
    JsRaw(
        """$(function () { $('%s').collapse('%s'); }); """
          .format(id, action)).cmd
  }

  /**
    * This function sets a carousel action on a element.
    * 
    * @param id - The id of the element for which the carousel should occur 
    * @param options - A string list of carousel options 
    * @return scala.xml.Node
    * 
    */
  @deprecated("Use the carouselSript function and wrap it in JsCmds.Script",
              "1.4.0")
  def carousel(id: String, options: String = ""): scala.xml.Node = {
    var sc = carouselSript(id, options)
    JsCmds.Script(sc)
  }

  /**
    * This function returns a script that sets a carousel action.
    * 
    * @param id - The id of the element for which the carousel should occur 
    * @param options - A string list of carousel options 
    * @return net.liftweb.http.js.JsCmd
    * @since v1.4 
    */
  def carouselSript(id: String, options: String = ""): JsCmd = {
    JsRaw(
        """$(function () { $('%s').collapse({%s}); }); """
          .format(id, options)).cmd
  }

  /**
    * This function sets a manual carousel action on a element.
    * 
    * @param id - The id of the element for which the carousel should occur 
    * @param action - cycle || pause || prev || next || number  
    * @return scala.xml.Node
    * 
    */
  @deprecated(
      "Use the carouselManualActionScript function and wrap it in JsCmds.Script",
      "1.4.0")
  def carouselManualAction(id: String, action: String = ""): scala.xml.Node = {
    var sc = carouselManualActionScript(id, action)
    JsCmds.Script(sc)
  }

  /**
    * This function returns a script that sets a manual carousel action.
    * 
    * @param id - The id of the element for which the carousel should occur 
    * @param action - cycle || pause || prev || next || number  
    * @return net.liftweb.http.js.JsCmd
    * @since v1.4  
    */
  def carouselManualActionScript(id: String, action: String = ""): JsCmd = {
    JsRaw(
        """$(function () { $('%s').collapse('%s'); }); """
          .format(id, action)).cmd
  }

  /*
   * Generate script block 200
   */
  //def generateScriptBlock020(...)
}
