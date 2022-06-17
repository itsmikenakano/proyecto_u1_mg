package com.uce.edu.demo.centromedico.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.centromedico.modelo.CitaMedica;
import com.uce.edu.demo.centromedico.modelo.Especialidad;
import com.uce.edu.demo.centromedico.modelo.MedicoEspecialista;
import com.uce.edu.demo.centromedico.modelo.MedicoGeneral;
import com.uce.edu.demo.centromedico.modelo.Paciente;
import com.uce.edu.demo.centromedico.repository.ICitaMedicaRepository;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{
	
	@Autowired
	private ICitaMedicaRepository iCitaMedicaRepository;
	
	@Autowired
	private IPacienteService iPacienteService;
	
	@Autowired
	private IEspecialidadService iEspecialidadService;
	
	@Autowired
	private MedicoGeneral medicoG;
	
	@Autowired
	private MedicoEspecialista medicoOdontologia;
	
	@Autowired
	private MedicoEspecialista medicoPediatria;

	@Override
	public void registrar(CitaMedica cm, String areaEspecialidad) {
		// TODO Auto-generated method stub
		Paciente p = this.iPacienteService.consultar("Michael");
		Especialidad especialidad = this.iEspecialidadService.consultar("12");
		switch (areaEspecialidad) {
		case "Odontologia":
			especialidad.setNombre("Odontologia");
			cm.setEspecialidad(especialidad);
			cm.setPaciente(p);
			cm.setFechaAgenda(LocalDateTime.now());
			cm.setFechaAtencion(LocalDateTime.of(2022, 7, 15, 10, 0));
			this.medicoOdontologia.setNombre("Ramiro");
			this.medicoOdontologia.setApellido("Jimenez");
			this.iCitaMedicaRepository.insertar(cm);
			System.out.println("PROTOTYPE desde Service: Doctor asiganado para Odontologia: " + this.medicoOdontologia);
			break;
		case "Pediatria":
			especialidad.setNombre("Pediatria");
			cm.setEspecialidad(especialidad);
			cm.setPaciente(p);
			cm.setFechaAgenda(LocalDateTime.now());
			cm.setFechaAtencion(LocalDateTime.of(2022, 7, 17, 12, 0));
			this.medicoPediatria.setNombre("Luisa");
			this.medicoPediatria.setApellido("Rosales");
			this.iCitaMedicaRepository.insertar(cm);
			System.out.println("PROTOTYPE desde Service: Doctor asiganado para Pediatria: " + this.medicoPediatria);
			break;
		default:
			especialidad.setNombre("General");
			cm.setEspecialidad(especialidad);
			cm.setPaciente(p);
			cm.setFechaAgenda(LocalDateTime.now());
			cm.setFechaAtencion(LocalDateTime.of(2022, 5, 23, 15, 0));
			this.medicoG.setNombre("Benito");
			this.iCitaMedicaRepository.insertar(cm);
			System.out.println("SINGLETON desde Service: Doctor asiganado para consultorio: " + this.medicoG);
			break;
		}
		
		
	}

	@Override
	public CitaMedica consultar(LocalDateTime fechaAgenda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(CitaMedica cm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(LocalDateTime fechaAgenda) {
		// TODO Auto-generated method stub
		
	}

}
