name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala$"

scalacOptions ++= Seq("-feature", "-deprecation", "-unchecked")

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")

net.virtualvoid.sbt.graph.Plugin.graphSettings

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)
