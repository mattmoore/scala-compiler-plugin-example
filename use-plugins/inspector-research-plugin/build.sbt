import Dependencies._

lazy val root = (project in file("."))
  .settings(
    organization := "io.mattmoore.scala.compiler.plugins",
    name := "Using the inspector plugin for Scala 3.",
    scalaVersion := scala3Version,
    autoCompilerPlugins := true,
    addCompilerPlugin("io.mattmoore.scala.compiler.plugins" %% "inspector" % "0.0.1-SNAPSHOT")
  )
