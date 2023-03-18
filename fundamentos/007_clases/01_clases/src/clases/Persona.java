
package clases;
// Indica que la clase se pertenece al paquete con nombre 'clases'

/**
 *
 * @author Angel P.
 */
 
public class Persona {
    
    //ATRIBUTOS
    String nombre;
    String apellido;
    
    //MÉTODOS
    public void desplegarInformacion() {
        System.out.printf("%nNombre: %s%n",nombre);
        System.out.printf("Apellido: %s%n",apellido);
        
        /* 
        Las variables "nombre" y "apellido" no importa que no estén definidas 
        dentro de nuestro método "desplegar Informacion".
        
        Esto se debe a que "nombre" y "apellido" son atributos de nuestra clase 
        "Persona". Por lo tanto, podemos ocupar estos atributos desde cualquier
        otro método de nuestra clase
        */
    }
}
