package test;

import domain.Persona;

/*
 * FOR-EACH
 * 
 * Es una estructura de control que se utiliza para iterar sobre elementos 
 * en una colección, como arrays o clases que implementan la interfaz 'Iterable'.
 * Proporciona una forma más sencilla y legible de recorrer elementos en una 
 * colección en comparación con el bucle 'for' tradicional.
 */

public class TestForEach {

    public static void main(String[] args) {

        // 'var' sólo se puede utilizar para variables
        // de tipo primitivo u 'Object', más no de tipo 'Arrays'

        int edades[] = { 5, 6, 7, 8, 9, 10 };

        Persona personas[] = { new Persona("Eduardo"), new Persona("Carla"), new Persona("Naomi") };

        for (int edad : edades) {

            System.out.println(edad);
        }

        // Una clase de tipo padre puede almacenar
        // referencias de tipo hijo, más no al revés
        for (Persona persona : personas) {

            System.out.println(persona);
        }
    }
}
