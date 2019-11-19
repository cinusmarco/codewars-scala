package ch.cinus.codewars.six_kyu.whohastehmostmoney

object StudentsRank {

  def mostMoney(students: List[Student]): String = {
    val ls = students.map(s => (s, ownedMoney(s))).sortBy(- _._2)
    ls match {
      case Nil => ""
      case x :: Nil => x._1.name
      case x :: y :: xs => if (x._2 > y._2) {
        x._1.name
      } else {
        "all"
      }
    }
  }

  def ownedMoney(student: Student): Int = student.fives * 5 + student.tens * 10 + student.twenties * 20

}

case class Student(name: String, fives: Int, tens: Int, twenties: Int)