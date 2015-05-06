package lists

/**
 * Created by Роман on 06.05.2015.
 */
object LastElemApp extends App {

  def last[A](list: List[A]) : A = {
    def lastRecursive[A](l:List[A]) : A = l match {
      case x :: Nil => x
      case Nil => throw new NoSuchElementException("Empty list")
      case x :: xs => lastRecursive(xs)
    }

    lastRecursive(list)
  }

  val list1 : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)
  val l1 = last(list1)
  println( l1 )

  println(list1.last)

  val list2 = List()
  try {
    val l2 = last(list2)
  } catch {
    case e: Exception => println("Empty list!")
  }

}
