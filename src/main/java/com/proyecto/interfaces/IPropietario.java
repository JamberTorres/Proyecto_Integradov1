package com.proyecto.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.modelo.Propietario;

public interface IPropietario extends JpaRepository<Propietario, Integer> {

}
