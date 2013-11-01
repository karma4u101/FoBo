package net.liftmodules.FoBo.snippet.FoBo

import scala.xml._
import net.liftweb.util.Helpers._
import scala.xml.transform._
import net.liftweb.common.Logger
import net.liftweb.util.IterableFunc

/**
 * ==BootstrapNav v2.x Snippet==
 * 
 * This snippet object transforms lift sitemap menu with specified loc group name into Bootsrap nav menu items including dropdown menu items.
 * This work is originally contributed to the FoBo module by community member Damian Helme.
 * http://tech.damianhelme.com/twitter-bootstrap-navbar-dropdowns-and-lifts.
 * '''Example''' Invoke with
 * {{{<span data-lift="FoBo.BootstrapNav.menuToTBNav?eager_eval=true"> 
 *     <span data-lift="Menu.builder?top:class=nav pull-right;li_item:class=active;linkToSelf=true;expandAll=true;group=frontNav"></span>
 *	  </span>}}}
 */
@deprecated("For Lift >= v2.5 use the newer TB***Menu snippets","FoBo v0.7.3")
object BootstrapNav extends Logger {

  /* Transforms the XML produced by Menu.build such that any menus defined as:
  Menu("Test") / "test" >> LocGroup("test") >> PlaceHolder submenus (
    Menu("Test 2") / "test2",
    Menu("Test 3") / "test3"
  ),
  or
  Menu("Test") / "test" >> LocGroup("test") >> submenus (
    Menu("Test 2") / "test2",
    Menu("Test 3") / "test3"
  ),
  will be transformed into Twitter Bootstrap dropdown menus
  */

  /**
   * This method will transform the enclosed menu builder call adding provided bootstrap attributes 
   * for declared items in lift sitemap loc locgroup.   
   * '''Example'''
   * {{{<span data-lift="FoBo.BootstrapNav.menuToTBNav?eager_eval=true"> 
   *     <span data-lift="Menu.builder?top:class=nav;li_item:class=active;linkToSelf=true;expandAll=true;group=frontNav"></span>
   *  </span>}}}
   *  '''Result:''' Depending on the items in and the structure of the net.liftweb.sitemap.loc.LocGroup
   *   matching the value specified by the group parameter a nodeSeq formated as a "bootstrap navigation 
   *   menu" containing the declared sitemap items will be returned.
   */
  def menuToTBNav(in: NodeSeq): NodeSeq = {

    object t1 extends RewriteRule {
      override def transform(n: Node): Seq[Node] = n match {

        // removes the white space which appears between elements 
        case Text(text) if (text.matches("\\s+")) => NodeSeq.Empty

        /* matches xml of the format:     
        *<li>
           <span>Test</span>
           <ul>
            <li>
               <a href="/test2">Test 2</a>
            </li>
            <li>
               <a href="/test3">Test 3</a>
            </li>
           </ul>
          </li>
      and transforms it to:
        <li class="dropdown" >
           <a class="dropdown-toggle" data-toggle="dropdown" >Test<b class="caret"></b></a>
           <ul class="dropdown-menu">
              <li>
                 <a href="/test2">Test 2</a>
              </li>
              <li>
                 <a href="/test3">Test 3</a>
              </li>
           </ul>
        </li>
        */
        case li @ Elem(liPrefix, "li", liAttribs, liScope,
          span @ Elem(spanPrefix, "span", spanAttribs, spanScope, spanChildren @ _*),
          ul @ Elem(ulPrefix, "ul", ulAttribs, ulScope, ulChildren @ _*),
          other @ _*) => {

          // create a new node seq with modified attributes
          Elem(liPrefix, "li", newLiAttribs(liAttribs), liScope,
            Elem(spanPrefix, "a", newAAttribs(spanAttribs), spanScope, newAChildren(spanChildren): _*) ++
              Elem(ulPrefix, "ul", newUlAttribs(ulAttribs), ulScope, ulChildren: _*) ++
              other: _*)
        }

        /* matches xml of the format:     
        *<li>
           <a href="/test">Test</a>
           <ul>
            <li>
               <a href="/test2">Test 2</a>
            </li>
            <li>
               <a href="/test3">Test 3</a>
            </li>
           </ul>
          </li>
          
      and transforms it to:
      
        <li class="dropdown" >
           <a class="dropdown-toggle" data-toggle="dropdown" >Test<b class="caret"></b></a>
           <ul class="dropdown-menu">
              <li>
                 <a href="/test2">Test 2</a>
              </li>
              <li>
                 <a href="/test3">Test 3</a>
              </li>
           </ul>
        </li>
        */
        case li @ Elem(liPrefix, "li", liAttribs, liScope,
          a @ Elem(aPrefix, "a", aAttribs, aScope, aChildren @ _*),
          ul @ Elem(ulPrefix, "ul", ulAttribs, ulScope, ulChildren @ _*),
          other @ _*) => {

          // create a new node seq with modified attributes
          Elem(liPrefix, "li", newLiAttribs(liAttribs), liScope,
            Elem(aPrefix, "a", newAAttribs(aAttribs), aScope, newAChildren(aChildren): _*) ++
              Elem(ulPrefix, "ul", newUlAttribs(ulAttribs), ulScope, ulChildren: _*) ++
              other: _*)
        }
        case other @ _ => other
      }
    }

    // debug("menuToTBNav received: " + new PrettyPrinter(80,3).formatNodes(in))
    object rt1 extends RuleTransformer(t1)
    val out = rt1.transform(in)
    // debug("menuToTBNav out: " + new PrettyPrinter(80,3).formatNodes(out))
    out
  }

  /*
   * an attempt at using CSS selectors rather than XML Transform - TBC
  def menuToTBNav(in: NodeSeq) : NodeSeq = {
     def testNode(ns: NodeSeq, cssSel: String): Boolean = {
    var ret = false // does the NodeSeq have any nodes that match the CSS Selector
    (cssSel #> ((ignore: NodeSeq) => {ret = true; NodeSeq.Empty}))(ns)
    ret
  }
     def childHasUI(ns: NodeSeq) : Boolean = {
       true
     }

     val f = "li [class+]" #>
       (((ns: NodeSeq) => Some("dropdown").filter(ignore => childHasUI(ns))): IterableFunc )
       
     f(in)
  }
  */

  // utility methods to add the Bootstrap classes to existing attributes
  private def newLiAttribs(oldAttribs: MetaData) = appendToClass(oldAttribs, "dropdown")
  private def newAAttribs(oldAttribs: MetaData) = appendToClass(oldAttribs, "dropdown-toggle")
    .append("data-toggle" -> "dropdown")
  private def newUlAttribs(oldAttribs: MetaData) = appendToClass(oldAttribs, "dropdown-menu")
  private def newAChildren(oldChildren: NodeSeq) = oldChildren ++ <b class="caret"></b>

  // append a new value to the class attribute if one already exists, otherwise create a new class 
  // with the given value
  private def appendToClass(attribs: MetaData, newClass: String): MetaData = {
    // Note that MetaData.get("class") returns a Option[Seq[Node]] , not Option[Node] as might be expected
    // for an explanation of why see the scala-xml book: 
    val oldClass: Option[String] = attribs.get("class").map(_.mkString).filterNot(_ == "")
    val resultingClass = oldClass.map(_.trim + " ").getOrElse("") + newClass
    attribs.append("class" -> resultingClass)
  }

}