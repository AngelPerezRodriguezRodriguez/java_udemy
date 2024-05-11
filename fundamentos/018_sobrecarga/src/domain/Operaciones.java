package domain;

public class Operaciones {

    public static int sumar(int a, int b) {
        System.out.println("sumar (int a, int b)");
        return a + b;
    }

    /*
     * Sobrecarga de métodos
     * 
     * Es definir más de una vez un mismo método, es decir, con el mismo nombre,
     * pero diferenciándose por la cantidad o tipo de argumentos. El tipo de retorno
     * puede variar, también el modificador de acceso, pero no puede ser más
     * restrictivo. Ej. si un método es de tipo 'public', la sobrecarga del método
     * no puede ser 'protected', 'private' o 'default'.
     */
    public static double sumar(double a, double b) {
        System.out.println("sumar (double a, double b)");
        return a + b;
    }
}
