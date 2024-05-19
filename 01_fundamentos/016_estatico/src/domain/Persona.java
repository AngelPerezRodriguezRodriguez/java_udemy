package domain;

/*
 * En JAVA operamos en dos contextos, cuando trabajamos con clases se conoce 
 * como contexto estático (carga de clases); y una vez que tenemos cargada la clase 
 * en memoria y empezamos a crear objetos a partir de la misma, entonces se conoce 
 * como contexto dinámico (carga de objetos).
 * 
 * El contexto estático no puede acceder al dinámico.
 * El contexto dinámico sí puede acceder al estático.
 * 
 * Para los atributos estáticos se recomienda anteponer el nombre de la clase.
 * Para los atributos dinámicos se recomienda anteponer el operador 'this'.
 * 
 * Si no se utiliza la palabra reservada 'static', entonces lo que estemos 
 * definiendo se asocia al contexto dinámico.
 * 
 * La sintaxis para acceder a los atributos o métodos estáticos es:
 * 
 * [nombre de la clase].[atributo o método estático];
 */

public class Persona {

    // ATRIBUTOS
    private int idPersona;

    // La variable se asocia con la clase y no con el objeto
    private static int contadorPersona;

    private String nombre;

    // CONSTRUCTOR
    public Persona(String nombre) {
        // super();

        this.nombre = nombre;

        // Asignamos el valor de una variable de contexto estático
        // a una variable de contexto dinámico
        this.idPersona = ++Persona.contadorPersona;
    }

    // MÉTODOS DE ACCESO
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }

    /*
     * Método toString
     * 
     * '@Override' se conoce como una anotación y agrega información extra al
     * método que estamos definiendo; éste en particular indica que estamos
     * sobrescribiendo el método 'toString'.
     * 
     * Todas las clases en JAVA extienden de la clase 'Object' y es esta misma
     * clase la que tiene definida el método 'toString'. Debido a que estamos
     * modificando dicho método desde nuestra clase 'Persona' el IDE agrega la
     * anotación '@Override' e indica que estamos modificando el comportamiento
     * del método 'toString' definido en la clase 'Object'.
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", idPersona=" + idPersona + "]";
    }
}
