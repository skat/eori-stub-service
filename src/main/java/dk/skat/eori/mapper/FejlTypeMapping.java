package dk.skat.eori.mapper;

import java.math.BigInteger;
import java.util.List;

import dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentI;
import dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31.FejlType;
import dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31.ObjectFactoryTransaktions;
import dk.skat.begrebsmodel.xml.schemas.kontekst._2007._05._31.SvarReaktionType;

public class FejlTypeMapping {

	protected static ObjectFactoryTransaktions hovedOplysningerSvarFactory = new ObjectFactoryTransaktions();

	public static FejlType mapFejlType(EORIVirksomhedSamlingHentI request) {
		
		SvarReaktionType svarReaktionType = hovedOplysningerSvarFactory.createSvarReaktionType();
		FejlType fejlType = hovedOplysningerSvarFactory.createFejlType();

		fejlType.setFejlNummer(new BigInteger("10006"));
		List<String>  økonomiskOperatørEORINummerList = request.getEORINummerSamling().getØkonomiskOperatørEORINummer();
		for (String økonomiskOperatørEORINummer : økonomiskOperatørEORINummerList) {
			fejlType.setFejlTekst("The company with EORI number " + økonomiskOperatørEORINummer
					+ " does not exist in the whitelisted EORI numbers.");
		}
		svarReaktionType.setFejl(fejlType);
		
		return fejlType;
	}

}
