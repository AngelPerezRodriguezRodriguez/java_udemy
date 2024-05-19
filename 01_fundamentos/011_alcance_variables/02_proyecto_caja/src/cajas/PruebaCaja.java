package cajas;

public class PruebaCaja {
    
    public static void main(String[] args) {
        
        // Primer objeto
        Caja cajaUno = new Caja();

        cajaUno.alto = 3;
        cajaUno.ancho = 2;
        cajaUno.profundo = 6;

        cajaUno.calcularVolumen();

        // Segundo objeto
        Caja cajaDos = new Caja(8, 3, 2);

        cajaDos.calcularVolumen();
    }
}
