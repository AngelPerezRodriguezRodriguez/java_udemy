
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
        objetos de la clase que hemos definido.
        
        Estamos mandando a llamar el constructor "Persona()" predeterminado,
        que, aunque no lo definidos en nuestra clase "Persona", lo podemos 
        visualizar a través de la ventana "Navigator".
        
        El constructor nos va a permitir asignar valores al objeto desde el 
        momento de la creación del mismo y nos permite reservar memoria: las 
        variables "clienteUno" y los objetos "new Persona()" se almacenan en 
        distintas partes de la memoria
        
        El constructor "Persona()" es un método especial que permite reservar
        memoria para la creación y almacenamiiento del objeto. Una vez que se 
        crea el objeto en memoria, regresa la referencia donde se a creado este 
        objeto en memoria, esa referencia se le asigna a la variable "clenteUno"
        */
        
        clienteUno.nombre = "Angel";
        clienteUno.apellido = "Pérez";
        
        clienteUno.desplegarInformacion();
    }
}
