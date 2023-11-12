package com.proyectofinal.proyecto.infrastructure.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectofinal.proyecto.application.EliminacionEstudianteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor   
public class EliminacionEstudianteController {

    private final EliminacionEstudianteService eliminacionEstudianteService;

    @DeleteMapping("{id}")
    public void eliminarEstudiante(@PathVariable("id") Long estudianteId){
        eliminacionEstudianteService.eliminarEstudiante(estudianteId);
    }
    
}
