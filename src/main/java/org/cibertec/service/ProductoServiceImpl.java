package org.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.cibertec.entity.Producto;
import org.cibertec.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private IProductoRepository ProductoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> ListarProducto() {
		return (List<Producto>) ProductoRepository.findAll();
	}

	@Override
	@Transactional
	public void guardar(Producto producto) {
		ProductoRepository.save(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		ProductoRepository.save(producto);
	}
	
	@Override
	@Transactional
	public void eliminar(Integer cod) {
		ProductoRepository.deleteById(cod);
	}

	@Override
	@Transactional(readOnly = true)
	public Producto encontrarProducto(Integer cod) {
		return ProductoRepository.findById(cod).orElse(null);
	}

	
}
