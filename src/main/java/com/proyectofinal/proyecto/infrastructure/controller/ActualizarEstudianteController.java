package com.proyectofinal.proyecto.infrastructure.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectofinal.proyecto.application.ActualizarEstudianteService;
import com.proyectofinal.proyecto.domain.Estudiante;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("estudiante")
@RequiredArgsConstructor
public class ActualizarEstudianteController {

    private final ActualizarEstudianteService atualizarEstudianteService;

    @PutMapping
    public void actualizarEstudiante(@RequestBody Estudiante estudiante) {           
        atualizarEstudianteService.actualizarEstudiante(estudiante);
    }
}
