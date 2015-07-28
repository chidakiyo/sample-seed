package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    val result = "Your new application is ready.".map(_.toUpper)
    Ok(views.html.index(result))
  }

}
