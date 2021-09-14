package br.com.healthtrack;

import java.io.Serializable;

/**
 * Classe de cadastro do perfil do usuario
 * @author Four Connection
 * @version 1.0
 */
//extends significa q esta classe é filha de Credential

public class Credential implements Serializable{

	//----------Propriedades (substantivos, adjetivos)----------- 
	
	/**
	 * Versao Serial
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * email do usuário
	 */
	private String userEmail;
	/**
	 * senha do usuário
	 */	
	private String userPassword;
	/**
	 * celular do usuário
	 */
	private int userCellPhone;             
	
	
	/**
	 * Cadatro da Credencial
	 * @param userEmail email
	 * @param userPassword senha 
	 * @param userCellPhone Celular
	 */
	
	//----------Métodos Construtores----------- 
	
	public User(String aUserEmail, String aUserPassword, int aUserCellPhone) {
		

		this.userEmail = aUserEmail;
		this.userPassword = aUserPassword;
		this.userCellPhone = aUserCellPhone;
	
		
	}
	

	//----------Métodos (verbos)----------- 
	
	/**
	 * Insere os dados do Usuario
	 */

	//----------Geters and Seters----------- 
	


	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserCellPhone() {
		return userCellPhone;
	}

	public void setUserCellPhone(int userCellPhone) {
		this.userCellPhone = userCellPhone;
	}

	
	//----------Fim do Geters and Seters----------- 
	
	/**
	 * Imprime os dados do Usuario
	 */
	
	
	
	
}


