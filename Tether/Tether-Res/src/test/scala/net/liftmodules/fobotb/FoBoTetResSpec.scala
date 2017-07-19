package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoTetResSpec extends Specification {
  "FoBoTetResSpec Specification".title

  sequential

  //Tether140
  "With FoBoTetRes.Resource.Init set to FoBoTetRes.Resource.Tether140 the ResourceServer" should {
    "allow  fobo/tether.js" in {
      allowResource(FoBoTetRes.Resource.Tether140,
                    "fobo" :: "tether.js" :: Nil) must_== true
    }
    "rewrit fobo/tether.js to fobo/tether/1.4.0/js/tether.min.js" in {
      rewriteResource(FoBoTetRes.Resource.Tether140,
                      "fobo" :: "tether.js" :: Nil) must_==
        List("fobo", "tether", "1.4.0", "js", "tether.min.js")
    }
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoTetRes.Resource, path: List[String]) = {
    FoBoTetRes.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoTetRes.Resource, path: List[String]) = {
    FoBoTetRes.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
