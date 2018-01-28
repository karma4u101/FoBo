package net.liftmodules.fobobs4.snippet.FoBo

import net.liftweb.http.{S, LiftRules}
import net.liftweb.common.{Full, Empty}
import net.liftweb.mockweb.WebSpec
import xml.{Elem, Group, NodeSeq}
import net.liftweb.sitemap.{Menu, SiteMap}
import net.liftweb.sitemap.Loc._

object Bs4LinkedListGroupSpec
    extends WebSpec(Bs4LinkedListGroupSpecBoot.boot _) {
  "Bs4LinkedListGroupSpec Specification".title

  val html1 =
    <div data-lift="FoBo.Bs4LinkedListGroup.builder?group=lg1"></div>;

  "Bs4LinkedListGroup" should {
    val testUrl1 = "http://foo.com/page1"
    val testUrl2 = "http://foo.com/page8"

    //adding dummy to investigate test problem
//    "with Dummy" in {
//      val a:scala.xml.Node = <div></div>;
//      val actual:scala.xml.Node = <div></div>;
//      a must beEqualToIgnoringSpace(actual)
//    }
//
//    //adding dummy2 to investigate test problem
//    "with Dummy2" withSFor(testUrl1) in {
//      val a:scala.xml.Node = <div></div>;
//      val actual:scala.xml.Node = <div></div>;
//
//      a must beEqualToIgnoringSpace(actual)
//    }

    "Produce a (Bootstrap4) linked list group that link's to self" withSFor (testUrl1) in {
      val attrs = collection.immutable.HashMap("group" -> "lg1")
      object Bs4LinkedListGroup extends Bs4LinkedListGroup //{ override def linkToSelf = true}

      val linkToSelf: NodeSeq =
        <a class="list-group-item list-group-item-action" href="/index">Home</a>
          <a class="list-group-item active" href="/page1">Page1</a>
          <a class="list-group-item list-group-item-action" href="/page2">Page2</a>
          <a class="list-group-item list-group-item-action" href="/page3">Page3</a>;
      //System.out.println("linkToSelf=" + linkToSelf);
      val actual = S.withAttrs(S.mapToAttrs(attrs)) {
        Bs4LinkedListGroup.render
      }
      //System.out.println("actual=" + actual);
      linkToSelf must beEqualToIgnoringSpace(actual)
    }

    "Respect the LocGroup 'lg1' attribute" withSFor (testUrl1) in {
      val attrs = collection.immutable.HashMap("group" -> "lg1")
      object Bs4LinkedListGroup extends Bs4LinkedListGroup
      val linkToSelf =
        <a class="list-group-item list-group-item-action" href="/index">Home</a>
                       <a class="list-group-item active" href="/page1">Page1</a>
                       <a class="list-group-item list-group-item-action" href="/page2">Page2</a>
                       <a class="list-group-item list-group-item-action" href="/page3">Page3</a>;
      val actual = S.withAttrs(S.mapToAttrs(attrs)) {
        Bs4LinkedListGroup.render
      }
      linkToSelf must beEqualToIgnoringSpace(actual)
    }

    "Add css class 'active' to current page" withSFor (testUrl1) in {
      val attrs = collection.immutable.HashMap("group" -> "lg1")
      object Bs4LinkedListGroup extends Bs4LinkedListGroup

      val linkToSelf =
        <a class="list-group-item list-group-item-action" href="/index">Home</a>
                       <a class="list-group-item active" href="/page1">Page1</a>
                       <a class="list-group-item list-group-item-action" href="/page2">Page2</a>
                       <a class="list-group-item list-group-item-action" href="/page3">Page3</a>;
      val actual = S.withAttrs(S.mapToAttrs(attrs)) {
        Bs4LinkedListGroup.render
      }
      linkToSelf must beEqualToIgnoringSpace(actual)
    }

  }

}

/**
  * This only exists to keep the WebSpecSpec clean. Normally,
  * you could just use "() => bootstrap.Boot.boot".
  */
object Bs4LinkedListGroupSpecBoot {
  def boot() {
    val home  = Menu.i("Home") / "index"
    val page1 = Menu.i("Page1") / "page1"
    val page2 = Menu.i("Page2") / "page2"
    val page3 = Menu.i("Page3") / "page3"
    val page4 = Menu.i("Page4") / "page4"
    val page5 = Menu.i("Page5") / "page5"
    val page6 = Menu.i("Page6") / "page6"
    val page7 = Menu.i("Page7") / "page7"
    val page8 = Menu.i("Page8") / "page8"
    def siteMap = SiteMap(
      home >> LocGroup("lg1"),
      page1 >> LocGroup("lg1"),
      page2 >> LocGroup("lg1"),
      page3 >> LocGroup("lg1"),
      page4 >> LocGroup("lg2"),
      page5 >> LocGroup("lg2"),
      page6 >> LocGroup("lg2"),
      page7 >> LocGroup("lg2"),
      page8 >> LocGroup("lg2")
//      Menu.i("Help") / "help" submenus (
//        Menu.i("Home1") / "index1",
//        Menu.i("Home2") / "index2"
//      ),
//      Menu.i("Help2") / "help2" submenus (
//        Menu.i("Home3") / "index3",
//        Menu.i("Home4") / "index4"
//      )
    )
    LiftRules.setSiteMap(siteMap)
  }
}
