package net.liftmodules

import net.liftweb._
import util.Props
import http._
import common._
import org.specs2._

class FoBoAJSSpec extends mutable.Specification {
  "FoBoAJSToolkitSpec Specification".title
  sequential

  //OBS! using 'test-only' instead of 'test' will fail some test as 'test-only'
  //is treated as code is run in "devMode" while 'test' dose not assume this.

  //AngularJS153
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AngularJS153 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(foboajs.Toolkit.AngularJS153,
                       "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.5.3/js/angular.min.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AngularJS153,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.5.3", "js", "angular.min.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AngularJS153 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(foboajs.Resource.AngularJS153,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.5.3/js/angular.min.js" in {
      rewriteResource(foboajs.Resource.AngularJS153,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.5.3", "js", "angular.min.js")
    }
  }

  //AngularJS148
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AngularJS148 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(foboajs.Toolkit.AngularJS148,
                       "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AngularJS148,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AngularJS148 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(foboajs.Resource.AngularJS148,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteResource(foboajs.Resource.AngularJS148,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }
  }

  //AngularJS141
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AngularJS141 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(foboajs.Toolkit.AngularJS141,
                       "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AngularJS141,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AngularJS141 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(foboajs.Resource.AngularJS141,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
      rewriteResource(foboajs.Resource.AngularJS141,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
    }
  }

  //AngularJS1315
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AngularJS1315 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(foboajs.Toolkit.AngularJS1315,
                       "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AngularJS1315,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AngularJS1315 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(foboajs.Resource.AngularJS1315,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in {
      rewriteResource(foboajs.Resource.AngularJS1315,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")
    }
  }

  //AngularJS1219
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AngularJS1219 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(foboajs.Toolkit.AngularJS1219,
                       "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AngularJS1219,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AngularJS1219 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(foboajs.Resource.AngularJS1219,
                    "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in {
      rewriteResource(foboajs.Resource.AngularJS1219,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")
    }
  }

  //AJMaterial114
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AJMaterial114 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowToolkitInit(foboajs.Toolkit.AJMaterial114,
                       "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.4/js/angular-material.min.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AJMaterial114,
                         "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.1.4",
             "js",
             "angular-material.min.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AJMaterial114 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowResource(foboajs.Resource.AJMaterial114,
                    "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.4/js/angular-material.min.js" in {
      rewriteResource(foboajs.Resource.AJMaterial114,
                      "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.1.4",
             "js",
             "angular-material.min.js")
    }
  }

  //AJMaterial111
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AJMaterial111 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowToolkitInit(foboajs.Toolkit.AJMaterial111,
                       "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.1/js/angular-material.min.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AJMaterial111,
                         "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.1.1",
             "js",
             "angular-material.min.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AJMaterial111 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowResource(foboajs.Resource.AJMaterial111,
                    "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.1/js/angular-material.min.js" in {
      rewriteResource(foboajs.Resource.AJMaterial111,
                      "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.1.1",
             "js",
             "angular-material.min.js")
    }
  }

  //AJMaterial108
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AJMaterial108 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowToolkitInit(foboajs.Toolkit.AJMaterial108,
                       "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.8/js/angular-material.min.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AJMaterial108,
                         "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.0.8",
             "js",
             "angular-material.min.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AJMaterial108 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowResource(foboajs.Resource.AJMaterial108,
                    "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.8/js/angular-material.min.js" in {
      rewriteResource(foboajs.Resource.AJMaterial108,
                      "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.0.8",
             "js",
             "angular-material.min.js")
    }
  }

  //AJSUIBootstrap020
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AJSUIBootstrap020 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(foboajs.Toolkit.AJSUIBootstrap020,
                       "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AJSUIBootstrap020,
                         "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.2.0",
             "js",
             "ui-bootstrap-0.2.0.min.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AJSUIBootstrap020 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(foboajs.Resource.AJSUIBootstrap020,
                    "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in {
      rewriteResource(foboajs.Resource.AJSUIBootstrap020,
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
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AJSUIBootstrap070 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(foboajs.Toolkit.AJSUIBootstrap070,
                       "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AJSUIBootstrap070,
                         "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.7.0",
             "js",
             "ui-bootstrap-0.7.0.min.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AJSUIBootstrap070 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(foboajs.Resource.AJSUIBootstrap070,
                    "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in {
      rewriteResource(foboajs.Resource.AJSUIBootstrap070,
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
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AJSUIBootstrap0100 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(foboajs.Toolkit.AJSUIBootstrap0100,
                       "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AJSUIBootstrap0100,
                         "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.10.0",
             "js",
             "ui-bootstrap-0.10.0.min.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AJSUIBootstrap0100 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(foboajs.Resource.AJSUIBootstrap0100,
                    "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in {
      rewriteResource(foboajs.Resource.AJSUIBootstrap0100,
                      "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.10.0",
             "js",
             "ui-bootstrap-0.10.0.min.js")
    }
  }

  //AJSUIBootstrap250
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AJSUIBootstrap250 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(foboajs.Toolkit.AJSUIBootstrap250,
                       "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/2.5.0/js/ui-bootstrap-2.5.0.min.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AJSUIBootstrap250,
                         "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "2.5.0",
             "js",
             "ui-bootstrap-2.5.0.min.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AJSUIBootstrap250 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(foboajs.Resource.AJSUIBootstrap250,
                    "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/2.5.0/js/ui-bootstrap-2.5.0.min.js" in {
      rewriteResource(foboajs.Resource.AJSUIBootstrap250,
                      "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "2.5.0",
             "js",
             "ui-bootstrap-2.5.0.min.js")
    }
  }

  //AJSNGGrid207
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AJSNGGrid207 the ResourceServer" should {
    "allow  fobo/ng-grid.js" in {
      allowToolkitInit(foboajs.Toolkit.AJSNGGrid207,
                       "fobo" :: "ng-grid.js" :: Nil) must_== true
    }
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/js/ng-grid.min.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AJSNGGrid207,
                         "fobo" :: "ng-grid.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "ng-grid",
             "2.0.7",
             "js",
             "ng-grid-2.0.7.min.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AJSNGGrid207 the ResourceServer" should {
    "allow  fobo/ng-grid.js" in {
      allowResource(foboajs.Resource.AJSNGGrid207,
                    "fobo" :: "ng-grid.js" :: Nil) must_== true
    }
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/js/ng-grid.min.js" in {
      rewriteResource(foboajs.Resource.AJSNGGrid207,
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
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AJSUIGrid307 the ResourceServer" should {
    "allow  fobo/ui-grid.js" in {
      allowToolkitInit(foboajs.Toolkit.AJSUIGrid307,
                       "fobo" :: "ui-grid.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AJSUIGrid307,
                         "fobo" :: "ui-grid.js" :: Nil) must_==
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AJSUIGrid307 the ResourceServer" should {
    "allow  fobo/ui-grid.js" in {
      allowResource(foboajs.Resource.AJSUIGrid307,
                    "fobo" :: "ui-grid.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in {
      rewriteResource(foboajs.Resource.AJSUIGrid307,
                      "fobo" :: "ui-grid.js" :: Nil) must_==
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")
    }
  }

  //AngularJS153i18n
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AngularJS153i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(foboajs.Toolkit.AngularJS153i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.5.3/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AngularJS153i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AngularJS153i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(foboajs.Resource.AngularJS153i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.5.3/i18n/angular-locale_sv-se.js" in {
      rewriteResource(foboajs.Resource.AngularJS153i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS148i18n
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AngularJS148i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(foboajs.Toolkit.AngularJS148i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AngularJS148i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AngularJS148i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(foboajs.Resource.AngularJS148i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in {
      rewriteResource(foboajs.Resource.AngularJS148i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS141i18n
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AngularJS141i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(foboajs.Toolkit.AngularJS141i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AngularJS141i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AngularJS141i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(foboajs.Resource.AngularJS141i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in {
      rewriteResource(foboajs.Resource.AngularJS141i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS1315i18n
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AngularJS1315i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(foboajs.Toolkit.AngularJS1315i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AngularJS1315i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AngularJS1315i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(foboajs.Resource.AngularJS1315i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in {
      rewriteResource(foboajs.Resource.AngularJS1315i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS1219i18n
  "With foboajs.Toolkit.init set to foboajs.Toolkit.AngularJS1219i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(foboajs.Toolkit.AngularJS1219i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(foboajs.Toolkit.AngularJS1219i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With foboajs.Resource.init set to foboajs.Resource.AngularJS1219i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(foboajs.Resource.AngularJS1219i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in {
      rewriteResource(foboajs.Resource.AngularJS1219i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")
    }
  }

  //=== Toolkit.init ==============//
  def allowToolkitInit(resource: foboajs.Toolkit, path: List[String]) = {
    foboajs.Toolkit.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: foboajs.Toolkit, path: List[String]) = {
    foboajs.Toolkit.init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.init ===============//
  def allowResource(resource: foboajs.Resource, path: List[String]) = {
    foboajs.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: foboajs.Resource, path: List[String]) = {
    foboajs.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
