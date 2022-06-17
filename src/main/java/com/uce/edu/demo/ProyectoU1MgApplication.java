package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.centromedico.modelo.CitaMedica;
import com.uce.edu.demo.centromedico.modelo.MedicoEspecialista;
import com.uce.edu.demo.centromedico.modelo.MedicoGeneral;
import com.uce.edu.demo.centromedico.service.ICitaMedicaService;

@SpringBootApplication
public class ProyectoU1MgApplication implements CommandLineRunner {

	@Autowired
	private MedicoGeneral medicoGeneral;
	
	@Autowired
	private MedicoEspecialista medicoE;

	@Autowired
	private ICitaMedicaService iCitaMedicaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1MgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SINGLETON en el main:");
		this.medicoGeneral.setNombre("Michael");
		this.medicoGeneral.setApellido("Garcia");
		System.out.println(this.medicoGeneral);
		
		System.out.println("PROTOTYPE en el main:");
		System.out.println(this.medicoE);
		
		System.out.println();

		CitaMedica cita = new CitaMedica();

		this.iCitaMedicaService.registrar(cita, "Odontologia");
		
		this.iCitaMedicaService.registrar(cita, "Pediatria");
		
		this.iCitaMedicaService.registrar(cita, "General");
		
		System.out.println();
		
		System.out.println("SINGLETON de nuevo en el main:");
		System.out.println(this.medicoGeneral);
		
		System.out.println("PROTOTYPE de nuevo en el main:");
		System.out.println(this.medicoE);

	}

}
