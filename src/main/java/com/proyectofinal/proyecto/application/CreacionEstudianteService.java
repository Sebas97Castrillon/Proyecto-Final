package com.proyectofinal.proyecto.application;

import org.springframework.stereotype.Service;

import com.proyectofinal.proyecto.application.mapper.EstudianteMapper;
import com.proyectofinal.proyecto.domain.Estudiante;
import com.proyectofinal.proyecto.infrastructure.repository.EstudianteRepository;
import com.proyectofinal.proyecto.infrastructure.repository.model.EstudianteEntity;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CreacionEstudianteService {

    private final EstudianteRepository estudianteRepository;

    public Estudiante crearEstudiante(Estudiante estudiante){
        EstudianteEntity entity = EstudianteMapper.INSTANCE.mapToEntity(estudiante);
        EstudianteEntity estudianteResultante = estudianteRepository.save(entity);
        return EstudianteMapper.INSTANCE.mapToDomain(estudianteResultante);
        
    }
    
}
