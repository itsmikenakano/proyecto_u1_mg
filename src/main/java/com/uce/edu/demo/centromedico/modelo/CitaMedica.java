package com.uce.edu.demo.centromedico.modelo;

import java.time.LocalDateTime;

public class CitaMedica {
	private LocalDateTime fechaAgenda;
	private LocalDateTime fechaAtencion;
	private Especialidad especialidad;
	private Paciente paciente;

	@Override
	public String toString() {
		return "CitaMedica [fechaAgenda=" + fechaAgenda + ", fechaAtencion=" + fechaAtencion + ", especialidad="
				+ especialidad + ", paciente=" + paciente + "]";
	}

	// SET Y GET
	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}

	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}

	public LocalDateTime getFechaAtencion() {
		return fechaAtencion;
	}

	public void setFechaAtencion(LocalDateTime fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
