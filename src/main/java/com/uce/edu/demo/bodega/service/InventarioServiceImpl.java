package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Override
	public void insertar(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.insertar(i);
	}

	@Override
	public Inventario consultar(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		return this.iInventarioRepository.buscar(fechaIngreso);
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.actualizar(i);
	}

	@Override
	public void eliminar(Inventario i) {
		// TODO Auto-generated method stub
		this.eliminar(i);
	}

}
