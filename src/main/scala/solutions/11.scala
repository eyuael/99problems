object Solution11{
  def encodeModified[A](list: List[A]): List[Either[A, (Int, A)]] = {
    pack(list).map(x => if (x.length == 1) Left(x.head) else Right(x.length, x.head))
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
    print(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}