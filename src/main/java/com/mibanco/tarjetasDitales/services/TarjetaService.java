package com.mibanco.tarjetasDitales.services;

import java.util.List;

import javax.jws.WebService;

import com.mibanco.tarjetasDitales.model.Tarjeta;

@WebService
public interface TarjetaService {

	/**
	 * Metodo para crear una tarjeta nueva
	 * @param tarjeta
	 * @return tarjeta creada
	 */
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	/** 
	 * Metodo para obtener todas las tarjetas
	 * @return
	 */
	
	List<Tarjeta>obtenerTodas();

}
