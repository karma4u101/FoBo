package net.liftmodules

import net.liftweb._
import net.liftweb.http._
import net.liftweb.common._
import org.specs2.mutable.Specification

object FoBoJQResSpec extends Specification {
  "FoBoJQResSpec Specification".title

  sequential

  //JQuery310
  "With FoBoJQRes.Resource.Init set to FoBoJQRes.Resource.JQuery310 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQRes.Resource.JQuery310, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/3.1.0/js/jquery-min.js" in {
      rewriteResource(FoBoJQRes.Resource.JQuery310,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "3.1.0", "js", "jquery-min.js")
    }
  }

  //JQueryMigrate300
  "With FoBoJQRes.Resource.Init set to FoBoJQRes.Resource.JQueryMigrate300 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(FoBoJQRes.Resource.JQueryMigrate300,
                    "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/3.0.0/js/jquery-migrate-min.js" in {
      rewriteResource(FoBoJQRes.Resource.JQueryMigrate300,
                      "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "3.0.0", "js", "jquery-migrate-min.js")
    }
  }

  //JQuery300
  "With FoBoJQRes.Resource.Init set to FoBoJQRes.Resource.JQuery300 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQRes.Resource.JQuery300, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/3.0.0/js/jquery-min.js" in {
      rewriteResource(FoBoJQRes.Resource.JQuery300,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "3.0.0", "js", "jquery-min.js")
    }
  }

  //JQuery224
  "With FoBoJQRes.Resource.Init set to FoBoJQRes.Resource.JQuery224 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQRes.Resource.JQuery224, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.2.4/js/jquery-min.js" in {
      rewriteResource(FoBoJQRes.Resource.JQuery224,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.2.4", "js", "jquery-min.js")
    }
  }

  //JQueryMigrate141
  "With FoBoJQRes.Resource.Init set to FoBoJQRes.Resource.JQueryMigrate141 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(FoBoJQRes.Resource.JQueryMigrate141,
                    "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.4.1/js/jquery-migrate-min.js" in {
      rewriteResource(FoBoJQRes.Resource.JQueryMigrate141,
                      "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "1.4.1", "js", "jquery-migrate-min.js")
    }
  }

  //JQueryMigrate121
  "With FoBoJQRes.Resource.Init set to FoBoJQRes.Resource.JQueryMigrate121 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(FoBoJQRes.Resource.JQueryMigrate121,
                    "fobo" :: "jquery-migrate.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteResource(FoBoJQRes.Resource.JQueryMigrate121,
                      "fobo" :: "jquery-migrate.js" :: Nil) must_==
        List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }
  }

  //JQuery214
  "With FoBoJQRes.Resource.Init set to FoBoJQRes.Resource.JQuery214 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQRes.Resource.JQuery214, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.1.4/js/jquery-min.js" in {
      rewriteResource(FoBoJQRes.Resource.JQuery214,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.1.4", "js", "jquery-min.js")
    }
  }

  //JQuery211
  "With FoBoJQRes.Resource.Init set to FoBoJQRes.Resource.JQuery211 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQRes.Resource.JQuery211, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/2.1.1/js/jquery-min.js" in {
      rewriteResource(FoBoJQRes.Resource.JQuery211,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "2.1.1", "js", "jquery-min.js")
    }
  }

  //JQuery1113
  "With FoBoJQRes.Resource.Init set to FoBoJQRes.Resource.JQuery1113 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQRes.Resource.JQuery1113,
                    "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.11.3/js/jquery-min.js" in {
      rewriteResource(FoBoJQRes.Resource.JQuery1113,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.11.3", "js", "jquery-min.js")
    }
  }

  //JQuery1102
  "With FoBoJQRes.Resource.Init set to FoBoJQRes.Resource.JQuery1102 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQRes.Resource.JQuery1102,
                    "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewriteResource(FoBoJQRes.Resource.JQuery1102,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.10.2", "js", "jquery-min.js")
    }
  }

  //JQuery191
  "With FoBoJQRes.Resource.Init set to FoBoJQRes.Resource.JQuery191 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQRes.Resource.JQuery191, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.9.1/js/jquery-min.js" in {
      rewriteResource(FoBoJQRes.Resource.JQuery191,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.9.1", "js", "jquery-min.js")
    }
  }

  //JQuery182
  "With FoBoJQRes.Resource.Init set to FoBoJQRes.Resource.JQuery182 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQRes.Resource.JQuery182, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.8.2/js/jquery-min.js" in {
      rewriteResource(FoBoJQRes.Resource.JQuery182,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.8.2", "js", "jquery-min.js")
    }
  }

  //JQuery172
  "With FoBoJQRes.Resource.Init set to FoBoJQRes.Resource.JQuery172 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQRes.Resource.JQuery172, "fobo" :: "jquery.js" :: Nil) must_== true
    }
    "rewrit fobo/jquery.js to jquery/1.7.2/js/jquery-min.js" in {
      rewriteResource(FoBoJQRes.Resource.JQuery172,
                      "fobo" :: "jquery.js" :: Nil) must_==
        List("jquery", "1.7.2", "js", "jquery-min.js")
    }
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoJQRes.Resource, path: List[String]) = {
    FoBoJQRes.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoJQRes.Resource, path: List[String]) = {
    FoBoJQRes.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
