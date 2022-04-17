package com.proyecto.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.modelo.Usuario;

public interface IUsuario extends JpaRepository<Usuario,Integer> {

}
