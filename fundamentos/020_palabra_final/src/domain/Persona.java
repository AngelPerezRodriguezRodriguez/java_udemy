package domain;

public class Persona {

    private String nombre;

    // Una variable constante es la combinación de 'final' y 'static'
    // Se recomienda definir en mayúsculas
    public final static int MI_CONSTANTE = 40;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void sumar(int a, int b) {
        System.out.println(a + b);
    }

    public final void restar(int a, int b) {
        System.out.println(a - b);
    }

    public void multiplicar(int a, int b) {
        System.out.println(a * b);
    }
}
