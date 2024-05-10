package test;

import domain.*;

public class PruebaHerencia {

    public static void main(String[] args) {

        /*
         * Empleado empleado01 = new Empleado();
         * System.out.println(empleado01);
         * 
         * Si la clase empleado se encuentra completamente vacía, entonces
         * la impresión será la siguiente:
         * 
         * Persona [nombre=null, genero=, edad=0, direccion=null]
         * 
         * Podemos acceder a los atributos, métodos (incluyendo toString) y
         * constructores; sin embargo, los constructores no se heredan.
         */

        Empleado empleado02 = new Empleado("Juan", 5000);
        System.out.println(empleado02);

        Cliente cliente01 = new Cliente(true, "Angel", 'M', 25, "Rancho");
        System.out.println(cliente01);
    }
}
