package test;

import domain.*;

/*
 * POLIMORFISMO
 * 
 * Permite que un objeto de una clase se comporte como un objeto de 
 * otra clase, siempre y cuando haya una relación de herencia entre 
 * ellas. Hay dos tipos principales de polimorfismo en Java: 
 * 
 * 1. Polimorfismo en tiempo de compilación (sobrecarga de métodos) 
 * 
 * 2. Polimorfismo en tiempo de ejecución (sobrescritura de métodos).
 * Los múltiples comportamientos dependen del tipo de clase del objeto
 * que se esté apuntando en memoria. 
 */

public class testSobrescritura {

    public static void main(String[] args) {

        Empleado empleado01 = new Empleado("Alejandro", 20000);
        imprimirDetalles(empleado01);

        empleado01 = new Gerente("Erik", 15000, "Informática");
        imprimirDetalles(empleado01);
    }

    // No hay necesidad de duplicar el método 
    // para objetos de la clase padre e hija
    public static void imprimirDetalles(Empleado empleado) {

        System.out.println(empleado.obtenerDetalles());
    }
}
