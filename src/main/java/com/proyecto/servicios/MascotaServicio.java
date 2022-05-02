package com.proyecto.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.interfaces.IMascota;
import com.proyecto.modelo.Mascota;


@Service
@Transactional
public class MascotaServicio {
	@Autowired
	private IMascota imascota;
	
	public String RegistrarMascota(Mascota mascota) {
		imascota.save(mascota);
		return "mascota registrado en la bd";
	}
	
	public List<Mascota> listadoMascota(){
		//declaramos una variable de tipo list
		List<Mascota> listar=imascota.findAll();
		return listar;	
	   }

	public Mascota EditarMascota(int cod) {
	return 	imascota.findById(cod).get();
	   }

	public String EliminarMascota(int cod) {
		imascota.deleteById(cod);
	return "mascota eliminado";
	}
	
	  }//fin de la clase empleado servicio

