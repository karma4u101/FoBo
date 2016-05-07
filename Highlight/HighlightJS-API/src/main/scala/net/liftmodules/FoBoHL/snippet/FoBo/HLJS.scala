package net.liftmodules.FoBoHL.snippet.FoBo

import scala.xml.{ NodeSeq, Text }
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http._
import net.liftweb._
import Helpers._
import net.liftweb.http.js._
import net.liftweb.http.js.JsCmds._
import net.liftmodules.FoBoHL.lib.{HightlightSH=>sch}

/**
 * ==Hightlight JS Snippet==
 * 
 * This snippet class contains a collection of functions for common transform operations useful when working 
 * with the Higlight toolkit components.
 * '''Example''' Invoke with 
 * {{{ data-lift="FoBo.JLJS.functionName?paramName=paramValue&...." }}} 
 * For more examples see the individual transform functions.
 * @since v1.6
 */
class HLJS extends StatefulSnippet with Loggable {

  private lazy val sch = new sch()
  
  def dispatch = {
    case "initHighlightingOnLoad" => initHighlightingOnLoad
  }
  
  /**
   * '''Lift 3+ only''' --
   * This function initiates the Higlight code sections by appending a script snippet to lift's page-script on page load function. 
   *
   * 
   * '''Example''' 
   * {{{ <script data-lift="FoBo.HLJS.initHighlightingOnLoad"></script> }}}
   * 
   * '''Result:''' This example will result in the following being appended to lift's page-script on page load function:
   * {{{
   *       $('pre code').each(function(i, block) { hljs.highlightBlock(block); });
   * }}}
   * @since v1.6
   */
  def initHighlightingOnLoad:CssSel = {  
    S.appendJs(sch.initHighlightingOnLoad())
    " *" #> ""
  }
  
  
}