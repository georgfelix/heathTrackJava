package br.com.healthtrack;

import java.io.Serializable;

/**
 * Classe da Atividade
 * @author Four Connection
 * @version 1.0
 */

public class Activity implements Serializable
{

	/**
	 * Versao Serial
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * Código da Atividade
	 */
	private int activityCode;
	/**
	 * Nome da Atividade
	 */
	public String activityName;
	/**
	 * Data da Atividade
	 */
	public String activityDate;
	/**
	 * Hora de Início da Atividade
	 */
	public String activityHour;
	/**
	 * Esporte da Atividade
	 */
	public String activitySport;
	/**
	 * Tempo Total da Atividade
	 */
	public String activityTotalTime;
	/**
	 * Tempo Total em Movimento da Atividade
	 */
	public String activityMovingTime;
	/**
	 * Tempo Total Parado da Atividade
	 */
	public String activityDowntime;
	/**
	 * Média de Batimentos Cardíacos da Atividade
	 */
	public String activityAverageHeartbeat;
	/**
	 * Máximo de Batimento Cardíaco da Atividade
	 */
	public String activityMaximumHeartbeat;
	/**
	 * Mínimo de Batimento Cardíaco da Atividade
	 */
	public String activityMinimumHeartbeat;
	/**
	 * Registro do percurso ou Track Log
	 */ 
	public String activityTrackLog;
	
	/**
	 * Atividade Física
	 * @param activityCode Código da Atividade
	 * @param activityName Nome da Atividade
	 * @param activityDate Data da Atividade
	 * @param activityHour Hora de Início
	 * @param activitySport Esporte
	 * @param activityTotalTime Tempo Total
	 * @param activityMovingTime Tempo em Movimento
	 * @param activityDowntime Tempo Parado
	 * @param activityAverageHeartbeat Média de Batimentos Cardíacos
	 * @param activityMaximumHeartbeat Batimento Cardíaco Máximo
	 * @param activityMinimumHeartbeat Batimento Cardíaco Mínimo
	 * @param activityTrackLog Registro do percurso
	 */
	
	//----------Métodos Construtores----------- 
	
	public Activity(int aActivityCode, String aActivityName, String aActivityDate, String aActivityHour, String aActivitySport, String aActivityTotalTime, String aActivityMovingTime, String aActivityDowntime, String aActivityAverageHeartbeat, String aActivityMaximumHeartbeat, String aActivityMinimumHeartbeat, String aActivityTrackLog) 
	{
	
	this.activityCode = aActivityCode;
	this.activityName = aActivityName;
	this.activityDate = aActivityDate;
	this.activityHour = aActivityHour;
	this.activitySport = aActivitySport;
	this.activityTotalTime = aActivityTotalTime;
	this.activityMovingTime = aActivityMovingTime;
	this.activityDowntime = aActivityDowntime;
	this.activityAverageHeartbeat = aActivityAverageHeartbeat;
	this.activityMaximumHeartbeat = aActivityMaximumHeartbeat;
	this.activityMinimumHeartbeat = aActivityMinimumHeartbeat;
	this.activityTrackLog = aActivityTrackLog;
	}

	//----------Métodos (verbos)----------- 
	
	/**
	 * Insere uma Atividade Manual
	 */
	public void activityInsert(int activityCode, String activityName, String activityDate, String activityHour, String activitySport, String activityTotalTime, String activityMovingTime, String activityDowntime, String activityAverageHeartbeat, String activityMaximumHeartbeat, String activityMinimumHeartbeat, String activityTrackLog) {
		System.out.println(String.format("A Atividade %s foi incluída em %s com horário de início as %s", activityName, activityDate, activityHour));
	}
	
	/**
	 * Imprime os dados de uma atividade
	 */
	public void activityConsult() {
		
		System.out.println("-----------------Atividade------------------");
		if(this.activityName != null) {
			System.out.println(this.activityName);
			System.out.println(this.activityDate);
			System.out.println(this.activityHour);
			System.out.println(this.activitySport);
			System.out.println(this.activityTotalTime);
			System.out.println(this.activityMovingTime);
			System.out.println(this.activityDowntime);
			System.out.println(this.activityAverageHeartbeat);
			System.out.println(this.activityMaximumHeartbeat);
			System.out.println(this.activityMinimumHeartbeat);
			System.out.println(this.activityTrackLog);
		}else {
			System.out.println("Atividade n�o cadastrada");
		}
	}
	
	
	//----------Geters and Seters----------- 

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(String activityDate) {
		this.activityDate = activityDate;
	}

	public String getActivityHour() {
		return activityHour;
	}

	public void setActivityHour(String activityHour) {
		this.activityHour = activityHour;
	}

	public String getActivitySport() {
		return activitySport;
	}

	public void setActivitySport(String activitySport) {
		this.activitySport = activitySport;
	}

	public String getActivityTotalTime() {
		return activityTotalTime;
	}

	public void setActivityTotalTime(String activityTotalTime) {
		this.activityTotalTime = activityTotalTime;
	}

	public String getActivityMovingTime() {
		return activityMovingTime;
	}

	public void setActivityMovingTime(String activityMovingTime) {
		this.activityMovingTime = activityMovingTime;
	}

	public String getActivityDowntime() {
		return activityDowntime;
	}

	public void setActivityDowntime(String activityDowntime) {
		this.activityDowntime = activityDowntime;
	}

	public String getActivityAverageHeartbeat() {
		return activityAverageHeartbeat;
	}

	public void setActivityAverageHeartbeat(String activityAverageHeartbeat) {
		this.activityAverageHeartbeat = activityAverageHeartbeat;
	}

	public String getActivityMaximumHeartbeat() {
		return activityMaximumHeartbeat;
	}

	public void setActivityMaximumHeartbeat(String activityMaximumHeartbeat) {
		this.activityMaximumHeartbeat = activityMaximumHeartbeat;
	}

	public String getActivityMinimumHeartbeat() {
		return activityMinimumHeartbeat;
	}

	public void setActivityMinimumHeartbeat(String activityMinimumHeartbeat) {
		this.activityMinimumHeartbeat = activityMinimumHeartbeat;
	}

	public String getActivityTrackLog() {
		return activityTrackLog;
	}

	public void setActivityTrackLog(String activityTrackLog) {
		this.activityTrackLog = activityTrackLog;
	}
	
}
//----------GTerminado em 12 set domingo----------- 
