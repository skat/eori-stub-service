package dk.skat.eori.mapper;

import java.util.Date;

import dk.skat.begrebsmodel._2009._01._15.EORIAdresseStrukturType;
import dk.skat.begrebsmodel._2009._01._15.EORIAdresseStrukturType.EORIAdresseKortNavn;
import dk.skat.begrebsmodel._2009._01._15.EORIAdresseStrukturType.EORIAdresseNavn;
import dk.skat.begrebsmodel._2009._01._15.EORIAdresseStrukturType.EORIByNavn;
import dk.skat.begrebsmodel._2009._01._15.EORIAdresseStrukturType.EORIGadeNavnNummer;
import dk.skat.begrebsmodel._2009._01._15.EORIAdresseStrukturType.EORILandeKode;
import dk.skat.begrebsmodel._2009._01._15.EORIAdresseStrukturType.EORILandeNavn;
import dk.skat.begrebsmodel._2009._01._15.EORIAdresseStrukturType.EORIPostNummer;
import dk.skat.begrebsmodel._2009._01._15.EORIAdresseStrukturType.SprogKode;
import dk.skat.begrebsmodel._2009._01._15.ObjectFactory;
import dk.skat.eori.dto.EORIVirkWhitelist;
import dk.skat.eori.util.DateUtil;

public class AdresseStrukturMapping {
	
	protected static ObjectFactory objectFactory = new ObjectFactory();

	public static EORIAdresseStrukturType mapAdresseStruktur(EORIVirkWhitelist eoriVirkWhitelist,String økonomiskOperatørEORINummer ) {
		
    	EORIAdresseStrukturType  eoriAdresseStrukturType  = objectFactory.createEORIAdresseStrukturType();
    	SprogKode sprogKode = objectFactory.createEORIAdresseStrukturTypeSprogKode();
    	EORIAdresseNavn eoriAdresseNavn = objectFactory.createEORIAdresseStrukturTypeEORIAdresseNavn();
    	EORIAdresseKortNavn adresseKortNavn = objectFactory.createEORIAdresseStrukturTypeEORIAdresseKortNavn();
    	EORIPostNummer postNummer = objectFactory.createEORIAdresseStrukturTypeEORIPostNummer();
    	EORIGadeNavnNummer eoriGadeNavnNummer = objectFactory.createEORIAdresseStrukturTypeEORIGadeNavnNummer();
    	EORIByNavn eoriByNavn = objectFactory.createEORIAdresseStrukturTypeEORIByNavn();
    	
    	EORILandeNavn eoriLandeNavn = objectFactory.createEORIAdresseStrukturTypeEORILandeNavn();
    	EORILandeKode eoriLandeKode = objectFactory.createEORIAdresseStrukturTypeEORILandeKode();
    	
       	sprogKode.setSprogKode(økonomiskOperatørEORINummer.substring(0,2));
       	adresseKortNavn.setAlternativAdresseAdresseLinie1(eoriVirkWhitelist.getFirma_nvn_kort());
       	eoriAdresseNavn.setAlternativAdresseAdresseLinie2(eoriVirkWhitelist.getAdresseNavn());
       	eoriGadeNavnNummer.setAlternativAdresseAdresseLinie3("Østbanegade 123");
       	postNummer.setAlternativAdresseAdresseLinie4(eoriVirkWhitelist.getPostNumber());
       	eoriByNavn.setAlternativAdresseAdresseLinie5(eoriVirkWhitelist.getBy_nvn());
       	eoriLandeKode.setLandKode(økonomiskOperatørEORINummer.substring(0,2));
       	eoriLandeNavn.setLandNavn(eoriVirkWhitelist.getVej_nvn());
       	
       	eoriAdresseStrukturType.setSprogKode(sprogKode);
       	eoriAdresseStrukturType.setEORIAdresseNavn(eoriAdresseNavn);
       	eoriAdresseStrukturType.setEORIGadeNavnNummer(eoriGadeNavnNummer);
       	eoriAdresseStrukturType.setEORIPostNummer(postNummer);
       	eoriAdresseStrukturType.setEORIByNavn(eoriByNavn);
       	eoriAdresseStrukturType.setEORILandeNavn(eoriLandeNavn);
       	eoriAdresseStrukturType.setEORILandeKode(eoriLandeKode);
       	eoriAdresseStrukturType.setAlternativAdresseGyldigFra(DateUtil.dateToXmlGregorianCalendar(new Date()));

       	eoriAdresseStrukturType.setEORIAdresseKortNavn(adresseKortNavn);
       	
		return eoriAdresseStrukturType;
	}

}
