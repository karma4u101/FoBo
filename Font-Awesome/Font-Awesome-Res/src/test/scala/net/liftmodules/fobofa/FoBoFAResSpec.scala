package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoFAResSpec extends Specification {
  "FoBoFAResSpec Specification".title

  sequential

  //FontAwesome550
  "With fobofares.Resource.init set to fobofares.Resource.FontAwesome550 the ResourceServer" should {
    "allow  fobo/font-awesome/all.css" in {
      allowResource(fobofares.Resource.FontAwesome550,
                    "fobo" :: "font-awesome" :: "all.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome/all.css to fobo/font-awesome/5.5.0/css/all.min.css" in {
      rewriteResource(fobofares.Resource.FontAwesome550,
                      "fobo" :: "font-awesome" :: "all.css" :: Nil) must_==
        List("fobo", "font-awesome", "5.5.0", "css", "all.min.css")
    }

    "allow  fobo/font-awesome/fontawesome.css" in {
      allowResource(
        fobofares.Resource.FontAwesome550,
        "fobo" :: "font-awesome" :: "fontawesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome/fontawesome.css to fobo/font-awesome/5.5.0/css/fontawesome.min.css" in {
      rewriteResource(
        fobofares.Resource.FontAwesome550,
        "fobo" :: "font-awesome" :: "fontawesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "5.5.0", "css", "fontawesome.min.css")
    }

    "allow  fobo/font-awesome/brands.css" in {
      allowResource(
        fobofares.Resource.FontAwesome550,
        "fobo" :: "font-awesome" :: "brands.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome/brand.css to fobo/font-awesome/5.5.0/css/brands.min.css" in {
      rewriteResource(fobofares.Resource.FontAwesome550,
                      "fobo" :: "font-awesome" :: "brands.css" :: Nil) must_==
        List("fobo", "font-awesome", "5.5.0", "css", "brands.min.css")
    }

    "allow  fobo/font-awesome/regular.css" in {
      allowResource(
        fobofares.Resource.FontAwesome550,
        "fobo" :: "font-awesome" :: "regular.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome/regular.css to fobo/font-awesome/5.5.0/css/regular.min.css" in {
      rewriteResource(fobofares.Resource.FontAwesome550,
                      "fobo" :: "font-awesome" :: "regular.css" :: Nil) must_==
        List("fobo", "font-awesome", "5.5.0", "css", "regular.min.css")
    }

    "allow  fobo/font-awesome/solid.css" in {
      allowResource(fobofares.Resource.FontAwesome550,
                    "fobo" :: "font-awesome" :: "solid.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome/solid.css to fobo/font-awesome/5.5.0/css/solid.min.css" in {
      rewriteResource(fobofares.Resource.FontAwesome550,
                      "fobo" :: "font-awesome" :: "solid.css" :: Nil) must_==
        List("fobo", "font-awesome", "5.5.0", "css", "solid.min.css")
    }

    "allow  fobo/font-awesome/svg-with-js.css" in {
      allowResource(
        fobofares.Resource.FontAwesome550,
        "fobo" :: "font-awesome" :: "svg-with-js.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome/svg-with-js.css to fobo/font-awesome/5.5.0/css/svg-with-js.min.css" in {
      rewriteResource(
        fobofares.Resource.FontAwesome550,
        "fobo" :: "font-awesome" :: "svg-with-js.css" :: Nil) must_==
        List("fobo", "font-awesome", "5.5.0", "css", "svg-with-js.min.css")
    }

    "allow  fobo/font-awesome/v4-shims.css" in {
      allowResource(
        fobofares.Resource.FontAwesome550,
        "fobo" :: "font-awesome" :: "v4-shims.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome/v4-shims.css to fobo/font-awesome/5.5.0/css/v4-shims.min.css" in {
      rewriteResource(fobofares.Resource.FontAwesome550,
                      "fobo" :: "font-awesome" :: "v4-shims.css" :: Nil) must_==
        List("fobo", "font-awesome", "5.5.0", "css", "v4-shims.min.css")
    }

    "allow  fobo/font-awesome/all.js" in {
      allowResource(fobofares.Resource.FontAwesome550,
                    "fobo" :: "font-awesome" :: "all.js" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome/all.js to fobo/font-awesome/5.5.0/js/all.min.js" in {
      rewriteResource(fobofares.Resource.FontAwesome550,
                      "fobo" :: "font-awesome" :: "all.js" :: Nil) must_==
        List("fobo", "font-awesome", "5.5.0", "js", "all.min.js")
    }

    "allow  fobo/font-awesome/brand.js" in {
      allowResource(fobofares.Resource.FontAwesome550,
                    "fobo" :: "font-awesome" :: "brand.js" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome/brand.js to fobo/font-awesome/5.5.0/js/brand.min.js" in {
      rewriteResource(fobofares.Resource.FontAwesome550,
                      "fobo" :: "font-awesome" :: "brand.js" :: Nil) must_==
        List("fobo", "font-awesome", "5.5.0", "js", "brand.min.js")
    }

    "allow  fobo/font-awesome/fontawesome.js" in {
      allowResource(
        fobofares.Resource.FontAwesome550,
        "fobo" :: "font-awesome" :: "fontawesome.js" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome/fontawesome.js to fobo/font-awesome/5.5.0/js/fontawesome.min.js" in {
      rewriteResource(
        fobofares.Resource.FontAwesome550,
        "fobo" :: "font-awesome" :: "fontawesome.js" :: Nil) must_==
        List("fobo", "font-awesome", "5.5.0", "js", "fontawesome.min.js")
    }

    "allow  fobo/font-awesome/regular.js" in {
      allowResource(
        fobofares.Resource.FontAwesome550,
        "fobo" :: "font-awesome" :: "regular.js" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome/regular.js to fobo/font-awesome/5.5.0/js/regular.min.js" in {
      rewriteResource(fobofares.Resource.FontAwesome550,
                      "fobo" :: "font-awesome" :: "regular.js" :: Nil) must_==
        List("fobo", "font-awesome", "5.5.0", "js", "regular.min.js")
    }

    "allow  fobo/font-awesome/solid.js" in {
      allowResource(fobofares.Resource.FontAwesome550,
                    "fobo" :: "font-awesome" :: "solid.js" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome/solid.js to fobo/font-awesome/5.5.0/js/solid.min.js" in {
      rewriteResource(fobofares.Resource.FontAwesome550,
                      "fobo" :: "font-awesome" :: "solid.js" :: Nil) must_==
        List("fobo", "font-awesome", "5.5.0", "js", "solid.min.js")
    }

    "allow  fobo/font-awesome/v4-shims.js" in {
      allowResource(
        fobofares.Resource.FontAwesome550,
        "fobo" :: "font-awesome" :: "v4-shims.js" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome/v4-shims.js to fobo/font-awesome/5.5.0/js/v4-shims.min.js" in {
      rewriteResource(fobofares.Resource.FontAwesome550,
                      "fobo" :: "font-awesome" :: "v4-shims.js" :: Nil) must_==
        List("fobo", "font-awesome", "5.5.0", "js", "v4-shims.min.js")
    }
  }

  //FontAwesome470
  "With fobofares.Resource.init set to fobofares.Resource.FontAwesome470 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobofares.Resource.FontAwesome470,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.7.0/css/font-awesome.min.css" in {
      rewriteResource(fobofares.Resource.FontAwesome470,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.7.0", "css", "font-awesome.min.css")
    }
  }

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
