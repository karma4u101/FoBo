package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoPopResSpec extends Specification {
  "FoBoPopResSpec Specification".title

  sequential

  //Popper199
  "With FoBoPopRes.Resource.Init set to FoBoPopRes.Resource.Popper199 the ResourceServer" should {
    "allow  fobo/popper.js" in {
      allowResource(FoBoPopRes.Resource.Popper199,
                    "fobo" :: "popper.js" :: Nil) must_== true
    }
    "rewrit fobo/popper.js to fobo/popper/1.9.9/js/umd/popper.min.js" in {
      rewriteResource(FoBoPopRes.Resource.Popper199,
                      "fobo" :: "popper.js" :: Nil) must_==
        List("fobo", "popper", "1.9.9", "js", "umd", "popper.min.js")
    }

    "allow  fobo/popper-utils.js" in {
      allowResource(FoBoPopRes.Resource.Popper199,
                    "fobo" :: "popper-utils.js" :: Nil) must_== true
    }
    "rewrit fobo/popper-utils.js to fobo/popper/1.9.9/js/umd/popper-utils.min.js" in {
      rewriteResource(FoBoPopRes.Resource.Popper199,
                      "fobo" :: "popper-utils.js" :: Nil) must_==
        List("fobo", "popper", "1.9.9", "js", "umd", "popper-utils.min.js")
    }
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoPopRes.Resource, path: List[String]) = {
    FoBoPopRes.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoPopRes.Resource, path: List[String]) = {
    FoBoPopRes.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
