package operaciones;

/*
 * El operador 'this' es una palabra reservada que se crea de forma automática
 * en el momento que se ejecuta un nuevo objeto. Es una variable que apunta al
 * objeto que se está ejecutando en ese momento.
 * 
 * 1. Puede acceder a los atributos o métodos del objeto.
 * 
 * 2. Sólo existe dentro de la clase y apunta al objeto.
 * 
 * 3. Usar este operador es opcional, pero es una práctica común.
 */

public class Aritmetica {

    // ATRIBUTOS
    int a;
    int b;

    // MÉTODOS
    public void sumar() {

        // 'resultado' es una variable local
        int resultado = this.a + this.b;

        System.out.println("No retorno: " + resultado);
    }

    public int sumarRetorno() {
        return this.a + this.b;
        /*
         * Opción alternativa:
         * 
         * int resultado = a + b;
         * return resultado;
         */
    }

    public int sumarArgumentos(int a, int b) {

        /*
         * El argumento 'a' se asigna al atributo 'this.a'
         * El argumento 'b' se asigna al atributo 'this.b'
         * 
         * Modificamos los atributos de la clase con los argumentos del método
         * (variables locales); no es una forma común de modificar los atributos.
         */
        this.a = a;
        this.b = b;

        return this.sumarRetorno();
        /*
         * Opción alternativa:
         * 
         * return a + b;
         * 
         * Pero podemos usar el método 'sumarRetorno'.
         */
    }
}
