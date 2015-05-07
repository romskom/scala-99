package lists

/**
 * Created by Роман on 07.05.2015.
 */
object LenghtApp extends App {

  def length[A](lst : List[A]) : Int = {
    def lengthRec[A](n: Int, l: List[A]): Int = l match {
      case Nil => n
      case _ :: tail => lengthRec(n + 1, tail)
    }
    lst match {
      case null => throw new NullPointerException
      case Nil => 0
      case _ => lengthRec(0, lst)
    }
  }


  val list1 = List(1, 2, 3, 4, 5, 6, 7, 8)
  val l1 = length(list1)
  println( l1 )

  val list2 = List()
  val l2 = length(list2)
  println(l2)

  try {
    val list3: List[Nothing] = null
    val l3 = length(list3)
    println(list3)
    println(l3)
  } catch {
    case npe: NullPointerException => println("NullPointerException")
  }

  def lengthFunctional[A](ls: List[A]): Int = ls.foldLeft(0) { (c, _) => c + 1 }
  val ll1 = lengthFunctional(list1)
  println(ll1)

}
