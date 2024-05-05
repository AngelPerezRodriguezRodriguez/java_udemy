package operaciones;

/**
 *
 * @author Angel P.
 */

public class Aritmetica {

    // ATRIBUTOS
    int a;
    int b;
    /*
     * Las variables de clase pueden usarse en cualquier método de la clase y
     * se inicializan con valores por default a menos que se indique lo contrario
     */

    // CONSTRUCTOR vacío
    public Aritmetica() {

        System.out.println("Ejecutando constructor...");
    }

    // constructor y su sobrecarga
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // MÉTODOS
    public void sumar() {
        int resultado = this.a + this.b;

        System.out.println("No retorno: " + resultado);
    }

    public int sumarRetorno() {
        return this.a + this.b;
    }

    public int sumarArgumentos(int a, int b) {
        this.a = a;
        this.b = b;

        return this.sumarRetorno();
    }
}
