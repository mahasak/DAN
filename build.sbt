name := """dan"""
organization := "io.bigbears"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  guice
  , jdbc
  , "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.12.0"
  , "org.postgresql" % "postgresql" % "9.4.1211"
  , "in.norbor" %% "yoda-orm" % "20201022.1"
)

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "io.bigbears.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "io.bigbears.binders._"
