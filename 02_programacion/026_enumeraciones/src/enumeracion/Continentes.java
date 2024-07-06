package enumeracion;

public enum Continentes {

    AFR(53, "AFRICA"),
    EUR(46, "EUROPA"),
    ASI(44, "ASIA"),
    AME(24, "AMERICA"),
    OCE(14, "OCEANIA");

    private final int paises;

    private final String nombre;

    Continentes(int paises, String nombre) {
        this.paises = paises;
        this.nombre = nombre;
    }

    public int getPaises() {
        return this.paises;
    }

    public String getNombre() {
        return this.nombre;
    }
}
