package clases;

/**
 *
 * @author Angel P.
 */
 
public class Persona {
    
    //ATRIBUTOS
    public String nombre;
    public String apellido;
    /*
     * Debemos definir el modificador de acceso como public
     * para poder acceder a ellos desde otra clase. Esta no 
     * es la mejor forma de hacerlo, solo es para efectos del
     * ejercicio.
     */
    
    //MÉTODOS
    public void desplegarInformacion() {
        System.out.printf("%nNombre: %s%n",nombre);
        System.out.printf("Apellido: %s%n",apellido);
    }
}
