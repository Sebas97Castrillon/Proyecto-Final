package com.proyectofinal.proyecto.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.proyectofinal.proyecto.model.entity.Estudiante;

public interface ProyectoService {

    public List<Estudiante> listarEstudiantes();

	public Page<Estudiante> listarEstudiantesPag(Pageable pageable);

	public void actualizarEstudiante(Estudiante estudiante);

	public Estudiante buscarEstudiantePorId(Long id);

	public void eliminarEstudiantePorId(Long id);

	public Long cantidaEstudiantes();
    
}
