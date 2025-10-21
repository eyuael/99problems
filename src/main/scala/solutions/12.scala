object Solution12{
  def decodeModified[A](list: List[Either[A, (Int, A)]]): List[A] = {
    list.flatMap(x => x match {
      case Left(a) => List(a)
      case Right((n, a)) => List.fill(n)(a)
    })
  }

  def main(args: Array[String]): Unit = {
    print(decodeModified(List(Left('a), Right((4, 'b)), Left('c), Right((2, 'a)), Left('d), Right((4, 'e)))))
  }
}


  