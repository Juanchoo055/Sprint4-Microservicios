package com.proyecto.spring.mongo.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.proyecto.spring.mongo.model.Proyectos;

@Repository
public interface RepositorioProyecto extends MongoRepository<Proyectos, String> {
    
	List<Proyectos> findByNombreContainingIgnoreCase(String nombre);


	@Query(value="{'_id':?0}", fields="{'participantes' : 1, '_id' : 1, 'nombre':1}")
	Optional<Proyectos> participantesId(String id);



}