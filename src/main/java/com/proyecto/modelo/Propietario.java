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
@Table(name="propietario")
public class Propietario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
private int id;
	@Column(name="Nombre")
private String Nombre;
	@Column(name="PrimerApellido")
private String PrimerApellido;
	@Column(name="SegundoApellido")
private String SegundoApellido;
	@Column(name="TipoDocumento")
	private String TipoDocumento;
	@Column(name="nroDocumento")
	private String nroDocumento;	
	@Column(name="Nacionalidad")
	private String Nacionalidad;		
	@Column(name="Estado")
	private String Estado;	
	@ManyToOne
	@JoinColumn(name="IDdepart")
	private Departamento departamento;

	

	public Propietario(int id, String nombre, String primerApellido, String segundoApellido, String tipoDocumento,
			String nroDocumento, String nacionalidad, String estado, Departamento departamento) {
		super();
		this.id = id;
		this.Nombre = nombre;
		this.PrimerApellido = primerApellido;
		this.SegundoApellido = segundoApellido;
		this.TipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.Nacionalidad = nacionalidad;
		this.Estado = estado;
		this.departamento = departamento;
	}
	
	public Propietario() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getPrimerApellido() {
		return PrimerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		PrimerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return SegundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		SegundoApellido = segundoApellido;
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
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}	
	
	
	
}