package test;

import domain.*;

public class testSobrescritura {

    public static void main(String[] args) {

        Empleado empleado01 = new Empleado("Alejandro", 20000);
        System.out.println(empleado01.obtenerDetalles());

        Gerente gerente01 = new Gerente("Erik", 15000, "Informática");
        System.out.println(gerente01.obtenerDetalles());
    }
}
