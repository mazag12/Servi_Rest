package org.cibertec.service;

import java.util.List;

import org.cibertec.entity.Usuario;

public interface UsuarioServicie {

	public List<Usuario> ListarUsuario();
	
	public void guardar (Usuario usuario);
	
	public void actualizar (Usuario usuario);
	
	public void eliminar (Integer cod);
	
	public Usuario encontrarUsuario(Integer cod);
	
	public Usuario buscarNombre(String nombre);
	
}
