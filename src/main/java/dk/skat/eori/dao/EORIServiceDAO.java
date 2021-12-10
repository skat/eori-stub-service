package dk.skat.eori.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;

import javax.naming.NamingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//import dk.skat.begrebsmodel._2009._01._15.EORIVirksomhedSamlingHentOType;
import dk.skat.eori.database.DB;
import dk.skat.eori.dto.EORIVirkWhitelist;

public class EORIServiceDAO {
	
	//public List<EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed> eoriVirksomhed = new ArrayList<EORIVirksomhedSamlingHentOType.EORIVirksomhedSamling.EORIVirksomhed>();
	
	private static final Log log = LogFactory.getLog(EORIServiceDAO.class);
	
	
	public EORIVirkWhitelist getEORINumber(String eoriNr) {
        Connection sqlConnection = null;
        Statement sqlStatement = null;
        ResultSet sqlResultSet = null;
        StringBuilder strSql= new StringBuilder();
        EORIVirkWhitelist virkWhitelist = new EORIVirkWhitelist();
        
        strSql.append("SELECT vw.SE_nr , vn.Firma_nvn , vn.Firma_nvn_kort,va.Post_nr,va.By_nvn,va.Virk_adr_txt,vn.Virk_nvn_start_dto,va.Vej_nvn  "
        		+ " FROM TTransAngivelse.dbo.Virk_whitelist vw \r\n" + 
        		"JOIN TTransAngivelse.dbo.Virk_nvn vn \r\n" + 
        		"ON vw.SE_nr = vn.SE_nr JOIN TTransAngivelse.dbo.Virk_adr va ON vw.SE_nr = va.SE_nr where vw.SE_nr=").append("'").append(eoriNr).append("'");
        log.info("********** SQL Query - EORI ********---> "+strSql.toString());
        try {
            try {
				sqlConnection = DB.connectToReadOnlyPool();
				sqlStatement = sqlConnection.createStatement();
	            sqlResultSet = sqlStatement.executeQuery(strSql.toString());
	            
	            
	            while(sqlResultSet.next()) {
	            	virkWhitelist.setEoriNumber(sqlResultSet.getString(1));
	            	virkWhitelist.setFirma_nvn(sqlResultSet.getString(2));
	            	virkWhitelist.setFirma_nvn_kort(sqlResultSet.getString(3));
	            	virkWhitelist.setPostNumber(sqlResultSet.getString(4));
	            	virkWhitelist.setBy_nvn(sqlResultSet.getString(5));
	            	virkWhitelist.setAdresseNavn(sqlResultSet.getString(6));
	            	virkWhitelist.setVirk_nvn_start_dto(sqlResultSet.getTimestamp(7));
	            	virkWhitelist.setVej_nvn(sqlResultSet.getString(8));
	            }
	            
			} catch (NamingException e) {
				log.error("NamingException"+e.getMessage());
			} catch (SQLException e) {
				log.error("SQLException"+e.getMessage());
			}
            
            
            
        } finally {
        	DB.close(sqlResultSet);
        	DB.close(sqlStatement);
            EORIServiceDAO.disconnectFromPool(sqlConnection); 
        }
        
        return virkWhitelist;
    }
	
	
	/**
     * This method disconnects from pool
     *
     * @param aConnection Connection
     * @exception java.sql.SQLException
     */
    public static void disconnectFromPool(Connection aConnection) {
        if (aConnection != null) {
            try {
                aConnection.close();
            } catch (
                    SQLException e) {
                log.error( "Cannot Connection.isClosed() or cannot Connection.close()", e); // MS 20010713
            } catch (RuntimeException e) {
                log.error( "RuntimeException in DB.disconnectFromPool()", e);
            }
        } 
    }

}
