package com.proyecto.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.modelo.Visitante;

public interface IVisitante extends JpaRepository<Visitante, Integer>{

}
