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
		//declaramos una variable de tipo cadena...
		String mensaje="";
		if(tipodepartamento.getDescripcion()!=null){
			//invocamos al metodo registrar tipo empleado.......
			mensaje=departamentoservicio.RegistrarDepartamento(tipodepartamento);
			//enviamos el mensaje(identificador entre el controlador y la vista)
			modelo.addAttribute("mensaje",mensaje);
			tipodepartamento.setDescripcion("");
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

