package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoTooResSpec extends Specification {
  "FoBoTooResSpec Specification".title

  sequential

  //Tooltip114
  "With FoBoTooRes.Resource.Init set to FoBoTooRes.Resource.Tooltip114 the ResourceServer" should {
    "allow  fobo/tooltip.js" in {
      allowResource(FoBoTooRes.Resource.Tooltip114,
                    "fobo" :: "tooltip.js" :: Nil) must_== true
    }
    "rewrit fobo/tooltip.js to fobo/tooltip/1.1.4/js/umd/tooltip.min.js" in {
      rewriteResource(FoBoTooRes.Resource.Tooltip114,
                      "fobo" :: "tooltip.js" :: Nil) must_==
        List("fobo", "tooltip", "1.1.4", "js", "umd", "tooltip.min.js")
    }
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoTooRes.Resource, path: List[String]) = {
    FoBoTooRes.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoTooRes.Resource, path: List[String]) = {
    FoBoTooRes.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
