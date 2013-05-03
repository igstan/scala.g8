name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala$"

scalacOptions ++= Seq("-feature", "-deprecation", "-unchecked")

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")

sourceDirectory in Compile <<= baseDirectory(_ / "src")

sourceDirectory in Test <<= baseDirectory(_ / "test")

net.virtualvoid.sbt.graph.Plugin.graphSettings

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)
