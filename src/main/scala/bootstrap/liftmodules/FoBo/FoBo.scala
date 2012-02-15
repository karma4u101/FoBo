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
  var JQuery:FoBoJQuery = JQuery171 
  var ToolKit:FoBoToolkit = Bootstrap200
}

case object JQuery171 extends FoBoJQuery {
  ResourceServer.rewrite {
    case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("fobo","js","jquery-1.7.1.js")
    case "fobo" :: "jquery.js" :: Nil => List("fobo","js","jquery-1.7.1.js")
  }
}

case object JQuery164 extends FoBoJQuery {
  ResourceServer.rewrite {
    case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("fobo","js","jquery-1.6.4.js")
    case "fobo" :: "jquery.js" :: Nil => List("fobo","js","jquery-1.6.4.js")
  }
}

case object FoBo020 extends FoBoToolkit {
  ResourceServer.rewrite {   
    /*includes foundation bootstrap and orbit css*/
    /*All in on css (except ie)*/
    case "fobo" :: "fobo.css" :: Nil if Props.devMode => List( "fobo","css","fobo-0.2.css") 
    case "fobo" :: "fobo.css" :: Nil => List("fobo","css","fobo-0.2.css")
    
    //special handling of glyph icons  
//    case "fobo" :: "images" :: "bootstrap" :: "glyphicons-halflings-white.png" :: Nil => List("fobo", "images" , "bootstrap" ,"glyphicons-halflings-white.png" )
//    case "fobo" :: "images" :: "bootstrap" :: "glyphicons-halflings.png" :: Nil => List("fobo", "images" , "bootstrap" ,"glyphicons-halflings.png" )

    
    /*Separate staging, separate fobo tweaked css*/
    case "fobo" :: "staging" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo","staging","css","bootstrap-2.0.0.css")
    case "fobo" :: "staging" :: "bootstrap.css" :: Nil => List("fobo","staging","css","bootstrap-2.0.0.css")    
    case "fobo" :: "staging" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo","staging","css","bootstrap-responsive-2.0.0.css")
    case "fobo" :: "staging" :: "bootstrap-responsive.css" :: Nil => List("fobo","staging","css","bootstrap-responsive-2.0.0.css")  
    case "fobo" :: "staging" :: "foundation.css" :: Nil if Props.devMode => List("fobo","staging","css","foundation-2.1.5.css")
    case "fobo" :: "staging" :: "foundation.css" :: Nil => List("fobo","staging","css","foundation-2.1.5.css")
    
    /*Separate orgin css*/
    case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo","orgin","css","bootstrap-2.0.0.css")
    case "fobo" :: "bootstrap.css" :: Nil => List("fobo","orgin","css","bootstrap-2.0.0.css")    
    case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo","orgin","css","bootstrap-responsive-2.0.0.css")
    case "fobo" :: "bootstrap-responsive.css" :: Nil => List("fobo","orgin","css","bootstrap-responsive-2.0.0.css")  

    case "fobo" :: "foundation.css" :: Nil if Props.devMode => List("fobo","orgin","css","foundation-2.1.5.css")
    case "fobo" :: "foundation.css" :: Nil => List("fobo","orgin","css","foundation-2.1.5.css")
    case "fobo" :: "foundation-ie.css" :: Nil if Props.devMode => List("fobo","orgin","css","foundation-ie-2.1.5.css")
    case "fobo" :: "foundation-ie.css" :: Nil => List("fobo","orgin","css","foundation-ie-2.1.5.css")

    case "fobo" :: "orbit.css" :: Nil if Props.devMode => List("fobo","orgin","css","orbit-1.4.0.css")
    case "fobo" :: "orbit.css" :: Nil => List("fobo","orgin","css","orbit-1.4.0.css")    

    /*Google code prettify*/
    case "fobo" :: "prettify.css" :: Nil if Props.devMode => List("fobo","orgin","css","google-code-prettify.css")
    case "fobo" :: "prettify.css" :: Nil => List("fobo","orgin","css","google-code-prettify.css")
        
    /*All in one script*/
    case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-all-2.0.0.js")
    case "fobo" :: "bootstrap.js" :: Nil => List("fobo","js","bootstrap-all-2.0.0.js")   
    
    case "fobo" :: "foundation.js" :: Nil if Props.devMode => List("fobo","js","foundation-2.1.5.js")
    case "fobo" :: "foundation.js" :: Nil => List("fobo","js","foundation-2.1.5.js")    
      
    /*split from all script*/
    case "fobo" :: "bootstrap-alert.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-alert-2.0.0.js")
    case "fobo" :: "bootstrap-alert.js" :: Nil => List("fobo","js","bootstrap-alert-2.0.0.js")
    case "fobo" :: "bootstrap-button.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-button-2.0.0.js")
    case "fobo" :: "bootstrap-button.js" :: Nil => List("fobo","js","bootstrap-button-2.0.0.js")    
    case "fobo" :: "bootstrap-carousel.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-carousel-2.0.0.js")
    case "fobo" :: "bootstrap-carousel.js" :: Nil => List("fobo","js","bootstrap-carousel-2.0.0.js")    
    case "fobo" :: "bootstrap-collapse.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-collapse-2.0.0.js")
    case "fobo" :: "bootstrap-collapse.js" :: Nil => List("fobo","js","bootstrap-collapse-2.0.0.js")    
    case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-dropdown-2.0.0.js")
    case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo","js","bootstrap-dropdown-2.0.0.js")       
    case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-modal-2.0.0.js")
    case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo","js","bootstrap-modal-2.0.0.js")           
    case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-popover-2.0.0.js")
    case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo","js","bootstrap-popover-2.0.0.js")               
    case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-scrollspy-2.0.0.js")
    case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo","js","bootstrap-scrollspy-2.0.0.js")  
    case "fobo" :: "bootstrap-tab.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-tab-2.0.0.js")
    case "fobo" :: "bootstrap-tab.js" :: Nil => List("fobo","js","bootstrap-tab-2.0.0.js")   
    case "fobo" :: "bootstrap-tooltip.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-tooltip-2.0.0.js")
    case "fobo" :: "bootstrap-tooltip.js" :: Nil => List("fobo","js","bootstrap-tooltip-2.0.0.js") 

    case "fobo" :: "bootstrap-transition.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-transition-2.0.0.js")
    case "fobo" :: "bootstrap-transition.js" :: Nil => List("fobo","js","bootstrap-transition-2.0.0.js") 
    
    case "fobo" :: "bootstrap-typeahead.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-typeahead-2.0.0.js")
    case "fobo" :: "bootstrap-typeahead.js" :: Nil => List("fobo","js","bootstrap-typeahead-2.0.0.js") 
    
    /*detect touch-enabled devices*/
    case "fobo" :: "modernizr.foundation.js" :: Nil if Props.devMode => List("fobo","js","modernizr.foundation-2.1.5.js")
    case "fobo" :: "modernizr.foundation.js" :: Nil => List("fobo","js","modernizr.foundation-2.1.5.js")        
    /*orbit scripts*/
    case "fobo" :: "orbit.js" :: Nil if Props.devMode => List("fobo","js","jquery.orbit-1.4.0.js")
    case "fobo" :: "orbit.js" :: Nil => List("fobo","js","jquery.orbit-1.4.0.js")       
  
    /*google code prettify*/
    case "fobo" :: "prettify" :: Nil if Props.devMode => List("fobo","js","google-code-prettify.js")
    case "fobo" :: "prettify" :: Nil => List("fobo","js","google-code-prettify.js")       
    
    
  }
}

case object FoBo010 extends FoBoToolkit {
  ResourceServer.rewrite {   
    /*includes foundation bootstrap and orbit css*/
    /*All in on css (except ie)*/
    case "fobo" :: "fobo.css" :: Nil if Props.devMode => List( "fobo","css","fobo-0.1.css") 
    case "fobo" :: "fobo.css" :: Nil => List("fobo","css","fobo-0.1.css")
    /*Separate orgin css*/
    case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo","orgin","css","bootstrap-1.4.0.css")
    case "fobo" :: "bootstrap.css" :: Nil => List("fobo","orgin","css","bootstrap-1.4.0.css")
    case "fobo" :: "foundation.css" :: Nil if Props.devMode => List("fobo","orgin","css","foundation-2.1.4.css")
    case "fobo" :: "foundation.css" :: Nil => List("fobo","orgin","css","foundation-2.1.4.css")
    case "fobo" :: "orbit.css" :: Nil if Props.devMode => List("fobo","orgin","css","orbit-1.3.0.css")
    case "fobo" :: "orbit.css" :: Nil => List("fobo","orgin","css","orbit-1.3.0.css")            
    case "fobo" :: "foundation-ie.css" :: Nil if Props.devMode => List("fobo","orgin","css","foundation-ie-2.1.4.css")
    case "fobo" :: "foundation-ie.css" :: Nil => List("fobo","orgin","css","foundation-ie-2.1.4.css")
    
    /*Google code prittify*/
    case "fobo" :: "prettify.css" :: Nil if Props.devMode => List("fobo","orgin","css","google-code-prettify.css")
    case "fobo" :: "prettify.css" :: Nil => List("fobo","orgin","css","google-code-prettify.css")
     
    /*All in one script*/
    case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-all-1.4.0.js")
    case "fobo" :: "bootstrap.js" :: Nil => List("fobo","js","bootstrap-all-1.4.0.js")       
    /*split from all script*/
    case "fobo" :: "bootstrap-alerts.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-alerts-1.4.0.js")
    case "fobo" :: "bootstrap-alerts.js" :: Nil => List("fobo","js","bootstrap-alerts-1.4.0.js")
    case "fobo" :: "bootstrap-buttons.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-buttons-1.4.0.js")
    case "fobo" :: "bootstrap-buttons.js" :: Nil => List("fobo","js","bootstrap-buttons-1.4.0.js")    
    case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-dropdown-1.4.0.js")
    case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo","js","bootstrap-dropdown-1.4.0.js")       
    case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-modal-1.4.0.js")
    case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo","js","bootstrap-modal-1.4.0.js")           
    case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-popover-1.4.0.js")
    case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo","js","bootstrap-popover-1.4.0.js")               
    case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-scrollspy-1.4.0.js")
    case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo","js","bootstrap-scrollspy-1.4.0.js")  
    case "fobo" :: "bootstrap-tabs.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-tabs-1.4.0.js")
    case "fobo" :: "bootstrap-tabs.js" :: Nil => List("fobo","js","bootstrap-tabs-1.4.0.js")   
    case "fobo" :: "bootstrap-twipsy.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-twipsy-1.4.0.js")
    case "fobo" :: "bootstrap-twipsy.js" :: Nil => List("fobo","js","bootstrap-twipsy-1.4.0.js")       
    /*orbit scripts*/
    case "fobo" :: "orbit.js" :: Nil if Props.devMode => List("fobo","js","jquery.orbit-1.3.0.js")
    case "fobo" :: "orbit.js" :: Nil => List("fobo","js","jquery.orbit-1.3.0.js")      
  }
}

case object Bootstrap140 extends FoBoToolkit {
  ResourceServer.rewrite {
    case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo","orgin","css","bootstrap-1.4.0.css")
    case "fobo" :: "bootstrap.css" :: Nil => List("fobo","orgin","css","bootstrap-1.4.0.css")
    /*All in one script*/
    case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-all-1.4.0.js")
    case "fobo" :: "bootstrap.js" :: Nil => List("fobo","js","bootstrap-all-1.4.0.js")    
    /*split from all script*/
    case "fobo" :: "bootstrap-alerts.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-alerts-1.4.0.js")
    case "fobo" :: "bootstrap-alerts.js" :: Nil => List("fobo","js","bootstrap-alerts-1.4.0.js")
    case "fobo" :: "bootstrap-buttons.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-buttons-1.4.0.js")
    case "fobo" :: "bootstrap-buttons.js" :: Nil => List("fobo","js","bootstrap-buttons-1.4.0.js")    
    case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-dropdown-1.4.0.js")
    case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo","js","bootstrap-dropdown-1.4.0.js")       
    case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-modal-1.4.0.js")
    case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo","js","bootstrap-modal-1.4.0.js")           
    case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-popover-1.4.0.js")
    case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo","js","bootstrap-popover-1.4.0.js")               
    case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-scrollspy-1.4.0.js")
    case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo","js","bootstrap-scrollspy-1.4.0.js")  
    case "fobo" :: "bootstrap-tabs.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-tabs-1.4.0.js")
    case "fobo" :: "bootstrap-tabs.js" :: Nil => List("fobo","js","bootstrap-tabs-1.4.0.js")   
    case "fobo" :: "bootstrap-twipsy.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-twipsy-1.4.0.js")
    case "fobo" :: "bootstrap-twipsy.js" :: Nil => List("fobo","js","bootstrap-twipsy-1.4.0.js")       
  }
}

case object Bootstrap200 extends FoBoToolkit {
  ResourceServer.rewrite {
    case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo","orgin","css","bootstrap-2.0.0.css")
    case "fobo" :: "bootstrap.css" :: Nil => List("fobo","orgin","css","bootstrap-2.0.0.css")    
    case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo","orgin","css","bootstrap-responsive-2.0.0.css")
    case "fobo" :: "bootstrap-responsive.css" :: Nil => List("fobo","orgin","css","bootstrap-responsive-2.0.0.css")    

    /*Google code prettify*/
    case "fobo" :: "prettify.css" :: Nil if Props.devMode => List("fobo","orgin","css","google-code-prettify.css")
    case "fobo" :: "prettify.css" :: Nil => List("fobo","orgin","css","google-code-prettify.css")
   
    /*All in one script*/
    case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-all-2.0.0.js")
    case "fobo" :: "bootstrap.js" :: Nil => List("fobo","js","bootstrap-all-2.0.0.js")    
    /*split from all script*/
    case "fobo" :: "bootstrap-alert.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-alert-2.0.0.js")
    case "fobo" :: "bootstrap-alert.js" :: Nil => List("fobo","js","bootstrap-alert-2.0.0.js")
    case "fobo" :: "bootstrap-button.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-button-2.0.0.js")
    case "fobo" :: "bootstrap-button.js" :: Nil => List("fobo","js","bootstrap-button-2.0.0.js")    

    case "fobo" :: "bootstrap-carousel.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-carousel-2.0.0.js")
    case "fobo" :: "bootstrap-carousel.js" :: Nil => List("fobo","js","bootstrap-carousel-2.0.0.js")    
    case "fobo" :: "bootstrap-collapse.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-collapse-2.0.0.js")
    case "fobo" :: "bootstrap-collapse.js" :: Nil => List("fobo","js","bootstrap-collapse-2.0.0.js")    

    
    case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-dropdown-2.0.0.js")
    case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo","js","bootstrap-dropdown-2.0.0.js")       
    case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-modal-2.0.0.js")
    case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo","js","bootstrap-modal-2.0.0.js")           
    case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-popover-2.0.0.js")
    case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo","js","bootstrap-popover-2.0.0.js")               
    case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-scrollspy-2.0.0.js")
    case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo","js","bootstrap-scrollspy-2.0.0.js")  
    case "fobo" :: "bootstrap-tab.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-tab-2.0.0.js")
    case "fobo" :: "bootstrap-tab.js" :: Nil => List("fobo","js","bootstrap-tab-2.0.0.js")   
    case "fobo" :: "bootstrap-tooltip.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-tooltip-2.0.0.js")
    case "fobo" :: "bootstrap-tooltip.js" :: Nil => List("fobo","js","bootstrap-tooltip-2.0.0.js") 
    case "fobo" :: "bootstrap-transition.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-transition-2.0.0.js")
    case "fobo" :: "bootstrap-transition.js" :: Nil => List("fobo","js","bootstrap-transition-2.0.0.js") 
    case "fobo" :: "bootstrap-typeahead.js" :: Nil if Props.devMode => List("fobo","js","bootstrap-typeahead-2.0.0.js")
    case "fobo" :: "bootstrap-typeahead.js" :: Nil => List("fobo","js","bootstrap-typeahead-2.0.0.js") 
 
    /*google code prettify*/
    case "fobo" :: "prettify" :: Nil if Props.devMode => List("fobo","js","google-code-prettify.js")
    case "fobo" :: "prettify" :: Nil => List("fobo","js","google-code-prettify.js")       
    
  }
}

case object Foundation214 extends FoBoToolkit {
  ResourceServer.rewrite {
    case "fobo" :: "foundation.css" :: Nil if Props.devMode => List("fobo","orgin","css","foundation-2.1.4.css")
    case "fobo" :: "foundation.css" :: Nil => List("fobo","orgin","css","foundation-2.1.4.css")
    case "fobo" :: "foundation-ie.css" :: Nil if Props.devMode => List("fobo","orgin","css","foundation-ie-2.1.4.css")
    case "fobo" :: "foundation-ie.css" :: Nil => List("fobo","orgin","css","foundation-ie-2.1.4.css")

    case "fobo" :: "orbit.css" :: Nil if Props.devMode => List("fobo","orgin","css","orbit-1.3.0.css")
    case "fobo" :: "orbit.css" :: Nil => List("fobo","orgin","orgin","css","orbit-1.3.0.css")        
    
    case "fobo" :: "foundation.js" :: Nil if Props.devMode => List("fobo","js","foundation-2.1.4.js")
    case "fobo" :: "foundation.js" :: Nil => List("fobo","js","foundation-2.1.4.js")   
    
    case "fobo" :: "orbit.js" :: Nil if Props.devMode => List("fobo","js","jquery.orbit-1.3.0.js")
    case "fobo" :: "orbit.js" :: Nil => List("fobo","js","jquery.orbit-1.3.0.js")        
  }
}

case object Foundation215 extends FoBoToolkit with Loggable {
  logger.debug("")
  ResourceServer.rewrite {
    case "fobo" :: "foundation.css" :: Nil if Props.devMode => List("fobo","orgin","css","foundation-2.1.5.css")
    case "fobo" :: "foundation.css" :: Nil => List("fobo","orgin","css","foundation-2.1.5.css")
    
    case "fobo" :: "foundation-ie.css" :: Nil if Props.devMode => List("fobo","orgin","css","foundation-ie-2.1.5.css")
    case "fobo" :: "foundation-ie.css" :: Nil => List("fobo","orgin","css","foundation-ie-2.1.5.css")

    case "fobo" :: "orbit.css" :: Nil if Props.devMode => List("fobo","orgin","css","orbit-1.4.0.css")
    case "fobo" :: "orbit.css" :: Nil => List("fobo","orgin","css","orbit-1.4.0.css")    
    
    case "fobo" :: "foundation.js" :: Nil if Props.devMode => List("fobo","js","foundation-2.1.5.js")
    case "fobo" :: "foundation.js" :: Nil => List("fobo","js","foundation-2.1.5.js")    
    case "fobo" :: "modernizr.foundation.js" :: Nil if Props.devMode => List("fobo","js","modernizr.foundation-2.1.5.js")
    case "fobo" :: "modernizr.foundation.js" :: Nil => List("fobo","js","modernizr.foundation-2.1.5.js")        

    case "fobo" :: "orbit.js" :: Nil if Props.devMode => List("fobo","js","jquery.orbit-1.4.0.js")
    case "fobo" :: "orbit.js" :: Nil => List("fobo","js","jquery.orbit-1.4.0.js")    
    
//    case "fobo" :: "images" :: tail :: Nil if Props.devMode => List("fobo","images",tail)
//    case "fobo" :: "images" :: tail :: Nil => List("fobo","images",tail)
  }
  logger.debug("")
}




