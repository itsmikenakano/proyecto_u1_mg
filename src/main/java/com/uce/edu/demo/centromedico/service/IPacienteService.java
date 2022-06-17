package com.uce.edu.demo.centromedico.service;

import com.uce.edu.demo.centromedico.modelo.Paciente;

public interface IPacienteService {
	public void registrar(Paciente p);

	public Paciente consultar(String nombre);

	public void actualizar(Paciente p);

	public void eliminar(String nombre);
}
