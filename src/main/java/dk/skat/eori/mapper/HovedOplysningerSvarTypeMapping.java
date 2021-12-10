package dk.skat.eori.mapper;

import java.util.Date;

import dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31.HovedOplysningerSvarType;
import dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31.ObjectFactoryTransaktions;
import dk.skat.eori.util.DateUtil;

public class HovedOplysningerSvarTypeMapping {
	
	protected static ObjectFactoryTransaktions hovedOplysningerSvarFactory = new ObjectFactoryTransaktions();

	
	public static HovedOplysningerSvarType mapHovedOplysningerSvarType() {
		
    	HovedOplysningerSvarType hovedOplysningerSvarType = hovedOplysningerSvarFactory.createHovedOplysningerSvarType();
    	
    	hovedOplysningerSvarType.setTransaktionsID("TRK-1632736445093");
    	hovedOplysningerSvarType.setServiceID("EORIStubService");
    	hovedOplysningerSvarType.setTransaktionsTid(DateUtil.dateToXmlGregorianCalendar(new Date()));
		return hovedOplysningerSvarType;
		
		
	}

}
