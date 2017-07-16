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
      allowResource(fobotb.Resource.Bootstrap232,
                    "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.css to fobo/bootstrap/2.3.2/css/bootstrap-min.css" in {
      rewriteResource(fobotb.Resource.Bootstrap232,
                      "fobo" :: "bootstrap.css" :: Nil) must_==
        List("fobo", "bootstrap", "2.3.2", "css", "bootstrap-min.css")
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteResource(fobotb.Resource.Bootstrap232,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }
  }

  "With FoBoTB.Toolkit.Init set to FoBoTB.Toolkit.Bootstrap232 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(fobotb.Toolkit.Bootstrap232,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.css to fobo/bootstrap/2.3.2/css/bootstrap-min.css" in {
      rewriteToolkitInit(fobotb.Toolkit.Bootstrap232,
                         "fobo" :: "bootstrap.css" :: Nil) must_==
        List("fobo", "bootstrap", "2.3.2", "css", "bootstrap-min.css")
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteToolkitInit(fobotb.Toolkit.Bootstrap232,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }
  }

  //=== Toolkit.init ==============//
  def allowToolkitInit(resource: fobotb.Toolkit, path: List[String]) = {
    fobotb.Toolkit.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: fobotb.Toolkit, path: List[String]) = {
    fobotb.Toolkit.init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobotb.Resource, path: List[String]) = {
    fobotb.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobotb.Resource, path: List[String]) = {
    fobotb.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
