object Solution8{
  def removeDuplicatesNative[A](list: List[A]): List[A] = {
    list.distinct
  }

  def removeDuplicatesRecursive[A](list: List[A]): List[A] = {
    list match {
      case Nil => Nil
      case head :: tail => head :: removeDuplicatesRecursive(tail.filterNot(_ == head))
    }
  }

  def main(args: Array[String]): Unit = {
    print(removeDuplicatesRecursive(List(1,1, 4 ,4 , 6, 7, 8, 9, 5 ,3 ,6 ,42, 5)))
  }
}