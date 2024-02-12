package model;
import java.util.Date;
import java.util.List;

public class Ventas {
    private int nFactura;
    private Date fechaVenta;
    private double totalVenta;
    private List<Productos> productosVendidos;


    public Ventas(int nFactura, Date fechaVenta, double totalVenta) {
        this.nFactura = nFactura;
        this.fechaVenta = fechaVenta;
        this.totalVenta = totalVenta;
    }

    // Métodos para agregar y eliminar productos vendidos
    public void agregarProducto(Productos producto) {
        productosVendidos.add(producto);
    }

    public void eliminarProducto(Productos producto) {
        productosVendidos.remove(producto);
    }

    // Métodos getters para los atributos
    public int getnFactura() {
        return nFactura;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public List<Productos> getProductosVendidos() {
        return productosVendidos;
    }
}