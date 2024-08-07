package mx.com.gm.mundopc;

public class Computadora {

    // ATRIBUTOS
    private final int idComputadora;

    private static int contadorComputadoras;

    private String nombre;

    private Monitor monitor;

    private Teclado teclado;

    private Raton raton;

    // CONSTRUCTORES
    public Computadora() {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();

        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    // MÉTODOS DE ACCESO
    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Computadora [idComputadora=").append(this.idComputadora);
        sb.append(", nombre=").append(this.nombre);
        sb.append(", monitor=").append(this.monitor);
        sb.append(", teclado=").append(this.teclado);
        sb.append(", raton=").append(this.raton);
        sb.append("]");

        return sb.toString();
    }
}
