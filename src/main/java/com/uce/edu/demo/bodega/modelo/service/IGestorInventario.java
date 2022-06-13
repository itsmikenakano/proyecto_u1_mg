package com.uce.edu.demo.bodega.modelo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IGestorInventario {
	public void ingresarProductos(List<Producto> listaproductos);

	public Inventario consultarInventario(LocalDateTime fechaIngreso);
}
