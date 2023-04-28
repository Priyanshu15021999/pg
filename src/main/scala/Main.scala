package School_Project

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.Source
import akka.util.ByteString
import akka.http.scaladsl.model._
import scala.io.Source.fromInputStream
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives.{entity, _}
import akka.http.scaladsl.server.{RejectionHandler, Route, ValidationRejection}

import com.typesafe.scalalogging.LazyLogging
import spray.json.DefaultJsonProtocol

import scala.concurrent.Future
import scala.io.StdIn
import scala.util.{Failure, Success, Try}

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

    val s=
      get{
        getFromResource("index1.html")
      }

    val bindingFuture = Http().bindAndHandle(s, "localhost", 8080)

    println(s"Server online at http://localhost:8080/")
  }
}