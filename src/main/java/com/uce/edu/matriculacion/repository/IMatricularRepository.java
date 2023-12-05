package com.uce.edu.matriculacion.repository;

import com.uce.edu.repository.modelo.MatricularVehiculo;
import com.uce.edu.repository.modelo.Propietario;

public interface IMatricularRepository {
	public MatricularVehiculo ingresar (Propietario propietario, String placa); 
	
}
