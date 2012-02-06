package net.liftmodules 
package FoBo 
  
object FoBo {
  def init() {
    net.liftweb.http.ResourceServer.allow {
      case  "fobo" :: _ :: Nil => true
      case  "fobo" :: _ :: _ :: Nil => true
      case  "fobo" :: _ :: _ :: _ :: Nil => true
    } 
    
  }
}


/*
In bootstrap.liftweb.Boot.Boot do something like this 
//Set initparams, defaults are provided so no need to set the param if you always will use the latest versions 
FoBoInitParams.jquery = JQuery141 || JQuery171 || ... 
FoBoInitParams.toolkit = FoBo010 || FoBo020 || Foundation214 || Foundation215 || Bootstrap140 || Bootstrap200 || Blueprint101
//The init has to be pressent
Fobo.init()

In templates have something like this 
<link rel="stylesheet" type='text/css' href='/classpath/fobo/fobo.css'> ||
<link rel="stylesheet" type='text/css' href='/classpath/fobo/foundation.css'> ||
<link rel="stylesheet" type='text/css' href='/classpath/fobo/bootstrap.css'> ||

Find a way to path rewrite to the actual css paths like
.../fobo.css ==>> /classpath/fobo/css/fobo-[version].css
.../bootstrap.css =>> /classpath/fobo/orgin/css/bootstrap-[version].css

Scripts 
<script type="text/javascript" src="/classpath/fobo/jquery.js"></script>
<script type="text/javascript" src="/classpath/fobo/bootstrap-twipsy.js"></script>
<script type="text/javascript" src="/classpath/fobo/bootstrap-dropdown.js"></script> 
<script type="text/javascript" src="/classpath/fobo/bootstrap-popover.js"></script>
<script type="text/javascript" src="/classpath/fobo/bootstrap-scrollspy.js"></script>

rewrite 
../jquery.js ==>> /classpath/fobo/js/jquery-[version].js

In the fobo lift module have something like this

trait/object ? FoBoInitParams {
// enumerate params here
}

case ojbect FoBoJQuery extends FoBoInitParams {
    def pathRewriter: PartialFunction[List[String], List[String]] = {
    case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("fobo","js","jquery-1.7.1.js") //default version
    }
}

case ojbect FoBoToolkit extends FoBoInitParams {
    def pathRewriter: PartialFunction[List[String], List[String]] = {
    case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo","orgin","css","bootstrap-2.0.0.css") //default version
    }
}

case object JQuery171 extends FoBoJQuery {
  override def pathRewriter: PartialFunction[List[String], List[String]] = {
    case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("fobo","js","jquery-1.7.1.js")
   // case "fobo" :: "jquery.js" :: Nil => List(fobo","js","jquery-1.7.1-min.js")
  }
}

case object Bootstrap140 extends FoBoToolkit {
  override def pathRewriter: PartialFunction[List[String], List[String]] = {
    case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo","orgin","css","bootstrap-1.4.0.css")
  }
}
     :
     :

*/