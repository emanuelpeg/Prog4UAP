package utils

import common._

/**
 * Libreria de funciones para Listas de enteros. Utilizando folds
 */
object ListIntUtils {

  /**
    * Realice la función Map
    */
  def map[T,M](lista: List[T], fx: T => M): List[M] = ???

  /**
    * Realice la función reduce
    */
  def reduce[T](lista: List[T], acu : T, fx: (T, T) => T) : T = ???
  
  /*
   * Busca la mediana
   * En el ámbito de la estadística, la mediana representa el 
   * valor de la variable de posición central en un conjunto de datos ordenados.
  */
  def mediana(lista: List[Int]) : Int = ???

  // filtra la lista de valores mayores que el valor e pasado por parametro
  def maximos(lista: List[Int],e: Int) : List[Int]= ???

  // filtra la lista de valores menores que el valor e pasado por parametro
  def minimos(lista: List[Int],e: Int) : List[Int]= ???

  // Ordena los valores de una lista utilizando quicksort
  def QuickSort(xs: List[Int]) : List[Int]= ???

  /**
   * Cuenta los elementos
   */
  def contar(lista: List[Int]) : Int = ???

  // Acumula los elementos
  def acc(lista: List[Int]) : Int = ???
  
      
  /**
   * Filtra los elementos de la lista xs segun la funcion p
   */
  def filtrar(xs: List[Int], p: Int => Boolean): List[Int] = ???

  /**
   * Filtra los elementos pares
   */
  def filtrarPares(xs: List[Int]): List[Int] = ???
  
  /**
   * Filtra los elementos multiplos de 3
   */
  def filtrarMultiplosDeTres(xs: List[Int]): List[Int] = ???

   /**
   * Acumula los elementos aplicandoles fx
   */
  def acumular(lista: List[Int])(fx: (Int) => Int): Int = ???
    
    
  /**
   * Acumula todos los elementos de una lista
  */ 
  def acumularUnidad(lista: List[Int]): Int = ???
  
  /**
   * Acumula  el dobles de los elementos de una lista
   */
  def acumularDoble(lista: List[Int]): Int = ???

  /**
   * Acumula el cuadrado de los elementos de una lista
   */
  def acumularCuadrado(lista: List[Int]): Int = ???

  /**
    * retorna true si un elemento existe en la lista
    */
  def existe(lista : List[Int], nro : Int) : Boolean = ???

}
