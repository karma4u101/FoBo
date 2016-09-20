package net.liftmodules.FoBoHL.snippet.FoBo

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http._
import net.liftweb._
import Helpers._

/**
  * ==HLResources Snippet==
  *
  * This snippet class lets you inject FoBo Hightlight resources into your templates.
  * Instead of hand write the resource tags you can use this helper snippet to inject it for you.
  *
  * '''Example''' Invoke with
  * {{{ data-lift="FoBo.HLResources.functionName?paramName=paramValue&...." }}}
  * For more examples see the individual transform functions.
  * @since v1.6
  */
class HLResources extends StatefulSnippet {

  def dispatch = {
    case "injectJS" => injectJS
    case "injectCSS" => injectCSS
  }

  /**
    * '''Snippet Params:'''
    *
    *  - '''Param''' ''resources'' - A comma separated list of FoBo managed js resources.
    *
    * '''Example'''
    * {{{ <script data-lift="FoBo.HLResources.injectJS?resources=highlight.pack"></script> }}}
    *
    * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
    * {{{
    * <script src="/classpath/fobo/highlight/highlight.pack.js" type="text/javascript"></script>
    * }}}
    *
    * @since v1.6
    */
  def injectJS: net.liftweb.util.CssSel = {
    def transform(res: List[String]): List[scala.xml.Elem] = {
      val result: List[scala.xml.Elem] = (for {
        r <- res
      } yield
        <script type="text/javascript" src={ "/classpath/fobo/highlight/" + r + ".js" } ></script>)
      result
    }
    val res: List[String] = S
      .attr("resources")
      .map(x => x.split(',').map(x => x.trim).toList.distinct)
      .openOr(List())
    " *" #> transform(res.toList)
  }

  /**
    * '''Snippet Params:'''
    *
    *  - '''Param''' ''resources'' - A comma separated list of FoBo managed Hightlight css resources.
    *
    * '''Example'''
    * {{{ <link data-lift="FoBo.HLResources.injectCSS?resources=github-gist"></link>  }}}
    *
    * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
    * {{{
    * <link href="/classpath/fobo/highlight/github-gist.css" rel="stylesheet" type="text/css" />
    * }}}
    *
    * @since v1.3
    */
  def injectCSS: net.liftweb.util.CssSel = {
    def transform(res: List[String]): List[scala.xml.Elem] = {
      val result: List[scala.xml.Elem] = (for {
        r <- res
      } yield
        <link type="text/css" rel="stylesheet" href={ "/classpath/fobo/highlight/" + r + ".css" } />)
      result
    }
    val res: List[String] = S
      .attr("resources")
      .map(x => x.split(',').map(x => x.trim).toList.distinct)
      .openOr(List())
    " *" #> transform(res.toList)
  }

}
