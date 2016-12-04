lazy val commonSettings = Seq(
  organization := "org.scalawebtest",
  version := "1.0.0-SNAPSHOT",
  scalaVersion := "2.12.0",
  scalacOptions := Seq("-unchecked", "-deprecation")
)

lazy val demo = project
  .configs(IntegrationTest)
  .settings(commonSettings: _*)
  .settings(Defaults.itSettings: _*)
  .settings(
    libraryDependencies ++= Seq(
      "org.scalawebtest" %% "scalawebtest-core" % "1.0.4",
      "org.scalatest" %% "scalatest" % "3.0.0",
      "org.seleniumhq.selenium" % "selenium-java" % "2.53.1",
      "org.seleniumhq.selenium" % "selenium-htmlunit-driver" % "2.52.0",
      "org.slf4j" % "slf4j-api" % "1.7.20",
      "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
    )
  )
  .enablePlugins(JettyPlugin)

addCommandAlias("inttest", "; jetty:start ; it:test ; jetty:stop")
