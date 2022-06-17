package com.uce.edu.demo.centromedico.modelo;

public class Especialidad {
	private String nombre;
	private String codigo;

	@Override
	public String toString() {
		return "Especialidad [nombre=" + nombre + ", codigo=" + codigo + "]";
	}

	// SET Y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
