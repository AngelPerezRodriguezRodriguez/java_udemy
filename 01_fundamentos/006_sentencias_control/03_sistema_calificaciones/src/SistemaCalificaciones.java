import java.util.Scanner;

/*
 * Sección 6: fundamentos java: sentencias de control
 * 
 * 39. Sistema de calificaciones
 */

public class SistemaCalificaciones {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        
        float calif;
        String califTexto = "valor desconocido";

        System.out.println("Proporciona un valor entre 0 y 10: ");
        calif = Float.parseFloat(consola.nextLine());

        if (calif >= 0 && calif < 6) {
            califTexto = "F";
        } else if (calif >= 6 && calif < 7) {
            califTexto = "D";
        } else if (calif >= 7 && calif < 8) {
            califTexto = "C";
        } else if (calif >= 8 && calif < 9) {
            califTexto = "B";
        } else if (calif >= 9 && calif <= 10) {
            califTexto = "A";
        }
        System.out.println("Calificación: " + califTexto);
    }
}
