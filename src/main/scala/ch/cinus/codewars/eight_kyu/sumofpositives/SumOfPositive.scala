package ch.cinus.codewars.eight_kyu.sumofpositives

object SumOfPositive {
  def positiveSum(arr: Array[Int]): Int = {
    arr.filter(_ > 0).sum
  }
}