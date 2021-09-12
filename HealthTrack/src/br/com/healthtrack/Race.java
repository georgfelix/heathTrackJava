package br.com.healthtrack;

import java.io.Serializable;

/**
 * Classe do Natacao
 * @author Four Connection
 * @version 1.0
 */
//   extends significa q esta classe é filha de Activity

public class Race extends Event implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Esporte da Prova
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
	 * Preco da Inscricao
	 */
	public double racePrice;
	/**
	 * Hora da Prova
	 */
	public String raceHour;


	/**
	 * Prova
	 * @param raceSport Esporte da Prova
	 * @param raceName Nome da Prova
	 * @param raceDistance Distancia
	 * @param racePrice Preco da Inscricao
	 * @param raceHour Hora da Prova
	 */
	
	//----------Métodos Construtores----------- 
	
	public Club(String aRaceSport, String aRaceName, String aRaceDistance, double aRacePrice, String aRaceHour) 
	{
	
	this.raceSport = aRaceSport;
	this.raceName = aRaceName;
	this.raceDistance = aRaceDistance;
	this.racePrice = aRacePrice;
	this.raceHour = aRaceHour;


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


	public double getRacePrice() {
		return racePrice;
	}


	public void setRacePrice(double racePrice) {
		this.racePrice = racePrice;
	}


	public String getRaceHour() {
		return raceHour;
	}


	public void setRaceHour(String raceHour) {
		this.raceHour = raceHour;
	}





}

//----------GTerminado em 12 set domingo----------- 
