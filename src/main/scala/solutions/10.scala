object Solution10{
  def encode[A](list: List[A]): List[(Int, A)] = {
    pack(list).map(x => (x.length, x.head))
  }

  def pack[A](list: List[A]): List[List[A]] = {
    list match {
      case Nil => Nil
      case head :: tail =>
        val (packed, next) = tail.span(_ == head)
        (head :: packed) :: pack(next)
    }
  }

  def main(args: Array[String]): Unit = {
    print(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}