package com.github.kmizu.scala_streaming

import java.util.stream.{Collectors, Stream}

import scala.collection.JavaConverters._

object Main {
  def main(args: Array[String]): Unit = {
    val stream: Stream[String] = List("A", "B", "C").asJava.stream()
    println(stream.map[String]{x => x + x}.collect(Collectors.joining(",")))
  }
}