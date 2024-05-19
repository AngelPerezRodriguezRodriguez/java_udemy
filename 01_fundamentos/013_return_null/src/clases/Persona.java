package clases;
 
public class Persona {
    
    //ATRIBUTOS
    public String nombre;
    public String apellido;
    
    //MÉTODO
    public void desplegarInformacion() {
        System.out.printf("%nNombre: %s%n",nombre);
        System.out.printf("Apellido: %s%n",apellido);
    }
}
