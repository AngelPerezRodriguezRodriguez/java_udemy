package test;

import domain.*;

/*
 * INSTANCE OF
 * 
 * Es un operador en Java que se utiliza para verificar 
 * si un objeto es una instancia de una clase específica 
 * o de una de sus subclases. Este operador también se 
 * puede utilizar para verificar si un objeto implementa 
 * una interfaz específica.
 */

public class TestInstanceOf {

    public static void main(String[] args) {

        // Tipo de variable 'Empleado'
        // Tipo de objeto 'Empleado'
        Empleado empleado01 = new Empleado("Alejandro", 20000);
        determinarTipo(empleado01);

        // Tipo de variable 'Empleado'
        // Tipo de objeto 'Gerente'
        empleado01 = new Gerente("Erik", 15000, "Informática");
        determinarTipo(empleado01);
    }

    // No sólo va a responder verdadero al tipo
    // especificado, sino también a los tipos padre
    public static void determinarTipo(Empleado empleado) {

        if (empleado instanceof Gerente) {
            System.out.println("Tipo Gerente");

            /*
             * Convertimos el tipo de variable 'Empleado' (padre)
             * a un tipo de variable 'Gerente' (hijo) para que el
             * tipo de objeto 'Gerente' pueda acceder a su método.
             */
            System.out.println(((Gerente) empleado).getDepartamento());
        }

        if (empleado instanceof Empleado) {
            System.out.println("Tipo Empleado");

            // Error en tiempo de compilación
            // Gerente gerente = (Gerente) empleado;
            // gerente.getDepartamento();

            // Sólo tenemos acceso a los métodos de la clase 'Empleado'
            System.out.println(empleado.getNombre());
            System.out.println(empleado.getSueldo());
        }

        if (empleado instanceof Object) {
            System.out.println("Tipo Object");

            // Sólo tenemos acceso a los métodos de la clase 'Object'
            System.out.println(empleado.toString());
        }
    }
}
