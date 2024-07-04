package mx.com.gm.mundopc;

public class Teclado extends DispositivoEntrada {

    // ATRIBUTOS
    private final int idTeclado;

    private static int contadorTeclados;

    // CONSTRUCTOR
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);

        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Teclado [idTeclado=").append(this.idTeclado);
        sb.append(", DispositivoEntrada=").append(super.toString());
        sb.append("]");

        return sb.toString();
    }
}
