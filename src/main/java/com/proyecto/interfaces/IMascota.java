package com.proyecto.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.modelo.Mascota;

public interface IMascota extends JpaRepository<Mascota, Integer> {

}
