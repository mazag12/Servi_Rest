package org.cibertec.service;

import java.util.List;

import org.cibertec.entity.Tipo_Producto;
import org.cibertec.repository.ITipo_ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TipoProductoServiceImpl implements TipoProductoService{

	@Autowired
	private ITipo_ProductoRepository Tipo_ProductoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Tipo_Producto> ListarTipo_Producto() {
		return (List<Tipo_Producto>) Tipo_ProductoRepository.findAll();
	}

	@Override
	@Transactional
	public void guardar(Tipo_Producto tipoproducto) {
		Tipo_ProductoRepository.save(tipoproducto);
	}

	@Override
	@Transactional
	public void eliminar(Integer cod) {
		Tipo_ProductoRepository.deleteById(cod);
	}

	@Override
	@Transactional(readOnly = true)
	public Tipo_Producto encontrarTipo_Producto(Integer cod) {
		return Tipo_ProductoRepository.findById(cod).orElse(null);
	}

}
