package org.cibertec.controller;

import java.util.List;

import org.cibertec.entity.Usuario;
import org.cibertec.service.UsuarioServicie;
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
@RequestMapping("/Usuario")
public class UsuarioController {

	@Autowired
	private UsuarioServicie usuarioservicio;
	
	@GetMapping("/lista")
	public List<Usuario> lista() {
		return usuarioservicio.ListarUsuario();
	}	
	
	@GetMapping("/lista/{codigo}")
	public  Usuario List(@PathVariable("codigo") Integer cod) {
		return usuarioservicio.encontrarUsuario(cod);
	}
	
	@PostMapping("/registar")
	public void registrar(@RequestBody Usuario usuario) {
		usuarioservicio.guardar(usuario);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Usuario usuario) {
		usuarioservicio.guardar(usuario);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		usuarioservicio.eliminar(cod);
	}
	
	@GetMapping("/buscar/{nombre}")
	public Usuario buscar(@PathVariable("nombre") String nombre) {
		return usuarioservicio.buscarNombre(nombre);
	}
	
	
}
