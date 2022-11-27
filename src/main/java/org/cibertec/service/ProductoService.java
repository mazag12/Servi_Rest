package org.cibertec.service;

import java.util.List;

import org.cibertec.entity.Producto;

public interface ProductoService {
	
	public List<Producto> ListarProducto();
	
	public void guardar (Producto producto);
	
	public void actualizar (Producto producto);
	
	public void eliminar (Integer cod);
	
	public Producto encontrarProducto(Integer cod);
}
