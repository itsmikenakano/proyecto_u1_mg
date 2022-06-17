package com.uce.edu.demo.centromedico.service;

import com.uce.edu.demo.centromedico.modelo.Especialidad;

public interface IEspecialidadService {
	
	public void agregar(Especialidad e);

	public Especialidad consultar(String codigo);

	public void actualizar(Especialidad e);

	public void eliminar(String codigo);


}
