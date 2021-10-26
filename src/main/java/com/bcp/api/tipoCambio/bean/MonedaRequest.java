package com.bcp.api.tipoCambio.bean;

import lombok.Data;

@Data
public class MonedaRequest {
	
	private double monto;
	private long monedaOrigen;
	private long monedaDestino;
	
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public long getMonedaOrigen() {
		return monedaOrigen;
	}
	public void setMonedaOrigen(long monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}
	public long getMonedaDestino() {
		return monedaDestino;
	}
	public void setMonedaDestino(long monedaDestino) {
		this.monedaDestino = monedaDestino;
	}
	
	
	

}
