enablePlugins(GatlingPlugin)

scalaVersion := "2.11.7"

scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.7", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")


assemblyOption in assemblyPackageDependency := (assemblyOption in assembly).value.copy(includeScala = false)


libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.7" % "test"
libraryDependencies += "io.gatling"% "gatling-test-framework"    % "2.1.7" % "test"
libraryDependencies += "net.liftweb" % "lift-json_2.11" % "2.6"
