package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoPopSpec extends Specification {
  "FoBoPopSpec Specification".title

  sequential

  //Popper199
  "With FoBoPop.Toolkit.Init set to FoBoPop.Toolkit.Popper199 the ResourceServer" should {
    "allow  fobo/popper.js" in {
      allowToolkitInit(FoBoPop.Toolkit.Popper199, "fobo" :: "popper.js" :: Nil) must_== true
    }
    "rewrit fobo/popper.js to fobo/popper/1.9.9/js/umd/popper.min.js" in {
      rewriteToolkitInit(FoBoPop.Toolkit.Popper199,
                         "fobo" :: "popper.js" :: Nil) must_==
        List("fobo", "popper", "1.9.9", "js", "umd", "popper.min.js")
    }

    "allow  fobo/popper-utils.js" in {
      allowToolkitInit(FoBoPop.Toolkit.Popper199,
                       "fobo" :: "popper-utils.js" :: Nil) must_== true
    }
    "rewrit fobo/popper-utils.js to fobo/popper/1.9.9/js/umd/popper-utils.min.js" in {
      rewriteToolkitInit(FoBoPop.Toolkit.Popper199,
                         "fobo" :: "popper-utils.js" :: Nil) must_==
        List("fobo", "popper", "1.9.9", "js", "umd", "popper-utils.min.js")
    }
  }

  "With FoBoPop.Resource.Init set to FoBoPop.Resource.Popper199 the ResourceServer" should {
    "allow  fobo/popper.js" in {
      allowResource(FoBoPop.Resource.Popper199, "fobo" :: "popper.js" :: Nil) must_== true
    }
    "rewrit fobo/popper.js to fobo/popper/1.9.9/js/umd/popper.min.js" in {
      rewriteResource(FoBoPop.Resource.Popper199, "fobo" :: "popper.js" :: Nil) must_==
        List("fobo", "popper", "1.9.9", "js", "umd", "popper.min.js")
    }

    "allow  fobo/popper-utils.js" in {
      allowResource(FoBoPop.Resource.Popper199,
                    "fobo" :: "popper-utils.js" :: Nil) must_== true
    }
    "rewrit fobo/popper-utils.js to fobo/popper/1.9.9/js/umd/popper-utils.min.js" in {
      rewriteResource(FoBoPop.Resource.Popper199,
                      "fobo" :: "popper-utils.js" :: Nil) must_==
        List("fobo", "popper", "1.9.9", "js", "umd", "popper-utils.min.js")
    }
  }

  //=== Toolkit.Init ==============//
  def allowToolkitInit(resource: FoBoPop.Toolkit, path: List[String]) = {
    FoBoPop.Toolkit.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: FoBoPop.Toolkit, path: List[String]) = {
    FoBoPop.Toolkit.Init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoPop.Resource, path: List[String]) = {
    FoBoPop.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoPop.Resource, path: List[String]) = {
    FoBoPop.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
