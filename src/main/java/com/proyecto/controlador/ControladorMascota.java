package com.proyecto.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

import com.proyecto.modelo.Mascota;
import com.proyecto.servicios.MascotaServicio;


@Controller
//conRegistrarMascota
@RequestMapping("conRegistrarMascota")
public class ControladorMascota {
	String mensaje="";
	@Autowired
	private MascotaServicio mascotaServicio;
	
	
	@RequestMapping("/RegistrarMascota")
	public String mostraFormMascota (@ModelAttribute("mascota")Mascota mascota,Model modelo) {
	
		if (mascota.getNombre()!=null) {
			//obtenr el codigo  de la clase tipo dep
		mensaje=mascotaServicio.RegistrarMascota(mascota);
		 modelo.addAttribute("mensaje",mensaje);
		 mascota.setNombre("");
		 mascota.setMascota("");
		 mascota.setRaza("");
		;
		    }//fin de la condicion
		//hacemos listado de los empleados en la db
		List<Mascota> listarmascota=new ArrayList<Mascota>();
		listarmascota=mascotaServicio.listadoMascota();
		modelo.addAttribute("listademascota",listarmascota);
		return "FormRegMascota";
		   }
		
	
		
		@RequestMapping("/EliminarMascota")
		public String EliminarMascota(@ModelAttribute("mascota")
		Mascota mascota,@RequestParam("cod") int cod,Model modelo) {
			mascotaServicio.EliminarMascota(cod);
			List<Mascota> listarmascota=new ArrayList<Mascota>();
			listarmascota=mascotaServicio.listadoMascota();
			modelo.addAttribute("listademascota", listarmascota);
			return "FormRegMascota";
		}//fin del metodo eliminar empleado 

		//metodo actualizarcliente
		@RequestMapping("/EditarMascota")
		public String EditarMascota(@ModelAttribute("mascota") Mascota mascota,
				@RequestParam("cod") int cod,Model modelo) {
			//aplicamos el objeto empleadoserviicio
			//instanciamos la clase
			Mascota mas=new  Mascota();
			mas=mascotaServicio.EditarMascota(cod);
			modelo.addAttribute("mascota", mas);
			//retomamos  a la vista 
			return("FormEditarMascota");
			}
	}


