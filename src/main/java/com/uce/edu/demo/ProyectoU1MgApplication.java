package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1MgApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IMateriaService materiaService;

	@Autowired
	private IMatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1MgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante e = new Estudiante();
		e.setNombre("Edison");
		e.setApellido("Cayambe");
		e.setCedula("1223344567");
		this.estudianteService.ingresarEstudiante(e);

		Estudiante e1 = new Estudiante();
		e1.setNombre("Pepito");
		e1.setApellido("Perez");
		e1.setCedula("0932838323");
		this.estudianteService.ingresarEstudiante(e1);

		// Usar los 3 metodos restantes
		e.setCedula("1732535353");
		this.estudianteService.actualizarEstudiante(e);

		this.estudianteService.buscarPorApellido("Cayambe");

		this.estudianteService.eliminarEstudiante("0932838323");

		System.out.println();

		// Materia
		Materia m = new Materia();
		m.setNombre("Base de datos I");
		m.setSemestre("5");
		this.materiaService.insertarMateria(m);

		Materia m1 = new Materia();
		m1.setNombre("Inferencia Estadistica");
		m1.setSemestre("5");
		this.materiaService.insertarMateria(m1);

		m.setNombre("Base de datos II");
		this.materiaService.actualizarMateria(m);

		this.materiaService.buscarMateria("Inferencia Estadistica");

		this.materiaService.eliminarMateria("Base de datos II");

		System.out.println();

		// Matricula
		List<Materia> listaMateria = new ArrayList<Materia>();
		listaMateria.add(m);
		listaMateria.add(m1);

		Matricula matricula = new Matricula();
		matricula.setEstudiante(e);
		matricula.setNumero("1234");
		matricula.setMateria(listaMateria);
		this.matriculaService.insertarMatricula(matricula);

		Matricula matricula1 = new Matricula();
		matricula1.setEstudiante(e);
		matricula1.setNumero("12345");
		matricula1.setMateria(listaMateria);
		this.matriculaService.insertarMatricula(matricula1);

		matricula.setNumero("123456");
		this.matriculaService.actualizarMatricula(matricula);

		this.matriculaService.buscarMatricula("123456");

		this.matriculaService.eliminarMatricula("12345");

	}

}
