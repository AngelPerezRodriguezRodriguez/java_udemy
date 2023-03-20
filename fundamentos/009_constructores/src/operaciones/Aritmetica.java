package operaciones;

/**
 *
 * @author Angel P.
 */

public class Aritmetica {
    /*
     * Nuestra clase debe tener dos constructores, uno vacío para poder
     * crear objetos sin inicializar los valores y otro constructor que reciba
     * argumentos para inicializar los valores desde el momento que se crea
     * nuestro objeto.
     * 
     * Un constructor sirven para crear los objetos con diferentes valores desde
     * la creación del objeto, pudiendo tener uno o varios constructores definidos
     * en nuestra clase; esto se conoce como sobrecarga de constructores.
     * 
     * Los constructores, a diferencia de los métodos, no regresan ningún
     * tipo de dato, por lo que no hay que poner ninguna palabra reservada que
     * indique retorno, incluyendo 'void'.
     * 
     * Su objetivo es construir un objeto, reservar espacio de memoria y
     * opcionalmente inicializar los atributos de nuestra clase.
     * 
     * Sobrecargar constructores implica agregar dos o más constructores a nuestra
     * clase para poder crear objetos desde un inicio asignando u omitiendo valores.
     * Si mandamos a llamar el constructor vacío, estamos OMITIENDO la
     * inicialización de valores para posteriormente hacerlo manualmente.
     * 
     * No podemos usar 'var' para definir argumentos de un método.
     * 
     * El compilador solo agrega el constructor vacío de manera automática siempre y
     * cuando no tengamos definido otro constructor. Si sobrecargamos el constructor
     * y queremos usar el constructor vacío, tendremos que agregarlo.
     */

    // ATRIBUTOS
    int a;
    int b;

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
