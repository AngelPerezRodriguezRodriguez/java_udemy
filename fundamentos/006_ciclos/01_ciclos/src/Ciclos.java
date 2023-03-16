
/**
 * Sección 6: fundamentos java: ciclos en java
 *
 * 39. Ejercicio: ciclo while
 * 40. Ejercicio: ciclo do while
 * 41. Ejercicio: ciclo for
 * 42. Ejercicio: palabras break y continue en java
 * 43. Ejercicio: uso de etiquetas o labels en java
 *
 * @author Angel P.
 */

public class Ciclos {

    public static void main(String[] args) {

        //EJEMPLO ciclo while
        int contadorUno = 0;

        while (contadorUno < 3) {
            System.out.println("Contador uno: " + contadorUno);
            contadorUno++;
        }

        /*
        EJEMPLO ciclo do while
        
        A diferencia del cilo while, se va a repetir al menos una vez los que se
        ecuentre dentro del bloque del ciclo do while. 
        
        Por el contrario, en el ciclo while, si la primera vez que se evalua la 
        expresión del ciclo es falsa, entonces nunca se va a ejecutar el bloque 
        del ciclo.
         */
        int contadorDos = 0;
        do {
            System.out.println("Contador dos: " + contadorDos);
            contadorDos++;
        } while (contadorDos < 3);

        /*
        EJEMPLO ciclo for
        
        for 
        (<declaración de la variable de contador>; 
        Sólo se ejecuta una vez y al principio del uso del ciclo
        
        <condición a evaluar>;
        Se ejecuta al inicio de cada iteración
        
        <incremento de la variable de contador>)
        Se ejecuta al termino de cada iteración
         */
        for (int contadorTres = 0; contadorTres < 3; contadorTres++) {
            System.out.println("Contador tres: " + contadorTres);
        }

        /*
        break y continue 
        (sin etiqueta)
        
        "break" detiene la ejecución del bucle y salta a la primera línea del
        programa tras el bucle. Podemos encontarla dentro de un bucle o en una
        sentencia switch.
        
        "continue" se utiliza únicamente para detener la iteración actual y
        saltar a la siguiente. Debe estar siempre incluida dentro de un bucle
         */
        for (int contadorCuat = 0; contadorCuat < 3; contadorCuat++) {
            if (contadorCuat % 2 != 0) {
                continue;
            }
            System.out.println("Contador cuatro: " + contadorCuat);
        }

        /*
        break y continue 
        (con etiqueta)
        
        Una etiqueta nos va a permitir indicar a las palabras "break" y 
        "continue" ir hacia un lugar específico de nuestro programa. 
        
        Es de utlidad cuando se utlizan ciclos anidados, pudiendo romper el
        ciclo más externo.
        
        No es buena práctica utlizar este tipo de programación llamada "go to"
         */
        inicio:
        for (int contadorCinc = 0; contadorCinc < 3; contadorCinc++) {
            if (contadorCinc % 2 != 0) {
                continue inicio;
            }
            System.out.println("Contador cinco: " + contadorCinc);
        }
    }
}
