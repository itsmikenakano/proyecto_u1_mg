package com.uce.edu.demo.centromedico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.centromedico.modelo.Especialidad;
import com.uce.edu.demo.centromedico.repository.IEspecialidadRepository;

@Service
public class EspecialidadServiceImpl implements IEspecialidadService {

	@Autowired
	private IEspecialidadRepository iEspecialidadRepository;

	@Override
	public void agregar(Especialidad e) {
		// TODO Auto-generated method stub
		this.iEspecialidadRepository.insertar(e);
	}

	@Override
	public Especialidad consultar(String codigo) {
		// TODO Auto-generated method stub
		return this.iEspecialidadRepository.buscar(codigo);
	}

	@Override
	public void actualizar(Especialidad e) {
		// TODO Auto-generated method stub
		this.iEspecialidadRepository.actualizar(e);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		this.iEspecialidadRepository.eliminar(codigo);
	}

}
