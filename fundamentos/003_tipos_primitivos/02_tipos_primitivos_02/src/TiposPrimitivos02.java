
/**
 * Sección 3: Fundamentos java: tipos primitivos en java
 * 
 * 18. Ejercicio: tipos primitivos tipo char
 * 19. Ejercicio: tipos primitivos tipo boolean
 * 
 * @author Angel P.
 */

public class TiposPrimitivos02 {

    public static void main(String[] args) {
        /*
        char
        Almacena solamente un carácter. Es de 16 bits, la misma cantidad que un
        "short". Además de almacenar un carácter también valores decimales
         */
        char ejemploChar = 'A';
        System.out.println("ejemploChar: " + ejemploChar);

        /*
        También podemos hacemos uso de los valores del CÓDIGO UNICODE.
        
        Podemos hacerlo a través de su equivalente en código, decimal o
        símbolo, que es el más común. Las dos primeras opciones son en caso de 
        necesitar carácter especial que no podemos obtener directamente del 
        teclado
         */
        char codigoUnicode = '\u0021';
        System.out.println("códigoUnicode: " + codigoUnicode);
        char decimalUnicode = 33;
        System.out.println("decimalUnicode: " + decimalUnicode);
        char simboloUnicode = '!';
        System.out.println("símboloUnicode: " + simboloUnicode);

        //Haciendo uso de la palabra reservada "var"                       
        var codigoUnicodeVar = '\u0021';
        System.out.println("códigoUnicodeVar: " + codigoUnicode);
        //Realizamos una conversión para imprimir el símbolo que queremos
        var decimalUnicodeVar = (char) 33;
        System.out.println("decimalUnicodeVar: " + decimalUnicode);
        var simboloUnicodeVar = '!';
        System.out.println("símboloUnicodeVar: " + simboloUnicode);

        /*
        Un tipo "char" se puede convertir a un tipo "int". De hacer esta 
        conversión que sucede de forma automática, ya que un tipo "char" ocupa
        16 bits y un tipo "int" ocupa 32 bits, la impresión nos mostrará su
        equivalente en código decimal de Unicode
         */
        //Su equivalente es "65" en código decimal de Unicode
        int mayuscula = 'A';
        System.out.println("mayúscula: " + mayuscula);
        //Su equivalente es "97" en código decimal de Unicode
        int minuscula = 'a';
        System.out.println("minúscula: " + minuscula);

        /*
        boolean
        Almacena únicamente los valores de true o false. Son de gran 
        utilidad en nuestros algoritmos
         */
        boolean ejemploBoolean = true;
        System.out.println("ejemploBoolean: " + ejemploBoolean);

        /*
        Un "boolean" dentro de una condicional. Equivalencias:
        
        if (ejemploBoolean == true) {
        }
        
        if (ejemploBoolean) {
        }           
        
         */
        if (ejemploBoolean) {
            System.out.println("El boolean es true");
        } else {
            System.out.println("El boolean es falso");
        }

        //EJEMPLO:
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
