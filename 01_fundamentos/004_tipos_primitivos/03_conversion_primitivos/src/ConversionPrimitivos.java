import java.util.Scanner;

/*
 * Sección 4: Fundamentos java: tipos primitivos en java
 * 
 * 21. Ejercicio: conversión de tipos primitivos en java - parte 1
 * 22. Ejercicio: conversión de tipos primitivos en java - parte 2
 */

public class ConversionPrimitivos {

    public static void main(String[] args) {

        /*
         * CONVERSIÓN DE TIPO STRING A ENTERO
         * 
         * 1. Usamos la clase 'Integer'.
         * 
         * 2. Usamos su método 'parseInt' que se encuentra definido dentro de la
         * clase 'Integer'. Este método recibe el valor de una cadena y lo
         * convierte a un tipo entero, para posteriormente asignarlo al valor de la
         * variable.
         */
        int edad = Integer.parseInt("22");
        System.out.println("edad actual: " + edad);
        System.out.println("edad en 2025: " + (edad + 5));

        // Otro ejemplo, pero con 'double'
        double precioAguacate = Double.parseDouble("15.75");
        System.out.println("Precio por un aguacate: " + precioAguacate);
        System.out.println("Precio por dos aguacates: " + (precioAguacate * 2));

        // Implementación de la clase 'Scanner'
        Scanner consola = new Scanner(System.in);
        String nacimiento;
        int año;

        System.out.println("Ingresa tu año de nacimiento: ");
        nacimiento = consola.nextLine();

        año = Integer.parseInt(nacimiento);
        System.out.println("Tienes " + (2020 - año) + " años");

        // CONVERSIÓN DE TIPO ENTERO A STRING
        int edadEntero = 97;

        // El método 'valueOf' nos va a permitir recibir distintos tipos de datos
        // que podemos convertir en 'String'
        String edadString = String.valueOf(edadEntero);
        System.out.println("Tu abuelo tiene " + edadString + " años");

        // Otro ejemplo, pero con 'char'
        String palabra = "Rosa";
        System.out.println("palabra: " + palabra);

        /*
         * A nuestra cadena le podemos solicitar un carácter utilizando el método
         * 'charAt'. Sobre una cadena podemos utilizar varios métodos disponibles
         * porque no es un dato primitivo, sino referenciado o tipo 'Object';
         * específicamente, el dato referenciado 'String'.
         * 
         * El método 'charAt' nos permitirá obtener el carácter del índice
         * existente que le proporcionemos.
         * 
         * Sólo los datos de tipo 'String' contienen este método.
         */
        System.out.println("Letras:");

        char letra = palabra.charAt(0);
        System.out.println(letra);

        letra = palabra.charAt(1);
        System.out.println(letra);

        letra = palabra.charAt(2);
        System.out.println(letra);

        letra = palabra.charAt(3);
        System.out.println(letra);

        // Ejemplo de 'char' con la clase 'Scanner'
        String fruta;

        System.out.println("Ingrese una fruta:");
        fruta = consola.nextLine();

        char primeraLetra = fruta.charAt(0);
        System.out.println("La primera letra de tu fruta es: " + primeraLetra);
    }
}
