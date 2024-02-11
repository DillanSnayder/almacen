package model;

public class Clientes {
    private String nombre;
    private String apellidos;
    private String identificacion;
    private String direccion;
    private String telefono;

    public Clientes(String nombre, String apellidos, String identificacion, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
