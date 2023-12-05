package com.uce.edu.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.MatricularVehiculo;
import com.uce.edu.repository.modelo.Propietario;

@Repository
public class MatriculaRepository implements IMatricularRepository {
	private List <MatricularVehiculo> m= new ArrayList<MatricularVehiculo>();

	@Override
	public MatricularVehiculo ingresar(Propietario propietario, String placa) {
		// TODO Auto-generated method stub
		//m.add(propietario, placa);
	}

}
