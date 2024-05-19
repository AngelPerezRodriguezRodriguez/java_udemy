package paso_valor;

public class PasoValor {

    public static void main(String[] args) {

        int x = 10;

        /*
         * Paso por valor
         * 
         * Los tipos primitivos únicamente pasan una copia de su valor al
         * resto de métodos. Una vez que pasemos un valor de tipo primitivo
         * hacia otro método, simplemente se pasa la copia de ese valor.
         */
        System.out.println("Antes" + x);
        cambiarValor(x);
        System.out.println("Después: " + x);
    }

    public static void cambiarValor(int numero) {
        numero = numero + 30;
    }
}
