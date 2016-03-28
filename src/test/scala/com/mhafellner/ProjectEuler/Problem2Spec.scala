package com.mhafellner.ProjectEuler

import org.scalatest._

/**
  * Created by Markus on 27/03/2016.
  */
class Problem2Spec extends FlatSpec with Matchers {
  behavior of "Problem2"

  "main" should "print the solution and not return anything" in {
    Problem2.main(Array[String]()) should be()
  }

  "addAllEvenFibonaccis with limit 10" should "return 10" in {
    Problem2.addAllEvenFibonaccis(10) should be(10)
  }

  "addAllEvenFibonaccis" should "return the sum of all even Fibonacci terms within the given limit" in {
    Problem2.addAllEvenFibonaccis(100) should be(44)
  }

  "addAllEvenFibonaccis" should "return 0 when given a negative limit" in {
    Problem2.addAllEvenFibonaccis(-3) should be(0)
  }

}
