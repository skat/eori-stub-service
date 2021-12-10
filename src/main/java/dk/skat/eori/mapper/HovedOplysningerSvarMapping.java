package dk.skat.eori.mapper;

import java.util.Date;

import dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentI;
import dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31.HovedOplysningerSvarType;
import dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31.ObjectFactoryTransaktions;
import dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31.SvarReaktionType;
import dk.skat.eori.util.DateUtil;

public class HovedOplysningerSvarMapping {
	
	protected static ObjectFactoryTransaktions hovedOplysningerSvarFactory = new ObjectFactoryTransaktions();
	
	public static HovedOplysningerSvarType mapHovedOplysningerSvarType(EORIVirksomhedSamlingHentI request) {
		
    	HovedOplysningerSvarType hovedOplysningerSvarType = hovedOplysningerSvarFactory.createHovedOplysningerSvarType();
    	
    	SvarReaktionType svarReaktionType = hovedOplysningerSvarFactory.createSvarReaktionType();


   		hovedOplysningerSvarType.setTransaktionsID("TRK-1632736445093");
    	hovedOplysningerSvarType.setServiceID("EORIStubService");
    	hovedOplysningerSvarType.setTransaktionsTid(DateUtil.dateToXmlGregorianCalendar(new Date()));
    	
    	svarReaktionType.setFejl(FejlTypeMapping.mapFejlType(request));
    	
    	hovedOplysningerSvarType.getSvarReaktion().add(svarReaktionType);
		
		return hovedOplysningerSvarType;
	}
}
