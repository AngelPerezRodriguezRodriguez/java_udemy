
import java.util.Scanner;

/**
 * Sección 4: fundamentos java: operadores en java
 * 
 * 31. El mayor de dos números
 * 
 * @author Angel P.
 */

public class MayorDosNumeros {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int num1, num2;
        String mayor;

        System.out.println("Ingresa un primer número: ");
        num1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingresa un segundo número: ");
        num2 = Integer.parseInt(consola.nextLine());

        mayor = num1 > num2 ? "El número mayor es: " + num1
                : "El número mayor es: " + num2;
        System.out.println(mayor);
    }
}
