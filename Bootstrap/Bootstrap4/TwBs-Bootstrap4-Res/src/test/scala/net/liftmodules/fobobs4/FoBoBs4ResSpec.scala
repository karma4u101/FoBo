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
  "With FoBoBsRes.Resource.init set to FoBoBsRes.Resource.Bootstrap400 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobobs4res.Resource.Bootstrap400,
                    "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/4.0.0/js/bootstrap-min.js" in {
      rewriteResource(fobobs4res.Resource.Bootstrap400,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "4.0.0", "js", "bootstrap.min.js")
    }
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobobs4res.Resource, path: List[String]) = {
    fobobs4res.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobobs4res.Resource, path: List[String]) = {
    fobobs4res.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
