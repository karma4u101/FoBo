package net.liftmodules

import net.liftweb._
import net.liftweb.http._
import net.liftweb.common._
import org.specs2.mutable.Specification

object FoBoJQSpec extends Specification {
  "FoBoJQSpec Specification".title

  sequential

  //JQuery310
  "With FoBoJQ.Resource.init set to FoBoJQ.Resource.JQuery310 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojq.Resource.JQuery310, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/3.1.0/js/jquery-min.js" in {
      rewriteResource(fobojq.Resource.JQuery310, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "3.1.0", "js", "jquery-min.js")
    }
  }

  "With FoBoJQ.Toolkit.init set to FoBoJQ.Toolkit.JQuery310 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobojq.Toolkit.JQuery310, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery-migrate/3.1.0/js/jquery-min.js" in {
      rewriteToolkitInit(fobojq.Toolkit.JQuery310, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "3.1.0", "js", "jquery-min.js")
    }
  }

  //JQueryMigrate300
  "With FoBoJQ.Resource.init set to FoBoJQ.Resource.JQueryMigrate300 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(fobojq.Resource.JQueryMigrate300,
                    "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/3.0.0/js/jquery-migrate-min.js" in {
      rewriteResource(fobojq.Resource.JQueryMigrate300,
                      "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "3.0.0", "js", "jquery-migrate-min.js")
    }
  }

  "With FoBoJQ.Toolkit.init set to FoBoJQ.Toolkit.JQueryMigrate300 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowToolkitInit(fobojq.Toolkit.JQueryMigrate300,
                       "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/3.0.0/js/jquery-migrate-min.js" in {
      rewriteToolkitInit(fobojq.Toolkit.JQueryMigrate300,
                         "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "3.0.0", "js", "jquery-migrate-min.js")
    }
  }

  //JQuery300
  "With FoBoJQ.Resource.init set to FoBoJQ.Resource.JQuery300 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojq.Resource.JQuery300, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/3.0.0/js/jquery-min.js" in {
      rewriteResource(fobojq.Resource.JQuery300, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "3.0.0", "js", "jquery-min.js")
    }
  }

  "With FoBoJQ.Toolkit.init set to FoBoJQ.Toolkit.JQuery300 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobojq.Toolkit.JQuery300, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery-migrate/3.0.0/js/jquery-min.js" in {
      rewriteToolkitInit(fobojq.Toolkit.JQuery300, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "3.0.0", "js", "jquery-min.js")
    }
  }

  //JQuery224
  "With FoBoJQ.Resource.init set to FoBoJQ.Resource.JQuery212 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojq.Resource.JQuery224, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.2.4/js/jquery-min.js" in {
      rewriteResource(fobojq.Resource.JQuery224, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.2.4", "js", "jquery-min.js")
    }
  }

  "With FoBoJQ.Toolkit.init set to FoBoJQ.Toolkit.JQuery224 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobojq.Toolkit.JQuery224, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery-migrate/2.2.4/js/jquery-min.js" in {
      rewriteToolkitInit(fobojq.Toolkit.JQuery224, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.2.4", "js", "jquery-min.js")
    }
  }

  //JQueryMigrate141
  "With FoBoJQ.Resource.init set to FoBoJQ.Resource.JQueryMigrate141 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(fobojq.Resource.JQueryMigrate141,
                    "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.4.1/js/jquery-migrate-min.js" in {
      rewriteResource(fobojq.Resource.JQueryMigrate141,
                      "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "1.4.1", "js", "jquery-migrate-min.js")
    }
  }

  "With FoBoJQ.Toolkit.init set to FoBoJQ.Toolkit.JQueryMigrate141 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowToolkitInit(fobojq.Toolkit.JQueryMigrate141,
                       "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.4.1/js/jquery-migrate-min.js" in {
      rewriteToolkitInit(fobojq.Toolkit.JQueryMigrate141,
                         "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "1.4.1", "js", "jquery-migrate-min.js")
    }
  }

  //JQueryMigrate121
  "With FoBoJQ.Resource.init set to FoBoJQ.Resource.JQueryMigrate121 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(fobojq.Resource.JQueryMigrate121,
                    "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteResource(fobojq.Resource.JQueryMigrate121,
                      "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }
  }

  "With FoBoJQ.Toolkit.init set to FoBoJQ.Toolkit.JQueryMigrate121 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowToolkitInit(fobojq.Toolkit.JQueryMigrate121,
                       "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteToolkitInit(fobojq.Toolkit.JQueryMigrate121,
                         "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }
  }

  //JQuery214
  "With FoBoJQ.Resource.init set to FoBoJQ.Resource.JQuery214 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojq.Resource.JQuery214, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.1.4/js/jquery-min.js" in {
      rewriteResource(fobojq.Resource.JQuery214, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.1.4", "js", "jquery-min.js")
    }
  }

  "With FoBoJQ.Toolkit.init set to FoBoJQ.Toolkit.JQuery214 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobojq.Toolkit.JQuery214, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery-migrate/2.1.4/js/jquery-min.js" in {
      rewriteToolkitInit(fobojq.Toolkit.JQuery214, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.1.4", "js", "jquery-min.js")
    }
  }

  //JQuery211
  "With FoBoJQ.Resource.init set to FoBoJQ.Resource.JQuery211 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojq.Resource.JQuery211, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.1.1/js/jquery-min.js" in {
      rewriteResource(fobojq.Resource.JQuery211, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.1.1", "js", "jquery-min.js")
    }
  }

  "With FoBoJQ.Toolkit.init set to FoBoJQ.Toolkit.JQuery211 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobojq.Toolkit.JQuery211, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery-migrate/2.1.1/js/jquery-min.js" in {
      rewriteToolkitInit(fobojq.Toolkit.JQuery211, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.1.1", "js", "jquery-min.js")
    }
  }

  //JQuery1113
  "With FoBoJQ.Resource.init set to FoBoJQ.Resource.JQuery1113 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojq.Resource.JQuery1113, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.11.3/js/jquery-min.js" in {
      rewriteResource(fobojq.Resource.JQuery1113, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.11.3", "js", "jquery-min.js")
    }
  }

  "With FoBoJQ.Toolkit.init set to FoBoJQ.Toolkit.JQuery1113 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobojq.Toolkit.JQuery1113, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery-migrate/1.11.3/js/jquery-min.js" in {
      rewriteToolkitInit(fobojq.Toolkit.JQuery1113,
                         "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.11.3", "js", "jquery-min.js")
    }
  }

  //JQuery1102
  "With FoBoJQ.Resource.init set to FoBoJQ.Resource.JQuery1102 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojq.Resource.JQuery1102, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewriteResource(fobojq.Resource.JQuery1102, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.10.2", "js", "jquery-min.js")
    }
  }

  "With FoBoJQ.Toolkit.init set to FoBoJQ.Toolkit.JQuery1102 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobojq.Toolkit.JQuery1102, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery-migrate/1.10.2/js/jquery-min.js" in {
      rewriteToolkitInit(fobojq.Toolkit.JQuery1102,
                         "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.10.2", "js", "jquery-min.js")
    }
  }

  //JQuery191
  "With FoBoJQ.Resource.init set to FoBoJQ.Resource.JQuery191 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojq.Resource.JQuery191, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.9.1/js/jquery-min.js" in {
      rewriteResource(fobojq.Resource.JQuery191, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.9.1", "js", "jquery-min.js")
    }
  }

  "With FoBoJQ.Toolkit.init set to FoBoJQ.Toolkit.JQuery191 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobojq.Toolkit.JQuery191, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery-migrate/1.9.1/js/jquery-min.js" in {
      rewriteToolkitInit(fobojq.Toolkit.JQuery191, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.9.1", "js", "jquery-min.js")
    }
  }

  //JQuery182
  "With FoBoJQ.Resource.init set to FoBoJQ.Resource.JQuery182 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojq.Resource.JQuery182, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.8.2/js/jquery-min.js" in {
      rewriteResource(fobojq.Resource.JQuery182, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.8.2", "js", "jquery-min.js")
    }
  }

  "With FoBoJQ.Toolkit.init set to FoBoJQ.Toolkit.JQuery182 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobojq.Toolkit.JQuery182, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery-migrate/1.8.2/js/jquery-min.js" in {
      rewriteToolkitInit(fobojq.Toolkit.JQuery182, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.8.2", "js", "jquery-min.js")
    }
  }

  //JQuery172
  "With FoBoJQ.Resource.init set to FoBoJQ.Resource.JQuery172 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojq.Resource.JQuery172, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.7.2/js/jquery-min.js" in {
      rewriteResource(fobojq.Resource.JQuery172, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.7.2", "js", "jquery-min.js")
    }
  }

  "With FoBoJQ.Toolkit.init set to FoBoJQ.Toolkit.JQuery172 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(fobojq.Toolkit.JQuery172, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery-migrate/1.7.2/js/jquery-min.js" in {
      rewriteToolkitInit(fobojq.Toolkit.JQuery172, "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.7.2", "js", "jquery-min.js")
    }
  }

  //=== Toolkit.init ==============//
  def allowToolkitInit(resource: fobojq.Toolkit, path: List[String]) = {
    fobojq.Toolkit.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: fobojq.Toolkit, path: List[String]) = {
    fobojq.Toolkit.init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobojq.Resource, path: List[String]) = {
    fobojq.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobojq.Resource, path: List[String]) = {
    fobojq.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
