package com.uce.edu.demo.centromedico.service;

import java.time.LocalDateTime;

import com.uce.edu.demo.centromedico.modelo.CitaMedica;

public interface ICitaMedicaService {

	public void registrar(CitaMedica cm, String areaEspecialidad);

	public CitaMedica consultar(LocalDateTime fechaAgenda);

	public void actualizar(CitaMedica cm);

	public void eliminar(LocalDateTime fechaAgenda);
}
