package com.bcp.api.tipoCambio.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.api.tipoCambio.bean.MonedaRequest;
import com.bcp.api.tipoCambio.bean.MonedaResponse;
import com.bcp.api.tipoCambio.model.Moneda;
import com.bcp.api.tipoCambio.repository.MonedaRepository;

import rx.Single;


@Service
public class MonedaServiceImpl implements MonedaService {
	
	@Autowired
	private MonedaRepository monedaRepository;

	@Override
	public List<Moneda> getAllMoneda() {
		return monedaRepository.findAll();
	}

	@Override
	public Single<MonedaResponse> calculateInRx(MonedaRequest monedaIn) {
		
		return Single.create(singleSubscriber -> {
			Optional<Moneda> monedaOrigen = monedaRepository.findById(monedaIn.getMonedaOrigen());
			Optional<Moneda> monedaDestino = monedaRepository.findById(monedaIn.getMonedaDestino());
			if ( monedaOrigen.isPresent() || monedaOrigen.get() == null || monedaDestino.isPresent() || monedaDestino.get()==null)
			singleSubscriber.onError(new EntityNotFoundException());
			
			double monto = Math.round((monedaIn.getMonto()* monedaDestino.get().getValor()) * 100.0) / 100.0;
			singleSubscriber.onSuccess(new MonedaResponse(monedaIn.getMonto(), monto, monedaOrigen.get(), monedaDestino.get()));
		});
	}

}
