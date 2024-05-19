package paso_referencia;
// Primero definimos el 'package'

import clases.Persona;
// Luego los 'imports'

/*
 * Todas las clases en JAVA van a heredar de la clase 'Object' (extends Object).
 * Por lo tanto, todas las clases son de tipo 'Object', ya que es la clase padre 
 * de todas las clases en JAVA.
 */

public class PasoReferencia {

    public static void main(String[] args) {

        Persona personaUno = new Persona();
        personaUno.nombre = "Angel";

        /*
         * Paso por referencia
         * Paso por valor por referencia
         * 
         * Cuando trabajamos con objetos lo que almacenan las variables son referencias
         * a dichos objetos, por lo tanto, no es lo mismo que un tipo primitivo el cual
         * sólo almacena un valor y no una referencia en memoria.
         * 
         * Lo que va a recibir el argumento del método 'cambiarValor' va a ser la
         * referencia en memoria del objeto. Por lo tanto, ambas variables están
         * referenciando o apuntando al mismo objeto y vamos a poder modificar los
         * atributos del objeto al que se está referenciando.
         */
        System.out.println(personaUno.nombre);
        cambiarValor(personaUno);
        System.out.println(personaUno.nombre);
    }

    public static void cambiarValor(Persona persona) {
        persona.nombre = "Eduardo";
    }
}
