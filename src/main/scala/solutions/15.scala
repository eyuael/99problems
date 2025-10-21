object Solution15{
  def duplicateN[A](n: Int, list: List[A]): List[A] = {
    list.flatMap(x => List.fill(n)(x))
  }

  def main(args: Array[String]): Unit = {
    print(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  }
}