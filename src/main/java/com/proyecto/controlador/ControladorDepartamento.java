package com.proyecto.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

