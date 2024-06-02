package mx.com.gm.ventas;

public class Orden {

    // ATRIBUTOS
    private int idOrden;

    private Producto productos[];

    private static int contadorOrdenes;

    // Atributo no definido en el esquema UML
    // pero necesario para futuras validaciones
    private int contadorProductos;

    private static final int MAX_PRODUCTOS = 10;

    public Orden() {

        this.idOrden = ++Orden.contadorOrdenes;

        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {

        // Usamos la variable 'contadorProductos'
        // para evitar superar el límite del arreglo 'productos'
        if (this.contadorProductos >= Orden.MAX_PRODUCTOS) {

            System.out.println("Se ha superado el máximo de productos: " + Orden.MAX_PRODUCTOS);
            return;
        }

        // Uso del post-incremento
        // para ahorrar una línea de código
        productos[this.contadorProductos++] = producto;
    }

    public double calcularTotal() {

        double total = 0;

        // Usamos la variable 'contadorProductos'
        // para no recorrer índices con valor null del arreglo 'productos'
        for (int i = 0; i < this.contadorProductos; i++) {

            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {

        System.out.println("ID Orden: " + this.idOrden);
        System.out.println("Total: " + this.calcularTotal());

        // Usamos la variable 'contadorProductos'
        // para no recorrer índices con valor null del arreglo 'productos'
        for (int i = 0; i < this.contadorProductos; i++) {

            System.out.println(this.productos[i].toString());
        }
    }
}
