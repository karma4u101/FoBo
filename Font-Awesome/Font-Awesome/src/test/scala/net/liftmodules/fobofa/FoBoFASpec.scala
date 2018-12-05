package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoFASpec extends Specification {
  "FoBoFASpec Specification".title

  sequential

  //FontAwesome550
  "With fobofa.Toolkit.init set to fobofa.Toolkit.FontAwesome470 the ResourceServer" should {
    "allow  fobo/font-awesome/all.css" in {
      allowToolkitInit(
        fobofa.Toolkit.FontAwesome550,
        "fobo" :: "font-awesome" :: "all.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome/all.css to fobo/font-awesome/5.5.0/css/font-awesome.css" in {
      rewriteToolkitInit(fobofa.Toolkit.FontAwesome550,
                         "fobo" :: "font-awesome" :: "all.css" :: Nil) must_==
        List("fobo", "font-awesome", "5.5.0", "css", "all.min.css")
    }
  }

  //FontAwesome470
  "With fobofa.Toolkit.init set to fobofa.Toolkit.FontAwesome470 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(fobofa.Toolkit.FontAwesome470,
                       "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.7.0/css/font-awesome.css" in {
      rewriteToolkitInit(fobofa.Toolkit.FontAwesome470,
                         "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.7.0", "css", "font-awesome.min.css")
    }
  }

  //FontAwesome463
  "With fobofa.Toolkit.init set to fobofa.Toolkit.FontAwesome463 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(fobofa.Toolkit.FontAwesome463,
                       "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.6.3/css/font-awesome.css" in {
      rewriteToolkitInit(fobofa.Toolkit.FontAwesome463,
                         "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.6.3", "css", "font-awesome.min.css")
    }
  }

  "With fobofa.Resource.init set to fobofa.Resource.FontAwesome463 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobofa.Resource.FontAwesome463,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.6.3/css/font-awesome.css" in {
      rewriteResource(fobofa.Resource.FontAwesome463,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.6.3", "css", "font-awesome.min.css")
    }
  }

  //FontAwesome430
  "With fobofa.Toolkit.init set to fobofa.Toolkit.FontAwesome430 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(fobofa.Toolkit.FontAwesome430,
                       "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.3.0/css/font-awesome.css" in {
      rewriteToolkitInit(fobofa.Toolkit.FontAwesome430,
                         "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
    }
  }

  "With fobofa.Resource.init set to fobofa.Resource.FontAwesome430 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobofa.Resource.FontAwesome430,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.3.0/css/font-awesome.css" in {
      rewriteResource(fobofa.Resource.FontAwesome430,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
    }
  }

  //FontAwesome410
  "With fobofa.Toolkit.init set to fobofa.Toolkit.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(fobofa.Toolkit.FontAwesome410,
                       "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.min.css" in {
      rewriteToolkitInit(fobofa.Toolkit.FontAwesome410,
                         "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
    }
  }

  "With fobofa.Resource.init set to fobofa.Resource.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobofa.Resource.FontAwesome410,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.css" in {
      rewriteResource(fobofa.Resource.FontAwesome410,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
    }
  }

  //FontAwesome403
  "With fobofa.Toolkit.init set to fobofa.Toolkit.FontAwesome403 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(fobofa.Toolkit.FontAwesome403,
                       "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.0.3/css/font-awesome.css" in {
      rewriteToolkitInit(fobofa.Toolkit.FontAwesome403,
                         "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.0.3", "css", "font-awesome.min.css")
    }
  }

  "With fobofa.Resource.init set to fobofa.Resource.FontAwesome403 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobofa.Resource.FontAwesome403,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.0.3/css/font-awesome.css" in {
      rewriteResource(fobofa.Resource.FontAwesome403,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.0.3", "css", "font-awesome.min.css")
    }
  }

  //FontAwesome321
  "With fobofa.Toolkit.init set to fobofa.Toolkit.FontAwesome321 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(fobofa.Toolkit.FontAwesome321,
                       "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome-min.css" in {
      rewriteToolkitInit(fobofa.Toolkit.FontAwesome321,
                         "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
    }
  }

  "With fobofa.Resource.init set to fobofa.Resource.FontAwesome321 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobofa.Resource.FontAwesome321,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome-min.css" in {
      rewriteResource(fobofa.Resource.FontAwesome321,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
    }
  }

  //=== Toolkit.init ==============//
  def allowToolkitInit(resource: fobofa.Toolkit, path: List[String]) = {
    fobofa.Toolkit.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: fobofa.Toolkit, path: List[String]) = {
    fobofa.Toolkit.init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobofa.Resource, path: List[String]) = {
    fobofa.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobofa.Resource, path: List[String]) = {
    fobofa.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
