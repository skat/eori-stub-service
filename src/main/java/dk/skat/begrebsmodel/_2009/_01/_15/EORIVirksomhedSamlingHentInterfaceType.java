
package dk.skat.begrebsmodel._2009._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EORIVirksomhedSamlingHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EORIVirksomhedSamlingHentInterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIVirksomhedSamlingHent_I"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIVirksomhedSamlingHent_O"/>
 *         &lt;element ref="{http://skat.dk/begrebsmodel/2009/01/15/}EORIVirksomhedSamlingHent_FejlId"/>
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
@XmlType(name = "EORIVirksomhedSamlingHentInterfaceType", propOrder = {
    "eoriVirksomhedSamlingHentI",
    "eoriVirksomhedSamlingHentO",
    "eoriVirksomhedSamlingHentFejlId",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class EORIVirksomhedSamlingHentInterfaceType {

    @XmlElement(name = "EORIVirksomhedSamlingHent_I")
    protected EORIVirksomhedSamlingHentI eoriVirksomhedSamlingHentI;
    @XmlElement(name = "EORIVirksomhedSamlingHent_O")
    protected EORIVirksomhedSamlingHentO eoriVirksomhedSamlingHentO;
    @XmlElement(name = "EORIVirksomhedSamlingHent_FejlId")
    protected EORIVirksomhedSamlingHentFejlIdType eoriVirksomhedSamlingHentFejlId;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the eoriVirksomhedSamlingHentI property.
     * 
     * @return
     *     possible object is
     *     {@link EORIVirksomhedSamlingHentI }
     *     
     */
    public EORIVirksomhedSamlingHentI getEORIVirksomhedSamlingHentI() {
        return eoriVirksomhedSamlingHentI;
    }

    /**
     * Sets the value of the eoriVirksomhedSamlingHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIVirksomhedSamlingHentI }
     *     
     */
    public void setEORIVirksomhedSamlingHentI(EORIVirksomhedSamlingHentI value) {
        this.eoriVirksomhedSamlingHentI = value;
    }

    /**
     * Gets the value of the eoriVirksomhedSamlingHentO property.
     * 
     * @return
     *     possible object is
     *     {@link EORIVirksomhedSamlingHentO }
     *     
     */
    public EORIVirksomhedSamlingHentO getEORIVirksomhedSamlingHentO() {
        return eoriVirksomhedSamlingHentO;
    }

    /**
     * Sets the value of the eoriVirksomhedSamlingHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIVirksomhedSamlingHentO }
     *     
     */
    public void setEORIVirksomhedSamlingHentO(EORIVirksomhedSamlingHentO value) {
        this.eoriVirksomhedSamlingHentO = value;
    }

    /**
     * Gets the value of the eoriVirksomhedSamlingHentFejlId property.
     * 
     * @return
     *     possible object is
     *     {@link EORIVirksomhedSamlingHentFejlIdType }
     *     
     */
    public EORIVirksomhedSamlingHentFejlIdType getEORIVirksomhedSamlingHentFejlId() {
        return eoriVirksomhedSamlingHentFejlId;
    }

    /**
     * Sets the value of the eoriVirksomhedSamlingHentFejlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EORIVirksomhedSamlingHentFejlIdType }
     *     
     */
    public void setEORIVirksomhedSamlingHentFejlId(EORIVirksomhedSamlingHentFejlIdType value) {
        this.eoriVirksomhedSamlingHentFejlId = value;
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
