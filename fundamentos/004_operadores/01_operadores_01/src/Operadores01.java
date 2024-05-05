
import java.util.Scanner;

/**
 * Sección 4: Fundamentos java: operadores en java
 *
 * 23. Ejercicio: operadores aritméticos en java 
 * 24. Rectángulo
 *
 * @author Angel P.
 */

public class Operadores01 {

    public static void main(String[] args) {
        //Operadores ARITMÉTICOS
        int a = 8, b = 4;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);

        //suma 
        int suma = a + b;
        System.out.println("Suma entre a y b: " + suma);

        //resta
        int resta = a - b;
        System.out.println("Resta entre a y b: " + resta);

        //multiplicación
        int mult = a * b;
        System.out.println("Multiplicación entre a y b: " + mult);

        /*
        división
        Al ser entre dos variables de tipo entero, entonces el resultado 
        también lo será:
         */
        int div = a / b;
        System.out.println("División entre a y b: " + div);
        /*
        Si alguna de las variables es de tipo flotante, entonces el resultado
        también lo será:
         */
        float dec = (float) b / a;
        System.out.println("División entre b y a: " + dec);

        //residuo
        int res = a % b;
        System.out.println("Residuo de la división entre a y b: " + res);
        res = b % a;
        System.out.println("Residuo de la división entre b y a: " + res);

        if (a % 2 == 0) {
            System.out.println(a + " es número par");
        } else {
            System.out.println(a + " es número impar");
        }

        if (b % 2 == 0) {
            System.out.println(b + " es número par");
        } else {
            System.out.println(b + " es número impar");
        }

        //EJEMPLO rectángulo
        Scanner consola = new Scanner(System.in);
        int alto, ancho, area, perimetro;

        System.out.println("Proporciona el alto: ");
        alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho: ");
        ancho = Integer.parseInt(consola.nextLine());

        area = alto * ancho;
        System.out.println("Área: " + area);
        perimetro = (alto + ancho) * 2;
        System.out.println("Perímetro: " + perimetro);
    }
}
