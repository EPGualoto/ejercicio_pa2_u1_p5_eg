package com.uce.edu.matriculacion.repository;

import com.uce.edu.repository.modelo.Vehiculo;

public interface IVehiculoRepository {
	public Vehiculo ingresar(Vehiculo vehiculo); 
	
	public void buscar(String placa);
	
	public void actualizar(Vehiculo vehiculo);
	
	public void eliminar(Vehiculo vehiculo);

}
