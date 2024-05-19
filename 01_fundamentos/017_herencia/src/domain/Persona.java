package domain;

/*
 * Todo lo que sea privado no es posible heredar a las clases hijas.
 */

public class Persona {

    /*
     * ATRIBUTOS
     * 
     * Si queremos que las clases hijas puedan acceder directamente a los atributos
     * de esta clase, tenemos que utilizar el método de acceso 'protected'. Este
     * modificador está pensado especialmente para el concepto de herencia.
     */
    protected String nombre;

    protected char genero;

    protected int edad;

    protected String direccion;

    // CONSTRUCTORES
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

        // 'super' refiere al método 'toString' de la clase padre 'Object'
        // Concatenamos la dirección de memoria de los objetos tipo 'Persona'
        sb.append(", ").append(super.toString());
        sb.append("]");

        return sb.toString();
    }
}
