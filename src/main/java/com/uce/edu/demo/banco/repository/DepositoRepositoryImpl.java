package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: " + d);
	}

	@Override
	public Deposito buscar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el deposito de la cuenta: " + numeroCuenta);
		Deposito deposito = new Deposito();
		deposito.setNumeroCuentaDestino(numeroCuenta);
		return deposito;
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el deposito: " + d);
	}

	@Override
	public void eliminar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el deposito de la cuenta: " + numeroCuenta);
	}

}
