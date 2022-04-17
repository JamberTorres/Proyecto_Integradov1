package com.proyecto.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.modelo.Departamento;

public interface IDepartamento extends JpaRepository<Departamento, Integer> {

}
