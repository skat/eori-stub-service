
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
 * <p>Java class for EORIVirksomhedValider_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EORIVirksomhedValider_OType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}Kontekst"/>
 *         &lt;element name="EORIVirksomhedValiderSvarListe" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EORIVirksomhedValiderSvar" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIErValid"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}�konomiskOperat�rEORINummer" minOccurs="0"/>
 *                             &lt;element name="LokalReference" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedSENummer"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "EORIVirksomhedValider_OType", propOrder = {
    "kontekst",
    "eoriVirksomhedValiderSvarListe"
})
@XmlSeeAlso({
    EORIVirksomhedValiderO.class
})
public class EORIVirksomhedValiderOType {

    @XmlElement(name = "Kontekst", required = true)
    protected KontekstType kontekst;
    @XmlElement(name = "EORIVirksomhedValiderSvarListe")
    protected EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe eoriVirksomhedValiderSvarListe;

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
     * Gets the value of the eoriVirksomhedValiderSvarListe property.
     * 
     * @return
     *     possible object is
     *     {@link EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe }
     *     
     */
    public EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe getEORIVirksomhedValiderSvarListe() {
        return eoriVirksomhedValiderSvarListe;
    }

    /**
     * Sets the value of the eoriVirksomhedValiderSvarListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe }
     *     
     */
    public void setEORIVirksomhedValiderSvarListe(EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe value) {
        this.eoriVirksomhedValiderSvarListe = value;
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
     *         &lt;element name="EORIVirksomhedValiderSvar" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIErValid"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}�konomiskOperat�rEORINummer" minOccurs="0"/>
     *                   &lt;element name="LokalReference" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedSENummer"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "eoriVirksomhedValiderSvar"
    })
    public static class EORIVirksomhedValiderSvarListe {

        @XmlElement(name = "EORIVirksomhedValiderSvar", required = true)
        protected List<EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar> eoriVirksomhedValiderSvar;

        /**
         * Gets the value of the eoriVirksomhedValiderSvar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eoriVirksomhedValiderSvar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEORIVirksomhedValiderSvar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar }
         * 
         * 
         */
        public List<EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar> getEORIVirksomhedValiderSvar() {
            if (eoriVirksomhedValiderSvar == null) {
                eoriVirksomhedValiderSvar = new ArrayList<EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar>();
            }
            return this.eoriVirksomhedValiderSvar;
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
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIErValid"/>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ØkonomiskOperatørEORINummer" minOccurs="0"/>
         *         &lt;element name="LokalReference" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedSENummer"/>
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
        @XmlType(name = "", propOrder = {
            "eoriErValid",
            "økonomiskOperatørEORINummer",
            "lokalReference"
        })
        public static class EORIVirksomhedValiderSvar {

            @XmlElement(name = "EORIErValid")
            protected boolean eoriErValid;
            @XmlElement(name = "ØkonomiskOperatørEORINummer")
            protected String økonomiskOperatørEORINummer;
            @XmlElement(name = "LokalReference")
            protected EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar.LokalReference lokalReference;

            /**
             * Gets the value of the eoriErValid property.
             * 
             */
            public boolean isEORIErValid() {
                return eoriErValid;
            }

            /**
             * Sets the value of the eoriErValid property.
             * 
             */
            public void setEORIErValid(boolean value) {
                this.eoriErValid = value;
            }

            /**
             * Gets the value of the �konomiskOperat�rEORINummer property.
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
             * Sets the value of the �konomiskOperat�rEORINummer property.
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
             * Gets the value of the lokalReference property.
             * 
             * @return
             *     possible object is
             *     {@link EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar.LokalReference }
             *     
             */
            public EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar.LokalReference getLokalReference() {
                return lokalReference;
            }

            /**
             * Sets the value of the lokalReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar.LokalReference }
             *     
             */
            public void setLokalReference(EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar.LokalReference value) {
                this.lokalReference = value;
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
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}VirksomhedSENummer"/>
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
            public static class LokalReference {

                @XmlElement(name = "VirksomhedSENummer", required = true)
                protected BigInteger virksomhedSENummer;

                /**
                 * Gets the value of the virksomhedSENummer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getVirksomhedSENummer() {
                    return virksomhedSENummer;
                }

                /**
                 * Sets the value of the virksomhedSENummer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setVirksomhedSENummer(BigInteger value) {
                    this.virksomhedSENummer = value;
                }

            }

        }

    }

}
