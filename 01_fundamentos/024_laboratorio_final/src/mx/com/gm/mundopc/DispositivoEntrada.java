package mx.com.gm.mundopc;

public class DispositivoEntrada {

    // ATRIBUTOS
    private String tipoEntrada;

    private String marca;

    // CONSTRUCTOR
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    // MÉTODOS DE ACCESO
    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("DispositivoEntrada [tipoEntrada=").append(tipoEntrada);
        sb.append(", marca=").append(marca);
        sb.append("]");

        return sb.toString();
    }
}
