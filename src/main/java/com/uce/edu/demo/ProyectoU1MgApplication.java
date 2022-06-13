package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.modelo.service.IGestorInventario;
import com.uce.edu.demo.bodega.modelo.service.IProductoService;

@SpringBootApplication
public class ProyectoU1MgApplication implements CommandLineRunner {

	@Autowired
	private IGestorInventario iGInventario;

	@Autowired
	private IProductoService iProductoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1MgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Producto p = new Producto();
		p.setNombre("Harina");
		p.setCantidad("15");
		p.setPrecioCompra(new BigDecimal(10));
		p.setFechaIngreso(LocalDateTime.of(2022, 7, 4, 9, 53, 20));
		this.iProductoService.ingresar(p);

		Producto p1 = new Producto();
		p1.setNombre("Arroz");
		p1.setCantidad("22");
		p1.setPrecioCompra(new BigDecimal(5));
		p1.setFechaIngreso(LocalDateTime.of(2022, 7, 3, 5, 20, 35));
		this.iProductoService.ingresar(p1);

		Producto p2 = new Producto();
		p2.setNombre("Huevos");
		p2.setCantidad("40");
		p2.setPrecioCompra(new BigDecimal(7));
		p2.setFechaIngreso(LocalDateTime.of(2022, 7, 5, 9, 53, 20));
		this.iProductoService.ingresar(p2);

		Producto p3 = new Producto();
		p3.setNombre("Azucar");
		p3.setCantidad("35");
		p3.setPrecioCompra(new BigDecimal(10));
		p3.setFechaIngreso(LocalDateTime.of(2022, 8, 18, 7, 43, 55));
		this.iProductoService.ingresar(p3);

		Producto p4 = new Producto();
		p4.setNombre("Leche 1Lt");
		p4.setCantidad("55");
		p4.setPrecioCompra(new BigDecimal(6.5));
		p4.setFechaIngreso(LocalDateTime.of(2022, 7, 5, 9, 53, 20));
		this.iProductoService.ingresar(p4);

		List<Producto> lista = new ArrayList<>();
		lista.add(p);
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		this.iGInventario.ingresarProductos(lista);

		System.out.println(this.iGInventario.consultarInventario(LocalDateTime.of(2022, 7, 4, 9, 53, 21)));

	}

}
