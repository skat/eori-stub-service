//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.18 at 04:04:11 PM IST 
//


package dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SvarReaktionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvarReaktionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/xml/schemas/kontekst/2007/05/31/}Advis"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/xml/schemas/kontekst/2007/05/31/}Fejl"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvarReaktionType", propOrder = {
    "advis",
    "fejl"
})
public class SvarReaktionType {

    @XmlElement(name = "Advis")
    protected AdvisType advis;
    @XmlElement(name = "Fejl")
    protected FejlType fejl;

    /**
     * Gets the value of the advis property.
     * 
     * @return
     *     possible object is
     *     {@link AdvisType }
     *     
     */
    public AdvisType getAdvis() {
        return advis;
    }

    /**
     * Sets the value of the advis property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvisType }
     *     
     */
    public void setAdvis(AdvisType value) {
        this.advis = value;
    }

    /**
     * Gets the value of the fejl property.
     * 
     * @return
     *     possible object is
     *     {@link FejlType }
     *     
     */
    public FejlType getFejl() {
        return fejl;
    }

    /**
     * Sets the value of the fejl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FejlType }
     *     
     */
    public void setFejl(FejlType value) {
        this.fejl = value;
    }

}
