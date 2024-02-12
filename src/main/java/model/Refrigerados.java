package model;

public class Refrigerados extends Productos {
    private int temperaturaRecomendada;

    public Refrigerados(String codigo, String nombre, String descripcion, double valorUnitario, int cantidadExistencia, int temperaturaRecomendada) {
        super(codigo, nombre, descripcion, valorUnitario, cantidadExistencia);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }


    public int getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(int temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
}