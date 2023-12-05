package com.uce.edu.matriculacion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.uce.edu.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService{
	private static List <Propietario> p= new ArrayList<Propietario>();
	
	@Override
	public void ingresar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.ingresar(propietario);
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.actualizar(propietario);
	}

}
