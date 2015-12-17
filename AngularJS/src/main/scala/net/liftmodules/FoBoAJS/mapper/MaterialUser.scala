package net.liftmodules.FoBoAJS.mapper

import net.liftmodules.FoBoAJS.lib.{AJSMaterialSH => msh}
import net.liftweb.http._
import js._
import JsCmds._
import net.liftweb.common._
import net.liftweb.proto.{ ProtoUser => GenProtoUser }
import scala.xml.{ NodeSeq, Node, Text, Elem, Attribute, Null }
import net.liftweb.mapper._
import net.liftweb.sitemap._
import net.liftweb.sitemap.Loc._
import net.liftweb.util._
import net.liftweb.util.Helpers._
import net.liftweb.util.Mailer._
import S._

/**
 * The MaterialMegaMetaProtoUser trait adds Material Design styling to the ProtoUser form views.
 * In addition it also contains some related Lift i18n localization to nodeSeq resource overrides 
 * to make it easy for users of this trait to customize submit button label, field legend, field label,  
 * field placeholder, lift messages and more. 
 * @since v1.5
 */
trait MaterialMegaMetaProtoUser[ModelType <: MegaProtoUser[ModelType]] extends KeyedMetaMapper[Long, ModelType] with GenProtoUser {
  self: ModelType =>

  private lazy val msh = new msh();
  private val logger = Logger(classOf[MaterialMegaMetaProtoUser[ModelType]])   
  //overriding lift-core i18 localization to add glyphicons to User menu entries (IF USER SETS fobo.xxx IN APP RESOURCE BUNDLE)  
  //with fallback back to the i18n lift-core localization properties 
  /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.menu.loc.sign.up'<br/>
   * <b>Corresponding Lift i18n key:</b> 'sign.up' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  override def createUserMenuLoc: Box[Menu] =
    Full(Menu(Loc("CreateUser" + menuNameSuffix, signUpPath, S.loc("fobo.menu.loc.sign.up", scala.xml.Text(S.?("sign.up"))), createUserMenuLocParams ::: globalUserLocParams)))
  /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.menu.loc.lost.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'lost.password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  override def lostPasswordMenuLoc: Box[Menu] =
    Full(Menu(Loc("LostPassword" + menuNameSuffix, lostPasswordPath, S.loc("fobo.menu.loc.lost.password", scala.xml.Text(S.?("lost.password"))), lostPasswordMenuLocParams ::: globalUserLocParams))) // not logged in
  /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.menu.loc.login'<br/>
   * <b>Corresponding Lift i18n key:</b> 'login' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  override def loginMenuLoc: Box[Menu] =
    Full(Menu(Loc("Login" + menuNameSuffix, loginPath, S.loc("fobo.menu.loc.login", scala.xml.Text(S.?("login"))), loginMenuLocParams ::: globalUserLocParams)))
  /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.menu.loc.logout'<br/>
   * <b>Corresponding Lift i18n key:</b> 'logout' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  override def logoutMenuLoc: Box[Menu] =
    Full(Menu(Loc("Logout" + menuNameSuffix, logoutPath, S.loc("fobo.menu.loc.logout", scala.xml.Text(S.?("logout"))), logoutMenuLocParams ::: globalUserLocParams)))
  /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.menu.loc.reset.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'reset.password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  override def resetPasswordMenuLoc: Box[Menu] =
    Full(Menu(Loc("ResetPassword" + menuNameSuffix, (passwordResetPath, true), S.loc("fobo.menu.loc.reset.password", scala.xml.Text(S.?("reset.password"))), resetPasswordMenuLocParams ::: globalUserLocParams))) //not Logged in
  /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.menu.loc.edit.user'<br/>
   * <b>Corresponding Lift i18n key:</b> 'edit.user' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  override def editUserMenuLoc: Box[Menu] =
    Full(Menu(Loc("EditUser" + menuNameSuffix, editPath, S.loc("fobo.menu.loc.edit.user", scala.xml.Text(S.?("edit.user"))), editUserMenuLocParams ::: globalUserLocParams)))
  /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.menu.loc.change.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'change.password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  override def changePasswordMenuLoc: Box[Menu] =
    Full(Menu(Loc("ChangePassword" + menuNameSuffix, changePasswordPath, S.loc("fobo.menu.loc.change.password", scala.xml.Text(S.?("change.password"))), changePasswordMenuLocParams ::: globalUserLocParams)))

  /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.Login.msg.notice.logged.in'<br/>
   * <b>Corresponding Lift i18n key:</b> 'logged.in' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  def resLoginMsgNoticeLogedIn: NodeSeq = S.loc("fobo.ProtoUser.Login.msg.notice.logged.in", scala.xml.Text(S.?("logged.in")))
  /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.Login.msg.error.account.validation'<br/>
   * <b>Corresponding Lift i18n key:</b> 'account.validation.error' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  def resLoginMsgErrorAcountValidation: NodeSeq = S.loc("fobo.ProtoUser.Login.msg.error.account.validation", scala.xml.Text(S.?("account.validation.error")))
  /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.Login.msg.error.invalid.credentials'<br/>
   * <b>Corresponding Lift i18n key:</b> 'invalid.credentials' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */    
  def resLoginMsgErrorInvalidCredetial: NodeSeq = S.loc("fobo.ProtoUser.Login.msg.error.invalid.credentials", scala.xml.Text(S.?("invalid.credentials")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.Login.legend'<br/>
   * <b>Corresponding Lift i18n key:</b> 'log.in' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */ 
  def resLoginLegendLogin: NodeSeq = S.loc("fobo.ProtoUser.Login.legend", scala.xml.Text(S.?("log.in")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.Login.label.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */ 
  def resLoginLabelPassword: NodeSeq = S.loc("fobo.ProtoUser.Login.label.password", scala.xml.Text(S.?("password")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.Login.placeholder.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */ 
  def resLoginPlaceholderPassword: NodeSeq = S.loc("fobo.ProtoUser.Login.placeholder.password", scala.xml.Text(S.?("password")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.Login.submit'<br/>
   * <b>Corresponding Lift i18n key:</b> 'log.in' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */ 
  def resLoginSubmit: NodeSeq = S.loc("fobo.ProtoUser.Login.submit", scala.xml.Text(S.?("log.in")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.Login.label.recover.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'recover.password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  def resLoginLabelRecoverPassword: NodeSeq = S.loc("fobo.ProtoUser.Login.label.recover.password", scala.xml.Text(S.?("recover.password")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.LostPassword.legend'<br/>
   * <b>Corresponding Lift i18n key:</b> 'enter.email' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */  
  def resLostPasswordLegendEnterEmail: NodeSeq = S.loc("fobo.ProtoUser.LostPassword.legend", scala.xml.Text(S.?("enter.email")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.LostPassword.label.userName'<br/>
   * <b>Corresponding Lift i18n key:</b> see 'userNameFieldString' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */ 
  def resLostPasswordLabelUserName: NodeSeq = S.loc("fobo.ProtoUser.LostPassword.label.userName", scala.xml.Text(userNameFieldString))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.LostPassword.placeholder.userName'<br/>
   * <b>Corresponding Lift i18n key:</b> see 'userNameFieldString' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  def resLostPasswordPlaceholderUserName: NodeSeq = S.loc("fobo.ProtoUser.LostPassword.placeholder.userName", scala.xml.Text(userNameFieldString))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.LostPassword.submit'<br/>
   * <b>Corresponding Lift i18n key:</b> 'send.it' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */ 
  def resLostPasswordSubmit: NodeSeq = S.loc("fobo.ProtoUser.LostPassword.submit", scala.xml.Text(S.?("send.it")))  
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.SignUp.label.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */ 
  def resSignUpLabelPassword = S.loc("fobo.ProtoUser.SignUp.label.password", scala.xml.Text(S.?("password")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.SignUp.label.repeat.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'repeat.password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  def resSignUpLabelRepeatPassword = S.loc("fobo.ProtoUser.SignUp.label.repeat.password", scala.xml.Text(S.?("repeat.password")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.SignUp.placeholder.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  def resSignUpPlaceholderPassword = S.loc("fobo.ProtoUser.SignUp.placeholder.password", scala.xml.Text(S.?("password")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.SignUp.placeholder.repeat.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'repeat.password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  def resSignUpPlaceholderRepeatPassword = S.loc("fobo.ProtoUser.SignUp.placeholder.repeat.password", scala.xml.Text(S.?("repeat.password")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.SignUp.submit'<br/>
   * <b>Corresponding Lift i18n key:</b> 'sign.up' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  def resSignUpSubmitSignUp: NodeSeq = S.loc("fobo.ProtoUser.SignUp.submit", scala.xml.Text(S.?("sign.up")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.SignUp.legend'<br/>
   * <b>Corresponding Lift i18n key:</b> 'sign.up' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  def resSignUpLegendSignUp: NodeSeq = S.loc("fobo.ProtoUser.SignUp.legend", scala.xml.Text(S.?("sign.up")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.Edit.submit'<br/>
   * <b>Corresponding Lift i18n key:</b> 'Save' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */  
  def resEditSubmitSave: NodeSeq = S.loc("fobo.ProtoUser.Edit.submit", scala.xml.Text(S.?("Save")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.Edit.legend'<br/>
   * <b>Corresponding Lift i18n key:</b> 'edit' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */ 
  def resEditLegendEdit = S.loc("fobo.ProtoUser.Edit.legend", scala.xml.Text(S.?("edit")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.ChangePassword.legend'<br/>
   * <b>Corresponding Lift i18n key:</b> 'change.password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */ 
  def resChangePasswordLegendChangePassword = S.loc("fobo.ProtoUser.ChangePassword.legend", scala.xml.Text(S.?("change.password")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.ChangePassword.label.old.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'old.password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */   
  def resChangePasswordLabelOldPassword = S.loc("fobo.ProtoUser.ChangePassword.label.old.password", scala.xml.Text(S.?("old.password")))
   /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.ChangePassword.label.new.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'new.password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  def resChangePasswordLabelNewPassword = S.loc("fobo.ProtoUser.ChangePassword.label.new.password", scala.xml.Text(S.?("new.password")))
    /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.ChangePassword.label.repeat.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'repeat.password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */ 
  def resChangePasswordLabelRepeatPassword = S.loc("fobo.ProtoUser.ChangePassword.label.repeat.password", scala.xml.Text(S.?("repeat.password")))
    /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.ChangePassword.placeholder.new.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'new.password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  def resChangePasswordPlaceholderNewPassword = S.loc("fobo.ProtoUser.ChangePassword.placeholder.new.password", scala.xml.Text(S.?("new.password"))).toString()
    /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.ChangePassword.placeholder.old.password'<br/>
   * <b>Corresponding Lift i18n key:</b> 'old.password' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  def resChangePasswordPlaceholderOldPassword = S.loc("fobo.ProtoUser.ChangePassword.placeholder.old.password", scala.xml.Text(S.?("old.password"))).toString() //S.?("old.password")
    /**
   * FoBo internationalization resource key for overriding the Lift i18n key.</br> 
   * 
   * <b>FoBo resource key:</b> 'fobo.ProtoUser.ChangePassword.submit'<br/>
   * <b>Corresponding Lift i18n key:</b> 'fobo.submit.password.change' -- If the FoBo resource key is not set this Lift i18n key value will be used.
   * 
   * If the FoBo resource key is set for the desired locale(s) in a localization resource file it will 
   * override lift's corresponding key value. If the key is present but the value is empty it will render empty.  
   */
  def resChangePasswordSubmitChange: NodeSeq = S.loc("fobo.ProtoUser.ChangePassword.submit", scala.xml.Text(S.?("change")))
  
  
  override def login = {
    if (S.post_?) {
      S.param("username").
        flatMap(username => findUserByUserName(username)) match {
          case Full(user) if user.validated_? &&
          user.testPassword(S.param("password")) => {
            val preLoginState = capturePreLoginState()
            val redir = loginRedirect.get match {
              case Full(url) =>
                loginRedirect(Empty)
                url
              case _ =>
                homePage
            }

            logUserIn(user, () => {
              S.notice(msh.mdToastWrapNSMsg(resLoginMsgNoticeLogedIn,theme="success-toast"))
              preLoginState()
              S.redirectTo(redir)
            })
          }

          case Full(user) if !user.validated_? =>
            S.error(msh.mdToastWrapNSMsg(resLoginMsgErrorAcountValidation,theme="error-toast"))

          case _ => S.error(msh.mdToastWrapNSMsg(resLoginMsgErrorInvalidCredetial,theme="error-toast"))
        }
    }
    
    loginXhtml
  }

  override def loginXhtml = {
    val emailElemId:String = "username" //nextFuncName
    S.appendJs(Focus(emailElemId))
      <md-content layout-padding="" class="autoScroll" >
        <form name="loginForm" role="form" action={ S.uri } method="post">
          <h1 class="md-title">{ resLoginLegendLogin }</h1>
          <md-input-container>
            <md-icon md-font-icon="fa fa-envelope" class="email"></md-icon>
            <input type="email" id={ emailElemId } name="username" placeholder={ userNameFieldString } ng-required="true"/>
          </md-input-container>
          <md-input-container>
            <md-icon md-font-icon="fa fa-key" class="password"></md-icon>
            <input type="password" id="password" name="password" placeholder={ resLoginPlaceholderPassword } ng-required="true"/>
          </md-input-container>
          <section layout="row" layout-sm="column" layout-align="left center" layout-wrap="">
            <md-button type="submit" class="md-raised md-primary">{ resLoginSubmit }</md-button>
            <md-button class="md-primary" href={ lostPasswordPath.mkString("/", "/", "") } >{ resLoginLabelRecoverPassword }</md-button>
          </section>
        </form>
        <div class="lift:Msgs?showAll=true"></div>
      </md-content>

  }

/*
    <form class="form-horizontal" role="form" action={ S.uri } method="post">
      <legend>{ resLoginLegendLogin }</legend>
      <div class="form-group">
        <label for="username" class="col-lg-3 control-label">{ userNameFieldString }</label>
        <div class="col-lg-9">
          <input type="email" class="form-control" id="username" name="username" placeholder={ userNameFieldString } autofocus="autofocus"/>
        </div>
      </div>
      <div class="form-group">
        <label for="password" class="col-lg-3 control-label">{ resLoginLabelPassword }</label>
        <div class="col-lg-9">
          <input type="password" class="form-control" id="password" name="password" placeholder={ resLoginPlaceholderPassword }/>
        </div>
      </div>
      <div class="form-group">
        <div class="col-lg-offset-3 col-lg-10">
          <button type="submit" class="btn btn-default">{ resLoginSubmit }</button><span> <a href={ lostPasswordPath.mkString("/", "/", "") }>{ resLoginLabelRecoverPassword }</a></span>
        </div>
      </div>
    </form>
*/
 
    
  override def lostPassword = {
    ("type=email" #> SHtml.text("", sendPasswordReset _)).apply(lostPasswordXhtml)
  }

  override def sendPasswordReset(email: String) {
    findUserByUserName(email) match {
      case Full(user) if user.validated_? =>
        user.resetUniqueId().save
        val resetLink = S.hostAndPath +
          passwordResetPath.mkString("/", "/", "/") + urlEncode(user.getUniqueId())

        val email: String = user.getEmail

        Mailer.sendMail(From(emailFrom), Subject(passwordResetEmailSubject),
          (To(user.getEmail) ::
            generateResetEmailBodies(user, resetLink) :::
            (bccEmail.toList.map(BCC(_)))): _*)

        S.notice(msh.mdToastWrapMsg(S.?("password.reset.email.sent"),theme="success-toast"))
        S.redirectTo(homePage)

      case Full(user) =>
        sendValidationEmail(user)
        S.notice(msh.mdToastWrapMsg(S.?("account.validation.resent"),theme="success-toast"))
        S.redirectTo(homePage)

      case _ => S.error(msh.mdToastWrapMsg(userNameNotFoundString,theme="error-toast"))
    }
  }

   /**
   * Send validation email to the user.  The XHTML version of the mail
   * body is generated by calling signupMailBody.  You can customize the
   * mail sent to users by override generateValidationEmailBodies to
   * send non-HTML mail or alternative mail bodies.
   */
  override def sendValidationEmail(user: TheUserType) {
    val resetLink = S.hostAndPath+"/"+validateUserPath.mkString("/")+
    "/"+urlEncode(user.getUniqueId())
    
    val email: String = user.getEmail

    val msgXml = signupMailBody(user, resetLink)

    Mailer.sendMail(From(emailFrom),Subject(signupMailSubject),
                    (To(user.getEmail) :: 
                     generateValidationEmailBodies(user, resetLink) :::
                     (bccEmail.toList.map(BCC(_)))) :_* )
  }
  
//    /**
//   * The LocParams for the menu item for resetting the password.
//   * Overwrite in order to add custom LocParams. Attention: Not calling super will change the default behavior!
//   */
//  override protected def resetPasswordMenuLocParams: List[LocParam[Unit]] =
//    Hidden ::
//    Template(() => wrapIt(passwordReset(snarfLastItem))) ::
//    If(notLoggedIn_? _, S.?("logout.first")) ::
//    Nil
    
    
  
  override def lostPasswordXhtml = {      
    
    <md-content layout-padding="" class="autoScroll" >
       <form role="form" action={ S.uri } method="post">
         <h1 class="md-title">{ resLostPasswordLegendEnterEmail }</h1>
         <md-input-container>
           <md-icon md-font-icon="fa fa-envelope" class="email"></md-icon>
           <input type="email" id="username" name="username" placeholder={ resLostPasswordPlaceholderUserName } ng-required="true"/>
         </md-input-container> 
         <section layout="row" layout-sm="column" layout-align="left center" layout-wrap="">
           <md-button type="submit" class="md-raised md-primary">{ resLostPasswordSubmit }</md-button>
         </section>
       </form>
     </md-content>
  }
  
  /*
    (<form class="form-horizontal" role="form" action={ S.uri } method="post">
       <legend>{ resLostPasswordLegendEnterEmail }</legend>
       <div class="form-group">
         <label for="username" class="col-lg-3 control-label">{ resLostPasswordLabelUserName }</label>
         <div class="col-lg-9">
           <input type="email" class="form-control" id="username" name="username" placeholder={ resLostPasswordPlaceholderUserName } autofocus="autofocus"/>
         </div>
       </div>
       <div class="form-group">
         <div class="col-lg-offset-3 col-lg-10">
           <button type="submit" class="btn btn-default">{ resLostPasswordSubmit }</button>
         </div>
       </div>
     </form>)
   */

  
  //problem styling select https://www.google.se/search?client=ubuntu&channel=fs&q=select+and+md-select+angular+material&ie=utf-8&oe=utf-8&gfe_rd=cr&ei=hB_sVbq3L4yA8QeP1ZuYCQ
  //idea set a class "signup" and use it to style like a md-select if possible.
  override protected def localForm(user: TheUserType, ignorePassword: Boolean, fields: List[FieldPointerType]): NodeSeq = {
    for {
      pointer <- fields
      field <- computeFieldFromPointer(user, pointer).toList
      if field.show_? && (!ignorePassword || !pointer.isPasswordField_?)
      form <- field.toForm.toList
    } yield {

      //This is a bit of a hack (relatively safe though), as I could not find a way to properly override the field's 
      //_toForm functions especially I tried to override the _toForm for local and timezone with no luck. 
      if (!field.name.equals("password") && !field.name.equals("locale") && !field.name.equals("timezone")) {
        val bindAttrToForm = 
            "input [class]" #> "" &
            "select [class]" #> "signup" 
        val bsform = bindAttrToForm(form)
        <md-input-container class="md-block" flex-gt-sm="">
          <label for={ field.name } >{ field.displayName }</label>
          { bsform }
        </md-input-container>
      }else if(field.name.equals("locale") || field.name.equals("timezone")){
           val bindAttrToForm = 
          "input [class]" #> "" &
          "select [class]" #> "signup" 
        val bsform = bindAttrToForm(form)
        <md-input-container class="md-block" flex-gt-sm="">
          <div class="label" for={ field.fieldId.getOrElse("").toString() } >{ field.displayName }</div>
          { bsform }
        </md-input-container>
      } else {
        val (pwd, pwdr) = extractLocalFormPasswordField(form, field)    
        <div>
        <md-input-container flex-gt-sm="">
          <label for={ field.name } class="">{ resSignUpLabelPassword }</label>
          { pwd }          
        </md-input-container>    
        <md-input-container flex-gt-sm="">
          <label for={ field.name } class="">{ resSignUpLabelRepeatPassword }</label>
          { pwdr }
        </md-input-container> 
        </div>
      }
    }
  }
  
  /*
  override protected def localForm(user: TheUserType, ignorePassword: Boolean, fields: List[FieldPointerType]): NodeSeq = {
    for {
      pointer <- fields
      field <- computeFieldFromPointer(user, pointer).toList
      if field.show_? && (!ignorePassword || !pointer.isPasswordField_?)
      form <- field.toForm.toList
    } yield {
      //This is a bit of a hack (relatively safe though), as I could not find a way to properly override the field's 
      //_toForm functions especially I tried to override the _toForm for local and timezone with no luck. 
      if (!field.name.equals("password")) {
        val bindAttrToForm = 
          "input [class]" #> "form-control" &
          "select [class]" #> "form-control"
        val bsform = bindAttrToForm(form)
        <div class="form-group">
          <label for={ field.name } class="col-lg-3 control-label">{ field.displayName }</label>
          <div class="col-lg-9">
            { bsform }
          </div>
        </div>
      } else {
        val (pwd, pwdr) = extractLocalFormPasswordField(form, field)
        <div class="form-group row">
          <label for={ field.name } class="control-label col-lg-3">{ resSignUpLabelPassword }</label>
          <div class="col-lg-3">
            { pwd }
          </div>
          <label for={ field.name } class="control-label col-lg-3">{ resSignUpLabelRepeatPassword }</label>
          <div class="col-lg-3">
            { pwdr }
          </div>
        </div>
      }
    }
  }  
*/  
  
  //This is a bit of a hack, as I could not find a proper way to properly override the signupFields _toForm functions   
  protected def extractLocalFormPasswordField(form: NodeSeq, field: BaseField): (NodeSeq, NodeSeq) = {
    val pwInputElems = form \ "input"
    val bindAttrToPwInputElems =  "input [class]" #> "form-control"
    val bsPwInputElems = bindAttrToPwInputElems(pwInputElems)
    val pw1 = bsPwInputElems.head
    val bindAttrToPw1 = 
      "input [placeholder]" #> resSignUpPlaceholderPassword & 
            "input [value]" #> "" 
    val pwd = bindAttrToPw1(pw1)
    val pw2 = bsPwInputElems.last
    val bindAttrToPw2 = 
      "input [placeholder]" #> resSignUpPlaceholderRepeatPassword & 
            "input [value]" #> "" 
    val pwdr = bindAttrToPw2(pw2)
    (pwd, pwdr)
  }

  override def signup = {
    val theUser: TheUserType = mutateUserOnSignup(createNewUserInstance())
    val theName = signUpPath.mkString("")
    val submitAttr: Seq[SHtml.ElemAttr] = Seq("class" -> "md-raised md-primary md-button md-default-theme")
    
    def testSignup() {
      validateSignup(theUser) match {
        case Nil =>
          actionsAfterSignup(theUser, () => S.redirectTo(homePage))

        case xs => S.error(msh.mdToastWrapFEMsg(xs,theme="error-toast")); signupFunc(Full(innerSignup _))
      }
    }
    
    def innerSignup = {
      ("type=submit" #> signupSubmitButton(resSignUpSubmitSignUp, testSignup _, submitAttr: _*)) apply signupXhtml(theUser)
    }      
    innerSignup
  }

  protected def signupSubmitButton(name: StringOrNodeSeq, func: () => Any, attrs: SHtml.ElemAttr*): NodeSeq = {
    inputSubmitButtonWithAttribs(name, func, attrs: _*)
  }

  override def signupXhtml(user: TheUserType) = {
    (<md-content layout-padding="" class="autoScroll" >
        <form role="form" action={ S.uri } method="post">
       <h1 class="md-title">{ resSignUpLegendSignUp }</h1>
       { localForm(user, false, signupFields) }
        <section layout="row" layout-sm="column" layout-align="left center" layout-wrap="">
        <md-button type="submit" ></md-button>
        </section>
     </form>
    </md-content>
    )
  }

  override def edit = {
    val theUser: TheUserType = mutateUserOnEdit(currentUser.openOrThrowException("we know we're logged in"))
    val theName = editPath.mkString("")
    val submitAttr: Seq[SHtml.ElemAttr] = Seq("class" -> "md-raised md-primary md-button md-default-theme")
 
    def testEdit() {
      theUser.validate match {
        case Nil =>
          theUser.save
          S.notice(msh.mdToastWrapMsg(S.?("profile.updated"),theme="success-toast"))
          S.redirectTo(homePage)

        case xs => S.error(msh.mdToastWrapFEMsg(xs,theme="error-toast")); editFunc(Full(innerEdit _))
      }
    }
 
    def innerEdit = {
      ("type=submit" #> editSubmitButton(resEditSubmitSave, testEdit _, submitAttr: _*)) apply editXhtml(theUser)
    }
      
    innerEdit
  }

  protected def editSubmitButton(name: StringOrNodeSeq, func: () => Any, attrs: SHtml.ElemAttr*): NodeSeq = {
    inputSubmitButtonWithAttribs(name, func, attrs: _*)
  }

/*
    (<md-content layout-padding="" class="autoScroll" >
        <form role="form" action={ S.uri } method="post">
       <h1 class="md-title">{ resSignUpLegendSignUp }</h1>
       { localForm(user, false, signupFields) }
        <section layout="row" layout-sm="column" layout-align="left center" layout-wrap="">
        <md-button type="submit" ></md-button>
        </section>
     </form>
    </md-content>
    )  
 */
  
  override def editXhtml(user: TheUserType) = {
    
    (<md-content layout-padding="">
       <form role="form" action={ S.uri } method="post">
       <h1 class="md-title">{ resEditLegendEdit }</h1>
       { localForm(user, false, editFields) }
        <section layout="row" layout-sm="column" layout-align="left center" layout-wrap="">
          <md-button type="submit" ></md-button>
        </section>       
       </form>
     </md-content>)
  }
  
  override def changePasswordXhtml = {
    
    (<md-content layout-padding="">
       <form role="form" method="post" action={ S.uri }>
       <h1 class="md-title">{ resChangePasswordLegendChangePassword }</h1>
       <md-input-container>
         <md-icon md-font-icon="fa fa-key" class="password"></md-icon>
         <input type="password" id="oldpassword" class="old-password" placeholder={resChangePasswordPlaceholderOldPassword} ng-required="true"/>
       </md-input-container>
       <md-input-container>
         <md-icon md-font-icon="fa fa-key" class="password"></md-icon>
         <input type="password" id="newpassword" class="new-password" placeholder={resChangePasswordPlaceholderNewPassword} ng-required="true"/>
       </md-input-container> 
       <md-input-container>
         <md-icon md-font-icon="fa fa-key" class="password"></md-icon>
         <input type="password" id="repeatpassword" class="new-password" placeholder={resChangePasswordPlaceholderNewPassword} ng-required="true"/>
       </md-input-container> 
       <section layout="row" layout-sm="column" layout-align="left center" layout-wrap="">
          <md-button type="submit" ></md-button>
       </section> 
       </form>
     </md-content>)
    
/*    (<form class="form-horizontal" role="form" method="post" action={ S.uri }>
       <legend>{ resChangePasswordLegendChangePassword }</legend>
       <div class="form-group">
         <label for="oldpassword" class="col-lg-3 control-label">{ resChangePasswordLabelOldPassword }</label>
         <div class="col-lg-9">
           <input type="password" class="old-password form-control" placeholder={resChangePasswordPlaceholderOldPassword} />
         </div>
       </div>
       <div class="form-group">
         <label for="newpassword" class="col-lg-3 control-label">{ resChangePasswordLabelNewPassword }</label>
         <div class="col-lg-9">
           <input type="password" class="new-password form-control" placeholder={resChangePasswordPlaceholderNewPassword}/>
         </div>
       </div>
       <div class="form-group">
         <label for="repeatpassword" class="col-lg-3 control-label">{ resChangePasswordLabelRepeatPassword }</label>
         <div class="col-lg-9">
           <input type="password" class="new-password form-control" placeholder={resChangePasswordPlaceholderNewPassword}/>
         </div>
       </div>
       <div class="form-group">
         <div class="col-lg-offset-3 col-lg-10">
           <input type="submit" class="btn btn-default"/>
         </div>
       </div>
     </form>) */
  }
  
/*
  override def editXhtml(user: TheUserType) = {
    (<form class="form-horizontal" role="form" method="post" action={ S.uri }>
       <legend>{ resEditLegendEdit }</legend>
       { localForm(user, true, editFields) }
       <div class="form-group">
         <div class="col-lg-offset-3 col-lg-10">
           <input type="submit" />
         </div>
       </div>
     </form>)
  }
  
   override def changePasswordXhtml = {
    (<form class="form-horizontal" role="form" method="post" action={ S.uri }>
       <legend>{ resChangePasswordLegendChangePassword }</legend>
       <div class="form-group">
         <label for="oldpassword" class="col-lg-3 control-label">{ resChangePasswordLabelOldPassword }</label>
         <div class="col-lg-9">
           <input type="password" class="old-password form-control" placeholder={resChangePasswordPlaceholderOldPassword} />
         </div>
       </div>
       <div class="form-group">
         <label for="newpassword" class="col-lg-3 control-label">{ resChangePasswordLabelNewPassword }</label>
         <div class="col-lg-9">
           <input type="password" class="new-password form-control" placeholder={resChangePasswordPlaceholderNewPassword}/>
         </div>
       </div>
       <div class="form-group">
         <label for="repeatpassword" class="col-lg-3 control-label">{ resChangePasswordLabelRepeatPassword }</label>
         <div class="col-lg-9">
           <input type="password" class="new-password form-control" placeholder={resChangePasswordPlaceholderNewPassword}/>
         </div>
       </div>
       <div class="form-group">
         <div class="col-lg-offset-3 col-lg-10">
           <input type="submit" class="btn btn-default"/>
         </div>
       </div>
     </form>) 
  }  
 */

  
  
  override def changePassword = {
    val user = currentUser.openOrThrowException("we can do this because the logged in test has happened")
    var oldPassword = ""
    var newPassword: List[String] = Nil   

    def testAndSet() {
      //logger.info("changePassword::testAndSet oldPassword="+oldPassword+" newPassword="+newPassword.toString)
      if (!user.testPassword(Full(oldPassword))) S.error(msh.mdToastWrapMsg(S.?("wrong.old.password"),theme="error-toast"))
      else {
        user.setPasswordFromListString(newPassword)
        user.validate match {
          case Nil => user.save; S.notice(msh.mdToastWrapMsg(S.?("password.changed"),theme="success-toast")); S.redirectTo(homePage)
          case xs => S.error(msh.mdToastWrapFEMsg(xs,theme="error-toast"))
        }
      }
    }
    
    val bind = {
      // Use the same password input for both new password fields.
      val passwordInput = SHtml.password_*("", LFuncHolder(s => newPassword = s))      
      val submitAttr: Seq[SHtml.ElemAttr] = Seq("class" -> "md-raised md-primary md-button md-default-theme")
      
      ".old-password" #> SHtml.password("", s => oldPassword = s) &
      ".new-password" #> passwordInput &
      "type=submit" #> myChangePasswordSubmitButton(resEditSubmitSave, testAndSet _, submitAttr: _*)
      
    } 
    bind(changePasswordXhtml)
  }
  
  def myChangePasswordSubmitButton(name: StringOrNodeSeq, func: () => Any, attrs: SHtml.ElemAttr*): NodeSeq = {
    inputSubmitButtonWithAttribs(name, func, attrs: _*)
  }
  
  protected def inputSubmitButtonWithAttribs(name: StringOrNodeSeq, func: () => Any, attrs: SHtml.ElemAttr*) = {
    SHtml.button(name, func, attrs: _*)
  }

}
