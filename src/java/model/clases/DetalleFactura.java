package model.clases;

public class DetalleFactura {
    private int id;
    private Factura factura;
    private int cantidad;
    private Producto producto;

    public DetalleFactura() {
    }

    public DetalleFactura(int id, Factura factura, int cantidad, Producto producto) {
        this.id = id;
        this.factura = factura;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "id=" + id + ", factura=" + factura + ", cantidad=" + cantidad + ", producto=" + producto + '}';
    }
    
}
