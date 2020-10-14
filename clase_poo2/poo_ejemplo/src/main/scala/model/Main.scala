package model

import scala.io.StdIn

object Main extends App {

  var juego = new Juego
  var salir = "S"

  print("Bienvenido !!! ")

  while (salir == "S") {

    println("La serie es :" + juego.nro0 + " " + juego.nro1 + " ____ " + juego.nro3  )
    println(" Ingrese el valor :")
    val i = StdIn.readInt()

    if (juego.esValido(i))
      println("Ganaste !!! ")
    else
      println("Segui participando :( ")
    println("Tu puntaje es : " + juego.puntaje)

    println("Desea seguir Jugando [S/n] :")
    salir = StdIn.readLine()
  }


}
