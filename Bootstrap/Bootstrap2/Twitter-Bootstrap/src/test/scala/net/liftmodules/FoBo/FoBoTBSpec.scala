package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoTBSpec extends Specification {
  "FoBoTBSpec Specification".title

  sequential

  //Bootstrap232
  "With FoBoTB.Resource.Init set to FoBoTB.Resource.Bootstrap232 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoTB.Resource.Bootstrap232,
                    "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.css to fobo/bootstrap/2.3.2/css/bootstrap-min.css" in {
      rewriteResource(FoBoTB.Resource.Bootstrap232,
                      "fobo" :: "bootstrap.css" :: Nil) must_==
        List("fobo", "bootstrap", "2.3.2", "css", "bootstrap-min.css")
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteResource(FoBoTB.Resource.Bootstrap232,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }
  }

  "With FoBoTB.Toolkit.Init set to FoBoTB.Toolkit.Bootstrap232 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(FoBoTB.Toolkit.Bootstrap232,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.css to fobo/bootstrap/2.3.2/css/bootstrap-min.css" in {
      rewriteToolkitInit(FoBoTB.Toolkit.Bootstrap232,
                         "fobo" :: "bootstrap.css" :: Nil) must_==
        List("fobo", "bootstrap", "2.3.2", "css", "bootstrap-min.css")
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteToolkitInit(FoBoTB.Toolkit.Bootstrap232,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }
  }

  //=== Toolkit.Init ==============//
  def allowToolkitInit(resource: FoBoTB.Toolkit, path: List[String]) = {
    FoBoTB.Toolkit.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: FoBoTB.Toolkit, path: List[String]) = {
    FoBoTB.Toolkit.Init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoTB.Resource, path: List[String]) = {
    FoBoTB.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoTB.Resource, path: List[String]) = {
    FoBoTB.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
