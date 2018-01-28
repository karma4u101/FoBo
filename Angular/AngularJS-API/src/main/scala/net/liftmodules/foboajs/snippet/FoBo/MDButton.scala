package net.liftmodules.foboajs.snippet.FoBo

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.sitemap._
import net.liftweb.http._
import net.liftweb._
import Helpers._

class MDButton extends StatefulSnippet with Loggable {

  def dispatch: DispatchIt = {
    case "ngHref" => ngHref
    case "href"   => href
  }

  /**
    *  '''Snippet Params:'''
    *
    *  - '''Param''' ''name'' - The Loc name to create the link value from.
    *
    * @example
    * {{{ <md-button data-lift="FoBo.MDButton.ngHref?name=Login" ng-href="#"> }}}
    *
    * '''Result:'''
    * {{{ <md-button ng-href="/evContext/andloginPath"> }}}
    *
    */
  def ngHref: net.liftweb.util.CssSel = {
    val name = S.attr("name") getOrElse ""
    "md-button [ng-href]" #> this.getLink(name)
  }

  /**
    *  '''Snippet Params:'''
    *
    *  - '''Param''' ''name'' - The Loc name to create the link value from.
    *
    * @example
    * {{{ <md-button data-lift="FoBo.MDButton.ngHref?name=Login" href="#"> }}}
    *
    * '''Result:'''
    * {{{ <md-button href="/evContext/andloginPath"> }}}
    *
    */
  def href: net.liftweb.util.CssSel = {
    val name = S.attr("name") getOrElse ""
    "md-button [href]" #> this.getLink(name)
  }

  private def getLink(name: S.attr.Info): String = {
    val loc = SiteMap.findAndTestLoc(name).toList
    val link = (if (!loc.isEmpty) loc.head.createDefaultLink else None) getOrElse NodeSeq.Empty
    if (!S.contextPath.isEmpty() && !link.isEmpty)
      S.contextPath + link.toString()
    else if (!link.isEmpty)
      link.toString()
    else {
      logger.warn("getLink could not create link for loc name='" + name + "'")
      ""
    }
  }
}
