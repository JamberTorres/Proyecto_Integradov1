package com.proyecto.modelo;
import javax.persistence.*;
@Entity
@Table(name="departamento")
public class Departamento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IDdepart")
private int IDdepart;
	
	@Column(name="Descripcion")
private String Descripcion;
	
	@Column(name="Piso")
	private String Piso;
		@Column(name="MetroCuadrados")
		private String MetroCuadrados;
		@Column(name="Domitorios")
		private String Domitorios;
		@Column(name="Ba�os")
		private String Ba�os;
		@Column(name="A�os")
		private String A�os;
	
	

public Departamento() {
//	super();
}

public Departamento(int iDdepart, String descripcion, String piso, String metroCuadrados, String domitorios,
		String ba�os, String a�os) {
	super();
	this.IDdepart = iDdepart;
	this.Descripcion = descripcion;
	this.Piso = piso;
	this.MetroCuadrados = metroCuadrados;
	this.Domitorios = domitorios;
	this.Ba�os = ba�os;
	this.A�os = a�os;
}

public int getIDdepart() {
	return IDdepart;
}
public void setIDdepart(int iDdepart) {
	IDdepart = iDdepart;
}
public String getDescripcion() {
	return Descripcion;
}
public void setDescripcion(String descripcion) {
	Descripcion = descripcion;
}
public String getPiso() {
	return Piso;
}
public void setPiso(String piso) {
	Piso = piso;
}
public String getMetroCuadrados() {
	return MetroCuadrados;
}
public void setMetroCuadrados(String metroCuadrados) {
	MetroCuadrados = metroCuadrados;
}
public String getDomitorios() {
	return Domitorios;
}
public void setDomitorios(String domitorios) {
	Domitorios = domitorios;
}
public String getBa�os() {
	return Ba�os;
}
public void setBa�os(String ba�os) {
	Ba�os = ba�os;
}
public String getA�os() {
	return A�os;
}
public void setA�os(String a�os) {
	A�os = a�os;
}

///add 
public  Departamento(String descripcion) {
	Descripcion=descripcion; }

}