package model.clases;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Factura {
    private int number;
    private Date fecha;
    private Cliente cliente;
    private List<DetalleFactura> items;

    public Factura() {
    }

    public Factura(int number, Date fecha, Cliente cliente) {
        this.number = number;
        this.fecha = fecha;
        this.cliente = cliente;
    }   

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @XmlTransient
    public List<DetalleFactura> getItems() {
        return items;
    }

    public void setItems(List<DetalleFactura> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Factura{" + "number=" + number + ", fecha=" + fecha + ", cliente=" + cliente.getNombre() + ", items=" + items + '}';
    }
    
}
