package test;

import domain.Persona;

public class TestMatricesObject {

    public static void main(String[] args) {

        // La variables de tipo 'Object'
        // poseen 'null' como valor por default
        Persona personas[][] = new Persona[2][3];

        personas[0][0] = new Persona("Hugo");
        personas[0][1] = new Persona("Pierre");
        personas[0][2] = new Persona("Daniel");

        personas[1][0] = new Persona("Jair");
        personas[1][1] = new Persona("Javier");
        personas[1][2] = new Persona("Isaac");

        imprimir(personas);
    }

    // También podemos definir el argumento como tipo 'Object'
    public static void imprimir(Persona matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.printf("Personas, índice %d,%d: %s %n", i, j, matriz[i][j]);
            }
        }
    }
}
