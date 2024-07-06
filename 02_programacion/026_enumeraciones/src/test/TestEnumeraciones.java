package test;

import enumeracion.*;

public class TestEnumeraciones {

    public static void main(String[] args) {

        System.out.println(Dias.DOMINGO);

        regresarDiaSemana(Dias.LUNES);
        regresarDiaSemana(Dias.MARTES);

        System.out.println(Dias.MIERCOLES);
    }

    public static void regresarDiaSemana(Dias dias) {

        switch (dias) {

            case DOMINGO:

                System.out.println("1er día de la semana: DOM");
                break;

            case LUNES:

                System.out.println("2do día de la semana: LUN");
                break;

            case MARTES:

                System.out.println("3er día de la semana: MAR");
                break;

            case MIERCOLES:

                System.out.println("4to día de la semana: MIE");
                break;

            case JUEVES:

                System.out.println("5to día de la semana: JUE");
                break;

            case VIERNES:

                System.out.println("6to día de la semana: VIE");
                break;

            case SABADO:

                System.out.println("7mo día de la semana: SAB");
                break;

            default:
                System.out.println("Día de la semana no válido");
                break;
        }
    }
}
