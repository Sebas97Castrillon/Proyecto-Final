package com.proyectofinal.proyecto.infrastructure.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectofinal.proyecto.application.CreacionEstudianteService;
import com.proyectofinal.proyecto.domain.Estudiante;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class CreacionEstudianteController {

    private final CreacionEstudianteService creacionEstudianteService;

    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante){
        log.info("Se va a crear un estudiante");
        return creacionEstudianteService.crearEstudiante(estudiante);
    }


    
    
}
