import sbt._, Keys._

object build extends Build {
  val commonSettings = Seq(
    Defaults.defaultSettings,
    net.virtualvoid.sbt.graph.Plugin.graphSettings,
    Seq(
      organization                := "$organization$",
      version                     := "$version$",
      scalaVersion                := "$scala$",
      crossPaths                  := false,
      scalacOptions              ++= Seq("-feature", "-unchecked", "-deprecation", "-Ymacro-debug-lite"),
      javacOptions               ++= Seq("-Xlint:unchecked", "-Xlint:deprecation"),
      sourceDirectory in Compile <<= baseDirectory(_ / "src"),
      sourceDirectory in Test    <<= baseDirectory(_ / "test"),
      libraryDependencies        ++= Seq(
        "org.scalatest" %% "scalatest" % "1.9.2" % "test"
      )
    )
  ).flatten

  val macros = Project(
    id = "macros",
    base = file("macros"),
    settings = commonSettings ++ Seq(
      name                 := "$name$-macros",
      libraryDependencies <+= (scalaVersion)("org.scala-lang" % "scala-compiler" % _),
      libraryDependencies ++= Seq()
    )
  )

  val core = Project(
    id = "core",
    base = file("core"),
    dependencies = Seq(macros),
    settings = commonSettings ++ Seq(
      name                 := "$name$-core",
      libraryDependencies ++= Seq()
    )
  )

  val root = Project(
    id = "root",
    base = file("."),
    settings = commonSettings,
    aggregate = Seq(macros, core)
  )
}
