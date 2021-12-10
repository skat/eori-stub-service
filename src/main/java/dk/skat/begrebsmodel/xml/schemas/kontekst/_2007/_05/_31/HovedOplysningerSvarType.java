//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.18 at 04:04:11 PM IST 
//


package dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HovedOplysningerSvarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HovedOplysningerSvarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/xml/schemas/kontekst/2007/05/31/}TransaktionsID"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/xml/schemas/kontekst/2007/05/31/}ServiceID"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/xml/schemas/kontekst/2007/05/31/}TransaktionsTid"/>
 *         &lt;element name="SvarReaktion" type="{http://skat.dk/begrebsmodel/xml/schemas/kontekst/2007/05/31/}SvarReaktionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HovedOplysningerSvar", propOrder = {
    "transaktionsID",
    "serviceID",
    "transaktionsTid",
    "svarReaktion"
})
public class HovedOplysningerSvarType {

    @XmlElement(name = "TransaktionsID", required = true)
    protected String transaktionsID;
    @XmlElement(name = "ServiceID", required = true)
    protected String serviceID;
    @XmlElement(name = "TransaktionsTid", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transaktionsTid;
    @XmlElement(name = "SvarReaktion")
    protected List<SvarReaktionType> svarReaktion;

    /**
     * Gets the value of the transaktionsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaktionsID() {
        return transaktionsID;
    }

    /**
     * Sets the value of the transaktionsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaktionsID(String value) {
        this.transaktionsID = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the transaktionsTid property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransaktionsTid() {
        return transaktionsTid;
    }

    /**
     * Sets the value of the transaktionsTid property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransaktionsTid(XMLGregorianCalendar value) {
        this.transaktionsTid = value;
    }

    /**
     * Gets the value of the svarReaktion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svarReaktion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvarReaktion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvarReaktionType }
     * 
     * 
     */
    public List<SvarReaktionType> getSvarReaktion() {
        if (svarReaktion == null) {
            svarReaktion = new ArrayList<SvarReaktionType>();
        }
        return this.svarReaktion;
    }

}
