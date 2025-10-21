object Solution13{
  def encodeDirect[A](list: List[A]): List[Either[A, (Int, A)]] = {
    list.foldRight(List[Either[A, (Int, A)]]())((head, tail) => tail match {
      case Left(a) :: tail if a == head => Right(2, head) :: tail
      case Right((n, a)) :: tail if a == head => Right(n + 1, head) :: tail
      case _ => Left(head) :: tail
    })
  }

  def main(args: Array[String]): Unit = {
    print(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}