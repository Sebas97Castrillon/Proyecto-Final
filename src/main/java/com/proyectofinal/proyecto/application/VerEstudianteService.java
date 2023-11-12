package com.proyectofinal.proyecto.application;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.proyectofinal.proyecto.domain.Estudiante;
import com.proyectofinal.proyecto.infrastructure.repository.EstudianteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VerEstudianteService {

    private final EstudianteRepository estudianteRepository;

    public List<Estudiante> obtenerEstudiantes() {
        return estudianteRepository.findAll().stream()
                .map(estudianteEntity -> Estudiante.builder()
                        .id(estudianteEntity.getId())
                        .edad(estudianteEntity.getEdad())
                        .nombre(estudianteEntity.getNombre())
                        .apellido(estudianteEntity.getApellido())
                        .build())
                .collect(Collectors.toList());
    }

    public Estudiante obtenerEstudiante(Long estudianteId) {
        return estudianteRepository.findById(estudianteId)
                .map(estudianteEntity -> Estudiante.builder()
                        .id(estudianteEntity.getId())
                        .edad(estudianteEntity.getEdad())
                        .nombre(estudianteEntity.getNombre())
                        .apellido(estudianteEntity.getApellido())
                        .build())
                .orElseThrow(() -> new RuntimeException("Usuario no existe"));
    }

}
