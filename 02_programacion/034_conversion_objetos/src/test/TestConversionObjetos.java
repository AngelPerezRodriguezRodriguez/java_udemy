package test;

import domain.*;

/*
 * UPCASTING
 * 
 * Proceso de convertir una referencia de un tipo de 
 * subclase a una referencia de un tipo de superclase.
 * 
 * DOWNCASTING
 * 
 * Proceso de convertir una referencia de un tipo de 
 * superclase a una referencia de un tipo de subclase.
 */

public class TestConversionObjetos {

    public static void main(String[] args) {

        Empleado empleado01 = new Escritor("Osvaldo", 12000, TipoEscritura.CLASICO);
        System.out.println(empleado01);

        // El método 'obtenerDetalles' es común entre la clase padre e hija
        System.out.println(empleado01.obtenerDetalles());

        // El método 'getTipoEscritura' no es común entre la clase padre e hija
        // System.out.println((empleado01.getTipoEscritura());

        // Downcasting
        Escritor escritor01 = (Escritor) empleado01;
        System.out.println(escritor01.getTipoEscritura());

        // Upcasting
        Empleado empleado02 = escritor01;
        System.out.println(empleado02.obtenerDetalles());
    }
}
