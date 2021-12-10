
package dk.skat.begrebsmodel._2009._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EORIAdresseStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EORIAdresseStrukturType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SprogKode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}SprogKode"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EORIAdresseKortNavn" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AlternativAdresseAdresseLinie1"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EORIAdresseNavn" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AlternativAdresseAdresseLinie2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EORIGadeNavnNummer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AlternativAdresseAdresseLinie3"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EORIPostNummer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AlternativAdresseAdresseLinie4"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EORIByNavn" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AlternativAdresseAdresseLinie5"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EORILandeKode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}LandKode"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EORILandeNavn" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}LandNavn"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AlternativAdresseGyldigFra"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AlternativAdresseGyldigTil" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EORIAdresseStrukturType", propOrder = {
    "sprogKode",
    "eoriAdresseKortNavn",
    "eoriAdresseNavn",
    "eoriGadeNavnNummer",
    "eoriPostNummer",
    "eoriByNavn",
    "eoriLandeKode",
    "eoriLandeNavn",
    "alternativAdresseGyldigFra",
    "alternativAdresseGyldigTil"
})
public class EORIAdresseStrukturType {

    @XmlElement(name = "SprogKode")
    protected EORIAdresseStrukturType.SprogKode sprogKode;
    @XmlElement(name = "EORIAdresseKortNavn")
    protected EORIAdresseStrukturType.EORIAdresseKortNavn eoriAdresseKortNavn;
    @XmlElement(name = "EORIAdresseNavn")
    protected EORIAdresseStrukturType.EORIAdresseNavn eoriAdresseNavn;
    @XmlElement(name = "EORIGadeNavnNummer", required = true)
    protected EORIAdresseStrukturType.EORIGadeNavnNummer eoriGadeNavnNummer;
    @XmlElement(name = "EORIPostNummer")
    protected EORIAdresseStrukturType.EORIPostNummer eoriPostNummer;
    @XmlElement(name = "EORIByNavn")
    protected EORIAdresseStrukturType.EORIByNavn eoriByNavn;
    @XmlElement(name = "EORILandeKode")
    protected EORIAdresseStrukturType.EORILandeKode eoriLandeKode;
    @XmlElement(name = "EORILandeNavn")
    protected EORIAdresseStrukturType.EORILandeNavn eoriLandeNavn;
    @XmlElement(name = "AlternativAdresseGyldigFra", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar alternativAdresseGyldigFra;
    @XmlElement(name = "AlternativAdresseGyldigTil")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar alternativAdresseGyldigTil;

    /**
     * Gets the value of the sprogKode property.
     * 
     * @return
     *     possible object is
     *     {@link EORIAdresseStrukturType.SprogKode }
     *     
     */
    public EORIAdresseStrukturType.SprogKode getSprogKode() {
        return sprogKode;
    }

    /**
     * Sets the value of the sprogKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIAdresseStrukturType.SprogKode }
     *     
     */
    public void setSprogKode(EORIAdresseStrukturType.SprogKode value) {
        this.sprogKode = value;
    }

    /**
     * Gets the value of the eoriAdresseKortNavn property.
     * 
     * @return
     *     possible object is
     *     {@link EORIAdresseStrukturType.EORIAdresseKortNavn }
     *     
     */
    public EORIAdresseStrukturType.EORIAdresseKortNavn getEORIAdresseKortNavn() {
        return eoriAdresseKortNavn;
    }

    /**
     * Sets the value of the eoriAdresseKortNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIAdresseStrukturType.EORIAdresseKortNavn }
     *     
     */
    public void setEORIAdresseKortNavn(EORIAdresseStrukturType.EORIAdresseKortNavn value) {
        this.eoriAdresseKortNavn = value;
    }

    /**
     * Gets the value of the eoriAdresseNavn property.
     * 
     * @return
     *     possible object is
     *     {@link EORIAdresseStrukturType.EORIAdresseNavn }
     *     
     */
    public EORIAdresseStrukturType.EORIAdresseNavn getEORIAdresseNavn() {
        return eoriAdresseNavn;
    }

    /**
     * Sets the value of the eoriAdresseNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIAdresseStrukturType.EORIAdresseNavn }
     *     
     */
    public void setEORIAdresseNavn(EORIAdresseStrukturType.EORIAdresseNavn value) {
        this.eoriAdresseNavn = value;
    }

    /**
     * Gets the value of the eoriGadeNavnNummer property.
     * 
     * @return
     *     possible object is
     *     {@link EORIAdresseStrukturType.EORIGadeNavnNummer }
     *     
     */
    public EORIAdresseStrukturType.EORIGadeNavnNummer getEORIGadeNavnNummer() {
        return eoriGadeNavnNummer;
    }

    /**
     * Sets the value of the eoriGadeNavnNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIAdresseStrukturType.EORIGadeNavnNummer }
     *     
     */
    public void setEORIGadeNavnNummer(EORIAdresseStrukturType.EORIGadeNavnNummer value) {
        this.eoriGadeNavnNummer = value;
    }

    /**
     * Gets the value of the eoriPostNummer property.
     * 
     * @return
     *     possible object is
     *     {@link EORIAdresseStrukturType.EORIPostNummer }
     *     
     */
    public EORIAdresseStrukturType.EORIPostNummer getEORIPostNummer() {
        return eoriPostNummer;
    }

    /**
     * Sets the value of the eoriPostNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIAdresseStrukturType.EORIPostNummer }
     *     
     */
    public void setEORIPostNummer(EORIAdresseStrukturType.EORIPostNummer value) {
        this.eoriPostNummer = value;
    }

    /**
     * Gets the value of the eoriByNavn property.
     * 
     * @return
     *     possible object is
     *     {@link EORIAdresseStrukturType.EORIByNavn }
     *     
     */
    public EORIAdresseStrukturType.EORIByNavn getEORIByNavn() {
        return eoriByNavn;
    }

    /**
     * Sets the value of the eoriByNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIAdresseStrukturType.EORIByNavn }
     *     
     */
    public void setEORIByNavn(EORIAdresseStrukturType.EORIByNavn value) {
        this.eoriByNavn = value;
    }

    /**
     * Gets the value of the eoriLandeKode property.
     * 
     * @return
     *     possible object is
     *     {@link EORIAdresseStrukturType.EORILandeKode }
     *     
     */
    public EORIAdresseStrukturType.EORILandeKode getEORILandeKode() {
        return eoriLandeKode;
    }

    /**
     * Sets the value of the eoriLandeKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIAdresseStrukturType.EORILandeKode }
     *     
     */
    public void setEORILandeKode(EORIAdresseStrukturType.EORILandeKode value) {
        this.eoriLandeKode = value;
    }

    /**
     * Gets the value of the eoriLandeNavn property.
     * 
     * @return
     *     possible object is
     *     {@link EORIAdresseStrukturType.EORILandeNavn }
     *     
     */
    public EORIAdresseStrukturType.EORILandeNavn getEORILandeNavn() {
        return eoriLandeNavn;
    }

    /**
     * Sets the value of the eoriLandeNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIAdresseStrukturType.EORILandeNavn }
     *     
     */
    public void setEORILandeNavn(EORIAdresseStrukturType.EORILandeNavn value) {
        this.eoriLandeNavn = value;
    }

    /**
     * Gets the value of the alternativAdresseGyldigFra property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlternativAdresseGyldigFra() {
        return alternativAdresseGyldigFra;
    }

    /**
     * Sets the value of the alternativAdresseGyldigFra property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlternativAdresseGyldigFra(XMLGregorianCalendar value) {
        this.alternativAdresseGyldigFra = value;
    }

    /**
     * Gets the value of the alternativAdresseGyldigTil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlternativAdresseGyldigTil() {
        return alternativAdresseGyldigTil;
    }

    /**
     * Sets the value of the alternativAdresseGyldigTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlternativAdresseGyldigTil(XMLGregorianCalendar value) {
        this.alternativAdresseGyldigTil = value;
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
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AlternativAdresseAdresseLinie1"/>
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
        "alternativAdresseAdresseLinie1"
    })
    public static class EORIAdresseKortNavn {

        @XmlElement(name = "AlternativAdresseAdresseLinie1", required = true)
        protected String alternativAdresseAdresseLinie1;

        /**
         * Gets the value of the alternativAdresseAdresseLinie1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlternativAdresseAdresseLinie1() {
            return alternativAdresseAdresseLinie1;
        }

        /**
         * Sets the value of the alternativAdresseAdresseLinie1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlternativAdresseAdresseLinie1(String value) {
            this.alternativAdresseAdresseLinie1 = value;
        }

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
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AlternativAdresseAdresseLinie2"/>
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
        "alternativAdresseAdresseLinie2"
    })
    public static class EORIAdresseNavn {

        @XmlElement(name = "AlternativAdresseAdresseLinie2", required = true)
        protected String alternativAdresseAdresseLinie2;

        /**
         * Gets the value of the alternativAdresseAdresseLinie2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlternativAdresseAdresseLinie2() {
            return alternativAdresseAdresseLinie2;
        }

        /**
         * Sets the value of the alternativAdresseAdresseLinie2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlternativAdresseAdresseLinie2(String value) {
            this.alternativAdresseAdresseLinie2 = value;
        }

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
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AlternativAdresseAdresseLinie5"/>
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
        "alternativAdresseAdresseLinie5"
    })
    public static class EORIByNavn {

        @XmlElement(name = "AlternativAdresseAdresseLinie5", required = true)
        protected String alternativAdresseAdresseLinie5;

        /**
         * Gets the value of the alternativAdresseAdresseLinie5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlternativAdresseAdresseLinie5() {
            return alternativAdresseAdresseLinie5;
        }

        /**
         * Sets the value of the alternativAdresseAdresseLinie5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlternativAdresseAdresseLinie5(String value) {
            this.alternativAdresseAdresseLinie5 = value;
        }

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
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AlternativAdresseAdresseLinie3"/>
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
        "alternativAdresseAdresseLinie3"
    })
    public static class EORIGadeNavnNummer {

        @XmlElement(name = "AlternativAdresseAdresseLinie3", required = true)
        protected String alternativAdresseAdresseLinie3;

        /**
         * Gets the value of the alternativAdresseAdresseLinie3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlternativAdresseAdresseLinie3() {
            return alternativAdresseAdresseLinie3;
        }

        /**
         * Sets the value of the alternativAdresseAdresseLinie3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlternativAdresseAdresseLinie3(String value) {
            this.alternativAdresseAdresseLinie3 = value;
        }

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
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}LandKode"/>
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
        "landKode"
    })
    public static class EORILandeKode {

        @XmlElement(name = "LandKode", required = true)
        protected String landKode;

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
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}LandNavn"/>
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
        "landNavn"
    })
    public static class EORILandeNavn {

        @XmlElement(name = "LandNavn", required = true)
        protected String landNavn;

        /**
         * Gets the value of the landNavn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLandNavn() {
            return landNavn;
        }

        /**
         * Sets the value of the landNavn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLandNavn(String value) {
            this.landNavn = value;
        }

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
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AlternativAdresseAdresseLinie4"/>
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
        "alternativAdresseAdresseLinie4"
    })
    public static class EORIPostNummer {

        @XmlElement(name = "AlternativAdresseAdresseLinie4", required = true)
        protected String alternativAdresseAdresseLinie4;

        /**
         * Gets the value of the alternativAdresseAdresseLinie4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlternativAdresseAdresseLinie4() {
            return alternativAdresseAdresseLinie4;
        }

        /**
         * Sets the value of the alternativAdresseAdresseLinie4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlternativAdresseAdresseLinie4(String value) {
            this.alternativAdresseAdresseLinie4 = value;
        }

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
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}SprogKode"/>
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
        "sprogKode"
    })
    public static class SprogKode {

        @XmlElement(name = "SprogKode", required = true)
        protected String sprogKode;

        /**
         * Gets the value of the sprogKode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSprogKode() {
            return sprogKode;
        }

        /**
         * Sets the value of the sprogKode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSprogKode(String value) {
            this.sprogKode = value;
        }

    }

}
