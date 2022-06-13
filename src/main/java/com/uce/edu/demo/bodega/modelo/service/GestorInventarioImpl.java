package com.uce.edu.demo.bodega.modelo.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

@Service
public class GestorInventarioImpl implements IGestorInventario {

	@Autowired
	private IInventarioService iInventarioService;

	@Override
	public void ingresarProductos(List<Producto> listaProductos) {
		// TODO Auto-generated method stub
		List<Producto> listaFinal = new ArrayList<>();
		Inventario inv = new Inventario();
		for (Producto p : listaProductos) {
			p.setPrecioVenta(
					p.getPrecioCompra()
							.add(p.getPrecioCompra().multiply(new BigDecimal(0.1))
									.add(p.getPrecioCompra().multiply(new BigDecimal(0.12))))
							.setScale(2, RoundingMode.FLOOR));
			listaFinal.add(p);
		}
		inv.setInventario(listaFinal);
		this.iInventarioService.insertar(inv);
	}

	@Override
	public Inventario consultarInventario(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		List<Producto> listaFinal = new ArrayList<>();
		Inventario inv = this.iInventarioService.consultar(fechaIngreso);
		List<Producto> lista = inv.getInventario();

		for (Producto prod : lista) {
			if (prod.getFechaIngreso().isAfter(fechaIngreso) || prod.getFechaIngreso().isEqual(fechaIngreso)) {
				listaFinal.add(prod);
			}
		}
		inv.setInventario(listaFinal);
		return inv;
	}

}
