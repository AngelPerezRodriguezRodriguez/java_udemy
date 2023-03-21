package operaciones;

/**
 *
 * @author Angel P.
 */

public class PruebaAritmetica {
    public static void main(String[] args) {
        // Los meotos 'static' sólo puede mandar a llamar otros métodos 'static'

        int a = 10;
        int b = 30;

        /*
         * Las variables localesa sólo se usan en el método que se definen y
         * se debe inicializar, además NO pueden ser ocupadas en otro método.
         * 
         * Las variables que definamos dentro del método main se conocen como
         * variables locales a este método. Se crean dentro de este método y se
         * destruyen cuando termina de ejecutarse.
         * 
         * 'var' solo puede utilizarse cuando trabajamos con variables locales.
         * No podemos usarla cuando declaramos atributos de una clase. Tampoco
         * para declarar los argumentos de un método.
         */

        otroMetodo();

        Aritmetica aritmeticaDos = new Aritmetica();

        System.out.println(aritmeticaDos.a);
        System.out.println(aritmeticaDos.b);

        Aritmetica aritmeticaTres = new Aritmetica(a, b);
        System.out.println(aritmeticaTres.a);
        System.out.println(aritmeticaTres.b);
    }

    public static void otroMetodo() {
        System.out.println("Otro método...");
        
        // a = 50;
        // La variable 'a' se crea y destruye dentro del método main,
        // por lo tanto, no puede ser ocupada en otro método.
    }
}
