object Solution5{
  
  def reverseList[A](list: List[A]): List[A] = list match{
    case Nil => Nil
    case head :: tail => reverseList(tail) :+ head
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    //print(findLengthNative(List(1, 4 , 6, 7, 8, 9, 5 ,3 ,6 ,42, 5)))
    print(reverseList(List(1, 4 , 6, 7, 8, 9, 5 ,3 ,6 ,42, 5, 2, 5 ,6 ,7 ,8 ,4)))

  }

}