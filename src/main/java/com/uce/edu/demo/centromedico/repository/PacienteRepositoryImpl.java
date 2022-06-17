package com.uce.edu.demo.centromedico.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.centromedico.modelo.Paciente;

@Repository
public class PacienteRepositoryImpl implements IPacienteRepository {

	@Override
	public void insertar(Paciente p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el paciente: " + p);
	}

	@Override
	public Paciente buscar(String nombre) {
		// TODO Auto-generated method stub
		Paciente p = new Paciente();
		p.setNombre(nombre);
		return p;
	}

	@Override
	public void actualizar(Paciente p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el paciente: " + p);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el paciente: " + nombre);
	}

}
