package operaciones;

/**
 *
 * @author Angel P.
 */

public class PruebaAritmetica {
    public static void main(String[] args) {
        /*
         * Aritmetica aritmeticaUno = new Aritmetica();
         * 
         * aritmeticaUno.a = 5;
         * aritmeticaUno.b = 8;
         * 
         * aritmeticaUno.sumar();
         * 
         * int resultado = aritmeticaUno.sumarRetorno();
         * System.out.println("Retorno: " + resultado);
         * 
         * resultado = aritmeticaUno.sumarArgumentos(10, 30);
         * System.out.println("Argumento: " + resultado);
         */

        Aritmetica aritmeticaDos = new Aritmetica();

        System.out.println(aritmeticaDos.a);
        System.out.println(aritmeticaDos.b);

        Aritmetica aritmeticaTres = new Aritmetica(10, 30);
        System.out.println(aritmeticaTres.a);
        System.out.println(aritmeticaTres.b);
    }
}
