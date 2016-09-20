package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoPaResSpec extends Specification {
  "FoBoPaResSpec Specification".title

  sequential
  //Pace102
  "With FoBoPaRes.Resource.Init set to FoBoPaRes.Resource.Pace102 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowResource(FoBoPaRes.Resource.Pace102, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/pace.js to fobo/pace/1.0.2/js/pace.min.js" in {
      rewriteResource(FoBoPaRes.Resource.Pace102, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "1.0.2", "js", "pace.min.js")
    }
    "rewrit fobo/black/pace-theme-minimal.css to fobo/pace/1.0.2/css/themes/black/pace-theme-minimal.css" in {
      rewriteResource(
        FoBoPaRes.Resource.Pace102,
        "fobo" :: "black" :: "pace-theme-minimal.css" :: Nil) must_==
        List("fobo",
             "pace",
             "1.0.2",
             "css",
             "themes",
             "black",
             "pace-theme-minimal.css")
    }
  }

  //Pace0415
  "With FoBoPaRes.Resource.Init set to FoBoPaRes.Resource.Pace0415 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowResource(FoBoPaRes.Resource.Pace0415, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/pace.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteResource(FoBoPaRes.Resource.Pace0415, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "0.4.15", "js", "pace.min.js")
    }
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoPaRes.Resource, path: List[String]) = {
    FoBoPaRes.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoPaRes.Resource, path: List[String]) = {
    FoBoPaRes.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
