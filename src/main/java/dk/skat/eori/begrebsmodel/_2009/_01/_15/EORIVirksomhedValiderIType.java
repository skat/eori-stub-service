
package dk.skat.eori.begrebsmodel._2009._01._15;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EORIVirksomhedValider_IType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EORIVirksomhedValider_IType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}Kontekst"/>
 *         &lt;element name="SECVRNummer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedSENummer" maxOccurs="99"/>
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
@XmlType(name = "EORIVirksomhedValider_IType", propOrder = {
    "kontekst",
    "secvrNummer"
})
@XmlSeeAlso({
    EORIVirksomhedValiderI.class
})
public class EORIVirksomhedValiderIType {

    @XmlElement(name = "Kontekst", required = true)
    protected KontekstType kontekst;
    @XmlElement(name = "SECVRNummer", required = true)
    protected EORIVirksomhedValiderIType.SECVRNummer secvrNummer;

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
     * Gets the value of the secvrNummer property.
     * 
     * @return
     *     possible object is
     *     {@link EORIVirksomhedValiderIType.SECVRNummer }
     *     
     */
    public EORIVirksomhedValiderIType.SECVRNummer getSECVRNummer() {
        return secvrNummer;
    }

    /**
     * Sets the value of the secvrNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIVirksomhedValiderIType.SECVRNummer }
     *     
     */
    public void setSECVRNummer(EORIVirksomhedValiderIType.SECVRNummer value) {
        this.secvrNummer = value;
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
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedSENummer" maxOccurs="99"/>
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
        "virksomhedSENummer"
    })
    public static class SECVRNummer {

        @XmlElement(name = "VirksomhedSENummer", required = true)
        protected List<BigInteger> virksomhedSENummer;

        /**
         * Gets the value of the virksomhedSENummer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the virksomhedSENummer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVirksomhedSENummer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getVirksomhedSENummer() {
            if (virksomhedSENummer == null) {
                virksomhedSENummer = new ArrayList<BigInteger>();
            }
            return this.virksomhedSENummer;
        }

    }

}
