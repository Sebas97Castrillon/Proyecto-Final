package com.proyectofinal.proyecto.application;

import org.springframework.stereotype.Service;

import com.proyectofinal.proyecto.infrastructure.repository.EstudianteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EliminacionEstudianteService {

    private final EstudianteRepository estudianteRepository;

    public void eliminarEstudiante(Long estudianteId) {
        estudianteRepository.deleteById(estudianteId);
    }
    
}
