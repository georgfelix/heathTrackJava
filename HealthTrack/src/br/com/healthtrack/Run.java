package br.com.healthtrack;

import java.io.Serializable;

/**
 * Classe da Corrida
 * @author Four Connection
 * @version 1.0
 */
//   extends significa q esta classe é filha de Activity
public class Run extends Activity implements Serializable{

	/**
	 *  Serial
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * Tipo de Corrida
	 */
	public String runType;
	/**
	 * Passos por minuto
	 */
	public int runStepsPerMinute;
	/**
	 * Velocidade Média Total
	 */
	public String runTotalAverageSpeed;
	/**
	 * Velocidade Média em Movimento
	 */
	public String runAverageTravelSpeed;
	/**
	 * Distancia percorrida
	 */
	public int runDistance;

	/**
	 * Corrida
	 * @param runType Tipo de Corrida
	 * @param runStepsPerMinute Passos por Minuto
	 * @param runTotalAverageSpeed Velocidade Média Total
	 * @param runAverageTravelSpeed Velocidade Média em Movimento
	 * @param runDistance Distancia percorrida
	 */
	
	//----------Métodos Construtores----------- 
	
	public Run(String aRunType, int aRunStepsPerMinute, String aRunTotalAverageSpeed, String aRunAverageTravelSpeed, String aRunDistance) 
	{
	
	this.runType = aRunType;
	this.runStepsPerMinute = aRunStepsPerMinute;
	this.runTotalAverageSpeed = aRunTotalAverageSpeed;
	this.runAverageTravelSpeed = aRunAverageTravelSpeed;
	this.runDistance = aRunDistance;

	}
	
	//----------Geters and Seters----------- 
	
	public String getRunType() {
		return runType;
	}

	public void setRunType(String runType) {
		this.runType = runType;
	}

	public int getRunStepsPerMinute() {
		return runStepsPerMinute;
	}

	public void setRunStepsPerMinute(int runStepsPerMinute) {
		this.runStepsPerMinute = runStepsPerMinute;
	}

	public String getRunTotalAverageSpeed() {
		return runTotalAverageSpeed;
	}

	public void setRunTotalAverageSpeed(String runTotalAverageSpeed) {
		this.runTotalAverageSpeed = runTotalAverageSpeed;
	}

	public String getRunAverageTravelSpeed() {
		return runAverageTravelSpeed;
	}

	public void setRunAverageTravelSpeed(String runAverageTravelSpeed) {
		this.runAverageTravelSpeed = runAverageTravelSpeed;
	}

	public int getRunDistance() {
		return runDistance;
	}

	public void setRunDistance(int runDistance) {
		this.runDistance = runDistance;
	}

	//----------Nao há Métodos (verbos)----------- 

	
}
//----------GTerminado em 12 set domingo----------- 
