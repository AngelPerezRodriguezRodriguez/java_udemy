package domain;

public class Empleado extends Persona {

    // ATRIBUTOS
    private int idEmpleado;

    private static int contadorEmpleado;

    private double sueldo;

    // CONSTRUCTORES
    public Empleado() {
        // super();

        /*
         * Inicializar esta variable cambia respecto al anterior proyecto.
         * No importa la forma en la que se crea un objeto de tipo 'Empleado',
         * ya sea con el constructor vacío o con el constructor con argumentos,
         * siempre se inicializa la variable 'idEmpleado'.
         */
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    // Sobrecarga de constructor
    public Empleado(String nombre, double sueldo) {

        /*
         * 'super' debe ser la primera línea en el constructor excepto cuando
         * se manda a llamar un constructor interno con 'this'. En un constructor
         * podemos ocupar 'super' o 'this', pero no ambos.
         * 
         * 'this' manda a llamar de manera interna constructores de la misma clase.
         * 'super' manda a llamar constructores de la clase padre según el número
         * de argumentos que se proporcionen.
         */
        this();

        // Debido a que el atributo 'nombre' de la clase padre se definió como
        // 'protected', podemos acceder al atributo a través de la palabra 'this'
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // MÉTODOS DE ACCESO
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Empleado [idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append("]");

        return sb.toString();
    }
}
