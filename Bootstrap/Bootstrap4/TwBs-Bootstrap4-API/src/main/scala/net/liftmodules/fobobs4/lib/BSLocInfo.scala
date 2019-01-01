package net.liftmodules.fobobs4.lib

/**
  * Extends your Lift SiteMap with various common bootstrap menu manipulations such
  * as horizontal and vertical menu dividers and menu labels (labels coming soon).
  *
  * This object should be used in conjunction with the TB* menu builder objects in [[net.liftmodules.fobo.snippet.FoBo]] snippet's.
  *
  * @example
  * {{{
  *   :
  *  //add a horizontal menu divider
  *  divider1 >> LocGroup(...) >> fobobs.BsLocInfo.Divider,
  *   :
  *  //add a vertical menu divider
  *  divider2 >> LocGroup(...) >> fobobs.BsLocInfo.DividerVertical,
  *   :
  * }}}
  */
object BSLocInfo {
  import net.liftweb.common.{Box, Full}

  private val hd: Box[String] = Full("divider")
  private val vd: Box[String] = Full("divider-vertical")
  private val nh: Box[String] = Full("nav-header")

  private val ltb: Box[String] = Full("_blank")
  private val lts: Box[String] = Full("_self")
  private val ltp: Box[String] = Full("_parent")
  private val ltt: Box[String] = Full("_top")

  /**
    * Provides a way to specify a horizontal divider for your bootstrap menu in Lift's SiteMap.
    *
    * @example
    * {{{
    * val index            = Menu.i("Home") / "index"
    *      :
    * val about            = Menu.i("About") / "about"
    * val divider2         = Menu("divider2") / "divider2" //dummy entry only showing a menu divider
    * val navHeader1       = Menu.i("navHeader1") / "navHeader1" //Adds a header (label) to your FoBo.NavList
    *
    * def sitemap = SiteMap(
    *   navHeader1 >> LocGroup("nl1") >> fobobs.BSLocInfo.NavHeader,
    *   index >> LocGroup("top","nl1",...),
    *    :
    *   ddLabel >> LocGroup("top",...)  >> PlaceHolder submenus(
    *       about ,
    *       divider2 >> fobobs.BSLocInfo.Divider,
    *       contact,
    *       feedback
    *       )
    * )
    * }}}
    */
  val Divider = new net.liftweb.sitemap.Loc.LocInfo[String] {
    def apply() = hd.map(x => () => x)
  }

  /**
    * Add a vertical divider in your bootstrap menu.
    * For a usage example see the Divider val above.
    */
  val DividerVertical = new net.liftweb.sitemap.Loc.LocInfo[String] {
    def apply() = vd.map(x => () => x)
  }

  /**
    * Add nav header(s) to your bootstrap nav list.
    * For a usage example see the NavHeader val above.
    */
  val NavHeader = new net.liftweb.sitemap.Loc.LocInfo[String] {
    def apply() = nh.map(x => () => x)
  }

  /**
    * Adds target="_blank" to the link
    * @since v1.2
    */
  val LinkTargetBlank = new net.liftweb.sitemap.Loc.LocInfo[String] {
    def apply() = ltb.map(x => () => x)
  }

  /**
    * Adds target="_self" to the link
    * @since v1.2
    */
  val LinkTargetSelf = new net.liftweb.sitemap.Loc.LocInfo[String] {
    def apply() = lts.map(x => () => x)
  }

  /**
    * Adds target="_parent" to the link
    * @since v1.2
    */
  val LinkTargetParent = new net.liftweb.sitemap.Loc.LocInfo[String] {
    def apply() = ltp.map(x => () => x)
  }

  /**
    * Adds target="_top" to the link
    * @since v1.2
    */
  val LinkTargetTop = new net.liftweb.sitemap.Loc.LocInfo[String] {
    def apply() = ltt.map(x => () => x)
  }
}
