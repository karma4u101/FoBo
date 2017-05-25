package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoBs4ResSpec extends Specification {
  "FoBoBsResSpec Specification".title

  sequential

  //Bootstrap400
  "With FoBoBsRes.Resource.Init set to FoBoBsRes.Resource.Bootstrap400 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoBs4Res.Resource.Bootstrap400,
                    "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/4.0.0/js/bootstrap-min.js" in {
      rewriteResource(FoBoBs4Res.Resource.Bootstrap400,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "4.0.0", "js", "bootstrap.min.js")
    }
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoBs4Res.Resource, path: List[String]) = {
    FoBoBs4Res.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoBs4Res.Resource, path: List[String]) = {
    FoBoBs4Res.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
