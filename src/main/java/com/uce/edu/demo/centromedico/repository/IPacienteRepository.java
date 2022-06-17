package com.uce.edu.demo.centromedico.repository;

import com.uce.edu.demo.centromedico.modelo.Paciente;

public interface IPacienteRepository {

	public void insertar(Paciente p);

	public Paciente buscar(String nombre);

	public void actualizar(Paciente p);

	public void eliminar(String nombre);
}
