package model

/**
 * Es necesario representar una estructura de datos en formato Json. JSON, acrónimo de JavaScript
 * Object Notation, es un formato de texto ligero para el intercambio de datos. JSON es un
 * subconjunto de la notación literal de objetos de JavaScript aunque hoy, debido a su amplia adopción
 * como alternativa a XML, se considera un formato de lenguaje independiente.
 * Los elementos en json pueden ser:
 * Los objetos en notación json comienzan con { y terminan con } y pueden tener atributos y sus
 * valores (los valores pueden ser otro elemento json) puede contener n atributos.
 * Los arreglos en json comienzan con [ y terminan con ], pueden contener n elementos json separados
 * por coma.
 * Un valor que es un cadena string.
 * Se debe poder modelar una estructura en json e imprimirlo de manera correcta.
 * Un ejemplo de una estructura en json:
 * {“company” : “Example” ,
 *    "employees":[
 *        {"firstName":"John", "lastName":"Doe"},
 *        {"firstName":"Anna", "lastName":"Smith"},
 *     ]
 * }
 */
object Main extends App {

 /* val root = new ObjectJson()
  root.add(new ValueJson("company", "Example"))

  val array = new ArrayJson();
  val aValue = new ObjectJson()

  aValue.add(new ValueJson("firstName", "John"))
  aValue.add(new ValueJson("lastName", "Doe"))
  array.add(aValue)

  val anOtherValue = new ObjectJson()
  anOtherValue.add(new ValueJson("firstName", "Anna"))
  anOtherValue.add(new ValueJson("lastName", "Smith"))
  array.add(aValue)

  root.add(array)
  print(root) */
}
