package com.uce.edu.matriculacion.repository;

import com.uce.edu.repository.modelo.Propietario;

public interface IPropietarioRepository {
	public Propietario ingresar(String cedula); 
	
	public void actualizar(Propietario propietario);
	
}
