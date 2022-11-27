package org.cibertec.service;

import java.util.List;

import org.cibertec.entity.Ventas;
import org.cibertec.repository.IVentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VentasServiceImpl implements VentasService{

	@Autowired
	private IVentasRepository VentasRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Ventas> ListarVenta() {
		return (List<Ventas>) VentasRepository.findAll();
	}

	@Override
	@Transactional
	public void guardar(Ventas venta) {
		VentasRepository.save(venta);
		
	}

	@Override
	@Transactional
	public void actualizar(Ventas venta) {
		VentasRepository.save(venta);
		
	}

	@Override
	@Transactional
	public void eliminar(Integer cod) {
		VentasRepository.deleteById(cod);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Ventas encontrarVenta(Integer cod) {
		return VentasRepository.findById(cod).orElse(null);
	}

}
