name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala$"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-Ydependent-method-types")

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")

net.virtualvoid.sbt.graph.Plugin.graphSettings

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.8" % "test"
)
