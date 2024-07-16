package paqueteClases;

/*
 * PUBLIC
 * 
 * Es accesible desde cualquier otra clase, 
 * independientemente de si está en el mismo 
 * paquete o en un paquete diferente.
 */

public class ClasePublic {

    // ATRIBUTO
    public String atributoPublic = "Atributo public";

    // CONSTRUCTOR
    public ClasePublic() {
        System.out.println("Constructor public");
    }

    // MÉTODO
    public void metodoPublic() {
        System.out.println("Método public");
    }
}
