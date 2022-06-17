package com.uce.edu.demo.centromedico.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.centromedico.modelo.CitaMedica;

public interface ICitaMedicaRepository {

	public void insertar(CitaMedica cm);

	public CitaMedica buscar(LocalDateTime fechaAgenda);

	public void actualizar(CitaMedica cm);

	public void eliminar(LocalDateTime fechaAgenda);

}
