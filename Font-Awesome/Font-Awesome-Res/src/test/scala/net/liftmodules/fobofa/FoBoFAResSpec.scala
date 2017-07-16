package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoFAResSpec extends Specification {
  "FoBoFAResSpec Specification".title

  sequential

  //FontAwesome463
  "With fobofares.Resource.init set to fobofares.Resource.FontAwesome463 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobofares.Resource.FontAwesome463,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.6.3/css/font-awesome.min.css" in {
      rewriteResource(fobofares.Resource.FontAwesome463,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.6.3", "css", "font-awesome.min.css")
    }
  }

  //FontAwesome430
  "With fobofares.Resource.init set to fobofares.Resource.FontAwesome430 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobofares.Resource.FontAwesome430,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.3.0/css/font-awesome.min.css" in {
      rewriteResource(fobofares.Resource.FontAwesome430,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
    }
  }

  //FontAwesome410
  "With fobofares.Resource.init set to fobofares.Resource.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobofares.Resource.FontAwesome410,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.min.css" in {
      rewriteResource(fobofares.Resource.FontAwesome410,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
    }
  }

  //FontAwesome403
  "With fobofares.Resource.init set to fobofares.Resource.FontAwesome403 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobofares.Resource.FontAwesome403,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.0.3/css/font-awesome.min.css" in {
      rewriteResource(fobofares.Resource.FontAwesome403,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.0.3", "css", "font-awesome.min.css")
    }
  }

  //FontAwesome321
  "With fobofares.Resource.init set to fobofares.Resource.FontAwesome321 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobofares.Resource.FontAwesome321,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome-min.css" in {
      rewriteResource(fobofares.Resource.FontAwesome321,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
    }
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobofares.Resource, path: List[String]) = {
    fobofares.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobofares.Resource, path: List[String]) = {
    fobofares.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
