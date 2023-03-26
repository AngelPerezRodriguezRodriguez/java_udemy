package clases;

/**
 *
 * @author Angel P.
 */
 
public class Persona {
    
    //ATRIBUTOS
    public String nombre;
    public String apellido;
    
    //MÉTODOS
    public void desplegarInformacion() {
        System.out.printf("%nNombre: %s%n",nombre);
        System.out.printf("Apellido: %s%n",apellido);
    }
}
