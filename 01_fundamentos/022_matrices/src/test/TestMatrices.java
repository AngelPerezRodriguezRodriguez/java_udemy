package test;

public class TestMatrices {

    public static void main(String[] args) {

        // Al instanciar la clase 'Arrays' definimos
        // el número de renglones y de columnas
        int edades[][] = new int[3][2];

        // Imprime una dirección en memoria
        System.out.println("Matriz edades: " + edades);

        edades[0][0] = 5;
        edades[0][1] = 10;

        edades[1][0] = 15;
        edades[1][1] = 20;

        System.out.println("Edades, índice 0,0: " + edades[0][0]);
        System.out.println("Edades, índice 0,1: " + edades[0][1]);

        System.out.println("Edades, índice 1,0: " + edades[1][0]);
        System.out.println("Edades, índice 1,1: " + edades[1][1]);

        // Recorremos los renglones
        for (int i = 0; i < edades.length; i++) {

            // Recorremos las columnas
            for (int j = 0; j < edades[i].length; j++) {

                System.out.printf("Edades, índice %d,%d: %d %n", i, j, edades[i][j]);
            }
        }

        // Podemos instanciar la clase 'Arrays' e inicializar sus elementos
        // desde la creación del mismo, se le conoce como sintaxis resumida
        String frutas[][] = { { "naranja", "limón" }, { "fresa", "zarzamora" }, { "melón", "sandía", "mango" } };

        for (int i = 0; i < frutas.length; i++) {

            for (int j = 0; j < frutas[i].length; j++) {

                System.out.printf("Frutas, índice %d,%d: %s %n", i, j, frutas[i][j]);
            }
        }
    }
}
