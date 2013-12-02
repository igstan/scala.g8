import sbt._, Keys._

import net.virtualvoid.sbt.graph.Plugin.graphSettings

object build extends Build {
  val root = Project(
    id = "$name$",
    base = file("."),
    settings = Defaults.defaultSettings ++ graphSettings ++ Seq(
      name                        := "$name$",
      organization                := "$organization$",
      version                     := "$version$",
      scalaVersion                := "$scala$",
      crossPaths                  := false,
      scalacOptions              ++= Seq("-feature", "-unchecked", "-deprecation", "-Yno-adapted-args"),
      javacOptions               ++= Seq("-Xlint:unchecked", "-Xlint:deprecation"),
      sourceDirectory in Compile <<= baseDirectory(_ / "src"),
      sourceDirectory in Test    <<= baseDirectory(_ / "test"),
      libraryDependencies        ++= Seq(
        "org.scalatest" %% "scalatest" % "1.9.2" % "test"
      )
    )
  )
}
