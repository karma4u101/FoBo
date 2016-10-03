package net.liftmodules.FoBoAJS.snippet.FoBo

import xml._
import org.specs2.mutable.Specification

import net.liftweb.http._
import net.liftweb.common._
import net.liftweb.util.Helpers._

object AJSResourcesSpec extends Specification {
  val session = new LiftSession("", randomString(20), Empty)

  "AngularJS Resource Snippet" should {
    "with FoBo.AJSResources.injectJS?resources=angular,angular-animate produce (in order) angular.js, angular-animate.js toserve script tags" in {
      //different correkt ansvers in different versions of Scala
      val res1 =
        """<script src="/classpath/fobo/angular.js" type="text/javascript"/><script src="/classpath/fobo/angular-animate.js" type="text/javascript"/>""";
      val res2 =
        """<script src="/classpath/fobo/angular.js" type="text/javascript"></script><script src="/classpath/fobo/angular-animate.js" type="text/javascript"></script>""";

      val m =
        collection.immutable.HashMap("resources" -> "angular,angular-animate")
      val out =
        S.statelessInit(Req.nil) {
          S.withAttrs(S.mapToAttrs(m)) {
            val snippet = new AJSResources()
            snippet.injectJS(<div></div>).toString
          }
        }
      //converting to string to make sure we are really comparing
      (out must ==/(res1)) or (out must ==/(res2))
    }

    "with FoBo.AJSResources.injectJS?resources=angular,angular only produce one toserve script tag, angular.js" in {

      val res1 =
        """<script src="/classpath/fobo/angular.js" type="text/javascript"/>""";
      val res2 =
        """<script src="/classpath/fobo/angular.js" type="text/javascript"></script>""";

      val m = collection.immutable.HashMap("resources" -> "angular,angular")
      val out =
        S.statelessInit(Req.nil) {
          S.withAttrs(S.mapToAttrs(m)) {
            val snippet = new AJSResources()
            snippet.injectJS(<div></div>).toString
          }
        }
      (out must ==/(res1)) or (out must ==/(res2))
    }

    "with FoBo.AJSResources.injectJS (without parameters) produce one toserve script tag, angular.js" in {

      val res1 =
        """<script src="/classpath/fobo/angular.js" type="text/javascript"/>""";
      val res2 =
        """<script src="/classpath/fobo/angular.js" type="text/javascript"></script>""";

      //val m = collection.immutable.HashMap("resources" -> "")
      val out =
        S.statelessInit(Req.nil) {
          //S.withAttrs(S.mapToAttrs(m)){
          val snippet = new AJSResources()
          snippet.injectJS(<div></div>).toString
          //}
        }
      (out must ==/(res1)) or (out must ==/(res2))
    }

    "with FoBo.AJSResources.injectCSS?resources=a,b,c,d produce in order ,a.css, b.css, c.css, d.css toserve css link tags" in {

      val res1 =
        """<link href="/classpath/fobo/a.css" rel="stylesheet" type="text/css"/><link href="/classpath/fobo/b.css" rel="stylesheet" type="text/css"/><link href="/classpath/fobo/c.css" rel="stylesheet" type="text/css"/><link href="/classpath/fobo/d.css" rel="stylesheet" type="text/css"/>""";
      val res2 =
        """<link href="/classpath/fobo/a.css" rel="stylesheet" type="text/css"></link><link href="/classpath/fobo/b.css" rel="stylesheet" type="text/css"></link><link href="/classpath/fobo/c.css" rel="stylesheet" type="text/css"></link><link href="/classpath/fobo/d.css" rel="stylesheet" type="text/css"></link>""";

      val m = collection.immutable.HashMap("resources" -> "a,b,c,d")
      val out =
        S.statelessInit(Req.nil) {
          S.withAttrs(S.mapToAttrs(m)) {
            val snippet = new AJSResources()
            snippet.injectCSS(<div></div>).toString
          }
        }
      (out must ==/(res1)) or (out must ==/(res2))
    }

    "with FoBo.AJSResources.injectCSS?resources=a,a only produce one toserve css link tag, a.css" in {

      val res1 =
        """<link href="/classpath/fobo/a.css" rel="stylesheet" type="text/css"/>""";
      val res2 =
        """<link href="/classpath/fobo/a.css" rel="stylesheet" type="text/css"></link>""";

      val m = collection.immutable.HashMap("resources" -> "a,a")
      val out =
        S.statelessInit(Req.nil) {
          S.withAttrs(S.mapToAttrs(m)) {
            val snippet = new AJSResources()
            snippet.injectCSS(<div></div>).toString
          }
        }
      (out must ==/(res1)) or (out must ==/(res2))
    }
  }

}
