package com.uce.edu.demo.centromedico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.centromedico.modelo.Paciente;
import com.uce.edu.demo.centromedico.repository.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService {

	@Autowired
	private IPacienteRepository iPacienteRepository;

	@Override
	public void registrar(Paciente p) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.insertar(p);
	}

	@Override
	public Paciente consultar(String nombre) {
		// TODO Auto-generated method stub
		return this.iPacienteRepository.buscar(nombre);
	}

	@Override
	public void actualizar(Paciente p) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.actualizar(p);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.eliminar(nombre);
	}

}
