package test;

import mx.com.gm.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {

        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorASUS = new Monitor("ASUS", 15);
        Teclado tecladoASUS = new Teclado("USB", "ASUS");
        Raton ratonASUS = new Raton("USB", "ASUS");
        Computadora computadoraASUS = new Computadora("Computadora ASUS", monitorASUS, tecladoASUS, ratonASUS);

        Orden orden01 = new Orden();
        orden01.agregarComputadora(computadoraHP);
        orden01.agregarComputadora(computadoraASUS);
        orden01.mostrarOrden();

        Monitor monitorDELL = new Monitor("DELL", 18);
        Teclado tecladoDELL = new Teclado("bluetooth", "DELL");
        Raton ratonDELL = new Raton("USB", "DELL");
        Computadora computadoraDELL = new Computadora("Computadora DELL", monitorDELL, tecladoDELL, ratonDELL);

        Orden orden02 = new Orden();
        orden02.agregarComputadora(computadoraDELL);
        orden02.mostrarOrden();
    }
}
