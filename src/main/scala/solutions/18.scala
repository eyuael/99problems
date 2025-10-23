object Solution18{
  def sliceRecursively[A](start: Int, end: Int, list: List[A]): List[A] = {
    if (start <= 0) list.take(end)
    else list match {
      case Nil => Nil
      case head :: tail => sliceRecursively(start - 1, end - 1, tail)
    }
  }

  def main(args: Array[String]): Unit = {
    print(sliceRecursively(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}