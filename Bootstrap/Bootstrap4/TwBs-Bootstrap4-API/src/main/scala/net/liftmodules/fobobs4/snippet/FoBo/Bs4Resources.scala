package net.liftmodules.fobobs4.snippet.FoBo

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http._
import net.liftweb._
import Helpers._

/**
  * ==Bs4Resources Snippet==
  *
  * This snippet class lets you inject FoBo Bootstrap4 resources into your templates.
  * Instead of hand write the resource tags you can use this helper snippet to inject it for you.
  *
  * '''Example''' Invoke with
  * {{{ data-lift="FoBo.Bs4Resources.functionName?paramName=paramValue&...." }}}
  * For more examples see the individual transform functions.
  * @since v2.0
  */
class Bs4Resources extends StatefulSnippet {

  def dispatch = {
    case "injectJS"  => injectJS
    case "injectCSS" => injectCSS
  }

  /**
    * '''Snippet Params:'''
    *
    *  - '''Param''' ''resources'' - A comma separated list of FoBo managed js resources.
    *
    * '''Example'''
    * {{{ <script data-lift="FoBo.Bs4Resources.injectJS?resources=bootstrap"></script> }}}
    * or making bootstrap.js implicit.
    *  {{{ <script data-lift="FoBo.Bs4Resources.injectJS"></script> }}}
    *
    * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
    * {{{
    * <script src="/classpath/fobo/bootstrap.js" type="text/javascript"></script>
    * }}}
    *
    * @since v2.0
    */
  def injectJS: net.liftweb.util.CssSel = {
    def transform(res: List[String]): List[scala.xml.Elem] = {
      val res2 = if (!res.contains("bootstrap")) "bootstrap" :: res else res
      val result = (for {
        r <- res2
      } yield
        <script type="text/javascript" src={ "/classpath/fobo/" + r + ".js" } ></script>)
      result
    }
    val res = S
      .attr("resources")
      .map(x => x.split(',').map(x => x.trim).toList.distinct)
      .openOr(List())
    " *" #> transform(res)
  }

  /**
    * '''Snippet Params:'''
    *
    *  - '''Param''' ''resources'' - A comma separated list of FoBo managed Bootstrap4 css resources.
    *
    * '''Example'''
    * {{{ <link data-lift="FoBo.Bs4Resources.injectCSS?resources=bootstrap"></link>  }}}
    * or making bootstrap.css implicit.
    * {{{ <link data-lift="FoBo.Bs4Resources.injectCSS"></link>  }}}
    *
    * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
    * {{{
    * <link href="/classpath/fobo/bootstrap.css" rel="stylesheet" type="text/css" />
    * }}}
    *
    * @since v2.0
    */
  def injectCSS: net.liftweb.util.CssSel = {
    def transform(res: List[String]): List[scala.xml.Elem] = {
      val res2 = if (!res.contains("bootstrap")) "bootstrap" :: res else res
      val result = (for {
        r <- res2
      } yield
        <link type="text/css" rel="stylesheet" href={ "/classpath/fobo/" + r + ".css" } />)
      result
    }
    val res = S
      .attr("resources")
      .map(x => x.split(',').map(x => x.trim).toList.distinct)
      .openOr(List())
    " *" #> transform(res)
  }

}
