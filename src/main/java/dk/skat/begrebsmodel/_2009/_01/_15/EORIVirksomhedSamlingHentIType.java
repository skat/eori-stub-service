
package dk.skat.begrebsmodel._2009._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EORIVirksomhedSamlingHent_IType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EORIVirksomhedSamlingHent_IType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}Kontekst"/>
 *         &lt;element name="EORINummerSamling">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}�konomiskOperat�rEORINummer" maxOccurs="999"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EORIVirksomhedSamlingHent_IType", propOrder = {
    "kontekst",
    "eoriNummerSamling"
})
@XmlSeeAlso({
    EORIVirksomhedSamlingHentI.class
})
public class EORIVirksomhedSamlingHentIType {

    @XmlElement(name = "Kontekst", required = true)
    protected KontekstType kontekst;
    @XmlElement(name = "EORINummerSamling", required = true)
    protected EORIVirksomhedSamlingHentIType.EORINummerSamling eoriNummerSamling;

    /**
     * Gets the value of the kontekst property.
     * 
     * @return
     *     possible object is
     *     {@link KontekstType }
     *     
     */
    public KontekstType getKontekst() {
        return kontekst;
    }

    /**
     * Sets the value of the kontekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link KontekstType }
     *     
     */
    public void setKontekst(KontekstType value) {
        this.kontekst = value;
    }

    /**
     * Gets the value of the eoriNummerSamling property.
     * 
     * @return
     *     possible object is
     *     {@link EORIVirksomhedSamlingHentIType.EORINummerSamling }
     *     
     */
    public EORIVirksomhedSamlingHentIType.EORINummerSamling getEORINummerSamling() {
        return eoriNummerSamling;
    }

    /**
     * Sets the value of the eoriNummerSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIVirksomhedSamlingHentIType.EORINummerSamling }
     *     
     */
    public void setEORINummerSamling(EORIVirksomhedSamlingHentIType.EORINummerSamling value) {
        this.eoriNummerSamling = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ØkonomiskOperatørEORINummer" maxOccurs="999"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "økonomiskOperatørEORINummer"
    })
    public static class EORINummerSamling {

        @XmlElement(name = "ØkonomiskOperatørEORINummer", required = true)
        protected List<String> økonomiskOperatørEORINummer;

        /**
         * Gets the value of the økonomiskOperatørEORINummer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the økonomiskOperatørEORINummer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getØkonomiskOperatørEORINummer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getØkonomiskOperatørEORINummer() {
            if (økonomiskOperatørEORINummer == null) {
            	økonomiskOperatørEORINummer = new ArrayList<String>();
            }
            return this.økonomiskOperatørEORINummer;
        }

    }

}
