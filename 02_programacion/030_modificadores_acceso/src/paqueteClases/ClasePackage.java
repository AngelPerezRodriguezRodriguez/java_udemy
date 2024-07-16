package paqueteClases;

/*
 * DEFAULT/PACKAGE
 * 
 * Si no se especifica un modificador de acceso, 
 * el miembro de la clase tiene acceso de paquete 
 * por defecto. Esto significa que el miembro es 
 * accesible solo por otras clases en el mismo 
 * paquete.
 */

class ClasePackage {

    // ATRIBUTO
    String atributoPackage = "Atributo package";

    // CONSTRUCTOR
    ClasePackage() {
        System.out.println("Constructor package");
    }

    // MÉTODO
    void metodoPackage() {
        System.out.println("Método package");
    }
}
