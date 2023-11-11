package com.proyectofinal.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectofinal.proyecto.model.dao.EstudianteDAO;
import com.proyectofinal.proyecto.model.entity.Estudiante;
import com.proyectofinal.proyecto.service.ProyectoService;

@RestController
@RequestMapping("estudiantes")
public class EstudianteController {

    @Autowired
    private ProyectoService proyectoService;
    
    @Autowired
    private EstudianteDAO estudianteDAO;

    @PostMapping("/")
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteDAO.save(estudiante);
    }

    @GetMapping("/{id}")
    public Estudiante obtenerEstudiantePorId(@PathVariable Long id) {
        return estudianteDAO.findById(id).orElse(null);
    }

    @GetMapping("/")
    public Page<Estudiante> obtenerEstudiantesPaginados(Pageable pageable) {
        return estudianteDAO.findAll(pageable);
    }

    @PutMapping("/{id}")
    public Estudiante actualizarEstudiante(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        estudiante.setIdEstudiante(id);
        return estudianteDAO.save(estudiante);
    }

    @DeleteMapping("/{id}")
    public void eliminarEstudiante(@PathVariable Long id) {
        estudianteDAO.deleteById(id);
    }

}
