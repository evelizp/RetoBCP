package com.bcp.api.tipoCambio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcp.api.tipoCambio.model.Moneda;

@Repository
public interface MonedaRepository extends JpaRepository<Moneda, Long> {
	
	
}
