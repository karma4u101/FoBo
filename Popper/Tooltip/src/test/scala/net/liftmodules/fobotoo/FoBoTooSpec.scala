package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoTooSpec extends Specification {
  "FoBoTooSpec Specification".title

  sequential

  //Tooltip114
  "With fobotoo.Toolkit.init set to fobotoo.Toolkit.Tooltip114 the ResourceServer" should {
    "allow  fobo/tooltip.js" in {
      allowToolkitInit(fobotoo.Toolkit.Tooltip114,
                       "fobo" :: "tooltip.js" :: Nil) must_== true
    }
    "rewrit fobo/tooltip.js to fobo/tooltip/1.1.4/js/umd/tooltip.min.js" in {
      rewriteToolkitInit(fobotoo.Toolkit.Tooltip114,
                         "fobo" :: "tooltip.js" :: Nil) must_==
        List("fobo", "tooltip", "1.1.4", "js", "umd", "tooltip.min.js")
    }
  }

  "With fobotoo.Resource.init set to fobotoo.Resource.Tooltip114 the ResourceServer" should {
    "allow  fobo/tooltip.js" in {
      allowResource(fobotoo.Resource.Tooltip114, "fobo" :: "tooltip.js" :: Nil) must_== true
    }
    "rewrit fobo/tooltip.js to fobo/tooltip/1.1.4/js/umd/tooltip.min.js" in {
      rewriteResource(fobotoo.Resource.Tooltip114,
                      "fobo" :: "tooltip.js" :: Nil) must_==
        List("fobo", "tooltip", "1.1.4", "js", "umd", "tooltip.min.js")
    }
  }

  //=== Toolkit.init ==============//
  def allowToolkitInit(resource: fobotoo.Toolkit, path: List[String]) = {
    fobotoo.Toolkit.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: fobotoo.Toolkit, path: List[String]) = {
    fobotoo.Toolkit.init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobotoo.Resource, path: List[String]) = {
    fobotoo.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobotoo.Resource, path: List[String]) = {
    fobotoo.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
