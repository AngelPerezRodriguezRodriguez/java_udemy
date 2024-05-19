/*
 * Sección 5: Fundamentos java: operadores en java
 *
 * 25. Ejercicio: operadores de asignación en java
 * 26. Ejercicio: operadores unarios en java
 * 
 * 31. Ejercicio: precedencia de operadores en java
 */

public class Operadores02 {

    public static void main(String[] args) {

        // OPERADOR DE ASIGNACIÓN

        int a = 20;

        // OPERADORES DE COMPOSICIÓN

        // Suma
        a += 5; // Equivalencia a = a + 5;
        System.out.println("a: " + a);

        // Resta
        a -= 5; // Equivalencia a = a - 5;
        System.out.println("a: " + a);

        // Multiplicación
        a *= 5; // Equivalencia a = a * 5;
        System.out.println("a: " + a);

        // División
        a /= 5; // Equivalencia a = a / 5;
        System.out.println("a: " + a);

        // Residuo
        a %= 5; // Equivalencia a = a % 5;
        System.out.println("a: " + a);

        // OPERADORES UNARIOS

        // Cambio de signo
        int b = 10;
        int c = -b;
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        // Negación
        // Sólo aplica para variables de tipo 'boolean'
        boolean d = true;
        boolean e = !d;
        System.out.println("d: " + d);
        System.out.println("e: " + e);


        // Pre-incremento
        int f = 20;
        System.out.println("f sin pre-incremento: " + f);

        // Primero se incrementa la variable y luego se ocupa su valor en la expresión
        int g = ++f;

        System.out.println("f: " + f);
        System.out.println("g: " + g);
        System.out.println("f: " + f);
        System.out.println("g: " + g);


        // Post-incremento
        int h = 30;
        System.out.println("h sin post-incremento: " + h);

        // Primero se utiliza la variable en la expresión y luego se incrementa
        int i = h++;
        System.out.println("h: " + h);
        System.out.println("i: " + i);
        System.out.println("h: " + h);
        System.out.println("i: " + i);

        int j = 40;
        System.out.println("j sin post-incremento: " + j);

        j++;
        System.out.println("j = " + j);

        // Pre-decremento
        int k = 50;
        System.out.println("k sin pred-recremento: " + k);
        int l = --k;
        System.out.println("k: " + k);
        System.out.println("l: " + l);
        System.out.println("k: " + k);
        System.out.println("l: " + l);

        // Post-decremento
        int m = 60;
        System.out.println("m sin post-decremento: " + m);
        int n = m--;
        System.out.println("m: " + m);
        System.out.println("n: " + n);
        System.out.println("m: " + m);
        System.out.println("n: " + n);

        int o = 70;
        System.out.println("o sin post-decremento: " + o);
        o--;
        System.out.println("o: " + o);

        // Ejemplo de pre y pos
        int x = 10;
        int y = 5;
        int z = ++x + y--;
        System.out.println("x: " + x); // 11
        System.out.println("y: " + y); // 4
        System.out.println("z: " + z); // 16
    }
}
