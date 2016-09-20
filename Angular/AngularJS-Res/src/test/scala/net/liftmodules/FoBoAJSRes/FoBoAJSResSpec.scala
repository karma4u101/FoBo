package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.{Specification}
//import org.specs2.mutable.BeforeAfter

object FoBoAJSResSpec extends Specification {
  "FoBoAJSResSpec Specification".title

  sequential

  //OBS! using 'test-only' instead of 'test' will fail some test as 'test-only'
  //is treated as code is run in "devMode" while 'test' dose not assume this.
  //var list148JS = List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")

  //AngularJS153
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS153 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS153,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.5.3/js/angular.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS153,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.5.3", "js", "angular.min.js")
    }
  }

  //AngularJS148
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS148 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS148,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS148,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }
  }

  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS141 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS141,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS141,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
    }
  }

  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS1315 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS1315,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS1315,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")
    }
  }

  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS1219 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS1219,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS1219,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")
    }
  }

  //Angular Material
//   //AJMaterial110
//  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJMaterial110 the ResourceServer" should {
//    "allow  fobo/angular-material.js" in {
//      allowResource(FoBoAJSRes.Resource.AJMaterial110,"fobo"::"angular-material.js"::Nil) must_== true
//    }
//    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.0/js/angular-material.min.js" in {
//      rewriteResource(FoBoAJSRes.Resource.AJMaterial110,"fobo"::"angular-material.js"::Nil) must_==
//        List("fobo", "angular-material", "1.1.0", "js", "angular-material.min.js")
//    }
//    "rewrit fobo/angular-material.css to fobo/angular-material/1.1.0/js/angular-material.min.css" in {
//      rewriteResource(FoBoAJSRes.Resource.AJMaterial110,"fobo"::"angular-material.css"::Nil) must_==
//        List("fobo", "angular-material", "1.1.0", "css", "angular-material.min.css")
//    }
//  }
  //AJMaterial108
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJMaterial108 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowResource(FoBoAJSRes.Resource.AJMaterial108,
                    "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.8/js/angular-material.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJMaterial108,
                      "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.0.8",
             "js",
             "angular-material.min.js")
    }
    "rewrit fobo/angular-material.css to fobo/angular-material/1.0.8/js/angular-material.min.css" in {
      rewriteResource(FoBoAJSRes.Resource.AJMaterial108,
                      "fobo" :: "angular-material.css" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.0.8",
             "css",
             "angular-material.min.css")
    }
  }
  //AJMaterial101
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJMaterial101 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowResource(FoBoAJSRes.Resource.AJMaterial101,
                    "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.1/js/angular-material.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJMaterial101,
                      "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.0.1",
             "js",
             "angular-material.min.js")
    }
    "rewrit fobo/angular-material.css to fobo/angular-material/1.0.1/js/angular-material.min.css" in {
      rewriteResource(FoBoAJSRes.Resource.AJMaterial101,
                      "fobo" :: "angular-material.css" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.0.1",
             "css",
             "angular-material.min.css")
    }
  }

  //AJMaterial0100
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJMaterial0100 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowResource(FoBoAJSRes.Resource.AJMaterial0100,
                    "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/0.10.0/js/angular-material.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJMaterial0100,
                      "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "0.10.0",
             "js",
             "angular-material.min.js")
    }
    "rewrit fobo/angular-material.css to fobo/angular-material/0.10.0/js/angular-material.css" in {
      rewriteResource(FoBoAJSRes.Resource.AJMaterial0100,
                      "fobo" :: "angular-material.css" :: Nil) must_==
        List("fobo",
             "angular-material",
             "0.10.0",
             "css",
             "angular-material.css")
    }
  }

  //AJSUIBootstrap020
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJSUIBootstrap020 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(FoBoAJSRes.Resource.AJSUIBootstrap020,
                    "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIBootstrap020,
                      "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.2.0",
             "js",
             "ui-bootstrap-0.2.0.min.js")
    }
    "rewrit fobo/ui-bootstrap-tpls.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-tpls-0.2.0.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIBootstrap020,
                      "fobo" :: "ui-bootstrap-tpls.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.2.0",
             "js",
             "ui-bootstrap-tpls-0.2.0.min.js")
    }
  }

  //AJSUIBootstrap070
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJSUIBootstrap070 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(FoBoAJSRes.Resource.AJSUIBootstrap070,
                    "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIBootstrap070,
                      "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.7.0",
             "js",
             "ui-bootstrap-0.7.0.min.js")
    }
    "rewrit fobo/ui-bootstrap-tpls.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-tpls-0.7.0.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIBootstrap070,
                      "fobo" :: "ui-bootstrap-tpls.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.7.0",
             "js",
             "ui-bootstrap-tpls-0.7.0.min.js")
    }
  }

  //AJSUIBootstrap0100
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJSUIBootstrap0100 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(FoBoAJSRes.Resource.AJSUIBootstrap0100,
                    "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIBootstrap0100,
                      "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.10.0",
             "js",
             "ui-bootstrap-0.10.0.min.js")
    }
    "rewrit fobo/ui-bootstrap-tpls.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-tpls-0.10.0.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIBootstrap0100,
                      "fobo" :: "ui-bootstrap-tpls.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.10.0",
             "js",
             "ui-bootstrap-tpls-0.10.0.min.js")
    }
  }

  //AJSNGGrid207
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJSNGGrid207 the ResourceServer" should {
    "allow  fobo/ng-grid.js" in {
      allowResource(FoBoAJSRes.Resource.AJSNGGrid207,
                    "fobo" :: "ng-grid.js" :: Nil) must_== true
    }
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/js/ng-grid-2.0.7.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSNGGrid207,
                      "fobo" :: "ng-grid.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "ng-grid",
             "2.0.7",
             "js",
             "ng-grid-2.0.7.min.js")
    }
    "rewrit fobo/ng-grid.css to fobo/angular-ui/ng-grid/2.0.7/css/ng-grid.min.css" in {
      rewriteResource(FoBoAJSRes.Resource.AJSNGGrid207,
                      "fobo" :: "ng-grid.css" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "ng-grid",
             "2.0.7",
             "css",
             "ng-grid.min.css")
    }
  }

  //AJSUIGrid307
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJSUIGrid307 the ResourceServer" should {
    "allow  fobo/ui-grid.js" in {
      allowResource(FoBoAJSRes.Resource.AJSUIGrid307,
                    "fobo" :: "ui-grid.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIGrid307,
                      "fobo" :: "ui-grid.js" :: Nil) must_==
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")
    }
    "rewrit fobo/ui-grid.css to fobo/angular-ui/ui-grid/3.0.7/css/ui-grid.min.css" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIGrid307,
                      "fobo" :: "ui-grid.css" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "ui-grid",
             "3.0.7",
             "css",
             "ui-grid.min.css")
    }
  }

  //AngularJS153i18n
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS153i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS153i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.5.3/i18n/angular-locale_sv-se.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS153i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS148i18n
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS148i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS148i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS148i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS141i18n
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS141i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS141i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS141i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS1315i18n
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS1315i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS1315i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS1315i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS1219i18n
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS1219i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS1219i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS1219i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")
    }
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoAJSRes.Resource, path: List[String]) = {
    FoBoAJSRes.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoAJSRes.Resource, path: List[String]) = {
    FoBoAJSRes.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
