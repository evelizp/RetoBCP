package com.bcp.api.tipoCambio.bean;

import java.io.Serializable;

import com.bcp.api.tipoCambio.model.Moneda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MonedaResponse implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private double monto;
	private double montoTotal;
	private Moneda monedaOrigen;
	private Moneda monedaDestino;
	
	public MonedaResponse(double monto, double montoTotal, Moneda monedaOrigen, Moneda monedaDestino) {
		super();
		this.monto = monto;
		this.montoTotal = montoTotal;
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public Moneda getMonedaOrigen() {
		return monedaOrigen;
	}

	public void setMonedaOrigen(Moneda monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}

	public Moneda getMonedaDestino() {
		return monedaDestino;
	}

	public void setMonedaDestino(Moneda monedaDestino) {
		this.monedaDestino = monedaDestino;
	}

}
