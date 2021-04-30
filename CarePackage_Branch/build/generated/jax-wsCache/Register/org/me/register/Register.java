
package org.me.register;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Register", targetNamespace = "http://Register.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Register {


    /**
     * 
     * @param birthday
     * @param fname
     * @param lname
     * @param password
     * @param gender
     * @param email
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://Register.me.org/", className = "org.me.register.Register_Type")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://Register.me.org/", className = "org.me.register.RegisterResponse")
    @Action(input = "http://Register.me.org/Register/registerRequest", output = "http://Register.me.org/Register/registerResponse")
    public String register(
        @WebParam(name = "fname", targetNamespace = "")
        String fname,
        @WebParam(name = "lname", targetNamespace = "")
        String lname,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "birthday", targetNamespace = "")
        String birthday,
        @WebParam(name = "gender", targetNamespace = "")
        String gender);

}