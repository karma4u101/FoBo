package net.liftmodules
package FoBo

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

object FoBo {
  def init() {
    ResourceServer.allow {
      case "fobo" :: tail => true
    }
  }
}

abstract trait FoBoJQuery
abstract trait FoBoToolkit
object FoBoInitParams extends FoBoToolkit with FoBoJQuery {
  var JQuery: FoBoJQuery = JQuery171
  var ToolKit: FoBoToolkit = Bootstrap200
}

case object JQuery171 extends FoBoJQuery {
  FoBoResources.jquery171
}

case object JQuery164 extends FoBoJQuery {
  FoBoResources.jquery164
}

case object FoBo020 extends FoBoToolkit {
  FoBoResources.fobo020
  //FoBoResources.foboTweekedStagingBootstrap200
  FoBoResources.bootstrap200
  FoBoResources.foundation215
  FoBoResources.googleCodePrettify
}

case object FoBo010 extends FoBoToolkit {
  FoBoResources.fobo010
  FoBoResources.bootstrap140
  FoBoResources.foundation214
  FoBoResources.googleCodePrettify
}

case object Bootstrap140 extends FoBoToolkit {
  FoBoResources.bootstrap140
  FoBoResources.googleCodePrettify
}

case object Bootstrap200 extends FoBoToolkit {
  FoBoResources.bootstrap200
  FoBoResources.googleCodePrettify
}

case object Foundation214 extends FoBoToolkit {
  FoBoResources.foundation214
  FoBoResources.googleCodePrettify
}

case object Foundation215 extends FoBoToolkit {
  FoBoResources.foundation215
  FoBoResources.googleCodePrettify
}

private object FoBoResources {

  lazy val fobo020 = {
    ResourceServer.rewrite {
      /*includes foundation bootstrap and orbit css*/
      /*All in on fobo tweaked css (except ie)*/
      case "fobo" :: "fobo.css" :: Nil if Props.devMode => List("fobo", "fobo", "0.2", "css", "fobo.css")
      case "fobo" :: "fobo.css" :: Nil => List("fobo", "fobo", "0.2", "css", "fobo.css")
    }
  }

  lazy val fobo010 = {
    ResourceServer.rewrite {
      /*includes foundation bootstrap and orbit css*/
      /*All in on fobo tweaked css (except ie)*/
      case "fobo" :: "fobo.css" :: Nil if Props.devMode => List("fobo", "fobo", "0.1", "css", "fobo.css")
      case "fobo" :: "fobo.css" :: Nil => List("fobo", "fobo", "0.1", "css", "fobo.css")
    }
  }

  lazy val jquery171 = {
    ResourceServer.rewrite {
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("fobo", "jquery", "1.7.1", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("fobo", "jquery", "1.7.1", "js", "jquery.js")
    }
  }

  lazy val jquery164 = {
    ResourceServer.rewrite {
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("fobo", "jquery", "1.6.4", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("fobo", "jquery", "1.6.4", "js", "jquery.js")
    }
  }

// only used during test period has never been a documented feature so better to remove it.
//  lazy val foboTweekedStagingBootstrap200: Unit = {
//    ResourceServer.rewrite {
//      /*Separate staging, separate fobo tweaked css*/
//      case "fobo" :: "staging" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "staging", "css", "bootstrap-2.0.0.css")
//      case "fobo" :: "staging" :: "bootstrap.css" :: Nil => List("fobo", "staging", "css", "bootstrap-2.0.0.css")
//      case "fobo" :: "staging" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo", "staging", "css", "bootstrap-responsive-2.0.0.css")
//      case "fobo" :: "staging" :: "bootstrap-responsive.css" :: Nil => List("fobo", "staging", "css", "bootstrap-responsive-2.0.0.css")
//      case "fobo" :: "staging" :: "foundation.css" :: Nil if Props.devMode => List("fobo", "staging", "css", "foundation-2.1.5.css")
//      case "fobo" :: "staging" :: "foundation.css" :: Nil => List("fobo", "staging", "css", "foundation-2.1.5.css")
//    }
//  }

  lazy val googleCodePrettify: Unit = {
    ResourceServer.rewrite {
      /*Google code prettify*/
      case "fobo" :: "prettify.css" :: Nil if Props.devMode => List("fobo", "google-code", "css", "prettify.css")
      case "fobo" :: "prettify.css" :: Nil => List("fobo", "google-code", "css", "prettify.css")
      /*google code prettify*/
      case "fobo" :: "prettify.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "prettify.js")
      case "fobo" :: "prettify.js" :: Nil => List("fobo", "google-code", "js", "prettify.js")
    }
  }

  lazy val bootstrap200: Unit = {
    ResourceServer.rewrite {
      /*Separate orgin css*/
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.0", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","2.0.0", "css", "bootstrap.css")
      case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "css", "bootstrap-responsive.css")
      case "fobo" :: "bootstrap-responsive.css" :: Nil => List("fobo", "orgin", "bootstrap","2.0.0", "bootstrap-responsive.css")
      /*All in one script*/
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-all.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-all.js")
      /*split from all script*/
      case "fobo" :: "bootstrap-alert.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-alert.js")
      case "fobo" :: "bootstrap-alert.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-alert.js")
      case "fobo" :: "bootstrap-button.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-button.js")
      case "fobo" :: "bootstrap-button.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-button.js")
      case "fobo" :: "bootstrap-carousel.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-carousel.js")
      case "fobo" :: "bootstrap-carousel.js" :: Nil => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-carousel.js")
      case "fobo" :: "bootstrap-collapse.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-collapse.js")
      case "fobo" :: "bootstrap-collapse.js" :: Nil => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-collapse.js")
      case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-dropdown.js")
      case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-dropdown.js")
      case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-modal.js")
      case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-modal.js")
      case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-popover.js")
      case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-popover.js")
      case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-scrollspy.js")
      case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-scrollspy.js")
      case "fobo" :: "bootstrap-tab.js" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-tab.js")
      case "fobo" :: "bootstrap-tab.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-tab.js")
      case "fobo" :: "bootstrap-tooltip.js" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-tooltip.js")
      case "fobo" :: "bootstrap-tooltip.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-tooltip.js")

      case "fobo" :: "bootstrap-transition.js" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-transition.js")
      case "fobo" :: "bootstrap-transition.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-transition.js")

      case "fobo" :: "bootstrap-typeahead.js" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-typeahead.js")
      case "fobo" :: "bootstrap-typeahead.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-typeahead.js")

    }
  }

  lazy val bootstrap140: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "orgin", "css", "bootstrap.css")
      /*All in one script*/
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-all.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-all.js")
      /*split from all script*/
      case "fobo" :: "bootstrap-alerts.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-alerts.js")
      case "fobo" :: "bootstrap-alerts.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-alerts.js")
      case "fobo" :: "bootstrap-buttons.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-buttons.js")
      case "fobo" :: "bootstrap-buttons.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-buttons.js")
      case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-dropdown.js")
      case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-dropdown.js")
      case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-modal.js")
      case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-modal.js")
      case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-popover.js")
      case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-popover.js")
      case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-scrollspy.js")
      case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-scrollspy.js")
      case "fobo" :: "bootstrap-tabs.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-tabs.js")
      case "fobo" :: "bootstrap-tabs.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-tabs.js")
      case "fobo" :: "bootstrap-twipsy.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-twipsy.js")
      case "fobo" :: "bootstrap-twipsy.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-twipsy.js")
    }
  }

  lazy val foundation215: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "foundation.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "css", "foundation.css")
      case "fobo" :: "foundation.css" :: Nil => List("fobo", "foundation", "2.1.5", "css", "foundation.css")
      case "fobo" :: "foundation-ie.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "css", "foundation-ie.css")
      case "fobo" :: "foundation-ie.css" :: Nil => List("fobo", "foundation", "2.1.5", "css", "foundation-ie.css")

      case "fobo" :: "orbit.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "css", "orbit.css")
      case "fobo" :: "orbit.css" :: Nil => List("fobo", "foundation", "2.1.5", "css", "orbit.css")

      /*All in one script*/
      case "fobo" :: "foundation.js" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "js", "foundation.js")
      case "fobo" :: "foundation.js" :: Nil => List("fobo", "foundation", "2.1.5", "js", "foundation.js")

      /*detect touch-enabled devices*/
      case "fobo" :: "modernizr.foundation.js" :: Nil if Props.devMode => List("fobo","foundation", "2.1.5", "js", "modernizr.foundation.js")
      case "fobo" :: "modernizr.foundation.js" :: Nil => List("fobo", "foundation", "2.1.5", "js", "modernizr.foundation.js")
      /*orbit scripts*/
      case "fobo" :: "orbit.js" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "js", "jquery.orbit.js")
      case "fobo" :: "orbit.js" :: Nil => List("fobo", "foundation", "2.1.5", "js", "jquery.orbit.js")
    }
  }

  lazy val foundation214: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "foundation.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.4", "css", "foundation.css")
      case "fobo" :: "foundation.css" :: Nil => List("fobo", "foundation", "2.1.4", "css", "foundation.css")
      case "fobo" :: "foundation-ie.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.4", "css", "foundation-ie.css")
      case "fobo" :: "foundation-ie.css" :: Nil => List("fobo", "foundation", "2.1.4", "css", "foundation-ie.css")

      case "fobo" :: "orbit.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.4", "css", "orbit.css")
      case "fobo" :: "orbit.css" :: Nil => List("fobo", "orgin", "foundation", "2.1.4", "css", "orbit.css")

      case "fobo" :: "foundation.js" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.4", "js", "foundation.js")
      case "fobo" :: "foundation.js" :: Nil => List("fobo", "foundation", "2.1.4", "js", "foundation.js")

      case "fobo" :: "orbit.js" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.4", "js", "jquery.orbit.js")
      case "fobo" :: "orbit.js" :: Nil => List("fobo", "foundation", "2.1.4", "js", "jquery.orbit.js")
    }
  }

}
  



