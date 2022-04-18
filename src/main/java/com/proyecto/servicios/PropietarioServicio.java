package com.proyecto.servicios;

import  java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.interfaces.IPropietario;
import com.proyecto.modelo.Propietario;



@Service
@Transactional
public class PropietarioServicio {
	@Autowired
	private IPropietario ipropietario;
	
	public String RegistrarPropiertario(Propietario propietario) {
		ipropietario.save(propietario);
		return "propietario registrado en la bd";
	}
	
	public List<Propietario> listadoPropietario(){
		//declaramos una variable de tipo list
		List<Propietario> listar=ipropietario.findAll();
		return listar;	
	   }

	public Propietario EditarPropietario(int cod) {
	return 	ipropietario.findById(cod).get();
	   }

	public String EliminarPropietario(int cod) {
		ipropietario.deleteById(cod);
	return "propietario eliminado";
	}
	
	  }//fin de la clase empleado servicio