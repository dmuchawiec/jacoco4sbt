sbtPlugin := true

name := "jacoco4sbt"

organization := "de.johoop"

version := "1.2.5-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.jacoco" % "org.jacoco.core" % "0.6.0.201210061924" artifacts(Artifact("org.jacoco.core", "jar", "jar")),
  "org.jacoco" % "org.jacoco.report" % "0.6.0.201210061924" artifacts(Artifact("org.jacoco.report", "jar", "jar")))
   
scalacOptions ++= Seq("-unchecked", "-deprecation")

