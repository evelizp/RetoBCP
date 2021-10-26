package com.bcp.api.tipoCambio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bcp.api.tipoCambio.bean.MonedaRequest;
import com.bcp.api.tipoCambio.bean.MonedaResponse;
import com.bcp.api.tipoCambio.model.Moneda;
import com.bcp.api.tipoCambio.service.MonedaService;

import rx.Single;

@RestController
@RequestMapping("/api/moneda")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class MonedaController {
	
	@Autowired
	MonedaService monedaService;
	
	@GetMapping( produces = MediaType.APPLICATION_JSON_VALUE )
	public List<Moneda> getAllMoneda(){
		return monedaService.getAllMoneda();
	}
	
	@PostMapping
	public Single<MonedaResponse> calculateRx(@RequestBody MonedaRequest monedaIn){
		return monedaService.calculateInRx(monedaIn);
	}

}
