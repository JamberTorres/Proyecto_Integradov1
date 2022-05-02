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


import com.proyecto.modelo.Visitante;
import com.proyecto.servicios.VisitanteServicio;

@Controller
//conRegistrarVisitante
@RequestMapping("conRegistrarVisitante")
public class ControladorVisitante {
	String mensaje="";
	@Autowired
	private VisitanteServicio visitanteServicio;
	
	
	@RequestMapping("/RegistrarVisitante")
	public String mostraFormVisitante (@ModelAttribute("visitante")Visitante visitante,Model modelo) {
	
		if (visitante.getNombre()!=null) {
			//obtenr el codigo  de la clase tipo dep
		mensaje=visitanteServicio.RegistrarVisitante(visitante);
		 modelo.addAttribute("mensaje",mensaje);
		 visitante.setNombre("");
		 visitante.setApellido("");
		 visitante.setSegApellido("");
		 visitante.setTipoDocumento("");
		 visitante.setNroDocumento("");
		 visitante.setGenero("");
		 visitante.setEstado("");
		    }//fin de la condicion
		//hacemos listado de los empleados en la db
		List<Visitante> listarvisitante=new ArrayList<Visitante>();
		listarvisitante=visitanteServicio.listadoVisitante();
		modelo.addAttribute("listadevisitante",listarvisitante);
		return "FormRegVisitante";
		   }
		
	
		
		@RequestMapping("/EliminarVisitante")
		public String EliminarVisitante(@ModelAttribute("visitante")
		Visitante visitante,@RequestParam("cod") int cod,Model modelo) {
			visitanteServicio.EliminarVisitante(cod);
			List<Visitante> listarvisitante=new ArrayList<Visitante>();
			listarvisitante=visitanteServicio.listadoVisitante();
			modelo.addAttribute("listadevisitante", listarvisitante);
			return "FormRegVisitante";
		}//fin del metodo eliminar empleado 

		//metodo actualizarcliente
		@RequestMapping("/EditarVisitante")
		public String EditarVisitante(@ModelAttribute("visitante") Visitante visitante,
				@RequestParam("cod") int cod,Model modelo) {
			//aplicamos el objeto empleadoserviicio
			//instanciamos la clase
			Visitante vis=new  Visitante();
			vis=visitanteServicio.EditarVisitante(cod);
			modelo.addAttribute("visitante", vis);
			//retomamos  a la vista 
			return("FormEditarVisitante");
			}
	}


