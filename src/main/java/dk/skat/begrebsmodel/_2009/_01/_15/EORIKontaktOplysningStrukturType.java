
package dk.skat.begrebsmodel._2009._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EORIKontaktOplysningStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EORIKontaktOplysningStrukturType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperatørKontaktOplysningTelefonNummer"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperatørKontaktOplysningFaxNummer"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EUOperatørKontaktOplysningEmail"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIAdresseStruktur"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EORIKontaktOplysningStrukturType", propOrder = {
    "euOperatørKontaktOplysningTelefonNummer",
    "euOperatørKontaktOplysningFaxNummer",
    "euOperatørKontaktOplysningEmail",
    "eoriAdresseStruktur"
})
public class EORIKontaktOplysningStrukturType {

    @XmlElement(name = "EUOperatørKontaktOplysningTelefonNummer", required = true)
    protected String euOperatørKontaktOplysningTelefonNummer;
    @XmlElement(name = "EUOperatørKontaktOplysningFaxNummer", required = true)
    protected String euOperatørKontaktOplysningFaxNummer;
    @XmlElement(name = "EUOperatørKontaktOplysningEmail", required = true)
    protected String euOperatørKontaktOplysningEmail;
    @XmlElement(name = "EORIAdresseStruktur", required = true)
    protected EORIAdresseStrukturType eoriAdresseStruktur;

    /**
     * Gets the value of the euOperat�rKontaktOplysningTelefonNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUOperatørKontaktOplysningTelefonNummer() {
        return euOperatørKontaktOplysningTelefonNummer;
    }

    /**
     * Sets the value of the euOperat�rKontaktOplysningTelefonNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUOperatørKontaktOplysningTelefonNummer(String value) {
        this.euOperatørKontaktOplysningTelefonNummer = value;
    }

    /**
     * Gets the value of the euOperat�rKontaktOplysningFaxNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUOperatørKontaktOplysningFaxNummer() {
        return euOperatørKontaktOplysningFaxNummer;
    }

    /**
     * Sets the value of the euOperat�rKontaktOplysningFaxNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUOperatørKontaktOplysningFaxNummer(String value) {
        this.euOperatørKontaktOplysningFaxNummer = value;
    }

    /**
     * Gets the value of the euOperat�rKontaktOplysningEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUOperatørKontaktOplysningEmail() {
        return euOperatørKontaktOplysningEmail;
    }

    /**
     * Sets the value of the euOperat�rKontaktOplysningEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUOperatørKontaktOplysningEmail(String value) {
        this.euOperatørKontaktOplysningEmail = value;
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

}
