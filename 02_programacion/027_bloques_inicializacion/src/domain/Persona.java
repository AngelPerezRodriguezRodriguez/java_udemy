package domain;

public class Persona {

    private final int idPesona;

    private static int contadorPersonas;

    /*
     * BLOQUE DE INICIALIZACIÓN ESTÁTICO
     * 
     * Se ejecuta sólo la primera vez
     * que la clase es cargada en memoria.
     */
    static {
        System.out.println("Ejecución de bloque estático");
        Persona.contadorPersonas++;

        // No podemos acceder al contexto dinámico
        // this.idPersona++;
    }

    /*
     * BLOQUE DE INICIALIZACIÓN NO ESTÁTICO
     * 
     * Se ejecuta antes del constructor de la clase,
     * es decir, antes de crear un nuevo objeto
     */
    {
        // Podemos acceder al contexto estático y dinámico
        System.out.println("Ejecución de bloque no estático");
        this.idPesona = Persona.contadorPersonas++;
    }

    // CONSTRUCTOR
    public Persona() {
        System.out.println("Ejecución del constructor");
    }

    // MÉTODO DE ACCESO
    public int getIdPersona() {
        return idPesona;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Persona [idPersona=").append(this.idPesona);
        sb.append("]");

        return sb.toString();
    }
}
