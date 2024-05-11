package domain;

import java.util.Date;

public class Cliente extends Persona {

    // ATRIBUTOS
    protected int idCliente;

    private static int contadorCliente;

    private Date fechaRegistro;

    protected boolean vip;

    // CONSTRUCTOR
    public Cliente(boolean vip, String nombre, char genero, int edad, String direccion) {

        super(nombre, genero, edad, direccion);

        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = new Date();
        this.vip = vip;
    }

    // MÉTODOS DE ACCESO
    public int getIdCliente() {
        return idCliente;
    }

    public Date getFecha() {
        return fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Cliente [idCliente=").append(this.idCliente);
        sb.append(", fechaRegistro=").append(this.fechaRegistro);
        sb.append(", vip=").append(this.vip);
        sb.append(", ").append(super.toString());
        sb.append("]");

        return sb.toString();
    }
}
