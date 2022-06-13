package com.uce.edu.demo.bodega.repository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {

	@Override
	public void insertar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el inventario en la base: " + i);
	}

	@Override
	public Inventario buscar(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		System.out.println("Se ha consultado el inventario a partir de la fecha: " + fechaIngreso);
		List<Producto> lista = new ArrayList<>();
		List<Producto> listaFinal = new ArrayList<>();
		Inventario inv = new Inventario();

		Producto p = new Producto();
		p.setNombre("Harina");
		p.setCantidad("15");
		p.setPrecioCompra(new BigDecimal(10));
		p.setFechaIngreso(LocalDateTime.of(2022, 7, 4, 9, 53, 20));

		Producto p1 = new Producto();
		p1.setNombre("Arroz");
		p1.setCantidad("22");
		p1.setPrecioCompra(new BigDecimal(5));
		p1.setFechaIngreso(LocalDateTime.of(2022, 7, 3, 5, 20, 35));

		Producto p2 = new Producto();
		p2.setNombre("Huevos");
		p2.setCantidad("40");
		p2.setPrecioCompra(new BigDecimal(7));
		p2.setFechaIngreso(LocalDateTime.of(2022, 7, 5, 9, 53, 20));

		Producto p3 = new Producto();
		p3.setNombre("Azucar");
		p3.setCantidad("35");
		p3.setPrecioCompra(new BigDecimal(10));
		p3.setFechaIngreso(LocalDateTime.of(2022, 8, 18, 7, 43, 55));

		Producto p4 = new Producto();
		p4.setNombre("Leche 1Lt");
		p4.setCantidad("55");
		p4.setPrecioCompra(new BigDecimal(6.5));
		p4.setFechaIngreso(LocalDateTime.of(2022, 7, 5, 9, 53, 20));

		lista.add(p);
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);

		for (Producto prod : lista) {
			prod.setPrecioVenta(prod.getPrecioCompra()
					.add(prod.getPrecioCompra().multiply(new BigDecimal(0.1))
							.add(prod.getPrecioCompra().multiply(new BigDecimal(0.12))))
					.setScale(2, RoundingMode.FLOOR));
			listaFinal.add(prod);
		}

		inv.setInventario(listaFinal);
		return inv;
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el inventario en la base: " + i);
	}

	@Override
	public void eliminar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el inventario de la base");
	}

}
