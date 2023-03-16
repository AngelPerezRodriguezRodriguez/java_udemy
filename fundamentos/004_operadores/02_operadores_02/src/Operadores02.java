
/**
 * Sección 4: Fundamentos java: operadores en java
 *
 * 25. Ejercicio: operadores de asignación en java
 * 26. Ejercicio: operadores unarios en java
 * 
 * 32. Ejercicio: precedencia de operadores en java
 *
 * @author Angel P.
 */

public class Operadores02 {

    public static void main(String[] args) {
        //OPERADOR DE ASIGNACIÓN

        int a = 20;

        //OPERADORES DE COMPOSICIÓN
        //suma
        a += 5; //Equivalencia a = a + 5;
        System.out.println("a: " + a);
        //resta
        a -= 5; //Equivalencia a = a - 5;
        System.out.println("a: " + a);
        //multiplicación
        a *= 5; //Equivalencia a = a * 5;
        System.out.println("a: " + a);
        //división
        a /= 5; //Equivalencia a = a / 5;
        System.out.println("a: " + a);
        //residuo
        a %= 5; //Equivalencia a = a % 5;
        System.out.println("a: " + a);

        //OPERADORES UNARIOS
        //cambio de signo
        int b = 10;
        int c = -b;
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        /*       
        negación
        Sólo aplica para variables de tipo boolean
         */
        boolean d = true;
        boolean e = !d;
        System.out.println("d: " + d);
        System.out.println("e: " + e);

        /*       
        preincremento
        Primero se incrementa la variable y luego se ocupa su valor.
        
        El primer uso que le estamos dando a la varible preincrementada "f" es 
        cuando se asigna a la variable "g". 
        
        Una vez que la variable "f" se ha preincrementado, entonces la variable
        "f" tamién se modifica
         */
        int f = 20;
        System.out.println("f <sin preincremento>: " + f);
        int g = ++f;
        System.out.println("f: " + f);
        System.out.println("g: " + g);
        System.out.println("f: " + f);
        System.out.println("g: " + g);

        /*
        postincremento
        Primero se utiliza la variable y luego se incrementa.
        
        El primer uso que le estamos dando a la varible preincrementada "h" es 
        cuando se asigna a la variable "i". Por lo tanto, el valor de la
        variable "i" va a ser el entero sin el incremento.
        
        Los usos posteriores tanto de la variale "h" como "i" van a ser con el
        valor del entero pero con el incremento
         */
        int h = 30;
        System.out.println("h <sin postincremento>: " + h);
        int i = h++;
        System.out.println("h: " + h);
        /*
        Solicitar la variable "h" en este punto, es decir en la linea de código
        87, implica que ya se han leído la linea 86 de código. Por lo tanto, ya 
        se ha hecho el primer uso de la variable con postincremento al ser
        asignada a la variable "i". 
        
        Sólo podemos visualizar el entero sin el incremento cuando solicitemos,
        sin importar el número de veces, la variable "i".       
         */
        System.out.println("i: " + i);
        System.out.println("h: " + h);
        System.out.println("i: " + i);

        int j = 40;
        System.out.println("j <sin postincremento>: " + j);
        j++;
        System.out.println("j = " + j);

        //predecremento
        int k = 50;
        System.out.println("k <sin predrecremento>: " + k);
        int l = --k;
        System.out.println("k: " + k);
        System.out.println("l: " + l);
        System.out.println("k: " + k);
        System.out.println("l: " + l);

        //postdecremento
        int m = 60;
        System.out.println("m <sin postdecremento> " + m);
        int n = m--;
        System.out.println("m: " + m);
        System.out.println("n: " + n);
        System.out.println("m: " + m);
        System.out.println("n: " + n);

        int o = 70;
        System.out.println("o sin postdecremento: " + o);
        o--;
        System.out.println("o: " + o);

        //EJEMPLO de pre y pos
        int x = 10;
        int y = 5;
        int z = ++x + y--;
        System.out.println("x: " + x);//11
        System.out.println("y: " + y);//4
        System.out.println("z: " + z);//16
    }
}
