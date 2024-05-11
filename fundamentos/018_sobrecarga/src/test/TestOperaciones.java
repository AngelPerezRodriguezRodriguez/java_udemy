package test;

import domain.Operaciones;

public class TestOperaciones {

    public static void main(String[] args) {

        int resultado01 = Operaciones.sumar(5, 3);
        System.out.println(resultado01);

        double resultado02 = Operaciones.sumar(5.0, 3);
        System.out.println(resultado02);

        double resultado03 = Operaciones.sumar(5, 2L);
        System.out.println(resultado03);
    }
}
