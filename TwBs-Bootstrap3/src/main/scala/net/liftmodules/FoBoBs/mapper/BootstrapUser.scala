package net.liftmodules.FoBoBs.mapper

import net.liftweb.http._
import net.liftweb.common._
import net.liftweb.proto.{ProtoUser => GenProtoUser}
import scala.xml.{NodeSeq, Node, Text, Elem, Attribute, Null}
import net.liftweb.mapper._
import net.liftweb.sitemap._
import net.liftweb.sitemap.Loc._
import net.liftweb.util._
import net.liftweb.util.Helpers._
import net.liftweb.util.Mailer._
import S._


trait BootstrapMegaMetaProtoUser[ModelType <: MegaProtoUser[ModelType]] extends KeyedMetaMapper[Long, ModelType] with GenProtoUser {
  self: ModelType =>

  //overriding lift-core i18 localization to add glyphicons to User menu entries (IF USER SETS fobo.xxx IN APP RESOURCE BUNDLE)  
  //with fallback back to the i18n lift-core localization properties 
  override def createUserMenuLoc: Box[Menu] =
    Full(Menu(Loc("CreateUser" + menuNameSuffix, signUpPath, S.loc("fobo.menu.loc.sign.up", scala.xml.Text(S.?("sign.up"))), createUserMenuLocParams ::: globalUserLocParams)))
  override def lostPasswordMenuLoc: Box[Menu] =
    Full(Menu(Loc("LostPassword" + menuNameSuffix, lostPasswordPath, S.loc("fobo.menu.loc.lost.password", scala.xml.Text(S.?("lost.password"))), lostPasswordMenuLocParams ::: globalUserLocParams))) // not logged in
  override def loginMenuLoc: Box[Menu] =
    Full(Menu(Loc("Login" + menuNameSuffix, loginPath, S.loc("fobo.menu.loc.login", scala.xml.Text(S.?("login"))), loginMenuLocParams ::: globalUserLocParams)))
  override def logoutMenuLoc: Box[Menu] =
    Full(Menu(Loc("Logout" + menuNameSuffix, logoutPath, S.loc("fobo.menu.loc.logout", scala.xml.Text(S.?("logout"))), logoutMenuLocParams ::: globalUserLocParams)))
  override def resetPasswordMenuLoc: Box[Menu] =
    Full(Menu(Loc("ResetPassword" + menuNameSuffix, (passwordResetPath, true), S.loc("fobo.menu.loc.reset.password", scala.xml.Text(S.?("reset.password"))), resetPasswordMenuLocParams ::: globalUserLocParams))) //not Logged in
  override def editUserMenuLoc: Box[Menu] =
    Full(Menu(Loc("EditUser" + menuNameSuffix, editPath, S.loc("fobo.menu.loc.edit.user", scala.xml.Text(S.?("edit.user"))), editUserMenuLocParams ::: globalUserLocParams)))
  override def changePasswordMenuLoc: Box[Menu] =
    Full(Menu(Loc("ChangePassword" + menuNameSuffix, changePasswordPath, S.loc("fobo.menu.loc.change.password", scala.xml.Text(S.?("change.password"))), changePasswordMenuLocParams ::: globalUserLocParams)))  
  
  override def login = {
    val resMsgNoticeLogedIn: NodeSeq = S.loc("fobo.msg.notice.logged.in" , scala.xml.Text(S.?("logged.in")))
    val resMsgErrorAcountValidation: NodeSeq = S.loc("fobo.msg.error.account.validation" , scala.xml.Text(S.?("account.validation.error")))
    val resMsgErrorInvalidCredetial: NodeSeq = S.loc("fobo.msg.error.invalid.credentials" , scala.xml.Text(S.?("invalid.credentials")))
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
              S.notice(resMsgNoticeLogedIn)

              preLoginState()

              S.redirectTo(redir)
            })
          }

        case Full(user) if !user.validated_? =>
          S.error(resMsgErrorAcountValidation)

        case _ => S.error(resMsgErrorInvalidCredetial)
      }
    }
    loginXhtml
  }
   
  override def loginXhtml = {
    val resLegendLogin: NodeSeq = S.loc("fobo.legend.login" , scala.xml.Text(S.?("log.in")))
    val resLabelLoginPassword: NodeSeq = S.loc("fobo.label.login.password" , scala.xml.Text(S.?("password")))
    val resPlaceholderLoginPassword: NodeSeq = S.loc("fobo.placeholder.login.password" , scala.xml.Text(S.?("password")))
    val resSubmitLogin: NodeSeq = S.loc("fobo.submit.log.in" , scala.xml.Text(S.?("log.in")))
    val resLabelRecoverPassword: NodeSeq = S.loc("fobo.label.login.recover.password" , scala.xml.Text(S.?("recover.password")))
     <form class="form-horizontal" role="form" action={S.uri} method="post">
       <legend>{resLegendLogin}</legend>
      <div class="form-group">
        <label for="username" class="col-lg-3 control-label">{userNameFieldString}</label>
        <div class="col-lg-9">
          <input type="email" class="form-control" id="username" name="username" placeholder={userNameFieldString} autofocus="autofocus" />
        </div>
      </div>
      <div class="form-group">
        <label for="password" class="col-lg-3 control-label">{resLabelLoginPassword}</label>
        <div class="col-lg-9">
          <input type="password" class="form-control" id="password" name="password" placeholder={resPlaceholderLoginPassword} />
        </div>
      </div>
      <div class="form-group">
        <div class="col-lg-offset-3 col-lg-10">
          <button type="submit" class="btn btn-default">{resSubmitLogin}</button> <span> <a href={lostPasswordPath.mkString("/", "/", "")}>{resLabelRecoverPassword}</a></span>
        </div>
      </div>
    </form>
  }
 
  override def lostPassword = {
    ("type=email" #> SHtml.text("", sendPasswordReset _) ).apply(lostPasswordXhtml)     
  }
  
  override def sendPasswordReset(email: String) {
    findUserByUserName(email) match {
      case Full(user) if user.validated_? =>
        user.resetUniqueId().save
        val resetLink = S.hostAndPath+
        passwordResetPath.mkString("/", "/", "/")+urlEncode(user.getUniqueId())

        val email: String = user.getEmail

        Mailer.sendMail(From(emailFrom),Subject(passwordResetEmailSubject),
                        (To(user.getEmail) ::
                         generateResetEmailBodies(user, resetLink) :::
                         (bccEmail.toList.map(BCC(_)))) :_*)

        S.notice(S.?("password.reset.email.sent"))
        S.redirectTo(homePage)

      case Full(user) =>
        sendValidationEmail(user)
        S.notice(S.?("account.validation.resent"))
        S.redirectTo(homePage)

      case _ => S.error(userNameNotFoundString)
    }
  }  
  
  override def lostPasswordXhtml = {
    val resLegendEnterEmail: NodeSeq = S.loc("fobo.legend.enter.email" , scala.xml.Text(S.?("enter.email")))
    val reslabelUserNameField: NodeSeq = S.loc("fobo.label.userNameFieldString" , scala.xml.Text(userNameFieldString))
    val resPlaceholderUserNameField: NodeSeq = S.loc("fobo.placeholder.userNameFieldString" , scala.xml.Text(userNameFieldString))
    val resSubmitSendIt: NodeSeq = S.loc("fobo.submit.send.it" , scala.xml.Text(S.?("send.it")))
    (<form class="form-horizontal" role="form" action={S.uri} method="post">
      <legend>{resLegendEnterEmail}</legend>
      <div class="form-group">
        <label for="username" class="col-lg-3 control-label">{reslabelUserNameField}</label>
        <div class="col-lg-9">
          <input type="email" class="form-control" id="username" name="username" placeholder={resPlaceholderUserNameField} autofocus="autofocus" />
        </div>
      </div>
      <div class="form-group">
        <div class="col-lg-offset-3 col-lg-10">
          <button type="submit" class="btn btn-default">{resSubmitSendIt}</button> 
        </div>
      </div>
     </form>)
  }
  
  override protected def localForm(user: TheUserType, ignorePassword: Boolean, fields: List[FieldPointerType]): NodeSeq = {
    for {
      pointer <- fields
      field <- computeFieldFromPointer(user, pointer).toList
      if field.show_? && (!ignorePassword || !pointer.isPasswordField_?)
      form <- field.toForm.toList
    } yield { 
      //This is a bit of a hack, as I could not find a way to properly override the field's _toForm functions  
      //especially I tried to override the _toForm for local and timezone with no luck.       
      if(!field.name.equals("password")){
        val bsform = BindHelpers.addAttributes(form, "class" -> "form-control")
        <div class="form-group">
          <label for={field.name} class="col-lg-3 control-label">{field.displayName}</label>
          <div class="col-lg-9">
            {bsform}
          </div>
        </div>
      }else{ 
        val (pwd,pwdr) = extractLocalFormPasswordField(form,field) 
        val resLabelSignUpPassword = S.loc("fobo.label.singn.up.password", scala.xml.Text(field.displayName))
        val resLabelSignUpRepeatPassword = S.loc("fobo.label.singn.up.repeat.password", scala.xml.Text(S.?("repeat.password")))        
        <div class="form-group row">
          <label for={field.name} class="control-label col-lg-3">{resLabelSignUpPassword}</label>
          <div class="col-lg-3">
            {pwd}
          </div>
          <label for={field.name} class="control-label col-lg-3">{resLabelSignUpRepeatPassword}</label>      
          <div class="col-lg-3">
            {pwdr}
          </div>
        </div>
      }
    }
  }
  
  //This is a hack, as I could not find a way to properly override the signupFields _toForm functions   
  protected def extractLocalFormPasswordField(form: NodeSeq, field: BaseField): (NodeSeq, NodeSeq) = {

    val resPlaceholderSignUpPassword = S.loc("fobo.placeholder.singn.up.password", scala.xml.Text(S.?("password")))
    val resPlaceholderSignUpRepeatPassword = S.loc("fobo.placeholder.singn.up.repeat.password", scala.xml.Text(S.?("repeat.password")))
    val pwdAttr: scala.xml.MetaData =  "class" -> "form-control"
    
    val pwInputElems = form \ "input"
    val bsPwInputElems = BindHelpers.addAttributes(pwInputElems, pwdAttr)

    val pw1 = bsPwInputElems.head
    val pw1a1 = BindHelpers.addAttributes(pw1, "placeholder" -> resPlaceholderSignUpPassword)
    val pwd = BindHelpers.addAttributes(pw1a1, "value" -> "")

    val pw2 = bsPwInputElems.last
    val pw2a1 = BindHelpers.addAttributes(pw2, "placeholder" -> resPlaceholderSignUpRepeatPassword)
    val pwdr = BindHelpers.addAttributes(pw2a1, "value" -> "")

    (pwd, pwdr)
  }
  
  override def signup = {
    val theUser: TheUserType = mutateUserOnSignup(createNewUserInstance())
    val theName = signUpPath.mkString("")
    val submitAttr: Seq[SHtml.ElemAttr] =  Seq("class" -> "btn btn-default")
    val i18nSubmitLabel = S.?("sign.up")
    val resSubmitSignUp: NodeSeq = S.loc("fobo.submit.sign.up" , scala.xml.Text(i18nSubmitLabel))    
    
    def testSignup() {
      validateSignup(theUser) match {
        case Nil =>
          actionsAfterSignup(theUser, () => S.redirectTo(homePage))

        case xs => S.error(xs) ; signupFunc(Full(innerSignup _))
      }
    }

    def innerSignup = bind("user",
         signupXhtml(theUser), 
         "submit" -> signupSubmitButton(resSubmitSignUp, testSignup _ ,submitAttr: _*))
    innerSignup  
  }  
  
  protected def signupSubmitButton(name: StringOrNodeSeq, func: () => Any, attrs: SHtml.ElemAttr*): NodeSeq = {
    inputSubmitButtonWithAttribs(name, func, attrs: _*)
  }
  
   override def signupXhtml(user: TheUserType) = {
     val resLegendSignUp: NodeSeq = S.loc("fobo.legend.sign.up" , scala.xml.Text(S.?("sign.up")))
     (<form class="form-horizontal" role="form" action={S.uri} method="post">
        <legend>{resLegendSignUp}</legend>
          {localForm(user, false, signupFields)}   
        <div class="form-group">
          <div class="col-lg-offset-3 col-lg-10">
            <user:submit/>
          </div>
        </div>
      </form>)    
  } 

  override def edit = {
    val theUser: TheUserType = mutateUserOnEdit(currentUser.openOrThrowException("we know we're logged in"))
    val theName = editPath.mkString("")
    val submitAttr: Seq[SHtml.ElemAttr] =  Seq("class" -> "btn btn-default")
    val i18nSubmitLabel = S.?("Save")
    val resSubmitEditSave: NodeSeq = S.loc("fobo.submit.edit.save" , scala.xml.Text(i18nSubmitLabel))
    
    def testEdit() {
      theUser.validate match {
        case Nil =>
          theUser.save
          S.notice(S.?("profile.updated"))
          S.redirectTo(homePage)

        case xs => S.error(xs) ; editFunc(Full(innerEdit _))
      }
    }

    def innerEdit = bind("user", editXhtml(theUser),
      "submit" -> editSubmitButton(resSubmitEditSave, testEdit _ ,submitAttr: _*)
      )
    innerEdit
  }  
  
  protected def editSubmitButton(name: StringOrNodeSeq, func: () => Any, attrs: SHtml.ElemAttr*): NodeSeq = {
    inputSubmitButtonWithAttribs(name, func, attrs: _*)
  }  
   
  override def editXhtml(user: TheUserType) = {
    val resLegendEdit = S.loc("fobo.legend.edit" , scala.xml.Text(S.?("edit")))
    (<form class="form-horizontal" role="form" method="post" action={S.uri}>
      <legend>{resLegendEdit}</legend>
          {localForm(user, true, editFields)}
      <div class="form-group">
        <div class="col-lg-offset-3 col-lg-10">
          <user:submit/>
        </div>
      </div>
     </form>)
  } 
  
  override def changePasswordXhtml = {
    val resLegendChangePassword = S.loc("fobo.change.password.legend" , scala.xml.Text(S.?("change.password")))
    val resLabelChangeOldPassword = S.loc("fobo.old.password.label" , scala.xml.Text(S.?("old.password")))
    val resLabelChangeNewPassword = S.loc("fobo.new.password.label" , scala.xml.Text(S.?("new.password")))
    val resLabelChangeRepeatPassword = S.loc("fobo.repeat.password.legend" , scala.xml.Text(S.?("repeat.password")))
    (<form class="form-horizontal" role="form" method="post" action={S.uri}>
       <legend>{resLegendChangePassword}</legend>
       <div class="form-group">
         <label for="oldpassword" class="col-lg-3 control-label">{resLabelChangeOldPassword}</label>
         <div class="col-lg-9">
           <user:old_pwd />
         </div>
       </div>
       <div class="form-group">
         <label for="newpassword" class="col-lg-3 control-label">{resLabelChangeNewPassword}</label>
         <div class="col-lg-9">
           <user:new_pwd />
         </div>
       </div>
       <div class="form-group">
         <label for="repeatpassword" class="col-lg-3 control-label">{resLabelChangeRepeatPassword}</label>
         <div class="col-lg-9">
           <user:new_pwd />
         </div>
       </div>
      <div class="form-group">
        <div class="col-lg-offset-3 col-lg-10">
          <user:submit />
        </div>
      </div>
     </form>)
  }  
   
  override def changePassword = {
    val user = currentUser.openOrThrowException("we can do this because the logged in test has happened")
    var oldPassword = ""
    var newPassword: List[String] = Nil
    
    val resPlaceholderChangeNewPassword = S.loc("fobo.placeholder.new.password" ,scala.xml.Text(S.?("new.password"))).toString()
    val resPlaceholderChangeOldPassword = S.loc("fobo.placeholder.old.password" ,scala.xml.Text(S.?("old.password"))).toString() //S.?("old.password")
    val oldPwAttr: Seq[SHtml.ElemAttr] =  Seq("class" -> "form-control", "placeholder" -> resPlaceholderChangeOldPassword,"autofocus" -> "autofocus")
    val newPwAttr: Seq[SHtml.ElemAttr] =  Seq("class" -> "form-control", "placeholder" -> resPlaceholderChangeNewPassword)
    val submitAttr: Seq[SHtml.ElemAttr] =  Seq("class" -> "btn btn-default")
    val i18nSubmitLabel = S.?("change")
    val resSubmitPasswordChange: NodeSeq = S.loc("fobo.submit.password.change" , scala.xml.Text(i18nSubmitLabel))    
    
    def testAndSet() {
      if (!user.testPassword(Full(oldPassword))) S.error(S.?("wrong.old.password"))
      else {
        user.setPasswordFromListString(newPassword)
        user.validate match {
          case Nil => user.save; S.notice(S.?("password.changed")); S.redirectTo(homePage)
          case xs => S.error(xs)
        }
      }
    }

    bind("user", changePasswordXhtml,
         "old_pwd" -> SHtml.password("", s => oldPassword = s, oldPwAttr: _* ),
         "new_pwd" -> SHtml.password_*("", LFuncHolder(s => newPassword = s), newPwAttr: _* ),
         "submit" -> changePasswordSubmitButton(resSubmitPasswordChange, testAndSet _ ,submitAttr: _* )
         /*"submit" -> transformInputSubmitToButton(changePasswordSubmitButton(i18nSubmitLabel, testAndSet _ ,submitAttr: _* ),resSubmitPasswordChange) */
         )
  }
  /*
  protected def transformInputSubmitToButton(in: NodeSeq, newChild: NodeSeq): NodeSeq = in match {
    case elem @ Elem(_,"input", attribs, _, _*) => elem.asInstanceOf[Elem] copy (attributes = attribs.remove("value")) copy (label = "button") copy (child = newChild)
    case other @ _ => other
  }   
  */  
  
  protected def changePasswordSubmitButton(name: StringOrNodeSeq, func:  () => Any , attrs: SHtml.ElemAttr* ): NodeSeq = {
     inputSubmitButtonWithAttribs(name, func, attrs: _* )
   }
    
  protected def inputSubmitButtonWithAttribs(name: StringOrNodeSeq,  func: () => Any , attrs: SHtml.ElemAttr* ) = {
     //SHtml.submit(name, func, attrs: _*)
    SHtml.button(name,func,attrs: _*)
  }   
   
}
