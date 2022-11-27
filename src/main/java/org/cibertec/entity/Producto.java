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
@Table(name = "Producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "producto_id")
	int id;
	
	@Column(name = "descrip")
	String descripcion;
	
	@Column(name = "precio")
	Double precio;
	
	@Column(name = "stockactual")
	int stock;
	
	@ManyToOne
	@JoinColumn(name = "TipoProduto_id", insertable = false, updatable = false)
	private Tipo_Producto tipoproducto;
	
	int TipoProduto_id;
		
	@Column(name = "imagen")
	String imagen;
	
}
