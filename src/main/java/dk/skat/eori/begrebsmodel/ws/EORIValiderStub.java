package dk.skat.eori.begrebsmodel.ws;

import java.math.BigInteger;
import java.util.ArrayList;
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
import dk.skat.eori.begrebsmodel._2009._01._15.EORIVirksomhedValiderServicePortType;
import dk.skat.eori.begrebsmodel._2009._01._15.KompenserTransSvarType;
import dk.skat.eori.begrebsmodel._2009._01._15.KompenserTransType;
import dk.skat.eori.begrebsmodel._2009._01._15.ObjectFactory;
import dk.skat.eori.dao.EORIServiceDAO;
import dk.skat.eori.dto.EORIVirkWhitelist;
import dk.skat.eori.util.AbstractServiceImpl;
import dk.skat.eori.util.RequestHelper;


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
		
		//KontekstType kontekstType = objectFactory.createKontekstType();
		
		handleHovedOplysninger(request, eoriVirksomhedValiderO);
		
		List<String> listOfErrorCVRs = new ArrayList<String>();;



		for(BigInteger secVRNumber :  secVRNummerList ) {
			
			EORIVirkWhitelist eoriVirkWhitelist = new EORIVirkWhitelist();

			
			eoriVirkWhitelist =  eoriService.getEORINumber(secVRNumber.toString());
			if (eoriVirkWhitelist.getEoriNumber().length() > 0) {
				
				EORIVirksomhedValiderSvar eoriVirksomhedValiderSvar = objectFactory.createEORIVirksomhedValiderOTypeEORIVirksomhedValiderSvarListeEORIVirksomhedValiderSvar();
				LokalReference lokalReference = objectFactory.createEORIVirksomhedValiderOTypeEORIVirksomhedValiderSvarListeEORIVirksomhedValiderSvarLokalReference();
				
				log.info("---------- EORIValiderStubService Called - EORI Number Found - BEGIN -----------------------");
				log.info("---------- Given EORI Number   --------------->" + eoriVirkWhitelist.getEoriNumber());
				eoriVirksomhedValiderSvar.setEORIErValid(true);
				lokalReference.setVirksomhedSENummer(new BigInteger(eoriVirkWhitelist.getEoriNumber()));
				eoriVirksomhedValiderSvar.setLokalReference(lokalReference);
				eoriVirksomhedValiderSvarListe.getEORIVirksomhedValiderSvar().add(eoriVirksomhedValiderSvar);
				eoriVirksomhedValiderO.setEORIVirksomhedValiderSvarListe(eoriVirksomhedValiderSvarListe);
				log.info("---------- EORIValiderStubService Called - EORI Number Found - END ------------------------");
				addHovedOplysningerSvar(eoriVirksomhedValiderO, eoriVirksomhedValiderSvarListe);

			} 
			if (eoriVirkWhitelist.getEoriNumber().length() == 0) {
				log.info("################# EORIStubService Called - EORI Number NOT Found - Begin ######");
				log.info("********      Given EORI Number   ********--->" + secVRNumber);
				listOfErrorCVRs.add(secVRNumber.toString());
				log.info("############ EORIStubService Called - EORI Number NOT Found - End ############");
			}
		}
		
		if(listOfErrorCVRs.size() > 0) {
			Object outDoc = null;
			outDoc = RequestHelper.svarReaktionTmplate;
			RequestHelper.setOutputErrorDocument(outDoc);
			outDoc = RequestHelper.getOutputErrorDocument();

			for(int i=0 ; i<listOfErrorCVRs.size() ; i++) {
				
				EORIVirksomhedValiderSvar eoriVirksomhedValiderSvar = objectFactory.createEORIVirksomhedValiderOTypeEORIVirksomhedValiderSvarListeEORIVirksomhedValiderSvar();
				LokalReference lokalReference = objectFactory.createEORIVirksomhedValiderOTypeEORIVirksomhedValiderSvarListeEORIVirksomhedValiderSvarLokalReference();
				eoriVirksomhedValiderSvar.setEORIErValid(false);
				lokalReference.setVirksomhedSENummer(new BigInteger(listOfErrorCVRs.get(i)));
				eoriVirksomhedValiderO.setEORIVirksomhedValiderSvarListe(eoriVirksomhedValiderSvarListe);
				eoriVirksomhedValiderSvar.setLokalReference(lokalReference);
				eoriVirksomhedValiderSvarListe.getEORIVirksomhedValiderSvar().add(eoriVirksomhedValiderSvar);
				addHovedOplysningerSvarValider(eoriVirksomhedValiderO, outDoc, listOfErrorCVRs.get(i),listOfErrorCVRs);
			}
		}
		return eoriVirksomhedValiderO;
	}

	public KompenserTransSvarType getKompenserTrans(KompenserTransType request) {
		// TODO Auto-generated method stub
		return null;
	}

}
