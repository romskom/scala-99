package lists

/**
 * Created by Роман on 06.05.2015.
 */
object LastNApp extends App {

  def lastNthRecursive[A](n: Int, ls: List[A]): A = {
    def lastNthR(count: Int, resultList: List[A], curList: List[A]): A =
      curList match {
        case Nil if count > 0 => throw new NoSuchElementException
        case Nil              => resultList.head
        case _ :: tail        =>
          lastNthR(count - 1,
            if (count > 0) resultList else resultList.tail,
            tail)
      }
    if (n <= 0) throw new IllegalArgumentException
    else lastNthR(n, ls, ls)
  }

  val list1 = List(1, 2, 3, 4, 5)
  val l1 = lastNthRecursive(2, list1)
  println(l1)

}
