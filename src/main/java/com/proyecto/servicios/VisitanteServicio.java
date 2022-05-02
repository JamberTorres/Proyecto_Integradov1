package com.proyecto.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.proyecto.interfaces.IVisitante;
import com.proyecto.modelo.Visitante;

@Service
@Transactional
public class VisitanteServicio {

	@Autowired
	private IVisitante ivisitante;
	
	public String RegistrarVisitante(Visitante visitante) {
		ivisitante.save(visitante);
		return "visitante registrado en la bd";
	}
	
	public List<Visitante> listadoVisitante(){
		//declaramos una variable de tipo list
		List<Visitante> listar=ivisitante.findAll();
		return listar;	
	   }

	public Visitante EditarVisitante(int cod) {
	return 	ivisitante.findById(cod).get();
	   }

	public String EliminarVisitante(int cod) {
		ivisitante.deleteById(cod);
	return "visitante eliminado";
	}
	
	  }//fin de la clase empleado servicio
	
	

