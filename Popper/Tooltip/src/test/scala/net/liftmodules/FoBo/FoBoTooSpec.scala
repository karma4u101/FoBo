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
  "With FoBoToo.Toolkit.Init set to FoBoToo.Toolkit.Tooltip114 the ResourceServer" should {
    "allow  fobo/tooltip.js" in {
      allowToolkitInit(FoBoToo.Toolkit.Tooltip114,
                       "fobo" :: "tooltip.js" :: Nil) must_== true
    }
    "rewrit fobo/tooltip.js to fobo/tooltip/1.1.4/js/umd/tooltip.min.js" in {
      rewriteToolkitInit(FoBoToo.Toolkit.Tooltip114,
                         "fobo" :: "tooltip.js" :: Nil) must_==
        List("fobo", "tooltip", "1.1.4", "js", "umd", "tooltip.min.js")
    }
  }

  "With FoBoToo.Resource.Init set to FoBoToo.Resource.Tooltip114 the ResourceServer" should {
    "allow  fobo/tooltip.js" in {
      allowResource(FoBoToo.Resource.Tooltip114, "fobo" :: "tooltip.js" :: Nil) must_== true
    }
    "rewrit fobo/tooltip.js to fobo/tooltip/1.1.4/js/umd/tooltip.min.js" in {
      rewriteResource(FoBoToo.Resource.Tooltip114,
                      "fobo" :: "tooltip.js" :: Nil) must_==
        List("fobo", "tooltip", "1.1.4", "js", "umd", "tooltip.min.js")
    }
  }

  //=== Toolkit.Init ==============//
  def allowToolkitInit(resource: FoBoToo.Toolkit, path: List[String]) = {
    FoBoToo.Toolkit.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: FoBoToo.Toolkit, path: List[String]) = {
    FoBoToo.Toolkit.Init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoToo.Resource, path: List[String]) = {
    FoBoToo.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoToo.Resource, path: List[String]) = {
    FoBoToo.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
