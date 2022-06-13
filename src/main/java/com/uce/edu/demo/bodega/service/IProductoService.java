package com.uce.edu.demo.bodega.service;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoService {
	public void ingresar(Producto p);

	public Producto consultar(String nombre);

	public void actualizar(Producto p);

	public void eliminar(String nombre);
}
