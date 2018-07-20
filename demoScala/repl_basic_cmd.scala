val x = 10
var y = 10
y = 20
/* another
comment */

var z: Int = 10
var x: Double = 10
true
false
!true
1 + 1
1 - 1
1 - 2
1 * 1
1 / 1
2 / 3
2.0 / 3
2 / 3.0 
1 + 1
res16 + 1
'a'
"a"
"hello".length
"hello".substring(2,4)
"hello".replace("C","3")
"hello".take(5)
"hello".take(3)
"hello".drop(2)
val n = 45
s"We have $n apples"
n.toLong
n.byteValue
n.toByte
n.toBinaryString
n.toChar
n.toDegrees
n.toHexString
math.pow(5,2)
raw"New line feed: \n. Carriage return: \r."
val html = """<h1>
Big Title
</h1>

"""
def sumOfSquares(x: Int, y: Int): Int = {
val x2 = x*x
val y2 = y*y
x2+y2
}
sumOfSquares(7,8)
def sumOfSquaresShort(x: Int, y: Int): Int = x * x + y * y
def sumOfSquaresShort(x: Int, y: Int) = x * x + y * y
(x: Int) => x * x
val sq: Int => Int = x => x * x
sq(10)
val addOne: Int => Int = _ + 1
addOne(5)
1 to 5
val r = 1 to 5
r.foreach(println)
(5 to 1 by -1) foreach println
(5.0 to 1.0 by .5) foreach println
(5.0 to 1.0 by 0.5) foreach println
var i = 0 
while(i<10) { println("i " + i); i +=1 }
i
if (i == 1) println("yeah") else println("nay")
var a = Array(1,2,3)
Array(1 to 5)
a(0)
(1 to 5).toList
(1 to 5).toArray
(1.0 to 5.0 by .5).toArray
var m = Map("fork" -> "tenedor", "spoon" -> "cuchara")
m("fork")
m.withDefaultValue("no lo se")
m
var safeM  = m.withDefaultValue("no lo se")
safeM("bottle")
(1.0 to 5.0 by .5).toSet
(1, 2)
(4, 3, 2)
val dividInts = (x: Int, y: Int) => (x/y, x%y)
val d = dividInts(10,3)
d._1
d._2
val (div,mod) = dividInts(10,3)
val add10: Int => Int = _ + 10
List(1,2,3) map add10
List(1,2,3) map (x=>x+10)
List(1,2,3) map (_ + 10)
List("Dom","Bob","Natalia") foreach println
val s = Set(1,3,7)
sq
s.map(sq
)
val sSquared = s.map(sq)
sSquared.filter(_<10)
sSquared.reduce(_+_)
List(1,2,3) filter (_>2)
case class Person(name: String, age: Int)
List(
  Person(name = "Dom", age = 23),
  Person(name = "Bob", age = 30)
).filter(_.age > 25)
val aList = (1 to 100 by 10).toList
aList foreach (x => println(x))
aList foreach println
for {n <- s} yield sq(n)
s
val nSq = for {n <- s} yield sq(n)
for {n <- nSq if n<10} yield n
for {n <- s; nSqd = n*n if nSqd < 10} yield nSqd
import scala.collection.immutable.List
import scala.collection.immutable._
import scala.collection.immutable.{List, Map}
import scala.collection.immutable.{List => ImmutableList}
import scala.collection.immutable.{Map => _, Set => _, _}
object Application {
  def main(args: Array[String]): Unit = {
    // stuff goes here.
  }
}
import scala.io.Source
