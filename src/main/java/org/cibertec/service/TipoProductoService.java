package org.cibertec.service;

import java.util.List;

import org.cibertec.entity.Tipo_Producto;

public interface TipoProductoService {

	public List<Tipo_Producto> ListarTipo_Producto();
	
	public void guardar (Tipo_Producto tipoproducto);
	
	public void eliminar (Integer cod);
	
	public Tipo_Producto encontrarTipo_Producto(Integer cod);
}
