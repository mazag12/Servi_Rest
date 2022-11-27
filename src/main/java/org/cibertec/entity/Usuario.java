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
@Table(name = "USUARIO")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Usuario_id")
	int id;
	
	@Column(name = "Usu_Usuario")
	String nombre;
	
	@Column(name = "Usu_Password")
	String password;
	
	@ManyToOne
	@JoinColumn(name = "Usu_TipoUsuario", insertable = false, updatable = false)
	private Tipo_Usuario tipousuario;
	
	String Usu_TipoUsuario;
		
}
