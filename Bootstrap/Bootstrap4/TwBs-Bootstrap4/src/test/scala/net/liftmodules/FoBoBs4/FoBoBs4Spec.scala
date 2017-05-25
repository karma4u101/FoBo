package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoBs4Spec extends Specification {
  "FoBoBs4Spec Specification".title

  sequential

  //Bootstrap400
  "With FoBoBs4.Resource.Init set to FoBoBs4.Resource.Bootstrap400 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoBs4.Resource.Bootstrap400,
                    "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/4.0.0/js/bootstrap-min.js" in {
      rewriteResource(FoBoBs4.Resource.Bootstrap400,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "4.0.0", "js", "bootstrap.min.js")
    }
  }

  "With FoBoBs4.Toolkit.Init set to FoBoBs4.Toolkit.Bootstrap400 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(FoBoBs4.Toolkit.Bootstrap400,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/4.0.0/js/bootstrap-min.js" in {
      rewriteToolkitInit(FoBoBs4.Toolkit.Bootstrap400,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "4.0.0", "js", "bootstrap.min.js")
    }
  }

  //=== Toolkit.Init ==============//
  def allowToolkitInit(resource: FoBoBs4.Toolkit, path: List[String]) = {
    FoBoBs4.Toolkit.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: FoBoBs4.Toolkit, path: List[String]) = {
    FoBoBs4.Toolkit.Init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoBs4.Resource, path: List[String]) = {
    FoBoBs4.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoBs4.Resource, path: List[String]) = {
    FoBoBs4.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
