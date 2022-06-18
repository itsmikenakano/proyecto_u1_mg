package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriculaRepository;

	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
//		System.out.println("777777777777");
		return null;
	}
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
//		ProfesorMateria profeM = new ProfesorMateria();
//		profeM.setApellido("Tapia");
//		profeM.setNombre("Jose");
//		System.out.println("rrrrrrrrrrrrrrr");
		return null;
	}

	@Override
	public void insertarMatricula(Matricula m) {
//		ProfesorMateria profe = new ProfesorMateria();
//		ProfesorMateria profe = this.obtenerProfesorM();
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON " + this.profesorGeneral);
		System.out.println("DI desde Service PROTOTYPE " + this.profesorMateria);
		
		System.out.println("DI desde un metodo General: " + this.obtenerProfesorG());
		System.out.println("DI desde un metodo Materia: " + this.obtenerProfesorM());
		this.matriculaRepository.insertar(m);
	}

	@Override
	public Matricula buscarMatricula(String numero) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(m);
	}

	@Override
	public void eliminarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(numero);
	}

}
