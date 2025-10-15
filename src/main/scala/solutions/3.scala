object Solution3{

  def findKth[A](list: List[A], k: Int): A = {
    if (k <=0 ) throw new IllegalArgumentException("K must be positive int")

    val length = list.length
    val indexFromStart = list.length - k

    if (indexFromStart <= 0) throw new IllegalArgumentException("K cannot be greater than list length")

    def getByIndex(list: List[A], index: Int): A = list match {
      case h :: tail if index == 0 => h
      case _ :: tail => getByIndex(tail, index - 1)
      case _ => throw new NoSuchElementException
    }

    getByIndex(list, indexFromStart)
  }

  

  def main(args: Array[String]): Unit = {
    println(findKth(List(1, 4 , 6, 77,99, 379, 3498948, 934082304, 8734973 , 87834),1))

  }

}