package com.mibanco.tarjetasDitales.repository;

import java.util.ArrayList;
import java.util.List;

import com.mibanco.tarjetasDitales.model.Tarjeta;

public class TarjetaRepositoryImpl implements TarjetaRepository{
	
	private static List<Tarjeta>tarjetasDigitales= new ArrayList<>();

	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		System.out.println("Crear Tarjeta::::");
		tarjetasDigitales.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		System.out.println(":::Obtener toas las tarjetas");
		return tarjetasDigitales;
	}

}
