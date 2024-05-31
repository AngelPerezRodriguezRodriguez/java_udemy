package domain;

public class Persona {

    // ATRIBUTO
    String nombre;

    // CONSTRUCTOR
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // MÉTODOS DE ACCESO
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Persona [nombre=").append(this.nombre);
        sb.append(", ").append(super.toString());
        sb.append("]");

        return sb.toString();
    }
}
