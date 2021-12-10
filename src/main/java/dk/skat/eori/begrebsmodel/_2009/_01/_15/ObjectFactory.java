
package dk.skat.eori.begrebsmodel._2009._01._15;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.skat.begrebsmodel._2009._01._15 package. 
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

    private final static QName _VirksomhedOphørDato_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "VirksomhedOphørDato");
    private final static QName _ØkonomiskOperatørAktivitetType_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "ØkonomiskOperatørAktivitetType");
    private final static QName _VirksomhedSENummer_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "VirksomhedSENummer");
    private final static QName _ØkonomiskOperatørEORINummer_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "ØkonomiskOperatørEORINummer");
    private final static QName _ØkonomiskOperatørErOffentligMarkering_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "ØkonomiskOperatørErOffentligMarkering");
    private final static QName _VirksomhedStartDato_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "VirksomhedStartDato");
    private final static QName _ØkonomiskOperatørEtableretDato_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "ØkonomiskOperatørEtableretDato");
    private final static QName _KompenserTrans_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "KompenserTrans");
    private final static QName _EORIVirksomhedValiderInterface_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "EORIVirksomhedValiderInterface");
    private final static QName _EORIErValid_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "EORIErValid");
    private final static QName _ØkonomiskOperatørVirksomhedType_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "ØkonomiskOperatørVirksomhedType");
    private final static QName _Kontekst_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "Kontekst");
    private final static QName _ØkonomiskOperatørAEOStatus_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "ØkonomiskOperatørAEOStatus");
    private final static QName _KompenserTransSvar_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "KompenserTransSvar");
    private final static QName _VirksomhedCVRNummer_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "VirksomhedCVRNummer");
    private final static QName _ØkonomiskOperatørTredjeLandNummer_QNAME = new QName("http://skat.dk/begrebsmodel/2009/01/15/", "ØkonomiskOperatørTredjeLandNummer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.skat.begrebsmodel._2009._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EORIVirksomhedValiderOType }
     * 
     */
    public EORIVirksomhedValiderOType createEORIVirksomhedValiderOType() {
        return new EORIVirksomhedValiderOType();
    }

    /**
     * Create an instance of {@link EORIVirksomhedValiderIType }
     * 
     */
    public EORIVirksomhedValiderIType createEORIVirksomhedValiderIType() {
        return new EORIVirksomhedValiderIType();
    }

    /**
     * Create an instance of {@link EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe }
     * 
     */
    public EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe createEORIVirksomhedValiderOTypeEORIVirksomhedValiderSvarListe() {
        return new EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe();
    }

    /**
     * Create an instance of {@link EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar }
     * 
     */
    public EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar createEORIVirksomhedValiderOTypeEORIVirksomhedValiderSvarListeEORIVirksomhedValiderSvar() {
        return new EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar();
    }

    /**
     * Create an instance of {@link KontekstType }
     * 
     */
    public KontekstType createKontekstType() {
        return new KontekstType();
    }

    /**
     * Create an instance of {@link KompenserTransSvarType }
     * 
     */
    public KompenserTransSvarType createKompenserTransSvarType() {
        return new KompenserTransSvarType();
    }

    /**
     * Create an instance of {@link EORIVirksomhedValiderO }
     * 
     */
    public EORIVirksomhedValiderO createEORIVirksomhedValiderO() {
        return new EORIVirksomhedValiderO();
    }

    /**
     * Create an instance of {@link KompenserTransType }
     * 
     */
    public KompenserTransType createKompenserTransType() {
        return new KompenserTransType();
    }

    /**
     * Create an instance of {@link EORIVirksomhedValiderInterfaceType }
     * 
     */
    public EORIVirksomhedValiderInterfaceType createEORIVirksomhedValiderInterfaceType() {
        return new EORIVirksomhedValiderInterfaceType();
    }

    /**
     * Create an instance of {@link EORIVirksomhedValiderI }
     * 
     */
    public EORIVirksomhedValiderI createEORIVirksomhedValiderI() {
        return new EORIVirksomhedValiderI();
    }

    /**
     * Create an instance of {@link EORIVirksomhedValiderIType.SECVRNummer }
     * 
     */
    public EORIVirksomhedValiderIType.SECVRNummer createEORIVirksomhedValiderITypeSECVRNummer() {
        return new EORIVirksomhedValiderIType.SECVRNummer();
    }

    /**
     * Create an instance of {@link EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar.LokalReference }
     * 
     */
    public EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar.LokalReference createEORIVirksomhedValiderOTypeEORIVirksomhedValiderSvarListeEORIVirksomhedValiderSvarLokalReference() {
        return new EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar.LokalReference();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "VirksomhedOphørDato")
    public JAXBElement<XMLGregorianCalendar> createVirksomhedOphørDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VirksomhedOphørDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "ØkonomiskOperatørAktivitetType")
    public JAXBElement<BigInteger> createØkonomiskOperatørAktivitetType(BigInteger value) {
        return new JAXBElement<BigInteger>(_ØkonomiskOperatørAktivitetType_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "VirksomhedSENummer")
    public JAXBElement<BigInteger> createVirksomhedSENummer(BigInteger value) {
        return new JAXBElement<BigInteger>(_VirksomhedSENummer_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "ØkonomiskOperatørEORINummer")
    public JAXBElement<String> createØkonomiskOperatørEORINummer(String value) {
        return new JAXBElement<String>(_ØkonomiskOperatørEORINummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "ØkonomiskOperatørErOffentligMarkering")
    public JAXBElement<Boolean> createØkonomiskOperatørErOffentligMarkering(Boolean value) {
        return new JAXBElement<Boolean>(_ØkonomiskOperatørErOffentligMarkering_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "VirksomhedStartDato")
    public JAXBElement<XMLGregorianCalendar> createVirksomhedStartDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VirksomhedStartDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "ØkonomiskOperatørEtableretDato")
    public JAXBElement<XMLGregorianCalendar> createØkonomiskOperatørEtableretDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ØkonomiskOperatørEtableretDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KompenserTransType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "KompenserTrans")
    public JAXBElement<KompenserTransType> createKompenserTrans(KompenserTransType value) {
        return new JAXBElement<KompenserTransType>(_KompenserTrans_QNAME, KompenserTransType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EORIVirksomhedValiderInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "EORIVirksomhedValiderInterface")
    public JAXBElement<EORIVirksomhedValiderInterfaceType> createEORIVirksomhedValiderInterface(EORIVirksomhedValiderInterfaceType value) {
        return new JAXBElement<EORIVirksomhedValiderInterfaceType>(_EORIVirksomhedValiderInterface_QNAME, EORIVirksomhedValiderInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "EORIErValid")
    public JAXBElement<Boolean> createEORIErValid(Boolean value) {
        return new JAXBElement<Boolean>(_EORIErValid_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "ØkonomiskOperatørVirksomhedType")
    public JAXBElement<BigInteger> createØkonomiskOperatørVirksomhedType(BigInteger value) {
        return new JAXBElement<BigInteger>(_ØkonomiskOperatørVirksomhedType_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KontekstType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "Kontekst")
    public JAXBElement<KontekstType> createKontekst(KontekstType value) {
        return new JAXBElement<KontekstType>(_Kontekst_QNAME, KontekstType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "ØkonomiskOperatørAEOStatus")
    public JAXBElement<String> createØkonomiskOperatørAEOStatus(String value) {
        return new JAXBElement<String>(_ØkonomiskOperatørAEOStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KompenserTransSvarType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "KompenserTransSvar")
    public JAXBElement<KompenserTransSvarType> createKompenserTransSvar(KompenserTransSvarType value) {
        return new JAXBElement<KompenserTransSvarType>(_KompenserTransSvar_QNAME, KompenserTransSvarType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "VirksomhedCVRNummer")
    public JAXBElement<String> createVirksomhedCVRNummer(String value) {
        return new JAXBElement<String>(_VirksomhedCVRNummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skat.dk/begrebsmodel/2009/01/15/", name = "ØkonomiskOperatørTredjeLandNummer")
    public JAXBElement<String> createØkonomiskOperatørTredjeLandNummer(String value) {
        return new JAXBElement<String>(_ØkonomiskOperatørTredjeLandNummer_QNAME, String.class, null, value);
    }

}
