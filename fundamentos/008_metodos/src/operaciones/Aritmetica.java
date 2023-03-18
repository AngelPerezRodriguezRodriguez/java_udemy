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
     * el operador this es una palabra reservada que se crea de forma automática en
     * el momento que se ejecuta un nuevo objeto. Es una variable que apunta al
     * objeto que se está ejecutando en ese momento.
     * 
     * this puede acceder a los atributos o métodos del objeto...
     * 
     * this solo existe dentro dentro de la clase y apunta al objeto...
     * 
     * usar este operador es opcional, pero es una práctica común
     */

    // MÉTODOS
    public void sumar() {
        int resultado = this.a + this.b;
        // 'resultado' es una variable local

        System.out.println("No retorno: " + resultado);
    }

    public int sumarRetorno() {
        return this.a + this.b;
        /*
         * int resultado = a + b;
         * return resultado;
         */
    }

    public int sumarArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        /*
         * El argumento a se asigna al atributo this.a
         * El argumento b se asigna al atributo this.b
         * Modificamos los atributos de la clase con los argumentos (variables locales)
         * No es una forma común de modificar los atributos
         */

        return this.sumarRetorno();
        // return a + b;
        // Pero podemos usar el método que ya hace la suma
    }
}
