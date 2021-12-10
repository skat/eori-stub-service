package dk.skat.eori.mapper;

import dk.skat.begrebsmodel._2009._01._15.ObjectFactory;
import dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed.EUMomsNummerSamling;

public class EUMomsNummerMapping {
	
	protected static ObjectFactory objectFactory = new ObjectFactory();
	
	public static EUMomsNummerSamling mapEUMomsNummerSamling() {
		
    	EUMomsNummerSamling euMomsNummerSamling = objectFactory.createEORIVirksomhedSamlingHentOTypeEORIVirksomhedSamlingEORIVirksomhedEUMomsNummerSamling();
       	euMomsNummerSamling.getEUOperatørVATNummer().add("DK39883686XXXX");
       	euMomsNummerSamling.getEUOperatørVATNummer().add("DK32026613YYYY");
       	
		return euMomsNummerSamling;
	}
}
