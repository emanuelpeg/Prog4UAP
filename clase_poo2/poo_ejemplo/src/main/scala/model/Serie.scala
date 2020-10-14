package model

import scala.annotation.tailrec
import scala.util.Random

class Serie {

   var secuencia : Seq[Int] = generar()

   def generar() = {
      val selector = Random.nextInt(4)
      val offSet = Random.nextInt(50)
      val offSetFib = Random.nextInt(10)
      selector match {
         case 0 => for (i <- 0 to 3) yield i + offSet
         case 1 => for (i <- 0 to 3) yield i * 2 + offSet
         case 2 => for (i <- 0 to 3) yield (i * 2) + 1 + offSet
         case 3 => for (i <- 0 to 3) yield ((i + offSet) * (i + offSet))
         case 4 => for (i <- 0 to 3) yield fibonacci(i + offSetFib)
      }
   }

   def fibonacci(n: Int): Int = {
      @tailrec
      def fibonacciAux(n:Int, fa : Int , faa : Int ) : Int = if (n == 3) fa + faa else fibonacciAux(n -1 , fa + faa, fa)

      if (n == 1 || n == 2) 1 else fibonacciAux(n, 1, 1)
   }

   def regenerar() = secuencia = generar()
}
