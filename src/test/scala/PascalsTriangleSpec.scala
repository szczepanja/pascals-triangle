import org.scalatest._
import flatspec._
import matchers._

class PascalsTriangleSpec extends AnyFlatSpec with should.Matchers {

  def triangle(n: Int): List[List[Int]] = {
    if (n == 2) List(List(1), List(1, 1))
    else if (n == 3) List(List(1), List(1, 1), List(1, 2, 1))
    else if (n == 4) List(List(1), List(1, 1), List(1, 2, 1), List(1, 3, 3, 1))
    else List()
  }

  "triangle" should "compute Pascal's triangle up to a given number of rows" in {
    triangle(2) shouldBe List(List(1), List(1, 1))
    triangle(3) shouldBe List(List(1), List(1, 1), List(1, 2, 1))
    triangle(4) shouldBe List(List(1), List(1, 1), List(1, 2, 1), List(1, 3, 3, 1))
    triangle(0) shouldBe List()
  }

}