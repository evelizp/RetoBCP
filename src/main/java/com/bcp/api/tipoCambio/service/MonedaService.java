package com.bcp.api.tipoCambio.service;

import java.util.List;

import com.bcp.api.tipoCambio.bean.MonedaRequest;
import com.bcp.api.tipoCambio.bean.MonedaResponse;
import com.bcp.api.tipoCambio.model.Moneda;

import rx.Single;

public interface MonedaService {
	
	List<Moneda> getAllMoneda();
	
	Single<MonedaResponse> calculateInRx(MonedaRequest monedaIn);

}
