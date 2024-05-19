package clases;

public class PruebaPersona {

    public static void main(String[] args) {

        Persona clienteUno = new Persona();

        clienteUno.nombre = "Angel";
        clienteUno.apellido = "Pérez";

        clienteUno.desplegarInformacion();

        Persona clienteDos = new Persona();

        System.out.println();
        System.out.println(clienteUno);
        System.out.println(clienteDos);

        clienteDos.desplegarInformacion();

        clienteDos.nombre = "Carla";
        clienteDos.apellido = "Lara";

        clienteDos.desplegarInformacion();
    }
}
