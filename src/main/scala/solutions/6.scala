object Solution6 {
  def palindrome[A](list: List[A]): Boolean = list match {
    case Nil => true
    case _::Nil => true 
    case head::tail =>
      if (head == tail.last)
        palindrome(tail.init)
      else
        false

    case _ => throw new NoSuchElementException
    
  }

  def main(args: Array[String]): Unit = {
    print(palindrome(List(1, 4 , 1)))
    print(palindrome(List(1, 4 , 5)))

  }
}