package domain;

public class Persona {

    // ATRIBUTOS
    protected String nombre;

    protected char genero;

    protected int edad;

    protected String direccion;

    /*
     * CONSTRUCTORES
     * 
     * La sobrecarga de constructores refiere a la presencia de más de un
     * constructor definido dentro de nuestra clase, pero con diferentes argumentos.
     * Si la clase sólo cuenta con un constructor, entonces todavía no estamos
     * aplicando el concepto de sobrecarga.
     */
    public Persona() {
        // super();
    }

    // Sobrecarga de constructor
    public Persona(String nombre) {
        // super();
        this.nombre = nombre;
    }

    // Sobrecarga de constructor
    public Persona(String nombre, char genero, int edad, String direccion) {
        // super();
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    // MÉTODOS DE ACCESO
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Persona [nombre=").append(this.nombre);
        sb.append(", genero=").append(this.genero);
        sb.append(", edad=").append(this.edad);
        sb.append(", direccion=").append(this.direccion);
        sb.append(", ").append(super.toString());
        sb.append("]");

        return sb.toString();
    }
}
