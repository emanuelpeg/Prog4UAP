package model

class Juego {

  var puntaje = 0
  var unaSerie = new Serie

  def nro0 = unaSerie.secuencia(0)
  def nro1 = unaSerie.secuencia(1)
  def nro3 = unaSerie.secuencia(3)

  def esValido(nro : Int) = {
    if (nro == unaSerie.secuencia(2)) {
      puntaje = puntaje + 1
      unaSerie.regenerar()
      true
    } else {
      unaSerie.regenerar()
      false
    }
  }
}
