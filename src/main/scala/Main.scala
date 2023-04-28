package HTML_akkaHttpProject



import akka.actor.ActorSystem
import akka.http.scaladsl.Http

import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer

object WebServer {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("my-system")
    implicit val materializer = ActorMaterializer()
    implicit val executionContext = system.dispatcher
/*
    val route =
      path("submit") {
        put {
          formFields('name, 'email) { (name, email) =>
            // do something with the form data
            complete(s"Received name=$name, email=$email")
          }
        }
      }*/

    val s=path("s"){
      getFromResource("h.html")
    }
    val bindingFuture = Http().bindAndHandle(s, "localhost", 8080)

    println(s"Server online at http://localhost:8080/")
  }
}