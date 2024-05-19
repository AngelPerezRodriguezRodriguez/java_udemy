package clases;
 
public class Persona {
    
    /*
     * ATRIBUTOS
     * 
     * Debemos definir el modificador de acceso como 'public'
     * para poder acceder a ellos desde otra clase. Esta no 
     * es la mejor forma de hacerlo, sólo es para efectos del
     * ejercicio.
     */
    public String nombre;
    public String apellido;
    
    //MÉTODO
    public void desplegarInformacion() {
        System.out.printf("%nNombre: %s%n",nombre);
        System.out.printf("Apellido: %s%n",apellido);
    }
}
