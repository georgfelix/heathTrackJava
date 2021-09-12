package br.com.healthtrack;

import java.io.Serializable;

/**
 * Classe do Ciclismo
 * @author Four Connection
 * @version 1.0
 */
//   extends significa q esta classe é filha de Activity

public class Cycling extends Activity implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Tipo de Ciclismo
	 */
	public String cyclingType;
	/**
	 * Velocidade Média Total
	 */
	public String cyclingTotalAverageSpeed;
	/**
	 * Velocidade Média em Movimento
	 */
	public String cyclingAverageTravelSpeed;
	/**
	 * Distancia percorrida
	 */
	public int cyclingDistance;

	/**
	 * Ciclismo
	 * @param cyclingType Tipo de Ciclismo
	 * @param cyclingTotalAverageSpeed Velocidade Média Total
	 * @param cyclingAverageTravelSpeed Velocidade Média em Movimento
	 * @param cyclingDistance Distancia percorrida
	 */
	
	//----------Métodos Construtores----------- 
	
	public Cycling(String aCyclingType, String aCyclingTotalAverageSpeed, String aCyclingAverageTravelSpeed, int aCyclingDistance) 
	{
	
	this.cyclingType = aCyclingType;
	this.cyclingTotalAverageSpeed = aCyclingTotalAverageSpeed;
	this.cyclingAverageTravelSpeed = aCyclingAverageTravelSpeed;
	this.cyclingDistance = aCyclingDistance;

	}
	//----------Geters and Seters----------- 
	
	public String getCyclingType() {
		return cyclingType;
	}

	public void setCyclingType(String cyclingType) {
		this.cyclingType = cyclingType;
	}

	public String getCyclingTotalAverageSpeed() {
		return cyclingTotalAverageSpeed;
	}

	public void setCyclingTotalAverageSpeed(String cyclingTotalAverageSpeed) {
		this.cyclingTotalAverageSpeed = cyclingTotalAverageSpeed;
	}

	public String getCyclingAverageTravelSpeed() {
		return cyclingAverageTravelSpeed;
	}

	public void setCyclingAverageTravelSpeed(String cyclingAverageTravelSpeed) {
		this.cyclingAverageTravelSpeed = cyclingAverageTravelSpeed;
	}

	public int getCyclingDistance() {
		return cyclingDistance;
	}

	public void setCyclingDistance(int cyclingDistance) {
		this.cyclingDistance = cyclingDistance;
	}
	
	

}
//----------GTerminado em 12 set domingo----------- 
