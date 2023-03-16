
import java.util.Scanner;

/**
 * Sección 5: fundamentos java: sentencias de control
 *
 * 33. Sentencia de control if - else en java 34. Ejercicio: if - else en java
 * 35. Ejercicio: cálculo estación del año con if - else
 *
 * @author Angel P.
 */

public class IfElse {

    public static void main(String[] args) {
        /*
        Las comprobaciones son con EXPRESIONES booleanas 
        
        EJEMPLO uno
         */
        boolean condicion = true;

        if (condicion) {
            System.out.println("La condición es verdadera...");
            System.out.println("Nueva linea de código");
        } else {
            System.out.println("La condiciónes falsa...");
        }

        //EJEMPLO dos
        int numero = 4;
        String numeroTexto = "número fuera de rango";

        /*
        Con "else if" cuando se satisface la condición: la sentencia de control
        se detiene, es decir, ya no se evaluan las posteriores condiciones; caso
        en el que ocurre todo lo contrario al utilizar solamente sentencias "if"
         */
        if (numero == 1) {
            numeroTexto = "número 1";
        } else if (numero == 2) {
            numeroTexto = "número 2";
        } else if (numero == 3) {
            numeroTexto = "número 3";
        } else if (numero == 4) {
            numeroTexto = "número 4";
        }//else {
//        numeroTexto = "número fuera de rango";
//      }
        System.out.println("Se ha ingresado: " + numeroTexto);

        //EJEMPLO tres
        Scanner consola = new Scanner(System.in);
        int mes;
        String mesTexto = "no has ingresado un mes válido";

        System.out.println("Ingresa el número del mes: ");
        mes = Integer.parseInt(consola.nextLine());

        if (mes == 1 || mes == 2 || mes == 12) {
            mesTexto = "nos encontramos en invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            mesTexto = "nos encontramos en primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            mesTexto = "nos encontramos en verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            mesTexto = "nos encontramos en otoño";
        }//else {
//        mesTexto = "no has ingresado un mes válido";
//      }
        System.out.println("Estación del año: " + mesTexto);
    }
}
