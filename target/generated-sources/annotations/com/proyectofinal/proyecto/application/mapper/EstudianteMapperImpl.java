package com.proyectofinal.proyecto.application.mapper;

import com.proyectofinal.proyecto.domain.Estudiante;
import com.proyectofinal.proyecto.domain.Estudiante.EstudianteBuilder;
import com.proyectofinal.proyecto.infrastructure.repository.model.EstudianteEntity;
import com.proyectofinal.proyecto.infrastructure.repository.model.EstudianteEntity.EstudianteEntityBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T18:19:32-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
public class EstudianteMapperImpl implements EstudianteMapper {

    @Override
    public EstudianteEntity mapToEntity(Estudiante estudiante) {
        if ( estudiante == null ) {
            return null;
        }

        EstudianteEntityBuilder estudianteEntity = EstudianteEntity.builder();

        estudianteEntity.apellido( estudiante.getApellido() );
        estudianteEntity.edad( estudiante.getEdad() );
        estudianteEntity.id( estudiante.getId() );
        estudianteEntity.nombre( estudiante.getNombre() );

        return estudianteEntity.build();
    }

    @Override
    public Estudiante mapToDomain(EstudianteEntity estudianteEntity) {
        if ( estudianteEntity == null ) {
            return null;
        }

        EstudianteBuilder estudiante = Estudiante.builder();

        estudiante.apellido( estudianteEntity.getApellido() );
        estudiante.edad( estudianteEntity.getEdad() );
        estudiante.id( estudianteEntity.getId() );
        estudiante.nombre( estudianteEntity.getNombre() );

        return estudiante.build();
    }
}
