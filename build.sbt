lazy val root = (project in file(".")).
  settings(
    name := "myscala",
    version := "1.0",
    scalaVersion := "2.11.7"
  )

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.5" % "test"