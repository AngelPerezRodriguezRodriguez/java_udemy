
import java.util.Scanner;

/**
 * Sección 3: Fundamentos java: tipos primitivos en java
 * 
 * 22. Tienda de libros
 * 
 * @author Angel P.
 */

public class TiendaDeLibros {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String nombre;
        int id;
        double precio;
        boolean envioGratuito;

        System.out.println("Proporciona el nombre: ");
        nombre = consola.nextLine();

        System.out.println("Proporciona el id: ");
        id = Integer.parseInt(consola.nextLine());

        System.out.println("Proporciona el precio: ");
        precio = Double.parseDouble(consola.nextLine());

        System.out.println("Proporciona el envío gratuito:");
        envioGratuito = Boolean.parseBoolean(consola.nextLine());

        System.out.println("\n" + nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envío gratuito: " + envioGratuito);
    }
}
