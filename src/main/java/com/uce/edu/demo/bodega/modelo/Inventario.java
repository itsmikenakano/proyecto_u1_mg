package com.uce.edu.demo.bodega.modelo;

import java.util.List;

public class Inventario {

	private List<Producto> inventario;

	@Override
	public String toString() {
		return "Inventario [inventario=" + inventario + "]";
	}

	// SET Y GET
	public List<Producto> getInventario() {
		return inventario;
	}

	public void setInventario(List<Producto> inventario) {
		this.inventario = inventario;
	}

}
