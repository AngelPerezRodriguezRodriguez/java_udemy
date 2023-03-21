package cajas;

public class Caja {
    
    // ATRIBUTOS
    int ancho;
    int alto;
    int profundo;

    // CONSTRCUTORES
    public Caja() {
        System.out.println("Uso de constructor vacío...");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    // MÉTODOS
    public void calcularVolumen() {
        int resultado = this.ancho * this.alto * this.profundo;

        System.out.println("Volumen de la caja: " + resultado);
    }
}
