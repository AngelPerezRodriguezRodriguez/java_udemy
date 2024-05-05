
/**
 * Sección 2: Fundamentos java: variables en java
 * 
 * 6. Variables en java
 * 7. Tipos enteros y tipo String en java
 * 8. Inferencia de tipos en java
 * 9. Ejercicio: reglas para definir una variable en java
 * 
 * Una variable nos va a permitir almacenar información. Esta información van a
 * ser los datos que vamos a procesar con nuestro programa, así que estos datos
 * van a variar según la información que estemos recibiendo por parte del
 * usuario o del tipo de información que estemos procesando.
 *
 * Una variable tiene un "identificador" y va almacenar entones un valor, pero
 * este valor que va a almacenar puede cambiar al pasar el tiempo. De ahí su
 * nombre de variable, debido a que el valor que almacena puede modificarse al
 * pasar el tiempo.
 *
 * @author Angel P.
 */

public class Variables {

    public static void main(String[] args) {
        /*
        El método "main" nos va a permitir ejecutar las lineas de código que 
        están contenidas dentro del método "main"

        
        DEFINICIÓN DE VARIABLE: 
    
        1. Tipo de variable 
    
        2. Identificador, es decir, el nombre de la variable.
        Usar la notación de camello o de altas y bajas
    
         3. Literal o valor asignado a la variable.
         */
        int variableEntera = 22;

        /*Usamos la variable primitiva de tipo entero "int".
        También es una palabra reservada
         */
        System.out.println(variableEntera);

        /*
        MODIFICACIÓN DE VARIABLE
        No es necesario indicar el tipo de dato ya que hemos lO hemos definido
        con anterioridad con la palabra reservada "int". Si lo hacemos, el
        compilador nos mostrará un error. No podemos definir una variable que
        ya ha sido definida anteriormente.
         */
        variableEntera = 44;
        System.out.println(variableEntera);

        /*
        String
        No es un dato de tipo primitivo, sino una clase de JAVA.
        Es decir, es una dato de tipo referenciado
         */
        String variableCadena = "Números";
        System.out.println(variableCadena);

        variableCadena = "Letras";
        System.out.println(variableCadena);

        /*
        INFERENCIA
        A partir de la versión 10 de JAVA podemos utilizar la palabra
        reservada "var" en lugar de utilizar el tipo de dato definido.
        
        Nuestro código se va a simplificar debido a que vamos a utilizar tipos 
        de datos mucho más complejos. Con "var", JAVA va a inferir el tipo de
        dato según el valor asignado.
         */
        var añoCumpleaños = 1998;
        System.out.println(añoCumpleaños);

        var nombreUsuario = "Angel Pérez";
        System.out.println(nombreUsuario);

        /*
        PALABRAS RESERVADAS
        Las palabras reservadas son identificadores pero, como su nombre lo
        indica, están reservadas y no se pueden usar como identificadores por el
        usuario.
      
        
        DEFINIR PALABRAS RESERVADAS:  
        
        1. El primer carácter puede ser cualquier letra del alfabeto. 
        Por convención debe ser en minúscula
        
        2. De contener más de una palabra, las demás deben de comenzar con 
        mayúscula
        
        3. No podemos utilizar números ni caracteres especiales como primer 
        carácter. Sólo podemos usar ciertos caracteres especiales como: 
        "_" "$" ...
        
        4. No es recomendable utilizar acentos
         
        
        RESTRICCIONES DE VARIABLES:  
 
        1. Una variable que fue definida dentro de un método, en este caso 
        dentro del método "main", no puede ser utilizada fuera de este método. 
        A esto se le denomina alcance de una variable
         */
    }
}
