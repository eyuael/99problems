
object Solution2 {
  def findLastButOne[A](list: List[A]): A = list match {
    case h :: _ :: Nil => h
    case _ :: tail     => findLastButOne(tail)
    case _             => throw new NoSuchElementException
  }

  def main (args: Array[String]): Unit = {
    println(findLastButOne(List(1, 1, 2, 3, 5, 8)))
  }
}
