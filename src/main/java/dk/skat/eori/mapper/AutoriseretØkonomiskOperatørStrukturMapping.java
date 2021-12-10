package dk.skat.eori.mapper;

import java.util.Date;

import dk.skat.begrebsmodel._2009._01._15.AutoriseretØkonomiskOperatørStrukturType;
import dk.skat.begrebsmodel._2009._01._15.ObjectFactory;
import dk.skat.eori.util.DateUtil;

public class AutoriseretØkonomiskOperatørStrukturMapping {
	
	protected static ObjectFactory objectFactory = new ObjectFactory();

	
	public static AutoriseretØkonomiskOperatørStrukturType mapØkonomiskOperatørStruktur() {
		
    	AutoriseretØkonomiskOperatørStrukturType autoriseretØkonomiskOperatørStruktur = objectFactory.createAutoriseretØkonomiskOperatørStrukturType();
    	
       	autoriseretØkonomiskOperatørStruktur.setAutoriseretØkonomiskOperatørGyldigFra(DateUtil.dateToXmlGregorianCalendar(new Date()));
       	autoriseretØkonomiskOperatørStruktur.setLandKode("DK");
       	autoriseretØkonomiskOperatørStruktur.setAutoriseretØkonomiskOperatørCertifikatType("AEOF");
       	autoriseretØkonomiskOperatørStruktur.setAutoriseretØkonomiskOperatørIdentikationNummer("13-0999990");
       	
		return autoriseretØkonomiskOperatørStruktur;
		
	}

}
