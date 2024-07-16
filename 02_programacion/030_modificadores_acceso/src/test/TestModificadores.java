package test;

import paqueteClases.*;

public class TestModificadores {

    public static void main(String[] args) {

        // Clase y constructor 'public'
        ClasePublic ejClasePublic = new ClasePublic();

        // Atributo 'public'
        System.out.println(ejClasePublic.atributoPublic);

        // Método 'public'
        ejClasePublic.metodoPublic();



        // Constructor 'protected'
        // ClaseProtected ejClaseProtected = new ClaseProtected();

        // Atributo 'protected'
        // System.out.println(ejClaseProtected.atributoProtected);

        // Método 'protected'
        // ejClaseProtected.metodoProtected();

        ClaseProtectedHija ejClaseProtectedHija = new ClaseProtectedHija();



        // Clase y constructor 'package'
        // ClasePackage ejClasePackage = new ClasePackage();

        // Atributo 'package'
        // System.out.println(ejClasePackage.atributoPackage);

        // Método 'package'
        // ejClasePackage.metodoPackage();



        // Clase y constructor 'private'
        // ClasePrivate ejClasePrivate = new ClasePrivate();

        // Atributo 'private'
        // System.out.println(ejClasePrivate.atributoPrivate);

        // Método 'private'
        // ejClasePrivate.metodoPrivate();

        ClasePrivate ejClasePrivate = new ClasePrivate("Constructor public");

        ejClasePrivate.setAtributoPrivate("Modificación del atributo private");

        System.out.println(ejClasePrivate.getAtributoPrivate());
    }
}
