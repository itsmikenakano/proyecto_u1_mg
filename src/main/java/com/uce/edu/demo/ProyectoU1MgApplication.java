package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.hotel.Reservacion;
import com.uce.edu.demo.hotel.Reservacion2;
import com.uce.edu.demo.hotel.Reservacion3;

@SpringBootApplication
public class ProyectoU1MgApplication implements CommandLineRunner {

	// 1) DI por atributo
	//@Autowired
	//private CitaMedica cita;
	
	@Autowired
	private Reservacion reservacion;
	
	@Autowired
	private Reservacion2 reservacion2;
	
	@Autowired
	private Reservacion3 reservacion3;
	
	@Autowired
	private CitaMedica2 cita;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1MgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto con Spring Framework");

		String respuesta = cita.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
		System.out.println(respuesta);
		
		//******************************************
		
		reservacion.reservar(LocalDateTime.now(), "Hotel Dann Carlton", 35,"Quito", "Michael", "Garcia", "2300290992");
		
		reservacion2.reservar(LocalDateTime.now(), "Hotel Dann Carlton", 35,"Quito", "Will", "Solorzano", "1714274825");
		
		reservacion3.reservar(LocalDateTime.now(), "Hotel Dann Carlton", 35,"Quito", "Will", "Solorzano", "1714274825");
		
		
	}

}
