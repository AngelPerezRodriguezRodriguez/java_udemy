
import java.util.Scanner;
// Dentro de la paquetería java.util vamos a importar la clase Scanner para su uso

/**
 * Sección 2: Fundamentos java: variables en java
 * 
 * 12. Ejercicio: clase Scanner en java
 * 
 * @author Angel P.
 */

public class ClaseScanner {

    public static void main(String[] args) {
        /*
        1. Usamos la clase "Scanner" que ya está definida dentro de las 
        clases de JAVA
        
        2. Definimos el nombre de nuestra variable
        
        3. Para poder leer información de la consola creamos un nuevo objeto
        de la clase "Scanner"
        
        4. Con el parámetro o argumento "System.in" vamos a leer información
        de la consola. "System" es una clase de JAVA que nos va a permitir 
        ingresar a la consola a través de la variable "in" que proviene de 
        "input", es decir "entrada"
         */
        Scanner consola = new Scanner(System.in);
        String comida;
        String animal;

        System.out.println("Escriba su comida favorita: ");
        /*
        El método "nexLine" nos va a permitir leer una linea completa de la
        consola. El programa se va a detener hasta recibir información de la 
        consola, es decir, del usuario; para posteriormente almacenarse en 
        nuestra variable
        */
        comida = consola.nextLine();
        System.out.println("¡Pronto tendremos " + comida + " en nuestro menú!");
        
        System.out.println("Ecribe tu animal favorito: ");
        animal = consola.nextLine();
        System.out.println("¡Pronto tendremos un " + animal + " en el ZOO!");
    }
}
