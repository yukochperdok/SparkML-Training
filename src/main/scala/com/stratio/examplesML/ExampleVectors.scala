package com.stratio.examplesML

import org.apache.spark.mllib.linalg.{Vector, Vectors}

object ExampleVectors {
  def main(args:Array[String]) = {
    val array: Array[Double] = Array(9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0)
    val vector: Vector = Vectors.dense(array) // a dense vector
    println(vector)
  }
}
