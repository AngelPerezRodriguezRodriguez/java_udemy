
/**
 * Sección 2: Fundamentos java: variables en java
 * 
 * 10. Ejercicio: concatenación en java
 * 11. Ejercicio: caracteres especiales con java
 * 
 * @author Angel P.
 */

public class Concatenacion {

    public static void main(String[] args) {
        String nombre = "Angel Pérez";
        String titulo = "Ingeniero";

        /*
        El operador "+" no solo nos va a permitir sumar números sino nos va a
        permitir concatenar cadenas
         */
        String union = titulo + " " + nombre;
        System.out.println(union);

        /*
        Suma de números: PRIMER CASO
        Se realiza la suma
         */
        int primerNu = 5;
        int segundoNu = 7;
        System.out.println("Primer caso: " + primerNu + segundoNu);

        /*
        Suma de números: SEGUNDO CASO
        Primero se realiza la suma y luego la concatenación
         */
        System.out.println("Segundo caso: " + primerNu + segundoNu + nombre);

        /*
        Suma de números: TERCER CASO
        No se realiza la suma
         */
        System.out.println("Tercer caso: " + nombre + primerNu + segundoNu);
        /*
        CONTEXTO CADENA
        En una expresión evaluada de izquierda a derecha, si al principio se 
        encuentra una cadena, entonces el resto de la expresión lo va a tomar 
        como una cadena
         */
        System.out.println("Tercer caso: " + primerNu + segundoNu + nombre
                + primerNu + segundoNu);

        /*
        Suma de números: CUARTO CASO
        Al insertar paréntesis estamos modificando la prioridad de la evaluación
        de la expresión. Se priorizan las operaciones que estén dentro de los 
        paréntesis
         */
        System.out.println("Cuarto caso: " + nombre + (primerNu + segundoNu));

        System.out.println("Cuarto caso: " + (primerNu + segundoNu) + nombre
                + (primerNu + segundoNu));

        //CARACTERES ESPECIALES
        String libro = "El Lobo Estepario";
        System.out.println("Nueva linea: \n" + libro);
        System.out.println("Tabulador: \t" + libro);
        System.out.println("Retroceso: \b" + libro);
        System.out.println("Retroceso: \b\b" + libro);
        System.out.println("Diagonal invertida: " + "\\" + libro + "\\");
        
        System.out.println("Comillas simple: " + "\'" + libro + "\'");
        //Para usar comillas simples no es necesaria la diagonal
        System.out.println("Comillas simple: " + "'" + libro + "'");
        //Pero sí es necesaria para las comillas dobles
        System.out.println("Comillas simple: " + "\"" + libro + "\"");
    }
}
