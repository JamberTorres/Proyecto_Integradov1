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
import com.proyecto.modelo.Empleado;
import com.proyecto.servicios.DepartamentoServicio;
import com.proyecto.servicios.EmpleadoServicio;
@Controller
//conRegistrarCliente
@RequestMapping("conRegistrarEmpleado")
public class ControladorEmpleado {
	String mensaje="";
	@Autowired
	private EmpleadoServicio empleadoservicio;
	@Autowired
	private DepartamentoServicio departamentoservicio;
	
	@RequestMapping("/RegistrarEmpleado")
	public String mostraFormEmpleado (@ModelAttribute("empleado")Empleado empleado,Model modelo) {
		
	if (empleado.getNom()!=null) {
		//obtenr el codigo  de la clase tipo dep
	int coddepa=Integer.parseInt(empleado.getDepartamento().getDescripcion());
	Departamento dep=new Departamento();
	dep.setIDdepart(coddepa);
	empleado.setDepartamento(dep);
	mensaje=empleadoservicio.RegistrarEmpleado(empleado);
	 modelo.addAttribute("mensaje",mensaje);
	 empleado.setNom("");
	 empleado.setApell("");
	 empleado.setCell("");
	 empleado.setDni("");
	 empleado.setSEX(""); 
	 empleado.setDepartamento(null) ;    }//fin de la condicion
	//hacemos listado de los empleados en la db
	List<Empleado> listarempleado=new ArrayList<Empleado>();
	listarempleado=empleadoservicio.ListadoEmpleados();
	modelo.addAttribute("listadeempleado",listarempleado);
	return "FormRegEmpleado";
	   }
	
	@ModelAttribute("departamento")
	public List<Departamento> tpDepartamento(Model modelo){
		//almacenamos los datos  tipo cliente en la respectiva variable
		List<Departamento> listadepartamento=departamentoservicio.listadoDepartamentos();
		//aplicamos interfaz model
		modelo.addAttribute("departamento",listadepartamento);
		//retomamos  el listado de empleado...
		return  listadepartamento;
	}
	
	@RequestMapping("/EliminarEmpleado")
	public String EliminarEmpleado(@ModelAttribute("empleado")
	Empleado empleado,@RequestParam("cod") int cod,Model modelo) {
		empleadoservicio.EliminarEmpleado(cod);
		List<Empleado> listarempleado=new ArrayList<Empleado>();
		listarempleado=empleadoservicio.ListadoEmpleados();
		modelo.addAttribute("listadeempleado", listarempleado);
		return "FormRegEmpleado";
	}//fin del metodo eliminar empleado 

	//metodo actualizarcliente
	@RequestMapping("/EditarEmpleado")
	public String EditarEmpleado(@ModelAttribute("empleado") Empleado empleado,
			@RequestParam("cod") int cod,Model modelo) {
		//aplicamos el objeto empleadoserviicio
		//instanciamos la clase
		Empleado emp=new  Empleado();
		emp=empleadoservicio.EditarEmpleado(cod);
		modelo.addAttribute("empleado", emp);
		//retomamos  a la vista 
		return("FormEditarEmpleado");
		}






}
