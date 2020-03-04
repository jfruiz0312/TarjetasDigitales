package com.mibanco.tarjetasDitales.services;

import java.util.List;

import javax.jws.WebService;

import com.mibanco.tarjetasDitales.model.Tarjeta;
import com.mibanco.tarjetasDitales.repository.TarjetaRepository;
import com.mibanco.tarjetasDitales.repository.TarjetaRepositoryImpl;

@WebService(endpointInterface = "com.mibanco.tarjetasDitales.services.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService{

	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImpl();
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		
		return tarjetaRepository.obtenerTodas();
	}

}
