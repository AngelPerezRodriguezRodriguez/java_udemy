package paso_referencia;

import clases.Persona;

/**
 *
 * @author Angel P.
 */

public class PasoReferencia {

    public static void main(String[] args) {

        Persona personaUno = new Persona();


        personaUno.nombre = "Angel";
        System.out.println(personaUno.nombre);

        Persona personaDos = cambiarValor01(personaUno);
        System.out.println(personaDos.nombre);

        cambiarValor02(personaDos);
        System.out.println(personaDos.nombre);

        Persona personaTres = cambiarValor03(personaDos);
        System.out.println(personaTres.nombre);

        // PersonaUno Dos y Tres, apuntan al mismo objeto
    }

    // Retorno de un objeto
    public static Persona cambiarValor01(Persona persona) {

        persona.nombre = "Eduardo";
        return persona;
    }

    public static void cambiarValor02(Persona persona) {

        persona.nombre = "Citlali";
        return;
        // El compilador lo agrega de forma implícita al ser
        // un método tipo void
    }

    public static Persona cambiarValor03(Persona persona) {

        if (persona == null) {
            return persona;
            // Ya no se ejecutarán el resto de líneas
        }
        persona.nombre = "Alejandro";
        return persona;
    }
}
