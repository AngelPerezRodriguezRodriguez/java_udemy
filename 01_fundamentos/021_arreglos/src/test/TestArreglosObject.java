package test;

import domain.Persona;

public class TestArreglosObject {

    public static void main(String[] args) {

        // La variables de tipo 'Object'
        // poseen 'null' como valor por default
        Persona personas[] = new Persona[2];

        personas[0] = new Persona("Sebastian");
        System.out.println("personas, índice 0: " + personas[0]);

        personas[1] = new Persona("Rosy");
        System.out.println("personas, índice 1: " + personas[1]);

        for (int i = 0; i < personas.length; i++) {

            System.out.printf("personas, índice %d: %s %n", i, personas[i]);
        }
    }
}
