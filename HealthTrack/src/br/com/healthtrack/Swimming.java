package br.com.healthtrack;

import java.io.Serializable;

/**
 * Classe do Natacao
 * @author Four Connection
 * @version 1.0
 */
//   extends significa q esta classe é filha de Activity

public class Swimming extends Activity implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Estilo
	 */
	public String swimmingType;
	/**
	 * Total de bracadas
	 */
	public int strokesTotal;
	/**
	 * Bracadas por piscina
	 */
	public int strokesPool;
	/**
	 * Velocidade Média Total
	 */
	public String swTotalAverageSpeed;
	/**
	 * Velocidade Média em Movimento
	 */
	public String swAverageTravelSpeed;
	/**
	 * Distancia percorrida
	 */
	public int swclingDistance;

	/**
	 * Ciclismo
	 * @param swimmingType Estilo
	 * @param strokesTotal Total de bracadas
	 * @param strokesPool Bracadas por piscina
	 * @param swTotalAverageSpeed Velocidade Média Total
	 * @param swAverageTravelSpeed Velocidade Média em Movimento
	 * @param swclingDistance Distancia percorrida
	 */
	
	//----------Métodos Construtores----------- 
	
	public Swimming(String aSwimmingType, String aStrokesTotal, String aStrokesPool, String aSwTotalAverageSpeed, String aSwAverageTravelSpeed, String aSwclingDistance) 
	{
	
	this.swimmingType = aSwimmingType;
	this.strokesTotal = aStrokesTotal;
	this.strokesPool = aStrokesPool;
	this.swTotalAverageSpeed = aSwTotalAverageSpeed;
	this.swAverageTravelSpeed = aSwAverageTravelSpeed;
	this.swclingDistance = aSwclingDistance;

	}
	//----------Geters and Seters----------- 

	public String getSwimmingType() {
		return swimmingType;
	}

	public void setSwimmingType(String swimmingType) {
		this.swimmingType = swimmingType;
	}

	public int getStrokesTotal() {
		return strokesTotal;
	}

	public void setStrokesTotal(int strokesTotal) {
		this.strokesTotal = strokesTotal;
	}

	public int getStrokesPool() {
		return strokesPool;
	}

	public void setStrokesPool(int strokesPool) {
		this.strokesPool = strokesPool;
	}

	public String getSwTotalAverageSpeed() {
		return swTotalAverageSpeed;
	}

	public void setSwTotalAverageSpeed(String swTotalAverageSpeed) {
		this.swTotalAverageSpeed = swTotalAverageSpeed;
	}

	public String getSwAverageTravelSpeed() {
		return swAverageTravelSpeed;
	}

	public void setSwAverageTravelSpeed(String swAverageTravelSpeed) {
		this.swAverageTravelSpeed = swAverageTravelSpeed;
	}

	public int getSwclingDistance() {
		return swclingDistance;
	}

	public void setSwclingDistance(int swclingDistance) {
		this.swclingDistance = swclingDistance;
	}
	
}
//----------GTerminado em 12 set domingo----------- 
