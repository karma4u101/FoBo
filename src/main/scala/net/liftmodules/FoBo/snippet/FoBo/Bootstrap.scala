package net.liftmodules.FoBo.snippet.FoBo

import scala.xml.{ NodeSeq, Text }
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http._
import net.liftweb._
import Helpers._
import net.liftmodules.FoBo.lib.{BootstrapScriptHelper=>bsh}

/**
 * The Bootstrap snippet class contains functions for common transform 
 * operations useful when working with the Bootstrap toolkit.
 * @example Invoke with {{{ data-lift="FoBo.Bootstrap.functionName?paramName=paramValue&...." }}} 
 */
class Bootstrap extends StatefulSnippet with Loggable {

  def dispatch = {
    case "popover" => popover
    case "popoverPreventDefault" => popoverPreventDefault
  }
  
  /**
   * This function sets a popover action on a element.
   * 
   * $ - '''Snippet param''' ''id'' The element id 
   * $ - '''Snippet param''' ''option'' The option string see bootstrap documentation for available options.
   * 
   * @example {{{ <script data-lift="FoBo.Bootstrap.popover?id=theId&option=placement:'left'"></script> }}}
   */
  def popover = { 
    var id = S.attr("id") openOr "id: NOT DEFINED!?"
    var options = S.attr("options") openOr "" 
    " *" #> bsh.popover(id, options)
  }
 
  /**
   * This function prevents the default action on a popover element.
   * 
   * $ - '''Snippet param''' ''on'' The element id or something more general like the default value a[rel=popover]
   * 
   * @example {{{ <script data-lift="FoBo.Bootstrap.popoverPreventDefault?on=theId"></script> }}}
   */  
  def popoverPreventDefault = {
     var on = onTest(S.attr("on") openOr "a[rel=popover]")
    " *" #> bsh.popoverPreventDefault(on)
  }

  private def onTest(on:String):String = on match {
    case  "arelpop" => "a[rel=popover]"
    case  "a[rel" => "a[rel=popover]"
    case _ => on  
  }  
  
}