package com.gestion.empleados.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.empleados.entity.Usuario;
import com.gestion.empleados.modelo.UsuarioModel;
import com.gestion.empleados.repositorio.UsuarioRepositorio;
import com.gestion.empleados.repositorio.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/")
public class UsuarioControlador {
	
	@Autowired
	UsuarioRepositorio userRepository;
	
	@Autowired
	UsuarioService userService;
	
	  @PostMapping("/addUser")
	  public String createUser( @RequestBody UsuarioModel user) {
		  String response= userService.createUser(user);
		  return response;
		 }
	  
	

}
