package ch.cinus.codewars.eight_kyu.squarensum

import org.scalatest.FunSuite

class KataTest extends FunSuite {

  test("Samples") {
    assert(Kata.squareSum(List(1, 2)) === 5)
    assert(Kata.squareSum(List(0, 3, 4, 5)) === 50)
  }
}
