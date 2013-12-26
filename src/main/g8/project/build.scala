import sbt._, Keys._

import net.virtualvoid.sbt.graph.Plugin.graphSettings

object build extends Build {
  val root = Project(
    id = "$name$",
    base = file("."),
    settings = Defaults.defaultSettings ++ graphSettings ++ Seq(
      name                 := "$name$",
      organization         := "$organization$",
      version              := "$version$",
      scalaVersion         := "$scala$",
      crossPaths           := false,
      javacOptions        ++= Seq("-Xlint:unchecked", "-Xlint:deprecation"),
      scalacOptions       ++= Seq(
        "-feature",
        "-unchecked",
        "-deprecation",
        "-Yno-adapted-args",
        "-language:implicitConversions",
        "-language:higherKinds"
      ),
      libraryDependencies ++= Seq(
        "org.scalatest"  %% "scalatest" % "1.9.2" % "test"
      )
    )
  )
}
