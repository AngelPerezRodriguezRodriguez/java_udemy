package domain;

public class Gerente extends Empleado {

    // ATRIBUTO
    private String departamento;

    // CONSTRUCTOR
    public Gerente(String nombre, float sueldo, String departamento) {
        super(nombre, sueldo);

        this.departamento = departamento;
    }

    // MÉTODO DE ACCESO
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // MÉTODO
    @Override
    public String obtenerDetalles() {

        // Mostramos la información de la clase padre con 'super'
        return super.obtenerDetalles() + " departamento: " + this.departamento;
    }
}
