package net.liftmodules

import net.liftweb.http._
import org.specs2.mutable.Specification

object FoBoJQResSpec extends Specification {
  "FoBoJQResSpec Specification".title

  sequential

  //JQuery310
  "With FoBoJQRes.Resource.init set to FoBoJQRes.Resource.JQuery310 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojqres.Resource.JQuery310, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/3.1.0/js/jquery-min.js" in {
      rewriteResource(fobojqres.Resource.JQuery310,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "3.1.0", "js", "jquery-min.js")
    }
  }

  //JQueryMigrate300
  "With fobojqres.Resource.init set to fobojqres.Resource.JQueryMigrate300 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(fobojqres.Resource.JQueryMigrate300,
                    "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/3.0.0/js/jquery-migrate-min.js" in {
      rewriteResource(fobojqres.Resource.JQueryMigrate300,
                      "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "3.0.0", "js", "jquery-migrate-min.js")
    }
  }

  //JQuery300
  "With fobojqres.Resource.init set to fobojqres.Resource.JQuery300 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojqres.Resource.JQuery300, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/3.0.0/js/jquery-min.js" in {
      rewriteResource(fobojqres.Resource.JQuery300,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "3.0.0", "js", "jquery-min.js")
    }
  }

  //JQuery224
  "With fobojqres.Resource.init set to fobojqres.Resource.JQuery224 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojqres.Resource.JQuery224, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.2.4/js/jquery-min.js" in {
      rewriteResource(fobojqres.Resource.JQuery224,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.2.4", "js", "jquery-min.js")
    }
  }

  //JQueryMigrate141
  "With fobojqres.Resource.init set to fobojqres.Resource.JQueryMigrate141 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(fobojqres.Resource.JQueryMigrate141,
                    "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.4.1/js/jquery-migrate-min.js" in {
      rewriteResource(fobojqres.Resource.JQueryMigrate141,
                      "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "1.4.1", "js", "jquery-migrate-min.js")
    }
  }

  //JQueryMigrate121
  "With fobojqres.Resource.init set to fobojqres.Resource.JQueryMigrate121 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(fobojqres.Resource.JQueryMigrate121,
                    "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteResource(fobojqres.Resource.JQueryMigrate121,
                      "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }
  }

  //JQuery214
  "With fobojqres.Resource.init set to fobojqres.Resource.JQuery214 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojqres.Resource.JQuery214, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.1.4/js/jquery-min.js" in {
      rewriteResource(fobojqres.Resource.JQuery214,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.1.4", "js", "jquery-min.js")
    }
  }

  //JQuery211
  "With fobojqres.Resource.init set to fobojqres.Resource.JQuery211 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojqres.Resource.JQuery211, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.1.1/js/jquery-min.js" in {
      rewriteResource(fobojqres.Resource.JQuery211,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.1.1", "js", "jquery-min.js")
    }
  }

  //JQuery1113
  "With fobojqres.Resource.init set to fobojqres.Resource.JQuery1113 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojqres.Resource.JQuery1113, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.11.3/js/jquery-min.js" in {
      rewriteResource(fobojqres.Resource.JQuery1113,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.11.3", "js", "jquery-min.js")
    }
  }

  //JQuery1102
  "With fobojqres.Resource.init set to fobojqres.Resource.JQuery1102 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojqres.Resource.JQuery1102, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewriteResource(fobojqres.Resource.JQuery1102,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.10.2", "js", "jquery-min.js")
    }
  }

  //JQuery191
  "With fobojqres.Resource.init set to fobojqres.Resource.JQuery191 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojqres.Resource.JQuery191, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.9.1/js/jquery-min.js" in {
      rewriteResource(fobojqres.Resource.JQuery191,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.9.1", "js", "jquery-min.js")
    }
  }

  //JQuery182
  "With fobojqres.Resource.init set to fobojqres.Resource.JQuery182 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojqres.Resource.JQuery182, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.8.2/js/jquery-min.js" in {
      rewriteResource(fobojqres.Resource.JQuery182,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.8.2", "js", "jquery-min.js")
    }
  }

  //JQuery172
  "With fobojqres.Resource.init set to fobojqres.Resource.JQuery172 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(fobojqres.Resource.JQuery172, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.7.2/js/jquery-min.js" in {
      rewriteResource(fobojqres.Resource.JQuery172,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.7.2", "js", "jquery-min.js")
    }
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobojqres.Resource, path: List[String]) = {
    fobojqres.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobojqres.Resource, path: List[String]) = {
    fobojqres.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
