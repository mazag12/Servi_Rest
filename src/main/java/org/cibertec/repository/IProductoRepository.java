package org.cibertec.repository;

import org.springframework.data.repository.CrudRepository;

import org.cibertec.entity.Producto;

public interface IProductoRepository extends CrudRepository<Producto, Integer>{

}
