package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoPopSpec extends Specification {
  "FoBoPopSpec Specification".title

  sequential

  //Popper1129
  "With fobopop.Toolkit.init set to fobopop.Toolkit.Popper1129 the ResourceServer" should {
    "allow  fobo/popper.js" in {
      allowToolkitInit(fobopop.Toolkit.Popper1129, "fobo" :: "popper.js" :: Nil) must_== true
    }
    "rewrite fobo/popper.js to fobo/popper/1.12.9/js/umd/popper.min.js" in {
      rewriteToolkitInit(fobopop.Toolkit.Popper1129,
                         "fobo" :: "popper.js" :: Nil) must_==
        List("fobo", "popper", "1.12.9", "js", "umd", "popper.min.js")
    }

    "allow  fobo/popper-utils.js" in {
      allowToolkitInit(fobopop.Toolkit.Popper1129,
                       "fobo" :: "popper-utils.js" :: Nil) must_== true
    }
    "rewrite fobo/popper-utils.js to fobo/popper/1.12.9/js/umd/popper-utils.min.js" in {
      rewriteToolkitInit(fobopop.Toolkit.Popper1129,
                         "fobo" :: "popper-utils.js" :: Nil) must_==
        List("fobo", "popper", "1.12.9", "js", "umd", "popper-utils.min.js")
    }
  }

  "With fobopop.Resource.init set to fobopop.Resource.Popper1129 the ResourceServer" should {
    "allow  fobo/popper.js" in {
      allowResource(fobopop.Resource.Popper1129, "fobo" :: "popper.js" :: Nil) must_== true
    }
    "rewrite fobo/popper.js to fobo/popper/1.12.9/js/umd/popper.min.js" in {
      rewriteResource(fobopop.Resource.Popper1129, "fobo" :: "popper.js" :: Nil) must_==
        List("fobo", "popper", "1.12.9", "js", "umd", "popper.min.js")
    }

    "allow  fobo/popper-utils.js" in {
      allowResource(fobopop.Resource.Popper1129,
                    "fobo" :: "popper-utils.js" :: Nil) must_== true
    }
    "rewrite fobo/popper-utils.js to fobo/popper/1.12.9/js/umd/popper-utils.min.js" in {
      rewriteResource(fobopop.Resource.Popper1129,
                      "fobo" :: "popper-utils.js" :: Nil) must_==
        List("fobo", "popper", "1.12.9", "js", "umd", "popper-utils.min.js")
    }
  }

  //=== Toolkit.init ==============//
  def allowToolkitInit(resource: fobopop.Toolkit, path: List[String]) = {
    fobopop.Toolkit.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: fobopop.Toolkit, path: List[String]) = {
    fobopop.Toolkit.init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobopop.Resource, path: List[String]) = {
    fobopop.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobopop.Resource, path: List[String]) = {
    fobopop.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
