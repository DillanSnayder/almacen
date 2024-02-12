package model;

public class Envasados extends Productos {
    private String fechaEmbasado;
    private double pesoEnvase;
    private PaisesOrigen paisOrigen;

    public Envasados(String codigo, String nombre, String descripcion, double valorUnitario, int cantidadExistencia, String fechaEmbasado, double pesoEnvase, PaisesOrigen paisOrigen) {
        super(codigo, nombre, descripcion, valorUnitario, cantidadExistencia);
        this.fechaEmbasado = fechaEmbasado;
        this.pesoEnvase = pesoEnvase;
        this.paisOrigen = paisOrigen;
    }


    public String getFechaEmbasado() {
        return fechaEmbasado;
    }

    public void setFechaEmbasado(String fechaEmbasado) {
        this.fechaEmbasado = fechaEmbasado;
    }

    public double getPesoEnvase() {
        return pesoEnvase;
    }

    public void setPesoEnvase(double pesoEnvase) {
        this.pesoEnvase = pesoEnvase;
    }

    public PaisesOrigen getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(PaisesOrigen paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
