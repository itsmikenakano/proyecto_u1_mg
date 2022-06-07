package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {
	public void insertarMatricula(Matricula m);

	public Matricula buscarMatricula(String numero);

	public void actualizarMatricula(Matricula m);

	public void eliminarMatricula(String numero);
}
