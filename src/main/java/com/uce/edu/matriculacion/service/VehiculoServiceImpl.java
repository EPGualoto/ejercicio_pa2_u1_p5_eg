package com.uce.edu.matriculacion.service;

import org.springframework.stereotype.Service;

import com.uce.edu.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {
	
	@Override
	public Vehiculo ingresar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return this.ingresar(vehiculo) ;
	}

	@Override
	public Vehiculo buscar(Vehiculo placa) {
		// TODO Auto-generated method stub
		return this.buscar(placa);
	}

	@Override
	public Vehiculo actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return this.actualizar(vehiculo);
	}

	@Override
	public void eliminar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.eliminar(vehiculo);
		
	}

}
