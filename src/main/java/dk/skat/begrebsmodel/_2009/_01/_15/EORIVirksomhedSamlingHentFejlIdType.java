
package dk.skat.begrebsmodel._2009._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EORIVirksomhedSamlingHent_FejlIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EORIVirksomhedSamlingHent_FejlIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ØkonomiskOperatørEORINummer" minOccurs="0"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ØkonomiskOperatørEtableretDato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EORIVirksomhedSamlingHent_FejlIdType", propOrder = {
    "økonomiskOperatørEORINummer",
    "økonomiskOperatørEtableretDato"
})
public class EORIVirksomhedSamlingHentFejlIdType {

    @XmlElement(name = "ØkonomiskOperatørEORINummer")
    protected String økonomiskOperatørEORINummer;
    @XmlElement(name = "ØkonomiskOperatørEtableretDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar økonomiskOperatørEtableretDato;

    /**
     * Gets the value of the ØkonomiskOperatørEORINummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getØkonomiskOperatørEORINummer() {
        return økonomiskOperatørEORINummer;
    }

    /**
     * Sets the value of the ØkonomiskOperatørEORINummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setØkonomiskOperatørEORINummer(String value) {
        this.økonomiskOperatørEORINummer = value;
    }

    /**
     * Gets the value of the ØkonomiskOperatørEtableretDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getØkonomiskOperatørEtableretDato() {
        return økonomiskOperatørEtableretDato;
    }

    /**
     * Sets the value of the ØkonomiskOperatørEtableretDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setØkonomiskOperatørEtableretDato(XMLGregorianCalendar value) {
        this.økonomiskOperatørEtableretDato = value;
    }

}
