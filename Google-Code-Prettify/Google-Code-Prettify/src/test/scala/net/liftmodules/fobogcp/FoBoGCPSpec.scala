package net.liftmodules

import net.liftweb._
import http._

import org.specs2.mutable.Specification

object FoBoGCPSpec extends Specification {
  "FoBoGCPSpec Specification".title

  sequential

  //PrettifyJun201
  "With fobogcp.Toolkit.init set to fobogcp.Toolkit.PrettifyJun2011 the ResourceServer" should {
    "allow  fobo/prettify.js" in {
      allowToolkitInit(fobogcp.Toolkit.PrettifyJun2011,
                       "fobo" :: "prettify.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteToolkitInit(fobogcp.Toolkit.PrettifyJun2011,
                         "fobo" :: "prettify.js" :: Nil) must_==
        List("fobo", "google-code", "js", "prettify.js")
    }
  }

  "With fobogcp.Resource.init set to fobogcp.Resource.PrettifyJun2011 the ResourceServer" should {
    "allow  fobo/prettify.js" in {
      allowResource(fobogcp.Resource.PrettifyJun2011,
                    "fobo" :: "prettify.js" :: Nil) must_== true
    }
    "rewrit rewrit fobo/prettify.js to fobo/google-code/js/prettify.js" in {
      rewriteResource(fobogcp.Resource.PrettifyJun2011,
                      "fobo" :: "prettify.js" :: Nil) must_==
        List("fobo", "google-code", "js", "prettify.js")
    }
  }

  //=== Toolkit.init ==============//
  def allowToolkitInit(resource: fobogcp.Toolkit, path: List[String]) = {
    fobogcp.Toolkit.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: fobogcp.Toolkit, path: List[String]) = {
    fobogcp.Toolkit.init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobogcp.Resource, path: List[String]) = {
    fobogcp.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobogcp.Resource, path: List[String]) = {
    fobogcp.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
