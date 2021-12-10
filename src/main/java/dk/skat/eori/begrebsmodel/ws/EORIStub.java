package dk.skat.eori.begrebsmodel.ws;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentI;
import dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentO;
import dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling;
import dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed;
import dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.EORIKontaktOplysningSamling;
//import dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.GyldigAEO;
import dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.ØkonomiskOperatørTredjeLandNummerStrukturListe;
import dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentServicePortType;
import dk.skat.begrebsmodel._2009._01._15.KompenserTransSvarType;
import dk.skat.begrebsmodel._2009._01._15.KompenserTransType;
import dk.skat.begrebsmodel._2009._01._15.KontekstType;
import dk.skat.begrebsmodel._2009._01._15.ObjectFactory;
import dk.skat.begrebsmodel._2009._01._15.ØkonomiskOperatørTredjeLandNummerStrukturType;
import dk.skat.begrebsmodel._2009._01._15.ØkonomiskOperatørTredjeLandNummerStrukturType.LandIdentifikationValg;
import dk.skat.eori.dao.EORIServiceDAO;
import dk.skat.eori.dto.EORIVirkWhitelist;
import dk.skat.eori.mapper.AdresseStrukturMapping;
//import dk.skat.eori.mapper.AutoriseretØkonomiskOperatørStrukturMapping;
import dk.skat.eori.mapper.EUMomsNummerMapping;
import dk.skat.eori.util.AbstractServiceImpl;
import dk.skat.eori.util.DateUtil;
import dk.skat.eori.util.RequestHelper;

@WebService(targetNamespace = "http://skat.dk/begrebsmodel/2009/01/15/", endpointInterface = "dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentServicePortType")
public class EORIStub extends AbstractServiceImpl implements EORIVirksomhedSamlingHentServicePortType {

	protected ObjectFactory objectFactory = new ObjectFactory();

	private static final Log log = LogFactory.getLog(EORIStub.class);

	public EORIVirksomhedSamlingHentO getEORIVirksomhedSamlingHent(EORIVirksomhedSamlingHentI request) {

		List<String> økonomiskOperatørEORINummerList = request.getEORINummerSamling().getØkonomiskOperatørEORINummer();
		//removeDuplicates(økonomiskOperatørEORINummerList);
		request.getKontekst();
		
		Set<String> eoriSet = new HashSet<String>();
		eoriSet.addAll(økonomiskOperatørEORINummerList);
		økonomiskOperatørEORINummerList.clear();
		økonomiskOperatørEORINummerList.addAll(eoriSet);

		EORIVirksomhedSamling eoriVirksomhedSamling = objectFactory.createEORIVirksomhedSamlingHentOTypeEORIVirksomhedSamling();
		EORIVirksomhedSamlingHentO eoriVirksomhedSamlingHentO = objectFactory.createEORIVirksomhedSamlingHentO();

		handleHovedOplysninger(request, eoriVirksomhedSamlingHentO);

		LandIdentifikationValg landIdentifikationValg = objectFactory.createØkonomiskOperatørTredjeLandNummerStrukturTypeLandIdentifikationValg();
		EORIKontaktOplysningSamling eoriKontaktOplysningSamling = objectFactory.createEORIVirksomhedSamlingHentOTypeEORIVirksomhedSamlingEORIVirksomhedEORIKontaktOplysningSamling();
		//GyldigAEO gyldigAEO = objectFactory.createEORIVirksomhedSamlingHentOTypeEORIVirksomhedSamlingEORIVirksomhedGyldigAEO();
		KontekstType kontekstType = objectFactory.createKontekstType();
		EORIServiceDAO eoriService = new EORIServiceDAO();

		for (String økonomiskOperatørEORINummer : økonomiskOperatørEORINummerList) {
			
			
			EORIVirkWhitelist eoriVirkWhitelist = new EORIVirkWhitelist();
			
			EORIVirksomhed eoriVirksomhed = objectFactory.createEORIVirksomhedSamlingHentOTypeEORIVirksomhedSamlingEORIVirksomhed();
			ØkonomiskOperatørTredjeLandNummerStrukturListe økonomiskOperatørTredjeLandNummerStrukturListe = objectFactory
					.createEORIVirksomhedSamlingHentOTypeEORIVirksomhedSamlingEORIVirksomhedØkonomiskOperatørTredjeLandNummerStrukturListe();
			ØkonomiskOperatørTredjeLandNummerStrukturType økonomiskOperatørTredjeLandNummerStruktur = objectFactory.createØkonomiskOperatørTredjeLandNummerStrukturType();


			if("FI".equals(økonomiskOperatørEORINummer.substring(0,2))) {
				log.info("%%%%%%%%%%%%%%%%%%%%%%%%%%% Finland EORI Number Found %%%%%%%%%%%%%%%%%%--->"+økonomiskOperatørEORINummer);
				eoriVirkWhitelist = eoriService.getEORINumber(økonomiskOperatørEORINummer);
			} else {
				eoriVirkWhitelist = eoriService.getEORINumber(økonomiskOperatørEORINummer.substring(2));
			}

			if (eoriVirkWhitelist.getEoriNumber().length() > 0) {

				log.info("---------- EORIStubService Called - EORI Number Found - Begin ------------------------");
				log.info("---------- Given EORI Number   --------------->" + eoriVirkWhitelist.getEoriNumber());

				if("FI".equals(økonomiskOperatørEORINummer.substring(0,2))) {
					eoriVirksomhed.setØkonomiskOperatørEORINummer( eoriVirkWhitelist.getEoriNumber());
				} else {
					
					eoriVirksomhed.setØkonomiskOperatørEORINummer(økonomiskOperatørEORINummer.substring(0,2) + eoriVirkWhitelist.getEoriNumber());
				}
				landIdentifikationValg.setLandKode(økonomiskOperatørEORINummer.substring(0,2));
				økonomiskOperatørTredjeLandNummerStruktur.setLandIdentifikationValg(landIdentifikationValg);
				økonomiskOperatørTredjeLandNummerStrukturListe.getØkonomiskOperatørTredjeLandNummerStruktur().add(økonomiskOperatørTredjeLandNummerStruktur);
				if("FI".equals(økonomiskOperatørEORINummer.substring(0,2))) {
					økonomiskOperatørTredjeLandNummerStruktur.setØkonomiskOperatørTredjeLandNummer(eoriVirkWhitelist.getEoriNumber());

				} else {
					økonomiskOperatørTredjeLandNummerStruktur.setØkonomiskOperatørTredjeLandNummer(økonomiskOperatørEORINummer.substring(0,2) + eoriVirkWhitelist.getEoriNumber());

				}
				eoriVirksomhed.setØkonomiskOperatørTredjeLandNummerStrukturListe(økonomiskOperatørTredjeLandNummerStrukturListe);
				eoriVirksomhed.setEUOperatørNavn(eoriVirkWhitelist.getFirma_nvn());
				eoriVirksomhed.setEUOperatørNavnKort(eoriVirkWhitelist.getFirma_nvn_kort());
				eoriVirksomhed.setEUOperatørGyldigFra(DateUtil.dateToXmlGregorianCalendar(new Date()));
				
				eoriVirksomhed.setEUOperatørGyldigFra(DateUtil.dateToXmlGregorianCalendar(eoriVirkWhitelist.getVirk_nvn_start_dto()));
				
				eoriVirksomhed.setEORIAdresseStruktur(AdresseStrukturMapping.mapAdresseStruktur(eoriVirkWhitelist,økonomiskOperatørEORINummer));
				eoriVirksomhed.setEUMomsNummerSamling(EUMomsNummerMapping.mapEUMomsNummerSamling());
				eoriVirksomhed.setEORIKontaktOplysningSamling(eoriKontaktOplysningSamling);
				//gyldigAEO.setAutoriseretØkonomiskOperatørStruktur(AutoriseretØkonomiskOperatørStrukturMapping.mapØkonomiskOperatørStruktur());

				//eoriVirksomhed.setGyldigAEO(gyldigAEO);
				eoriVirksomhedSamling.getEORIVirksomhed().add(eoriVirksomhed);
				eoriVirksomhedSamlingHentO.setKontekst(kontekstType);
				eoriVirksomhedSamlingHentO.setEORIVirksomhedSamling(eoriVirksomhedSamling);
				log.info("---------- EORIStubService Called - EORI Number Found - End   ------------------------");

				addHovedOplysningerSvar(eoriVirksomhedSamlingHentO, eoriVirksomhedSamling);

			} else {

				log.info("################# EORIStubService Called - EORI Number NOT Found - Begin ######");
				//for (String økonomiskOperatørEORINumber : økonomiskOperatørEORINummerList) {
				log.info("############      Given EORI Number    ############--->" + økonomiskOperatørEORINummer);
				//}

				Object outDoc = null;
				eoriVirksomhedSamlingHentO.setKontekst(kontekstType);
				outDoc = RequestHelper.svarReaktionTemplate;
				RequestHelper.setOutputErrorDocument(outDoc);
				outDoc = RequestHelper.getOutputErrorDocument();
				eoriVirksomhedSamlingHentO.setEORIVirksomhedSamling(eoriVirksomhedSamling);
				addHovedOplysningerSvar1(eoriVirksomhedSamlingHentO, outDoc, økonomiskOperatørEORINummer);
				log.info("############ EORIStubService Called - EORI Number NOT Found - End ############");
			}
		}

		return eoriVirksomhedSamlingHentO;
	}

	public KompenserTransSvarType getKompenserTrans(KompenserTransType request) {
		// TODO Auto-generated method stub
		return null;
	}

	/*private static List<String> removeDuplicates(List<String> økonomiskOperatørEORINumberList) {
		
				Set<String> eoriSet = new HashSet<String>();
				eoriSet.addAll(økonomiskOperatørEORINumberList);
				økonomiskOperatørEORINumberList.clear();
				økonomiskOperatørEORINumberList.addAll(eoriSet);
				return økonomiskOperatørEORINumberList;
	}*/
}
