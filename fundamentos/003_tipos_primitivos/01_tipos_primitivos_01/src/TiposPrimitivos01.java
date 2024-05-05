
/**
 * Sección 3: Fundamentos java: tipos primitivos en java
 * 
 * 14. Tipos primitivos en java
 * 15. Tipos numéricos enteros
 * 16. Ejercicio: tipos primitivos tipos flotantes
 * 17. Ejercicio: inferencia de tipos con var y tipos primitivos
 * 
 * @author Angel P.
 */

public class TiposPrimitivos01 {

    public static void main(String[] args) {
        //TIPOS PRIMITIVOS ENTEROS

        //byte
        byte ejemploByte = 125;
        System.out.println("ejemploByte: " + ejemploByte);

        /*
        Para conocer su VALOR MÁXIMO Y MÍNIMO concatenamos:
        
        <clase>.<constante MIN_VALUE ó MAX_VALUE>
        Una constante es una variable que una vez asignada un valor ya no puede
        modificarse
         */
        System.out.println("Valor mínimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo byte:  " + Byte.MAX_VALUE);
        /*
        De ingresar un valor mayor al permitido se nos mostrará un error. Para
        ello debemos de realizar la conversión utilizando la siguiente sintaxis:
         */
        ejemploByte = (byte) 130;
        //Sin embargo, se van a presentar IMPRECISIONES por la conversión:
        System.out.println("ejemploByte conversión imprecisa: " + ejemploByte);

        //short
        short ejemploShort = 10500;
        System.out.println("ejemploShort: " + ejemploShort);
        System.out.println("Valor mínimo short: " + Short.MIN_VALUE);
        System.out.println("Valor mínimo short:  " + Short.MAX_VALUE);

        //int
        int ejemploInt = 2147483647;
        System.out.println("ejemploInt: " + ejemploInt);
        System.out.println("Valor mínimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor mínimo int:  " + Integer.MAX_VALUE);
        /*
        De ingresar un valor mayor al permitido no solo va a ser necesaria la 
        sintaxis ya vista, también debemos usar un tipo long "L" al final del 
        número. Esto de debe a que también hemos excedido el valor de la literal
        y debemos ampliarlo.
        
        Sin embargo, se van a presentar IMPRECISIONES por la conversión:
         */
        ejemploInt = (int) 2147483648L;
        System.out.println("ejemploInt conversión imprecisa: " + ejemploInt);

        //long
        //En este caso también superamos el valor de la literal
        long ejemploLong = 9223372036854775807L;
        System.out.println("ejemploLong: " + ejemploLong);
        System.out.println("Valor mínimo long: " + Long.MIN_VALUE);
        System.out.println("Valor mínimo long:  " + Long.MAX_VALUE);
        /*
        Ahora el problema al ingresar un valor mayor la permitido es que ya no
        podemos usar una un tipo long "L" al final para extender el valor de la 
        literal, pues también la hemos superado. 
        
        En este caso tenemos que usar un tipo flotante "F" o un tipo double "D"
         */
        ejemploLong = (long) 9223372036854775808F;
        //Sin embargo, se van a presentar IMPRECISIONES por la conversión:
        System.out.println("ejemploLong conversión imprecisa: " + ejemploLong);

        /*
        TIPOS PRIMITIVOS FLOTANTES
        
        float
        En JAVA por default las literales de punto flotante, cifras con punto 
        decimal, se reconocen como tipo double. Por lo tanto debemos de realizar 
        la conversión:
         */
        float ejemploFloat = 3.1416F;
        System.out.println("ejemploFloat: " + ejemploFloat);
        //También puede ser de la forma:
        ejemploFloat = (float) 9.81;
        System.out.println("ejemploFloat: " + ejemploFloat);

        ejemploFloat = 3.4028235E38F;
        System.out.println("ejemploFloat: " + ejemploFloat);
        System.out.println("Valor mínimo float: " + Float.MIN_VALUE);
        System.out.println("Valor mínimo float: " + Float.MAX_VALUE);
        /*
        De ingresar un valor mayor al permitido debemos utilizar un tipo 
        double "D" al final del número:
         */
        ejemploFloat = (float) 3.4028236E38D;
        /*
        Sin embargo, se van a presentar IMPRECISIONES por la conversión, 
        mostrando el mensaje "infinity" al no poder asignar el valor de manera 
        correcta y por lo tanto el compilador ya no supo interpretar este valor
         */
        System.out.println("ejemploFloat: " + ejemploFloat);

        /*
        double
        Como lo hemos mencionado anteriormente, por default las literales de 
        punto flotante se reconocen como tipo double. Por lo tanto no es 
        necesario realizar la conversión y está de más agregar la "D" al final
         */
        double ejemploDouble = 1.7976931348623157E308;
        System.out.println("Valor mínimo double: " + Double.MIN_VALUE);
        System.out.println("Valor mínimo double: " + Double.MAX_VALUE);

        /*
        Tanto para tipos primitivos enteros como flotantes, podemos utilizar
        la palabra reservada "var"
         */
    }
}
