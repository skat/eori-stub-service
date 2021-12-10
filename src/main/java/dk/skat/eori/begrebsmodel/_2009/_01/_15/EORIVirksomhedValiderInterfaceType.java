
package dk.skat.eori.begrebsmodel._2009._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EORIVirksomhedValiderInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EORIVirksomhedValiderInterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIVirksomhedValider_I"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIVirksomhedValider_O"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}KompenserTrans"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}KompenserTransSvar"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EORIVirksomhedValiderInterfaceType", propOrder = {
    "eoriVirksomhedValiderI",
    "eoriVirksomhedValiderO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class EORIVirksomhedValiderInterfaceType {

    @XmlElement(name = "EORIVirksomhedValider_I")
    protected EORIVirksomhedValiderI eoriVirksomhedValiderI;
    @XmlElement(name = "EORIVirksomhedValider_O")
    protected EORIVirksomhedValiderO eoriVirksomhedValiderO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the eoriVirksomhedValiderI property.
     * 
     * @return
     *     possible object is
     *     {@link EORIVirksomhedValiderI }
     *     
     */
    public EORIVirksomhedValiderI getEORIVirksomhedValiderI() {
        return eoriVirksomhedValiderI;
    }

    /**
     * Sets the value of the eoriVirksomhedValiderI property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIVirksomhedValiderI }
     *     
     */
    public void setEORIVirksomhedValiderI(EORIVirksomhedValiderI value) {
        this.eoriVirksomhedValiderI = value;
    }

    /**
     * Gets the value of the eoriVirksomhedValiderO property.
     * 
     * @return
     *     possible object is
     *     {@link EORIVirksomhedValiderO }
     *     
     */
    public EORIVirksomhedValiderO getEORIVirksomhedValiderO() {
        return eoriVirksomhedValiderO;
    }

    /**
     * Sets the value of the eoriVirksomhedValiderO property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIVirksomhedValiderO }
     *     
     */
    public void setEORIVirksomhedValiderO(EORIVirksomhedValiderO value) {
        this.eoriVirksomhedValiderO = value;
    }

    /**
     * Gets the value of the kompenserTrans property.
     * 
     * @return
     *     possible object is
     *     {@link KompenserTransType }
     *     
     */
    public KompenserTransType getKompenserTrans() {
        return kompenserTrans;
    }

    /**
     * Sets the value of the kompenserTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link KompenserTransType }
     *     
     */
    public void setKompenserTrans(KompenserTransType value) {
        this.kompenserTrans = value;
    }

    /**
     * Gets the value of the kompenserTransSvar property.
     * 
     * @return
     *     possible object is
     *     {@link KompenserTransSvarType }
     *     
     */
    public KompenserTransSvarType getKompenserTransSvar() {
        return kompenserTransSvar;
    }

    /**
     * Sets the value of the kompenserTransSvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link KompenserTransSvarType }
     *     
     */
    public void setKompenserTransSvar(KompenserTransSvarType value) {
        this.kompenserTransSvar = value;
    }

}
