package com.gestion.empleados.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.empleados.entity.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
	

	Usuario findByCorreoAndPassword(String correo, String password);
}
