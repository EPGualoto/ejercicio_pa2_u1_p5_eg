package com.uce.edu.matriculacion.service;

import com.uce.edu.repository.modelo.Vehiculo;

public interface IVehiculoService {
	public Vehiculo ingresar(Vehiculo vehiculo); 
	
	public Vehiculo buscar(Vehiculo placa);
	
	public Vehiculo actualizar(Vehiculo vehiculo);
	
	public void eliminar(Vehiculo vehiculo);
	
}
