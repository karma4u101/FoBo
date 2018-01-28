package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object fobtbresspec extends Specification {
  "fobotbresspec Specification".title

  sequential

  //Bootstrap232
  "With fobotbres.Resource.init set to fobotbres.Resource.Bootstrap232 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(fobotbres.Resource.Bootstrap232,
                    "fobo" :: "bootstrap.js" :: Nil) must_== true
    }
    "rewrit fobo/bootstrap.css to fobo/bootstrap/2.3.2/css/bootstrap-min.css" in {
      rewriteResource(fobotbres.Resource.Bootstrap232,
                      "fobo" :: "bootstrap.css" :: Nil) must_==
        List("fobo", "bootstrap", "2.3.2", "css", "bootstrap-min.css")
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteResource(fobotbres.Resource.Bootstrap232,
                      "fobo" :: "bootstrap.js" :: Nil) must_==
        List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }
  }

  //=== Resource.init ===============//

  def allowResource(resource: fobotbres.Resource, path: List[String]) = {
    fobotbres.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobotbres.Resource, path: List[String]) = {
    fobotbres.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
