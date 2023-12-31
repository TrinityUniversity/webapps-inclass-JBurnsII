package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._

@Singleton
class Home @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def home = Action {
        Ok(views.html.home(Nil))
    }

    def form = Action {
        
        Ok(views.html.survey(Seq("j", "blue")))

    }

    def info = TODO
}