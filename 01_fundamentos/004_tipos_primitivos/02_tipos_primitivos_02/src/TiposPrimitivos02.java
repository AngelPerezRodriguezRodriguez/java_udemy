/*
 * Sección 4: Fundamentos java: tipos primitivos en java
 * 
 * 19. Ejercicio: tipos primitivos tipo char
 * 20. Ejercicio: tipos primitivos tipo boolean
 */

public class TiposPrimitivos02 {

    public static void main(String[] args) {

        /*
         * CHAR
         * 
         * Almacena solamente un carácter. Es de 16 bits, la misma cantidad que un
         * 'short'. Además de almacenar un carácter también almacena valores decimales.
         */
        char ejemploChar = 'A';
        System.out.println("ejemploChar: " + ejemploChar);

        /*
         * También podemos hacemos uso de los valores del código Unicode.
         * 
         * Podemos hacerlo a través de su equivalente en código, decimal o
         * símbolo, que es el más común. Las dos primeras opciones son en caso de
         * necesitar un carácter especial que no podemos obtener directamente del
         * teclado.
         */
        char codigoUnicode = '\u0021';
        System.out.println("códigoUnicode: " + codigoUnicode);

        char decimalUnicode = 33;
        System.out.println("decimalUnicode: " + decimalUnicode);

        char simboloUnicode = '!';
        System.out.println("símboloUnicode: " + simboloUnicode);

        // Haciendo uso de la palabra reservada 'var'
        char codigoUnicodeVar = '\u0021';
        // var codigoUnicodeVar = '\u0021';
        System.out.println("códigoUnicodeVar: " + codigoUnicodeVar);

        // Realizamos una conversión para imprimir el símbolo que queremos
        char decimalUnicodeVar = (char) 33;
        // var decimalUnicodeVar = (char) 33;
        System.out.println("decimalUnicodeVar: " + decimalUnicodeVar);

        char simboloUnicodeVar = '!';
        // var simboloUnicodeVar = '!';
        System.out.println("símboloUnicodeVar: " + simboloUnicodeVar);

        /*
         * Un tipo 'char' se puede convertir a un tipo 'int'. De hacer esta
         * conversión que sucede de forma automática, ya que un tipo 'char' ocupa
         * 16 bits y un tipo 'int' ocupa 32 bits, la impresión nos mostrará su
         * equivalente en código decimal de Unicode.
         */
        int mayuscula = 'A';
        System.out.println("mayúscula: " + mayuscula);
        // Su equivalente es '65' en código decimal de Unicode

        int minuscula = 'a';
        System.out.println("minúscula: " + minuscula);
        // Su equivalente es '97' en código decimal de Unicode

        /*
         * BOOLEAN
         * 
         * Almacena únicamente los valores de 'true' o 'false'. Son de gran
         * utilidad en nuestros algoritmos.
         */
        boolean ejemploBoolean = true;
        System.out.println("ejemploBoolean: " + ejemploBoolean);

        // Un 'boolean' dentro de una condicional
        if (ejemploBoolean) {
            System.out.println("El boolean es true");
        } else {
            System.out.println("El boolean es falso");
        }

        byte edad = 22;
        boolean permiso = 22 >= 18;

        System.out.println("edad: " + edad);

        if (permiso) {
            System.out.println("¡Puedes ir a un bar!");
        } else {
            System.out.println("Debes quedarte en casa...");
        }
    }
}
