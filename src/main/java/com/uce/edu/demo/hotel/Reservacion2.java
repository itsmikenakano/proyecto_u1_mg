package com.uce.edu.demo.hotel;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class Reservacion2 {
	
	private Hotel hotel;
	private Cliente cliente;
	private LocalDateTime fechaReservacion;
	
	public Reservacion2(Hotel hotel, Cliente cliente) {
		this.cliente = cliente;
		this.hotel = hotel;
	}

	public void reservar(LocalDateTime fechaReservacion, String nombreHotel, Integer numeroHabitacion, String ciudad,
			String nombreCliente, String ApellidoCliente, String cedula) {

		this.hotel.setNombre(nombreHotel);
		this.hotel.setNumeroHabitacion(numeroHabitacion);
		this.hotel.setCiudad(ciudad);

		this.cliente.setNombre(nombreCliente);
		this.cliente.setApellido(ApellidoCliente);
		this.cliente.setCedula(cedula);

		this.fechaReservacion = fechaReservacion;

		System.out.println("Reservacion realizada --> DI por constructor");
	}

	// SET Y GET
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getFechaReservacion() {
		return fechaReservacion;
	}

	public void setFechaReservacion(LocalDateTime fechaReservacion) {
		this.fechaReservacion = fechaReservacion;
	}

}
