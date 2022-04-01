import org.scalatest._
import flatspec._
import matchers._

class PascalsTriangleSpec extends AnyFlatSpec with should.Matchers {

  import PascalsTriangle._

  "pascalsTriangle" should "compute Pascal's triangle up to a given number of rows" in {
    pascalsTriangle(1) shouldBe Seq(Seq(1))
    pascalsTriangle(2) shouldBe Seq(Seq(1), Seq(1, 1))
    pascalsTriangle(3) shouldBe Seq(Seq(1), Seq(1, 1), Seq(1, 2, 1))
    pascalsTriangle(4) shouldBe Seq(Seq(1), Seq(1, 1), Seq(1, 2, 1), Seq(1, 3, 3, 1))
  }

  it should "return empty Seq" in {
    pascalsTriangle(0) shouldBe Seq()
  }

}