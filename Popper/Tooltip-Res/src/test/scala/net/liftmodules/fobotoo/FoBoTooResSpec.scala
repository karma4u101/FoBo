package net.liftmodules

import net.liftweb._
import http._

import org.specs2.mutable.Specification

object FoBoTooResSpec extends Specification {
  "FoBoTooResSpec Specification".title

  sequential

  //Tooltip114
  "With fobotoores.Resource.init set to fobotoores.Resource.Tooltip114 the ResourceServer" should {
    "allow  fobo/tooltip.js" in {
      allowResource(fobotoores.Resource.Tooltip114,
                    "fobo" :: "tooltip.js" :: Nil) must_== true
    }
    "rewrit fobo/tooltip.js to fobo/tooltip/1.1.4/js/umd/tooltip.min.js" in {
      rewriteResource(fobotoores.Resource.Tooltip114,
                      "fobo" :: "tooltip.js" :: Nil) must_==
        List("fobo", "tooltip", "1.1.4", "js", "umd", "tooltip.min.js")
    }
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobotoores.Resource, path: List[String]) = {
    fobotoores.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobotoores.Resource, path: List[String]) = {
    fobotoores.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
