package com.gestion.empleados.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.gestion.empleados.entity.Producto;


public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{

	/*List<Producto> findAll();
	Producto findOne(int id);
	Producto save(Producto p);
	void delete(Producto p);
	*/
}
