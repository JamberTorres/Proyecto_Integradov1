package com.proyecto.servicios;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.modelo.Usuario;
import com.proyecto.interfaces.IUsuario;
@Service
@Transactional
public class UsuarioServicio {
	@Autowired
	private IUsuario iusuario ;

public String RegistrarUsuario(Usuario usuario) {
	iusuario.save(usuario);
	return "Usuario registrado en DB";
}
public List<Usuario> ListadoUsuario(){
	//declaramos una variable de tipo list
	List<Usuario> listar=iusuario.findAll();
	return listar;	
   }

public Usuario EditarUsuario(int cod) {
return 	iusuario.findById(cod).get();
   }

public String EliminarUsuario(int cod) {
	iusuario.deleteById(cod);
return "usuario eliminado";
}
  }//fin de la clase cliente servicio

