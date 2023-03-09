package com.gestion.empleados.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "producto")
@Getter
@Setter
@Data
public class Producto {

	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_producto", nullable = false)
private int id_producto;

@Basic(optional = false)
@Column(name = "nombre", nullable = false)
private String nombre;


@Basic(optional = false)
@Column(name = "cantidad", nullable = false)
private int cantidad;


@Basic(optional = false)
@Column(name = "descripcion", nullable = false)
private String descripcion;


@Basic(optional = false)
@Column(name = "tipo", nullable = false)
private int tipo;

@Basic(optional = false)
@Column(name = "estado", nullable = false)
private String estado;

}
