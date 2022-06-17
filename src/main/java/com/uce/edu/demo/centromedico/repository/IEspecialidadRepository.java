package com.uce.edu.demo.centromedico.repository;

import com.uce.edu.demo.centromedico.modelo.Especialidad;

public interface IEspecialidadRepository {

	public void insertar(Especialidad e);

	public Especialidad buscar(String codigo);

	public void actualizar(Especialidad e);

	public void eliminar(String codigo);

}
