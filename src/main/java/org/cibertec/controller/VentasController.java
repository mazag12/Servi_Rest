package org.cibertec.controller;

import java.util.List;

import org.cibertec.entity.Ventas;
import org.cibertec.service.VentasService;
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
@RequestMapping("/Ventas")
public class VentasController {

	@Autowired
	private VentasService ventaservicio;
	
	@GetMapping("/lista")
	public List<Ventas> lista() {
		return ventaservicio.ListarVenta();
	}	
	
	@GetMapping("/lista/{codigo}")
	public  Ventas List(@PathVariable("codigo") Integer cod) {
		return ventaservicio.encontrarVenta(cod);
	}
	
	@PostMapping("/registar")
	public void registrar(@RequestBody Ventas venta) {
		ventaservicio.guardar(venta);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Ventas venta) {
		ventaservicio.guardar(venta);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		ventaservicio.eliminar(cod);
	}
	
}
