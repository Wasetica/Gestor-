package com.gestion.empleados.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Data
@Getter
@Setter
@AllArgsConstructor

public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_usuario",nullable=false)
	private int id;
	

	@Column(name="nombre",nullable=true)
	
	private String nombre;
	
	
	@Column(name="apellido", nullable=true)
	
	private String apellido;
	
	
	@Column(name="correo",nullable=true)
	private String correo;
	
	
	@Column(name="password",nullable=true)
	private String password;
	
	
	
	@Column(name="telefono",nullable=true)
	private int telefono;
	
	
	@Column(name="rol_usuario",nullable=true)
	private String rolUsuario;
	
	
	@Column(name="estado",nullable=true)
	private int estado;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getRolUsuario() {
		return rolUsuario;
	}


	public void setRolUsuario(String rolUsuario) {
		this.rolUsuario = rolUsuario;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


	public Usuario() {
		
	}
	
	
	
	
	
	
	
	

}
