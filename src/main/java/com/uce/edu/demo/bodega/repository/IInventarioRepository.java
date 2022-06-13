package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Inventario;

public interface IInventarioRepository {
	public void insertar(Inventario i);

	public Inventario buscar(LocalDateTime fechaIngreso);

	public void actualizar(Inventario i);

	public void eliminar(Inventario i);
}
