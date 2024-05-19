package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        // Los métodos 'static' sólo pueden mandar a llamar otros métodos 'static'

        /*
         * Las variables locales se deben inicializar y sólo se usan en el método 
         * que se definen, es decir, no pueden ser ocupadas en otro método.
         * 
         * Las variables que definamos dentro del método 'main' se conocen como
         * variables locales a este método. Se crean dentro de este método y se
         * destruyen cuando termina de ejecutarse.
         * 
         * 'var' solo puede utilizarse cuando trabajamos con variables locales.
         * No podemos usar 'var' cuando declaramos atributos de una clase o para 
         * declarar los argumentos de un método.
         */
        int a = 10;
        int b = 30;

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
        
        /*
         * a = 50;
         * 
         * La variable 'a' se crea y se destruye dentro del método 'main',
         * por lo tanto, no puede ser ocupada en otro método.
         */
    }
}
