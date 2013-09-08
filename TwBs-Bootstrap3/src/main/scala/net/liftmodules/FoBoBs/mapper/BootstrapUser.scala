package net.liftmodules.FoBoBs.mapper

import net.liftweb.util.Helpers._
import net.liftweb.http.S
import net.liftweb.common._
import net.liftweb.proto.{ProtoUser => GenProtoUser}
import net.liftweb.mapper._

trait BootstrapMegaMetaProtoUser[ModelType <: MegaProtoUser[ModelType]] extends KeyedMetaMapper[Long, ModelType] with GenProtoUser {
  self: ModelType =>
  
  //overriding lift-core i18 localization to add glyphicons to User menu entries (IF USER SETS fobo.xxx IN APP RESOURCE BUNDLE)  
  //with fallback back to the i18n lift-core localization properties 
  override def createUserMenuLoc: Box[Menu] =
    Full(Menu(Loc("CreateUser" + menuNameSuffix, signUpPath, S.loc("fobo.sign.up" , scala.xml.Text(S.?("sign.up"))), createUserMenuLocParams ::: globalUserLocParams)))
  override def lostPasswordMenuLoc: Box[Menu] =
    Full(Menu(Loc("LostPassword" + menuNameSuffix, lostPasswordPath, S.loc("fobo.lost.password" , scala.xml.Text(S.?("lost.password"))), lostPasswordMenuLocParams ::: globalUserLocParams))) // not logged in
  override def loginMenuLoc: Box[Menu] =
    Full(Menu(Loc("Login" + menuNameSuffix, loginPath, S.loc("fobo.login" , scala.xml.Text(S.?("login"))) , loginMenuLocParams ::: globalUserLocParams)))
  override def logoutMenuLoc: Box[Menu] =
    Full(Menu(Loc("Logout" + menuNameSuffix, logoutPath, S.loc("fobo.logout" , scala.xml.Text(S.?("logout"))) , logoutMenuLocParams ::: globalUserLocParams)))
  override def resetPasswordMenuLoc: Box[Menu] =
    Full(Menu(Loc("ResetPassword" + menuNameSuffix, (passwordResetPath, true), S.loc("fobo.reset.password" , scala.xml.Text(S.?("reset.password"))) , resetPasswordMenuLocParams ::: globalUserLocParams))) //not Logged in
  override def editUserMenuLoc: Box[Menu] =
    Full(Menu(Loc("EditUser" + menuNameSuffix, editPath,  S.loc("fobo.edit.user" , scala.xml.Text(S.?("edit.user"))) , editUserMenuLocParams ::: globalUserLocParams)))
  override def changePasswordMenuLoc: Box[Menu] =
    Full(Menu(Loc("ChangePassword" + menuNameSuffix, changePasswordPath, S.loc("fobo.change.password" , scala.xml.Text(S.?("change.password"))), changePasswordMenuLocParams ::: globalUserLocParams)))
    
    
  override def userNameFieldString: String = S.loc("fobo.email.address" , scala.xml.Text(S.?("email.address"))).toString()   
    
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
              S.notice(S.loc("fobo.logged.in" , scala.xml.Text(S.?("logged.in"))) )

              preLoginState()

              S.redirectTo(redir)
            })
          }

        case Full(user) if !user.validated_? =>
          S.error(S.loc("fobo.account.validation.error" , scala.xml.Text(S.?("account.validation.error"))))

        case _ => S.error(S.loc("fobo.invalid.credentials" , scala.xml.Text(S.?("invalid.credentials"))) )
      }
    }
    //("type=submit" #> loginSubmitButton(S.?("log.in"))).apply(loginXhtml)
    loginXhtml
  }
   
  override def loginXhtml = {
     <form class="form-horizontal" role="form" action={S.uri} method="post">
       <legend>{S.loc("fobo.log.in.legend" , scala.xml.Text(S.?("log.in"))) }</legend>
      <div class="form-group">
        <label for="username" class="col-lg-2 control-label">{userNameFieldString}</label>
        <div class="col-lg-10">
          <input type="email" class="form-control" id="username" name="username" placeholder={userNameFieldString} autofocus="autofocus" />
        </div>
      </div>
      <div class="form-group">
        <label for="password" class="col-lg-2 control-label">{S.loc("fobo.password" , scala.xml.Text(S.?("password")))}</label>
        <div class="col-lg-10">
          <input type="password" class="form-control" id="password" name="password" placeholder={S.loc("fobo.password" , scala.xml.Text(S.?("password")))} />
        </div>
      </div>
      <div class="form-group">
        <div class="col-lg-offset-2 col-lg-10">
          <button type="submit" class="btn btn-default">{S.loc("fobo.log.in.submit" , scala.xml.Text(S.?("log.in")))}</button> <span> <a href={lostPasswordPath.mkString("/", "/", "")}>{S.loc("recover.password" , scala.xml.Text(S.?("recover.password")))}</a></span>
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
    (<form class="form-horizontal" role="form" action={S.uri} method="post">
       <legend>{S.loc("fobo.enter.email.legend" , scala.xml.Text(S.?("enter.email")))}</legend>
      <div class="form-group">
        <label for="username" class="col-lg-2 control-label">{userNameFieldString}</label>
        <div class="col-lg-10">
          <input type="email" class="form-control" id="username" name="username" placeholder={userNameFieldString} autofocus="autofocus" />
        </div>
      </div>
      <div class="form-group">
        <div class="col-lg-offset-2 col-lg-10">
          <button type="submit" class="btn btn-default">{S.loc("fobo.send.it.submit" , scala.xml.Text(S.?("send.it")))}</button> 
        </div>
      </div>
     </form>)
  }   
  
  /* 
  override def lostPasswordXhtml = {
    (<form method="post" action={S.uri}>
        <table class="table table-striped"><thead><tr><td
              colspan="2">{S.?("enter.email")}</td></tr></thead><tbody>
          <tr><td>{userNameFieldString}</td><td><user:email /></td></tr>
          <tr><td>&nbsp;</td><td><user:submit /></td></tr>
        </tbody></table>
     </form>)
   }   
   */
  
  //some ProtoUser view data overrides for bootstrap styling 
  override def signupXhtml(user: TheUserType) = {
   (<form method="post" action={S.uri}><table class="table table-striped"><thead><tr><td
              colspan="2">{ S.?("sign.up") }</td></tr></thead><tbody>
          {localForm(user, false, signupFields)}
          <tr><td>&nbsp;</td><td><user:submit/></td></tr></tbody>
                                        </table></form>)    
  }
  
/*
  override def loginXhtml = {
    (<form method="post" action={S.uri}><table class="table table-striped"><thead><tr><td
              colspan="2">{S.?("log.in")}</td></tr></thead><tbody>
          <tr><td>{userNameFieldString}</td><td><user:email /></td></tr>
          <tr><td>{S.?("password")}</td><td><user:password /></td></tr>
          <tr><td><a href={lostPasswordPath.mkString("/", "/", "")}
                >{S.?("recover.password")}</a></td><td><user:submit /></td></tr></tbody></table>
     </form>)
  }
  */
  /*
  override def lostPasswordXhtml = {
    (<form method="post" action={S.uri}>
        <table class="table table-striped"><thead><tr><td
              colspan="2">{S.?("enter.email")}</td></tr></thead><tbody>
          <tr><td>{userNameFieldString}</td><td><user:email /></td></tr>
          <tr><td>&nbsp;</td><td><user:submit /></td></tr>
        </tbody></table>
     </form>)
  }
  */
  override def editXhtml(user: TheUserType) = {
    (<form method="post" action={S.uri}>
        <table class="table table-striped"><thead><tr><td colspan="2">{S.?("edit")}</td></tr></thead><tbody>
          {localForm(user, true, editFields)}
          <tr><td>&nbsp;</td><td><user:submit/></td></tr>
        </tbody></table>
     </form>)
  }
  
  override def changePasswordXhtml = {
    (<form method="post" action={S.uri}>
        <table class="table table-striped"><thead><tr><td colspan="2">{S.?("change.password")}</td></tr></thead><tbody>
          <tr><td>{S.?("old.password")}</td><td><user:old_pwd /></td></tr>
          <tr><td>{S.?("new.password")}</td><td><user:new_pwd /></td></tr>
          <tr><td>{S.?("repeat.password")}</td><td><user:new_pwd /></td></tr>
          <tr><td>&nbsp;</td><td><user:submit /></td></tr>
        </tbody></table>
     </form>)
  }
  
  override def standardSubmitButton(name: String,  func: () => Any = () => {}) = {
    SHtml.submit(name, func,("class","btn btn-default"))
  }
  
}

