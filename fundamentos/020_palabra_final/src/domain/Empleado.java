package domain;

public class Empleado extends Persona {

    public static void main(String[] args) {

        Persona.sumar(5, 10);
    }

    // Sí se puede sobrescribir el método 'multiplicar'
    // de la clase padre 'Persona'
    @Override
    public void multiplicar(int a, int b) {

        System.out.println("No se realiza la operación");
    }

    /*
     * No se puede sobrescribir el método final 'restar'
     * de la clase padre 'Persona'.
     * 
     * @Override
     * public void restar(int a, int b) {
     * System.out.println("Uso del 2do método imprimir");
     * }
     */
}
