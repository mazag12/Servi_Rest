package org.cibertec.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Ventas")
public class Ventas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "venta_id")
	int id;
	
	@ManyToOne
	@JoinColumn(name = "producto_id", insertable = false, updatable = false)
	private Producto producto;
	
	int producto_id;
	
	@ManyToOne
	@JoinColumn(name = "Usuario_id", insertable = false, updatable = false)
	private Usuario usuario;
	
	int Usuario_id;
	
	@Column(name = "venta_cantidad")	
	int cantidad;
	
	@Column(name = "venta_total")
	Double total;
		
}
