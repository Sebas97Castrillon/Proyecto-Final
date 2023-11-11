package com.proyectofinal.proyecto.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectofinal.proyecto.model.entity.Estudiante;

@Repository
public interface EstudianteDAO extends JpaRepository<Estudiante, Long> {
    
}
