package controllers

import javax.inject.Inject
import models.{Global, User, UserDao}
import play.api.data.Forms._
import play.api.data._
import play.api.mvc._

class UserConroller @Inject() {
    cc: MessageControllerComponents,
    userDao: UserDao
} extends MessageAbstractController(cc) {
    private val logger = play.api.Logger(this.getClass)
    
    val form: Form[User] = Form (
        mapping(
            "username" -> nonEmptyText
                .verifying("too few chars", s => lengthIsGreaterThanNCharacters(s, 2))
                .verifying("too many chars", s => lengthIsLessThanNCharacters(s, 20)),
            "password" -> nonEmptyText
                .verifying("too few chars",  s => lengthIsGreaterThanNCharacters(s, 2))
                .verifying("too many chars", s => lengthIsLessThanNCharacters(s, 30)),
        )(User.apply)(User.unapply)
    )
    private val formSubmitUrl = routes.UserConroller.processLoginAttempt
    
    def showLoginForm = Action { implicit request: Message
}