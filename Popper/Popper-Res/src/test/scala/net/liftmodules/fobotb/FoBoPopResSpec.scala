package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoPopResSpec extends Specification {
  "FoBoPopResSpec Specification".title

  sequential

  //Popper1123
  "With FoBoPopRes.Resource.init set to FoBoPopRes.Resource.Popper1123 the ResourceServer" should {
    "allow  fobo/popper.js" in {
      allowResource(fobopopres.Resource.Popper1123,
                    "fobo" :: "popper.js" :: Nil) must_== true
    }
    "rewrit fobo/popper.js to fobo/popper/1.12.3/js/umd/popper.min.js" in {
      rewriteResource(fobopopres.Resource.Popper1123,
                      "fobo" :: "popper.js" :: Nil) must_==
        List("fobo", "popper", "1.12.3", "js", "umd", "popper.min.js")
    }

    "allow  fobo/popper-utils.js" in {
      allowResource(fobopopres.Resource.Popper1123,
                    "fobo" :: "popper-utils.js" :: Nil) must_== true
    }
    "rewrit fobo/popper-utils.js to fobo/popper/1.12.3/js/umd/popper-utils.min.js" in {
      rewriteResource(fobopopres.Resource.Popper1123,
                      "fobo" :: "popper-utils.js" :: Nil) must_==
        List("fobo", "popper", "1.12.3", "js", "umd", "popper-utils.min.js")
    }
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobopopres.Resource, path: List[String]) = {
    fobopopres.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobopopres.Resource, path: List[String]) = {
    fobopopres.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
