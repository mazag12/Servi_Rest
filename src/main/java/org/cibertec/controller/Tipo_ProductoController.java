package org.cibertec.controller;

import java.util.List;

import org.cibertec.entity.Tipo_Producto;
import org.cibertec.service.TipoProductoService;
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
@RequestMapping("/tipo_producto")
public class Tipo_ProductoController {

	@Autowired
	private TipoProductoService tipoproductoservicio;
	
	@GetMapping("/lista")
	public List<Tipo_Producto> lista() {
		return tipoproductoservicio.ListarTipo_Producto();
	}
	
	@GetMapping("/lista/{codigo}")
	public  Tipo_Producto List(@PathVariable("codigo") Integer cod) {
		return tipoproductoservicio.encontrarTipo_Producto(cod);
	}
	
	@PostMapping("/registar")
	public void registrar(@RequestBody Tipo_Producto tipoproducto) {
		tipoproductoservicio.guardar(tipoproducto);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Tipo_Producto tipoproducto) {
		tipoproductoservicio.guardar(tipoproducto);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		tipoproductoservicio.eliminar(cod);
	}
	
}
