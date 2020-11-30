val commonSettings = Def.settings(
  organization := "com.example",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "3.0.0-M2",
)

val a1 = project.settings(
  commonSettings,
)

val a2 = project.settings(
  commonSettings,
)

commonSettings
enablePlugins(ScalaUnidocPlugin)
