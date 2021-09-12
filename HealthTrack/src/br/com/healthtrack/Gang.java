package br.com.healthtrack;

import java.io.Serializable;

/**
 * Classe da Turma
 * @author Four Connection
 * @version 1.0
 */
//   extends significa q esta classe é filha de Activity

public class Gang implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Nome da Turma
	 */
	public String gangName;
	/**
	 * Membros da Turma
	 */
	public String gangMembers;
	

	/**
	 * Turma
	 * @param gangName Nome da Turma
	 * @param gangMembers Membros da Turma
	 */
	
	//----------Métodos Construtores----------- 
	
	public Gang(String aGangName, String aGangMembers) 
	{
	
	this.gangName = aGangName;
	this.gangMembers = aGangMembers;


	}
	//----------Geters and Seters----------- 


	public String getGangName() {
		return gangName;
	}


	public void setGangName(String gangName) {
		this.gangName = gangName;
	}


	public String getGangMembers() {
		return gangMembers;
	}


	public void setGangMembers(String gangMembers) {
		this.gangMembers = gangMembers;
	}
	
	
	

}
//----------GTerminado em 12 set domingo----------- 

