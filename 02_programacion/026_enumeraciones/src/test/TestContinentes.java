package test;

import enumeracion.Continentes;

public class TestContinentes {

    public static void main(String[] args) {

        System.out.println("1er continente: " + Continentes.AFR);
        System.out.println("No. países: " + Continentes.AFR.getPaises());
        System.out.println("Nombre: " + Continentes.AFR.getNombre());

        System.out.println("2do continente: " + Continentes.EUR);
        System.out.println("No. países: " + Continentes.EUR.getPaises());
        System.out.println("Nombre: " + Continentes.EUR.getNombre());
    }
}
