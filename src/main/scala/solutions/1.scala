object Solution1 {
  def findLast[A](list: List[A]): A = list.last

  def findLastRecursive[A](list: List[A]): A = list match{
    case h :: Nil => h
    case _ :: tail => findLastRecursive(tail)
    case _ => throw new NoSuchElementException
  }

  def main (args: Array[String]): Unit = {
    println(findLastRecursive(List(4, 6, 7 ,46, 67, 3, 64)))
  }
}