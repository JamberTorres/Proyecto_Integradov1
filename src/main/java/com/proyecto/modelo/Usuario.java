package com.proyecto.modelo;
import javax.persistence.*;
@Entity
@Table(name="usuario")
public class Usuario {
@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idusuario")
private int idusuario;
	@Column(name="nombre")
private String nombre;
	@Column(name="descripcion")
private String descripcion;
	
	public Usuario() {
		//super();
	}

	public Usuario(int idusuario, String nombre, String descripcion) {
		//super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
