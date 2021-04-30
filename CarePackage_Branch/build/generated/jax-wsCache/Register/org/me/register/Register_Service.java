
package org.me.register;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Register", targetNamespace = "http://Register.me.org/", wsdlLocation = "http://localhost:8080/Register/Register?wsdl")
public class Register_Service
    extends Service
{

    private final static URL REGISTER_WSDL_LOCATION;
    private final static WebServiceException REGISTER_EXCEPTION;
    private final static QName REGISTER_QNAME = new QName("http://Register.me.org/", "Register");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Register/Register?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REGISTER_WSDL_LOCATION = url;
        REGISTER_EXCEPTION = e;
    }

    public Register_Service() {
        super(__getWsdlLocation(), REGISTER_QNAME);
    }

    public Register_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), REGISTER_QNAME, features);
    }

    public Register_Service(URL wsdlLocation) {
        super(wsdlLocation, REGISTER_QNAME);
    }

    public Register_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REGISTER_QNAME, features);
    }

    public Register_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Register_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Register
     */
    @WebEndpoint(name = "RegisterPort")
    public Register getRegisterPort() {
        return super.getPort(new QName("http://Register.me.org/", "RegisterPort"), Register.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Register
     */
    @WebEndpoint(name = "RegisterPort")
    public Register getRegisterPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Register.me.org/", "RegisterPort"), Register.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REGISTER_EXCEPTION!= null) {
            throw REGISTER_EXCEPTION;
        }
        return REGISTER_WSDL_LOCATION;
    }

}
