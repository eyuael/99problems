object Solution17{
  def splitRecursively[A](n: Int, list: List[A]): (List[A], List[A]) = {
    if (n <= 0) (Nil, list)
    else list match {
      case Nil => (Nil, Nil)
      case head :: tail => {
        val (left, right) = splitRecursively(n - 1, tail)
        (head :: left, right)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    print(splitRecursively(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}