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
		@Column(name="Baños")
		private String Baños;
		@Column(name="Años")
		private String Años;
	
	

public Departamento() {
//	super();
}

public Departamento(int iDdepart, String descripcion, String piso, String metroCuadrados, String domitorios,
		String baños, String años) {
	super();
	this.IDdepart = iDdepart;
	this.Descripcion = descripcion;
	this.Piso = piso;
	this.MetroCuadrados = metroCuadrados;
	this.Domitorios = domitorios;
	this.Baños = baños;
	this.Años = años;
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
public String getBaños() {
	return Baños;
}
public void setBaños(String baños) {
	Baños = baños;
}
public String getAños() {
	return Años;
}
public void setAños(String años) {
	Años = años;
}

///add 
public  Departamento(String descripcion) {
	Descripcion=descripcion; }

}