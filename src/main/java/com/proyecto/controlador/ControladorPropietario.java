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

import com.proyecto.modelo.Departamento;
import com.proyecto.modelo.Propietario;
import com.proyecto.servicios.DepartamentoServicio;
import com.proyecto.servicios.PropietarioServicio;

@Controller
//conRegistrarPropietario
@RequestMapping("conRegistrarPropietario")
public class ControladorPropietario {
	String mensaje="";
	@Autowired
	private PropietarioServicio propietarioServicio;
	@Autowired
	private DepartamentoServicio departamentoServicio;
	
	@RequestMapping("/RegistrarPropiertario")
	public String mostraFormPropietario (@ModelAttribute("propietario")Propietario propietario,Model modelo) {
	
		if (propietario.getNombre()!=null) {
			//obtenr el codigo  de la clase tipo dep
		int codpropie=Integer.parseInt(propietario.getDepartamento().getDescripcion());
		Departamento dep=new Departamento();
		dep.setIDdepart(codpropie);
		propietario.setDepartamento(dep);
		mensaje=propietarioServicio.RegistrarPropiertario(propietario);
		 modelo.addAttribute("mensaje",mensaje);
		 propietario.setNombre("");
		 propietario.setPrimerApellido("");
		 propietario.setSegundoApellido("");
		 propietario.setTipoDocumento("");
		 propietario.setNroDocumento("");
		 propietario.setNacionalidad("");
		 propietario.setEstado("");
		 propietario.setDepartamento(null) ;    }//fin de la condicion
		//hacemos listado de los empleados en la db
		List<Propietario> listarpropietario=new ArrayList<Propietario>();
		listarpropietario=propietarioServicio.listadoPropietario();
		modelo.addAttribute("listadepropietario",listarpropietario);
		return "FormRegPropietario";
		   }
		
		@ModelAttribute("departamento")
		public List<Departamento> tpDepartamento(Model modelo){
			//almacenamos los datos  tipo cliente en la respectiva variable
			List<Departamento> listadepartamento=departamentoServicio.listadoDepartamentos();
			//aplicamos interfaz model
			modelo.addAttribute("departamento",listadepartamento);
			//retomamos  el listado de empleado...
			return  listadepartamento;
		}
		
		@RequestMapping("/EliminarPropietario")
		public String EliminarPropietario(@ModelAttribute("propietario")
		Propietario propietario,@RequestParam("cod") int cod,Model modelo) {
			propietarioServicio.EliminarPropietario(cod);
			List<Propietario> listarpropietario=new ArrayList<Propietario>();
			listarpropietario=propietarioServicio.listadoPropietario();
			modelo.addAttribute("listadepropietario", listarpropietario);
			return "FormRegPropietario";
		}//fin del metodo eliminar empleado 

		//metodo actualizarcliente
		@RequestMapping("/EditarPropietario")
		public String EditarPropietario(@ModelAttribute("propietario") Propietario propietario,
				@RequestParam("cod") int cod,Model modelo) {
			//aplicamos el objeto empleadoserviicio
			//instanciamos la clase
			Propietario pro=new  Propietario();
			pro=propietarioServicio.EditarPropietario(cod);
			modelo.addAttribute("propietario", pro);
			//retomamos  a la vista 
			return("FormEditarPropietario");
			}
	}
