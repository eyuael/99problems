object Solution14{
  def duplicate[A](list: List[A]): List[A] = {
    list.flatMap(x => List(x, x))
  }

  def main(args: Array[String]): Unit = {
    print(duplicate(List('a, 'b, 'c, 'c, 'd)))
  }
}