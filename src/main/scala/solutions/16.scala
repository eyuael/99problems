object Solution16{
  def drop[A](n: Int, list: List[A]): List[A] = {
    list.zipWithIndex.filterNot(_._2 % n == n - 1).map(_._1)
  }
  
  def main(args: Array[String]): Unit = {
    print(drop(2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}