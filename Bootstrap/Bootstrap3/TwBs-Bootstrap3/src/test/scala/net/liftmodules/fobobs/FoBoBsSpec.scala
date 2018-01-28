package net.liftmodules

import net.liftweb._
import http._

import org.specs2.mutable.Specification

object FoBoBsSpec extends Specification {
  "FoBoBsSpec Specification".title

  sequential

  //Bootstrap337
  "With fobobs.Resource.init set to fobobs.Resource.Bootstrap337 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobobs.Resource.Bootstrap337,
                    "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.7/js/bootstrap-min.js" in {
      rewriteResource(fobobs.Resource.Bootstrap337,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.3.7", "js", "bootstrap.min.js")
    }
  }

  "With fobobs.Toolkit.init set to fobobs.Toolkit.Bootstrap337 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(fobobs.Toolkit.Bootstrap337,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.7/js/bootstrap-min.js" in {
      rewriteToolkitInit(fobobs.Toolkit.Bootstrap337,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.3.7", "js", "bootstrap.min.js")
    }
  }

  //Bootstrap320
  "With fobobs.Resource.init set to fobobs.Resource.Bootstrap320 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobobs.Resource.Bootstrap320,
                    "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.2.0/js/bootstrap-min.js" in {
      rewriteResource(fobobs.Resource.Bootstrap320,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
    }
  }

  "With fobobs.Toolkit.init set to fobobs.Toolkit.Bootstrap320 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(fobobs.Toolkit.Bootstrap320,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.2.0/js/bootstrap-min.js" in {
      rewriteToolkitInit(fobobs.Toolkit.Bootstrap320,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
    }
  }

  //Bootstrap311
  "With fobobs.Resource.init set to fobobs.Resource.Bootstrap311 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobobs.Resource.Bootstrap311,
                    "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.1.1/js/bootstrap-min.js" in {
      rewriteResource(fobobs.Resource.Bootstrap311,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.1.1", "js", "bootstrap.min.js")
    }
  }

  "With fobobs.Toolkit.init set to fobobs.Toolkit.Bootstrap311 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(fobobs.Toolkit.Bootstrap311,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.1.1/js/bootstrap-min.js" in {
      rewriteToolkitInit(fobobs.Toolkit.Bootstrap311,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.1.1", "js", "bootstrap.min.js")
    }
  }

  //Bootstrap301
  "With fobobs.Resource.init set to fobobs.Resource.Bootstrap301 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobobs.Resource.Bootstrap301,
                    "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.0.1/js/bootstrap-min.js" in {
      rewriteResource(fobobs.Resource.Bootstrap301,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.0.1", "js", "bootstrap.min.js")
    }
  }

  "With fobobs.Toolkit.init set to fobobs.Toolkit.Bootstrap301 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(fobobs.Toolkit.Bootstrap301,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.0.1/js/bootstrap-min.js" in {
      rewriteToolkitInit(fobobs.Toolkit.Bootstrap301,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.0.1", "js", "bootstrap.min.js")
    }
  }

  //=== Toolkit.init ==============//
  def allowToolkitInit(resource: fobobs.Toolkit, path: List[String]) = {
    fobobs.Toolkit.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: fobobs.Toolkit, path: List[String]) = {
    fobobs.Toolkit.init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobobs.Resource, path: List[String]) = {
    fobobs.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobobs.Resource, path: List[String]) = {
    fobobs.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
