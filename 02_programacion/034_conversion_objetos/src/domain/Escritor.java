package domain;

public class Escritor extends Empleado {

    final TipoEscritura tipoEscritura;

    // CONSTRUCTOR
    public Escritor(String nombre, float sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);

        this.tipoEscritura = tipoEscritura;
    }

    // MÉTODO DE ACCESO
    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    // MÉTODOS
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " tipo de escritura: " + tipoEscritura.getDescricion();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Escritor [tipoEscritura=").append(this.tipoEscritura);
        sb.append(", ").append(super.toString());
        sb.append("]");

        return sb.toString();
    }
}
