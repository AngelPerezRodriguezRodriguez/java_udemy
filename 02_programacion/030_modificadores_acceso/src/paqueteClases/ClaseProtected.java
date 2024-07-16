package paqueteClases;

/*
 * PROTECTED
 * 
 * Es accesible dentro de su propio paquete 
 * y por clases derivadas (subclases), 
 * incluso si están en paquetes diferentes.
 */

public class ClaseProtected {

    // ATRIBUTO
    protected String atributoProtected = "Atributo protected";

    // CONSTRUCTOR
    protected ClaseProtected() {
        System.out.println("Constructor protected");
    }

    // MÉTODO
    protected void metodoProtected() {
        System.out.println("Método protected");
    }
}
