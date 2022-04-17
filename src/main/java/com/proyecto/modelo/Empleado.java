package com.proyecto.modelo;
import javax.persistence.*;

@Entity
@Table(name="empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
private int id;
	@Column(name="Nom")
private String Nom;
	@Column(name="Apell")
private String Apell;
	@Column(name="Cell")
private String Cell;
	@Column(name="Dni")
private String Dni;
	@Column(name="SEX")
private String SEX;
	@ManyToOne
	@JoinColumn(name="IDdepart")
	private Departamento departamento;
	
	public Empleado(int id, String nom, String apell, String cell, String dni, String sEX, Departamento departamento) {
		//super();
		this.id = id;
		this.Nom = nom;
		this.Apell = apell;
		this.Cell = cell;
		this.Dni = dni;
		this.SEX = sEX;
		this.departamento = departamento;
	}
	public Empleado() {
		//super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getApell() {
		return Apell;
	}
	public void setApell(String apell) {
		Apell = apell;
	}
	public String getCell() {
		return Cell;
	}
	public void setCell(String cell) {
		Cell = cell;
	}
	
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	
	public String getSEX() {
		return SEX;
	}
	public void setSEX(String sEX) {
		SEX = sEX;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}	
	
	
	
	
}