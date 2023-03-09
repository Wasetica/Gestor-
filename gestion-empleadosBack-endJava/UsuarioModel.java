package com.gestion.empleados.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {
	
	
	
	    private String nombre;
	    private String apellido;
	    private String correo;
	    private int telefono;
	    private String rol_usuario;
	    private String password;
	   
	    
	

}
