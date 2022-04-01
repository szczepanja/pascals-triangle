object PascalsTriangle extends App {

  def pascalsTriangle(n: Int): Seq[Seq[Int]] = {
    val zeroElements = 0

    n match {
      case 1 => Seq(Seq(1))
      case el if (el > 1) => pascalsTriangle(el - 1) :+
        (zeroElements +: pascalsTriangle(el - 1).last :+ zeroElements)
          .sliding(2)
          .map(_.foldLeft(0)(_ + _))
          .toSeq
      case _ => Seq()
    }
  }
}
