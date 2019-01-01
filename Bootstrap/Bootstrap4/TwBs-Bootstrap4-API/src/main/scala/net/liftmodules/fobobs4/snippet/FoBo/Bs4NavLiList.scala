package net.liftmodules.fobobs4.snippet.FoBo

import net.liftweb._
import http._
import common._
import net.liftweb.util.Helpers
import sitemap._

import xml._

/**
  * ==Bs4NavLiList Snippet Bootstrap v4.x==
  *
  * This snippet object transforms lift SiteMap menu items associated with a specified loc
  * group name's into a collection of list items.
  *
  * This is a simple but flexible list item snippet that can be used when constructing li list menus.
  * In addition to normal menu loc items the Bs4NavLiList dose also support menu headers and dividers
  * from SiteMap entries, see BSLocInfo the object in [[net.liftmodules.fobobs4.lib]] for various, simple to use,
  * SiteMap manipulation functions.
  *
  * '''Snippet Usage:'''
  * {{{<span data-lift="FoBo.Bs4NavLiList.builder?group=[LocGroup name]"></span>}}}
  *
  *
  * '''Snippet Params:'''
  *
  *  - '''Param''' ''group'' - The LocGroup name
  *
  * '''Result:''' The above will result in
  * {{{
  *   < l i class="active"><a href="[current active loc link url]" class="">[Loc link text]</a></l i >
  *   < l i class=""><a href="[loc link url]" class="">[Loc link text]</a></l i >
  *    :
  * }}}
  * This will be expand into a list's built from the named Lift menu locGroup content.
  *
  * '''Example - A nav menu''' with one (loc) group
  * {{{< u l class="nav " >	
  *      <span data-lift="FoBo.Bs4NavLiList.builder?group=nav1"></span>
  *     :
  * </u l >}}}
  *
  * '''Result:''' This will create a list of linked items associated with the specified
  * LocGroup name 'nav1'.
  * @since v2.1
  */
trait Bs4NavLiList extends FlexMenuBuilder with DispatchSnippet {

  private val logger = Logger(classOf[Bs4NavLiList])

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
    buildInnerTag(<xml:group>{renderLink(item.uri, item.text, item.path,
        item.current)}{renderInner(item.kids)}</xml:group>,
                  item.path,
                  item.current)

  override def renderLink(uri: NodeSeq,
                          text: NodeSeq,
                          path: Boolean,
                          current: Boolean): NodeSeq = {
    if (current) {
      <a class="active" href={uri}>{text}</a>
    } else {
      <a class="" href={uri}>{text}</a>
    }
  }

  def renderLinkWithTarget(uri: NodeSeq,
                           text: NodeSeq,
                           path: Boolean,
                           current: Boolean,
                           f: Function0[_]): NodeSeq = {
    val t: String = f().asInstanceOf[String]
    if (current) {
      <a class="active" target={t} href={uri}>{text}</a>
    } else {
      <a class="" target={t} href={uri}>{text}</a>
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
                             current: Boolean): Elem = {
    if (current) {
      updateForCurrent(
        updateForPath(<li class="active">{ contents }</li>, path),
        current)
    } else {
      updateForCurrent(updateForPath(<li>{ contents }</li>, path), current)
    }
  }

  def buildTBNavHeader(contents: NodeSeq,
                       path: Boolean,
                       current: Boolean): Elem =
    updateForCurrent(
      updateForPath(<li class="nav-header">{ contents }</li>, path),
      current)

  def buildTBDivider(contents: NodeSeq, path: Boolean, current: Boolean): Elem =
    updateForCurrent(updateForPath(<li class="divider"></li>, path), current)

  override def renderSelf(item: MenuItem): NodeSeq = <span>{item.text}</span>

  override def renderSelfNotLinked(
      item: MenuItem,
      renderInner: Seq[MenuItem] => NodeSeq): Elem =
    buildInnerTag(
      <xml:group>{renderSelf(item)}{renderInner(item.kids)}</xml:group>,
      item.path,
      item.current)

  override def renderItemInPath(item: MenuItem,
                                renderInner: Seq[MenuItem] => NodeSeq): Elem =
    buildInnerTag(<xml:group>{renderLink(item.uri, item.text, item.path,
        item.current)}{renderInner(item.kids)}</xml:group>,
                  item.path,
                  item.current)

  override def renderItem(item: MenuItem,
                          renderInner: Seq[MenuItem] => NodeSeq): Elem = {
    renderItemWithInfo(item.info, renderInner, item)
    //renderLink(item.uri, item.text, item.path, item.current).asInstanceOf[Elem]
  }

  private def renderItemWithInfo(
      info: List[net.liftweb.common.Box[Function0[_]]],
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
        buildInnerTag(
          <xml:group>{ renderLinkWithTarget(item.uri, item.text, item.path, item.current, f ) }{ renderInner(item.kids) }</xml:group>,
          item.path,
          item.current)
      } else {
        //Unknown function value do the default thingy
        buildInnerTag(
          <xml:group>{renderLink(item.uri, item.text, item.path, item.current) }{ renderInner(item.kids) }</xml:group>,
          item.path,
          item.current)
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
            buildInnerTag(
              <xml:group>{ renderLink(item.uri, item.text, item.path, item.current) }{ renderInner(item.kids) }</xml:group>,
              item.path,
              item.current)
          }
          case Failure(message, _, _) => {
            //something got wrong
            buildInnerTag(
              <xml:group>{ renderLink(item.uri, item.text, item.path, item.current) }{ renderInner(item.kids) }</xml:group>,
              item.path,
              item.current)
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
        buildInnerTag(
          <xml:group>{ renderLink(item.uri, item.text, item.path, item.current) }{ renderInner(item.kids) }</xml:group>,
          item.path,
          item.current)
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

object Bs4NavLiList extends Bs4NavLiList
