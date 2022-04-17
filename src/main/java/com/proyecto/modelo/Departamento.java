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


public Departamento() {
//	super();
}

public Departamento(int iDdepart, String descripcion) {
	//super();
	this.IDdepart = iDdepart;
	this.Descripcion = descripcion;
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

///add
public  Departamento(String descripcion) {
	this.Descripcion=descripcion;
}

}
