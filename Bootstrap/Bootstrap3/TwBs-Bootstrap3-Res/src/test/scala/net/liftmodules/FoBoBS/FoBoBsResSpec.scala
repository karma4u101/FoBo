
package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoBsResSpec extends Specification {
  "FoBoBsResSpec Specification".title

  sequential

  //Bootstrap337
  "With FoBoBsRes.Resource.Init set to FoBoBsRes.Resource.Bootstrap337 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoBsRes.Resource.Bootstrap337, "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.7/js/bootstrap-min.js" in {
      rewriteResource(FoBoBsRes.Resource.Bootstrap337, "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.3.7", "js", "bootstrap.min.js")
    }
  }
  
  //Bootstrap336
  "With FoBoBsRes.Resource.Init set to FoBoBsRes.Resource.Bootstrap336 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoBsRes.Resource.Bootstrap336, "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.6/js/bootstrap-min.js" in {
      rewriteResource(FoBoBsRes.Resource.Bootstrap336, "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.3.6", "js", "bootstrap.min.js")
    }
  }

  //Bootstrap335
  "With FoBoBsRes.Resource.Init set to FoBoBsRes.Resource.Bootstrap335 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoBsRes.Resource.Bootstrap335, "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.5/js/bootstrap-min.js" in {
      rewriteResource(FoBoBsRes.Resource.Bootstrap335, "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.3.5", "js", "bootstrap.min.js")
    }
  }

  //Bootstrap320
  "With FoBoBsRes.Resource.Init set to FoBoBsRes.Resource.Bootstrap320 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoBsRes.Resource.Bootstrap320, "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.2.0/js/bootstrap-min.js" in {
      rewriteResource(FoBoBsRes.Resource.Bootstrap320, "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
    }
  }

  //Bootstrap311
  "With FoBoBsRes.Resource.Init set to FoBoBsRes.Resource.Bootstrap311 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoBsRes.Resource.Bootstrap311, "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.1.1/js/bootstrap-min.js" in {
      rewriteResource(FoBoBsRes.Resource.Bootstrap311, "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.1.1", "js", "bootstrap.min.js")
    }
  }

  //Bootstrap301
  "With FoBoBsRes.Resource.Init set to FoBoBsRes.Resource.Bootstrap301 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoBsRes.Resource.Bootstrap301, "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.0.1/js/bootstrap-min.js" in {
      rewriteResource(FoBoBsRes.Resource.Bootstrap301, "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.0.1", "js", "bootstrap.min.js")
    }
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoBsRes.Resource, path: List[String]) = {
    FoBoBsRes.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoBsRes.Resource, path: List[String]) = {
    FoBoBsRes.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}