package com.proyecto.controlador;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.modelo.Propietario;
import com.proyecto.modelo.Usuario;
import com.proyecto.servicios.UsuarioServicio;
@Controller
@RequestMapping("conttusuario")
public class ControladorUsuario {
	@Autowired
	private UsuarioServicio usuarioservicio;

	@RequestMapping("/registrarUsuario")
	public String MostrarFormUsuario(@ModelAttribute("tpusuario") Usuario usuario,
			Model modelo){
		//declaramos una variable de tipo cadena...
		String mensaje="";
		if(usuario.getNombre()!=null){
			//invocamos al metodo registrar tipo cliente.......
			mensaje=usuarioservicio.RegistrarUsuario(usuario);
			//enviamos el mensaje(identificador entre el controlador y la vista)
			modelo.addAttribute("mensaje",mensaje);
			usuario.setNombre("")	;
			usuario.setDescripcion("");
			}  //fin del if....
		//realizamos el listado de tipocliente....
		List<Usuario> listado=new ArrayList<Usuario>();
		listado=usuarioservicio.ListadoUsuario();
		//enviamos el listado a la vista con el objeto modelo
		modelo.addAttribute("listadousuario",listado);
		return "FormUsuario";
	}   //fin del metodo mostrarformulario tc.....
	
	@RequestMapping("/EliminarUsuario")
	public String EliminarUsuario(@ModelAttribute("usuario")
	Usuario usuario,@RequestParam("cod") int cod,Model modelo) {
		usuarioservicio.EliminarUsuario(cod);
		List<Usuario> listarusuario=new ArrayList<Usuario>();
		listarusuario=usuarioservicio.ListadoUsuario();
		modelo.addAttribute("listadepropietario", listarusuario);
		return "FormUsuario";
	}	
}


