package test;

import domain.Persona;

/*
 * Los métodos estáticos sólo pueden utilizar otros métodos estáticos. Recordemos que 
 * el contexto estático no puede acceder al dinámico. Por lo tanto, dentro de un
 * método estático tampoco podemos utilizar el operador 'this'.
 */

public class PersonaPrueba {

    public static void main(String[] args) {

        Persona persona01 = new Persona("Juan");
        System.out.println("Persona 01: " + persona01);

        Persona persona02 = new Persona("Carla");
        System.out.println("Persona 02: " + persona02);

        Persona persona03 = new Persona("Eduardo");
        imprimir(persona03);

        Persona persona04 = new Persona("Bruno");
        imprimir(persona04);
    }

    public static void imprimir(Persona persona) {

        System.out.println(persona);
    }
}
