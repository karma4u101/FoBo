package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoTBResSpec extends Specification {
  "FoBoTBResSpec Specification".title

  sequential

  //Bootstrap232
  "With FoBoTBRes.Resource.Init set to FoBoTBRes.Resource.Bootstrap232 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoTBRes.Resource.Bootstrap232,
                    "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.css to fobo/bootstrap/2.3.2/css/bootstrap-min.css" in {
      rewriteResource(FoBoTBRes.Resource.Bootstrap232,
                      "fobo" :: "bootstrap.css" :: Nil) must_==
        List("fobo", "bootstrap", "2.3.2", "css", "bootstrap-min.css")
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteResource(FoBoTBRes.Resource.Bootstrap232,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }
  }

  //=== Resource.Init ===============//

  def allowResource(resource: FoBoTBRes.Resource, path: List[String]) = {
    FoBoTBRes.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoTBRes.Resource, path: List[String]) = {
    FoBoTBRes.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
