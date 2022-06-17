package com.uce.edu.demo.centromedico.repository;

import java.util.Random;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.centromedico.modelo.Especialidad;

@Repository
public class EspecialidadRepositoryImpl implements IEspecialidadRepository {

	@Override
	public void insertar(Especialidad e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado la especialidad: " + e);
	}

	@Override
	public Especialidad buscar(String codigo) {
		// TODO Auto-generated method stub
		Especialidad especialidad = new Especialidad();
		especialidad.setCodigo(codigo);
		return especialidad;
	}

	@Override
	public void actualizar(Especialidad e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la especialidad: " + e);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la especialidad con codigo: " + codigo);
	}

}
