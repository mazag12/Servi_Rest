package org.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.cibertec.entity.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByNombre(String nombre);
}
