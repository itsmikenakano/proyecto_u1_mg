package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se genero el retiro: " + r);
	}

	@Override
	public Retiro buscar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el retiro de la cuenta: " + numeroCuenta);
		Retiro retiro = new Retiro();
		retiro.setNumeroCuenta(numeroCuenta);
		return retiro;

	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el retiro: " + r);
	}

	@Override
	public void eliminar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el retiro de la cuenta: " + numeroCuenta);
	}

}
