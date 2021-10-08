package com.investigacion.spring.mongo.api.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.investigacion.spring.mongo.api.model.Proyectos;

@Repository
public interface RepositorioProyecto extends MongoRepository<Proyectos, String> {
    
	List<Proyectos> findByNombreContainingIgnoreCase(String nombre);

	Proyectos findByUserId(int[] userId);
}