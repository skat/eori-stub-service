package dk.skat.begrebsmodel._2009._01._15;

import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.naming.NamingException;

import dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed;
import dk.skat.eori.exceptions.EORINumberNotFoundException;

@WebService
public interface EORIVirksomhedSamlingHent_I {
	
	@WebMethod
	public EORIVirksomhed getEORIVirksomhedSamlingHent(String eoriNumber) throws NamingException, SQLException, EORINumberNotFoundException;
	
	@WebMethod
    public String sayHello(String name);

}
