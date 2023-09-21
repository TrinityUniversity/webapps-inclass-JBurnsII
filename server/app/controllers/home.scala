package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._

@Singleton
class home @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def home = Action {
        Ok(views.html.home(Nil))
    }
}