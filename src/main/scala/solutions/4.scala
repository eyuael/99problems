object Solution4 {
  
  def findLengthNative[A](list: List[A]): Int = {
    list.length
  }
  
  def recursiveLength[A](list: List[A]): Int = list match{
    case Nil => 0
    case _ :: tail => recursiveLength(tail) + 1
  }
  


  def main(args: Array[String]): Unit = {
    //print(findLengthNative(List(1, 4 , 6, 7, 8, 9, 5 ,3 ,6 ,42, 5)))
    print(recursiveLength(List(1, 4 , 6, 7, 8, 9, 5 ,3 ,6 ,42, 5, 2, 5 ,6 ,7 ,8 ,4)))

  }
}