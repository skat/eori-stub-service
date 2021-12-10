package dk.skat.eori.dto;

import java.util.Date;

public class EORIVirkWhitelist {
	
	private String eoriNumber="";
	
	private String Firma_nvn;
	
	private String Firma_nvn_kort;
	
	private String postNumber;

	private String by_nvn;
	
	private String vej_nvn;

	private String adresseNavn;
	
	private Date  virk_nvn_start_dto;

	
	public String getVej_nvn() {
		return vej_nvn;
	}

	public void setVej_nvn(String vej_nvn) {
		this.vej_nvn = vej_nvn;
	}

	
	public Date getVirk_nvn_start_dto() {
		return virk_nvn_start_dto;
	}

	public void setVirk_nvn_start_dto(Date virk_nvn_start_dto) {
		this.virk_nvn_start_dto = virk_nvn_start_dto;
	}

	public String getAdresseNavn() {
		return adresseNavn;
	}

	public void setAdresseNavn(String adresseNavn) {
		this.adresseNavn = adresseNavn;
	}

	public String getBy_nvn() {
		return by_nvn;
	}

	public void setBy_nvn(String by_nvn) {
		this.by_nvn = by_nvn;
	}

	public String getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(String postNumber) {
		this.postNumber = postNumber;
	}

	public String getFirma_nvn() {
		return Firma_nvn;
	}

	public void setFirma_nvn(String firma_nvn) {
		Firma_nvn = firma_nvn;
	}

	public String getFirma_nvn_kort() {
		return Firma_nvn_kort;
	}

	public void setFirma_nvn_kort(String firma_nvn_kort) {
		Firma_nvn_kort = firma_nvn_kort;
	}

	
	public void setEoriNumber(String eoriNumber) {
		this.eoriNumber = eoriNumber;
	}
	
    public String getEoriNumber() {
		return eoriNumber;
	}

}
