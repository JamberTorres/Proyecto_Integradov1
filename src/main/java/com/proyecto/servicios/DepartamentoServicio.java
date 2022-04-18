package com.proyecto.servicios;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.interfaces.IDepartamento;
import com.proyecto.modelo.Departamento;

@Service
@Transactional
public class DepartamentoServicio {
	//aplicamos la inyeccion de dependencia....
	@Autowired
	private IDepartamento idepartamento;
	//creamos un metodo registrar tipocliente..
	public String RegistrarDepartamento(Departamento tipodepartamento){
		//aplicamos la variable de nombre itipocliente de tipo ItipoCliente
		idepartamento.save(tipodepartamento);
		//retornamos un mensaje...
		return "departamento registrado";
	} 
	public List<Departamento> listadoDepartamentos(){
		//declaramos una variable de tipo list
		List<Departamento> listar=idepartamento.findAll();
		return listar;	
	}   //fin del metodo
}
