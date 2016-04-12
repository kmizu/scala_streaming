organization := "com.github.kmizu"

name := "scala_streaming"

scalaVersion := "2.12.0-M4"

scalacOptions <++= scalaVersion map { v =>
  Seq("-unchecked", "-deprecation", "-feature", "-language:implicitConversions")
}
