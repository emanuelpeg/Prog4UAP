version := "1.0.0"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-deprecation", "-feature")

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.3" % Test

libraryDependencies += "junit" % "junit" % "4.10" % "test"

libraryDependencies ++= Seq(
    "org.scalacheck" %% "scalacheck" % "1.10.1"
  )

libraryDependencies ++= Seq(
    "com.netflix.rxjava" % "rxjava-scala" % "0.15.0",
    "org.json4s" %% "json4s-native" % "3.7.0-M2",
    "org.scala-lang" % "scala-swing" % "2.11.0-M7",
    "net.databinder.dispatch" % "dispatch-core_2.11" % "0.11.0",
    "org.scala-lang" % "scala-reflect" % "2.11.8",
    "org.slf4j" % "slf4j-api" % "1.7.5",
    "org.slf4j" % "slf4j-simple" % "1.7.5",
    "com.squareup.retrofit" % "retrofit" % "1.0.0",
    "org.scala-lang.modules" %% "scala-async" % "0.9.7"
)


libraryDependencies ++=  Seq(
    "com.typesafe.akka" %% "akka-actor" % "2.5.30",
    "com.typesafe.akka" %% "akka-testkit" % "2.5.30" % Test
    )

