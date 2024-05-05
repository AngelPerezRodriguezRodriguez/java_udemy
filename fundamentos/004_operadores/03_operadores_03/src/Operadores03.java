
/**
 * Sección 4: Fundamentos java: operadores en java
 *
 * 27. Ejercicio: operadores de igualdad y relaciones en java
 * 28. Ejercicio: operadores relacionales
 * 29. Ejercicio: operadores condicionales en java
 * 30. Ejercicio: operador ternario en java
 *
 * @author Angel P.
 */

public class Operadores03 {

    public static void main(String[] args) {
        //OPERADORES DE IGUALDAD
        int a = 5, b = 10;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        //igual a 
        boolean c = a == b;
        System.out.println("a y b son iguales: " + c);

        //diferente de
        boolean d = a != b;
        System.out.println("a y b son diferentes: " + d);

        /*
        EJEMPLO con cadenas
        La igualdad no funciona de la misma forma cuando trabajamos con objetos.
        
        Si utilizamos los operadores vistos con los objetos, realmente estamos 
        comparando la referencia de la memoria del objeto que almacena la 
        variable:
         */
        String fraseUno = "Hola amigo";
        System.out.println("Frase uno: " + fraseUno);
        String fraseDos = "Adiós amigo";
        System.out.println("Frase dos: " + fraseDos);
        //No estamos comparando el contenido de las cadenas
        Boolean e = fraseUno == fraseDos;
        System.out.println("La frase uno y la frase dos son iguales: " + e);

        /*
        Revisar el COMENTARIO hecho en "ConversionPrimitivos".
        
        Si queremos comparar el contenido de la cadena,entonces hacemos uso
        del método "equals":
         */
        Boolean f = fraseUno.equals(fraseDos);
        System.out.println("La frase uno y la frase dos son iguales: " + f);

        //OPERADORES RELACIONALES
        //mayor que
        Boolean g = a > b;
        System.out.println("a es mayor que b: " + g);

        //menor que
        Boolean h = a < b;
        System.out.println("a es menor que b: " + h);

        /*
        También podemos usar: 
        1. mayor o igual que
        2. menor o igual que
        
        Revisar los EJEMPLOS "if else" en "Operadores01" y "TiposPrimitivos02"
        
        OPERADORES CONDICIONALES  
         */
        //and
        if (a > 0 && a < 15) {
            System.out.println("a es mayor que cero y menor que quince");
        } else {
            System.out.println("a no es mayor que cero y menor que quince");
        }

        //or
        boolean vacaciones = true;
        boolean descanso = false;

        if (vacaciones || descanso) {
            System.out.println("El padre puede ir al parque con su hijo");
        } else {
            System.out.println("El padre no puede estar con su hijo");
        }
        /*
        
        OPERADOR TERNARIO
        Simplifica la ya estructura ya vista "if else".
        
        Se recomienda utilizar solamente con expresiones sencillas
         */
        String valorA = a > 0 ? "a es mayor que cero" : "a es menor que cero";
        System.out.println(valorA);

        String valorB = b % 2 == 0 ? "b es par" : "b es impar";
        System.out.println(valorB);
    }
}
