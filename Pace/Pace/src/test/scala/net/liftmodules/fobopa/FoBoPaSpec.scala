package net.liftmodules

import net.liftweb._
import http._

import org.specs2.mutable.Specification

object FoBoPaSpec extends Specification {
  "FoBoPaSpec Specification".title

  sequential

  //Pace102
  "With fobopa.Toolkit.init set to fobopa.Toolkit.Pace102 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowToolkitInit(fobopa.Toolkit.Pace102, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/pace.js to fobo/pace/1.0.2/js/pace.min.js" in {
      rewriteToolkitInit(fobopa.Toolkit.Pace102, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "1.0.2", "js", "pace.min.js")
    }
    "rewrit fobo/black/pace-theme-minimal.css to fobo/pace/1.0.2/css/themes/black/pace-theme-minimal.css" in {
      rewriteToolkitInit(
        fobopa.Toolkit.Pace102,
        "fobo" :: "black" :: "pace-theme-minimal.css" :: Nil) must_==
        List("fobo",
             "pace",
             "1.0.2",
             "css",
             "themes",
             "black",
             "pace-theme-minimal.css")
    }
  }

  "With fobopa.Resource.init set to fobopa.Resource.Pace102 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowResource(fobopa.Resource.Pace102, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/pace.js to fobo/pace/1.0.2/js/pace.min.js" in {
      rewriteResource(fobopa.Resource.Pace102, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "1.0.2", "js", "pace.min.js")
    }
    "rewrit fobo/black/pace-theme-minimal.css to fobo/pace/1.0.2/css/themes/black/pace-theme-minimal.css" in {
      rewriteResource(
        fobopa.Resource.Pace102,
        "fobo" :: "black" :: "pace-theme-minimal.css" :: Nil) must_==
        List("fobo",
             "pace",
             "1.0.2",
             "css",
             "themes",
             "black",
             "pace-theme-minimal.css")
    }
  }

  //Pace0415
  "With fobopa.Toolkit.init set to fobopa.Toolkit.Pace0415 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowToolkitInit(fobopa.Toolkit.Pace0415, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteToolkitInit(fobopa.Toolkit.Pace0415, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "0.4.15", "js", "pace.min.js")
    }
  }

  "With fobopa.Resource.init set to fobopa.Resource.Pace0415 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowResource(fobopa.Resource.Pace0415, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteResource(fobopa.Resource.Pace0415, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "0.4.15", "js", "pace.min.js")
    }
  }

  //=== Toolkit.init ==============//
  def allowToolkitInit(resource: fobopa.Toolkit, path: List[String]) = {
    fobopa.Toolkit.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: fobopa.Toolkit, path: List[String]) = {
    fobopa.Toolkit.init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobopa.Resource, path: List[String]) = {
    fobopa.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobopa.Resource, path: List[String]) = {
    fobopa.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
