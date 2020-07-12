
package servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicio package. 
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

    private final static QName _Envio_QNAME = new QName("http://servicio/", "envio");
    private final static QName _EnvioResponse_QNAME = new QName("http://servicio/", "envioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Envio }
     * 
     */
    public Envio createEnvio() {
        return new Envio();
    }

    /**
     * Create an instance of {@link EnvioResponse }
     * 
     */
    public EnvioResponse createEnvioResponse() {
        return new EnvioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Envio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "envio")
    public JAXBElement<Envio> createEnvio(Envio value) {
        return new JAXBElement<Envio>(_Envio_QNAME, Envio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "envioResponse")
    public JAXBElement<EnvioResponse> createEnvioResponse(EnvioResponse value) {
        return new JAXBElement<EnvioResponse>(_EnvioResponse_QNAME, EnvioResponse.class, null, value);
    }

}
