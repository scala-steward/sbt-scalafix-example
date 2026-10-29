lazy val myproject = project.settings(
  scalaVersion := "3.3.9",
  semanticdbEnabled := true,
  scalacOptions ++= List(
    "-Wunused:all"
  )
)
