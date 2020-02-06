import ch.cinus.codewars.six_kyu.whohasthemostmoney.{Student, StudentsRank}
import org.scalatest.{FlatSpec, Matchers}

class StudentsRankSpec extends FlatSpec with Matchers {

  val andy = Student("Andy", 0, 0, 2) // 40
  val stephen = Student("Stephen", 0, 4, 0) // 40
  val eric = Student("Eric", 8, 1, 0) // 50
  val david = Student("David", 2, 0, 1) // 30
  val phil = Student("Phil", 0, 2, 1) // 40
  val cam = Student("Cameron", 2, 2, 0) // 30
  val geoff = Student("Geoff", 0, 3, 0) // 30

  "StudentsRank.mostMoney(Phil, Cameron, Geoff)" should "return Phil" in {
    StudentsRank.mostMoney(List[Student](cam, geoff, phil)) should be("Phil")
  }

  "StudentsRank.mostMoney(Cam, Geoff)" should "return all" in {
    StudentsRank.mostMoney(List[Student](cam, geoff)) should be("all")
  }

  "StudentsRank.mostMoney(Geoff)" should "return Geoff" in {
    StudentsRank.mostMoney(List[Student](geoff)) should be("Geoff")
  }
}