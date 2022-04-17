package com.proyecto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorLogueo {
//creamos un metodo que nos retorne al logueo.
	@RequestMapping
	public String Logueo(){
		//nos retorna a la vista logueo.....
		return "logueo";
		
	} //fin del metodo logueo....
	
	//creamos un metodo que valide el usuario...
	//con una estructura condicional doble
	@RequestMapping("/validar")
	public String validar(@RequestParam("usuario") String usuario,
			@RequestParam("password") String password,Model modelo){
		//declaramos una variable de tipo cadena...
		String archivojsp="";
		//validamos usuario y password
		if(usuario.equals("admin") && password.equals("admin")){
			//declaramo una variable de tipo cadena...
			String mens="Bienvenido sr. usuario con perfil de administrador "+usuario;
			modelo.addAttribute("mensaje",mens);
			archivojsp="menu";
		}else{
			modelo.addAttribute("error","usuario incorrecto");
			archivojsp="logueo";
		}  //fin del else......
		return archivojsp;
		
	}  //fin del metodo validar.....
	
}   //fin de la clase constrolador logueo.....
