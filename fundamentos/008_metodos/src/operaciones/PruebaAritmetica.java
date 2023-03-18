package operaciones;

/**
 *
 * @author Angel P.
 */

public class PruebaAritmetica {
    public static void main(String[] args) {
        // Los métodos static no pueden acceder al operador this
        
        Aritmetica aritmeticaUno = new Aritmetica();

        aritmeticaUno.a = 5;
        aritmeticaUno.b = 8;

        aritmeticaUno.sumar();

        int resultado = aritmeticaUno.sumarRetorno();
        System.out.println("Retorno: " + resultado);

        resultado = aritmeticaUno.sumarArgumentos(10, 30);
        System.out.println("Argumento: " + resultado);
    }
}
