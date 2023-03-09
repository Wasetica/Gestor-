package com.gestion.empleados.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.empleados.entity.Producto;
import com.gestion.empleados.modelo.Login;
import com.gestion.empleados.repositorio.EmpleadoRepositorio;
import com.gestion.empleados.repositorio.ProductoRepositorio;
import com.gestion.empleados.repositorio.UsuarioRepositorio;
import com.gestion.empleados.repositorio.service.ProductoService;
import com.gestion.empleados.repositorio.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoControlador {
	
	@Autowired
	ProductoService producto_service;
	
	@Autowired
	private ProductoRepositorio producto_repositorio;
	
	@Autowired
	private UsuarioService user_service;
	
	 @GetMapping("/GetProductos")
	 public List<Producto>listar() {
	 return producto_service.listar();
	 }
	 
	 @PostMapping("/addProductos")
	 public String agregar(@RequestBody Producto P) {
	 try {
		 String response=producto_service.add(P);
		 return response;
		 
		
	} catch (Exception e) {
		return e.toString();
	}
	 }
	 
	 
	  @DeleteMapping("/deleteProductos/{id}")
	  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
	    try {
	    	producto_repositorio.deleteById((int) id);
	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 
	  
	  @PostMapping("/login")
	  public String login(@RequestBody Login p) {
		  
		  String response = user_service.logg(p);
		  return response;
		
		  
	  }
	  
	  @GetMapping("getProduct/{id}")
	  public Optional<Producto> listarId(@PathVariable("id") int id) {
		  Optional<Producto> p= producto_repositorio.findById(id);
		  return p;
	  }
	 
	 
	 
	 

}
