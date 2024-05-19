package paso_referencia;

import clases.Persona;

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

        // Persona uno, dos y tres apuntan al mismo objeto
    }

    public static Persona cambiarValor01(Persona persona) {

        persona.nombre = "Eduardo";

        // Retorno de un objeto
        return persona;
    }

    public static void cambiarValor02(Persona persona) {

        persona.nombre = "Citlali";

        // El compilador agrega 'return' de forma
        // implícita al ser un método tipo 'void'
        return;
    }

    public static Persona cambiarValor03(Persona persona) {

        if (persona == null) {

            // Ya no se ejecutan las líneas
            // fuera de la sentencia 'if'
            return persona;
        }
        persona.nombre = "Alejandro";
        return persona;
    }
}
