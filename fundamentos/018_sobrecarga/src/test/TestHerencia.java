package test;

import domain.*;

public class TestHerencia {

    public static void main(String[] args) {

        Empleado empleado02 = new Empleado("Juan", 5000);
        System.out.println(empleado02);

        Cliente cliente01 = new Cliente(true, "Angel", 'M', 25, "Rancho");
        System.out.println(cliente01);
    }
}
