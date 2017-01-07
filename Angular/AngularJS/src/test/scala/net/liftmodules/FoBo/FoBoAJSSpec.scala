package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._
import org.specs2._

class FoBoAJSSpec extends mutable.Specification {
  "FoBoAJSToolkitSpec Specification".title
  sequential

  //OBS! using 'test-only' instead of 'test' will fail some test as 'test-only'
  //is treated as code is run in "devMode" while 'test' dose not assume this.

  //AngularJS153
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AngularJS153 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AngularJS153,
                       "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.5.3/js/angular.min.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AngularJS153,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.5.3", "js", "angular.min.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS153 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(FoBoAJS.Resource.AngularJS153,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.5.3/js/angular.min.js" in {
      rewriteResource(FoBoAJS.Resource.AngularJS153,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.5.3", "js", "angular.min.js")
    }
  }

  //AngularJS148
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AngularJS148 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AngularJS148,
                       "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AngularJS148,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS148 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(FoBoAJS.Resource.AngularJS148,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteResource(FoBoAJS.Resource.AngularJS148,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }
  }

  //AngularJS141
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AngularJS141 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AngularJS141,
                       "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AngularJS141,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS141 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(FoBoAJS.Resource.AngularJS141,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
      rewriteResource(FoBoAJS.Resource.AngularJS141,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
    }
  }

  //AngularJS1315
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AngularJS1315 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AngularJS1315,
                       "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AngularJS1315,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS1315 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(FoBoAJS.Resource.AngularJS1315,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in {
      rewriteResource(FoBoAJS.Resource.AngularJS1315,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")
    }
  }

  //AngularJS1219
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AngularJS1219 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AngularJS1219,
                       "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AngularJS1219,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS1219 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(FoBoAJS.Resource.AngularJS1219,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in {
      rewriteResource(FoBoAJS.Resource.AngularJS1219,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")
    }
  }

  //AJMaterial111
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AJMaterial111 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AJMaterial111,
                       "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.1/js/angular-material.min.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AJMaterial111,
                         "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.1.1",
             "js",
             "angular-material.min.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJMaterial111 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowResource(FoBoAJS.Resource.AJMaterial111,
                    "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.1/js/angular-material.min.js" in {
      rewriteResource(FoBoAJS.Resource.AJMaterial111,
                      "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.1.1",
             "js",
             "angular-material.min.js")
    }
  }

  //AJMaterial108
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AJMaterial108 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AJMaterial108,
                       "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.8/js/angular-material.min.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AJMaterial108,
                         "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.0.8",
             "js",
             "angular-material.min.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJMaterial108 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowResource(FoBoAJS.Resource.AJMaterial108,
                    "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.8/js/angular-material.min.js" in {
      rewriteResource(FoBoAJS.Resource.AJMaterial108,
                      "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.0.8",
             "js",
             "angular-material.min.js")
    }
  }

  //AJMaterial101
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AJMaterial101 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AJMaterial101,
                       "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.1/js/angular-material.min.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AJMaterial101,
                         "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.0.1",
             "js",
             "angular-material.min.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJMaterial101 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowResource(FoBoAJS.Resource.AJMaterial101,
                    "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.1/js/angular-material.min.js" in {
      rewriteResource(FoBoAJS.Resource.AJMaterial101,
                      "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.0.1",
             "js",
             "angular-material.min.js")
    }
  }

  //AJSUIBootstrap020
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AJSUIBootstrap020 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AJSUIBootstrap020,
                       "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AJSUIBootstrap020,
                         "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.2.0",
             "js",
             "ui-bootstrap-0.2.0.min.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJSUIBootstrap020 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(FoBoAJS.Resource.AJSUIBootstrap020,
                    "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in {
      rewriteResource(FoBoAJS.Resource.AJSUIBootstrap020,
                      "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.2.0",
             "js",
             "ui-bootstrap-0.2.0.min.js")
    }
  }

  //AJSUIBootstrap070
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AJSUIBootstrap070 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AJSUIBootstrap070,
                       "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AJSUIBootstrap070,
                         "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.7.0",
             "js",
             "ui-bootstrap-0.7.0.min.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJSUIBootstrap070 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(FoBoAJS.Resource.AJSUIBootstrap070,
                    "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in {
      rewriteResource(FoBoAJS.Resource.AJSUIBootstrap070,
                      "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.7.0",
             "js",
             "ui-bootstrap-0.7.0.min.js")
    }
  }

  //AJSUIBootstrap0100
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AJSUIBootstrap0100 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AJSUIBootstrap0100,
                       "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AJSUIBootstrap0100,
                         "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.10.0",
             "js",
             "ui-bootstrap-0.10.0.min.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJSUIBootstrap0100 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(FoBoAJS.Resource.AJSUIBootstrap0100,
                    "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in {
      rewriteResource(FoBoAJS.Resource.AJSUIBootstrap0100,
                      "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.10.0",
             "js",
             "ui-bootstrap-0.10.0.min.js")
    }
  }

  //AJSUIBootstrap240
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AJSUIBootstrap240 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AJSUIBootstrap240,
        "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/2.4.0/js/ui-bootstrap-2.4.0.min.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AJSUIBootstrap240,
        "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
          "angular-ui",
          "bootstrap",
          "2.4.0",
          "js",
          "ui-bootstrap-2.4.0.min.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJSUIBootstrap240 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(FoBoAJS.Resource.AJSUIBootstrap240,
        "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/2.4.0/js/ui-bootstrap-2.4.0.min.js" in {
      rewriteResource(FoBoAJS.Resource.AJSUIBootstrap240,
        "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
          "angular-ui",
          "bootstrap",
          "2.4.0",
          "js",
          "ui-bootstrap-2.4.0.min.js")
    }
  }

  //AJSNGGrid207
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AJSNGGrid207 the ResourceServer" should {
    "allow  fobo/ng-grid.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AJSNGGrid207,
                       "fobo" :: "ng-grid.js" :: Nil) must_== true
    }
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/js/ng-grid.min.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AJSNGGrid207,
                         "fobo" :: "ng-grid.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "ng-grid",
             "2.0.7",
             "js",
             "ng-grid-2.0.7.min.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJSNGGrid207 the ResourceServer" should {
    "allow  fobo/ng-grid.js" in {
      allowResource(FoBoAJS.Resource.AJSNGGrid207,
                    "fobo" :: "ng-grid.js" :: Nil) must_== true
    }
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/js/ng-grid.min.js" in {
      rewriteResource(FoBoAJS.Resource.AJSNGGrid207,
                      "fobo" :: "ng-grid.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "ng-grid",
             "2.0.7",
             "js",
             "ng-grid-2.0.7.min.js")
    }
  }

  //AJSUIGrid307
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AJSUIGrid307 the ResourceServer" should {
    "allow  fobo/ui-grid.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AJSUIGrid307,
                       "fobo" :: "ui-grid.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AJSUIGrid307,
                         "fobo" :: "ui-grid.js" :: Nil) must_==
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJSUIGrid307 the ResourceServer" should {
    "allow  fobo/ui-grid.js" in {
      allowResource(FoBoAJS.Resource.AJSUIGrid307,
                    "fobo" :: "ui-grid.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in {
      rewriteResource(FoBoAJS.Resource.AJSUIGrid307,
                      "fobo" :: "ui-grid.js" :: Nil) must_==
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")
    }
  }

  //AngularJS153i18n
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AngularJS153i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AngularJS153i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.5.3/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AngularJS153i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS153i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(FoBoAJS.Resource.AngularJS153i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.5.3/i18n/angular-locale_sv-se.js" in {
      rewriteResource(FoBoAJS.Resource.AngularJS153i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS148i18n
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AngularJS148i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AngularJS148i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AngularJS148i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS148i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(FoBoAJS.Resource.AngularJS148i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in {
      rewriteResource(FoBoAJS.Resource.AngularJS148i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS141i18n
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AngularJS141i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AngularJS141i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AngularJS141i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS141i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(FoBoAJS.Resource.AngularJS141i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in {
      rewriteResource(FoBoAJS.Resource.AngularJS141i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS1315i18n
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AngularJS1315i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AngularJS1315i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AngularJS1315i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS1315i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(FoBoAJS.Resource.AngularJS1315i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in {
      rewriteResource(FoBoAJS.Resource.AngularJS1315i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS1219i18n
  "With FoBoAJS.Toolkit.Init set to FoBoAJS.Toolkit.AngularJS1219i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(FoBoAJS.Toolkit.AngularJS1219i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(FoBoAJS.Toolkit.AngularJS1219i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS1219i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(FoBoAJS.Resource.AngularJS1219i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in {
      rewriteResource(FoBoAJS.Resource.AngularJS1219i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")
    }
  }

  //=== Toolkit.Init ==============//
  def allowToolkitInit(resource: FoBoAJS.Toolkit, path: List[String]) = {
    FoBoAJS.Toolkit.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: FoBoAJS.Toolkit, path: List[String]) = {
    FoBoAJS.Toolkit.Init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoAJS.Resource, path: List[String]) = {
    FoBoAJS.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoAJS.Resource, path: List[String]) = {
    FoBoAJS.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
