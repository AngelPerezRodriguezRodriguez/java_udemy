package mx.com.gm.mundopc;

public class Monitor {

    // ATRIBUTOS
    private final int idMonitor;

    private static int contadorMonitores;

    private String marca;

    private int tamanio;

    // CONSTRUCTORES
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, int tamanio) {
        this();

        this.marca = marca;
        this.tamanio = tamanio;
    }

    // MÉTODOS DE ACCESO
    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Monitor [idMonitor=").append(this.idMonitor);
        sb.append(", marca=").append(this.marca);
        sb.append(", tamanio=").append(this.tamanio);
        sb.append("]");

        return sb.toString();
    }
}
