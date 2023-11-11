package com.proyectofinal.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectofinal.proyecto.model.dao.EstudianteDAO;
import com.proyectofinal.proyecto.model.entity.Estudiante;

@Service
public class ProyectoServiceImpl implements ProyectoService{

    @Autowired
	private EstudianteDAO estudianteDAO;

	// Usuario
	@Override
	@Transactional(readOnly = true)
	public List<Estudiante> listarEstudiantes() {
		return (List<Estudiante>) estudianteDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Estudiante> listarEstudiantesPag(Pageable pageable) {
		return estudianteDAO.findAll(pageable);
	}

	@Override
	@Transactional
	public void actualizarEstudiante(Estudiante estudiante) {
		estudianteDAO.save(estudiante);
	}

	@Override
	@Transactional(readOnly = true)
	public Estudiante buscarEstudiantePorId(Long id) {
		return estudianteDAO.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void eliminarEstudiantePorId(Long id) {
		estudianteDAO.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Long cantidaEstudiantes() {
		return estudianteDAO.count();

	}
    
}
