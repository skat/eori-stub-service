
package dk.skat.begrebsmodel._2009._01._15;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EORIVirksomhedSamlingHentServicePortType", targetNamespace = "http://skat.dk/begrebsmodel/2009/01/15/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EORIVirksomhedSamlingHentServicePortType {


    /**
     * 
     * @param request
     * @return
     *     returns dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentO
     */
    @WebMethod
    @WebResult(name = "EORIVirksomhedSamlingHent_O", targetNamespace = "http://skat.dk/begrebsmodel/2009/01/15/", partName = "Response")
    public EORIVirksomhedSamlingHentO getEORIVirksomhedSamlingHent(
        @WebParam(name = "EORIVirksomhedSamlingHent_I", targetNamespace = "http://skat.dk/begrebsmodel/2009/01/15/", partName = "Request")
        EORIVirksomhedSamlingHentI request);

    /**
     * 
     * @param request
     * @return
     *     returns dk.skat.begrebsmodel._2009._01._15.KompenserTransSvarType
     */
    @WebMethod
    @WebResult(name = "KompenserTransSvar", targetNamespace = "http://skat.dk/begrebsmodel/2009/01/15/", partName = "Response")
    public KompenserTransSvarType getKompenserTrans(
        @WebParam(name = "KompenserTrans", targetNamespace = "http://skat.dk/begrebsmodel/2009/01/15/", partName = "Request")
        KompenserTransType request);

}
