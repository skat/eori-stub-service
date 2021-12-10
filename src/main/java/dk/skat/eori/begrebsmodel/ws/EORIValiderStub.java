package dk.skat.eori.begrebsmodel.ws;

import java.math.BigInteger;
import java.util.List;

import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dk.skat.eori.begrebsmodel._2009._01._15.EORIVirksomhedValiderI;
import dk.skat.eori.begrebsmodel._2009._01._15.EORIVirksomhedValiderIType.SECVRNummer;
import dk.skat.eori.begrebsmodel._2009._01._15.EORIVirksomhedValiderO;
import dk.skat.eori.begrebsmodel._2009._01._15.EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe;
import dk.skat.eori.begrebsmodel._2009._01._15.EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar;
import dk.skat.eori.begrebsmodel._2009._01._15.EORIVirksomhedValiderOType.EORIVirksomhedValiderSvarListe.EORIVirksomhedValiderSvar.LokalReference;
import dk.skat.eori.dao.EORIServiceDAO;
import dk.skat.eori.dto.EORIVirkWhitelist;
import dk.skat.eori.util.AbstractServiceImpl;
import dk.skat.eori.util.RequestHelper;
import dk.skat.eori.begrebsmodel._2009._01._15.EORIVirksomhedValiderServicePortType;
import dk.skat.eori.begrebsmodel._2009._01._15.KompenserTransSvarType;
import dk.skat.eori.begrebsmodel._2009._01._15.KompenserTransType;
import dk.skat.eori.begrebsmodel._2009._01._15.ObjectFactory;


@WebService(targetNamespace="http://skat.dk/begrebsmodel/2009/01/15/",
endpointInterface="dk.skat.eori.begrebsmodel._2009._01._15.EORIVirksomhedValiderServicePortType")
public class EORIValiderStub extends AbstractServiceImpl implements EORIVirksomhedValiderServicePortType{
	
	protected static ObjectFactory objectFactory = new ObjectFactory();
	
	private static final Log log = LogFactory.getLog(EORIStub.class);


	public EORIVirksomhedValiderO getEORIVirksomhedValider(EORIVirksomhedValiderI request) {
		
		SECVRNummer secVRNummer = request.getSECVRNummer();
		List<BigInteger>  secVRNummerList =  secVRNummer.getVirksomhedSENummer();
		EORIServiceDAO eoriService = new EORIServiceDAO();
		
		
		EORIVirksomhedValiderO eoriVirksomhedValiderO = objectFactory.createEORIVirksomhedValiderO();
		EORIVirksomhedValiderSvarListe eoriVirksomhedValiderSvarListe = objectFactory.createEORIVirksomhedValiderOTypeEORIVirksomhedValiderSvarListe();
		
		handleHovedOplysninger(request, eoriVirksomhedValiderO);

		for(BigInteger secVRNumber :  secVRNummerList ) {
			
			EORIVirkWhitelist eoriVirkWhitelist = new EORIVirkWhitelist();

			EORIVirksomhedValiderSvar eoriVirksomhedValiderSvar = objectFactory.createEORIVirksomhedValiderOTypeEORIVirksomhedValiderSvarListeEORIVirksomhedValiderSvar();
			LokalReference lokalReference = objectFactory.createEORIVirksomhedValiderOTypeEORIVirksomhedValiderSvarListeEORIVirksomhedValiderSvarLokalReference();
			
			eoriVirkWhitelist =  eoriService.getEORINumber(secVRNumber.toString());
			if (eoriVirkWhitelist.getEoriNumber().length() > 0) {
				
				log.info("---------- EORIValiderStubService Called - EORI Number Found - BEGIN -----------------------");
				log.info("---------- Given EORI Number   --------------->" + eoriVirkWhitelist.getEoriNumber());
				eoriVirksomhedValiderSvar.setEORIErValid(true);
				lokalReference.setVirksomhedSENummer(new BigInteger(eoriVirkWhitelist.getEoriNumber()));
				eoriVirksomhedValiderSvar.setLokalReference(lokalReference);
				eoriVirksomhedValiderSvarListe.getEORIVirksomhedValiderSvar().add(eoriVirksomhedValiderSvar);
				eoriVirksomhedValiderO.setEORIVirksomhedValiderSvarListe(eoriVirksomhedValiderSvarListe);
				log.info("---------- EORIValiderStubService Called - EORI Number Found - END ------------------------");

				addHovedOplysningerSvar(eoriVirksomhedValiderO, eoriVirksomhedValiderSvarListe);

			} else {
				
				eoriVirksomhedValiderSvar.setEORIErValid(false);
				lokalReference.setVirksomhedSENummer(secVRNumber);
				Object outDoc = null;
				//eoriVirksomhedValiderO.setKontekst(kontekstType);
				outDoc = RequestHelper.svarReaktionTemplate;
				RequestHelper.setOutputErrorDocument(outDoc);
				outDoc = RequestHelper.getOutputErrorDocument();
				eoriVirksomhedValiderO.setEORIVirksomhedValiderSvarListe(eoriVirksomhedValiderSvarListe);
				addHovedOplysningerSvar1(eoriVirksomhedValiderO, outDoc, secVRNumber.toString());
				
			}
		}
		
		return eoriVirksomhedValiderO;
	}

	public KompenserTransSvarType getKompenserTrans(KompenserTransType request) {
		// TODO Auto-generated method stub
		return null;
	}

}
