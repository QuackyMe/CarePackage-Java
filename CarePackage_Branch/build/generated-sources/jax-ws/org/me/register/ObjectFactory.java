
package org.me.register;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.register package. 
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

    private final static QName _Register_QNAME = new QName("http://Register.me.org/", "register");
    private final static QName _RegisterResponse_QNAME = new QName("http://Register.me.org/", "registerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.register
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link Register_Type }
     * 
     */
    public Register_Type createRegister_Type() {
        return new Register_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Register.me.org/", name = "register")
    public JAXBElement<Register_Type> createRegister(Register_Type value) {
        return new JAXBElement<Register_Type>(_Register_QNAME, Register_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Register.me.org/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

}
