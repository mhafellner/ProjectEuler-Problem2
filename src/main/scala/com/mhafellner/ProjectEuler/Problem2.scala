package com.mhafellner.ProjectEuler

/**
  * Created by Markus on 27/03/2016.
  */
object Problem2 {
  def main(args: Array[String]): Unit = {
    val allEvenFibonaccisSum = addAllEvenFibonaccis(4000000)
    println(allEvenFibonaccisSum)
  }

  def addAllEvenFibonaccis(limit: Int): Int = {
    var firstNumber = 1
    var secondNumber = 2
    var nextFibonacci = secondNumber
    var sum = 0
    do {
      if (nextFibonacci % 2 == 0) {
        sum += nextFibonacci
      }
      nextFibonacci = firstNumber + secondNumber
      firstNumber = secondNumber
      secondNumber = nextFibonacci
    } while (nextFibonacci < limit)
    sum
  }
}
