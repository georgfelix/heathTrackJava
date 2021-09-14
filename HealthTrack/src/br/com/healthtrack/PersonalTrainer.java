package br.com.healthtrack;

import java.io.Serializable;

/**
 * Classe de cadastro do Personal Trainer
 * @author Four Connection
 * @version 1.0
 */
//extends significa q esta classe é filha de Credential

public class PersonalTrainer extends User implements Serializable{

	public PersonalTrainer(int aUserCode, String aUserName, String aUserNickname, String aUserEmail,
			String aUserPassword, String aUserRecoveryEmail, int aUserCellPhone, String aUserWeight, String aUserHeight,
			String aUserPhoto, String aUserBackgroundPhoto) {
		super(aUserCode, aUserName, aUserNickname, aUserEmail, aUserPassword, aUserRecoveryEmail, aUserCellPhone, aUserWeight,
				aUserHeight, aUserPhoto, aUserBackgroundPhoto);
		// TODO Auto-generated constructor stub
	}


	//----------Propriedades (substantivos, adjetivos)----------- 
	
	/**
	 * Versao Serial
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Numero do Conselho Rgional de Educacao Fisica
	 */
	public String cref;
	
	/**
	 * Cadatro da Credencial
	 * @param cref Numero do Conselho Rgional de Educacao Fisica
	 */
	
	//----------Métodos Construtores----------- 
	
	public User(String cref) {
		

		this.cref = aCref;

	
		
	}
	

	//----------Métodos (verbos)----------- 
	
	/**
	 * Insere os dados do Usuario
	 */
	public void enterUserData(String cref) {
		System.out.println(String.format("O usuario se cadastrou com o CREF %s ", cref));
	}

	//----------Geters and Seters----------- 
	public String getCref() {
		return cref;
	}


	public void setCref(String cref) {
		this.cref = cref;
	}
	
}
	
