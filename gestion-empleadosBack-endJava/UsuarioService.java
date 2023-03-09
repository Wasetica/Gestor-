package com.gestion.empleados.repositorio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.empleados.entity.Usuario;
import com.gestion.empleados.modelo.Login;
import com.gestion.empleados.modelo.UsuarioModel;
import com.gestion.empleados.repositorio.UsuarioRepositorio;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepositorio user_repository;
	
	
	public String createUser(UsuarioModel user)
	{
		
		try {
			Usuario addUser= new Usuario();
			addUser.setApellido(user.getApellido());
			addUser.setCorreo(user.getCorreo());
			addUser.setEstado(1);
			addUser.setNombre(user.getNombre());
			addUser.setPassword(user.getPassword());
			addUser.setRolUsuario(user.getRol_usuario());
			addUser.setTelefono(user.getTelefono());
			user_repository.save(addUser);
			return "Creación de usuario exitoso";
			
		} catch (Exception e) {
		return e.toString();
		}
	}
	
	public String logg(Login p) {
		String response="";
		Usuario user=user_repository.findByCorreoAndPassword(p.getEmail(), p.getPassword());
		if(user!=null) {
			return "User exists";
		}
		else {
			return "don't exist";
		}
		
		
	}
	
	

}
