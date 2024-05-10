package domain;

/*
 * Si en la clase 'Empleado' no utilizamos 'extends Persona', no vamos a 
 * poder acceder a ninguna de las propiedades ni métodos directamente de la 
 * clase 'Persona'. Sería como una clase completamente externa, pero no
 * utilizaríamos el concepto de herencia sino simplemente estaríamos usando 
 * la clase 'Persona' de forma distinta.
 * 
 * Como ya hemos visto, cuando una clase no define explícitamente de que clase
 * extiende o hereda, entonces JAVA de manera automática indica la herencia 
 * de la clase 'Object'. De forma directa o indirecta todas las clases siempre,
 * de una u otra forma, heredan de la clase 'Object'.
 * 
 * En JAVA sólo tenemos herencia simple, es decir, no podemos definir que 
 * una clase herede de varias clases. Sólo podemos tener una jerarquía de
 * clases simple.
 */

public class Empleado extends Persona {
    // Ahora la clase 'Empleado' tiene todas las características que se pueden
    // heredar de la clase 'Persona'.

    // ATRIBUTOS
    private int idEmpleado;

    private static int contadorEmpleado;

    private double sueldo;

    /*
     * CONSTRUCTORES
     * 
     * Los constructores de la clase 'Persona' no se heredan, pero podemos acceder
     * a ellos por medio de la palabra reservada 'super' y posteriormente
     * seleccionando el constructor que deseamos utilizar de la clase padre.
     * 
     * Para saber que constructor queremos utilizar simplemente lo va a definir el
     * número de argumentos que utilicemos en la llamada al constructor utilizando
     * la palabra 'super'. Por ejemplo, si no pasamos ningún argumento, entonces
     * se utiliza el constructor vacío de la clase padre.
     */
    public Empleado(String nombre, double sueldo) {

        // Para poder inicializar el atributo 'nombre' de la clase padre, mandamos
        // a llamar al constructor correspondiente de la clase padre con 'super'
        super(nombre);

        this.sueldo = sueldo;

        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    // MÉTODOS DE ACCESO

    // Dejamos fuera el método 'set' porque la variable se inicializa
    // en el constructor y fuera de éste no necesita ser modificado
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /*
     * '@Override' indica que estamos sobrescribiendo el comportamiento
     * heredado del método 'toString' de la clase padre 'Persona', ya no
     * de la clase 'Object'.
     * 
     * Creamos un objeto de tipo 'StringBuilder' para poder modificar
     * internamente los valores de una cadena y para hacer más eficiente la
     * concatenación con el método 'append'.
     * 
     * Anteriormente, con cada concatenación usando el signo '+' se crea un nuevo
     * objeto de tipo 'String', es decir, objetos inmutables. Por lo tanto, el
     * proceso puede llegar a ser un poco más lento.
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Empleado [idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);

        // Concatenamos una cadena más para mostrar los atributos heredados ya sea a través
        // de la palabra 'this', el método 'get' o, para mostrar todos, el método 'toString'
        sb.append(", ").append(super.toString());
        sb.append("]");

        /*
         * Al final, el objeto de tipo 'StringBuilder' llama el método 'toString'
         * que retorna un objeto 'String' que cumple con el tipo de retorno
         * definido en la firma del método.
         */
        return sb.toString();
    }
}
