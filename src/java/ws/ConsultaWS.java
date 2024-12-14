package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.clases.Cliente;
import model.clases.DetalleFactura;
import model.clases.Factura;
import model.clases.Producto;
import java.util.Arrays;
import javax.xml.ws.WebServiceException;

/**
 *
 * @author migue
 */
@WebService(serviceName = "ConsultaWS")
public class ConsultaWS {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Factura> facturas = new ArrayList<>();
    private List<Producto> productos = new ArrayList<>();

    @WebMethod(operationName = "consultarCliente")
    public List<Factura> consultarCliente(@WebParam(name = "cedula") String cedula) {
        for (Cliente c : clientes) {
            if (c.getCedula().equals(cedula)) {
                List<Factura> facturasE = c.getFacturas();
                return facturasE;
            }
        }
        
        return null;
    }

    @WebMethod(operationName = "listarCliente")
    public List<Cliente> listarCliente() {
        return clientes;
    }

    @WebMethod(operationName = "listarProducto")
    public List<Producto> listarProducto() {
        return productos;
    }

    {
        // Crear producto 
        Producto p1 = new Producto(1, "lampara navidenia", 20.0, 3);
        Producto p2 = new Producto(2, "Esponja de lavaplatos", 1.25, 24);
        Producto p3 = new Producto(3, "paquete de fundas de basura", 1.0, 50);
        Producto p4 = new Producto(4, "escobas", 3.0, 12);
        Producto p5 = new Producto(5, "Galleta amor grande de chocolate", 1.5, 12);

        // Crear clientes
        Cliente c1 = new Cliente(1, "Miguel", "12345");
        Cliente c2 = new Cliente(2, "Angel", "11111");
        Cliente c3 = new Cliente(3, "Ariel", "22222");

        // Crear facturas
        Factura f1 = new Factura(1, new Date(), c1);
        Factura f2 = new Factura(2, new Date(), c1);
        Factura f3 = new Factura(3, new Date(), c2);

        // Crear los detalles facturas
        DetalleFactura d1 = new DetalleFactura(1, f1, 2, p1);
        DetalleFactura d2 = new DetalleFactura(2, f1, 5, p2);
        DetalleFactura d3 = new DetalleFactura(3, f2, 10, p3);
        DetalleFactura d4 = new DetalleFactura(4, f2, 3, p4);
        DetalleFactura d5 = new DetalleFactura(5, f3, 1, p5);
        DetalleFactura d6 = new DetalleFactura(6, f3, 4, p1);
        DetalleFactura d7 = new DetalleFactura(7, f3, 7, p3);

        // RELACIONAR LAS CLASES
        c1.setFacturas(new ArrayList<>(Arrays.asList(f1, f2)));
        c2.setFacturas(new ArrayList<>(Arrays.asList(f3)));

        f1.setItems(new ArrayList<>(Arrays.asList(d1, d2)));
        f2.setItems(new ArrayList<>(Arrays.asList(d3, d4)));
        f3.setItems(new ArrayList<>(Arrays.asList(d5, d6, d7)));

        // Almacenos los objetos
        clientes = new ArrayList<>(Arrays.asList(c1, c2, c3));
        facturas = new ArrayList<>(Arrays.asList(f1, f2, f3));
        productos = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));

    }
}
