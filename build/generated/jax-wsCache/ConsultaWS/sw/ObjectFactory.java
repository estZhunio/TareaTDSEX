
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Cliente_QNAME = new QName("http://ws/", "cliente");
    private final static QName _ConsultarCliente_QNAME = new QName("http://ws/", "consultarCliente");
    private final static QName _ConsultarClienteResponse_QNAME = new QName("http://ws/", "consultarClienteResponse");
    private final static QName _Factura_QNAME = new QName("http://ws/", "factura");
    private final static QName _ListarCliente_QNAME = new QName("http://ws/", "listarCliente");
    private final static QName _ListarClienteResponse_QNAME = new QName("http://ws/", "listarClienteResponse");
    private final static QName _ListarProducto_QNAME = new QName("http://ws/", "listarProducto");
    private final static QName _ListarProductoResponse_QNAME = new QName("http://ws/", "listarProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link ConsultarCliente }
     * 
     */
    public ConsultarCliente createConsultarCliente() {
        return new ConsultarCliente();
    }

    /**
     * Create an instance of {@link ConsultarClienteResponse }
     * 
     */
    public ConsultarClienteResponse createConsultarClienteResponse() {
        return new ConsultarClienteResponse();
    }

    /**
     * Create an instance of {@link Factura }
     * 
     */
    public Factura createFactura() {
        return new Factura();
    }

    /**
     * Create an instance of {@link ListarCliente }
     * 
     */
    public ListarCliente createListarCliente() {
        return new ListarCliente();
    }

    /**
     * Create an instance of {@link ListarClienteResponse }
     * 
     */
    public ListarClienteResponse createListarClienteResponse() {
        return new ListarClienteResponse();
    }

    /**
     * Create an instance of {@link ListarProducto }
     * 
     */
    public ListarProducto createListarProducto() {
        return new ListarProducto();
    }

    /**
     * Create an instance of {@link ListarProductoResponse }
     * 
     */
    public ListarProductoResponse createListarProductoResponse() {
        return new ListarProductoResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "cliente")
    public JAXBElement<Cliente> createCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consultarCliente")
    public JAXBElement<ConsultarCliente> createConsultarCliente(ConsultarCliente value) {
        return new JAXBElement<ConsultarCliente>(_ConsultarCliente_QNAME, ConsultarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consultarClienteResponse")
    public JAXBElement<ConsultarClienteResponse> createConsultarClienteResponse(ConsultarClienteResponse value) {
        return new JAXBElement<ConsultarClienteResponse>(_ConsultarClienteResponse_QNAME, ConsultarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Factura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Factura }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "factura")
    public JAXBElement<Factura> createFactura(Factura value) {
        return new JAXBElement<Factura>(_Factura_QNAME, Factura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarCliente")
    public JAXBElement<ListarCliente> createListarCliente(ListarCliente value) {
        return new JAXBElement<ListarCliente>(_ListarCliente_QNAME, ListarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarClienteResponse")
    public JAXBElement<ListarClienteResponse> createListarClienteResponse(ListarClienteResponse value) {
        return new JAXBElement<ListarClienteResponse>(_ListarClienteResponse_QNAME, ListarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarProducto")
    public JAXBElement<ListarProducto> createListarProducto(ListarProducto value) {
        return new JAXBElement<ListarProducto>(_ListarProducto_QNAME, ListarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProductoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarProductoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarProductoResponse")
    public JAXBElement<ListarProductoResponse> createListarProductoResponse(ListarProductoResponse value) {
        return new JAXBElement<ListarProductoResponse>(_ListarProductoResponse_QNAME, ListarProductoResponse.class, null, value);
    }

}
