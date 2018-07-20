// File demoScala.scala from jupyter notebook
import scala.collection.Map

case class QuestScale(C:Int, E:Int, L:Int, U:Int)
case class WeightScale(W_cc:Double, W_ce:Double, W_cu:Double, W_el:Double, W_ll:Double)

object Analytics{
    def fScale(w:WeightScale, q:QuestScale):Double = {
        val result = (w.W_cc * scala.math.pow(q.C, 2)) +
        (w.W_ce * q.C * q.E) + 
        (w.W_cu * q.C * q.U) + 
        (w.W_el * q.E * q.L) + 
        (w.W_ll * scala.math.pow(q.L,2) )
        return result
    }
}
