
package dk.skat.begrebsmodel._2009._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ØkonomiskOperatørTredjeLandNummerStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ØkonomiskOperatørTredjeLandNummerStrukturType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LandIdentifikationValg">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}LandKode"/>
 *                   &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}LandNavn"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}ØkonomiskOperatørTredjeLandNummer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ØkonomiskOperatørTredjeLandNummerStrukturType", propOrder = {
    "landIdentifikationValg",
    "økonomiskOperatørTredjeLandNummer"
})
public class ØkonomiskOperatørTredjeLandNummerStrukturType {

    @XmlElement(name = "LandIdentifikationValg", required = true)
    protected ØkonomiskOperatørTredjeLandNummerStrukturType.LandIdentifikationValg landIdentifikationValg;
    @XmlElement(name = "ØkonomiskOperatørTredjeLandNummer", required = true)
    protected String økonomiskOperatørTredjeLandNummer;

    /**
     * Gets the value of the landIdentifikationValg property.
     * 
     * @return
     *     possible object is
     *     {@link ØkonomiskOperatørTredjeLandNummerStrukturType.LandIdentifikationValg }
     *     
     */
    public ØkonomiskOperatørTredjeLandNummerStrukturType.LandIdentifikationValg getLandIdentifikationValg() {
        return landIdentifikationValg;
    }

    /**
     * Sets the value of the landIdentifikationValg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ØkonomiskOperatørTredjeLandNummerStrukturType.LandIdentifikationValg }
     *     
     */
    public void setLandIdentifikationValg(ØkonomiskOperatørTredjeLandNummerStrukturType.LandIdentifikationValg value) {
        this.landIdentifikationValg = value;
    }

    /**
     * Gets the value of the ØkonomiskOperatørTredjeLandNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getØkonomiskOperatørTredjeLandNummer() {
        return økonomiskOperatørTredjeLandNummer;
    }

    /**
     * Sets the value of the ØkonomiskOperatørTredjeLandNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setØkonomiskOperatørTredjeLandNummer(String value) {
        this.økonomiskOperatørTredjeLandNummer = value;
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
     *       &lt;choice>
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}LandKode"/>
     *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}LandNavn"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "landKode",
        "landNavn"
    })
    public static class LandIdentifikationValg {

        @XmlElement(name = "LandKode")
        protected String landKode;
        @XmlElement(name = "LandNavn")
        protected String landNavn;

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

}
