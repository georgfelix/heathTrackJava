package br.com.healthtrack;

import java.io.Serializable;

/**
 * Classe do Natacao
 * @author Four Connection
 * @version 1.0
 */
//   extends significa q esta classe é filha de Activity

public class Event implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Código do Evento
	 */
	public int eventCode;
	/**
	 * Nome do Evento
	 */
	public String eventName;
	/**
	 * Descricao do Evento
	 */
	public String eventDescription;
	/**
	 * Data do Evento
	 */
	public String eventDate;
	/**
	 * Local do Evento
	 */
	public String eventLocal;


	/**
	 * Evento Esportivo
	 * @param eventCode Código do Evento
	 * @param eventName Nome do Evento
	 * @param eventDescription Descricao do Evento
	 * @param eventDate Data do Evento
	 * @param eventLocal Local do Evento
	 */
	
	//----------Métodos Construtores----------- 
	
	public Club(int aEventCode, String aEventName, String aEventDescription, String aEventDate, String aEventLocal) 
	{
	
	this.eventCode = aEventCode;
	this.eventName = aEventName;
	this.eventDescription = aEventDescription;
	this.eventDate = aEventDate;
	this.eventLocal = aEventLocal;


	}
	//----------Geters and Seters----------- 

	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public String getEventDescription() {
		return eventDescription;
	}


	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}


	public String getEventDate() {
		return eventDate;
	}


	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}


	public String getEventLocal() {
		return eventLocal;
	}


	public void setEventLocal(String eventLocal) {
		this.eventLocal = eventLocal;
	}


}

//----------GTerminado em 12 set domingo----------- 

