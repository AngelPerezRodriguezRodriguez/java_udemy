package test;

/*
 * ARGUMENTOS VARIABLES
 * 
 * Permiten definir un método que puede aceptar un número 
 * variable de argumentos, proporcionando flexibilidad.
 * 
 * Consideraciones:
 * 
 * 1. Utilizar '...' después del tipo de dato.
 * 
 * 2. Los argumentos deben ser del mismo tipo.
 * 
 * 3. Ser el último argumento del método.
 */

public class TestArgumentosVariables {

    public static void main(String[] args) {

        imprimirArgVariables(1, 2);
        imprimirArgVariables(3, 4, 5);

        imprimirParametros("Angel", 6, 7, 8, 9);
    }

    private static void imprimirArgVariables(int... numeros) {

        System.out.println("Arg. variables: ");

        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("números, índice %d: %d %n", i, numeros[i]);
        }
    }

    private static void imprimirParametros(String nombre, int... numeros) {

        System.out.println(nombre);

        imprimirArgVariables(numeros);
    }
}
