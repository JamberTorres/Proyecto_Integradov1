package com.proyecto.servicios;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.interfaces.IEmpleado;
import com.proyecto.modelo.Empleado;
@Service
@Transactional
public class EmpleadoServicio {
	@Autowired
	private IEmpleado iempleado;
	
	public String RegistrarEmpleado(Empleado empleado) {
		iempleado.save(empleado);
		return "empleado registrado en DB";
	}
	public List<Empleado> ListadoEmpleados(){
		//declaramos una variable de tipo list
		List<Empleado> listar=iempleado.findAll();
		return listar;	
	   }

	public Empleado EditarEmpleado(int cod) {
	return 	iempleado.findById(cod).get();
	   }

	public String EliminarEmpleado(int cod) {
		iempleado.deleteById(cod);
	return "empleado eliminado";
	}
	  }//fin de la clase empleado servicio



