package com.maven.jpa;

import java.util.List;

import javax.persistence.*;

public class Jpa_Maven_Test {
//declaramos una  variable de tipo entity manager...
	private EntityManager manager;
	
	public Jpa_Maven_Test(EntityManager manager) {
	//super();
	this.manager = manager;
}   //fin del constructor....

	public static void main(String[] args){
		//aplicamos una variable de tipo entitymanagerfactory
EntityManagerFactory factory=Persistence.createEntityManagerFactory("Proyecto-Maven-Cibertec-lM	");
       //aplicamos una variable de tipo entity manager...
EntityManager manager=factory.createEntityManager();
//instanciamos la  misma clase...
Jpa_Maven_Test jmaventest=new Jpa_Maven_Test(manager);
//aplicamos las transaciones....
EntityTransaction etrans=manager.getTransaction();
//iniciamos la transacion...
etrans.begin();
//llamamos al metodo crear alumno...
jmaventest.InsertarAlumno();
//llamamos al metodo listar alumno...
List<Alumno> listadoalum=jmaventest.ListarAlumno();
//imprimir por consola los respectivos campos...
System.out.println("Nombre "+" Apellido "+"  Dni  "+"  sexo "+" correo electronico ");
//aplicamos  un bucle  for
for(Alumno alum:listadoalum){
	//imprimimos por consola los valores
	System.out.println(alum.getNombre()+" "+alum.getApellido()+
			"  "+alum.getDni()+"  "+alum.getSexo()+" "+alum.getEmail());
	
}  //fin  del bucle for....

	}   //fin del metodo principal...
	
	//creamos el metodo insertar alumno
	public void  InsertarAlumno(){
		//instanciamos la clase alumno...
		Alumno alumno=new Alumno("miguel","sanchez","10352240","M","miguel@gmail.com");
	    Alumno alumno2=new Alumno("roxana","gomez","10405599","F","roxana@gmail.com");
	    Alumno alumno3=new Alumno("ruben","zapata","10443359","M","ruben@hotmail.com");   
	   //aplicamos el metodo de  persistencia...
	    manager.persist(alumno);
	    manager.persist(alumno2);
	    manager.persist(alumno3);
	    	
	}  //fin del metodo insertar alumno....
	//creamos el metodo  listar alumno
	public List<Alumno> ListarAlumno(){	
		//declaramos una variable de tipo string...
		String cons="select a  from Alumno a";
			//aplicamos la  interfaz query
		Query querycons=manager.createQuery(cons,Alumno.class);
		//almacenamos  los datos recuperados de la BD en una variable de tipo list
		List<Alumno> lisalum=querycons.getResultList();
		//retornamos los valores
		return lisalum;	
	}  //fin del  metodo  listar alumno...
}  //fin de la clase principal....
