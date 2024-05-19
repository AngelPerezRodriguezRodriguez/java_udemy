package test;

import domain.Persona;

/*
 * Si no se utilizan las clase importadas, entonces nunca se cargan en memoria.
 */

public class TestPersona {

    public static void main(String[] args) {

        Persona persona01 = new Persona("Bruno", 15000, false);

        // La única forma de acceder a los atributos es a través de
        // los métodos de acceso get y set
        System.out.println("Nombre constructor: " + persona01.getNombre());
        System.out.println("Sueldo constructor: " + persona01.getSueldo());
        System.out.println("Eliminado constructor: " + persona01.isEliminado());

        // También a través del método de acceso 'toString'.
        // El método 'print' manda a llamar automáticamente el método 'toString'
        System.out.println("persona 01: " + persona01.toString());
        System.out.println("persona 01: " + persona01);

        persona01.setNombre("Juan Carlos");
        persona01.setSueldo(5000);
        persona01.setEliminado(true);

        System.out.println("Nombre actualizado: " + persona01.getNombre());
        System.out.println("Sueldo actualizado: " + persona01.getSueldo());
        System.out.println("Eliminado actualizado: " + persona01.isEliminado());

        System.out.println("persona 01: " + persona01.toString());
        System.out.println("persona 01: " + persona01);

        /*
         * La siguientes líneas ya no son efectivas:
         * 
         * persona01.nombre("Juan Carlos");
         * System.out.println(persona01.nombre);
         */
    }
}
