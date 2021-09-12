package br.com.healthtrack;

import java.io.Serializable;

/**
 * Classe do Natacao
 * @author Four Connection
 * @version 1.0
 */
//   extends significa q esta classe é filha de Activity

public class Medal  implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Esporte da Medalha
	 */
	public String raceSport;
	/**
	 * Nome da Prova
	 */
	public String raceName;
	/**
	 * Distancia
	 */
	public String raceDistance;
	/**
	 * Colocacao Geral
	 */
	public String generalPlacement;
	/**
	 * Colocacao na Categoria
	 */
	public String categoryPlacement;


	/**
	 * Medalha
	 * @param raceSport Esporte da Prova
	 * @param raceName Nome da Prova
	 * @param raceDistance Distancia
	 * @param generalPlacement Colocacao Geral
	 * @param categoryPlacement Colocacao na Categoria
	 */
	
	//----------Métodos Construtores----------- 
	
	public Medal(String aRaceSport, String aRaceName, String aRaceDistance, double aGeneralPlacement, String aCategoryPlacement) 
	{
	
	this.raceSport = aRaceSport;
	this.raceName = aRaceName;
	this.raceDistance = aRaceDistance;
	this.generalPlacement = aGeneralPlacement;
	this.categoryPlacement = aCategoryPlacement;


	}
	//----------Geters and Seters----------- 

	public String getRaceSport() {
		return raceSport;
	}


	public void setRaceSport(String raceSport) {
		this.raceSport = raceSport;
	}


	public String getRaceName() {
		return raceName;
	}


	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}


	public String getRaceDistance() {
		return raceDistance;
	}


	public void setRaceDistance(String raceDistance) {
		this.raceDistance = raceDistance;
	}


	public String getGeneralPlacement() {
		return generalPlacement;
	}


	public void setGeneralPlacement(String generalPlacement) {
		this.generalPlacement = generalPlacement;
	}


	public String getCategoryPlacement() {
		return categoryPlacement;
	}


	public void setCategoryPlacement(String categoryPlacement) {
		this.categoryPlacement = categoryPlacement;
	}



}

//----------GTerminado em 12 set domingo----------- 