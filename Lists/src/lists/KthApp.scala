package lists

/**
 * Created by Роман on 06.05.2015.
 */
object KthApp extends App {

  def nth[A](n : Int, lst : List[A]) : A = lst match {
    case head :: tail if (n == 0) => head
    case head :: tail if (n > 0) => nth (n - 1, tail)
    case Nil if (n > 0) => throw new NoSuchElementException()
  }

  val list1 = List(1, 2, 3, 4, 5)
  println(nth(0, list1))
}
