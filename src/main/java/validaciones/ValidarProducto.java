package validaciones;

import org.cibertec.entity.Producto;
import org.cibertec.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidarProducto {

	@Autowired
	ProductoService productoservicio;
	
	public String Producto_Entidades(Producto producto) {
		if (producto.getDescripcion().isEmpty() && producto.getDescripcion() == ""){return "Producto no contiene Descripción";}
		else if (producto.getPrecio() == 0.0 && producto.getPrecio().equals(0.0)){return "Producto no contiene Precio";}
		else if (producto.getStock() == 0){return "Producto no contiene Stock";}
		else if (producto.getTipoProduto_id() == 0){return "Producto no puede contener cero";}
		else if (producto.getImagen().isEmpty() && producto.getImagen() == ""){return "Producto no contiene imagen";}
		else {return "OK";}
	}

}
