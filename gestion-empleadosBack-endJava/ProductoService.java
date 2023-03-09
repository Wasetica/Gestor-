package com.gestion.empleados.repositorio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.empleados.entity.Producto;
import com.gestion.empleados.repositorio.ProductoRepositorio;
import java.util.List;

@Service
public class ProductoService { 
	@Autowired
	private ProductoRepositorio repositorio;
	
	
	
	public List<Producto> listar() {
		return repositorio.findAll();
	}
	
	public String add(Producto p) {
	
	repositorio.save(p);
	return "Usuario creado";
	}
	
	
	
	
	 
	

}
