package net.liftmodules.fobohl.snippet.FoBo

import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http._
import Helpers._
import net.liftmodules.fobohl.lib._

/**
  * ==Hightlight JS Snippet==
  *
  * This snippet class contains a collection of functions for common transform operations useful when working
  * with the Higlight toolkit components.
  * @example Invoke with
  * {{{ data-lift="FoBo.JLJS.functionName?paramName=paramValue&...." }}}
  * For more examples see the individual transform functions.
  * @since v1.6
  */
class HLJS extends StatefulSnippet with Loggable {

  private lazy val sch = new HightlightSH()

  def dispatch = {
    case "initHighlightingOnLoad" => initHighlightingOnLoad
  }

  /**
    * '''Lift 3+ only''' --
    * This function initiates the Higlight code sections by appending a script snippet to lift's page-script on page load function.
    *
    *
    * @example
    * {{{ <script data-lift="FoBo.HLJS.initHighlightingOnLoad"></script> }}}
    *
    * '''Result:''' This example will result in the following being appended to lift's page-script on page load function:
    * {{{
    *       $('pre code').each(function(i, block) { hljs.highlightBlock(block); });
    * }}}
    * @since v1.6
    */
  def initHighlightingOnLoad: CssSel = {
    S.appendJs(sch.highlightBlocks())
    " *" #> ""
  }

}
