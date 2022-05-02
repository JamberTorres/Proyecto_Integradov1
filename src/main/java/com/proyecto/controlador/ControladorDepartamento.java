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
import com.proyecto.servicios.DepartamentoServicio;

@Controller
@RequestMapping("conttdepartamento")

public class ControladorDepartamento {
	@Autowired
	private DepartamentoServicio departamentoservicio;
	
	@RequestMapping("/registrarDepartamento")
	public String MostrarFormularioDepartamento(@ModelAttribute("tpdepartamento") Departamento tipodepartamento,
			Model modelo){
		String mensaje="";
		if(tipodepartamento.getDescripcion()!=null){

			mensaje=departamentoservicio.RegistrarDepartamento(tipodepartamento);

			modelo.addAttribute("mensaje",mensaje);
			tipodepartamento.setDescripcion("");
			tipodepartamento.setPiso("");
			tipodepartamento.setMetroCuadrados("");
			tipodepartamento.setDomitorios("");
			tipodepartamento.setBaños("");
			tipodepartamento.setAños("");
			}
		//realizamos el listado de departamento....
		List<Departamento> listado=new ArrayList<Departamento>();
		listado=departamentoservicio.listadoDepartamentos();
		//enviamos el listado a la vista con el objeto modelo
		//modelo.addAttribute("listadodepartamento",listado);
		modelo.addAttribute("listadodepartamento", listado);
		return "FormTipoDepartamento";
	}  	
	
	
	@RequestMapping("/EliminarDepartamento")
	public String EliminarDepartamento(@ModelAttribute("departamento")
	Departamento departamento,@RequestParam("cod") int cod,Model modelo) {
		departamentoservicio.EliminarDepartamento(cod);
		List<Departamento> listardepartamento=new ArrayList<Departamento>();
		listardepartamento=departamentoservicio.listadoDepartamentos();
		modelo.addAttribute("listadevisitante", listardepartamento);
		return "FormTipoDepartamento";
	}//fin del metodo eliminar empleado 

	//metodo actualizarcliente
	@RequestMapping("/EditarDepartamento")
	public String EditarDepartamento(@ModelAttribute("departamento") Departamento departamento,
			@RequestParam("cod") int cod,Model modelo) {
		//aplicamos el objeto empleadoserviicio
		//instanciamos la clase
		Departamento depa=new  Departamento();
		depa=departamentoservicio.EditarDepartamento(cod);
		modelo.addAttribute("departamento", depa);
		//retomamos  a la vista 
		return("FormEditarDepartamento");
		}
	
}

