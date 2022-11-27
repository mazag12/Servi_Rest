package org.cibertec.controller;

import java.util.List;

import org.cibertec.entity.Producto;
import org.cibertec.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private ProductoService productoservicio;
	
	
	@GetMapping("/lista")
	public List<Producto> lista() {
		return productoservicio.ListarProducto();
	}	
	
	@GetMapping("/lista/{codigo}")
	public  Producto List(@PathVariable("codigo") Integer cod) {
		return productoservicio.encontrarProducto(cod);
	}
	
	@PostMapping("/registar")
	public void registrar(@RequestBody Producto producto) {
		productoservicio.guardar(producto);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Producto producto) {
		productoservicio.guardar(producto);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		productoservicio.eliminar(cod);
	}
	
}
