package org.cibertec.validaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.cibertec.entity.Producto;
import org.junit.jupiter.api.Test;

import validaciones.ValidarProducto;

class ValidarProductoTest {

	@Test
	void Producto_Descripcion_Test() {
		
		Producto producto = new Producto();
		
		ValidarProducto validar = new ValidarProducto();
		
		producto.setDescripcion("");
		producto.setPrecio(0.0);
		producto.setStock(20);
		producto.setTipoProduto_id(1);
		producto.setImagen("no hay imagen");
			
		
		assertEquals("Producto no contiene Descripción", validar.Producto_Entidades(producto));
		
	}
	
	
	@Test
	void Producto_Precio_Test() {
		
		Producto producto = new Producto();
		
		ValidarProducto validar = new ValidarProducto();
		
		producto.setDescripcion("Micronics");
		producto.setPrecio(0.0);
		producto.setStock(20);
		producto.setTipoProduto_id(1);
		producto.setImagen("no hay imagen");
			
		
		assertEquals("Producto no contiene Precio", validar.Producto_Entidades(producto));
		
	}
	
	@Test
	void Producto_Stock_Test() {
		
		Producto producto = new Producto();
		
		ValidarProducto validar = new ValidarProducto();
		
		producto.setDescripcion("Micronics");
		producto.setPrecio(3.0);
		producto.setStock(0);
		producto.setTipoProduto_id(1);
		producto.setImagen("no hay imagen");
			
		
		assertEquals("Producto no contiene Stock", validar.Producto_Entidades(producto));
		
	}
	
	@Test
	void Producto_TipoProduccto_Test() {
		
		Producto producto = new Producto();
		
		ValidarProducto validar = new ValidarProducto();
		
		producto.setDescripcion("Micronics");
		producto.setPrecio(3.0);
		producto.setStock(20);
		producto.setTipoProduto_id(0);
		producto.setImagen("no hay imagen");
			
		
		assertEquals("Producto no puede contener cero", validar.Producto_Entidades(producto));
		
	}
	
	@Test
	void Producto_Imagen_Test() {
		
		Producto producto = new Producto();
		
		ValidarProducto validar = new ValidarProducto();
		
		producto.setDescripcion("Micronics");
		producto.setPrecio(3.0);
		producto.setStock(20);
		producto.setTipoProduto_id(1);
		producto.setImagen("");
			
		
		assertEquals("Producto no contiene imagen", validar.Producto_Entidades(producto));
		
	}

	
	@Test
	void Producto_OK_Test() {
		
		Producto producto = new Producto();
		
		ValidarProducto validar = new ValidarProducto();
		
		producto.setDescripcion("Detergente");
		producto.setPrecio(10.0);
		producto.setStock(20);
		producto.setTipoProduto_id(1);
		producto.setImagen("no hay imagen");
			
		
		assertEquals("OK", validar.Producto_Entidades(producto));
		
	}
	
	
}
