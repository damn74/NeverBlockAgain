name := "NeverBlockAgain"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-deprecation")

// libraries
libraryDependencies ++= Seq( 
"com.typesafe.akka" %% "akka-actor" % "2.4.12",
"com.typesafe.akka" %% "akka-http-core" % "2.4.11",
"com.typesafe.akka" %% "akka-http-experimental" % "2.4.11",
"com.typesafe.akka" %% "akka-http-jackson-experimental" % "2.4.11",
"com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.4.11",
"com.typesafe.akka" %% "akka-http-xml-experimental" % "2.4.11")

exportJars := true

lazy val root = (project in file("."))
  .enablePlugins(DockerPlugin)
  .enablePlugins(JavaAppPackaging)


dockerBaseImage := "java"
dockerExposedPorts := Seq(8080)



