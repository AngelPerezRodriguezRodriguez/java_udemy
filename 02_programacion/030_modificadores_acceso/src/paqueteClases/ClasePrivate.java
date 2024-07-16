package paqueteClases;

/*
 * PRIVATE
 * 
 * Sólo es accesible dentro de la misma clase. 
 * No puede ser accedido directamente desde 
 * ninguna otra clase.
 */

public class ClasePrivate {

    // ATRIBUTO
    private String atributoPrivate = "Atributo private";

    // CONSTRUCTORES
    private ClasePrivate() {
        System.out.println("Constructor private");
    }

    public ClasePrivate(String argumento) {
        this();
        System.out.println(argumento);
    }

    // MÉTODOS DE ACCESO
    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }

    // MÉTODO
    private void metodoPrivate() {
        System.out.println("Método private");
    }
}
