package model;

public class Perecederos extends Productos {
    private String fechaCaducidad;

    public Perecederos(String codigo, String nombre, String descripcion, double valorUnitario, int cantidadExistencia, String fechaCaducidad) {
        super(codigo, nombre, descripcion, valorUnitario, cantidadExistencia);
        this.fechaCaducidad = fechaCaducidad;
    }


    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
