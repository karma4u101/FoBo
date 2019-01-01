package net.liftmodules.fobobs4.snippet.FoBo

import net.liftweb._
import http._
import common._
import net.liftweb.util.Helpers
import sitemap._

import xml._

/**
  * ==Bs4LinkedListGroup Snippet Bootstrap v4.x==
  *
  * This snippet object transforms lift SiteMap menu items associated with a specified loc
  * group name's into a collection of Bootstrap list group items.
  *
  * This is a simple but flexible list group item snippet that can be used when constructing list group menus.
  * The current implementation is flat and dose not support transformation of Lift PlaceHolder's and submenu's as for example
  * the BsNavbar dose nor dose it support transformations into menu headers or menu dividers as the Bootstrap v2 TBNavlist
  * but you can of course add your own menu section header's between loc groups in the list group as shown in the example below.
  *
  * '''Snippet Usage:'''
  * {{{<span data-lift="FoBo.Bs4LinkedListGroup.builder?group=[LocGroup name]"></span>}}}
  *
  *
  * '''Snippet Params:'''
  *
  *  - '''Param''' ''group'' - The LocGroup name
  *
  * '''Result:''' The above will result in
  * {{{
  *   <a class="list-group-item active" href="[current active loc link url]">[Loc link text]</a>
  *   <a class="list-group-item" href="[loc link url]">[Loc link text]</a>
  *    :
  * }}}
  * This will be expand into a twitter bootstrap navlist's built from the named
  * Lift menu locGroup content.
  *
  * '''Example - Linked list group''' with several linked list (loc) groups combined and enclosed in a list group div with a
  * application specific styled menu section header before the last group.
  * {{{<d i v class="list-group">	
      <span data-lift="FoBo.Bs4LinkedListGroup.builder?group=lg1"></span>
      <span data-lift="FoBo.Bs4LinkedListGroup.builder?group=user"></span>
      <span class="list-group-item mylgheader">Example menu section header</span>
      <span data-lift="FoBo.Bs4LinkedListGroup.builder?group=lg2"></span>
       :
  * </d i v>}}}
  *
  * '''Result:''' This will create a list group of linked items associated with the specified
  * LocGroup names 'lg1, user, lg2, ...'.
  * @since v2.1
  */
trait Bs4LinkedListGroup extends FlexMenuBuilder with DispatchSnippet {

  private val logger = Logger(classOf[Bs4LinkedListGroup])

  def dispatch: DispatchIt =
    overridenDispatch orElse net.liftweb.builtin.snippet.Menu.dispatch

  def overridenDispatch: DispatchIt = {
    case "builder" =>
      ignore =>
        render
  }

  override def expandAll  = true
  override def linkToSelf = true

  override def renderOuterTag(inner: NodeSeq, top: Boolean): NodeSeq = inner

  override def renderSelfLinked(item: MenuItem,
                                renderInner: Seq[MenuItem] => NodeSeq): Elem =
    renderLink(item.uri, item.text, item.path, item.current).asInstanceOf[Elem]

  override def renderLink(uri: NodeSeq,
                          text: NodeSeq,
                          path: Boolean,
                          current: Boolean): NodeSeq = {
    if (current) {
      <a class="list-group-item active" href={uri}>{text}</a>
    } else {
      <a class="list-group-item list-group-item-action" href={uri}>{text}</a>
    }
  }

  def renderLinkWithTarget(uri: NodeSeq,
                           text: NodeSeq,
                           path: Boolean,
                           current: Boolean,
                           f: Function0[_]): NodeSeq = {
    val t: String = f().asInstanceOf[String]
    if (current) {
      <a class="list-group-item active" target={t} href={uri}>{text}</a>
    } else {
      <a class="list-group-item list-group-item-action" target={t} href={uri}>{text}</a>
    }
  }

  override def updateForPath(nodes: Elem, path: Boolean): Elem = nodes

  override def updateForCurrent(nodes: Elem, current: Boolean): Elem = nodes

  //placeholder is disabled in render
  override def renderPlaceholder(item: MenuItem,
                                 renderInner: Seq[MenuItem] => NodeSeq): Elem = {
    updateForCurrent(updateForPath({ item }.asInstanceOf[Elem], item.path), item.current)
  }

  override def buildItemMenu[A](loc: Loc[A],
                                currLoc: Box[Loc[_]],
                                expandAll: Boolean): List[MenuItem] = {
    val kids: List[MenuItem] =
      if (expandAll) loc.buildKidMenuItems(loc.menu.kids) else Nil

    loc
      .asInstanceOf[StructBuildItem]
      .buildItem(kids, currLoc == Full(loc), currLoc == Full(loc))
      .toList
  }

  override def emptyGroup: NodeSeq = NodeSeq.Empty

  override def emptyMenu: NodeSeq = Text("No Navigation Defined.")

  override def emptyPlaceholder: NodeSeq = NodeSeq.Empty

  override def buildInnerTag(contents: NodeSeq,
                             path: Boolean,
                             current: Boolean): Elem =
    contents.asInstanceOf[Elem]

  override def renderSelf(item: MenuItem): NodeSeq = <span>{item.text}</span>

  override def renderSelfNotLinked(
      item: MenuItem,
      renderInner: Seq[MenuItem] => NodeSeq): Elem =
    renderSelf(item).asInstanceOf[Elem]
  //buildInnerTag(<xml:group>{renderSelf(item)}{renderInner(item.kids)}</xml:group>, item.path, item.current)

  override def renderItemInPath(item: MenuItem,
                                renderInner: Seq[MenuItem] => NodeSeq): Elem =
    renderLink(item.uri, item.text, item.path, item.current).asInstanceOf[Elem]
//    buildInnerTag(<xml:group>{renderLink(item.uri, item.text, item.path,
//        item.current)}{renderInner(item.kids)}</xml:group>, item.path, item.current)

  override def renderItem(item: MenuItem,
                          renderInner: Seq[MenuItem] => NodeSeq): Elem = {
    renderItemWithInfo(item.info, renderInner, item)
    //renderLink(item.uri, item.text, item.path, item.current).asInstanceOf[Elem]
  }

  def buildTBNavHeader(contents: NodeSeq,
                       path: Boolean,
                       current: Boolean): Elem =
    updateForCurrent(
      updateForPath(<li class="nav-header">{ contents }</li>, path),
      current)

  def buildTBDivider(contents: NodeSeq, path: Boolean, current: Boolean): Elem =
    updateForCurrent(updateForPath(<li class="divider"></li>, path), current)

  def renderItemWithInfo(info: List[net.liftweb.common.Box[Function0[_]]],
                         renderInner: Seq[MenuItem] => NodeSeq,
                         item: MenuItem): Elem = {

    def buildWithInfo(f: Function0[_],
                      renderInner: Seq[MenuItem] => NodeSeq,
                      item: MenuItem): Elem = {
      if (f().equals("divider")) {
        buildTBDivider(<xml:group></xml:group>, item.path, item.current)
      } else if (f().equals("nav-header")) {
        buildTBNavHeader(<xml:group>{ item.text }</xml:group>,
                         item.path,
                         item.current)
      } else if (f().equals("_blank") || f().equals("_self") || f().equals(
                   "_parent") || f().equals("_top")) {
        renderLinkWithTarget(item.uri, item.text, item.path, item.current, f)
          .asInstanceOf[Elem]
      } else {
        //Unknown function value do the default thingy
        renderLink(item.uri, item.text, item.path, item.current)
          .asInstanceOf[Elem]
      }
    }
    //http://lift.la/scala-option-lift-box-and-how-to-make-your-co //should probably rewrite this using for comprehension
    info match {
      case head :: Nil => {
        head match {
          case Full(f) => {
            buildWithInfo(f, renderInner, item)
          }
          case Empty => {
            //hmmm a empty list
            renderLink(item.uri, item.text, item.path, item.current)
              .asInstanceOf[Elem]
          }
          case Failure(message, _, _) => {
            //something got wrong
            renderLink(item.uri, item.text, item.path, item.current)
              .asInstanceOf[Elem]
          }
        }
      }
      case head :: tail => {
        head match {
          case Full(f) => {
            buildWithInfo(f, renderInner, item)
          }
          case Empty                  =>
          case Failure(message, _, _) => ""
        }
        //info list has more elements
        renderItemWithInfo(tail, renderInner, item)
      }
      case Nil => {
        //there was no info
        //var c = item.current
        renderLink(item.uri, item.text, item.path, item.current)
          .asInstanceOf[Elem]
      }
    }
  }

  override def render: NodeSeq = {

    val level: Box[Int] = for (lvs <- S.attr("level"); i <- Helpers.asInt(lvs)) yield i

    val toRender: Seq[MenuItem] = this.toRender

    def ifExpandCurrent(f: => NodeSeq): NodeSeq = if (expandAny || expandAll) f else NodeSeq.Empty
    def ifExpandAll(f: => NodeSeq): NodeSeq = if (expandAll) f else NodeSeq.Empty
    toRender.toList match {
      case Nil if S.attr("group").isDefined => emptyGroup
      case Nil => emptyMenu
      case xs =>
        def buildANavItem(i: MenuItem): NodeSeq = {
          i match {
            //disable placeholder regardless if it has kids or not
            case m@MenuItem(text, uri, kids, _, _, _) if m.placeholder_? => emptyPlaceholder
            // Per Loc.PlaceHolder, placeholder implies HideIfNoKids
            /* case m@MenuItem(text, uri, kids, _, _, _) if m.placeholder_? && kids.isEmpty => emptyPlaceholder
             case m@MenuItem(text, uri, kids, _, _, _) if m.placeholder_? => renderPlaceholder(m, buildLine _)*/
            case m@MenuItem(text, uri, kids, true, _, _) if linkToSelf   => renderSelfLinked(m, k => ifExpandCurrent(buildLine(k)))
            case m@MenuItem(text, uri, kids, true, _, _) => renderSelfNotLinked(m, k => ifExpandCurrent(buildLine(k)))
            // Not current, but on the path, so we need to expand children to show the current one
            case m@MenuItem(text, uri, kids, _, true, _) => renderItemInPath(m, buildLine _)
            case m =>renderItem(m, buildLine _)
          }
        }

        def buildLine(in: Seq[MenuItem]): NodeSeq = buildUlLine(in, false)

        def buildUlLine(in: Seq[MenuItem], top: Boolean): NodeSeq =
          if (in.isEmpty) {
            NodeSeq.Empty
          } else {
            renderOuterTag(in.flatMap(buildANavItem), top)
          }

        val realMenuItems = level match {
          case Full(lvl) if lvl > 0 =>
            def findKids(cur: Seq[MenuItem], depth: Int): Seq[MenuItem] = if (depth == 0) cur
            else findKids(cur.flatMap(mi => mi.kids), depth - 1)

            findKids(xs, lvl)

          case _ => xs
        }
        buildUlLine(realMenuItems, true)
    }
  }
}

object Bs4LinkedListGroup extends Bs4LinkedListGroup
