package org.cibertec.service;

import java.util.List;

import org.cibertec.entity.Ventas;

public interface VentasService {

public List<Ventas> ListarVenta();
	
	public void guardar (Ventas venta);
	
	public void actualizar (Ventas venta);
	
	public void eliminar (Integer cod);
	
	public Ventas encontrarVenta(Integer cod);
	
}
