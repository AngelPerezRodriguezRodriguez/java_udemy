package mx.com.gm.ventas;

/*
 * La relación de la clase 'Producto' con la clase 'Orden' es de agregación. 
 * Los productos se pueden asociar con una o más instancias de la clase 'Orden', 
 * incluso un producto existe sin necesidad de la clase 'Orden'.
 */

public class Producto {

    // ATRIBUTOS
    private final int idProducto;

    private String nombre;

    private double precio;

    private static int contadorProductos;

    // CONSTRUCTORES
    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this();

        this.nombre = nombre;
        this.precio = precio;
    }

    // MÉTODOS DE ACCESO
    public int getIdProducto() {
        return idProducto;
    }

    // El método 'setIdProducto' no es posible
    // ya que la variable es de tipo 'final'

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Producto [idProducto=").append(this.idProducto);
        sb.append(", nombre=").append(this.nombre);
        sb.append(", precio=").append(this.precio);
        sb.append("]");

        return sb.toString();
    }
}
