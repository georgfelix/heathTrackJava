package br.com.healthtrack;

import java.io.Serializable;

/**
 * Classe do Natacao
 * @author Four Connection
 * @version 1.0
 */
//   extends significa q esta classe é filha de Activity

public class Club extends User implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Código do Clube
	 */
	public int clubCode;
	/**
	 * Nome do Clube
	 */
	public String clubName;
	/**
	 * CNPJ do Clube
	 */
	public String clubCNPJ;
	/**
	 * email do Clube
	 */
	public String clubEmail;
	/**
	 * Telefone do Clube
	 */
	public String clubPhone;
	/**
	 * Membros do Clube
	 */
	public String clubMembres;

	/**
	 * Clube ou Associacao Esportiva
	 * @param clubCode Código do Clube
	 * @param clubName Nome do Clube
	 * @param clubCNPJ CNPJ do Clube
	 * @param clubEmail email do Clube
	 * @param clubPhone Telefone do Clube
	 * @param clubMembres Membros do Clube
	 */
	
	//----------Métodos Construtores----------- 
	
	public Club(int aClubCode, String aClubName, String aClubCNPJ, String aClubEmail, String aClubPhone, String aClubMembres) 
	{
	
	this.clubCode = aClubCode;
	this.clubName = aClubName;
	this.clubCNPJ = aClubCNPJ;
	this.clubEmail = aClubEmail;
	this.clubPhone = aClubPhone;
	this.clubMembres = aClubMembres;

	}
	//----------Geters and Seters----------- 

	public int getClubCode() {
		return clubCode;
	}

	public void setClubCode(int clubCode) {
		this.clubCode = clubCode;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getClubCNPJ() {
		return clubCNPJ;
	}

	public void setClubCNPJ(String clubCNPJ) {
		this.clubCNPJ = clubCNPJ;
	}

	public String getClubEmail() {
		return clubEmail;
	}

	public void setClubEmail(String clubEmail) {
		this.clubEmail = clubEmail;
	}

	public String getClubPhone() {
		return clubPhone;
	}

	public void setClubPhone(String clubPhone) {
		this.clubPhone = clubPhone;
	}

	public String getClubMembres() {
		return clubMembres;
	}

	public void setClubMembres(String clubMembres) {
		this.clubMembres = clubMembres;
	}


	
}
//----------GTerminado em 12 set domingo----------- 

