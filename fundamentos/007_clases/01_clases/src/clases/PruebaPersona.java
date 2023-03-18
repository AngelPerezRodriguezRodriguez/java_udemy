
package clases;

/**
 *
 * @author Angel P.
 */

public class PruebaPersona {

    public static void main(String[] args) {
        
        Persona clienteUno = new Persona();
        //Ya podemos acceder a los atributos y métodos de la clase "Persona"
        
        /*
        new Persona()
        
        El constructor de nuestra clase "Persona" nos va a permitir crear 
        objetos de la clase que hemos definido. El método Persona() únicamente
        se puede mandar a llamar al crear objetos junto con la palabra reservada
        new.
        
        Estamos mandando a llamar el constructor "Persona()" predeterminado,
        que, aunque no lo definidos en nuestra clase "Persona", lo podemos 
        visualizar a través de la ventana "Navigator".
        
        El constructor nos va a permitir asignar valores al objeto desde el 
        momento de la creación del mismo y nos permite reservar memoria: las 
        variables "clienteUno" y los objetos "new Persona()" se almacenan en 
        distintas partes de la memoria.
        
        El constructor "Persona()" es un método especial que permite reservar
        memoria para la creación y almacenamiento del objeto. Una vez que se 
        crea el objeto en memoria, regresa la referencia donde se a creado este 
        objeto en memoria, esa referencia se le asigna a la variable "clienteUno".
        */
        
        clienteUno.nombre = "Angel";
        clienteUno.apellido = "Pérez";

        clienteUno.desplegarInformacion();


        Persona clienteDos = new Persona();

        System.out.println();
        System.out.println(clienteUno);
        System.out.println(clienteDos);
        /*
        clases.Persona@63961c42
        clases.Persona@65b54208

        Se imprime el nombre del paquete, el nombre de la clase y después de '@' 
        la referencia en memoria del objeto.

        Todas nuestras variables se almacenan en la memoria RAM y JAVA, de manera
        dinámica, reserva memoria; y la dirección de memoria es la que se asigna a
        las variables para que se pueda acceder a estos objetos según la posición de 
        memoria donde se almacenan
        */

        clienteDos.desplegarInformacion();
        /*
        Como en ningún momento especificamos los valores de los atributos de 'clienteDos'
        se asigna el valor por default, en este caso null para tipo String
        */

        clienteDos.nombre = "Carla";
        clienteDos.apellido = "Lara";

        clienteDos.desplegarInformacion();
    }
}
