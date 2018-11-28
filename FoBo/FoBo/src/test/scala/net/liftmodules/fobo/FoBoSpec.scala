package net.liftmodules

import net.liftweb._
import http._
import org.specs2.mutable.Specification

object FoBoSpec extends Specification {
  "FoBoSpec Specification".title

  sequential

  //These tests in not meant to catch all errors but to making sure that the
  //fobo InitParam's has got initiated as expected, for instance to ensure that
  //fobo sub modules is accessible.

  //OBS! using 'test-only' instead of 'test' will fail some test as 'test-only'
  //is treated as code is run in "devMode" while 'test' dose not assume this.

  /*=================Angular ====================================*/

  //AngularJS153
  "With fobo.Toolkit.init set to fobo.Toolkit.AngularJS153 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(fobo.Toolkit.AngularJS153, "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.5.3/js/angular.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.AngularJS153,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.5.3", "js", "angular.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AngularJS153 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(fobo.Resource.AngularJS153, "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.5.3/js/angular.min.js" in {
      rewriteResource(fobo.Resource.AngularJS153, "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.5.3", "js", "angular.min.js")
    }
  }

  //AngularJS148
  "With fobo.Toolkit.init set to fobo.Toolkit.AngularJS148 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(fobo.Toolkit.AngularJS148, "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.AngularJS148,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AngularJS148 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(fobo.Resource.AngularJS148, "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteResource(fobo.Resource.AngularJS148, "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }
  }

  //AngularJS141
  "With fobo.Toolkit.init set to fobo.Toolkit.AngularJS141 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(fobo.Toolkit.AngularJS141, "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.AngularJS141,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
    }
  }

  "With fobo.Resource.init set to FoBoAJS.Resource.AngularJS141 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(fobo.Resource.AngularJS141, "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
      rewriteResource(fobo.Resource.AngularJS141, "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
    }
  }

  //AngularJS1315
  "With fobo.Toolkit.init set to fobo.Toolkit.AngularJS1315 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(fobo.Toolkit.AngularJS1315,
                       "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.AngularJS1315,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AngularJS1315 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(fobo.Resource.AngularJS1315, "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in {
      rewriteResource(fobo.Resource.AngularJS1315,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")
    }
  }

  //AngularJS1219
  "With fobo.Toolkit.init set to fobo.Toolkit.AngularJS1219 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(fobo.Toolkit.AngularJS1219,
                       "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.AngularJS1219,
                         "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AngularJS1219 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(fobo.Resource.AngularJS1219, "fobo" :: "angular.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in {
      rewriteResource(fobo.Resource.AngularJS1219,
                      "fobo" :: "angular.js" :: Nil) must_==
        List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")
    }
  }

  //AJMaterial114
  "With fobo.Toolkit.init set to fobo.Toolkit.AJMaterial114 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowToolkitInit(fobo.Toolkit.AJMaterial114,
                       "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.4/js/angular-material.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.AJMaterial114,
                         "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.1.4",
             "js",
             "angular-material.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AJMaterial114 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowResource(fobo.Resource.AJMaterial114,
                    "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.4/js/angular-material.min.js" in {
      rewriteResource(fobo.Resource.AJMaterial114,
                      "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.1.4",
             "js",
             "angular-material.min.js")
    }
  }

  //AJMaterial111
  "With fobo.Toolkit.init set to fobo.Toolkit.AJMaterial111 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowToolkitInit(fobo.Toolkit.AJMaterial111,
                       "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.1/js/angular-material.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.AJMaterial111,
                         "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.1.1",
             "js",
             "angular-material.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AJMaterial111 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowResource(fobo.Resource.AJMaterial111,
                    "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.1/js/angular-material.min.js" in {
      rewriteResource(fobo.Resource.AJMaterial111,
                      "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.1.1",
             "js",
             "angular-material.min.js")
    }
  }

  //AJMaterial108
  "With fobo.Toolkit.init set to fobo.Toolkit.AJMaterial108 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowToolkitInit(fobo.Toolkit.AJMaterial108,
                       "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.8/js/angular-material.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.AJMaterial108,
                         "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.0.8",
             "js",
             "angular-material.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AJMaterial108 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowResource(fobo.Resource.AJMaterial108,
                    "fobo" :: "angular-material.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.8/js/angular-material.min.js" in {
      rewriteResource(fobo.Resource.AJMaterial108,
                      "fobo" :: "angular-material.js" :: Nil) must_==
        List("fobo",
             "angular-material",
             "1.0.8",
             "js",
             "angular-material.min.js")
    }
  }

  //AJSUIBootstrap020
  "With fobo.Toolkit.init set to fobo.Toolkit.AJSUIBootstrap020 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(fobo.Toolkit.AJSUIBootstrap020,
                       "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.AJSUIBootstrap020,
                         "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.2.0",
             "js",
             "ui-bootstrap-0.2.0.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AJSUIBootstrap020 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(fobo.Resource.AJSUIBootstrap020,
                    "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in {
      rewriteResource(fobo.Resource.AJSUIBootstrap020,
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
  "With fobo.Toolkit.init set to fobo.Toolkit.AJSUIBootstrap070 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(fobo.Toolkit.AJSUIBootstrap070,
                       "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.AJSUIBootstrap070,
                         "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.7.0",
             "js",
             "ui-bootstrap-0.7.0.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AJSUIBootstrap070 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(fobo.Resource.AJSUIBootstrap070,
                    "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in {
      rewriteResource(fobo.Resource.AJSUIBootstrap070,
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
  "With fobo.Toolkit.init set to fobo.Toolkit.AJSUIBootstrap0100 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(fobo.Toolkit.AJSUIBootstrap0100,
                       "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.AJSUIBootstrap0100,
                         "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "0.10.0",
             "js",
             "ui-bootstrap-0.10.0.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AJSUIBootstrap0100 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(fobo.Resource.AJSUIBootstrap0100,
                    "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in {
      rewriteResource(fobo.Resource.AJSUIBootstrap0100,
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
  "With fobo.Toolkit.init set to fobo.Toolkit.AJSUIBootstrap250 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(fobo.Toolkit.AJSUIBootstrap250,
                       "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/2.5.0/js/ui-bootstrap-2.5.0.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.AJSUIBootstrap250,
                         "fobo" :: "ui-bootstrap.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "bootstrap",
             "2.5.0",
             "js",
             "ui-bootstrap-2.5.0.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AJSUIBootstrap250 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(fobo.Resource.AJSUIBootstrap250,
                    "fobo" :: "ui-bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/2.5.0/js/ui-bootstrap-2.5.0.min.js" in {
      rewriteResource(fobo.Resource.AJSUIBootstrap250,
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
  "With fobo.Toolkit.init set to fobo.Toolkit.AJSNGGrid207 the ResourceServer" should {
    "allow  fobo/ng-grid.js" in {
      allowToolkitInit(fobo.Toolkit.AJSNGGrid207, "fobo" :: "ng-grid.js" :: Nil) must_== true
    }
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/js/ng-grid.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.AJSNGGrid207,
                         "fobo" :: "ng-grid.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "ng-grid",
             "2.0.7",
             "js",
             "ng-grid-2.0.7.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AJSNGGrid207 the ResourceServer" should {
    "allow  fobo/ng-grid.js" in {
      allowResource(fobo.Resource.AJSNGGrid207, "fobo" :: "ng-grid.js" :: Nil) must_== true
    }
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/js/ng-grid.min.js" in {
      rewriteResource(fobo.Resource.AJSNGGrid207, "fobo" :: "ng-grid.js" :: Nil) must_==
        List("fobo",
             "angular-ui",
             "ng-grid",
             "2.0.7",
             "js",
             "ng-grid-2.0.7.min.js")
    }
  }

  //AJSUIGrid307
  "With fobo.Toolkit.init set to fobo.Toolkit.AJSUIGrid307 the ResourceServer" should {
    "allow  fobo/ui-grid.js" in {
      allowToolkitInit(fobo.Toolkit.AJSUIGrid307, "fobo" :: "ui-grid.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.AJSUIGrid307,
                         "fobo" :: "ui-grid.js" :: Nil) must_==
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AJSUIGrid307 the ResourceServer" should {
    "allow  fobo/ui-grid.js" in {
      allowResource(fobo.Resource.AJSUIGrid307, "fobo" :: "ui-grid.js" :: Nil) must_== true
    }
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in {
      rewriteResource(fobo.Resource.AJSUIGrid307, "fobo" :: "ui-grid.js" :: Nil) must_==
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")
    }
  }

  //AngularJS153i18n
  "With fobo.Toolkit.init set to fobo.Toolkit.AngularJS153i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(fobo.Toolkit.AngularJS153i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.5.3/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(fobo.Toolkit.AngularJS153i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AngularJS153i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(fobo.Resource.AngularJS153i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.5.3/i18n/angular-locale_sv-se.js" in {
      rewriteResource(fobo.Resource.AngularJS153i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS148i18n
  "With fobo.Toolkit.init set to fobo.Toolkit.AngularJS148i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(fobo.Toolkit.AngularJS148i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(fobo.Toolkit.AngularJS148i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AngularJS148i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(fobo.Resource.AngularJS148i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in {
      rewriteResource(fobo.Resource.AngularJS148i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS141i18n
  "With fobo.Toolkit.init set to fobo.Toolkit.AngularJS141i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(fobo.Toolkit.AngularJS141i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(fobo.Toolkit.AngularJS141i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AngularJS141i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(fobo.Resource.AngularJS141i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in {
      rewriteResource(fobo.Resource.AngularJS141i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS1315i18n
  "With fobo.Toolkit.init set to fobo.Toolkit.AngularJS1315i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(fobo.Toolkit.AngularJS1315i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(fobo.Toolkit.AngularJS1315i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AngularJS1315i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(fobo.Resource.AngularJS1315i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in {
      rewriteResource(fobo.Resource.AngularJS1315i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")
    }
  }

  //AngularJS1219i18n
  "With fobo.Toolkit.init set to fobo.Toolkit.AngularJS1219i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(fobo.Toolkit.AngularJS1219i18n,
                       "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(fobo.Toolkit.AngularJS1219i18n,
                         "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.AngularJS1219i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(fobo.Resource.AngularJS1219i18n,
                    "fobo" :: "angular-locale_sv-se.js" :: Nil) must_== true
    }
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in {
      rewriteResource(fobo.Resource.AngularJS1219i18n,
                      "fobo" :: "angular-locale_sv-se.js" :: Nil) must_==
        List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")
    }
  }

  /*=================FontAwesome ====================================*/

  //FontAwesome321
  "With fobo.Toolkit.init set to fobo.Toolkit.FontAwesome321 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(fobo.Toolkit.FontAwesome321,
                       "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome-min.css" in {
      rewriteToolkitInit(fobo.Toolkit.FontAwesome321,
                         "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.FontAwesome321 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobo.Resource.FontAwesome321,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome-min.css" in {
      rewriteResource(fobo.Resource.FontAwesome321,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
    }
  }

  //FontAwesome410
  "With fobo.Toolkit.init set to fobo.Toolkit.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(fobo.Toolkit.FontAwesome410,
                       "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.min.css" in {
      rewriteToolkitInit(fobo.Toolkit.FontAwesome410,
                         "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobo.Resource.FontAwesome410,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.min.css" in {
      rewriteResource(fobo.Resource.FontAwesome410,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
    }
  }

  //FontAwesome430
  "With fobo.Toolkit.init set to fobo.Toolkit.FontAwesome430 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(fobo.Toolkit.FontAwesome430,
                       "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.3.0/css/font-awesome.min.css" in {
      rewriteToolkitInit(fobo.Toolkit.FontAwesome430,
                         "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.FontAwesome430 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobo.Resource.FontAwesome430,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.3.0/css/font-awesome.min.css" in {
      rewriteResource(fobo.Resource.FontAwesome430,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
    }
  }

  //FontAwesome463
  "With fobo.Toolkit.init set to fobo.Toolkit.FontAwesome463 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(fobo.Toolkit.FontAwesome463,
                       "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.6.3/css/font-awesome.min.css" in {
      rewriteToolkitInit(fobo.Toolkit.FontAwesome463,
                         "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.6.3", "css", "font-awesome.min.css")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.FontAwesome463 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(fobo.Resource.FontAwesome463,
                    "fobo" :: "font-awesome.css" :: Nil) must_== true
    }
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.6.3/css/font-awesome.min.css" in {
      rewriteResource(fobo.Resource.FontAwesome463,
                      "fobo" :: "font-awesome.css" :: Nil) must_==
        List("fobo", "font-awesome", "4.6.3", "css", "font-awesome.min.css")
    }
  }

  /*=================Google-Code-Prettify ====================================*/

  //PrettifyJun2011
  "With fobo.Toolkit.init set to fobo.Toolkit.PrettifyJun2011 the ResourceServer" should {
    "allow  fobo/prettify.js" in {
      allowToolkitInit(fobo.Toolkit.PrettifyJun2011,
                       "fobo" :: "prettify.js" :: Nil) must_== true
    }
    "rewrit fobo/prettify.js to fobo/google-code/js/prettify.js" in {
      rewriteToolkitInit(fobo.Toolkit.PrettifyJun2011,
                         "fobo" :: "prettify.js" :: Nil) must_==
        List("fobo", "google-code", "js", "prettify.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.PrettifyJun2011 the ResourceServer" should {
    "allow  fobo/prettify.js" in {
      allowResource(fobo.Resource.PrettifyJun2011,
                    "fobo" :: "prettify.js" :: Nil) must_== true
    }
    "rewrit fobo/prettify.js to fobo/google-code/js/prettify.js" in {
      rewriteResource(fobo.Resource.PrettifyJun2011,
                      "fobo" :: "prettify.js" :: Nil) must_==
        List("fobo", "google-code", "js", "prettify.js")
    }
  }

  /*================= Pace ====================================*/

  //Pace102
  "With fobo.Toolkit.init set to fobo.Toolkit.Pace102 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowToolkitInit(fobo.Toolkit.Pace102, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/pace.js to fobo/pace/1.0.2/js/pace.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.Pace102, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "1.0.2", "js", "pace.min.js")
    }
    "rewrit fobo/black/pace-theme-minimal.css to fobo/pace/1.0.2/css/themes/black/pace-theme-minimal.css" in {
      rewriteToolkitInit(
        fobo.Toolkit.Pace102,
        "fobo" :: "black" :: "pace-theme-minimal.css" :: Nil) must_==
        List("fobo",
             "pace",
             "1.0.2",
             "css",
             "themes",
             "black",
             "pace-theme-minimal.css")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.Pace102 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowResource(fobo.Resource.Pace102, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/pace.js to fobo/pace/1.0.2/js/pace.min.js" in {
      rewriteResource(fobo.Resource.Pace102, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "1.0.2", "js", "pace.min.js")
    }
    "rewrit fobo/black/pace-theme-minimal.css to fobo/pace/1.0.2/css/themes/black/pace-theme-minimal.css" in {
      rewriteResource(
        fobo.Resource.Pace102,
        "fobo" :: "black" :: "pace-theme-minimal.css" :: Nil) must_==
        List("fobo",
             "pace",
             "1.0.2",
             "css",
             "themes",
             "black",
             "pace-theme-minimal.css")
    }
  }

  //Pace0415
  "With fobo.Toolkit.init set to fobo.Toolkit.Pace0415 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowToolkitInit(fobo.Toolkit.Pace0415, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/pace.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.Pace0415, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "0.4.15", "js", "pace.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.Pace0415 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowResource(fobo.Resource.Pace0415, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/pace.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteResource(fobo.Resource.Pace0415, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "0.4.15", "js", "pace.min.js")
    }
  }

  /*=================Bootstrap ====================================*/
  //Bootstrap413
  "With fobo.Resource.init set to fobo.Resource.Bootstrap413 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobo.Resource.Bootstrap413, "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/4.1.3/js/bootstrap-min.js" in {
      rewriteResource(fobo.Resource.Bootstrap413,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "4.1.3", "js", "bootstrap.min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.Bootstrap413 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(fobo.Toolkit.Bootstrap413,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/4.1.3/js/bootstrap-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.Bootstrap413,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "4.1.3", "js", "bootstrap.min.js")
    }
  }

  //Bootstrap400
  "With fobo.Resource.init set to fobo.Resource.Bootstrap400 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobo.Resource.Bootstrap400, "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/4.0.0/js/bootstrap-min.js" in {
      rewriteResource(fobo.Resource.Bootstrap400,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "4.0.0", "js", "bootstrap.min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.Bootstrap400 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(fobo.Toolkit.Bootstrap400,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/4.0.0/js/bootstrap-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.Bootstrap400,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "4.0.0", "js", "bootstrap.min.js")
    }
  }

  //Bootstrap337
  "With fobo.Resource.init set to fobo.Resource.Bootstrap337 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobo.Resource.Bootstrap337, "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.7/js/bootstrap-min.js" in {
      rewriteResource(fobo.Resource.Bootstrap337,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.3.7", "js", "bootstrap.min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.Bootstrap337 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(fobo.Toolkit.Bootstrap337,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.7/js/bootstrap-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.Bootstrap337,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.3.7", "js", "bootstrap.min.js")
    }
  }

  //Bootstrap320
  "With fobo.Resource.init set to fobo.Resource.Bootstrap320 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobo.Resource.Bootstrap320, "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.2.0/js/bootstrap-min.js" in {
      rewriteResource(fobo.Resource.Bootstrap320,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
    }
  }

  "With fobo.Toolkit.init set to FoBoBs.Toolkit.Bootstrap320 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(fobo.Toolkit.Bootstrap320,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.2.0/js/bootstrap-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.Bootstrap320,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
    }
  }

  //Bootstrap311
  "With fobo.Resource.init set to fobo.Resource.Bootstrap311 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobo.Resource.Bootstrap311, "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.1.1/js/bootstrap-min.js" in {
      rewriteResource(fobo.Resource.Bootstrap311,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.1.1", "js", "bootstrap.min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.Bootstrap311 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(fobo.Toolkit.Bootstrap311,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.1.1/js/bootstrap-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.Bootstrap311,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.1.1", "js", "bootstrap.min.js")
    }
  }

  //Bootstrap301
  "With fobo.Resource.init set to fobo.Resource.Bootstrap301 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobo.Resource.Bootstrap301, "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.0.1/js/bootstrap-min.js" in {
      rewriteResource(fobo.Resource.Bootstrap301,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.0.1", "js", "bootstrap.min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.Bootstrap301 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(fobo.Toolkit.Bootstrap301,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.0.1/js/bootstrap-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.Bootstrap301,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "3.0.1", "js", "bootstrap.min.js")
    }
  }

  //Bootstrap232
  "With fobo.Resource.init set to fobo.Resource.Bootstrap232 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobo.Resource.Bootstrap232, "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteResource(fobo.Resource.Bootstrap232,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.Bootstrap232 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(fobo.Toolkit.Bootstrap232,
                       "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.Bootstrap232,
                         "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }
  }

  /*=================JQuery and JQuery Migrate ====================================*/

  //JQuery310
  "With fobo.Resource.init set to fobo.Resource.JQuery310 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobo.Resource.JQuery310, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/3.1.0/js/jquery-min.js" in {
      rewriteResource(fobo.Resource.JQuery310, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "3.1.0", "js", "jquery-min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.JQuery310 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobo.Toolkit.JQuery310, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/3.1.0/js/jquery-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.JQuery310, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "3.1.0", "js", "jquery-min.js")
    }
  }

  //JQueryMigrate300
  "With fobo.Resource.init set to fobo.Resource.JQueryMigrate300 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(fobo.Resource.JQueryMigrate300,
                    "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/3.0.0/js/jquery-migrate-min.js" in {
      rewriteResource(fobo.Resource.JQueryMigrate300,
                      "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "3.0.0", "js", "jquery-migrate-min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.JQueryMigrate300 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowToolkitInit(fobo.Toolkit.JQueryMigrate300,
                       "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/3.0.0/js/jquery-migrate-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.JQueryMigrate300,
                         "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "3.0.0", "js", "jquery-migrate-min.js")
    }
  }

  //JQuery300
  "With fobo.Resource.init set to fobo.Resource.JQuery300 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobo.Resource.JQuery300, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/3.0.0/js/jquery-min.js" in {
      rewriteResource(fobo.Resource.JQuery300, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "3.0.0", "js", "jquery-min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.JQuery300 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobo.Toolkit.JQuery300, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/3.0.0/js/jquery-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.JQuery300, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "3.0.0", "js", "jquery-min.js")
    }
  }

  //JQuery224
  "With fobo.Resource.init set to fobo.Resource.JQuery224 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobo.Resource.JQuery224, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.2.4/js/jquery-min.js" in {
      rewriteResource(fobo.Resource.JQuery224, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.2.4", "js", "jquery-min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.JQuery224 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobo.Toolkit.JQuery224, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.2.4/js/jquery-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.JQuery224, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.2.4", "js", "jquery-min.js")
    }
  }

  //JQueryMigrate141
  "With fobo.Resource.init set to fobo.Resource.JQueryMigrate141 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(fobo.Resource.JQueryMigrate141,
                    "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.4.1/js/jquery-migrate-min.js" in {
      rewriteResource(fobo.Resource.JQueryMigrate141,
                      "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "1.4.1", "js", "jquery-migrate-min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.JQueryMigrate141 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowToolkitInit(fobo.Toolkit.JQueryMigrate141,
                       "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.4.1/js/jquery-migrate-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.JQueryMigrate141,
                         "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "1.4.1", "js", "jquery-migrate-min.js")
    }
  }

  //JQueryMigrate121
  "With fobo.Resource.init set to fobo.Resource.JQueryMigrate121 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(fobo.Resource.JQueryMigrate121,
                    "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteResource(fobo.Resource.JQueryMigrate121,
                      "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.JQueryMigrate121 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowToolkitInit(fobo.Toolkit.JQueryMigrate121,
                       "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.JQueryMigrate121,
                         "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }
  }

  //JQuery214
  "With fobo.Resource.init set to fobo.Resource.JQuery214 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobo.Resource.JQuery214, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.1.4/js/jquery-min.js" in {
      rewriteResource(fobo.Resource.JQuery214, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.1.4", "js", "jquery-min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.JQuery214 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobo.Toolkit.JQuery214, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.1.4/js/jquery-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.JQuery214, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.1.4", "js", "jquery-min.js")
    }
  }

  //JQuery211
  "With fobo.Resource.init set to fobo.Resource.JQuery211 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobo.Resource.JQuery211, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.1.1/js/jquery-min.js" in {
      rewriteResource(fobo.Resource.JQuery211, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.1.1", "js", "jquery-min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.JQuery211 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobo.Toolkit.JQuery211, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.1.1/js/jquery-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.JQuery211, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.1.1", "js", "jquery-min.js")
    }
  }

  //JQuery1113
  "With fobo.Resource.init set to fobo.Resource.JQuery1113 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobo.Resource.JQuery1113, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.11.3/js/jquery-min.js" in {
      rewriteResource(fobo.Resource.JQuery1113, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.11.3", "js", "jquery-min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.JQuery1113 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobo.Toolkit.JQuery1113, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.11.3/js/jquery-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.JQuery1113, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.11.3", "js", "jquery-min.js")
    }
  }

  //JQuery1102
  "With fobo.Resource.init set to fobo.Resource.JQuery1102 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobo.Resource.JQuery1102, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewriteResource(fobo.Resource.JQuery1102, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.10.2", "js", "jquery-min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.JQuery1102 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobo.Toolkit.JQuery1102, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.JQuery1102, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.10.2", "js", "jquery-min.js")
    }
  }

  //JQuery182
  "With fobo.Resource.init set to fobo.Resource.JQuery182 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobo.Resource.JQuery182, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.8.2/js/jquery-min.js" in {
      rewriteResource(fobo.Resource.JQuery182, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.8.2", "js", "jquery-min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.JQuery182 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobo.Toolkit.JQuery182, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.8.2/js/jquery-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.JQuery182, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.8.2", "js", "jquery-min.js")
    }
  }

  //JQuery191
  "With fobo.Resource.init set to fobo.Resource.JQuery191 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobo.Resource.JQuery191, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.9.1/js/jquery-min.js" in {
      rewriteResource(fobo.Resource.JQuery191, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.9.1", "js", "jquery-min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.JQuery191 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobo.Toolkit.JQuery191, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.9.1/js/jquery-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.JQuery191, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.9.1", "js", "jquery-min.js")
    }
  }

  //JQuery172
  "With fobo.Resource.init set to fobo.Resource.JQuery172 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobo.Resource.JQuery172, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.7.2/js/jquery-min.js" in {
      rewriteResource(fobo.Resource.JQuery172, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.7.2", "js", "jquery-min.js")
    }
  }

  "With fobo.Toolkit.init set to fobo.Toolkit.JQuery172 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobo.Toolkit.JQuery172, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.7.2/js/jquery-min.js" in {
      rewriteToolkitInit(fobo.Toolkit.JQuery172, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.7.2", "js", "jquery-min.js")
    }
  }

  /*===Highlight ===============================================================*/

  //HighlightJS930
  "With fobo.Toolkit.init set to FoBoHLRes.Toolkit.HighlightJS930 the ResourceServer" should {
    "allow  fobo/highlight/highlight.pack.js" in {
      allowToolkitInit(
        fobo.Toolkit.HighlightJS930,
        "fobo" :: "highlight" :: "highlight.pack.js" :: Nil) must_== true
    }
    "rewrit rewrit fobo/highlight/highlight.pack.js to fobo/highlight/9.3.0/js/highlight.pack.js" in {
      rewriteToolkitInit(
        fobo.Toolkit.HighlightJS930,
        "fobo" :: "highlight" :: "highlight.pack.js" :: Nil) must_==
        List("fobo", "highlight", "9.3.0", "js", "highlight.pack.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.HighlightJS930 the ResourceServer" should {
    "allow  fobo/highlight/highlight.pack.js" in {
      allowResource(
        fobo.Resource.HighlightJS930,
        "fobo" :: "highlight" :: "highlight.pack.js" :: Nil) must_== true
    }
    "rewrit rewrit fobo/highlight/highlight.pack.js to fobo/highlight/9.3.0/js/highlight.pack.js" in {
      rewriteResource(
        fobo.Resource.HighlightJS930,
        "fobo" :: "highlight" :: "highlight.pack.js" :: Nil) must_==
        List("fobo", "highlight", "9.3.0", "js", "highlight.pack.js")
    }
  }

  //== Popper ==================================//
  //Popper1129
  "With fobo.Toolkit.init set to fobo.Toolkit.Popper1129 the ResourceServer" should {
    "allow  fobo/popper.js" in {
      allowToolkitInit(fobo.Toolkit.Popper1129, "fobo" :: "popper.js" :: Nil) must_== true
    }
    "rewrit fobo/popper.js to fobo/popper/1.12.9/js/umd/popper.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.Popper1129, "fobo" :: "popper.js" :: Nil) must_==
        List("fobo", "popper", "1.12.9", "js", "umd", "popper.min.js")
    }

    "allow  fobo/popper-utils.js" in {
      allowToolkitInit(fobo.Toolkit.Popper1129,
                       "fobo" :: "popper-utils.js" :: Nil) must_== true
    }
    "rewrit fobo/popper-utils.js to fobo/popper/1.12.9/js/umd/popper-utils.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.Popper1129,
                         "fobo" :: "popper-utils.js" :: Nil) must_==
        List("fobo", "popper", "1.12.9", "js", "umd", "popper-utils.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.Popper1129 the ResourceServer" should {
    "allow  fobo/popper.js" in {
      allowResource(fobo.Resource.Popper1129, "fobo" :: "popper.js" :: Nil) must_== true
    }
    "rewrit fobo/popper.js to fobo/popper/1.12.9/js/umd/popper.min.js" in {
      rewriteResource(fobo.Resource.Popper1129, "fobo" :: "popper.js" :: Nil) must_==
        List("fobo", "popper", "1.12.9", "js", "umd", "popper.min.js")
    }

    "allow  fobo/popper-utils.js" in {
      allowResource(fobo.Resource.Popper1129,
                    "fobo" :: "popper-utils.js" :: Nil) must_== true
    }
    "rewrit fobo/popper-utils.js to fobo/popper/1.12.9/js/umd/popper-utils.min.js" in {
      rewriteResource(fobo.Resource.Popper1129,
                      "fobo" :: "popper-utils.js" :: Nil) must_==
        List("fobo", "popper", "1.12.9", "js", "umd", "popper-utils.min.js")
    }
  }

  //=== Tooltip ======================================//
  //Tooltip114
  "With fobo.Toolkit.init set to fobo.Toolkit.Tooltip114 the ResourceServer" should {
    "allow  fobo/tooltip.js" in {
      allowToolkitInit(fobo.Toolkit.Tooltip114, "fobo" :: "tooltip.js" :: Nil) must_== true
    }
    "rewrit fobo/tooltip.js to fobo/tooltip/1.1.4/js/umd/tooltip.min.js" in {
      rewriteToolkitInit(fobo.Toolkit.Tooltip114, "fobo" :: "tooltip.js" :: Nil) must_==
        List("fobo", "tooltip", "1.1.4", "js", "umd", "tooltip.min.js")
    }
  }

  "With fobo.Resource.init set to fobo.Resource.Tooltip114 the ResourceServer" should {
    "allow  fobo/tooltip.js" in {
      allowResource(fobo.Resource.Tooltip114, "fobo" :: "tooltip.js" :: Nil) must_== true
    }
    "rewrit fobo/tooltip.js to fobo/tooltip/1.1.4/js/umd/tooltip.min.js" in {
      rewriteResource(fobo.Resource.Tooltip114, "fobo" :: "tooltip.js" :: Nil) must_==
        List("fobo", "tooltip", "1.1.4", "js", "umd", "tooltip.min.js")
    }
  }

  //=== Toolkit.init ==============//
  def allowToolkitInit(resource: fobo.Toolkit, path: List[String]) = {
    fobo.Toolkit.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: fobo.Toolkit, path: List[String]) = {
    fobo.Toolkit.init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobo.Resource, path: List[String]) = {
    fobo.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobo.Resource, path: List[String]) = {
    fobo.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
