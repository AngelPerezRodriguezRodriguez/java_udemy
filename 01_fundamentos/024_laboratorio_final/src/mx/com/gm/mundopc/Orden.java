package mx.com.gm.mundopc;

public class Orden {

    private final int idOrden;

    private static int contadorOrdenes;

    Computadora computadoras[];

    private int contadorComputadoras;

    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;

        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {

        if (this.contadorComputadoras >= Orden.MAX_COMPUTADORAS) {

            System.out.println("Se ha superado el máximo de computadoras: " + Orden.MAX_COMPUTADORAS);
            return;
        }
        this.computadoras[this.contadorComputadoras++] = computadora;
    }

    public void mostrarOrden() {

        System.out.println("ID Orden: " + this.idOrden);

        for (int i = 0; i < this.contadorComputadoras; i++) {

            System.out.println(this.computadoras[i].toString());
        }
    }
}
