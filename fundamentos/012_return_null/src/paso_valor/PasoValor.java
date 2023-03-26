package paso_valor;

/**
 *
 * @author Angel P.
 */

public class PasoValor {

    public static void main(String[] args) {

        int x = 10;

        System.out.println("Antes" + x);
        cambiarValor(x);
        System.out.println("Después: " + x);
    }
    
    public static void cambiarValor(int numero) {

        numero = numero + 30;
    }
}
