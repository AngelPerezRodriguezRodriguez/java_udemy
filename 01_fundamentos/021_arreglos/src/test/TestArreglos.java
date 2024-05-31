package test;

public class TestArreglos {

    public static void main(String[] args) {

        /*
         * Es más común que los corchetes se coloquen después del nombre de
         * la variable, también que el nombre del arreglo sea en plural.
         * 
         * Para instanciar un arreglo usamos la palabra reservada 'new'
         * ya que son de tipo 'Object', es decir, heredan de dicha clase.
         * Después indicamos el tipo de dato a utilizar y entre corchetes
         * la cantidad de elementos del arreglo.
         * 
         * Una vez indicado el número de elementos, el arreglo ya no puede
         * crecer. No podemos agregar elementos de manera dinámica si hemos
         * llegado al límite de los elementos declarados.
         * 
         * Si queremos utilizar una colección para agregar elementos de forma
         * dinámica, podemos utilizar una lista, un 'set' o un 'map'.
         */
        int edades[] = new int[3];

        // Imprime una dirección en memoria
        System.out.println("Arreglo edades: " + edades);

        edades[0] = 5;
        System.out.println("edades, índice 0: " + edades[0]);

        edades[1] = 10;
        System.out.println("edades, índice 1: " + edades[1]);

        edades[2] = 15;
        System.out.println("edades, índice 2: " + edades[2]);

        /*
         * Acceder a un índice fuera del rango del arreglo no genera un error
         * en tiempo de compilación, pero sí en tiempo de ejecución.
         * 
         * edades[3] = 20;
         */

        // 'length' es un atributo de la clase 'Arrays'
        for (int i = 0; i < edades.length; i++) {

            System.out.printf("edades, índice %d: %d %n", i, edades[i]);
        }

        // Podemos instanciar un arreglo e inicializar sus elementos
        // desde la creación del mismo, se le conoce como sintaxis resumida
        String frutas[] = { "naranja", "sandía", "limón" };

        for (int i = 0; i < frutas.length; i++) {

            System.out.printf("frutas, índice %d: %s %n", i, frutas[i]);
        }
    }
}
