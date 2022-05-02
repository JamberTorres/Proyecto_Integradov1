package com.proyecto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Visitante")
public class Visitante {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idVisitante")
private int idVisitante;
	@Column(name="Nombre")
private String Nombre;
	@Column(name="Apellido")
private String Apellido;
	@Column(name="SegApellido")
private String SegApellido;
	@Column(name="TipoDocumento")
	private String TipoDocumento;
	@Column(name="nroDocumento")
	private String nroDocumento;	
	@Column(name="Genero")
	private String Genero;		
	@Column(name="Estado")
	private String Estado;	
	@ManyToOne
	@JoinColumn(name="Id")
	private Propietario propietario;
	
	public Visitante(int idVisitante, String nombre, String apellido, String segApellido, String tipoDocumento,
			String nroDocumento, String genero, String estado, Propietario propietario) {
		this.idVisitante = idVisitante;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.SegApellido = segApellido;
		this.TipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.Genero = genero;
		this.Estado = estado;
		this.propietario = propietario;
	}
	public Visitante() {
		
	}
	public int getIdVisitante() {
		return idVisitante;
	}
	public void setIdVisitante(int idVisitante) {
		this.idVisitante = idVisitante;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getSegApellido() {
		return SegApellido;
	}
	public void setSegApellido(String segApellido) {
		SegApellido = segApellido;
	}
	public String getTipoDocumento() {
		return TipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}
	public String getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	
	
	
	
	
}

