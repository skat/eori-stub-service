package dk.skat.begrebsmodel._2009._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AutoriseretØkonomiskOperatørStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoriseretØkonomiskOperatørStrukturType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AutoriseretØkonomiskOperatørGyldigFra" minOccurs="0"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AutoriseretØkonomiskOperatørGyldigTil" minOccurs="0"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}LandKode"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AutoriseretØkonomiskOperatørCertifikatType"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AutoriseretØkonomiskOperatørIdentikationNummer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoriseretØkonomiskOperatørStrukturType", propOrder = {
    "autoriseretØkonomiskOperatørGyldigFra",
    "autoriseretØkonomiskOperatørGyldigTil",
    "landKode",
    "autoriseretØkonomiskOperatørCertifikatType",
    "autoriseretØkonomiskOperatørIdentikationNummer"
})
public class AutoriseretØkonomiskOperatørStrukturType {

    @XmlElement(name = "AutoriseretØkonomiskOperatørGyldigFra")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar autoriseretØkonomiskOperatørGyldigFra;
    @XmlElement(name = "AutoriseretØkonomiskOperatørGyldigTil")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar autoriseretØkonomiskOperatørGyldigTil;
    @XmlElement(name = "LandKode", required = true)
    protected String landKode;
    @XmlElement(name = "AutoriseretØkonomiskOperatørCertifikatType", required = true)
    protected String autoriseretØkonomiskOperatørCertifikatType;
    @XmlElement(name = "AutoriseretØkonomiskOperatørIdentikationNummer", required = true)
    protected String autoriseretØkonomiskOperatørIdentikationNummer;

    /**
     * Gets the value of the autoriseretØkonomiskOperatørGyldigFra property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAutoriseretØkonomiskOperatørGyldigFra() {
        return autoriseretØkonomiskOperatørGyldigFra;
    }

    /**
     * Sets the value of the autoriseretØkonomiskOperatørGyldigFra property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAutoriseretØkonomiskOperatørGyldigFra(XMLGregorianCalendar value) {
        this.autoriseretØkonomiskOperatørGyldigFra = value;
    }

    /**
     * Gets the value of the autoriseretØkonomiskOperatørGyldigTil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAutoriseretØkonomiskOperatørGyldigTil() {
        return autoriseretØkonomiskOperatørGyldigTil;
    }

    /**
     * Sets the value of the autoriseretØkonomiskOperatørGyldigTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAutoriseretØkonomiskOperatørGyldigTil(XMLGregorianCalendar value) {
        this.autoriseretØkonomiskOperatørGyldigTil = value;
    }

    /**
     * Gets the value of the landKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandKode() {
        return landKode;
    }

    /**
     * Sets the value of the landKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandKode(String value) {
        this.landKode = value;
    }

    /**
     * Gets the value of the autoriseretØkonomiskOperatørCertifikatType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoriseretØkonomiskOperatørCertifikatType() {
        return autoriseretØkonomiskOperatørCertifikatType;
    }

    /**
     * Sets the value of the autoriseretØkonomiskOperatørCertifikatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoriseretØkonomiskOperatørCertifikatType(String value) {
        this.autoriseretØkonomiskOperatørCertifikatType = value;
    }

    /**
     * Gets the value of the autoriseretØkonomiskOperatørIdentikationNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoriseretØkonomiskOperatørIdentikationNummer() {
        return autoriseretØkonomiskOperatørIdentikationNummer;
    }

    /**
     * Sets the value of the autoriseretØkonomiskOperatørIdentikationNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoriseretØkonomiskOperatørIdentikationNummer(String value) {
        this.autoriseretØkonomiskOperatørIdentikationNummer = value;
    }

}
