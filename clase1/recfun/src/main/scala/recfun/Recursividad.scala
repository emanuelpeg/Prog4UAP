package recfun
import common._

import scala.annotation.tailrec
import scala.util.Random

object Recursividad {

  /**
    * Ejercicio -2
    *
    * Defina una función que calcule el cuadrado de un número
    */
  def cuadrado(n: Long): Long = n * n

  /**
    * Ejercicio -1
    *
    * Defina una función que calcule la enésima potencia positiva de un número
    */
  def potencia(n: Long, v: Int): Long = if (v == 0) 1 else n * potencia(n, v - 1)

  /**
    * Ejercicio 0
    *
    * Realice una función que calcule el enesimo factorial de un numero
    */
  def factorial(n: Long): Long = ???

  /**
    * Ejercicio 1
    *
    * Realice una función que calcule el enesimo numero de fibonacci
    */

  def fibonacci(n: Int): Long = {
    @tailrec
    def fibonacciAux(n:Int, fa : Long , faa : Long ) : Long = if (n == 3) fa + faa else fibonacciAux(n -1 , fa + faa, fa)

    if (n == 1 || n == 2) 1 else fibonacciAux(n, 1, 1)
  }

  /**
    * Ejercicio 2
    * Realice una funcion que dado el numero de fila y columna,
    * calcule el valor del numero que se encuentre el la piramide de Pascal
    * 0   1 2 3 4 5
    * 1   1 0 0 0 0
    * 2   1 1 0 0 0
    * 3   1 2 1 0 0
    * 4   1 3 3 1 0
    */
  def pascal(c: Int, r: Int): Int = if (c < 0) 0
  else if (r < 0) 0
  else if (r == c) 1
  else if (c > r) 0
  else pascal(c - 1, r -1) + pascal(c, r - 1)

  /**
    * Exercise 3
    * Realice una función que permita saber si un texto tiene los parentesis balanceados, por ejemplo:
    *  => OK
    * () => OK
    * ((()))() => OK
    * (()()) => OK
    * (()())) => no OK
    * (()(()) => no OK
    * )( => no OK
    */
  def balance(chars: List[Char]): Boolean = {

    def balanceAux(chars : List[Char], cont : Int): Int = chars match {
      case Nil => cont
      case '('::tail => balanceAux(tail, cont + 1)
      case ')'::tail => if (cont == 0) -1 else balanceAux(tail, cont - 1)
      case _::tail => balanceAux(tail, cont)
    }

    balanceAux(chars, 0) == 0
  }

  /**
    * Exercise 3
    * Realice una función que cuente cuantas convinaciones pueden existir con monedas para un valor determinado, por ejemplo:
    * monedas (1,2) y valor es 4 , podemos llegar con las siguientes convinaciones (1,1,1,1) (1,1,2) (2,2)
    * por lo que la función debería retornar 3.
    * List(5, 4, 3)  0 = 1
    * List() 10 = 0 
    */
  def countChange(money: Int, coins: List[Int]): Int = ???

}
