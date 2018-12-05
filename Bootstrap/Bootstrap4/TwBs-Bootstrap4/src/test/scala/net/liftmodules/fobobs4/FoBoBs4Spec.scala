package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoBs4Spec extends Specification {
  "FoBoBs4Spec Specification".title

  sequential

  //Bootstrap413
  "With fobobs4.Resource.init set to fobobs4.Resource.Bootstrap413 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobobs4.Resource.Bootstrap413,
                    "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/4.1.3/js/bootstrap-min.js" in {
      rewriteResource(fobobs4.Resource.Bootstrap413,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "4.1.3", "js", "bootstrap.min.js")
    }
  }

  "With fobobs4.Toolkit.init set to fobobs4.Toolkit.Bootstrap413 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(fobobs4.Toolkit.Bootstrap413,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/4.1.3/js/bootstrap-min.js" in {
      rewriteToolkitInit(fobobs4.Toolkit.Bootstrap413,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "4.1.3", "js", "bootstrap.min.js")
    }
  }

  //Bootstrap400
  "With fobobs4.Resource.init set to fobobs4.Resource.Bootstrap400 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobobs4.Resource.Bootstrap400,
                    "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/4.0.0/js/bootstrap-min.js" in {
      rewriteResource(fobobs4.Resource.Bootstrap400,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "4.0.0", "js", "bootstrap.min.js")
    }
  }

  "With fobobs4.Toolkit.init set to fobobs4.Toolkit.Bootstrap400 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(fobobs4.Toolkit.Bootstrap400,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/4.0.0/js/bootstrap-min.js" in {
      rewriteToolkitInit(fobobs4.Toolkit.Bootstrap400,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "4.0.0", "js", "bootstrap.min.js")
    }
  }

  //=== Toolkit.init ==============//
  def allowToolkitInit(resource: fobobs4.Toolkit, path: List[String]) = {
    fobobs4.Toolkit.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: fobobs4.Toolkit, path: List[String]) = {
    fobobs4.Toolkit.init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobobs4.Resource, path: List[String]) = {
    fobobs4.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobobs4.Resource, path: List[String]) = {
    fobobs4.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
