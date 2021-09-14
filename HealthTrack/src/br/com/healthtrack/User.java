package br.com.healthtrack;

import java.io.Serializable;

/**
 * Classe de cadastro do perfil do usuario
 * @author Four Connection
 * @version 1.0
 */
//extends significa q esta classe é filha de Credential

public class User extends Credential implements Serializable{

	//----------Propriedades (substantivos, adjetivos)----------- 
	
	/**
	 * Versao Serial
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Código do usuário
	 */
	private int userCode;          // Para trocar o nome em TUDO: botao direito no nome, Refactor, Rename.
	/**
	 * Nome completo do usuário
	 */	
	private String userName;
	/**
	 * Apelido do usuário
	 */
	private String userNickname;
	/**
	 * email do usuário
	 */
	private String userEmail;
	/**
	 * senha do usuário
	 */	
	private String userPassword;
	/**
	 * email de recuperacao do usuário
	 */
	private String userRecoveryEmail;
	/**
	 * celular do usuário
	 */
	private int userCellPhone;             //int ou Integer é a mesma coisa
	/**
	 * peso do usuário
	 */
	private String userWeight;
	/**
	 * altura do usuário
	 */
	private String userHeight;
	/**
	 * Foto do usuário
	 */
	private String userPhoto;
	/**
	 * Foto de fundo do usuário
	 */
	private String userBackgroundPhoto;
	
	/**
	 * Cadatro do Usuário
	 * @param userName Nome completo
	 * @param userNickname Apelido
	 * @param userEmail email
	 * @param userPassword senha
	 * @param userRecoveryEmail email secundario
	 * @param userCellPhone Celular
	 * @param userWeight Peso
	 * @param userHeight Altura
	 * @param userPhoto Foto do usuário
	 * @param userBackgroundPhoto Foto de Fundo
	 */
	
	//----------Métodos Construtores----------- 
	
	public User(int aUserCode, String aUserName, String aUserNickname, String aUserEmail, String aUserPassword, String aUserRecoveryEmail, int aUserCellPhone, String aUserWeight, String aUserHeight, String aUserPhoto, String aUserBackgroundPhoto) {
		
		this.userCode = aUserCode;
		this.userName = aUserName;
		this.userNickname = aUserNickname;
		this.userEmail = aUserEmail;
		this.userPassword = aUserPassword;
		this.userRecoveryEmail = aUserRecoveryEmail;
		this.userCellPhone = aUserCellPhone;
		this.userWeight = aUserWeight;
		this.userHeight = aUserHeight;
		this.userPhoto = aUserPhoto;
		this.userBackgroundPhoto = aUserBackgroundPhoto;
		
	}
	

	//----------Métodos (verbos)----------- 
	
	/**
	 * Insere os dados do Usuario
	 */
	public void enterUserData(int userCode, String userName, String userNickname, String userEmail, String userPassword, String userRecoveryEmail, String userCellPhone, String userWeight, String userHeight, String aUserPhoto, String aUserBackgroundPhoto) {
		System.out.println(String.format("O usuario %s se cadastrou com o apelido %s usando o celular %s", userName, userNickname, userCellPhone));
	}
	
	//----------Geters and Seters----------- 
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

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

	public String getUserRecoveryEmail() {
		return userRecoveryEmail;
	}

	public void setUserRecoveryEmail(String userRecoveryEmail) {
		this.userRecoveryEmail = userRecoveryEmail;
	}

	public int getUserCellPhone() {
		return userCellPhone;
	}

	public void setUserCellPhone(int userCellPhone) {
		this.userCellPhone = userCellPhone;
	}

	public String getUserWeight() {
		return userWeight;
	}

	public void setUserWeight(String userWeight) {
		this.userWeight = userWeight;
	}

	public String getUserHeight() {
		return userHeight;
	}

	public void setUserHeight(String userHeight) {
		this.userHeight = userHeight;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public String getUserBackgroundPhoto() {
		return userBackgroundPhoto;
	}

	public void setUserBackgroundPhoto(String userBackgroundPhoto) {
		this.userBackgroundPhoto = userBackgroundPhoto;
	}
	//----------Fim do Geters and Seters----------- 
	
	/**
	 * Imprime os dados do Usuario
	 */
	
	public void consultUser(String userCode, String userName, String userNickname, String userEmail, String userPassword, String userRecoveryEmail, String userCellPhone, String userWeight, String userHeight, String aUserPhoto, String aUserBackgroundPhoto) {

		
		System.out.println("-----------------Usuário------------------");
			if(this.userNickname != null){
		
		System.out.println(String.format("Os dados do usuário são: Nome: %s, Apelido: %s, e-mail: %s, Celular: %s, Peso: %s, Altura: %s", userName, userNickname, userEmail, userCellPhone, userWeight, userHeight));
		
			}else {
				System.out.println("Nao tem um cadastro de Pessoa");
				}
			
	}
	public void deleteUserAccount() {
		
	}
	void changeUserAccount() {
		
	}
	
	
}


//----------GTerminado em 12 set domingo----------- 