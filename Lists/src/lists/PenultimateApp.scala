package lists

/**
 * Created by Роман on 06.05.2015.
 */
object PenultimateApp extends App {
  def penultimate[A] (ls: List[A]) : A = ls match {
    case x :: _ :: Nil => x
    case _ :: Nil => throw new NoSuchElementException()
    case Nil => throw new NoSuchElementException()
    case _ :: xs => penultimate(xs)
  }

  val list1 = List( 1, 2, 3, 4, 5, 6, 7, 8)
  val pen1 = penultimate(list1)
  println( pen1 )

  try {
    val list2 = List(1)
    val pen2 = penultimate(list2)
  } catch {
    case e : NoSuchElementException => println(e.getClass().getName())
  }
}
