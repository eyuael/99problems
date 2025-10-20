object Solution9{

  def pack[A](list: List[A]): List[List[A]] = {
    list match {
      case Nil => Nil
      case head :: tail =>
        val (packed, next) = tail.span(_ == head)
        (head :: packed) :: pack(next)
    }
  }

  def main(args: Array[String]): Unit = {
    print(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}