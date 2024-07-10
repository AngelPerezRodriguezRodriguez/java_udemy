package test;

import domain.Persona;

public class TestPersona {

    public static void main(String[] args) {

        Persona persona01 = new Persona();
        persona01.getIdPersona();
        System.out.println(persona01);
        /*
         * Ejecución de bloque estático
         * Ejecución de bloque no estático
         * Ejecución del constructor
         * Persona [idPersona=1]
         */

        Persona persona02 = new Persona();
        persona02.getIdPersona();
        System.out.println(persona02);
        /*
         * Ejecución de bloque no estático
         * Ejecución del constructor
         * Persona [idPersona=2]
         */
    }
}
