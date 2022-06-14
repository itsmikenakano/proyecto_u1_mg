package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
@Service
@Qualifier("ahorrofuturo")
public class CuentaAhorroFuturoServiceImpl implements ICuentaBancariaService{

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarCuenta(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarCuenta(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		BigDecimal interes = saldo.multiply(new BigDecimal(8)).divide(new BigDecimal(100));
		interes = interes.add(new BigDecimal(12));
		return interes;
	}
	
}
