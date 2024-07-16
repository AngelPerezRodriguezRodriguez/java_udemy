package test;

import paqueteClases.ClaseProtected;

public class ClaseProtectedHija extends ClaseProtected {

    public ClaseProtectedHija() {

        // Constructor 'protected'
        super();

        // Atributo 'protected'
        this.atributoProtected = "Modificación del atributo protected";
        System.out.println(this.atributoProtected);

        // Método 'protected'
        this.metodoProtected();
    }
}
