ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "PriyanshuHTML_akkaHttpProject",
    idePackagePrefix := Some("School_Project")
  )
/*
* HERE IT IS IMPORTANT THAT WE TAKE VERSION IN VAL DATA TYPE*////////////////////////// IMP //////////////////////////////////
val AkkaVersion = "2.7.0"
val AkkaHttpVersion = "10.5.0"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.akka" %% "akka-testkit" % AkkaVersion % Test,
  "org.scalatest" %% "scalatest" % "3.2.9" % Test,
  "com.typesafe.akka" %% "akka-http-testkit" % AkkaHttpVersion % "test"
)

