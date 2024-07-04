package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    // ATRIBUTOS
    private final int idRaton;

    private static int contadorRatones;

    // CONSTRUCTOR
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);

        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Raton [idRaton=").append(this.idRaton);
        sb.append(", DispositivoEntrada=").append(super.toString());
        sb.append("]");

        return sb.toString();
    }
}
