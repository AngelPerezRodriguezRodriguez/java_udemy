package domain;

public class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Persona [nombre=").append(this.nombre);
        sb.append("]");

        return sb.toString();
    }
}
