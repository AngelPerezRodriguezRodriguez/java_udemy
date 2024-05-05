package palabra_this;

public class PalabraThis {

    public static void main(String[] args) {

        Persona personaUno = new Persona("Sebastian", "Rodríguez");
        /*
         * new String("Sebastian")
         * 
         * Podemos asegurarnos que estamos creando un objeto String
         * en una ubicación de memoria ÚNICA, pero no es lo más común.
         * new String("Juan") y new String("Juan") apuntan a diferentes referencias
         * en memoria.
         * 
         * "Rodríguez"
         * 
         * Java utiliza un espacio de memoria que se conoce como Pull String, este
         * espacio es memoria es un conjunto de cadenas que se administran con el
         * objetivo de ocupar la menor cantidad de información en la memoria.
         * "Juan" y "Juan" apuntan a la misma referencia en memoria del objeto 
         * que sea ha creado en Pull String.
         */

        System.out.printf("\nPersona desde main:\n%s\n", personaUno);
        // Paquete, clase y posición de memoria

        System.out.println(personaUno.nombre);
        System.out.println(personaUno.apellido);
    }
}

/*
 * En un archivo solo podemos tener una clase de tipo pública.
 * 
 * Si se omite el modificador de acceso de la clase o método, se usa el por
 * defecto llamado DEFAULT o PACKAGE pero no es necesario escribirlo, de hecho,
 * si usamos default se mostrará un error de compilación.
 * 
 * Implica que sólo se podrá acceder a la clase o método dentro de las clases
 * definidas dentro del mismo paquete.
 */

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        super();
        /*
         * Toda clase hereda de la clase Object, la clase padre.
         * 
         * super() manda a llamar al constructor de la clase padre, el cuál se
         * encarga de reservar el espacio en memoria. Tiene que ser la primera
         * línea de nuestro constructor, aunque no lo veamos se manda a llamar
         * de forma implícita.
         * 
         * This es una variable que apunta al objeto que se ha creado con la
         * llamada del constructor de la clase Object.
         */

        this.nombre = nombre;
        this.apellido = apellido;

        System.out.printf("\nthis desde Persona:\n%s\n", this);
        // This apunta al objeto que se está ejecutando en el momento (tipo Persona),
        // es decir, el momento en el que se manda a llamar el constructor de la clase.

        new Imprimir().imprimir(this);
        // No es necesario asignar la referencia de memoria a una variable.
    }
}

class Imprimir {

    Imprimir() {
        super();
    }

    public void imprimir(Persona persona) {
        System.out.printf("\nPersona desde imprimir:\n%s\n", persona);

        System.out.printf("\nthis desde imprimir:\n%s\n", this);
        // Imprime el objeto que se está ejecutando en el momento (tipo Imprimir)
    }
}