package com.uce.edu.demo.centromedico.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.centromedico.modelo.CitaMedica;

@Repository
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository {

	@Override
	public void insertar(CitaMedica cm) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado la cita medica: " + cm);
	}

	@Override
	public CitaMedica buscar(LocalDateTime fechaAgenda) {
		// TODO Auto-generated method stub
		CitaMedica cm = new CitaMedica();
		cm.setFechaAgenda(LocalDateTime.of(2022, 5, 17, 9, 15));
		return cm;
	}

	@Override
	public void actualizar(CitaMedica cm) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la cita medica: " + cm);
	}

	@Override
	public void eliminar(LocalDateTime fechaAgenda) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la cita medica con fecha: " + fechaAgenda);
	}

}
