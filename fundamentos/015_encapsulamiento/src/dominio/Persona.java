package dominio;

/*
 * El paquete 'dominio' contiene las clases que resuelven el problema a analizar.
 * El paquete 'test' contiene las clases de prueba de nuestro proyecto.
 */

public class Persona {

    /*
     * ATRIBUTOS
     * 
     * Dado que no es buena práctica manipular de forma directa los atributos de
     * una clase desde otra clase externa, aplicamos el concepto de encapsular.
     * 
     * Los atributos ya no van a ser de tipo 'default' o 'package', sino van a
     * tener un modificador de acceso 'private' para que otras clases, incluso
     * aunque estén dentro del mismo paquete, no puedan recuperar ni modificar
     * directamente los atributos de la clase; para ello se tendrán que utilizar
     * métodos de acceso.
     */
    private String nombre;
    private float sueldo;
    private boolean eliminado;

    // CONSTRUCTOR
    public Persona(String nombre, float sueldo, boolean eliminado) {

        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    /*
     * MÉTODOS GET Y SET
     *
     * Permiten recuperar y modificar el valor de los atributos del objeto.
     * Cada atributo debe contar con dos métodos de acceso, uno para función
     * antes mencionada. Deben ser públicos, no estáticos y retornar el
     * tipo de dato del atributo.
     */

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    // Si tratamos con un atributo de tipo 'boolean',
    // el nombre del método comienza con 'is'
    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    /*
     * MÉTODO TOSTRING
     * 
     * Permite imprimir en forma de cadena el estado del objeto en cualquier
     * momento, es decir, el valor de cada uno de los atributos que agreguemos
     * al método.
     */
    public String toString() {

        return "Persona [" +
                " nombre: " + this.nombre +
                ", sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado + " ]";
    }
}
