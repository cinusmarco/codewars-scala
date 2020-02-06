package ch.cinus.codewars.eight_kyu.squarensum

object Kata {
  def squareSum(xs: List[Int]): Int = xs.map(elem => elem * elem).sum
}
