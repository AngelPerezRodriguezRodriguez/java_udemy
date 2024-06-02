package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class TestVentas {

    public static void main(String[] args) {
        
        Producto producto01 = new Producto("Camisa", 50);
        Producto producto02 = new Producto("Pantalón", 100);

        Orden orden01 = new Orden();
        orden01.agregarProducto(producto01);
        orden01.agregarProducto(producto02);
        orden01.mostrarOrden();

        Producto producto03 = new Producto("Cinturón", 80);

        Orden orden02 = new Orden();
        orden02.agregarProducto(producto01);
        orden02.agregarProducto(producto02);
        orden02.agregarProducto(producto03);
        orden02.mostrarOrden();

        Producto producto04 = new Producto("Bufanda", 200);
    }
}
