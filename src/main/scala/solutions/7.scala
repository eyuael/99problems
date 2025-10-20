object Solution7 {
  def flatten[A](list: List[List[A]]): List[A] = {
    list.flatMap(_.toList)
  }

  def main(args: Array[String]): Unit = {
    print(flatten(List(List(1, 3 ,5), List(2, 1 ,6), List(List(1,4,6), List(3, 7)))))
  }
}