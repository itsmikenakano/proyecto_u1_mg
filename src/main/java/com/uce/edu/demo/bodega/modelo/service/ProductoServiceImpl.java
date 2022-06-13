package com.uce.edu.demo.bodega.modelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepository iProductoRepository;

	@Override
	public void ingresar(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.insertar(p);
	}

	@Override
	public Producto consultar(String nombre) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscar(nombre);
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.actualizar(p);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		this.iProductoRepository.eliminar(nombre);
	}

}
