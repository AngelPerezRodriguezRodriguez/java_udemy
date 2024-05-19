import java.util.Scanner;

/*
 * Sección 3: Fundamentos java: variables en java
 * 
 * 14. Detalles libro
 */

public class DetallesLibro {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        String autor, libro;

        System.out.println("\nProporciona el título:");
        libro = consola.nextLine();
        
        System.out.println("\nProporciona el autor:");
        autor = consola.nextLine();

        System.out.println("\n" + libro + " fue escrito por " + autor);
    }
}
