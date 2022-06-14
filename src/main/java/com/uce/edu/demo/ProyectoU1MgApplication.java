package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IFachadaCuentaBancaria;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.service.IGestorInventario;
import com.uce.edu.demo.bodega.service.IProductoService;

@SpringBootApplication
public class ProyectoU1MgApplication implements CommandLineRunner {

	@Autowired
	private IFachadaCuentaBancaria bancaria;


	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1MgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		BigDecimal interes = this.bancaria.calcularInteres("1213");
		System.out.println("Interes: " + interes);

	}

}
