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
  def cuadrado(n: Long): Long = ???

  /**
    * Ejercicio -1
    *
    * Defina una función que calcule la enésima potencia positiva de un número
    */
  def potencia(n: Long, v: Int): Long = ???

  /**
    * Ejercicio 0
    *
    * Realice una función que calcule el enesimo numero de fibonacci
    */
  def factorial(n: Long): Long = ???

  /**
    * Ejercicio 1
    *
    * Realice una función que calcule el enesimo numero de fibonacci
    */

  def fibonacci(n: Int): Long = {
    @tailrec
    def fibonacciAux(n: Int, fa: Long, faa: Long) : Long =
       if (n == 3) fa + faa
       else fibonacciAux(n-1, fa + faa, fa)

    if (n<=2) 1
    else fibonacciAux(n,1,1)
  }


  /**
    * Ejercicio 2
    * Realice una funcion que dado el numero de fila y columna,
    * calcule el valor del numero que se encuentre el la piramide de Pascal
    */
  def pascal(c: Int, r: Int): Int = ???

  /**
    * Exercise 3
    * Realice una función que permita saber si un texto tiene los parentesis balanceados, por ejemplo:
    * () => OK
    * ((()))() => OK
    * (()()) => OK
    * (()())) => no OK
    * (()(()) => no OK
    * )( => no OK
    */
  def balance(chars: List[Char]): Boolean = ???

  /**
    * Exercise 3
    * Realice una función que cuente cuantas convinaciones pueden existir con monedas para un valor determinado, por ejemplo:
    * monedas (1,2) y valor es 4 , podemos llegar con las siguientes convinaciones (1,1,1,1) (1,1,2) (2,2)
    * por lo que la función debería retornar 3.
    */
  def countChange(money: Int, coins: List[Int]): Int = ???

}
