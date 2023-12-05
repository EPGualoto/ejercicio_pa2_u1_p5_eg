package com.uce.edu.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Propietario;
import com.uce.edu.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{
	private static List <Vehiculo> v= new ArrayList<Vehiculo>();
	
	
	@Override
	public void buscar(String placa) {
		// TODO Auto-generated method stub
		for (Vehiculo vehiculo : v) {
			if(vehiculo.getPlaca().equals(placa)) {
				Vehiculo v = new Vehiculo();
				v.setMarca(vehiculo.getMarca());
				v.setPlaca(vehiculo.getPlaca());
				v.setPrecio(vehiculo.);
				return p;
			}
		}
		return null;
	}
		this.buscar(placa);
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.actualizar(vehiculo);
		
	}

	@Override
	public void eliminar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.eliminar(vehiculo);
		
	}

	@Override
	public Vehiculo ingresar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return this.ingresar(vehiculo);
	}

}
