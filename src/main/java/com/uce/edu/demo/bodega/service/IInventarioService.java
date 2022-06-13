package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Inventario;

public interface IInventarioService {
	public void insertar(Inventario i);

	public Inventario consultar(LocalDateTime fechaIngreso);

	public void actualizar(Inventario i);

	public void eliminar(Inventario i);
}
