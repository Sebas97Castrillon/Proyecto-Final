package com.proyectofinal.proyecto.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.proyectofinal.proyecto.domain.Estudiante;
import com.proyectofinal.proyecto.infrastructure.repository.model.EstudianteEntity;

@Mapper
public interface EstudianteMapper {

    EstudianteMapper INSTANCE = Mappers.getMapper(EstudianteMapper.class);
 
    EstudianteEntity mapToEntity(Estudiante estudiante);    

    Estudiante mapToDomain(EstudianteEntity estudianteEntity);
    
}
