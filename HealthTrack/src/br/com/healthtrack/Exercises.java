package br.com.healthtrack;

import java.io.Serializable;

/**
 * Classe dos Exercicios
 * @author Four Connection
 * @version 1.0
 */
//   extends significa q esta classe é filha de Activity

public class Exercises implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Esporte
	 */
	public String exSport;
	/**
	 * Nome do Exrecicio
	 */
	public String exName;
	/**
	 * Tempo do exercicio
	 */
	public String exTime;
	/**
	 * Distancia do exercicio
	 */
	public String exDistance;
	/**
	 * Tempo de descanso
	 */
	public String exRestTime;
	/**
	 * Distancia descansando
	 */
	public int exRestDistance;
	/**
	 * Descricao do exercicio
	 */
	public int exDescription;

	/**
	 * Ciclismo
	 * @param exSport Estilo
	 * @param exName Total de bracadas
	 * @param exTime Bracadas por piscina
	 * @param exDistance Velocidade Média Total
	 * @param exRestTime Velocidade Média em Movimento
	 * @param exRestDistance Distancia percorrida
	 * @param exDescription Distancia percorrida
	 */
	
	//----------Métodos Construtores----------- 
	
	public Swimming(String exSport, String exName, String exTime, String exDistance, String exRestTime, String exRestDistance, String exDescription) 
	{
	
	this.exSport = aExSport;
	this.exName = aExName;
	this.exTime = aExTime;
	this.exDistance = aExDistance;
	this.exRestTime = aExRestTime;
	this.exRestDistance = aExRestDistance;
	this.exDescription = aExDescription;

	}
	//----------Geters and Seters----------- 
	
	public String getExSport() {
		return exSport;
	}

	public void setExSport(String exSport) {
		this.exSport = exSport;
	}

	public String getExName() {
		return exName;
	}

	public void setExName(String exName) {
		this.exName = exName;
	}

	public String getExTime() {
		return exTime;
	}

	public void setExTime(String exTime) {
		this.exTime = exTime;
	}

	public String getExDistance() {
		return exDistance;
	}

	public void setExDistance(String exDistance) {
		this.exDistance = exDistance;
	}

	public String getExRestTime() {
		return exRestTime;
	}

	public void setExRestTime(String exRestTime) {
		this.exRestTime = exRestTime;
	}

	public int getExRestDistance() {
		return exRestDistance;
	}

	public void setExRestDistance(int exRestDistance) {
		this.exRestDistance = exRestDistance;
	}

	public int getExDescription() {
		return exDescription;
	}

	public void setExDescription(int exDescription) {
		this.exDescription = exDescription;
	}


	
	
}
//----------GTerminado em 12 set domingo----------- 