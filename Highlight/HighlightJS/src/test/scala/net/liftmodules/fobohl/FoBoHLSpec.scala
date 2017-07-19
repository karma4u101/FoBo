package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoPaSpec extends Specification {
  "FoBoPaSpec Specification".title

  sequential

  //HighlightJS930
  "With fobohl.Toolkit.init set to fobohl.Toolkit.HighlightJS930 the ResourceServer" should {
    "allow  fobo/highlight/highlight.pack.js" in {
      allowToolkitInit(
        fobohl.Toolkit.HighlightJS930,
        "fobo" :: "highlight" :: "highlight.pack.js" :: Nil) must_== true
    }
    "rewrit rewrit fobo/highlight/highlight.pack.js to fobo/highlight/9.3.0/js/highlight.pack.js" in {
      rewriteToolkitInit(
        fobohl.Toolkit.HighlightJS930,
        "fobo" :: "highlight" :: "highlight.pack.js" :: Nil) must_==
        List("fobo", "highlight", "9.3.0", "js", "highlight.pack.js")
    }
  }

  "With fobohl.Resource.init set to fobohl.Resource.HighlightJS930 the ResourceServer" should {
    "allow  fobo/highlight/highlight.pack.js" in {
      allowResource(
        fobohl.Resource.HighlightJS930,
        "fobo" :: "highlight" :: "highlight.pack.js" :: Nil) must_== true
    }
    "rewrit rewrit fobo/highlight/highlight.pack.js to fobo/highlight/9.3.0/js/highlight.pack.js" in {
      rewriteResource(
        fobohl.Resource.HighlightJS930,
        "fobo" :: "highlight" :: "highlight.pack.js" :: Nil) must_==
        List("fobo", "highlight", "9.3.0", "js", "highlight.pack.js")
    }
  }

  //=== Toolkit.init ==============//
  def allowToolkitInit(resource: fobohl.Toolkit, path: List[String]) = {
    fobohl.Toolkit.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: fobohl.Toolkit, path: List[String]) = {
    fobohl.Toolkit.init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobohl.Resource, path: List[String]) = {
    fobohl.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobohl.Resource, path: List[String]) = {
    fobohl.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
