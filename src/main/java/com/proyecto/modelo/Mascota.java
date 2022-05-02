package com.proyecto.modelo;

import javax.persistence.*;

@Entity
@Table(name="mascota")
public class Mascota {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idMascota")
private int idMascota;
	@Column(name="Nombre")
private String Nombre;
	@Column(name="Mascota")
private String Mascota;
	@Column(name="Raza")
private String Raza;
	public Mascota(int idMascota, String nombre, String mascota, String raza) {
		super();
		this.idMascota = idMascota;
		Nombre = nombre;
		Mascota = mascota;
		Raza = raza;
	}
	public Mascota() {
		super();
	}
	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getMascota() {
		return Mascota;
	}
	public void setMascota(String mascota) {
		Mascota = mascota;
	}
	public String getRaza() {
		return Raza;
	}
	public void setRaza(String raza) {
		Raza = raza;
	}
	
	

	
	
	
	
}
