
package org.me.care;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.care package. 
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

    private final static QName _Donate_QNAME = new QName("http://Care.me.org/", "donate");
    private final static QName _DonateResponse_QNAME = new QName("http://Care.me.org/", "donateResponse");
    private final static QName _Hello_QNAME = new QName("http://Care.me.org/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://Care.me.org/", "helloResponse");
    private final static QName _Payment_QNAME = new QName("http://Care.me.org/", "payment");
    private final static QName _PaymentResponse_QNAME = new QName("http://Care.me.org/", "paymentResponse");
    private final static QName _Purchase_QNAME = new QName("http://Care.me.org/", "purchase");
    private final static QName _PurchaseResponse_QNAME = new QName("http://Care.me.org/", "purchaseResponse");
    private final static QName _Register_QNAME = new QName("http://Care.me.org/", "register");
    private final static QName _RegisterResponse_QNAME = new QName("http://Care.me.org/", "registerResponse");
    private final static QName _Rescue_QNAME = new QName("http://Care.me.org/", "rescue");
    private final static QName _RescueResponse_QNAME = new QName("http://Care.me.org/", "rescueResponse");
    private final static QName _RetrieveDonation_QNAME = new QName("http://Care.me.org/", "retrieveDonation");
    private final static QName _RetrieveDonationResponse_QNAME = new QName("http://Care.me.org/", "retrieveDonationResponse");
    private final static QName _RetrievePurchase_QNAME = new QName("http://Care.me.org/", "retrievePurchase");
    private final static QName _RetrievePurchaseResponse_QNAME = new QName("http://Care.me.org/", "retrievePurchaseResponse");
    private final static QName _RetrievePurchaseSum_QNAME = new QName("http://Care.me.org/", "retrievePurchaseSum");
    private final static QName _RetrievePurchaseSumResponse_QNAME = new QName("http://Care.me.org/", "retrievePurchaseSumResponse");
    private final static QName _RetrieveRescue_QNAME = new QName("http://Care.me.org/", "retrieveRescue");
    private final static QName _RetrieveRescueResponse_QNAME = new QName("http://Care.me.org/", "retrieveRescueResponse");
    private final static QName _SaveDonate_QNAME = new QName("http://Care.me.org/", "saveDonate");
    private final static QName _SaveDonateResponse_QNAME = new QName("http://Care.me.org/", "saveDonateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.care
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Donate }
     * 
     */
    public Donate createDonate() {
        return new Donate();
    }

    /**
     * Create an instance of {@link DonateResponse }
     * 
     */
    public DonateResponse createDonateResponse() {
        return new DonateResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link PaymentResponse }
     * 
     */
    public PaymentResponse createPaymentResponse() {
        return new PaymentResponse();
    }

    /**
     * Create an instance of {@link Purchase }
     * 
     */
    public Purchase createPurchase() {
        return new Purchase();
    }

    /**
     * Create an instance of {@link PurchaseResponse }
     * 
     */
    public PurchaseResponse createPurchaseResponse() {
        return new PurchaseResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link Rescue }
     * 
     */
    public Rescue createRescue() {
        return new Rescue();
    }

    /**
     * Create an instance of {@link RescueResponse }
     * 
     */
    public RescueResponse createRescueResponse() {
        return new RescueResponse();
    }

    /**
     * Create an instance of {@link RetrieveDonation }
     * 
     */
    public RetrieveDonation createRetrieveDonation() {
        return new RetrieveDonation();
    }

    /**
     * Create an instance of {@link RetrieveDonationResponse }
     * 
     */
    public RetrieveDonationResponse createRetrieveDonationResponse() {
        return new RetrieveDonationResponse();
    }

    /**
     * Create an instance of {@link RetrievePurchase }
     * 
     */
    public RetrievePurchase createRetrievePurchase() {
        return new RetrievePurchase();
    }

    /**
     * Create an instance of {@link RetrievePurchaseResponse }
     * 
     */
    public RetrievePurchaseResponse createRetrievePurchaseResponse() {
        return new RetrievePurchaseResponse();
    }

    /**
     * Create an instance of {@link RetrievePurchaseSum }
     * 
     */
    public RetrievePurchaseSum createRetrievePurchaseSum() {
        return new RetrievePurchaseSum();
    }

    /**
     * Create an instance of {@link RetrievePurchaseSumResponse }
     * 
     */
    public RetrievePurchaseSumResponse createRetrievePurchaseSumResponse() {
        return new RetrievePurchaseSumResponse();
    }

    /**
     * Create an instance of {@link RetrieveRescue }
     * 
     */
    public RetrieveRescue createRetrieveRescue() {
        return new RetrieveRescue();
    }

    /**
     * Create an instance of {@link RetrieveRescueResponse }
     * 
     */
    public RetrieveRescueResponse createRetrieveRescueResponse() {
        return new RetrieveRescueResponse();
    }

    /**
     * Create an instance of {@link SaveDonate }
     * 
     */
    public SaveDonate createSaveDonate() {
        return new SaveDonate();
    }

    /**
     * Create an instance of {@link SaveDonateResponse }
     * 
     */
    public SaveDonateResponse createSaveDonateResponse() {
        return new SaveDonateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Donate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "donate")
    public JAXBElement<Donate> createDonate(Donate value) {
        return new JAXBElement<Donate>(_Donate_QNAME, Donate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DonateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "donateResponse")
    public JAXBElement<DonateResponse> createDonateResponse(DonateResponse value) {
        return new JAXBElement<DonateResponse>(_DonateResponse_QNAME, DonateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Payment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "payment")
    public JAXBElement<Payment> createPayment(Payment value) {
        return new JAXBElement<Payment>(_Payment_QNAME, Payment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "paymentResponse")
    public JAXBElement<PaymentResponse> createPaymentResponse(PaymentResponse value) {
        return new JAXBElement<PaymentResponse>(_PaymentResponse_QNAME, PaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Purchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "purchase")
    public JAXBElement<Purchase> createPurchase(Purchase value) {
        return new JAXBElement<Purchase>(_Purchase_QNAME, Purchase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "purchaseResponse")
    public JAXBElement<PurchaseResponse> createPurchaseResponse(PurchaseResponse value) {
        return new JAXBElement<PurchaseResponse>(_PurchaseResponse_QNAME, PurchaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rescue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "rescue")
    public JAXBElement<Rescue> createRescue(Rescue value) {
        return new JAXBElement<Rescue>(_Rescue_QNAME, Rescue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RescueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "rescueResponse")
    public JAXBElement<RescueResponse> createRescueResponse(RescueResponse value) {
        return new JAXBElement<RescueResponse>(_RescueResponse_QNAME, RescueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDonation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "retrieveDonation")
    public JAXBElement<RetrieveDonation> createRetrieveDonation(RetrieveDonation value) {
        return new JAXBElement<RetrieveDonation>(_RetrieveDonation_QNAME, RetrieveDonation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDonationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "retrieveDonationResponse")
    public JAXBElement<RetrieveDonationResponse> createRetrieveDonationResponse(RetrieveDonationResponse value) {
        return new JAXBElement<RetrieveDonationResponse>(_RetrieveDonationResponse_QNAME, RetrieveDonationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePurchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "retrievePurchase")
    public JAXBElement<RetrievePurchase> createRetrievePurchase(RetrievePurchase value) {
        return new JAXBElement<RetrievePurchase>(_RetrievePurchase_QNAME, RetrievePurchase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePurchaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "retrievePurchaseResponse")
    public JAXBElement<RetrievePurchaseResponse> createRetrievePurchaseResponse(RetrievePurchaseResponse value) {
        return new JAXBElement<RetrievePurchaseResponse>(_RetrievePurchaseResponse_QNAME, RetrievePurchaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePurchaseSum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "retrievePurchaseSum")
    public JAXBElement<RetrievePurchaseSum> createRetrievePurchaseSum(RetrievePurchaseSum value) {
        return new JAXBElement<RetrievePurchaseSum>(_RetrievePurchaseSum_QNAME, RetrievePurchaseSum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePurchaseSumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "retrievePurchaseSumResponse")
    public JAXBElement<RetrievePurchaseSumResponse> createRetrievePurchaseSumResponse(RetrievePurchaseSumResponse value) {
        return new JAXBElement<RetrievePurchaseSumResponse>(_RetrievePurchaseSumResponse_QNAME, RetrievePurchaseSumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRescue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "retrieveRescue")
    public JAXBElement<RetrieveRescue> createRetrieveRescue(RetrieveRescue value) {
        return new JAXBElement<RetrieveRescue>(_RetrieveRescue_QNAME, RetrieveRescue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRescueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "retrieveRescueResponse")
    public JAXBElement<RetrieveRescueResponse> createRetrieveRescueResponse(RetrieveRescueResponse value) {
        return new JAXBElement<RetrieveRescueResponse>(_RetrieveRescueResponse_QNAME, RetrieveRescueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDonate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "saveDonate")
    public JAXBElement<SaveDonate> createSaveDonate(SaveDonate value) {
        return new JAXBElement<SaveDonate>(_SaveDonate_QNAME, SaveDonate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDonateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Care.me.org/", name = "saveDonateResponse")
    public JAXBElement<SaveDonateResponse> createSaveDonateResponse(SaveDonateResponse value) {
        return new JAXBElement<SaveDonateResponse>(_SaveDonateResponse_QNAME, SaveDonateResponse.class, null, value);
    }

}
