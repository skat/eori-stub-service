
package dk.skat.begrebsmodel._2009._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EORIVirksomhedSamlingHent_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EORIVirksomhedSamlingHent_OType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}Kontekst"/>
 *         &lt;element name="EORIVirksomhedSamling" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EORIVirksomhed" maxOccurs="999">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}�konomiskOperat�rEORINummer"/>
 *                             &lt;element name="LokalReference" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}�konomiskOperat�rEORINummer"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="�konomiskOperat�rTredjeLandNummerStrukturListe" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}�konomiskOperat�rTredjeLandNummerStruktur" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rNavn"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rNavnKort"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rGyldigFra"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rGyldigTil" minOccurs="0"/>
 *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIAdresseStruktur"/>
 *                             &lt;element name="EUMomsNummerSamling">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rVATNummer" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="EORIKontaktOplysningSamling">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIKontaktOplysningStruktur" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="GyldigAEO" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}Autoriseret�konomiskOperat�rStruktur"/>
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
@XmlType(name = "EORIVirksomhedSamlingHent_OType", propOrder = {
    "kontekst",
    "eoriVirksomhedSamling"
})
@XmlSeeAlso({
    EORIVirksomhedSamlingHentO.class
})
public class EORIVirksomhedSamlingHentOType {

    @XmlElement(name = "Kontekst", required = true)
    protected KontekstType kontekst;
    @XmlElement(name = "EORIVirksomhedSamling")
    protected EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling eoriVirksomhedSamling;

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
     * Gets the value of the eoriVirksomhedSamling property.
     * 
     * @return
     *     possible object is
     *     {@link EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling }
     *     
     */
    public EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling getEORIVirksomhedSamling() {
        return eoriVirksomhedSamling;
    }

    /**
     * Sets the value of the eoriVirksomhedSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling }
     *     
     */
    public void setEORIVirksomhedSamling(EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling value) {
        this.eoriVirksomhedSamling = value;
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
     *         &lt;element name="EORIVirksomhed" maxOccurs="999">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}�konomiskOperat�rEORINummer"/>
     *                   &lt;element name="LokalReference" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}�konomiskOperat�rEORINummer"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="�konomiskOperat�rTredjeLandNummerStrukturListe" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}�konomiskOperat�rTredjeLandNummerStruktur" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rNavn"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rNavnKort"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rGyldigFra"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rGyldigTil" minOccurs="0"/>
     *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIAdresseStruktur"/>
     *                   &lt;element name="EUMomsNummerSamling">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rVATNummer" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="EORIKontaktOplysningSamling">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIKontaktOplysningStruktur" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="GyldigAEO" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}Autoriseret�konomiskOperat�rStruktur"/>
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
    @XmlType(name = "EORIVirksomhedSamling", propOrder = {
        "eoriVirksomhed"
    })
    public static class EORIVirksomhedSamling {

        @XmlElement(name = "EORIVirksomhed", required = true)
        protected List<EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed> eoriVirksomhed;

        /**
         * Gets the value of the eoriVirksomhed property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eoriVirksomhed property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEORIVirksomhed().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed }
         * 
         * 
         */
        public List<EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed> getEORIVirksomhed() {
            if (eoriVirksomhed == null) {
                eoriVirksomhed = new ArrayList<EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed>();
            }
            return this.eoriVirksomhed;
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
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}�konomiskOperat�rEORINummer"/>
         *         &lt;element name="LokalReference" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}�konomiskOperat�rEORINummer"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="�konomiskOperat�rTredjeLandNummerStrukturListe" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}�konomiskOperat�rTredjeLandNummerStruktur" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rNavn"/>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rNavnKort"/>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rGyldigFra"/>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rGyldigTil" minOccurs="0"/>
         *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIAdresseStruktur"/>
         *         &lt;element name="EUMomsNummerSamling">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperat�rVATNummer" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="EORIKontaktOplysningSamling">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIKontaktOplysningStruktur" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="GyldigAEO" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}Autoriseret�konomiskOperat�rStruktur"/>
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
        @XmlType(name = "EORIVirksomhed", propOrder = {
            "økonomiskOperatørEORINummer",
            "lokalReference",
            "økonomiskOperatørTredjeLandNummerStrukturListe",
            "euOperatørNavn",
            "euOperatørNavnKort",
            "euOperatørGyldigFra",
            "euOperatørGyldigTil",
            "eoriAdresseStruktur",
            "euMomsNummerSamling",
            "eoriKontaktOplysningSamling",
            "gyldigAEO"
        })
        public static class EORIVirksomhed {

            @XmlElement(name = "ØkonomiskOperatørEORINummer", required = true)
            protected String økonomiskOperatørEORINummer;
            @XmlElement(name = "LokalReference")
            protected EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.LokalReference lokalReference;
            @XmlElement(name = "ØkonomiskOperatørTredjeLandNummerStrukturListe")
            protected EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.ØkonomiskOperatørTredjeLandNummerStrukturListe økonomiskOperatørTredjeLandNummerStrukturListe;
            @XmlElement(name = "EUOperatørNavn", required = true)
            protected String euOperatørNavn;
            @XmlElement(name = "EUOperatørNavnKort", required = true)
            protected String euOperatørNavnKort;
            @XmlElement(name = "EUOperatørGyldigFra", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar euOperatørGyldigFra;
            @XmlElement(name = "EUOperatørGyldigTil")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar euOperatørGyldigTil;
            @XmlElement(name = "EORIAdresseStruktur", required = true)
            protected EORIAdresseStrukturType eoriAdresseStruktur;
            @XmlElement(name = "EUMomsNummerSamling", required = true)
            protected EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.EUMomsNummerSamling euMomsNummerSamling;
            @XmlElement(name = "EORIKontaktOplysningSamling", required = true)
            protected EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.EORIKontaktOplysningSamling eoriKontaktOplysningSamling;
            @XmlElement(name = "GyldigAEO")
            protected EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.GyldigAEO gyldigAEO;

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
             * Gets the value of the lokalReference property.
             * 
             * @return
             *     possible object is
             *     {@link EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.LokalReference }
             *     
             */
            public EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.LokalReference getLokalReference() {
                return lokalReference;
            }

            /**
             * Sets the value of the lokalReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.LokalReference }
             *     
             */
            public void setLokalReference(EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.LokalReference value) {
                this.lokalReference = value;
            }

            /**
             * Gets the value of the ØkonomiskOperatørTredjeLandNummerStrukturListe property.
             * 
             * @return
             *     possible object is
             *     {@link EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.ØkonomiskOperatørTredjeLandNummerStrukturListe }
             *     
             */
            public EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.ØkonomiskOperatørTredjeLandNummerStrukturListe  getØkonomiskOperatørTredjeLandNummerStrukturListe() {
                return økonomiskOperatørTredjeLandNummerStrukturListe;
            }

            /**
             * Sets the value of the ØkonomiskOperatørTredjeLandNummerStrukturListe property.
             * 
             * @param value
             *     allowed object is
             *     {@link EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.ØkonomiskOperatørTredjeLandNummerStrukturListe }
             *     
             */
            public void setØkonomiskOperatørTredjeLandNummerStrukturListe(EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.ØkonomiskOperatørTredjeLandNummerStrukturListe value) {
                this.økonomiskOperatørTredjeLandNummerStrukturListe = value;
            }

            /**
             * Gets the value of the euOperat�rNavn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEUOperatørNavn() {
                return euOperatørNavn;
            }

            /**
             * Sets the value of the euOperat�rNavn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEUOperatørNavn(String value) {
                this.euOperatørNavn = value;
            }

            /**
             * Gets the value of the euOperat�rNavnKort property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEUOperatørNavnKort() {
                return euOperatørNavnKort;
            }

            /**
             * Sets the value of the euOperat�rNavnKort property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEUOperatørNavnKort(String value) {
                this.euOperatørNavnKort = value;
            }

            /**
             * Gets the value of the euOperatørGyldigFra property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEUOperatørGyldigFra() {
                return euOperatørGyldigFra;
            }

            /**
             * Sets the value of the euOperat�rGyldigFra property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEUOperatørGyldigFra(XMLGregorianCalendar value) {
                this.euOperatørGyldigFra = value;
            }

            /**
             * Gets the value of the euOperat�rGyldigTil property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEUOperatørGyldigTil() {
                return euOperatørGyldigTil;
            }

            /**
             * Sets the value of the euOperat�rGyldigTil property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEUOperatørGyldigTil(XMLGregorianCalendar value) {
                this.euOperatørGyldigTil = value;
            }

            /**
             * Gets the value of the eoriAdresseStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link EORIAdresseStrukturType }
             *     
             */
            public EORIAdresseStrukturType getEORIAdresseStruktur() {
                return eoriAdresseStruktur;
            }

            /**
             * Sets the value of the eoriAdresseStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link EORIAdresseStrukturType }
             *     
             */
            public void setEORIAdresseStruktur(EORIAdresseStrukturType value) {
                this.eoriAdresseStruktur = value;
            }

            /**
             * Gets the value of the euMomsNummerSamling property.
             * 
             * @return
             *     possible object is
             *     {@link EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.EUMomsNummerSamling }
             *     
             */
            public EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.EUMomsNummerSamling getEUMomsNummerSamling() {
                return euMomsNummerSamling;
            }

            /**
             * Sets the value of the euMomsNummerSamling property.
             * 
             * @param value
             *     allowed object is
             *     {@link EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.EUMomsNummerSamling }
             *     
             */
            public void setEUMomsNummerSamling(EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.EUMomsNummerSamling value) {
                this.euMomsNummerSamling = value;
            }

            /**
             * Gets the value of the eoriKontaktOplysningSamling property.
             * 
             * @return
             *     possible object is
             *     {@link EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.EORIKontaktOplysningSamling }
             *     
             */
            public EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.EORIKontaktOplysningSamling getEORIKontaktOplysningSamling() {
                return eoriKontaktOplysningSamling;
            }

            /**
             * Sets the value of the eoriKontaktOplysningSamling property.
             * 
             * @param value
             *     allowed object is
             *     {@link EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.EORIKontaktOplysningSamling }
             *     
             */
            public void setEORIKontaktOplysningSamling(EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.EORIKontaktOplysningSamling value) {
                this.eoriKontaktOplysningSamling = value;
            }

            /**
             * Gets the value of the gyldigAEO property.
             * 
             * @return
             *     possible object is
             *     {@link EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.GyldigAEO }
             *     
             */
            public EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.GyldigAEO getGyldigAEO() {
                return gyldigAEO;
            }

            /**
             * Sets the value of the gyldigAEO property.
             * 
             * @param value
             *     allowed object is
             *     {@link EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.GyldigAEO }
             *     
             */
            public void setGyldigAEO(EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.GyldigAEO value) {
                this.gyldigAEO = value;
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
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIKontaktOplysningStruktur" maxOccurs="unbounded" minOccurs="0"/>
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
                "eoriKontaktOplysningStruktur"
            })
            public static class EORIKontaktOplysningSamling {

                @XmlElement(name = "EORIKontaktOplysningStruktur")
                protected List<EORIKontaktOplysningStrukturType> eoriKontaktOplysningStruktur;

                /**
                 * Gets the value of the eoriKontaktOplysningStruktur property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the eoriKontaktOplysningStruktur property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEORIKontaktOplysningStruktur().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EORIKontaktOplysningStrukturType }
                 * 
                 * 
                 */
                public List<EORIKontaktOplysningStrukturType> getEORIKontaktOplysningStruktur() {
                    if (eoriKontaktOplysningStruktur == null) {
                        eoriKontaktOplysningStruktur = new ArrayList<EORIKontaktOplysningStrukturType>();
                    }
                    return this.eoriKontaktOplysningStruktur;
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
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperatørVATNummer" maxOccurs="unbounded" minOccurs="0"/>
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
                "euOperatørVATNummer"
            })
            public static class EUMomsNummerSamling {

                @XmlElement(name = "EUOperatørVATNummer")
                protected List<String> euOperatørVATNummer;

                /**
                 * Gets the value of the euOperatørVATNummer property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the euOperat�rVATNummer property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEUOperatørVATNummer().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getEUOperatørVATNummer() {
                    if (euOperatørVATNummer == null) {
                    	euOperatørVATNummer = new ArrayList<String>();
                    }
                    return this.euOperatørVATNummer;
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
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}AutoriseretØkonomiskOperatørStruktur"/>
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
                "autoriseretØkonomiskOperatørStruktur"
            })
            public static class GyldigAEO {

                @XmlElement(name = "AutoriseretØkonomiskOperatørStruktur", required = true)
                protected AutoriseretØkonomiskOperatørStrukturType autoriseretØkonomiskOperatørStruktur;

                /**
                 * Gets the value of the autoriseretØkonomiskOperatørStruktur property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AutoriseretØkonomiskOperatørStrukturType}
                 *     
                 */
                public AutoriseretØkonomiskOperatørStrukturType getAutoriseretØkonomiskOperatørStruktur() {
                    return autoriseretØkonomiskOperatørStruktur;
                }

                /**
                 * Sets the value of the autoriseret�konomiskOperat�rStruktur property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Autoriseret�konomiskOperat�rStrukturType }
                 *     
                 */
                public void setAutoriseretØkonomiskOperatørStruktur(AutoriseretØkonomiskOperatørStrukturType value) {
                    this.autoriseretØkonomiskOperatørStruktur = value;
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
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}�konomiskOperat�rEORINummer"/>
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
            public static class LokalReference {

                @XmlElement(name = "ØkonomiskOperatørEORINummer", required = true)
                protected String økonomiskOperatørEORINummer;

                /**
                 * Gets the value of the økonomiskOperatørEORINummer property.
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
                 * Sets the value of the økonomiskOperatørEORINummer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setØkonomiskOperatørEORINummer(String value) {
                    this.økonomiskOperatørEORINummer = value;
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
             *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ØkonomiskOperatørTredjeLandNummerStruktur" maxOccurs="unbounded"/>
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
                "økonomiskOperatørTredjeLandNummerStruktur"
            })
            public static class  ØkonomiskOperatørTredjeLandNummerStrukturListe {

                @XmlElement(name = "ØkonomiskOperatørTredjeLandNummerStruktur", required = true)
                protected List<ØkonomiskOperatørTredjeLandNummerStrukturType> økonomiskOperatørTredjeLandNummerStruktur;

                /**
                 * Gets the value of the økonomiskOperatørTredjeLandNummerStruktur property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the økonomiskOperatørTredjeLandNummerStruktur property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getØkonomiskOperatørTredjeLandNummerStruktur().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ØkonomiskOperatørTredjeLandNummerStrukturType }
                 * 
                 * 
                 */
                public List<ØkonomiskOperatørTredjeLandNummerStrukturType> getØkonomiskOperatørTredjeLandNummerStruktur() {
                    if (økonomiskOperatørTredjeLandNummerStruktur == null) {
                    	økonomiskOperatørTredjeLandNummerStruktur = new ArrayList<ØkonomiskOperatørTredjeLandNummerStrukturType>();
                    }
                    return this.økonomiskOperatørTredjeLandNummerStruktur;
                }

            }

        }

    }

}
