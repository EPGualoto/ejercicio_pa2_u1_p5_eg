package com.uce.edu.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	private static List <Propietario> p= new ArrayList<Propietario>();
	
	
	@Override
	public Propietario ingresar(String cedula) {
		// TODO Auto-generated method stub
		for (Propietario propietario : p) {
			if(propietario.getCedula().equals(cedula)) {
				Propietario p = new Propietario();
				p.setNombre(propietario.getNombre());
				p.setApellido(propietario.getApellido());
				p.setCedula(propietario.getCedula());
				p.setGenero(propietario.getGenero());
				return p;
			}
		}
		return null;
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		p.add(propietario);
	}

}
