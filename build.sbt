name := "JDCBot"

organization := "com.github.applegrew"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.2"

resolvers := Seq(
  "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/",
  "Codehale" at "http://repo.codahale.com"
)

libraryDependencies ++= Seq(
	"org.apache.ant" % "ant" % "1.8.4",
	 "log4j" % "log4j" % "1.2.17",
	 "org.slf4j" % "slf4j-api" % "1.6.6",
	 "org.slf4j" % "slf4j-log4j12" % "1.6.6"
)