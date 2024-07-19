package domain;

public class Empleado {

    // ATRIBUTOS
    protected String nombre;

    protected float sueldo;

    // CONSTRUCTOR
    public Empleado(String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // MÉTODOS DE ACCESO
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    // MÉTODO
    public String obtenerDetalles() {
        return "nombre: " + this.nombre + " sueldo: " + this.sueldo;
    }
}
